import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dha")
public final class Class5_Sub3_Sub5 extends Class5_Sub3 {

	@OriginalMember(owner = "client!dha", name = "M", descriptor = "I")
	private int anInt1608 = 32768;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub5() {
		super(3, false);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1608 = arg0.method7333() << 4;
		} else if (arg1 == 1) {
			super.aBoolean769 = arg0.method7291() == 1;
		}
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(28) int[] local28 = this.method9205(arg0, 1);
			@Pc(34) int[] local34 = this.method9205(arg0, 2);
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			for (@Pc(48) int local48 = 0; local48 < Static7.anInt102; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = local34[local48] * this.anInt1608 >> 12;
				@Pc(77) int local77 = local69 * Static153.anIntArray141[local60] >> 12;
				@Pc(85) int local85 = local69 * Static536.anIntArray488[local60] >> 12;
				@Pc(94) int local94 = local48 + (local77 >> 12) & Static517.anInt8205;
				@Pc(102) int local102 = Static652.anInt10663 & (local85 >> 12) + arg0;
				@Pc(108) int[][] local108 = this.method9207(local102, 0);
				local38[local48] = local108[0][local94];
				local42[local48] = local108[1][local94];
				local46[local48] = local108[2][local94];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		Static355.method5212();
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(29) int[] local29 = this.method9205(arg0, 1);
			@Pc(35) int[] local35 = this.method9205(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static7.anInt102; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt1608 >> 12;
				@Pc(64) int local64 = local56 * Static153.anIntArray141[local47] >> 12;
				@Pc(72) int local72 = Static536.anIntArray488[local47] * local56 >> 12;
				@Pc(81) int local81 = local37 + (local64 >> 12) & Static517.anInt8205;
				@Pc(90) int local90 = arg0 + (local72 >> 12) & Static652.anInt10663;
				@Pc(96) int[] local96 = this.method9205(local90, 0);
				local11[local37] = local96[local81];
			}
		}
		return local11;
	}
}

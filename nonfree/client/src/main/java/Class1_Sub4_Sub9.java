import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class1_Sub4_Sub9 extends Class1_Sub4 {

	@OriginalMember(owner = "client!dt", name = "M", descriptor = "I")
	private int anInt1495 = 32768;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub9() {
		super(3, false);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(21) int[] local21 = this.method5695(arg0, 1);
			@Pc(27) int[] local27 = this.method5695(arg0, 2);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static395.anInt6592; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = local27[local41] * this.anInt1495 >> 12;
				@Pc(70) int local70 = Static98.anIntArray123[local53] * local62 >> 12;
				@Pc(78) int local78 = local62 * Static289.anIntArray328[local53] >> 12;
				@Pc(87) int local87 = local41 + (local70 >> 12) & Static247.anInt4469;
				@Pc(96) int local96 = Static452.anInt7487 & arg0 + (local78 >> 12);
				@Pc(102) int[][] local102 = this.method5696(local96, 0);
				local31[local41] = local102[0][local87];
				local35[local41] = local102[1][local87];
				local39[local41] = local102[2][local87];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(28) int[] local28 = this.method5695(arg0, 1);
			@Pc(34) int[] local34 = this.method5695(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static395.anInt6592; local36++) {
				@Pc(46) int local46 = local28[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = local34[local36] * this.anInt1495 >> 12;
				@Pc(63) int local63 = Static98.anIntArray123[local46] * local55 >> 12;
				@Pc(71) int local71 = Static289.anIntArray328[local46] * local55 >> 12;
				@Pc(79) int local79 = Static247.anInt4469 & local36 + (local63 >> 12);
				@Pc(88) int local88 = arg0 + (local71 >> 12) & Static452.anInt7487;
				@Pc(94) int[] local94 = this.method5695(local88, 0);
				local16[local36] = local94[local79];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1495 = arg0.method5335() << 4;
		} else if (arg1 == 1) {
			super.aBoolean796 = arg0.method5337() == 1;
		}
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		Static431.method5702();
	}
}

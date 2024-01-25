import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class4_Sub2_Sub28 extends Class4_Sub2 {

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
	private int anInt8936 = 32768;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub28() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(28) int[] local28 = this.method8208(1, arg0);
			@Pc(34) int[] local34 = this.method8208(2, arg0);
			@Pc(38) int[] local38 = local13[0];
			@Pc(42) int[] local42 = local13[1];
			@Pc(46) int[] local46 = local13[2];
			for (@Pc(48) int local48 = 0; local48 < Static417.anInt5248; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = this.anInt8936 * local34[local48] >> 12;
				@Pc(77) int local77 = local69 * Static365.anIntArray392[local60] >> 12;
				@Pc(85) int local85 = local69 * Static1.anIntArray273[local60] >> 12;
				@Pc(93) int local93 = Static359.anInt6929 & local48 + (local77 >> 12);
				@Pc(101) int local101 = (local85 >> 12) + arg0 & Static565.anInt5164;
				@Pc(109) int[][] local109 = this.method8202(local101, 0);
				local38[local48] = local109[0][local93];
				local42[local48] = local109[1][local93];
				local46[local48] = local109[2][local93];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8936 = arg0.method7054() << 4;
		} else if (arg1 == 1) {
			super.aBoolean713 = arg0.method7004() == 1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		Static374.method5814();
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(29) int[] local29 = this.method8208(1, arg0);
			@Pc(35) int[] local35 = this.method8208(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static417.anInt5248; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt8936 * local35[local37] >> 12;
				@Pc(64) int local64 = local56 * Static365.anIntArray392[local47] >> 12;
				@Pc(72) int local72 = local56 * Static1.anIntArray273[local47] >> 12;
				@Pc(80) int local80 = local37 + (local64 >> 12) & Static359.anInt6929;
				@Pc(88) int local88 = Static565.anInt5164 & arg0 + (local72 >> 12);
				@Pc(94) int[] local94 = this.method8208(0, local88);
				local19[local37] = local94[local80];
			}
		}
		return local19;
	}
}

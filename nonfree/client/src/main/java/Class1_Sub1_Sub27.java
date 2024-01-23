import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
	private int anInt4158 = 32768;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(3, false);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(28) int[] local28 = this.method4716(1, arg0);
			@Pc(34) int[] local34 = this.method4716(2, arg0);
			for (@Pc(36) int local36 = 0; local36 < Static62.anInt1350; local36++) {
				@Pc(47) int local47 = local28[local36] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt4158 * local34[local36] >> 12;
				@Pc(64) int local64 = local56 * Static170.anIntArray340[local47] >> 12;
				@Pc(72) int local72 = Static302.anInt6003 & local36 + (local64 >> 12);
				@Pc(80) int local80 = Static170.anIntArray341[local47] * local56 >> 12;
				@Pc(88) int local88 = (local80 >> 12) + arg0 & Static279.anInt5616;
				@Pc(94) int[] local94 = this.method4716(0, local88);
				local17[local36] = local94[local72];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4158 = arg0.method2244() << 4;
		} else if (arg1 == 1) {
			this.aBoolean410 = arg0.method2199() == 1;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(14) int[][] local14 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(29) int[] local29 = this.method4716(1, arg0);
			@Pc(35) int[] local35 = this.method4716(2, arg0);
			@Pc(39) int[] local39 = local14[0];
			@Pc(43) int[] local43 = local14[1];
			@Pc(47) int[] local47 = local14[2];
			for (@Pc(49) int local49 = 0; local49 < Static62.anInt1350; local49++) {
				@Pc(62) int local62 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(71) int local71 = local35[local49] * this.anInt4158 >> 12;
				@Pc(79) int local79 = Static170.anIntArray341[local62] * local71 >> 12;
				@Pc(87) int local87 = local71 * Static170.anIntArray340[local62] >> 12;
				@Pc(96) int local96 = Static279.anInt5616 & arg0 + (local79 >> 12);
				@Pc(105) int local105 = Static302.anInt6003 & local49 + (local87 >> 12);
				@Pc(111) int[][] local111 = this.method4715(local96, 0);
				local39[local49] = local111[0][local105];
				local43[local49] = local111[1][local105];
				local47[local49] = local111[2][local105];
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		Static275.method4162();
	}
}

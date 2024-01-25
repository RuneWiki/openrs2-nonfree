import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
	public static void method7463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub2_Sub4 local14 = Static602.method8315((long) arg0, 14);
		local14.method2040();
		local14.anInt2111 = arg1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZFFIF)F")
	public static float method7465(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(17) float[] local17 = Static496.aFloatArrayArray14[arg2];
		return local17[2] * arg1 + local17[0] * arg3 + local17[1] * arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)Z")
	public static boolean method7468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!qo;I)V")
	public static void method7470(@OriginalArg(0) Class60_Sub1_Sub1_Sub3 arg0) {
		@Pc(6) Class104 local6 = arg0.aClass104_8;
		if (arg0.anInt4875 == Static141.anInt8737 || !local6.method9030() || local6.method9024()) {
			@Pc(30) int local30 = arg0.anInt4875 - arg0.anInt4869;
			@Pc(36) int local36 = Static141.anInt8737 - arg0.anInt4869;
			@Pc(47) int local47 = arg0.anInt4867 * 512 + arg0.method4424((byte) -28) * 256;
			@Pc(58) int local58 = arg0.anInt4873 * 512 + arg0.method4424((byte) -28) * 256;
			@Pc(70) int local70 = arg0.anInt4871 * 512 + arg0.method4424((byte) -28) * 256;
			@Pc(82) int local82 = arg0.anInt4876 * 512 + arg0.method4424((byte) -28) * 256;
			arg0.anInt9048 = (local47 * (local30 - local36) + local70 * local36) / local30;
			arg0.anInt9057 = (local58 * (local30 - local36) + local36 * local82) / local30;
		}
		arg0.anInt4881 = 0;
		if (arg0.anInt4870 == 0) {
			arg0.method4423(false, 8192);
		}
		if (arg0.anInt4870 == 1) {
			arg0.method4423(false, 12288);
		}
		if (arg0.anInt4870 == 2) {
			arg0.method4423(false, 0);
		}
		if (arg0.anInt4870 == 3) {
			arg0.method4423(false, 4096);
		}
	}
}

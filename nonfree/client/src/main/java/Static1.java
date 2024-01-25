import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[Lclient!vr;")
	public static Class33[] aClass33Array19;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "[Lclient!oga;")
	public static final Class252[] aClass252Array5 = new Class252[4];

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_146 = new Class180(15, -1);

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
	public static final int[] anIntArray541 = new int[6];

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "[F")
	public static final float[] aFloatArray40 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!or;BLclient!ha;II)V")
	public static void method5538(@OriginalArg(0) Class260 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(20) int local20 = 63; local20 >= 0; local20--) {
			Static164.method2975(true, false);
			@Pc(42) int local42 = (local20 & 0x3F) << 10 | 0x3F | 0x380;
			@Pc(46) int local46 = Static363.anIntArray518[local42];
			Static211.method7571(true, false);
			arg1.aa(arg3, ((63 - local20) * arg0.anInt6971 >> 6) + arg2, arg0.anInt6963, (arg0.anInt6971 >> 6) + 1, local46, 0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BII)I")
	public static int method5540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static410.anIntArray581[arg1 & 0x3] : Static401.anIntArray558[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIILclient!ha;Lclient!oba;IIIIIZ)V")
	public static void method5541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class13 arg4, @OriginalArg(5) Class3_Sub11_Sub14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg6 > arg8 && arg6 < arg8 + arg0 && arg2 > arg1 - 13 && arg1 + 3 > arg2 && arg5.aBoolean478) {
			arg9 = arg7;
		}
		@Pc(40) int[] local40 = null;
		if (Static14.method197(arg5.anInt6738)) {
			local40 = Static170.aClass370_1.method8900((int) arg5.aLong211).anIntArray908;
		} else if (arg5.anInt6740 != -1) {
			local40 = Static170.aClass370_1.method8900(arg5.anInt6740).anIntArray908;
		} else if (Static494.method7103(arg5.anInt6738)) {
			@Pc(118) Class3_Sub3 local118 = (Class3_Sub3) Static522.aClass83_34.method2368((long) (int) arg5.aLong211);
			if (local118 != null) {
				@Pc(123) Class28_Sub1_Sub1_Sub1_Sub2 local123 = local118.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				@Pc(126) Class300 local126 = local123.aClass300_1;
				if (local126.anIntArray696 != null) {
					local126 = local126.method7258(Static131.aClass66_1);
				}
				if (local126 != null) {
					local40 = local126.anIntArray693;
				}
			}
		} else if (Static364.method5315(arg5.anInt6738)) {
			@Pc(87) Class277 local87;
			if (arg5.anInt6738 == 1008) {
				local87 = Static652.aClass267_4.method6682((int) arg5.aLong211);
			} else {
				local87 = Static652.aClass267_4.method6682((int) (arg5.aLong211 >>> 32 & 0x7FFFFFFFL));
			}
			if (local87.anIntArray660 != null) {
				local87 = local87.method6815(Static131.aClass66_1);
			}
			if (local87 != null) {
				local40 = local87.anIntArray658;
			}
		}
		@Pc(152) String local152 = Static532.method7683(arg5);
		if (local40 != null) {
			local152 = local152 + Static583.method8202(local40);
		}
		Static303.aClass69_6.method8859(arg9, arg1, Static502.anIntArray361, Static561.aClass33Array25, arg8 + 3, local152);
		if (arg5.aBoolean477) {
			Static627.aClass33_33.method7654(arg8 + Static59.aClass88_1.method2502(local152) + 5, arg1 + -12);
		}
	}
}

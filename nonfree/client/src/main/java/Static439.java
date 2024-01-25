import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!oa;")
	public static Class16 aClass16_4;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "Lclient!ri;")
	public static Class214 aClass214_250;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	public static int anInt7305;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_221 = new Class151("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
	public static final int anInt7306 = 1400;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Lclient!so;")
	public static final Class224 aClass224_28 = new Class224(1, 16);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method5513(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static384.anInt6381 = 7;
		Static329.anInt5395 = 0x1 << Static384.anInt6381;
		Static188.anInt3025 = Static329.anInt5395 >> 1;
		Static163.anInt2691 = (int) Math.sqrt((double) (Static188.anInt3025 * Static188.anInt3025 + Static188.anInt3025 * Static188.anInt3025));
		Static300.anInt5017 = Static329.anInt5395 >> 2;
		Static269.anInt4264 = Static329.anInt5395;
		Static362.anInt6113 = arg0;
		Static195.anInt3127 = arg1;
		Static317.anInt5269 = arg2;
		Static276.aClass82ArrayArrayArray3 = new Class82[4][Static362.anInt6113][Static195.anInt3127];
		Static240.aClass163Array3 = new Class163[4];
		if (arg3) {
			Static223.anIntArrayArray91 = new int[Static362.anInt6113][Static195.anInt3127];
			Static132.aByteArrayArray16 = new byte[Static362.anInt6113][Static195.anInt3127];
			Static106.aByteArrayArray14 = new byte[Static362.anInt6113][Static195.anInt3127];
			Static55.aClass82ArrayArrayArray1 = new Class82[1][Static362.anInt6113][Static195.anInt3127];
			Static164.aClass163Array1 = new Class163[1];
		} else {
			Static223.anIntArrayArray91 = null;
			Static132.aByteArrayArray16 = null;
			Static106.aByteArrayArray14 = null;
			Static55.aClass82ArrayArrayArray1 = null;
			Static164.aClass163Array1 = null;
		}
		if (arg4) {
			Static112.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static280.aClass71Array1 = new Class71[65535];
			Static330.aBooleanArray25 = new boolean[65535];
			Static73.anInt1403 = 0;
		} else {
			Static112.aLongArrayArrayArray1 = null;
			Static280.aClass71Array1 = null;
			Static330.aBooleanArray25 = null;
			Static73.anInt1403 = 0;
		}
		Static80.method1231(false);
		Static64.aClass147Array1 = new Class147[1000];
		Static146.anInt6161 = 0;
		Static203.aClass147Array2 = new Class147[1000];
		Static405.anInt6552 = 0;
		Static126.anIntArrayArrayArray2 = new int[4][Static362.anInt6113 + 1][Static195.anInt3127 + 1];
		Static183.aClass20_Sub3Array5 = new Class20_Sub3[5000];
		Static253.anInt4090 = 0;
		Static269.aBooleanArrayArray7 = new boolean[Static317.anInt5269 + Static317.anInt5269 + 1][Static317.anInt5269 + Static317.anInt5269 + 1];
		Static82.aBooleanArrayArray1 = new boolean[Static317.anInt5269 + Static317.anInt5269 + 2][Static317.anInt5269 + Static317.anInt5269 + 2];
		Static63.aClass2_1 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!qa;IIIIZIII)V")
	public static void method5515(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface9 local11 = (Interface9) Static336.method4293(arg5, arg3, arg4);
		@Pc(20) Class141 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (local11 != null) {
			local20 = Static259.aClass95_3.method1821(local11.method5124());
			local26 = local11.method5122() & 0x3;
			local30 = local11.method5125();
			if (local20.anInt3401 == -1) {
				local45 = arg2;
				if (local20.anInt3379 > 0) {
					local45 = arg7;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg0.method3537(4, arg6, arg1, local45);
					} else if (local26 == 1) {
						arg0.method3607(arg6, arg1, 4, local45);
					} else if (local26 == 2) {
						arg0.method3537(4, arg6, arg1 + 3, local45);
					} else if (local26 == 3) {
						arg0.method3607(arg6 + 3, arg1, 4, local45);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg0.method3580(arg6, arg1, 1, local45, 1);
					} else if (local26 == 1) {
						arg0.method3580(arg6, arg1 + 3, 1, local45, 1);
					} else if (local26 == 2) {
						arg0.method3580(arg6 + 3, arg1 + 3, 1, local45, 1);
					} else if (local26 == 3) {
						arg0.method3580(arg6 + 3, arg1, 1, local45, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg0.method3607(arg6, arg1, 4, local45);
					} else if (local26 == 1) {
						arg0.method3537(4, arg6, arg1 + 3, local45);
					} else if (local26 == 2) {
						arg0.method3607(arg6 + 3, arg1, 4, local45);
					} else if (local26 == 3) {
						arg0.method3537(4, arg6, arg1, local45);
					}
				}
			} else {
				Static204.method2782(arg1, local20, arg6, local26, arg0);
			}
		}
		local11 = (Interface9) Static422.method5254(arg5, arg3, arg4, mq.class);
		if (local11 != null) {
			local20 = Static259.aClass95_3.method1821(local11.method5124());
			local26 = local11.method5122() & 0x3;
			local30 = local11.method5125();
			if (local20.anInt3401 != -1) {
				Static204.method2782(arg1, local20, arg6, local26, arg0);
			} else if (local30 == 9) {
				local45 = -1118482;
				if (local20.anInt3379 > 0) {
					local45 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg0.method3539(arg1 + 3, arg6 + 3, arg1, arg6, local45);
				} else {
					arg0.method3539(arg1 + 3, arg6, arg1, arg6 + 3, local45);
				}
			}
		}
		local11 = (Interface9) Static261.method3366(arg5, arg3, arg4);
		if (local11 == null) {
			return;
		}
		local20 = Static259.aClass95_3.method1821(local11.method5124());
		local26 = local11.method5122() & 0x3;
		if (local20.anInt3401 != -1) {
			Static204.method2782(arg1, local20, arg6, local26, arg0);
			return;
		}
	}
}

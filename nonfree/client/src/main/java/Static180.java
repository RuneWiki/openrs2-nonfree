import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!it", name = "j", descriptor = "I")
	public static int anInt3687;

	@OriginalMember(owner = "client!it", name = "A", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray82;

	@OriginalMember(owner = "client!it", name = "q", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_119 = new Class175("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!it", name = "t", descriptor = "I")
	public static int anInt3696 = 1;

	@OriginalMember(owner = "client!it", name = "w", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_113 = new Class92(76, -1);

	@OriginalMember(owner = "client!it", name = "B", descriptor = "Z")
	public static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class125[] local12 = Static370.aClass125Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Class125 local20 = local12[local14];
			if (local20 != null && local20.anInt3865 == 2) {
				Static425.method5660(local20.anInt3871, local20.anInt3864, local20.anInt3866, arg2 >> 1, arg3 >> 1, local20.anInt3861 * 2);
				if (Static189.anIntArray294[0] > -1 && Static290.anInt5325 % 20 < 10) {
					Static106.aClass22Array7[local20.anInt3870].method6074(arg1 + Static189.anIntArray294[0] - 12, arg0 + (Static189.anIntArray294[1] - 28));
				}
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!np;ZLclient!np;)V")
	public static void method3065(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg0.aClass3_Sub3_55 != null) {
			arg0.method4647();
		}
		arg0.aClass3_Sub3_55 = arg1;
		arg0.aClass3_Sub3_56 = arg1.aClass3_Sub3_56;
		arg0.aClass3_Sub3_55.aClass3_Sub3_56 = arg0;
		arg0.aClass3_Sub3_56.aClass3_Sub3_55 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BF)F")
	public static float method3066(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!sj;)I")
	public static int method3067(@OriginalArg(1) Class3_Sub38 arg0) {
		@Pc(7) String local7 = Static262.method3968(arg0);
		@Pc(9) int[] local9 = null;
		if (Static54.method1102(arg0.anInt6532)) {
			local9 = Static89.aClass157_1.method3832((int) arg0.aLong192).anIntArray434;
		} else if (arg0.anInt6528 != -1) {
			local9 = Static89.aClass157_1.method3832(arg0.anInt6528).anIntArray434;
		} else if (Static116.method5249(arg0.anInt6532)) {
			@Pc(93) Class1_Sub3_Sub3_Sub2 local93 = Static451.aClass1_Sub3_Sub3_Sub2Array1[(int) arg0.aLong192];
			if (local93 != null) {
				@Pc(98) Class47 local98 = local93.aClass47_1;
				if (local98.anIntArray134 != null) {
					local98 = local98.method1296(Static369.aClass11_1);
				}
				if (local98 != null) {
					local9 = local98.anIntArray137;
				}
			}
		} else if (Static34.method820(arg0.anInt6532)) {
			@Pc(65) Class128 local65;
			if (arg0.anInt6532 == 1004) {
				local65 = Static55.aClass25_1.method855((int) arg0.aLong192);
			} else {
				local65 = Static55.aClass25_1.method855((int) (arg0.aLong192 >>> 32 & 0x7FFFFFFFL));
			}
			if (local65.anIntArray307 != null) {
				local65 = local65.method3307(Static369.aClass11_1);
			}
			if (local65 != null) {
				local9 = local65.anIntArray303;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static39.method921(local9);
		}
		@Pc(135) int local135 = Static222.aClass179_10.method4390(Static270.aClass22Array21, local7);
		if (arg0.aBoolean453) {
			local135 += Static55.aClass22_2.UA() + 4;
		}
		return local135;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/awt/Frame;Lclient!hs;)V")
	public static void method3068(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class103 arg1) {
		while (true) {
			@Pc(14) Class190 local14 = arg1.method2828(arg0);
			while (local14.anInt5799 == 0) {
				Static135.method2458(10L);
			}
			if (local14.anInt5799 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static135.method2458(100L);
		}
	}
}

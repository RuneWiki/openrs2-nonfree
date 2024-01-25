import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_90 = new Class177(46, 3);

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!hd;ZLclient!hd;II)I")
	public static int method4916(@OriginalArg(0) Class103_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class103_Sub1 arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg2.anInt3185;
			local12 = arg0.anInt3185;
			if (!arg1) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static39.method743(arg0.method2371().aString51, Static365.anInt6682, arg2.method2371().aString51);
		} else if (arg3 == 3) {
			if (arg2.aString29.equals("-")) {
				if (arg0.aString29.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString29.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static39.method743(arg0.aString29, Static365.anInt6682, arg2.aString29);
			}
		} else if (arg3 == 4) {
			if (arg2.method2364()) {
				return arg0.method2364() ? 0 : 1;
			} else if (arg0.method2364()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg2.method2359()) {
				return arg0.method2359() ? 0 : 1;
			} else if (arg0.method2359()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg2.method2360()) {
				return arg0.method2360() ? 0 : 1;
			} else if (arg0.method2360()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg2.method2361()) {
				return arg0.method2361() ? 0 : 1;
			} else if (arg0.method2361()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg2.anInt3197;
			local12 = arg0.anInt3197;
			if (arg1) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg2.anInt3201 - arg0.anInt3201;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)V")
	public static void method4917(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static377.aClass1_Sub1_Sub17_2 != null) {
			Static129.anInt2880 = Static377.aClass1_Sub1_Sub17_2.anInt7427;
		} else {
			Static129.anInt2880 = -1;
		}
		Static98.aClass68_5 = null;
		Static140.aClass203_19 = null;
		Static377.aClass1_Sub1_Sub17_2 = null;
		Static2.anInt48 = 0;
		Static377.method3861();
		Static377.aClass203_40.method4553();
		Static114.aClass137_4 = null;
		Static414.aClass122_16 = null;
		Static332.anInt6412 = -1;
		Static168.aClass122_5 = null;
		Static377.aClass121_3 = null;
		Static11.aClass122_1 = null;
		Static135.anInt3020 = -1;
		Static51.aClass122_4 = null;
		Static105.aClass122_6 = null;
		Static141.aClass122_7 = null;
		Static448.aClass122_17 = null;
		Static433.aClass122_19 = null;
		Static377.aClass170_4.method3741();
		Static377.aClass84_4.method1803(64, 64);
		Static377.aClass170_4.method3743(128, 64);
		Static377.aClass161_2.method3623(64);
		Static303.aClass152_1.method3459(64);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ia;IB)Ljava/lang/String;")
	public static String method4918(@OriginalArg(0) Class1_Sub3 arg0) {
		try {
			@Pc(12) int local12 = arg0.method1168();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local12];
			arg0.anInt1710 += Static68.aClass226_1.method5090(local20, 0, arg0.aByteArray14, arg0.anInt1710, local12);
			return Static289.method4251(local12, 0, local20);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}
}

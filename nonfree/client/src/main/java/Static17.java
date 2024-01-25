import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_12 = new Class397(142, 8);

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method558(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			local8[local16] = local16 + ": ";
			if (arg0 != null && arg0[local16] != null) {
				local8[local16] = local8[local16] + arg0[local16];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method559(@OriginalArg(1) String arg0) {
		if (Static273.aClass61Array1 == null) {
			return;
		}
		@Pc(22) Class292 local22 = Static631.method8307();
		@Pc(28) Class3_Sub29 local28 = Static507.method6901(Static227.aClass144_39, local22.aClass88_2);
		local28.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(arg0));
		local28.aClass3_Sub2_Sub1_1.method2073(arg0);
		local22.method6855(local28);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!lu;IZLclient!lu;B)I")
	public static int method560(@OriginalArg(0) Class238_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class238_Sub1 arg3) {
		@Pc(12) int local12;
		if (arg1 == 1) {
			@Pc(9) int local9 = arg0.anInt6065;
			local12 = arg3.anInt6065;
			if (!arg2) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg1 == 2) {
			return Static169.method2736(arg0.method5302().aString121, arg3.method5302().aString121, Static456.anInt7118);
		} else if (arg1 == 3) {
			if (arg0.aString80.equals("-")) {
				if (arg3.aString80.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString80.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static169.method2736(arg0.aString80, arg3.aString80, Static456.anInt7118);
			}
		} else if (arg1 == 4) {
			if (arg0.method5293()) {
				return arg3.method5293() ? 0 : 1;
			} else if (arg3.method5293()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg0.method5294()) {
				return arg3.method5294() ? 0 : 1;
			} else if (arg3.method5294()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg0.method5292()) {
				return arg3.method5292() ? 0 : 1;
			} else if (arg3.method5292()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg0.method5297()) {
				return arg3.method5297() ? 0 : 1;
			} else if (arg3.method5297()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local12 = arg0.anInt6078;
			@Pc(236) int local236 = arg3.anInt6078;
			if (arg2) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local236 == 1000) {
					local236 = -1;
				}
			} else {
				if (local236 == -1) {
					local236 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local12 - local236;
		} else {
			return arg0.anInt6079 - arg3.anInt6079;
		}
	}
}

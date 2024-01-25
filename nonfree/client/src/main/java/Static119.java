import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_23 = new Class286(28, 4);

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
	public static int anInt2324 = 0;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)I")
	public static int method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local18;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public static void method2061() {
		if (Static395.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) String local13 = Static395.anApplet1.getParameter("cookiehost");
			@Pc(21) int local21 = (int) (Static626.method8479() / 86400000L) - 11745;
			@Pc(45) String local45 = "usrdob=" + local21 + "; version=1; path=/; domain=" + local13;
			Static733.method8726(Static395.anApplet1, "document.cookie=\"" + local45 + "\"");
		} catch (@Pc(61) Throwable local61) {
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!oba;ILclient!hca;ILclient!gja;III)V")
	public static void method2062(@OriginalArg(0) Class19_Sub1_Sub3_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class144 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class19_Sub1_Sub3_Sub2_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) Class3_Sub49 local14 = new Class3_Sub49();
		local14.anInt9911 = arg6;
		local14.anInt9906 = arg3 << 9;
		local14.anInt9904 = arg1 << 9;
		if (arg2 != null) {
			local14.aClass144_1 = arg2;
			@Pc(35) int local35 = arg2.anInt4444;
			@Pc(38) int local38 = arg2.anInt4410;
			if (arg5 == 1 || arg5 == 3) {
				local38 = arg2.anInt4444;
				local35 = arg2.anInt4410;
			}
			local14.anInt9910 = arg2.anInt4442;
			local14.anInt9902 = arg2.anInt4404;
			local14.anInt9897 = arg3 + local38 << 9;
			local14.anInt9901 = arg2.anInt4392 << 9;
			local14.anInt9907 = arg2.anInt4428;
			local14.anInt9898 = arg2.anInt4391 << 9;
			local14.anInt9912 = arg2.anInt4441;
			local14.anInt9913 = arg2.anInt4438;
			local14.aBoolean720 = arg2.aBoolean383;
			local14.anInt9899 = arg1 + local35 << 9;
			local14.anInt9900 = arg2.anInt4434;
			local14.anIntArray548 = arg2.anIntArray240;
			local14.aBoolean721 = arg2.aBoolean381;
			if (arg2.anIntArray239 != null) {
				local14.aBoolean719 = true;
				local14.method8352();
			}
			if (local14.anIntArray548 != null) {
				local14.anInt9905 = (int) (Math.random() * (double) (local14.anInt9900 - local14.anInt9912)) + local14.anInt9912;
			}
			Static352.aClass357_30.method8401(local14);
		} else if (arg4 != null) {
			local14.aClass19_Sub1_Sub3_Sub2_Sub1_3 = arg4;
			@Pc(222) Class18 local222 = arg4.aClass18_1;
			if (local222.anIntArray23 != null) {
				local14.aBoolean719 = true;
				local222 = local222.method407(Static577.aClass362_1);
			}
			if (local222 != null) {
				local14.anInt9897 = arg3 + local222.anInt437 << 9;
				local14.anInt9899 = local222.anInt437 + arg1 << 9;
				local14.anInt9910 = Static168.method8930(arg4);
				local14.anInt9913 = local222.anInt472;
				local14.anInt9898 = local222.anInt470 << 9;
				local14.anInt9902 = local222.anInt433;
				local14.anInt9901 = local222.anInt474 << 9;
				local14.aBoolean720 = local222.aBoolean24;
				local14.anInt9907 = local222.anInt445;
			}
			Static627.aClass357_58.method8401(local14);
		} else if (arg0 != null) {
			local14.aClass19_Sub1_Sub3_Sub2_Sub2_3 = arg0;
			local14.anInt9899 = arg0.method6592() + arg1 << 9;
			local14.anInt9897 = arg3 + arg0.method6592() << 9;
			local14.anInt9910 = Static681.method8984(arg0, -11542);
			local14.anInt9913 = 256;
			local14.aBoolean720 = arg0.aBoolean598;
			local14.anInt9902 = 256;
			local14.anInt9901 = 0;
			local14.anInt9898 = arg0.anInt7856 << 9;
			local14.anInt9907 = arg0.anInt7846;
			Static81.aClass136_7.method3508((long) arg0.anInt7796, local14);
			return;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIZLclient!oaa;Lclient!oaa;)I")
	public static int method2063(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class256_Sub1 arg2, @OriginalArg(4) Class256_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg2.anInt7707;
			local12 = arg3.anInt7707;
			if (!arg1) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static91.method1248(Static141.anInt2658, arg3.method6538().aString125, arg2.method6538().aString125);
		} else if (arg0 == 3) {
			if (arg2.aString105.equals("-")) {
				if (arg3.aString105.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString105.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static91.method1248(Static141.anInt2658, arg3.aString105, arg2.aString105);
			}
		} else if (arg0 == 4) {
			if (arg2.method6533()) {
				return arg3.method6533() ? 0 : 1;
			} else if (arg3.method6533()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg2.method6536()) {
				return arg3.method6536() ? 0 : 1;
			} else if (arg3.method6536()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg2.method6534()) {
				return arg3.method6534() ? 0 : 1;
			} else if (arg3.method6534()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg2.method6537()) {
				return arg3.method6537() ? 0 : 1;
			} else if (arg3.method6537()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg2.anInt7713;
			local12 = arg3.anInt7713;
			if (arg1) {
				if (local9 == 1000) {
					local9 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
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
			return arg2.anInt7714 - arg3.anInt7714;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)Z")
	public static boolean method2065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}

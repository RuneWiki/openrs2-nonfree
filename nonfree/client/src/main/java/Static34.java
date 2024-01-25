import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!qo;")
	public static Class243 aClass243_1;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_9 = new Class186(50, 7);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public static void method1304() {
		@Pc(1) Class316 local1 = Static505.aClass316_61;
		synchronized (Static505.aClass316_61) {
			Static505.aClass316_61.method7803();
		}
		local1 = Static140.aClass316_16;
		synchronized (Static140.aClass316_16) {
			Static140.aClass316_16.method7803();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1305(@OriginalArg(0) String arg0) {
		if (Static283.aString53.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Static283.aString53.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Static283.aString53.startsWith("mac")) {
			return "lib" + arg0 + ".jnilib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	public static void method1306() {
		Static291.method4908(Static279.aClass309_6);
		Static184.anInt3931++;
		if (Static201.aBoolean257 && Static519.aBoolean611) {
			@Pc(26) int local26 = Static42.aClass191_1.method5138();
			@Pc(30) int local30 = Static42.aClass191_1.method5141();
			local26 -= Static106.anInt2480;
			local30 -= Static120.anInt2882;
			if (local26 < Static115.anInt2806) {
				local26 = Static115.anInt2806;
			}
			if (Static388.anInt6744 > local30) {
				local30 = Static388.anInt6744;
			}
			if (local26 + Static279.aClass309_6.anInt8790 > Static395.aClass309_9.anInt8790 + Static115.anInt2806) {
				local26 = Static115.anInt2806 + Static395.aClass309_9.anInt8790 - Static279.aClass309_6.anInt8790;
			}
			if (Static279.aClass309_6.anInt8752 + local30 > Static395.aClass309_9.anInt8752 + Static388.anInt6744) {
				local30 = Static395.aClass309_9.anInt8752 + Static388.anInt6744 - Static279.aClass309_6.anInt8752;
			}
			@Pc(105) int local105 = Static395.aClass309_9.anInt8786 + local26 - Static115.anInt2806;
			@Pc(113) int local113 = Static395.aClass309_9.anInt8721 + local30 - Static388.anInt6744;
			@Pc(163) Class1_Sub40 local163;
			if (Static42.aClass191_1.method5143()) {
				if (Static279.aClass309_6.anInt8784 < Static184.anInt3931) {
					@Pc(201) int local201 = local26 - Static489.anInt8373;
					@Pc(206) int local206 = local30 - Static47.anInt1424;
					if (local201 > Static279.aClass309_6.anInt8747 || -Static279.aClass309_6.anInt8747 > local201 || Static279.aClass309_6.anInt8747 < local206 || local206 < -Static279.aClass309_6.anInt8747) {
						Static102.aBoolean173 = true;
					}
				}
				if (Static279.aClass309_6.anObjectArray9 != null && Static102.aBoolean173) {
					local163 = new Class1_Sub40();
					local163.anInt6961 = local113;
					local163.anInt6957 = local105;
					local163.anObjectArray5 = Static279.aClass309_6.anObjectArray9;
					local163.aClass309_10 = Static279.aClass309_6;
					Static387.method5838(local163);
				}
			} else {
				if (Static102.aBoolean173) {
					Static214.method3846();
					if (Static279.aClass309_6.anObjectArray30 != null) {
						local163 = new Class1_Sub40();
						local163.aClass309_10 = Static279.aClass309_6;
						local163.anObjectArray5 = Static279.aClass309_6.anObjectArray30;
						local163.aClass309_11 = Static29.aClass309_2;
						local163.anInt6957 = local105;
						local163.anInt6961 = local113;
						Static387.method5838(local163);
					}
					if (Static29.aClass309_2 != null && Static62.method1756(Static279.aClass309_6) != null) {
						Static153.method3115(Static279.aClass309_6, Static29.aClass309_2);
					}
				} else if ((Static235.anInt4604 == 1 || Static425.method6302()) && Static267.anInt5167 > 2) {
					Static65.method7167(Static47.anInt1424 + Static120.anInt2882, Static106.anInt2480 - -Static489.anInt8373);
				} else if (Static30.method1222()) {
					Static65.method7167(Static120.anInt2882 + Static47.anInt1424, Static106.anInt2480 + Static489.anInt8373);
				}
				Static279.aClass309_6 = null;
			}
		} else if (Static184.anInt3931 > 1) {
			Static279.aClass309_6 = null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Z")
	public static boolean method1307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Z")
	public static boolean method1308(@OriginalArg(0) int arg0) {
		if (arg0 == 13 || arg0 == 6 || arg0 == 21 || arg0 == 60 || arg0 == 59) {
			return true;
		} else {
			return arg0 == 20 || arg0 == 1009;
		}
	}
}

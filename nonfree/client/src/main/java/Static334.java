import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!tr;")
	public static Class137 aClass137_7;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	public static int anInt5572;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray78 = new String[200];

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
	public static int anInt5568 = 0;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "[S")
	public static final short[] aShortArray98 = new short[] { 49, 10, 58, 15, 21, 18, 44, 45 };

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_198 = new Class48(40, 5);

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "Z")
	public static boolean aBoolean521 = false;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
	public static int anInt5573 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method4795() {
		Static312.method4635(Static227.aClass117_14);
		Static100.anInt6412++;
		if (aBoolean521 && Static192.aBoolean335) {
			@Pc(28) int local28 = Static300.aClass182_1.method4112();
			@Pc(32) int local32 = Static300.aClass182_1.method4121();
			local28 -= Static211.anInt3646;
			local32 -= Static252.anInt4375;
			if (Static276.anInt5132 > local28) {
				local28 = Static276.anInt5132;
			}
			if (local28 + Static227.aClass117_14.anInt3074 > Static276.anInt5132 - -Static197.aClass117_8.anInt3074) {
				local28 = Static276.anInt5132 + Static197.aClass117_8.anInt3074 - Static227.aClass117_14.anInt3074;
			}
			if (local32 < Static120.anInt2162) {
				local32 = Static120.anInt2162;
			}
			if (Static227.aClass117_14.anInt3071 + local32 > Static120.anInt2162 - -Static197.aClass117_8.anInt3071) {
				local32 = Static120.anInt2162 + Static197.aClass117_8.anInt3071 - Static227.aClass117_14.anInt3071;
			}
			@Pc(110) int local110 = local28 + Static197.aClass117_8.anInt3040 - Static276.anInt5132;
			@Pc(117) int local117 = Static197.aClass117_8.anInt3089 + local32 - Static120.anInt2162;
			@Pc(132) Class1_Sub39 local132;
			if (Static300.aClass182_1.method4114()) {
				if (Static227.aClass117_14.anInt3049 < Static100.anInt6412) {
					@Pc(213) int local213 = local28 - Static123.anInt5254;
					@Pc(217) int local217 = local32 - Static47.anInt926;
					if (Static227.aClass117_14.anInt3098 < local213 || -Static227.aClass117_14.anInt3098 > local213 || local217 > Static227.aClass117_14.anInt3098 || local217 < -Static227.aClass117_14.anInt3098) {
						Static40.aBoolean70 = true;
					}
				}
				if (Static227.aClass117_14.anObjectArray18 != null && Static40.aBoolean70) {
					local132 = new Class1_Sub39();
					local132.anObjectArray34 = Static227.aClass117_14.anObjectArray18;
					local132.anInt5360 = local117;
					local132.anInt5363 = local110;
					local132.aClass117_16 = Static227.aClass117_14;
					Static387.method5496(local132);
				}
			} else {
				if (Static40.aBoolean70) {
					Static361.method5016();
					if (Static227.aClass117_14.anObjectArray23 != null) {
						local132 = new Class1_Sub39();
						local132.anObjectArray34 = Static227.aClass117_14.anObjectArray23;
						local132.anInt5363 = local110;
						local132.aClass117_16 = Static227.aClass117_14;
						local132.aClass117_15 = Static129.aClass117_2;
						local132.anInt5360 = local117;
						Static387.method5496(local132);
					}
					if (Static129.aClass117_2 != null && Static50.method805(Static227.aClass117_14) != null) {
						Static390.method5528(Static227.aClass117_14, Static129.aClass117_2);
					}
				} else if ((Static205.anInt3599 == 1 || Static293.method4440()) && Static215.anInt3678 > 2) {
					Static386.method5467(Static211.anInt3646 + Static123.anInt5254, Static252.anInt4375 + Static47.anInt926);
				} else if (Static227.method4201()) {
					Static386.method5467(Static123.anInt5254 + Static211.anInt3646, Static47.anInt926 + Static252.anInt4375);
				}
				Static227.aClass117_14 = null;
			}
		} else if (Static100.anInt6412 > 1) {
			Static227.aClass117_14 = null;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!tq;)V")
	public static void method4796(@OriginalArg(1) Class164 arg0) {
		if (Static65.aBoolean115) {
			Static224.method3126(arg0);
		} else {
			Static82.method1216(arg0);
		}
	}
}

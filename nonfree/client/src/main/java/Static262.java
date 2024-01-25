import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
	public static int anInt4606;

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "[J")
	public static final long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "[I")
	public static final int[] anIntArray397 = new int[16];

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	public static void method3687() {
		if (Static103.anInt5365 == -1) {
			return;
		}
		@Pc(17) int local17 = Static196.aClass126_1.method5366();
		@Pc(21) int local21 = Static196.aClass126_1.method5364();
		@Pc(26) Class2_Sub11 local26 = (Class2_Sub11) Static292.aClass181_26.method3972();
		if (local26 != null) {
			local17 = local26.method4365();
			local21 = local26.method4368();
		}
		Static51.method803(local21, local17, Static103.anInt5365, 0, 0, 0, Static344.anInt6105, 0, Static49.anInt789);
		if (Static415.aClass93_18 != null) {
			Static190.method2748(local21, local17);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public static void method3688() {
		Static457.aClass227_6.method5238();
		Static171.aClass210_6.method4905();
		Static421.aClass174_2.method3699();
		Static249.aClass39_2.method746();
		Static227.aClass54_2.method1127();
		Static413.aClass271_2.method6204();
		Static37.aClass80_1.method1878();
		Static399.aClass100_2.method2196();
		Static371.aClass211_1.method4913();
		Static361.aClass267_1.method6048();
		Static257.aClass262_1.method5910();
		Static386.aClass230_7.method5254();
		Static54.aClass84_2.method1954();
		Static461.aClass34_1.method628();
		Static275.aClass235_1.method5384();
		Static174.aClass147_1.method3048();
		Static388.aClass35_1.method653();
		Static379.aClass152_2.method3075();
		Static39.aClass73_1.method1451();
		Static236.aClass55_1.method1133();
		Static439.method5931();
		Static22.method400();
		Static293.method4164();
		if (Static112.aClass129_4 != Static429.aClass129_8) {
			for (@Pc(82) int local82 = 0; local82 < Static38.aByteArrayArray5.length; local82++) {
				Static38.aByteArrayArray5[local82] = null;
			}
			Static234.anInt3948 = 0;
		}
		method3692();
		Static253.method3538();
		Static99.method1444();
		Static168.method5038();
		Static148.method2252();
		Static76.aClass188_16.method4156();
		Static257.aClass75_8.method5980();
		Static187.aClass111_2.method2311();
		Static227.method3106();
		Static355.aClass171_81.method3667();
		Static274.aClass171_64.method3667();
		Static73.aClass171_16.method3667();
		Static352.aClass171_79.method3667();
		Static199.aClass171_46.method3667();
		Static11.aClass171_2.method3667();
		Static431.aClass171_95.method3667();
		Static323.aClass171_70.method3667();
		Static446.aClass171_101.method3667();
		Static252.aClass171_57.method3667();
		Static413.aClass171_94.method3667();
		Static354.aClass171_80.method3667();
		Static436.aClass171_96.method3667();
		Static336.aClass171_71.method3667();
		Static284.aClass171_67.method3667();
		Static258.aClass171_59.method3667();
		Static233.aClass171_51.method3667();
		Static16.aClass171_68.method3667();
		Static178.aClass171_45.method3667();
		Static112.aClass171_29.method3667();
		Static82.aClass171_50.method3667();
		Static358.aClass171_100.method3667();
		Static363.aClass171_84.method3667();
		Static340.aClass171_73.method3667();
		Static59.aClass171_87.method3667();
		Static67.aClass171_15.method3667();
		Static342.aClass171_74.method3667();
		Static110.aClass171_28.method3667();
		Static47.aClass171_8.method3667();
		Static358.aClass171_99.method3667();
		Static348.aClass188_47.method4156();
		Static59.aClass188_48.method4156();
		Static452.aClass188_10.method4156();
		Static442.aClass188_57.method4156();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3689(@OriginalArg(0) String arg0) {
		if (!Static11.aBoolean7) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static121.anInt2062;
		@Pc(14) int[] local14 = Static311.anIntArray474;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class11_Sub5_Sub2_Sub1 local24 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local14[local16]];
			if (local24 != null && Static127.aClass11_Sub5_Sub2_Sub1_2 != local24 && local24.aString20 != null && local24.aString20.equalsIgnoreCase(arg0)) {
				Static164.method2403(Static442.aClass208_104);
				Static389.aClass2_Sub17_Sub1_2.method6112(local14[local16]);
				Static389.aClass2_Sub17_Sub1_2.method6126(0);
				Static389.aClass2_Sub17_Sub1_2.method6130(Static435.anInt7328);
				Static389.aClass2_Sub17_Sub1_2.method6130(Static238.anInt4001);
				Static389.aClass2_Sub17_Sub1_2.method6136(Static329.anInt5889);
				Static391.method5421(local24.anIntArray632[0], 0, local24.method6215(), local24.anIntArray633[0], -2, 0, local24.method6215(), true);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static172.method2536(Static49.aClass231_17.method5261(Static80.anInt6195) + arg0);
		}
		if (Static11.aBoolean7) {
			Static465.method5985();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lclient!ec;")
	public static Class65_Sub1 method3690(@OriginalArg(1) int arg0) {
		return Static381.aBoolean446 && arg0 >= Static418.anInt7172 && arg0 <= Static162.anInt2915 ? Static148.aClass65_Sub1Array2[arg0 - Static418.anInt7172] : null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
	public static void method3692() {
		Static390.aClass188_54.method4156();
	}
}

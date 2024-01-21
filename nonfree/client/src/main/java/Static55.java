import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2 aClass1_Sub3_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_34;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2 aClass1_Sub3_Sub1_Sub2_3;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!gd;")
	public static Class28 aClass28_36 = new Class28(20);

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!gd;")
	public static Class28 aClass28_37 = new Class28(64);

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "J")
	public static volatile long aLong40 = 0L;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_674 = Static45.method1937("mapedge");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method947() {
		aClass1_Sub3_Sub1_Sub2_2 = null;
		aClass28_37 = null;
		aClass28_36 = null;
		aClass1_Sub3_Sub1_Sub2_3 = null;
		aClass5_674 = null;
		aClass1_Sub17_34 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
	public static void method948(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static89.aBooleanArray26[arg0]) {
			return;
		}
		Static122.aClass41_30.method1721(arg0);
		if (Static49.aClass1_Sub17ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static49.aClass1_Sub17ArrayArray1[arg0].length; local28++) {
			if (Static49.aClass1_Sub17ArrayArray1[arg0][local28] != null) {
				if (Static49.aClass1_Sub17ArrayArray1[arg0][local28].anInt2271 == 2) {
					local26 = false;
				} else {
					Static49.aClass1_Sub17ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static49.aClass1_Sub17ArrayArray1[arg0] = null;
		}
		Static89.aBooleanArray26[arg0] = false;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;IIB)Lclient!kf;")
	public static Class43 method949(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(12) Class local12 = Class.forName("Class43_Sub1");
			@Pc(16) Class43 local16 = (Class43) local12.getDeclaredConstructor().newInstance();
			local16.method2192(arg0, arg1, arg2);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class43_Sub2 local29 = new Class43_Sub2();
			local29.method2192(arg0, arg1, arg2);
			return local29;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method950() {
		Static104.aBoolean101 = true;
		Static17.anInt505 = 0;
		Static40.aClass79_1.anInt3253 = 0;
		Static97.aBoolean95 = true;
		Static86.aLong74 = 0L;
		Static18.method2153();
		Static13.anInt348 = 0;
		Static23.anInt750 = 0;
		Static123.anInt3131 = -1;
		Static69.aBoolean48 = false;
		Static3.anInt64 = 0;
		Static18.anInt3043 = 0;
		Static44.aClass1_Sub20_Sub1_1.anInt2951 = 0;
		Static68.anInt1586 = -1;
		Static79.aClass1_Sub20_Sub1_2.anInt2951 = 0;
		Static116.anInt2902 = 0;
		Static104.anInt2540 = -1;
		Static78.anInt1873 = -1;
		Static69.method1210(0);
		for (@Pc(1930) int local1930 = 0; local1930 < 100; local1930++) {
			Static103.aClass5Array21[local1930] = null;
		}
		Static78.anInt1878 = (int) (Math.random() * 100.0D) - 50;
		Static111.anInt2739 = 0;
		Static109.anInt2695 = -1;
		Static69.anInt1603 = (int) (Math.random() * 110.0D) - 55;
		Static98.anInt2404 = (int) (Math.random() * 30.0D) - 20;
		Static3.anInt58 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static39.anInt1037 = 0;
		Static21.anInt748 = (int) (Math.random() * 120.0D) - 60;
		Static22.anInt716 = (int) (Math.random() * 80.0D) - 40;
		Static39.anInt1036 = 0;
		Static120.anInt1840 = 0;
		Static75.anInt1750 = 0;
		Static47.aBoolean35 = false;
		Static115.anInt2885 = 0;
		Static93.anInt2338 = 0;
		for (@Pc(2010) int local2010 = 0; local2010 < 2048; local2010++) {
			Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local2010] = null;
			Static97.aClass1_Sub20Array1[local2010] = null;
		}
		for (@Pc(2028) int local2028 = 0; local2028 < 32768; local2028++) {
			Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local2028] = null;
		}
		Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[2047] = new Class1_Sub3_Sub4_Sub2_Sub1();
		Static26.aClass53_6.method1446();
		Static45.aClass53_15.method1446();
		@Pc(2058) int local2058;
		@Pc(2062) int local2062;
		for (@Pc(2054) int local2054 = 0; local2054 < 4; local2054++) {
			for (local2058 = 0; local2058 < 104; local2058++) {
				for (local2062 = 0; local2062 < 104; local2062++) {
					Static8.aClass53ArrayArrayArray1[local2054][local2058][local2062] = null;
				}
			}
		}
		Static66.aClass53_17 = new Class53();
		Static20.anInt658 = 0;
		Static92.anInt2326 = 0;
		for (local2058 = 0; local2058 < Static106.anInt2622; local2058++) {
			@Pc(2106) Class1_Sub3_Sub17 local2106 = Static124.method2202(local2058);
			if (local2106 != null && local2106.anInt3236 == 0) {
				Static46.anIntArray193[local2058] = 0;
				Static40.anIntArray182[local2058] = 0;
			}
		}
		for (local2062 = 0; local2062 < Static126.anIntArray460.length; local2062++) {
			Static126.anIntArray460[local2062] = -1;
		}
		if (Static8.anInt266 != -1) {
			method948(Static8.anInt266);
		}
		for (@Pc(2151) Class1_Sub5 local2151 = (Class1_Sub5) Static66.aClass7_14.method288(); local2151 != null; local2151 = (Class1_Sub5) Static66.aClass7_14.method284()) {
			Static87.method2231(true, local2151);
		}
		Static8.anInt266 = -1;
		Static66.aClass7_14 = new Class7(8);
		Static11.aClass1_Sub17_14 = null;
		Static69.aBoolean48 = false;
		Static18.anInt3043 = 0;
		Static100.aClass74_2.method2045(null, false, new int[5], -1);
		for (@Pc(2187) int local2187 = 0; local2187 < 5; local2187++) {
			Static63.aClass5Array13[local2187] = null;
			Static57.aBooleanArray16[local2187] = false;
		}
		Static125.method2215();
		Static81.aBoolean69 = true;
		for (@Pc(2209) int local2209 = 0; local2209 < 100; local2209++) {
			Static1.aBooleanArray1[local2209] = true;
		}
		Static101.aClass1_Sub14Array1 = null;
		Static127.anInt3250 = 0;
		Static8.aClass5_134 = null;
	}
}

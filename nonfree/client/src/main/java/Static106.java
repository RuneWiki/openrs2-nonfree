import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!sc", name = "Bb", descriptor = "I")
	public static int anInt2687;

	@OriginalMember(owner = "client!sc", name = "Y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_788 = Static60.method1113("(U");

	@OriginalMember(owner = "client!sc", name = "bb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_789 = Static60.method1113("");

	@OriginalMember(owner = "client!sc", name = "cb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_790 = Static60.method1113("jolt");

	@OriginalMember(owner = "client!sc", name = "mb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_792 = Static60.method1113("yellow:");

	@OriginalMember(owner = "client!sc", name = "jb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_791 = aClass22_792;

	@OriginalMember(owner = "client!sc", name = "yb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_793 = aClass22_792;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1747(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static33.aClass57_1);
		arg0.addMouseMotionListener(Static33.aClass57_1);
		arg0.addFocusListener(Static33.aClass57_1);
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
	public static void method1748() {
		aClass22_793 = null;
		aClass22_791 = null;
		aClass22_792 = null;
		aClass22_788 = null;
		aClass22_789 = null;
		aClass22_790 = null;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(II)Lclient!f;")
	public static Class4_Sub7 method1749(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static65.aClass4_Sub7ArrayArray1[local15] == null || Static65.aClass4_Sub7ArrayArray1[local15][local19] == null) {
			@Pc(33) boolean local33 = Static24.method396(local15);
			if (!local33) {
				return null;
			}
		}
		return Static65.aClass4_Sub7ArrayArray1[local15][local19];
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static24.method396(arg0)) {
			Static71.method1180(Static65.aClass4_Sub7ArrayArray1[arg0], arg6, arg1, arg2, arg5, arg4, arg3, -1);
		}
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
	public static void method1751() {
		Static9.aLong7 = 0L;
		Static105.aBoolean234 = true;
		Static129.anInt3059 = 0;
		Static64.aBoolean164 = true;
		Static115.aClass70_1.anInt2732 = 0;
		Static69.method1170();
		Static133.anInt3142 = -1;
		Static99.anInt2589 = 0;
		Static30.anInt713 = -1;
		Static30.anInt708 = 0;
		Static48.anInt1298 = 0;
		Static104.anInt2634 = 0;
		Static38.aClass4_Sub11_Sub1_1.anInt1099 = 0;
		Static22.aBoolean250 = false;
		Static4.anInt77 = 0;
		Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
		Static10.anInt206 = -1;
		Static72.anInt1915 = -1;
		Static62.method1124(0);
		for (@Pc(1941) int local1941 = 0; local1941 < 100; local1941++) {
			Static31.aClass22Array5[local1941] = null;
		}
		Static11.anInt2986 = (int) (Math.random() * 110.0D) - 55;
		Static84.anInt2255 = 0;
		Static51.anInt1461 = 0;
		Static39.anInt971 = 0;
		Static23.anInt552 = (int) (Math.random() * 120.0D) - 60;
		Static9.anInt184 = (int) (Math.random() * 80.0D) - 40;
		Static111.anInt2760 = (int) (Math.random() * 100.0D) - 50;
		Static5.anInt85 = -1;
		Static120.anInt2929 = 0;
		Static104.anInt2636 = 0;
		Static111.anInt2754 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static27.anInt620 = 0;
		Static4.anInt78 = 0;
		Static25.anInt574 = (int) (Math.random() * 30.0D) - 20;
		Static128.aBoolean274 = false;
		Static19.anInt543 = 0;
		for (@Pc(2025) int local2025 = 0; local2025 < 2048; local2025++) {
			Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local2025] = null;
			Static120.aClass4_Sub11Array1[local2025] = null;
		}
		for (@Pc(2043) int local2043 = 0; local2043 < 32768; local2043++) {
			Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local2043] = null;
		}
		Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[2047] = new Class4_Sub1_Sub3_Sub2_Sub1();
		Static73.aClass82_7.method2018();
		Static132.aClass82_14.method2018();
		@Pc(2073) int local2073;
		@Pc(2077) int local2077;
		for (@Pc(2069) int local2069 = 0; local2069 < 4; local2069++) {
			for (local2073 = 0; local2073 < 104; local2073++) {
				for (local2077 = 0; local2077 < 104; local2077++) {
					Static19.aClass82ArrayArrayArray1[local2069][local2073][local2077] = null;
				}
			}
		}
		Static39.aClass82_4 = new Class82();
		Static2.anInt9 = 0;
		Static50.anInt1408 = 0;
		for (local2073 = 0; local2073 < Static50.anInt1412; local2073++) {
			@Pc(2119) Class4_Sub1_Sub7 local2119 = Static48.method903(local2073);
			if (local2119 != null && local2119.anInt1404 == 0) {
				Static12.anIntArray19[local2073] = 0;
				Static23.anIntArray61[local2073] = 0;
			}
		}
		for (local2077 = 0; local2077 < Static65.anIntArray187.length; local2077++) {
			Static65.anIntArray187[local2077] = -1;
		}
		if (Static11.anInt2982 != -1) {
			Static97.method1661(Static11.anInt2982);
		}
		for (@Pc(2167) Class4_Sub21 local2167 = (Class4_Sub21) Static90.aClass81_11.method2017(); local2167 != null; local2167 = (Class4_Sub21) Static90.aClass81_11.method2013()) {
			Static112.method1794(true, local2167);
		}
		Static11.anInt2982 = -1;
		Static90.aClass81_11 = new Class81(8);
		Static43.aClass4_Sub7_9 = null;
		Static99.anInt2589 = 0;
		Static22.aBoolean250 = false;
		Static50.aClass21_1.method441(new int[5], -1, null, false);
		for (@Pc(2203) int local2203 = 0; local2203 < 8; local2203++) {
			Static33.aClass22Array6[local2203] = null;
			Static38.aBooleanArray3[local2203] = false;
		}
		Static58.method1101();
		Static73.aBoolean166 = true;
		for (@Pc(2223) int local2223 = 0; local2223 < 100; local2223++) {
			Static122.aBooleanArray7[local2223] = true;
		}
		Static109.aClass22_70 = null;
		Static133.anInt3150 = 0;
		Static92.aClass4_Sub8Array1 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	public static int anInt1011;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3 aClass5_Sub2_Sub1_Sub3_3;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_305 = Static129.method2060(" (X");

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt1012 = 99;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	private static final int anInt1013 = 0;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public static int anInt1015 = 0;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_306 = Static129.method2060("Freie Welt");

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
	public static boolean method696(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
	public static void method697(@OriginalArg(1) int arg0) {
		if (arg0 == Static24.anInt723) {
			return;
		}
		if (Static24.anInt723 == 0) {
			Static63.method1082();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static129.anInt3245 = 0;
			Static85.anInt2315 = 0;
			Static102.anInt2700 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static102.aClass30_11 != null) {
			Static102.aClass30_11.method779();
			Static102.aClass30_11 = null;
		}
		if (Static24.anInt723 == 25) {
			Static132.anInt3364 = 1;
			Static98.anInt2577 = 0;
			Static43.anInt1121 = 0;
			Static125.anInt3138 = 0;
			Static115.anInt2985 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static65.method1103(Static49.aClass26_Sub1_9, Static47.aClass26_Sub1_8, Static4.aCanvas2);
		} else {
			Static112.method1865();
		}
		Static24.anInt723 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method698() {
		aBooleanArray4 = null;
		aClass61_306 = null;
		aClass5_Sub2_Sub1_Sub3_3 = null;
		aClass61_305 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)[Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3[] method699() {
		@Pc(4) Class5_Sub2_Sub1_Sub3[] local4 = new Class5_Sub2_Sub1_Sub3[Static86.anInt2319];
		for (@Pc(10) int local10 = 0; local10 < Static86.anInt2319; local10++) {
			@Pc(24) Class5_Sub2_Sub1_Sub3 local24 = new Class5_Sub2_Sub1_Sub3();
			local24.anInt2088 = Static92.anInt2249;
			local24.anInt2086 = Static93.anInt2432;
			local24.anInt2089 = Static129.anIntArray393[local10];
			local24.anInt2087 = Static48.anIntArray190[local10];
			local24.anInt2091 = Static58.anIntArray212[local10];
			local24.anInt2090 = Static50.anIntArray191[local10];
			local24.anIntArray285 = Static108.anIntArray19;
			local24.aByteArray31 = Static67.aByteArrayArray7[local10];
			local4[local10] = local24;
		}
		Static87.method1546();
		return local4;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BI)[B")
	public static byte[] method700(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class5_Sub14 local4 = new Class5_Sub14(arg0);
		@Pc(12) int local12 = local4.method1471();
		@Pc(16) int local16 = local4.method1461();
		if (local16 < 0 || anInt1013 != 0 && anInt1013 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(80) byte[] local80 = new byte[local16];
			local4.method1449(local80, local16);
			return local80;
		} else {
			@Pc(38) int local38 = local4.method1461();
			if (local38 < 0 || anInt1013 != 0 && anInt1013 < local38) {
				throw new RuntimeException();
			}
			@Pc(59) byte[] local59 = new byte[local38];
			if (local12 == 1) {
				Static69.method1141(local59, local38, arg0, local16);
			} else {
				Static33.aClass78_1.method1974(local4, local59);
			}
			return local59;
		}
	}
}

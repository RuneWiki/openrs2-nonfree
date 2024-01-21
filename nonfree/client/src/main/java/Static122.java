import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!v", name = "Z", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!v", name = "y", descriptor = "I")
	public static final int anInt3018 = 20;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1618 = Static28.method504("Connection lost");

	@OriginalMember(owner = "client!v", name = "B", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1619 = aClass39_1618;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1620 = Static28.method504("Loaded input handler");

	@OriginalMember(owner = "client!v", name = "F", descriptor = "I")
	public static int anInt3021 = 0;

	@OriginalMember(owner = "client!v", name = "K", descriptor = "I")
	public static int anInt3024 = 0;

	@OriginalMember(owner = "client!v", name = "L", descriptor = "[B")
	public static byte[] aByteArray33 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1621 = Static28.method504("Please enter your username)3");

	@OriginalMember(owner = "client!v", name = "T", descriptor = "I")
	public static int anInt3028 = 0;

	@OriginalMember(owner = "client!v", name = "U", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1622 = aClass39_1620;

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1623 = aClass39_1621;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	public static void method2090() {
		aByteArray33 = null;
		anIntArrayArray24 = null;
		aClass39_1623 = null;
		aClass39_1620 = null;
		anIntArray324 = null;
		aClass39_1619 = null;
		aClass39_1622 = null;
		aClass39_1618 = null;
		aClass39_1621 = null;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method2091() {
		for (@Pc(10) int local10 = 0; local10 < Static30.anInt785; local10++) {
			@Pc(16) int local16 = Static35.anIntArray101[local10];
			@Pc(20) Class4_Sub2_Sub1_Sub1_Sub2 local20 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local16];
			@Pc(24) int local24 = Static35.aClass4_Sub16_Sub1_1.method1474();
			if ((local24 & 0x20) != 0) {
				local20.aClass4_Sub2_Sub16_1 = Static91.method1636(Static35.aClass4_Sub16_Sub1_1.method1467());
				local20.anInt2690 = local20.aClass4_Sub2_Sub16_1.anInt2946;
				local20.anInt2669 = local20.aClass4_Sub2_Sub16_1.anInt2941;
				local20.anInt2657 = local20.aClass4_Sub2_Sub16_1.anInt2930;
				local20.anInt2656 = local20.aClass4_Sub2_Sub16_1.anInt2918;
				local20.anInt2658 = local20.aClass4_Sub2_Sub16_1.anInt2932;
				local20.anInt2655 = local20.aClass4_Sub2_Sub16_1.anInt2925;
				local20.anInt2665 = local20.aClass4_Sub2_Sub16_1.anInt2945;
				local20.anInt2679 = local20.aClass4_Sub2_Sub16_1.anInt2928;
				local20.anInt2653 = local20.aClass4_Sub2_Sub16_1.anInt2922;
			}
			if ((local24 & 0x80) != 0) {
				local20.anInt2674 = Static35.aClass4_Sub16_Sub1_1.method1471();
				if (local20.anInt2674 == 65535) {
					local20.anInt2674 = -1;
				}
			}
			@Pc(107) int local107;
			@Pc(111) int local111;
			if ((local24 & 0x1) != 0) {
				local107 = Static35.aClass4_Sub16_Sub1_1.method1444();
				local111 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local20.method1911(local107, Static71.anInt1738, local111);
				local20.anInt2649 = Static71.anInt1738 + 300;
				local20.anInt2683 = Static35.aClass4_Sub16_Sub1_1.method1472();
				local20.anInt2664 = Static35.aClass4_Sub16_Sub1_1.method1444();
			}
			if ((local24 & 0x2) != 0) {
				local107 = Static35.aClass4_Sub16_Sub1_1.method1453();
				if (local107 == 65535) {
					local107 = -1;
				}
				local111 = Static35.aClass4_Sub16_Sub1_1.method1438();
				if (local20.anInt2678 == local107 && local107 != -1) {
					@Pc(205) int local205 = Static116.method2017(local107).anInt319;
					if (local205 == 1) {
						local20.anInt2671 = 0;
						local20.anInt2677 = 0;
						local20.anInt2646 = 0;
						local20.anInt2659 = local111;
					}
					if (local205 == 2) {
						local20.anInt2677 = 0;
					}
				} else if (local107 == -1 || local20.anInt2678 == -1 || Static116.method2017(local107).anInt313 >= Static116.method2017(local20.anInt2678).anInt313) {
					local20.anInt2671 = 0;
					local20.anInt2677 = 0;
					local20.anInt2685 = local20.anInt2660;
					local20.anInt2659 = local111;
					local20.anInt2678 = local107;
					local20.anInt2646 = 0;
				}
			}
			if ((local24 & 0x8) != 0) {
				local20.aClass39_1411 = Static35.aClass4_Sub16_Sub1_1.method1464();
				local20.anInt2672 = 100;
			}
			if ((local24 & 0x4) != 0) {
				local107 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local111 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local20.method1911(local107, Static71.anInt1738, local111);
				local20.anInt2649 = Static71.anInt1738 + 300;
				local20.anInt2683 = Static35.aClass4_Sub16_Sub1_1.method1474();
				local20.anInt2664 = Static35.aClass4_Sub16_Sub1_1.method1472();
			}
			if ((local24 & 0x10) != 0) {
				local20.anInt2686 = Static35.aClass4_Sub16_Sub1_1.method1490();
				local20.anInt2640 = Static35.aClass4_Sub16_Sub1_1.method1453();
			}
			if ((local24 & 0x40) != 0) {
				local20.anInt2692 = Static35.aClass4_Sub16_Sub1_1.method1467();
				local107 = Static35.aClass4_Sub16_Sub1_1.method1445();
				local20.anInt2693 = local107 >> 16;
				if (local20.anInt2692 == 65535) {
					local20.anInt2692 = -1;
				}
				local20.anInt2695 = 0;
				local20.anInt2662 = Static71.anInt1738 + (local107 & 0xFFFF);
				local20.anInt2684 = 0;
				if (local20.anInt2662 > Static71.anInt1738) {
					local20.anInt2684 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
	public static void method2092() {
		if (Static123.aBoolean150 && Static131.anInt3202 != Static47.anInt1183) {
			Static33.method553(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], Static131.anInt3202, Static68.anInt1700, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], Static25.anInt3168);
		} else if (Static131.anInt3202 != Static10.anInt332) {
			Static10.anInt332 = Static131.anInt3202;
			Static31.method539(Static131.anInt3202);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	public static void method2093() {
		if (Static106.aClass69_4 != null) {
			Static106.aClass69_4.method1859();
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(B)V")
	public static void method2094() {
		if (Static70.aClass26_1 != null) {
			Static70.aClass26_1.method1805();
		}
		if (Static74.aClass26_2 != null) {
			Static74.aClass26_2.method1805();
		}
	}
}

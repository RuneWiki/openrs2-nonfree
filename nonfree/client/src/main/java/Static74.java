import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Z")
	public static boolean aBoolean118 = true;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	public static int anInt1836 = -1;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	public static int anInt1837 = 0;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public static int anInt1841 = 0;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public static int anInt1842 = 0;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "[I")
	public static int[] anIntArray156 = new int[32];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public static void method1399() {
		for (@Pc(10) Class2_Sub29 local10 = (Class2_Sub29) Static300.aClass44_26.method1352(); local10 != null; local10 = (Class2_Sub29) Static300.aClass44_26.method1360()) {
			if (local10.anInt5683 > 0) {
				local10.anInt5683--;
			}
			if (local10.anInt5683 != 0) {
				if (local10.anInt5693 > 0) {
					local10.anInt5693--;
				}
				if (local10.anInt5693 == 0 && local10.anInt5687 >= 1 && local10.anInt5681 >= 1 && local10.anInt5687 <= 102 && local10.anInt5681 <= 102 && (local10.anInt5685 < 0 || Static303.method4614(local10.anInt5685, local10.anInt5682))) {
					Static160.method4115(local10.anInt5690, local10.anInt5681, local10.anInt5692, local10.anInt5687, local10.anInt5682, local10.anInt5694, local10.anInt5685);
					local10.anInt5693 = -1;
					if (local10.anInt5685 == local10.anInt5689 && local10.anInt5689 == -1) {
						local10.method4743();
					} else if (local10.anInt5689 == local10.anInt5685 && local10.anInt5690 == local10.anInt5691 && local10.anInt5684 == local10.anInt5682) {
						local10.method4743();
					}
				}
			} else if (local10.anInt5689 < 0 || Static303.method4614(local10.anInt5689, local10.anInt5684)) {
				Static160.method4115(local10.anInt5691, local10.anInt5681, local10.anInt5692, local10.anInt5687, local10.anInt5684, local10.anInt5694, local10.anInt5689);
				local10.method4743();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method1400() {
		if (Static79.aClass56_8 != null || (Static199.aClass56_19 != null || Static28.anInt626 > 0)) {
			return;
		}
		@Pc(29) int local29 = Static98.anInt2337;
		@Pc(102) int local102;
		@Pc(108) int local108;
		if (!Static196.aBoolean281) {
			if (local29 == 1 && Static68.anInt1741 > 0) {
				@Pc(47) short local47 = Static290.aShortArray85[Static68.anInt1741 - 1];
				if (local47 == 23 || local47 == 26 || local47 == 51 || local47 == 29 || local47 == 58 || local47 == 48 || local47 == 9 || local47 == 60 || local47 == 8 || local47 == 49 || local47 == 44 || local47 == 1001) {
					local102 = Static67.anIntArray144[Static68.anInt1741 - 1];
					local108 = Static56.anIntArray123[Static68.anInt1741 - 1];
					@Pc(112) Class56 local112 = Static38.method715(local108);
					@Pc(115) Class2_Sub7 local115 = Static42.method804(local112);
					if (local115.method334() || local115.method338()) {
						Static132.aBoolean211 = false;
						Static303.anInt5850 = 0;
						if (Static79.aClass56_8 != null) {
							Static287.method4466(Static79.aClass56_8);
						}
						Static79.aClass56_8 = Static38.method715(local108);
						Static85.anInt1997 = Static86.anInt2010;
						Static253.anInt4975 = Static252.anInt4933;
						Static85.anInt2005 = local102;
						Static287.method4466(Static79.aClass56_8);
						return;
					}
				}
			}
			if (local29 == 1 && (Static238.anInt5978 == 1 && Static68.anInt1741 > 2 || Static183.method3239(Static68.anInt1741 - 1))) {
				local29 = 2;
			}
			if (local29 == 2 && Static68.anInt1741 > 0 || Static6.anInt113 == 1) {
				Static13.method239();
			}
			if (local29 == 1 && Static68.anInt1741 > 0 || Static6.anInt113 == 2) {
				Static121.method2022();
			}
			return;
		}
		@Pc(201) int local201;
		if (local29 != 1) {
			local201 = Static131.anInt3016;
			local102 = Static281.anInt5551;
			if (local201 < Static68.anInt1739 - 10 || local201 > Static274.anInt5436 + Static68.anInt1739 + 10 || local102 < Static39.anInt982 - 10 || local102 > Static39.anInt982 + Static275.anInt5450 + 10) {
				Static196.aBoolean281 = false;
				Static253.method3981(Static275.anInt5450, Static39.anInt982, Static68.anInt1739, Static274.anInt5436);
			}
		}
		if (local29 != 1) {
			return;
		}
		local201 = Static68.anInt1739;
		local102 = Static39.anInt982;
		local108 = Static274.anInt5436;
		@Pc(256) int local256 = -1;
		@Pc(258) int local258 = Static252.anInt4933;
		@Pc(260) int local260 = Static86.anInt2010;
		for (@Pc(262) int local262 = 0; local262 < Static68.anInt1741; local262++) {
			@Pc(284) int local284;
			if (Static54.aBoolean90) {
				local284 = local102 + (Static68.anInt1741 - 1 + -local262) * 15 + 33;
				if (local260 > local201 && local108 + local201 > local260 && local284 - 13 < local258 && local284 + 3 > local258) {
					local256 = local262;
				}
			} else {
				local284 = (Static68.anInt1741 - local262 - 1) * 15 + local102 + 31;
				if (local201 < local260 && local260 < local201 + local108 && local284 - 13 < local258 && local258 < local284 + 3) {
					local256 = local262;
				}
			}
		}
		if (local256 != -1) {
			Static73.method1397(local256);
		}
		Static196.aBoolean281 = false;
		Static253.method3981(Static275.anInt5450, Static39.anInt982, Static68.anInt1739, Static274.anInt5436);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)I")
	public static int method1402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method1403() {
		Static219.aClass101_18 = new Class101(32);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Lclient!bn;")
	public static Class2_Sub8_Sub1 method1404() {
		@Pc(13) int local13 = Static187.anIntArray397[0] * Static299.anIntArray561[0];
		@Pc(17) byte[] local17 = Static165.aByteArrayArray9[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static199.anIntArray438[local17[local22] & 0xFF];
		}
		@Pc(69) Class2_Sub8_Sub1 local69;
		if (Static116.aBoolean184) {
			local69 = new Class2_Sub8_Sub1_Sub2(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[0], Static275.anIntArray522[0], Static299.anIntArray561[0], Static187.anIntArray397[0], local20);
		} else {
			local69 = new Class2_Sub8_Sub1_Sub1(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[0], Static275.anIntArray522[0], Static299.anIntArray561[0], Static187.anIntArray397[0], local20);
		}
		Static293.method4502();
		return local69;
	}
}

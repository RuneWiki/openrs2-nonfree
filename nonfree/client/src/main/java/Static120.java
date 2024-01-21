import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1004 = Static170.method3101("::fps ");

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1005 = Static170.method3101("No response from server)3");

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!pa;")
	public static Class63 aClass63_20 = new Class63(30);

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1006 = aClass28_1005;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method2405() {
		aClass28_1006 = null;
		aClass28_1004 = null;
		aClass28_1005 = null;
		aClass63_20 = null;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method2406() {
		if (Static165.aClass33_13 != null || Static22.aClass33_2 != null) {
			return;
		}
		@Pc(19) int local19 = Static87.anInt2539;
		@Pc(84) int local84;
		@Pc(90) int local90;
		if (Static69.aBoolean112) {
			@Pc(176) int local176;
			if (local19 != 1) {
				local176 = Static73.anInt2181;
				local84 = Static35.anInt1049;
				if (local176 < Static91.anInt4119 - 10 || Static132.anInt3333 + Static91.anInt4119 + 10 < local176 || local84 < Static65.anInt2018 - 10 || Static65.anInt2018 + Static68.anInt2102 + 10 < local84) {
					Static69.aBoolean112 = false;
					Static23.method618(Static65.anInt2018, Static132.anInt3333, Static68.anInt2102, Static91.anInt4119);
				}
			}
			if (local19 != 1) {
				return;
			}
			local176 = Static91.anInt4119;
			local84 = Static65.anInt2018;
			local90 = Static132.anInt3333;
			@Pc(231) int local231 = Static2.anInt80;
			@Pc(233) int local233 = Static160.anInt3914;
			@Pc(235) int local235 = -1;
			for (@Pc(237) int local237 = 0; local237 < Static82.anInt2400; local237++) {
				@Pc(251) int local251 = (Static82.anInt2400 - local237 - 1) * 15 + local84 + 31;
				if (local231 > local176 && local231 < local90 + local176 && local233 > local251 - 13 && local251 + 3 > local233) {
					local235 = local237;
				}
			}
			if (local235 != -1) {
				Static131.method2558(local235);
			}
			Static69.aBoolean112 = false;
			Static23.method618(Static65.anInt2018, Static132.anInt3333, Static68.anInt2102, Static91.anInt4119);
			return;
		}
		if (local19 == 1 && Static82.anInt2400 > 0) {
			@Pc(32) short local32 = Static21.aShortArray8[Static82.anInt2400 - 1];
			if (local32 == 5 || local32 == 21 || local32 == 19 || local32 == 33 || local32 == 22 || local32 == 57 || local32 == 12 || local32 == 1 || local32 == 2 || local32 == 47 || local32 == 7 || local32 == 1007) {
				local84 = Static8.anIntArray228[Static82.anInt2400 - 1];
				local90 = Static46.anIntArray238[Static82.anInt2400 - 1];
				@Pc(94) Class33 local94 = Static19.method576(local90);
				if (Static116.method2335(Static4.method97(local94)) || Static95.method2091(Static4.method97(local94))) {
					Static38.anInt1097 = 0;
					Static160.aBoolean184 = false;
					if (Static165.aClass33_13 != null) {
						Static16.method534(Static165.aClass33_13);
					}
					Static165.aClass33_13 = Static19.method576(local90);
					Static69.anInt2118 = local84;
					Static15.anInt1150 = Static160.anInt3914;
					Static79.anInt2335 = Static2.anInt80;
					Static16.method534(Static165.aClass33_13);
					return;
				}
			}
		}
		if (local19 == 1 && (Static5.anInt131 == 1 && Static82.anInt2400 > 2 || Static38.method892(Static82.anInt2400 - 1))) {
			local19 = 2;
		}
		if (local19 == 1 && Static82.anInt2400 > 0) {
			Static131.method2558(Static82.anInt2400 - 1);
		}
		if (local19 == 2 && Static82.anInt2400 > 0) {
			Static73.method1680();
			return;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ah;B)V")
	public static void method2407(@OriginalArg(0) Class7 arg0) {
		Static145.aClass7_60 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lclient!l;")
	public static Class3_Sub2_Sub12 method2408(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub2_Sub12 local10 = (Class3_Sub2_Sub12) Static72.aClass63_12.method2337((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static18.aClass7_12.method1021(16, arg0);
		local10 = new Class3_Sub2_Sub12();
		if (local20 != null) {
			local10.method1986(new Class3_Sub8(local20));
		}
		Static72.aClass63_12.method2338((long) arg0, local10);
		return local10;
	}
}

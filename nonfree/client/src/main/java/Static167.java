import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Lclient!oh;")
	public static final Class238 aClass238_2 = new Class238();

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_72 = new Class254(94, 6);

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
	public static int anInt3844 = 0;

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "Lclient!gl;")
	public static final Class117 aClass117_7 = new Class117(5, 16);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)I")
	public static int method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 255 - arg0;
		@Pc(26) int local26 = (arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00 | (arg2 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
		return (((arg1 & 0xFF00) * local8 & 0xFF0000 | (arg1 & 0xFF00FF) * local8 & 0xFF00FF00) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ap;I)V")
	public static void method3389(@OriginalArg(0) Class9_Sub2 arg0) {
		@Pc(16) byte[] local16;
		if (Static319.anObject8 == null) {
			@Pc(9) Class45_Sub2_Sub2 local9 = new Class45_Sub2_Sub2();
			local16 = local9.method5061();
			Static319.anObject8 = Static399.method8034(local16);
		}
		if (Static488.anObject19 == null) {
			@Pc(27) Class45_Sub1_Sub2 local27 = new Class45_Sub1_Sub2();
			local16 = local27.method7185();
			Static488.anObject19 = Static399.method8034(local16);
		}
		@Pc(44) Class84 local44 = arg0.aClass84_1;
		if (local44.method2329() && Static489.anObject20 == null) {
			local16 = Static25.method968(new Class79_Sub1(419684), 4.0F, 4.0F, 0.5F, 0.6F, 16.0F);
			Static489.anObject20 = Static399.method8034(local16);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method3390() {
		Static468.method7221(Static122.aClass93_7);
		Static151.anInt3285++;
		if (Static107.aBoolean206 && Static545.aBoolean697) {
			@Pc(28) int local28 = Static401.aClass4_1.method1216();
			@Pc(32) int local32 = Static401.aClass4_1.method1215();
			local28 -= Static416.anInt7781;
			local32 -= Static323.anInt6113;
			if (local28 < Static87.anInt2163) {
				local28 = Static87.anInt2163;
			}
			if (Static116.anInt2579 > local32) {
				local32 = Static116.anInt2579;
			}
			if (Static87.anInt2163 + Static371.aClass93_12.anInt2777 < Static122.aClass93_7.anInt2777 + local28) {
				local28 = Static87.anInt2163 + Static371.aClass93_12.anInt2777 - Static122.aClass93_7.anInt2777;
			}
			if (Static116.anInt2579 + Static371.aClass93_12.anInt2738 < Static122.aClass93_7.anInt2738 + local32) {
				local32 = Static371.aClass93_12.anInt2738 + Static116.anInt2579 - Static122.aClass93_7.anInt2738;
			}
			@Pc(105) int local105 = Static371.aClass93_12.anInt2761 + local28 - Static87.anInt2163;
			@Pc(120) int local120 = Static371.aClass93_12.anInt2789 + local32 - Static116.anInt2579;
			@Pc(135) Class6_Sub38 local135;
			if (Static401.aClass4_1.method1209()) {
				if (Static122.aClass93_7.anInt2826 < Static151.anInt3285) {
					@Pc(207) int local207 = local28 - Static81.anInt1952;
					@Pc(212) int local212 = local32 - Static407.anInt1180;
					if (Static122.aClass93_7.anInt2780 < local207 || local207 < -Static122.aClass93_7.anInt2780 || Static122.aClass93_7.anInt2780 < local212 || local212 < -Static122.aClass93_7.anInt2780) {
						Static191.aBoolean330 = true;
					}
				}
				if (Static122.aClass93_7.anObjectArray26 != null && Static191.aBoolean330) {
					local135 = new Class6_Sub38();
					local135.anObjectArray36 = Static122.aClass93_7.anObjectArray26;
					local135.aClass93_14 = Static122.aClass93_7;
					local135.anInt7666 = local120;
					local135.anInt7664 = local105;
					Static89.method1979(local135);
				}
			} else {
				if (Static191.aBoolean330) {
					Static353.method5744();
					if (Static122.aClass93_7.anObjectArray11 != null) {
						local135 = new Class6_Sub38();
						local135.aClass93_13 = Static27.aClass93_1;
						local135.anInt7666 = local120;
						local135.anObjectArray36 = Static122.aClass93_7.anObjectArray11;
						local135.anInt7664 = local105;
						local135.aClass93_14 = Static122.aClass93_7;
						Static89.method1979(local135);
					}
					if (Static27.aClass93_1 != null && Static69.method1449(Static122.aClass93_7) != null) {
						Static159.method3022(Static27.aClass93_1, Static122.aClass93_7);
					}
				} else if ((Static37.anInt1211 == 1 || Static11.method625()) && Static205.anInt4369 > 2) {
					Static503.method7506(Static323.anInt6113 + Static407.anInt1180, Static81.anInt1952 + Static416.anInt7781);
				} else if (Static234.method4120()) {
					Static503.method7506(Static407.anInt1180 + Static323.anInt6113, Static416.anInt7781 - -Static81.anInt1952);
				}
				Static122.aClass93_7 = null;
			}
		} else if (Static151.anInt3285 > 1) {
			Static122.aClass93_7 = null;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method3393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 < 512 || arg3 < 512 || arg2 > (Static228.anInt4746 - 2) * 512 || (Static44.anInt1275 - 2) * 512 < arg3) {
			Static350.anIntArray431[0] = Static350.anIntArray431[1] = -1;
			return;
		}
		@Pc(48) int local48 = Static482.method7333(arg1, arg3, arg2) - arg4;
		Static19.aClass8_2.G(arg5, 0, 0);
		Static323.aClass9_8.method5429(Static19.aClass8_2);
		Static323.aClass9_8.na(arg2, local48, arg3, Static350.anIntArray431);
		Static19.aClass8_2.G(-arg5, 0, 0);
		Static323.aClass9_8.method5429(Static19.aClass8_2);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method3395() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static237.aClass61Array1[local3] = null;
		}
		Static127.anInt2829 = 0;
	}
}

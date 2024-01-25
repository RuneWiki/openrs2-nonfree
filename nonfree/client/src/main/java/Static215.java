import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!it", name = "l", descriptor = "[S")
	public static short[] aShortArray75;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "Lclient!so;")
	public static Class276 aClass276_1;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "J")
	public static final long aLong124 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!it", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray8 = new byte[250][];

	@OriginalMember(owner = "client!it", name = "g", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method3987(@OriginalArg(1) Class42 arg0) {
		@Pc(7) int local7 = Static301.anInt5821;
		@Pc(9) int local9 = Static105.anInt2405;
		@Pc(11) int local11 = Static253.anInt5213;
		@Pc(15) int local15 = Static298.anInt3270 - 3;
		if (Static294.aClass84_14 == null || Static419.aClass84_21 == null) {
			if (Static440.aClass16_103.method389(Static198.anInt4448) && Static440.aClass16_103.method389(Static466.anInt8512)) {
				Static294.aClass84_14 = arg0.method5839(Static550.method897(Static440.aClass16_103, Static198.anInt4448, 0));
				@Pc(61) Class40 local61 = Static550.method897(Static440.aClass16_103, Static466.anInt8512, 0);
				Static419.aClass84_21 = arg0.method5839(local61);
				local61.method900();
				Static466.aClass84_22 = arg0.method5839(local61);
			} else {
				arg0.f(local7, local9, local11, 20, 255 - Static429.anInt7958 << 24 | Static186.anInt4263, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static294.aClass84_14 != null && Static419.aClass84_21 != null) {
			local88 = (local11 - Static419.aClass84_21.c() * 2) / Static294.aClass84_14.c();
			for (local90 = 0; local90 < local88; local90++) {
				Static294.aClass84_14.method7487(local7 + Static419.aClass84_21.c() + local90 * Static294.aClass84_14.c(), local9);
			}
			Static419.aClass84_21.method7487(local7, local9);
			Static466.aClass84_22.method7487(local11 + local7 - Static466.aClass84_22.c(), local9);
		}
		Static12.aClass80_1.method7769(-1, local7 + 3, Static499.aClass88_266.method2391(Static345.anInt6495), local9 + 14, Static307.anInt5969 | 0xFF000000);
		arg0.f(local7, local9 + 20, local11, local15 - 20, Static186.anInt4263 | -Static429.anInt7958 + 255 << 24, 1);
		local88 = Static527.aClass6_1.method3754();
		local90 = Static527.aClass6_1.method3757();
		@Pc(173) int local173 = 0;
		@Pc(204) int local204;
		for (@Pc(186) Class12_Sub20 local186 = (Class12_Sub20) Static192.aClass73_33.method2005(); local186 != null; local186 = (Class12_Sub20) Static192.aClass73_33.method2009()) {
			local204 = (Static8.anInt118 - local173 - 1) * 16 + local9 + 33;
			local173++;
			if (local7 < local88 && local88 < local7 + local11 && local204 - 13 < local90 && local204 + 4 > local90 && local186.aBoolean345) {
				arg0.f(local7, local204 - 12, local11, 16, 255 - Static452.anInt8204 << 24 | Static472.anInt8659, 1);
			}
		}
		if ((Static294.aClass84_15 == null || Static387.aClass84_18 == null || Static406.aClass84_20 == null) && Static440.aClass16_103.method389(Static39.anInt791) && Static440.aClass16_103.method389(Static79.anInt1877) && Static440.aClass16_103.method389(Static69.anInt9147)) {
			@Pc(288) Class40 local288 = Static550.method897(Static440.aClass16_103, Static79.anInt1877, 0);
			Static387.aClass84_18 = arg0.method5839(local288);
			local288.method900();
			Static401.aClass84_19 = arg0.method5839(local288);
			Static294.aClass84_15 = arg0.method5839(Static550.method897(Static440.aClass16_103, Static39.anInt791, 0));
			@Pc(313) Class40 local313 = Static550.method897(Static440.aClass16_103, Static69.anInt9147, 0);
			Static406.aClass84_20 = arg0.method5839(local313);
			local313.method900();
			Static482.aClass84_23 = arg0.method5839(local313);
		}
		@Pc(380) int local380;
		@Pc(344) int local344;
		if (Static294.aClass84_15 != null && Static387.aClass84_18 != null && Static406.aClass84_20 != null) {
			local204 = (local11 - Static406.aClass84_20.c() * 2) / Static294.aClass84_15.c();
			for (local344 = 0; local344 < local204; local344++) {
				Static294.aClass84_15.method7487(local7 + Static406.aClass84_20.c() + Static294.aClass84_15.c() * local344, -Static294.aClass84_15.la() + local15 + local9);
			}
			local380 = (local15 - Static406.aClass84_20.la() - 20) / Static387.aClass84_18.la();
			for (@Pc(382) int local382 = 0; local382 < local380; local382++) {
				Static387.aClass84_18.method7487(local7, local382 * Static387.aClass84_18.la() + local9 + 20);
				Static401.aClass84_19.method7487(local7 + local11 - Static401.aClass84_19.c(), Static387.aClass84_18.la() * local382 + 20 + local9);
			}
			Static406.aClass84_20.method7487(local7, local9 + local15 - Static406.aClass84_20.la());
			Static482.aClass84_23.method7487(local7 + local11 - Static406.aClass84_20.c(), local15 + (local9 - Static406.aClass84_20.la()));
		}
		local173 = 0;
		for (@Pc(454) Class12_Sub20 local454 = (Class12_Sub20) Static192.aClass73_33.method2005(); local454 != null; local454 = (Class12_Sub20) Static192.aClass73_33.method2009()) {
			local344 = (Static8.anInt118 - local173 - 1) * 16 + local9 + 33;
			local380 = Static307.anInt5969 | 0xFF000000;
			if (local88 > local7 && local88 < local7 + local11 && local344 - 13 < local90 && local90 < local344 + 4 && local454.aBoolean345) {
				local380 = Static332.anInt6356 | 0xFF000000;
			}
			@Pc(507) int[] local507 = null;
			if (Static179.method3558(local454.anInt4329)) {
				local507 = Static150.aClass254_2.method6340((int) local454.aLong116).anIntArray174;
			} else if (local454.anInt4328 != -1) {
				local507 = Static150.aClass254_2.method6340(local454.anInt4328).anIntArray174;
			} else if (Static197.method3743(local454.anInt4329)) {
				@Pc(592) Class12_Sub41 local592 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local454.aLong116);
				if (local592 != null) {
					@Pc(597) Class30_Sub1_Sub1_Sub2 local597 = local592.aClass30_Sub1_Sub1_Sub2_2;
					@Pc(600) Class130 local600 = local597.aClass130_1;
					if (local600.anIntArray308 != null) {
						local600 = local600.method3570(Static393.aClass31_1);
					}
					if (local600 != null) {
						local507 = local600.anIntArray310;
					}
				}
			} else if (Static350.method5484(local454.anInt4329)) {
				@Pc(561) Class279 local561;
				if (local454.anInt4329 == 1008) {
					local561 = Static49.aClass155_2.method4063((int) local454.aLong116);
				} else {
					local561 = Static49.aClass155_2.method4063((int) (local454.aLong116 >>> 32 & 0x7FFFFFFFL));
				}
				if (local561.anIntArray620 != null) {
					local561 = local561.method6881(Static393.aClass31_1);
				}
				if (local561 != null) {
					local507 = local561.anIntArray621;
				}
			}
			@Pc(617) String local617 = Static329.method5245(local454);
			if (local507 != null) {
				local617 = local617 + Static169.method3401(local507);
			}
			Static12.aClass80_1.method7773(local380, local617, Static515.anIntArray677, local344, Static519.aClass84Array15, local7 + 3);
			local173++;
			if (local454.aBoolean346) {
				Static214.aClass84_10.method7487(Static445.aClass244_7.method6147(local617) + local7 + 5, local344 + -12);
			}
		}
		Static434.method6613(Static105.anInt2405, Static301.anInt5821, Static253.anInt5213, Static298.anInt3270);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!vf;)I")
	public static int method3988(@OriginalArg(1) Class302 arg0) {
		if (arg0 == Static159.aClass302_1) {
			return 5890;
		} else if (Static388.aClass302_3 == arg0) {
			return 34167;
		} else if (arg0 == Static499.aClass302_4) {
			return 34168;
		} else if (arg0 == Static371.aClass302_2) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}

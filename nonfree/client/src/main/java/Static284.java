import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
	public static int anInt6045;

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "Lclient!kb;")
	public static Class83 aClass83_197;

	@OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
	public static int anInt6051 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V")
	public static void method4680(@OriginalArg(0) int arg0) {
		Static201.method3583(Static201.anInt4495, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static201.method3576(-50.0F, -60.0F, -50.0F);
		Static201.method3579(Static201.anInt4492, 0, false);
		Static201.method3581();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
	public static void method4681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub6 local13 = Static104.method831(arg0, 1);
		local13.method1192();
		local13.anInt1565 = arg1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V")
	public static void method4682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg2 >= Static102.anInt2239 && arg3 + arg2 <= Static88.anInt2052 && Static152.anInt3532 <= arg1 - arg2 && Static223.anInt1245 >= arg1 + arg2) {
			Static289.method4726(arg3, arg1, arg0, arg2);
		} else {
			Static1.method59(arg3, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method4684(@OriginalArg(1) Class83 arg0) {
		Static228.aClass83_153 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V")
	public static void method4685() {
		for (@Pc(7) int local7 = 0; local7 < Static111.anInt2390; local7++) {
			@Pc(18) int local18 = Static95.anIntArray220[local7];
			@Pc(22) Class25_Sub1_Sub2 local22 = Static27.aClass25_Sub1_Sub2Array1[local18];
			@Pc(26) int local26 = Static222.aClass1_Sub16_Sub1_3.method2655();
			if ((local26 & 0x1) != 0) {
				local26 += Static222.aClass1_Sub16_Sub1_3.method2655() << 8;
			}
			if ((local26 & 0x200) != 0) {
				local22.anInt1623 = Static222.aClass1_Sub16_Sub1_3.method2650();
				local22.anInt1655 = Static222.aClass1_Sub16_Sub1_3.method2613();
			}
			@Pc(68) int local68;
			@Pc(80) int local80;
			if ((local26 & 0x2) != 0) {
				local68 = Static222.aClass1_Sub16_Sub1_3.method2650();
				if (local68 == 65535) {
					local68 = -1;
				}
				local80 = Static222.aClass1_Sub16_Sub1_3.method2655();
				Static13.method290(local80, local68, local22);
			}
			if ((local26 & 0x4) != 0) {
				local68 = Static222.aClass1_Sub16_Sub1_3.method2649();
				local80 = Static222.aClass1_Sub16_Sub1_3.method2653();
				local22.method1236(local80, local68, Static32.anInt809);
			}
			if ((local26 & 0x100) != 0) {
				local68 = Static222.aClass1_Sub16_Sub1_3.method2653();
				@Pc(120) int[] local120 = new int[local68];
				@Pc(123) int[] local123 = new int[local68];
				@Pc(126) int[] local126 = new int[local68];
				for (@Pc(128) int local128 = 0; local128 < local68; local128++) {
					@Pc(135) int local135 = Static222.aClass1_Sub16_Sub1_3.method2613();
					if (local135 == 65535) {
						local135 = -1;
					}
					local120[local128] = local135;
					local123[local128] = Static222.aClass1_Sub16_Sub1_3.method2663();
					local126[local128] = Static222.aClass1_Sub16_Sub1_3.method2613();
				}
				Static134.method2295(local120, local22, local123, local126);
			}
			if ((local26 & 0x80) != 0) {
				@Pc(172) boolean local172 = true;
				local68 = Static222.aClass1_Sub16_Sub1_3.method2652();
				if (local68 == 65535) {
					local68 = -1;
				}
				local80 = Static222.aClass1_Sub16_Sub1_3.method2610();
				if (local68 != -1 && local22.anInt1669 != -1 && Static115.method1895(Static43.method942(local68).anInt5107).anInt5905 < Static115.method1895(Static43.method942(local22.anInt1669).anInt5107).anInt5905) {
					local172 = false;
				}
				if (local172) {
					local22.anInt1645 = 0;
					local22.anInt1616 = 0;
					local22.anInt1660 = local80 >> 16;
					local22.anInt1605 = (local80 & 0xFFFF) + Static32.anInt809;
					local22.anInt1669 = local68;
					if (local22.anInt1605 > Static32.anInt809) {
						local22.anInt1616 = -1;
					}
					local22.anInt1671 = 1;
					if (local22.anInt1669 != -1 && local22.anInt1605 == Static32.anInt809) {
						@Pc(268) int local268 = Static43.method942(local22.anInt1669).anInt5107;
						if (local268 != -1) {
							@Pc(276) Class163 local276 = Static115.method1895(local268);
							if (local276 != null && local276.anIntArray587 != null) {
								Static188.method3369(local22.anInt1604, local276, 0, local22.anInt1635, false);
							}
						}
					}
				}
			}
			if ((local26 & 0x10) != 0) {
				local22.aString52 = Static222.aClass1_Sub16_Sub1_3.method2611();
				local22.anInt1675 = 100;
			}
			if ((local26 & 0x20) != 0) {
				local68 = Static222.aClass1_Sub16_Sub1_3.method2649();
				local80 = Static222.aClass1_Sub16_Sub1_3.method2653();
				local22.method1236(local80, local68, Static32.anInt809);
				local22.anInt1644 = Static32.anInt809 + 300;
				local22.anInt1682 = Static222.aClass1_Sub16_Sub1_3.method2655();
			}
			if ((local26 & 0x40) != 0) {
				if (local22.aClass143_1.method4068()) {
					Static289.method4725(local22);
				}
				local22.method1250(Static38.method880(Static222.aClass1_Sub16_Sub1_3.method2652()));
				local22.method1239(local22.aClass143_1.anInt5188);
				local22.anInt1615 = local22.aClass143_1.anInt5186;
				local22.anInt1642 = local22.aClass143_1.anInt5183;
				if (local22.aClass143_1.method4068()) {
					Static283.method4671(local22.anIntArray172[0], null, Static145.anInt3477, null, local22.anIntArray173[0], 0, local22);
				}
			}
			if ((local26 & 0x8) != 0) {
				local22.anInt1631 = Static222.aClass1_Sub16_Sub1_3.method2640();
				if (local22.anInt1631 == 65535) {
					local22.anInt1631 = -1;
				}
			}
		}
	}
}

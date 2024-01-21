import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_23;

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
	public static int anInt3764;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
	public static int anInt3757 = 0;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_13 = new Class13();

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
	public static int anInt3763 = -1;

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1334 = Static151.method2243("Untersuchen");

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method2590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = arg3 - arg0;
		@Pc(14) int local14 = arg4 - arg6;
		@Pc(31) int local31 = (arg5 - arg2 << 16) / local14;
		@Pc(40) int local40 = (arg1 - arg7 << 16) / local10;
		@Pc(54) boolean local54;
		if (Static167.anInt3570 > 0 && Static167.anInt3570 % 10 < 5) {
			local54 = true;
		} else {
			local54 = false;
		}
		@Pc(76) int local76;
		@Pc(81) int local81;
		@Pc(102) int local102;
		@Pc(118) int local118;
		@Pc(112) int local112;
		@Pc(162) int local162;
		@Pc(168) int local168;
		for (@Pc(60) int local60 = 0; local60 < local14; local60++) {
			@Pc(68) int local68 = local31 * local60 >> 16;
			local76 = local31 * (local60 + 1) >> 16;
			local81 = local76 - local68;
			if (local81 > 0) {
				@Pc(96) int[][] local96 = Static197.anIntArrayArrayArray10[local60 + arg6 >> 6];
				local68 += arg2;
				for (local102 = 0; local102 < local10; local102++) {
					local112 = local40 * (local102 + 1) >> 16;
					local118 = local40 * local102 >> 16;
					@Pc(123) int local123 = local112 - local118;
					if (local123 > 0) {
						local118 += arg7;
						@Pc(143) int local143 = local102 + arg0 >> 6;
						if (local96[local143] != null) {
							local162 = ((arg0 + local102 & 0x3F) << 6) + (arg6 + local60 & 0x3F);
							local168 = local96[local143][local162];
							if (local168 != 0) {
								@Pc(176) Class2_Sub1_Sub11 local176 = Static60.method844(local168 - 1);
								if (local54 && local176.anInt1557 == Static148.anInt3160) {
									@Pc(186) Class2_Sub14 local186 = new Class2_Sub14();
									local186.anInt2727 = local118;
									local186.anInt2733 = local68;
									local186.anInt2731 = local176.anInt1557;
									Static199.aClass13_18.method304(local186);
								}
								Static170.aClass2_Sub1_Sub2_Sub1Array1[local176.anInt1557].method280(local68 - 7, local118 + -7);
							}
						}
					}
				}
			}
		}
		if (Static136.aDouble113 == Static47.aDouble31) {
			for (@Pc(230) Class2_Sub10 local230 = (Class2_Sub10) Static125.aClass13_8.method303(); local230 != null; local230 = (Class2_Sub10) Static125.aClass13_8.method309()) {
				local76 = local230.anInt2040;
				local81 = local230.anInt2038;
				local112 = 16777215;
				local118 = local230.anInt2039;
				local76 -= Static24.anInt573;
				@Pc(249) Class66 local249 = null;
				@Pc(265) int local265 = (local76 - arg6) * (arg5 - arg2) / (arg4 - arg6) + arg2;
				local81 = Static104.anInt2340 + Static128.anInt142 - local81;
				local102 = arg7 + (local81 - arg0) * (arg1 - arg7) / (arg3 - arg0);
				if (local118 == 0) {
					if (Static136.aDouble113 == 3.0D) {
						local249 = Static144.aClass66_7;
					}
					if (Static136.aDouble113 == 4.0D) {
						local249 = Static124.aClass66_5;
					}
					if (Static136.aDouble113 == 6.0D) {
						local249 = Static138.aClass66_6;
					}
					if (Static136.aDouble113 == 8.0D) {
						local249 = Static74.aClass66_4;
					}
				}
				if (local118 == 1) {
					if (Static136.aDouble113 == 3.0D) {
						local249 = Static138.aClass66_6;
					}
					if (Static136.aDouble113 == 4.0D) {
						local249 = Static74.aClass66_4;
					}
					if (Static136.aDouble113 == 6.0D) {
						local249 = Static27.aClass66_2;
					}
					if (Static136.aDouble113 == 8.0D) {
						local249 = Static193.aClass66_8;
					}
				}
				if (local118 == 2) {
					if (Static136.aDouble113 == 3.0D) {
						local249 = Static27.aClass66_2;
					}
					local112 = 16755200;
					if (Static136.aDouble113 == 4.0D) {
						local249 = Static193.aClass66_8;
					}
					if (Static136.aDouble113 == 6.0D) {
						local249 = Static20.aClass66_1;
					}
					if (Static136.aDouble113 == 8.0D) {
						local249 = Static67.aClass66_3;
					}
				}
				if (local249 != null) {
					@Pc(377) Class62[] local377 = local230.aClass62Array63;
					local162 = local377.length;
					local102 -= (local162 - 1) * local249.method1988() / 2;
					local102 += local249.method1992() / 2;
					for (local168 = 0; local168 < local162; local168++) {
						local249.method1995(local377[local168], local265, local102, local112);
						local102 += local249.method1988();
					}
				}
			}
		}
		for (@Pc(436) Class2_Sub14 local436 = (Class2_Sub14) Static199.aClass13_18.method303(); local436 != null; local436 = (Class2_Sub14) Static199.aClass13_18.method309()) {
			Static170.aClass2_Sub1_Sub2_Sub1Array1[local436.anInt2731].method280(local436.anInt2733 - 7, local436.anInt2727 + -7);
			Static212.method3101(local436.anInt2733, local436.anInt2727, 15, 16776960, 128);
			Static212.method3101(local436.anInt2733, local436.anInt2727, 7, 16777215, 256);
		}
		Static199.aClass13_18.method314();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!pb;IB)Lclient!hh;")
	public static Class42 method2591(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		return Static39.method3119(arg1, arg0) ? Static32.method560() : null;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public static void method2592() {
		Static58.aClass2_Sub11_Sub1_2.method1595(68);
		for (@Pc(14) Class2_Sub7 local14 = (Class2_Sub7) Static49.aClass58_7.method1709(); local14 != null; local14 = (Class2_Sub7) Static49.aClass58_7.method1705()) {
			if (local14.anInt1409 == 0) {
				Static20.method371(local14, true);
			}
		}
		if (Static154.aClass47_14 != null) {
			Static165.method2410(Static154.aClass47_14);
			Static154.aClass47_14 = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII[B[Lclient!tf;)V")
	public static void method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) Class95[] arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (arg2 + local11 > 0 && local11 + arg2 < 103 && arg3 + local15 > 0 && local15 + arg3 < 103) {
						arg5[local7].anIntArrayArray35[local11 + arg2][arg3 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(88) Class2_Sub11 local88 = new Class2_Sub11(arg4);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
				for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
					Static83.method1177(0, arg2 + local98, arg0, arg1, local102 + arg3, local15, local88);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)J")
	public static long method2595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass100_1 == null ? 0L : local7.aClass100_1.aLong135;
	}
}

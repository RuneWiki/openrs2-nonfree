import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "F")
	public static float aFloat108;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
	public static int anInt7487;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_182 = new Class12(13, 6);

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_255 = new Class103(33, 8);

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[100];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!za;)V")
	public static void method5906(@OriginalArg(1) Class34 arg0) {
		@Pc(7) int local7 = Static129.anInt2365;
		@Pc(9) int local9 = Static187.anInt3228;
		@Pc(11) int local11 = Static413.anInt6778;
		@Pc(15) int local15 = Static387.anInt6440 - 3;
		if (Static340.aClass6_45 == null || Static3.aClass6_46 == null) {
			if (Static448.aClass82_104.method1820(Static84.anInt958) && Static448.aClass82_104.method1820(Static234.anInt4181)) {
				Static340.aClass6_45 = arg0.method5756(Static460.method1572(Static448.aClass82_104, Static84.anInt958, 0));
				@Pc(44) Class72 local44 = Static460.method1572(Static448.aClass82_104, Static234.anInt4181, 0);
				Static3.aClass6_46 = arg0.method5756(local44);
				local44.method1570();
				Static145.aClass6_19 = arg0.method5756(local44);
			} else {
				arg0.P(local7, local9, local11, 20, 255 - Static269.anInt4853 << 24 | Static367.anInt6204, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static340.aClass6_45 != null && Static3.aClass6_46 != null) {
			local88 = (local11 - Static3.aClass6_46.YA() * 2) / Static340.aClass6_45.YA();
			for (local90 = 0; local90 < local88; local90++) {
				Static340.aClass6_45.method5894(Static3.aClass6_46.YA() + local7 + local90 * Static340.aClass6_45.YA(), local9);
			}
			Static3.aClass6_46.method5894(local7, local9);
			Static145.aClass6_19.method5894(local11 + local7 - Static145.aClass6_19.YA(), local9);
		}
		Static121.aClass76_2.method4587(-1, local9 + 14, Static420.aClass119_169.method2673(Static394.anInt6582), Static210.anInt3772 | 0xFF000000, local7 + 3);
		arg0.P(local7, local9 + 20, local11, local15 - 20, Static367.anInt6204 | -Static269.anInt4853 + 255 << 24, 1);
		local88 = Static62.aClass96_1.method3872();
		local90 = Static62.aClass96_1.method3870();
		@Pc(173) int local173 = 0;
		@Pc(196) int local196;
		for (@Pc(178) Class1_Sub19 local178 = (Class1_Sub19) Static202.aClass227_21.method4967(); local178 != null; local178 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
			local196 = local9 + (-1 + Static118.anInt2201 + -local173) * 16 + 20 + 13;
			if (local7 < local88 && local7 + local11 > local88 && local196 - 13 < local90 && local90 < local196 + 4 && local178.aBoolean275) {
				arg0.P(local7, local196 - 12, local11, 16, Static287.anInt5030 | 255 - Static327.anInt5584 << 24, 1);
			}
			local173++;
		}
		if ((Static243.aClass6_39 == null || Static112.aClass6_21 == null || Static142.aClass6_28 == null) && Static448.aClass82_104.method1820(Static394.anInt6583) && Static448.aClass82_104.method1820(Static310.anInt5382) && Static448.aClass82_104.method1820(Static350.anInt6012)) {
			@Pc(287) Class72 local287 = Static460.method1572(Static448.aClass82_104, Static310.anInt5382, 0);
			Static112.aClass6_21 = arg0.method5756(local287);
			local287.method1570();
			Static138.aClass6_26 = arg0.method5756(local287);
			Static243.aClass6_39 = arg0.method5756(Static460.method1572(Static448.aClass82_104, Static394.anInt6583, 0));
			@Pc(312) Class72 local312 = Static460.method1572(Static448.aClass82_104, Static350.anInt6012, 0);
			Static142.aClass6_28 = arg0.method5756(local312);
			local312.method1570();
			Static196.aClass6_51 = arg0.method5756(local312);
		}
		@Pc(383) int local383;
		@Pc(343) int local343;
		if (Static243.aClass6_39 != null && Static112.aClass6_21 != null && Static142.aClass6_28 != null) {
			local196 = (local11 - Static142.aClass6_28.YA() * 2) / Static243.aClass6_39.YA();
			for (local343 = 0; local343 < local196; local343++) {
				Static243.aClass6_39.method5894(local7 + Static142.aClass6_28.YA() + Static243.aClass6_39.YA() * local343, local9 + local15 + -Static243.aClass6_39.ZA());
			}
			local383 = (local15 - Static142.aClass6_28.ZA() - 20) / Static112.aClass6_21.ZA();
			for (@Pc(385) int local385 = 0; local385 < local383; local385++) {
				Static112.aClass6_21.method5894(local7, local9 + Static112.aClass6_21.ZA() * local385 + 20);
				Static138.aClass6_26.method5894(local7 + local11 - Static138.aClass6_26.YA(), local9 + 20 + local385 * Static112.aClass6_21.ZA());
			}
			Static142.aClass6_28.method5894(local7, local15 + local9 - Static142.aClass6_28.ZA());
			Static196.aClass6_51.method5894(local7 + local11 - Static142.aClass6_28.YA(), local9 + (local15 - Static142.aClass6_28.ZA()));
		}
		local173 = 0;
		for (@Pc(451) Class1_Sub19 local451 = (Class1_Sub19) Static202.aClass227_21.method4967(); local451 != null; local451 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
			local343 = (Static118.anInt2201 - local173 - 1) * 16 + local9 + 20 + 13;
			local383 = Static210.anInt3772 | 0xFF000000;
			if (local7 < local88 && local7 + local11 > local88 && local90 > local343 - 13 && local90 < local343 + 4 && local451.aBoolean275) {
				local383 = Static238.anInt4348 | 0xFF000000;
			}
			@Pc(513) int[] local513 = null;
			if (Static348.method4710(local451.anInt2416)) {
				local513 = Static342.aClass155_2.method3548((int) local451.aLong74).anIntArray301;
			} else if (local451.anInt2417 != -1) {
				local513 = Static342.aClass155_2.method3548(local451.anInt2417).anIntArray301;
			} else if (Static133.method2050(local451.anInt2416)) {
				@Pc(533) Class25_Sub5_Sub1_Sub1 local533 = Static87.aClass25_Sub5_Sub1_Sub1Array6[(int) local451.aLong74];
				if (local533 != null) {
					@Pc(538) Class54 local538 = local533.aClass54_1;
					if (local538.anIntArray67 != null) {
						local538 = local538.method1148(Static320.aClass249_2);
					}
					if (local538 != null) {
						local513 = local538.anIntArray68;
					}
				}
			} else if (Static385.method5050(local451.anInt2416)) {
				@Pc(574) Class68 local574;
				if (local451.anInt2416 == 1002) {
					local574 = Static341.aClass75_4.method1616((int) local451.aLong74);
				} else {
					local574 = Static341.aClass75_4.method1616((int) (local451.aLong74 >>> 32 & 0x7FFFFFFFL));
				}
				if (local574.anIntArray125 != null) {
					local574 = local574.method1535(Static320.aClass249_2);
				}
				if (local574 != null) {
					local513 = local574.anIntArray126;
				}
			}
			@Pc(618) String local618 = Static170.method2397(local451);
			if (local513 != null) {
				local618 = local618 + Static434.method5716(local513);
			}
			Static121.aClass76_2.method4591(Static57.aClass6Array3, local7 + 3, local343, local618, Static299.anIntArray502, local383);
			local173++;
			if (local451.aBoolean274) {
				Static17.aClass6_5.method5894(Static451.aClass89_10.method1995(local618) + local7 + 5, local343 + -12);
			}
		}
		Static87.method5266(Static413.anInt6778, Static187.anInt3228, Static129.anInt2365, Static387.anInt6440);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!fo;)I")
	public static int method5907(@OriginalArg(1) Class82 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1820(Static408.anInt6717)) {
			local5++;
		}
		if (arg0.method1820(Static373.anInt6277)) {
			local5++;
		}
		if (arg0.method1820(Static261.anInt4687)) {
			local5++;
		}
		if (arg0.method1820(Static335.anInt5712)) {
			local5++;
		}
		if (arg0.method1820(Static277.anInt5516)) {
			local5++;
		}
		if (arg0.method1820(Static67.anInt1247)) {
			local5++;
		}
		if (arg0.method1820(Static21.anInt412)) {
			local5++;
		}
		if (arg0.method1820(Static282.anInt4972)) {
			local5++;
		}
		if (arg0.method1820(Static257.anInt4672)) {
			local5++;
		}
		if (arg0.method1820(Static71.anInt1312)) {
			local5++;
		}
		if (arg0.method1820(Static299.anInt7359)) {
			local5++;
		}
		if (arg0.method1820(Static444.anInt7377)) {
			local5++;
		}
		if (arg0.method1820(Static174.anInt2861)) {
			local5++;
		}
		if (arg0.method1820(Static158.anInt2207)) {
			local5++;
		}
		if (arg0.method1820(Static97.anInt1745)) {
			local5++;
		}
		if (arg0.method1820(Static337.anInt5761)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZ)V")
	public static void method5908(@OriginalArg(0) int arg0) {
		Static222.anInt3998 = -1;
		if (arg0 == 37) {
			Static167.aFloat23 = 3.0F;
		} else if (arg0 == 50) {
			Static167.aFloat23 = 4.0F;
		} else if (arg0 == 75) {
			Static167.aFloat23 = 6.0F;
		} else if (arg0 == 100) {
			Static167.aFloat23 = 8.0F;
		} else if (arg0 == 200) {
			Static167.aFloat23 = 16.0F;
		}
		Static222.anInt3998 = -1;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)Lclient!ew;")
	public static Class73 method5910(@OriginalArg(0) int arg0) {
		@Pc(12) Class73 local12 = (Class73) Static2.aClass102_1.method2258((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static261.aClass82_60.method1817(0, arg0);
		local12 = new Class73();
		if (local22 != null) {
			local12.method1587(new Class1_Sub28(local22));
		}
		local12.method1583();
		Static2.aClass102_1.method2272((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZIZLclient!dn;)V")
	public static void method5911(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class1_Sub14 arg2) {
		@Pc(13) int local13 = arg2.anInt1425;
		@Pc(17) int local17 = (int) arg2.aLong230;
		arg2.method5915();
		if (arg1) {
			Static453.method5913(local13);
		}
		Static134.method2069(local13);
		@Pc(32) Class124 local32 = Static412.method5315(local17);
		if (local32 != null) {
			Static160.method2323(local32);
		}
		Static166.method2383();
		if (!arg0 && Static207.anInt6026 != -1) {
			Static363.method4852(1, Static207.anInt6026);
		}
		@Pc(53) Class127 local53 = new Class127(Static94.aClass199_54);
		for (@Pc(58) Class1_Sub14 local58 = (Class1_Sub14) local53.method2836(); local58 != null; local58 = (Class1_Sub14) local53.method2834()) {
			if (!local58.method5914()) {
				local58 = (Class1_Sub14) local53.method2836();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt1427 == 3) {
				@Pc(82) int local82 = (int) local58.aLong230;
				if (local13 == local82 >>> 16) {
					method5911(arg0, true, local58);
				}
			}
		}
	}
}

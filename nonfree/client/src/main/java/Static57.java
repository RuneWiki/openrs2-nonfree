import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!na;")
	public static Class56 aClass56_21;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public static int anInt1439;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_16;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public static int anInt1440;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Lclient!pe;")
	public static Class65 aClass65_629 = Static119.method1462("");

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_624 = aClass65_629;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!pe;")
	public static Class65 aClass65_625 = Static119.method1462("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_626 = aClass65_629;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "Lclient!pe;")
	public static Class65 aClass65_627 = aClass65_629;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!pe;")
	private static Class65 aClass65_628 = Static119.method1462("You have only just left another world)3");

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Lclient!pe;")
	public static Class65 aClass65_630 = aClass65_628;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_631 = aClass65_629;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "Lclient!pe;")
	public static Class65 aClass65_632 = Static119.method1462("title)3jpg");

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!pe;")
	public static Class65 aClass65_633 = aClass65_629;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "Lclient!pe;")
	public static Class65 aClass65_634 = aClass65_629;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method1074() {
		while (true) {
			if (Static66.aClass2_Sub4_Sub1_2.method960(Static90.anInt1997) >= 27) {
				@Pc(18) int local18 = Static66.aClass2_Sub4_Sub1_2.method953(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local18] == null) {
						local25 = true;
						Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local18] = new Class2_Sub1_Sub1_Sub4_Sub2();
					}
					@Pc(41) Class2_Sub1_Sub1_Sub4_Sub2 local41 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local18];
					Static117.anIntArray340[Static110.anInt2469++] = local18;
					local41.anInt1969 = Static10.anInt2951;
					@Pc(57) int local57 = Static66.aClass2_Sub4_Sub1_2.method953(5);
					if (local57 > 15) {
						local57 -= 32;
					}
					@Pc(68) int local68 = Static66.aClass2_Sub4_Sub1_2.method953(1);
					local41.aClass2_Sub1_Sub12_1 = Static116.method1856(Static66.aClass2_Sub4_Sub1_2.method953(14));
					@Pc(81) int local81 = Static66.aClass2_Sub4_Sub1_2.method953(5);
					@Pc(86) int local86 = Static66.aClass2_Sub4_Sub1_2.method953(1);
					if (local81 > 15) {
						local81 -= 32;
					}
					if (local86 == 1) {
						Static68.anIntArray376[Static33.anInt761++] = local18;
					}
					@Pc(112) int local112 = Static32.anIntArray97[Static66.aClass2_Sub4_Sub1_2.method953(3)];
					local41.anInt1959 = local41.aClass2_Sub1_Sub12_1.anInt2147;
					if (local25) {
						local41.anInt1962 = local41.anInt1965 = local112;
					}
					local41.anInt1917 = local41.aClass2_Sub1_Sub12_1.anInt2125;
					local41.anInt1930 = local41.aClass2_Sub1_Sub12_1.anInt2119;
					local41.anInt1932 = local41.aClass2_Sub1_Sub12_1.anInt2149;
					if (local41.anInt1930 == 0) {
						local41.anInt1965 = 0;
					}
					local41.anInt1931 = local41.aClass2_Sub1_Sub12_1.anInt2126;
					local41.anInt1923 = local41.aClass2_Sub1_Sub12_1.anInt2145;
					local41.anInt1960 = local41.aClass2_Sub1_Sub12_1.anInt2136;
					local41.anInt1964 = local41.aClass2_Sub1_Sub12_1.anInt2127;
					local41.anInt1929 = local41.aClass2_Sub1_Sub12_1.anInt2142;
					local41.method1468(local68 == 1, local81 + Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], local57 + Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0]);
					continue;
				}
			}
			Static66.aClass2_Sub4_Sub1_2.method963();
			return;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)V")
	public static void method1075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static49.aClass2_Sub4_Sub1_1.method962(68);
		Static49.aClass2_Sub4_Sub1_1.method909(arg0);
		Static49.aClass2_Sub4_Sub1_1.method937(arg1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!pe;Lclient!na;Lclient!pe;ZLclient!na;)Lclient!wf;")
	public static Class2_Sub1_Sub4_Sub3_Sub1 method1076(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(4) Class56 arg3) {
		@Pc(8) int local8 = arg1.method1690(arg2);
		@Pc(19) int local19 = arg1.method1667(arg0, local8);
		return Static103.method1704(local19, local8, arg1, arg3);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V")
	public static void method1077(@OriginalArg(0) boolean arg0) {
		if (Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948 >> 7 == Static72.anInt1648 && Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958 >> 7 == Static120.anInt2599) {
			Static72.anInt1648 = 0;
		}
		@Pc(25) int local25 = Static35.anInt795;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(37) Class2_Sub1_Sub1_Sub4_Sub1 local37;
			@Pc(39) int local39;
			if (arg0) {
				local37 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1;
				local39 = 33538048;
			} else {
				local39 = Static76.anIntArray223[local31] << 14;
				local37 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static76.anIntArray223[local31]];
			}
			if (local37 != null && local37.method1466()) {
				@Pc(64) int local64 = local37.anInt1948 >> 7;
				local37.aBoolean42 = false;
				if ((Static48.aBoolean47 && Static35.anInt795 > 50 || Static35.anInt795 > 200) && !arg0 && local37.anInt1920 == local37.anInt1964) {
					local37.aBoolean42 = true;
				}
				@Pc(96) int local96 = local37.anInt1958 >> 7;
				if (local64 >= 0 && local64 < 104 && local96 >= 0 && local96 < 104) {
					if (local37.aClass2_Sub1_Sub1_Sub7_1 == null || local37.anInt1023 > Static10.anInt2951 || local37.anInt1029 <= Static10.anInt2951) {
						if ((local37.anInt1948 & 0x7F) == 64 && (local37.anInt1958 & 0x7F) == 64) {
							if (Static77.anInt1714 == Static50.anIntArrayArray12[local64][local96]) {
								continue;
							}
							Static50.anIntArrayArray12[local64][local96] = Static77.anInt1714;
						}
						local37.anInt1028 = Static106.method1718(local37.anInt1958, local37.anInt1948, Static59.anInt1479);
						Static124.aClass49_1.method1158(Static59.anInt1479, local37.anInt1948, local37.anInt1958, local37.anInt1028, 60, local37, local37.anInt1965, local39, local37.aBoolean78);
					} else {
						local37.aBoolean42 = false;
						local37.anInt1028 = Static106.method1718(local37.anInt1958, local37.anInt1948, Static59.anInt1479);
						Static124.aClass49_1.method1190(Static59.anInt1479, local37.anInt1948, local37.anInt1958, local37.anInt1028, local37, local37.anInt1965, local39, local37.anInt1021, local37.anInt1015, local37.anInt1033, local37.anInt1032);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
	public static void method1078(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			for (local16 = 0; local16 < 8; local16++) {
				Static67.anIntArrayArrayArray8[arg0][arg2 + local12][arg1 + local16] = 0;
			}
		}
		if (arg2 > 0) {
			for (local16 = 1; local16 < 8; local16++) {
				Static67.anIntArrayArrayArray8[arg0][arg2][arg1 + local16] = Static67.anIntArrayArrayArray8[arg0][arg2 - 1][arg1 + local16];
			}
		}
		if (arg1 > 0) {
			for (local16 = 1; local16 < 8; local16++) {
				Static67.anIntArrayArrayArray8[arg0][local16 + arg2][arg1] = Static67.anIntArrayArrayArray8[arg0][arg2 + local16][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static67.anIntArrayArrayArray8[arg0][arg2 - 1][arg1] != 0) {
			Static67.anIntArrayArrayArray8[arg0][arg2][arg1] = Static67.anIntArrayArrayArray8[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static67.anIntArrayArrayArray8[arg0][arg2][arg1 - 1] != 0) {
			Static67.anIntArrayArrayArray8[arg0][arg2][arg1] = Static67.anIntArrayArrayArray8[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static67.anIntArrayArrayArray8[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static67.anIntArrayArrayArray8[arg0][arg2][arg1] = Static67.anIntArrayArrayArray8[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public static void method1079() {
		aClass65_625 = null;
		aClass65_630 = null;
		aClass65_627 = null;
		aClass65_628 = null;
		aClass65_629 = null;
		aClass56_Sub1_16 = null;
		aClass65_632 = null;
		aClass65_626 = null;
		aClass65_633 = null;
		aClass65_624 = null;
		aClass56_21 = null;
		aClass65_631 = null;
		aClass65_634 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZJ)Lclient!pe;")
	public static Class65 method1080(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(42) byte[] local42 = new byte[local27];
			while (arg0 != 0L) {
				@Pc(45) long local45 = arg0;
				arg0 /= 37L;
				local27--;
				local42[local27] = Static50.aByteArray19[(int) (local45 - arg0 * 37L)];
			}
			@Pc(72) Class65 local72 = new Class65();
			local72.aByteArray27 = local42;
			local72.anInt2005 = local42.length;
			return local72;
		}
	}
}

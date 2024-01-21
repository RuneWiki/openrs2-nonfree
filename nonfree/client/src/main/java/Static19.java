import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!db", name = "fb", descriptor = "Lclient!ta;")
	public static Class14 aClass14_38;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1431 = Static14.method2017("Classic");

	@OriginalMember(owner = "client!db", name = "V", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1429 = aClass36_1431;

	@OriginalMember(owner = "client!db", name = "X", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1430 = Static14.method2017("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
	public static int anInt2912 = 0;

	@OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
	public static int anInt2917 = 0;

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1432 = Static14.method2017("::qa_op_test");

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
	public static int anInt2918 = 0;

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1433 = Static14.method2017("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!db", name = "lb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1434 = Static14.method2017("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!db", name = "nb", descriptor = "[I")
	public static int[] anIntArray347 = new int[1000];

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public static void method2026() {
		aClass36_1430 = null;
		aClass36_1433 = null;
		aClass36_1429 = null;
		aClass36_1434 = null;
		anIntArray347 = null;
		aClass36_1431 = null;
		aClass14_38 = null;
		aClass36_1432 = null;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
	public static void method2027() {
		if (Static35.aBoolean51 && Static14.anInt2900 != Static92.anInt2412) {
			Static16.method293(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0], Static22.anInt578, Static71.anInt1804, Static92.anInt2412);
		} else if (Static47.anInt1242 != Static92.anInt2412) {
			Static47.anInt1242 = Static92.anInt2412;
			Static36.method736(Static92.anInt2412);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!hd;II)V")
	public static void method2028(@OriginalArg(0) Class2_Sub1_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static24.method518(arg1, arg0.anInt2204, arg0.anInt2149);
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
	public static void method2030() {
		for (@Pc(15) int local15 = 0; local15 < Static55.anInt2714; local15++) {
			@Pc(21) int local21 = Static115.anIntArray225[local15];
			@Pc(25) Class2_Sub1_Sub4_Sub2_Sub1 local25 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local21];
			@Pc(29) int local29 = Static92.aClass2_Sub12_Sub1_3.method1399();
			@Pc(40) int local40;
			@Pc(44) int local44;
			if ((local29 & 0x20) != 0) {
				local40 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local44 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local25.method1550(Static113.anInt2952, local40, local44);
				local25.anInt2159 = Static113.anInt2952 + 300;
				local25.anInt2184 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local25.anInt2187 = Static92.aClass2_Sub12_Sub1_3.method1382();
			}
			if ((local29 & 0x40) != 0) {
				local25.anInt2157 = Static92.aClass2_Sub12_Sub1_3.method1378();
				if (local25.anInt2157 == 65535) {
					local25.anInt2157 = -1;
				}
			}
			if ((local29 & 0x8) != 0) {
				local25.aClass36_1023 = Static92.aClass2_Sub12_Sub1_3.method1404();
				local25.anInt2197 = 100;
			}
			if ((local29 & 0x2) != 0) {
				local40 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local44 = Static92.aClass2_Sub12_Sub1_3.method1382();
				local25.method1550(Static113.anInt2952, local40, local44);
				local25.anInt2159 = Static113.anInt2952 + 300;
				local25.anInt2184 = Static92.aClass2_Sub12_Sub1_3.method1391();
				local25.anInt2187 = Static92.aClass2_Sub12_Sub1_3.method1388();
			}
			if ((local29 & 0x4) != 0) {
				local40 = Static92.aClass2_Sub12_Sub1_3.method1413();
				if (local40 == 65535) {
					local40 = -1;
				}
				local44 = Static92.aClass2_Sub12_Sub1_3.method1382();
				if (local25.anInt2168 == local40 && local40 != -1) {
					@Pc(201) int local201 = Static56.method1045(local40).anInt2406;
					if (local201 == 1) {
						local25.anInt2147 = 0;
						local25.anInt2198 = 0;
						local25.anInt2196 = 0;
						local25.anInt2162 = local44;
					}
					if (local201 == 2) {
						local25.anInt2198 = 0;
					}
				} else if (local40 == -1 || local25.anInt2168 == -1 || Static56.method1045(local40).anInt2395 >= Static56.method1045(local25.anInt2168).anInt2395) {
					local25.anInt2192 = local25.anInt2158;
					local25.anInt2196 = 0;
					local25.anInt2162 = local44;
					local25.anInt2198 = 0;
					local25.anInt2147 = 0;
					local25.anInt2168 = local40;
				}
			}
			if ((local29 & 0x10) != 0) {
				local25.anInt2152 = Static92.aClass2_Sub12_Sub1_3.method1401();
				local40 = Static92.aClass2_Sub12_Sub1_3.method1412();
				local25.anInt2173 = (local40 & 0xFFFF) + Static113.anInt2952;
				if (local25.anInt2152 == 65535) {
					local25.anInt2152 = -1;
				}
				local25.anInt2178 = local40 >> 16;
				local25.anInt2205 = 0;
				local25.anInt2151 = 0;
				if (Static113.anInt2952 < local25.anInt2173) {
					local25.anInt2151 = -1;
				}
			}
			if ((local29 & 0x1) != 0) {
				local25.aClass2_Sub1_Sub9_1 = Static49.method953(Static92.aClass2_Sub12_Sub1_3.method1413());
				local25.anInt2195 = local25.aClass2_Sub1_Sub9_1.anInt1525;
				local25.anInt2161 = local25.aClass2_Sub1_Sub9_1.anInt1547;
				local25.anInt2179 = local25.aClass2_Sub1_Sub9_1.anInt1537;
				local25.anInt2172 = local25.aClass2_Sub1_Sub9_1.anInt1531;
				local25.anInt2171 = local25.aClass2_Sub1_Sub9_1.anInt1544;
				local25.anInt2185 = local25.aClass2_Sub1_Sub9_1.anInt1532;
				local25.anInt2163 = local25.aClass2_Sub1_Sub9_1.anInt1528;
				local25.anInt2200 = local25.aClass2_Sub1_Sub9_1.anInt1543;
				local25.anInt2155 = local25.aClass2_Sub1_Sub9_1.anInt1545;
			}
			if ((local29 & 0x80) != 0) {
				local25.anInt2194 = Static92.aClass2_Sub12_Sub1_3.method1401();
				local25.anInt2175 = Static92.aClass2_Sub12_Sub1_3.method1401();
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIB[Lclient!ed;III)V")
	public static void method2032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class2_Sub1_Sub6[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(11) int local11 = 0; local11 < arg5.length; local11++) {
			@Pc(17) Class2_Sub1_Sub6 local17 = arg5[local11];
			if (local17 != null && (local17.anInt676 == 0 || local17.aBoolean34) && local17 != null && arg6 == local17.anInt669 && !Static81.method1492(local17)) {
				@Pc(48) int local48 = arg4 + local17.anInt685 - arg3;
				@Pc(56) int local56 = local17.anInt722 + arg7 - arg2;
				@Pc(61) int local61 = local17.anInt677 + local56;
				@Pc(67) int local67 = local48 + local17.anInt660;
				@Pc(78) int local78 = arg7 < local56 ? local56 : arg7;
				@Pc(89) int local89 = arg4 >= local48 ? arg4 : local48;
				@Pc(100) int local100 = local61 >= arg0 ? arg0 : local61;
				@Pc(107) int local107 = arg8 <= local67 ? arg8 : local67;
				if (local17.anInt676 == 0) {
					method2032(local100, arg1, local17.anInt675, local17.anInt716, local89, arg5, local17.anInt680, local78, local107);
					if (local17.aClass2_Sub1_Sub6Array1 != null) {
						method2032(local100, arg1, local17.anInt675, local17.anInt716, local89, local17.aClass2_Sub1_Sub6Array1, local17.anInt680, local78, local107);
					}
				}
				if (local17.aBoolean34) {
					@Pc(163) boolean local163;
					if (local78 <= Static115.anInt1789 && Static64.anInt1640 >= local89 && Static115.anInt1789 < local100 && Static64.anInt1640 < local107) {
						local163 = true;
					} else {
						local163 = false;
					}
					@Pc(169) boolean local169 = false;
					@Pc(171) boolean local171 = false;
					if (Static73.anInt1843 == 1 && local163) {
						local171 = true;
					}
					if (Static95.anInt2522 == 1 && Static59.anInt1578 >= local78 && Static90.anInt2349 >= local89 && Static59.anInt1578 < local100 && local107 > Static90.anInt2349) {
						local169 = true;
					}
					if (local169 && Static24.aClass2_Sub1_Sub6_1 == null && (arg1 & 0x200) != 0 && !Static73.aBoolean82 && Static9.method205(local17) != null) {
						Static107.anInt2749 = Static115.anInt1789;
						Static60.anInt1600 = Static64.anInt1640;
						Static49.anInt1311 = 0;
						Static24.aClass2_Sub1_Sub6_1 = local17;
						Static71.aBoolean79 = false;
					}
					if (Static24.aClass2_Sub1_Sub6_1 != null || Static73.aBoolean82) {
						local163 = false;
						local169 = false;
						local171 = false;
					}
					if (!local17.aBoolean30 && local169 && (arg1 & 0x1) != 0) {
						local17.aBoolean30 = true;
						if (local17.anObjectArray8 != null) {
							Static92.method1684(local17, local17.anObjectArray8, Static59.anInt1578 - local56, 0, Static90.anInt2349 - local48, null);
						}
					}
					if (local17.aBoolean30 && local171 && (arg1 & 0x4) != 0 && local17.anObjectArray6 != null) {
						Static92.method1684(local17, local17.anObjectArray6, Static115.anInt1789 - local56, 0, Static64.anInt1640 - local48, null);
					}
					if (local17.aBoolean30 && !local171 && (arg1 & 0x2) != 0) {
						local17.aBoolean30 = false;
						if (local17.anObjectArray13 != null) {
							Static92.method1684(local17, local17.anObjectArray13, Static115.anInt1789 - local56, 0, Static64.anInt1640 - local48, null);
						}
					}
					if (local171 && (arg1 & 0x8) != 0 && local17.anObjectArray5 != null) {
						Static92.method1684(local17, local17.anObjectArray5, Static115.anInt1789 - local56, 0, Static64.anInt1640 - local48, null);
					}
					if (!local17.aBoolean28 && local163 && (arg1 & 0x10) != 0) {
						local17.aBoolean28 = true;
						if (local17.anObjectArray9 != null) {
							Static92.method1684(local17, local17.anObjectArray9, Static115.anInt1789 - local56, 0, Static64.anInt1640 - local48, null);
						}
					}
					if (local17.aBoolean28 && local163 && (arg1 & 0x40) != 0 && local17.anObjectArray10 != null) {
						Static92.method1684(local17, local17.anObjectArray10, Static115.anInt1789 - local56, 0, Static64.anInt1640 - local48, null);
					}
					if (local17.aBoolean28 && !local163 && (arg1 & 0x20) != 0) {
						local17.aBoolean28 = false;
						if (local17.anObjectArray14 != null) {
							Static92.method1684(local17, local17.anObjectArray14, Static115.anInt1789 - local56, 0, Static64.anInt1640 - local48, null);
						}
					}
					if (local17.anObjectArray4 != null && (arg1 & 0x80) != 0) {
						Static92.method1684(local17, local17.anObjectArray4, 0, 0, 0, null);
					}
					if (local163 && Static1.anInt6 != 0 && local17.anObjectArray17 != null && (arg1 & 0x400) != 0) {
						Static92.method1684(local17, local17.anObjectArray17, 0, 0, Static1.anInt6, null);
					}
					if ((arg1 & 0x100) != 0) {
						if (local17.anInt662 < Static73.anInt1839 && local17.anObjectArray11 != null) {
							Static92.method1684(local17, local17.anObjectArray11, 0, 0, 0, null);
						}
						if (Static71.anInt1803 > local17.anInt662 && local17.anObjectArray19 != null) {
							Static92.method1684(local17, local17.anObjectArray19, 0, 0, 0, null);
						}
						if (Static92.anInt2396 > local17.anInt662 && local17.anObjectArray1 != null) {
							Static92.method1684(local17, local17.anObjectArray1, 0, 0, 0, null);
						}
						local17.anInt662 = Static113.anInt2952;
					}
				}
			}
		}
	}
}

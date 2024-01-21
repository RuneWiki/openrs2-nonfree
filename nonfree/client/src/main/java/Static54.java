import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ja", name = "Gb", descriptor = "Lclient!cc;")
	public static Class2_Sub2_Sub1_Sub3 aClass2_Sub2_Sub1_Sub3_7;

	@OriginalMember(owner = "client!ja", name = "Qb", descriptor = "I")
	public static int anInt1335;

	@OriginalMember(owner = "client!ja", name = "mb", descriptor = "I")
	public static int anInt1314 = 0;

	@OriginalMember(owner = "client!ja", name = "nb", descriptor = "Lclient!u;")
	public static Class74 aClass74_934 = Static72.method1077(")1");

	@OriginalMember(owner = "client!ja", name = "tb", descriptor = "Lclient!u;")
	private static Class74 aClass74_935 = Static72.method1077("Too many connections from your address)3");

	@OriginalMember(owner = "client!ja", name = "vb", descriptor = "I")
	public static int anInt1321 = 0;

	@OriginalMember(owner = "client!ja", name = "wb", descriptor = "Lclient!u;")
	public static Class74 aClass74_936 = aClass74_935;

	@OriginalMember(owner = "client!ja", name = "Ab", descriptor = "I")
	public static int anInt1325 = 0;

	@OriginalMember(owner = "client!ja", name = "Cb", descriptor = "I")
	public static int anInt1326 = 0;

	@OriginalMember(owner = "client!ja", name = "Eb", descriptor = "Lclient!u;")
	public static Class74 aClass74_937 = Static72.method1077(")3runescape)3com");

	@OriginalMember(owner = "client!ja", name = "Hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_938 = Static72.method1077("Ausw-=hlen");

	@OriginalMember(owner = "client!ja", name = "Mb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ja", name = "Nb", descriptor = "I")
	public static int anInt1332 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!g;Lclient!g;ZI)V")
	public static void method914(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) boolean arg2) {
		Static112.aClass26_29 = arg0;
		Static75.aClass26_17 = arg1;
		Static32.aBoolean28 = arg2;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
	public static void method916() {
		@Pc(19) int local19;
		for (@Pc(12) int local12 = -1; local12 < Static10.anInt320; local12++) {
			if (local12 == -1) {
				local19 = 2047;
			} else {
				local19 = Static92.anIntArray267[local12];
			}
			@Pc(29) Class2_Sub2_Sub2_Sub1_Sub2 local29 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local19];
			if (local29 != null && local29.anInt2687 > 0) {
				local29.anInt2687--;
				if (local29.anInt2687 == 0) {
					local29.aClass74_1657 = null;
				}
			}
		}
		for (local19 = 0; local19 < Static29.anInt686; local19++) {
			@Pc(58) int local58 = Static40.anIntArray110[local19];
			@Pc(62) Class2_Sub2_Sub2_Sub1_Sub1 local62 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local58];
			if (local62 != null && local62.anInt2687 > 0) {
				local62.anInt2687--;
				if (local62.anInt2687 == 0) {
					local62.aClass74_1657 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
	public static void method917() {
		Static31.method574();
		Static79.aBoolean71 = true;
		Static53.method891();
		if (Static29.aBoolean25) {
			aClass2_Sub2_Sub1_Sub3_7.method314(Static97.aClass74_1726, 239, 40, 0);
			aClass2_Sub2_Sub1_Sub3_7.method314(Static91.method1340(new Class74[] { Static97.aClass74_1733, Static93.aClass74_1332 }), 239, 60, 128);
		} else if (Static36.anInt869 == 1) {
			aClass2_Sub2_Sub1_Sub3_7.method314(Static9.aClass74_220, 239, 40, 0);
			aClass2_Sub2_Sub1_Sub3_7.method314(Static91.method1340(new Class74[] { Static97.aClass74_1724, Static93.aClass74_1332 }), 239, 60, 128);
		} else if (Static36.anInt869 == 2) {
			aClass2_Sub2_Sub1_Sub3_7.method314(Static105.aClass74_1488, 239, 40, 0);
			aClass2_Sub2_Sub1_Sub3_7.method314(Static91.method1340(new Class74[] { Static97.aClass74_1724, Static93.aClass74_1332 }), 239, 60, 128);
		} else {
			@Pc(92) Class2_Sub2_Sub1_Sub3 local92;
			@Pc(94) int local94;
			@Pc(101) int local101;
			if (Static36.anInt869 == 3) {
				if (Static97.aClass74_1724 != Static97.aClass74_1725) {
					Static125.method1886(Static97.aClass74_1724);
					Static97.aClass74_1725 = Static97.aClass74_1724;
				}
				local92 = Static77.aClass2_Sub2_Sub1_Sub3_9;
				Static58.method711(0, 0, 463, 77);
				for (local94 = 0; local94 < Static65.anInt1449; local94++) {
					local101 = local94 * 14 + 18 - Static127.anInt2880;
					if (local101 > 0 && local101 < 110) {
						local92.method314(Static126.aClass74Array20[local94], 239, local101, 0);
					}
				}
				Static58.method699();
				if (Static65.anInt1449 > 5) {
					Static19.method422(463, 0, Static65.anInt1449 * 14 + 7, Static127.anInt2880, 77);
				}
				if (Static97.aClass74_1724.method1695() == 0) {
					aClass2_Sub2_Sub1_Sub3_7.method314(Static25.aClass74_517, 239, 40, 255);
				} else if (Static65.anInt1449 == 0) {
					aClass2_Sub2_Sub1_Sub3_7.method314(Static97.aClass74_1723, 239, 40, 0);
				}
				local92.method314(Static91.method1340(new Class74[] { Static97.aClass74_1724, Static93.aClass74_1332 }), 239, 90, 0);
				Static58.method706(0, 77, 479, 0);
			} else if (Static36.anInt869 == 4) {
				aClass2_Sub2_Sub1_Sub3_7.method314(Static97.aClass74_1732, 239, 40, 0);
				aClass2_Sub2_Sub1_Sub3_7.method314(Static91.method1340(new Class74[] { Static97.aClass74_1724, Static93.aClass74_1332 }), 239, 60, 128);
			} else if (Static16.aClass74_411 == null) {
				@Pc(693) boolean local693;
				if (Static42.anInt982 != -1) {
					local693 = Static85.method1295(2, 96, 479, Static42.anInt982);
					if (!local693) {
						Static55.aBoolean16 = true;
					}
				} else if (Static83.anInt1804 == -1) {
					local92 = Static77.aClass2_Sub2_Sub1_Sub3_9;
					local94 = 0;
					Static58.method711(0, 0, 463, 77);
					for (local101 = 0; local101 < 100; local101++) {
						if (Static106.aClass74Array17[local101] != null) {
							@Pc(111) int local111 = Static100.anIntArray314[local101];
							@Pc(120) int local120 = Static46.anInt1055 + 70 - local94 * 14;
							@Pc(122) byte local122 = 0;
							@Pc(126) Class74 local126 = Static20.aClass74Array3[local101];
							if (local126 != null && local126.method1719(Static48.aClass74_838)) {
								local126 = local126.method1697(5);
								local122 = 1;
							}
							if (local126 != null && local126.method1719(Static21.aClass74_474)) {
								local122 = 2;
								local126 = local126.method1697(5);
							}
							if (local111 == 0) {
								local94++;
								if (local120 > 0 && local120 < 110) {
									local92.method308(Static106.aClass74Array17[local101], 4, local120, 0);
								}
							}
							@Pc(205) int local205;
							if ((local111 == 1 || local111 == 2) && (local111 == 1 || Static65.anInt1443 == 0 || Static65.anInt1443 == 1 && Static7.method1864(local126))) {
								if (local120 > 0 && local120 < 110) {
									local205 = 4;
									if (local122 == 1) {
										Static34.aClass2_Sub2_Sub1_Sub1Array2[0].method97(4, local120 - 12);
										local205 += 14;
									}
									if (local122 == 2) {
										Static34.aClass2_Sub2_Sub1_Sub1Array2[1].method97(local205, local120 - 12);
										local205 += 14;
									}
									local92.method308(Static91.method1340(new Class74[] { local126, Static119.aClass74_1590 }), local205, local120, 0);
									local205 += local92.method302(local126) + 8;
									local92.method308(Static106.aClass74Array17[local101], local205, local120, 255);
								}
								local94++;
							}
							if ((local111 == 3 || local111 == 7) && anInt1314 == 0 && (local111 == 7 || Static41.anInt964 == 0 || Static41.anInt964 == 1 && Static7.method1864(local126))) {
								if (local120 > 0 && local120 < 110) {
									local92.method308(Static15.aClass74_408, 4, local120, 0);
									local205 = local92.method302(Static15.aClass74_408) + 4;
									local205 += local92.method310(32);
									if (local122 == 1) {
										Static34.aClass2_Sub2_Sub1_Sub1Array2[0].method97(local205, local120 - 12);
										local205 += 14;
									}
									if (local122 == 2) {
										Static34.aClass2_Sub2_Sub1_Sub1Array2[1].method97(local205, local120 - 12);
										local205 += 14;
									}
									local92.method308(Static91.method1340(new Class74[] { local126, Static119.aClass74_1590 }), local205, local120, 0);
									local205 += local92.method302(local126) + 8;
									local92.method308(Static106.aClass74Array17[local101], local205, local120, 8388608);
								}
								local94++;
							}
							if (local111 == 4 && (Static107.anInt2345 == 0 || Static107.anInt2345 == 1 && Static7.method1864(local126))) {
								local94++;
								if (local120 > 0 && local120 < 110) {
									local92.method308(Static91.method1340(new Class74[] { local126, Static1.aClass74_1397, Static106.aClass74Array17[local101] }), 4, local120, 8388736);
								}
							}
							if (local111 == 5 && anInt1314 == 0 && Static41.anInt964 < 2) {
								local94++;
								if (local120 > 0 && local120 < 110) {
									local92.method308(Static106.aClass74Array17[local101], 4, local120, 8388608);
								}
							}
							if (local111 == 6 && anInt1314 == 0 && Static41.anInt964 < 2) {
								local94++;
								if (local120 > 0 && local120 < 110) {
									local92.method308(Static91.method1340(new Class74[] { Static68.aClass74_1053, Static1.aClass74_1397, local126, Static119.aClass74_1590 }), 4, local120, 0);
									local92.method308(Static106.aClass74Array17[local101], local92.method302(Static91.method1340(new Class74[] { Static68.aClass74_1053, Static1.aClass74_1397, local126 })) + 12, local120, 8388608);
								}
							}
							if (local111 == 8 && (Static107.anInt2345 == 0 || Static107.anInt2345 == 1 && Static7.method1864(local126))) {
								if (local120 > 0 && local120 < 110) {
									local92.method308(Static91.method1340(new Class74[] { local126, Static1.aClass74_1397, Static106.aClass74Array17[local101] }), 4, local120, 8270336);
								}
								local94++;
							}
						}
					}
					Static58.method699();
					Static21.anInt616 = local94 * 14 + 7;
					if (Static21.anInt616 < 78) {
						Static21.anInt616 = 78;
					}
					Static19.method422(463, 0, Static21.anInt616, Static21.anInt616 - Static46.anInt1055 - 77, 77);
					@Pc(617) Class74 local617;
					if (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1 == null || Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass74_1661 == null) {
						local617 = Static49.aClass74_842;
					} else {
						local617 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass74_1661;
					}
					local92.method308(Static91.method1340(new Class74[] { local617, Static119.aClass74_1590 }), 4, 90, 0);
					local92.method308(Static91.method1340(new Class74[] { Static97.aClass74_1737, Static93.aClass74_1332 }), local92.method302(Static91.method1340(new Class74[] { local617, Static2.aClass74_31 })) + 6, 90, 255);
					Static58.method706(0, 77, 479, 0);
				} else {
					local693 = Static85.method1295(3, 96, 479, Static83.anInt1804);
					if (!local693) {
						Static55.aBoolean16 = true;
					}
				}
			} else {
				aClass2_Sub2_Sub1_Sub3_7.method311(Static16.aClass74_411, 10, 20, 459, 40, 0, false, 1, 1, 0);
				aClass2_Sub2_Sub1_Sub3_7.method314(Static2.aClass74_24, 239, 80, 128);
			}
		}
		if (Static109.aBoolean103 && Static78.anInt1701 == 2) {
			Static52.method877();
		}
		Static51.method1479();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BZ)V")
	public static void method918(@OriginalArg(1) boolean arg0) {
		Static31.method574();
		Static19.anInt573++;
		if (Static19.anInt573 < 50 && !arg0) {
			return;
		}
		Static19.anInt573 = 0;
		if (Static42.aBoolean37 || Static88.aClass62_4 == null) {
			return;
		}
		Static128.aClass2_Sub10_Sub1_3.method1533(119);
		try {
			Static88.aClass62_4.method1343(Static128.aClass2_Sub10_Sub1_3.anInt2187, Static128.aClass2_Sub10_Sub1_3.aByteArray27);
			Static128.aClass2_Sub10_Sub1_3.anInt2187 = 0;
		} catch (@Pc(50) IOException local50) {
			Static42.aBoolean37 = true;
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
	public static void method919() {
		aClass74_937 = null;
		aClass2_Sub2_Sub1_Sub3_7 = null;
		aCRC32_2 = null;
		aClass74_936 = null;
		aClass74_935 = null;
		aClass74_938 = null;
		aClass74_934 = null;
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
	public static void method920() {
		if (Static39.aClass42_1 != null) {
			@Pc(7) Class42 local7 = Static39.aClass42_1;
			synchronized (Static39.aClass42_1) {
				Static39.aClass42_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "(I)V")
	public static void method921() {
		if (Static112.aClass65_1 != null) {
			@Pc(3) Class65 local3 = Static112.aClass65_1;
			synchronized (Static112.aClass65_1) {
				Static112.aClass65_1 = null;
			}
		}
	}
}

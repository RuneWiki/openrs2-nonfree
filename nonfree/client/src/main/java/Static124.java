import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_11;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!wa;")
	public static Class87 aClass87_9 = null;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!ai;")
	private static Class6 aClass6_834 = Static38.method685("The server is being updated)3");

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "[I")
	public static int[] anIntArray251 = new int[256];

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!ai;")
	public static Class6 aClass6_835 = Static38.method685("::");

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Lclient!ai;")
	public static Class6 aClass6_836 = Static38.method685("welle:");

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "Lclient!ai;")
	public static Class6 aClass6_837 = Static38.method685("Ausw-=hlen");

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!ai;")
	public static Class6 aClass6_838 = aClass6_834;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
	public static void method1930(@OriginalArg(0) boolean arg0) {
		Static58.method957();
		Static180.anInt4187++;
		if (Static180.anInt4187 < 50 && !arg0) {
			return;
		}
		Static180.anInt4187 = 0;
		if (Static155.aBoolean160 || Static166.aClass43_3 == null) {
			return;
		}
		Static66.aClass2_Sub13_Sub1_2.method1455(87);
		try {
			Static166.aClass43_3.method1241(Static66.aClass2_Sub13_Sub1_2.anInt2154, Static66.aClass2_Sub13_Sub1_2.aByteArray14);
			Static66.aClass2_Sub13_Sub1_2.anInt2154 = 0;
		} catch (@Pc(43) IOException local43) {
			Static155.aBoolean160 = true;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)Z")
	public static boolean method1931(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method1932() {
		aClass6_834 = null;
		aClass6_836 = null;
		aClass6_835 = null;
		aClass6_837 = null;
		anIntArray251 = null;
		aClass87_9 = null;
		aClass6_838 = null;
		aClass10_Sub1_11 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
	public static boolean method1933(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)Z")
	public static boolean method1934() {
		@Pc(8) long local8 = Static70.method1106();
		@Pc(14) int local14 = (int) (local8 - Static87.aLong128);
		if (local14 > 200) {
			local14 = 200;
		}
		Static87.aLong128 = local8;
		Static103.anInt2519 += local14;
		if (Static166.anInt3915 == 0 && Static161.anInt3790 == 0 && Static89.anInt2267 == 0 && Static77.anInt1912 == 0) {
			return true;
		} else if (Static16.aClass43_1 == null) {
			return false;
		} else {
			try {
				if (Static103.anInt2519 > 30000) {
					throw new IOException();
				}
				@Pc(69) Class2_Sub3_Sub18 local69;
				@Pc(74) Class2_Sub13 local74;
				while (Static161.anInt3790 < 20 && Static77.anInt1912 > 0) {
					local69 = (Class2_Sub3_Sub18) Static158.aClass16_12.method478();
					local74 = new Class2_Sub13(4);
					local74.method1416(1);
					local74.method1440((int) local69.aLong241);
					Static16.aClass43_1.method1241(4, local74.aByteArray14);
					Static153.aClass16_11.method480(local69, local69.aLong241);
					Static77.anInt1912--;
					Static161.anInt3790++;
				}
				while (Static166.anInt3915 < 20 && Static89.anInt2267 > 0) {
					local69 = (Class2_Sub3_Sub18) Static36.aClass60_2.method1862();
					local74 = new Class2_Sub13(4);
					local74.method1416(0);
					local74.method1440((int) local69.aLong241);
					Static16.aClass43_1.method1241(4, local74.aByteArray14);
					local69.method2725();
					Static85.aClass16_5.method480(local69, local69.aLong241);
					Static166.anInt3915++;
					Static89.anInt2267--;
				}
				for (@Pc(165) int local165 = 0; local165 < 100; local165++) {
					@Pc(171) int local171 = Static16.aClass43_1.method1235();
					if (local171 < 0) {
						throw new IOException();
					}
					if (local171 == 0) {
						break;
					}
					Static103.anInt2519 = 0;
					@Pc(186) byte local186 = 0;
					if (Static139.aClass2_Sub3_Sub18_1 == null) {
						local186 = 8;
					} else if (Static59.anInt1515 == 0) {
						local186 = 1;
					}
					@Pc(207) int local207;
					@Pc(227) int local227;
					@Pc(278) int local278;
					@Pc(293) int local293;
					if (local186 > 0) {
						local207 = local186 - Static25.aClass2_Sub13_1.anInt2154;
						if (local207 > local171) {
							local207 = local171;
						}
						Static16.aClass43_1.method1240(local207, Static25.aClass2_Sub13_1.aByteArray14, Static25.aClass2_Sub13_1.anInt2154);
						if (Static111.aByte5 != 0) {
							for (local227 = 0; local227 < local207; local227++) {
								Static25.aClass2_Sub13_1.aByteArray14[Static25.aClass2_Sub13_1.anInt2154 + local227] = (byte) (Static25.aClass2_Sub13_1.aByteArray14[Static25.aClass2_Sub13_1.anInt2154 + local227] ^ Static111.aByte5);
							}
						}
						Static25.aClass2_Sub13_1.anInt2154 += local207;
						if (local186 > Static25.aClass2_Sub13_1.anInt2154) {
							break;
						}
						if (Static139.aClass2_Sub3_Sub18_1 == null) {
							Static25.aClass2_Sub13_1.anInt2154 = 0;
							local227 = Static25.aClass2_Sub13_1.method1402();
							local278 = Static25.aClass2_Sub13_1.method1397();
							@Pc(285) long local285 = (long) ((local227 << 16) + local278);
							@Pc(289) int local289 = Static25.aClass2_Sub13_1.method1402();
							local293 = Static25.aClass2_Sub13_1.method1396();
							@Pc(299) Class2_Sub3_Sub18 local299 = (Class2_Sub3_Sub18) Static153.aClass16_11.method479(local285);
							Static96.aBoolean92 = true;
							if (local299 == null) {
								local299 = (Class2_Sub3_Sub18) Static85.aClass16_5.method479(local285);
								Static96.aBoolean92 = false;
							}
							if (local299 == null) {
								throw new IOException();
							}
							Static139.aClass2_Sub3_Sub18_1 = local299;
							@Pc(325) int local325 = local289 == 0 ? 5 : 9;
							Static88.aClass2_Sub13_3 = new Class2_Sub13(Static139.aClass2_Sub3_Sub18_1.aByte9 + local293 + local325);
							Static88.aClass2_Sub13_3.method1416(local289);
							Static88.aClass2_Sub13_3.method1421(local293);
							Static59.anInt1515 = 8;
							Static25.aClass2_Sub13_1.anInt2154 = 0;
						} else if (Static59.anInt1515 == 0) {
							if (Static25.aClass2_Sub13_1.aByteArray14[0] == -1) {
								Static59.anInt1515 = 1;
								Static25.aClass2_Sub13_1.anInt2154 = 0;
							} else {
								Static139.aClass2_Sub3_Sub18_1 = null;
							}
						}
					} else {
						local207 = Static88.aClass2_Sub13_3.aByteArray14.length - Static139.aClass2_Sub3_Sub18_1.aByte9;
						local227 = 512 - Static59.anInt1515;
						if (local227 > local207 - Static88.aClass2_Sub13_3.anInt2154) {
							local227 = local207 - Static88.aClass2_Sub13_3.anInt2154;
						}
						if (local171 < local227) {
							local227 = local171;
						}
						Static16.aClass43_1.method1240(local227, Static88.aClass2_Sub13_3.aByteArray14, Static88.aClass2_Sub13_3.anInt2154);
						if (Static111.aByte5 != 0) {
							for (local278 = 0; local278 < local227; local278++) {
								Static88.aClass2_Sub13_3.aByteArray14[local278 + Static88.aClass2_Sub13_3.anInt2154] ^= Static111.aByte5;
							}
						}
						Static88.aClass2_Sub13_3.anInt2154 += local227;
						Static59.anInt1515 += local227;
						if (Static88.aClass2_Sub13_3.anInt2154 == local207) {
							if (Static139.aClass2_Sub3_Sub18_1.aLong241 == 16711935L) {
								Static104.aClass2_Sub13_4 = Static88.aClass2_Sub13_3;
								for (local278 = 0; local278 < 256; local278++) {
									@Pc(475) Class10_Sub1 local475 = Static2.aClass10_Sub1Array1[local278];
									if (local475 != null) {
										Static104.aClass2_Sub13_4.anInt2154 = local278 * 8 + 5;
										local293 = Static104.aClass2_Sub13_4.method1396();
										@Pc(492) int local492 = Static104.aClass2_Sub13_4.method1396();
										local475.method1611(local293, local492);
									}
								}
							} else {
								Static33.aCRC32_1.reset();
								Static33.aCRC32_1.update(Static88.aClass2_Sub13_3.aByteArray14, 0, local207);
								local278 = (int) Static33.aCRC32_1.getValue();
								if (local278 != Static139.aClass2_Sub3_Sub18_1.anInt4039) {
									try {
										Static16.aClass43_1.method1236();
									} catch (@Pc(526) Exception local526) {
									}
									Static38.anInt1090++;
									Static111.aByte5 = (byte) (Math.random() * 255.0D + 1.0D);
									Static16.aClass43_1 = null;
									return false;
								}
								Static55.anInt1442 = 0;
								Static38.anInt1090 = 0;
								Static139.aClass2_Sub3_Sub18_1.aClass10_Sub1_19.method1614(Static88.aClass2_Sub13_3.aByteArray14, Static96.aBoolean92, (Static139.aClass2_Sub3_Sub18_1.aLong241 & 0xFF0000L) == 16711680L, (int) (Static139.aClass2_Sub3_Sub18_1.aLong241 & 0xFFFFL));
							}
							Static139.aClass2_Sub3_Sub18_1.method2808();
							if (Static96.aBoolean92) {
								Static161.anInt3790--;
							} else {
								Static166.anInt3915--;
							}
							Static139.aClass2_Sub3_Sub18_1 = null;
							Static59.anInt1515 = 0;
							Static88.aClass2_Sub13_3 = null;
						} else {
							if (Static59.anInt1515 != 512) {
								break;
							}
							Static59.anInt1515 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(608) IOException local608) {
				try {
					Static16.aClass43_1.method1236();
				} catch (@Pc(615) Exception local615) {
				}
				Static16.aClass43_1 = null;
				Static55.anInt1442++;
				return false;
			}
		}
	}
}

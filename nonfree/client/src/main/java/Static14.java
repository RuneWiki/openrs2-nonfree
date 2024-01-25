import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "o", descriptor = "Lclient!qs;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!an", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "I")
	public static int anInt338 = -1;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_3 = new Class84("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!an", name = "r", descriptor = "I")
	public static int anInt344 = 0;

	@OriginalMember(owner = "client!an", name = "u", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_3 = new Class266();

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I[B)Z")
	public static boolean method303(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class1_Sub1 local15 = new Class1_Sub1(arg0);
		@Pc(19) int local19 = local15.method4130();
		if (local19 != 1) {
			return false;
		}
		@Pc(35) boolean local35 = local15.method4130() == 1;
		if (local35) {
			Static286.method4046(local15);
		}
		Static201.method3118(local15);
		return true;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
	public static void method304() {
		Static448.aClass219ArrayArray2 = new Class219[Static136.aClass250_26.method5666()][];
		Static346.aClass219ArrayArray1 = new Class219[Static136.aClass250_26.method5666()][];
		Static164.aBooleanArray22 = new boolean[Static136.aClass250_26.method5666()];
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)I")
	public static int method305() {
		return Static381.anInt5294;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!a;IZ)V")
	public static void method306(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(19) boolean local19 = arg0.method146(1) == 1;
		if (local19) {
			Static160.anIntArray258[Static119.anInt7597++] = arg1;
		}
		@Pc(34) int local34 = arg0.method146(2);
		@Pc(38) Class26_Sub2_Sub2_Sub1 local38 = Static311.aClass26_Sub2_Sub2_Sub1Array1[arg1];
		if (local34 != 0) {
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(159) int local159;
			if (local34 == 1) {
				local149 = arg0.method146(3);
				local154 = local38.anIntArray590[0];
				local159 = local38.anIntArray589[0];
				if (local149 == 0) {
					local154--;
					local159--;
				} else if (local149 == 1) {
					local159--;
				} else if (local149 == 2) {
					local154++;
					local159--;
				} else if (local149 == 3) {
					local154--;
				} else if (local149 == 4) {
					local154++;
				} else if (local149 == 5) {
					local159++;
					local154--;
				} else if (local149 == 6) {
					local159++;
				} else if (local149 == 7) {
					local159++;
					local154++;
				}
				if (local19) {
					local38.aBoolean434 = true;
					local38.anInt6650 = local159;
					local38.anInt6656 = local154;
				} else {
					local38.method5255(local159, local154, Static444.aByteArray87[arg1]);
				}
			} else if (local34 == 2) {
				local149 = arg0.method146(4);
				local154 = local38.anIntArray590[0];
				local159 = local38.anIntArray589[0];
				if (local149 == 0) {
					local154 -= 2;
					local159 -= 2;
				} else if (local149 == 1) {
					local154--;
					local159 -= 2;
				} else if (local149 == 2) {
					local159 -= 2;
				} else if (local149 == 3) {
					local159 -= 2;
					local154++;
				} else if (local149 == 4) {
					local159 -= 2;
					local154 += 2;
				} else if (local149 == 5) {
					local154 -= 2;
					local159--;
				} else if (local149 == 6) {
					local154 += 2;
					local159--;
				} else if (local149 == 7) {
					local154 -= 2;
				} else if (local149 == 8) {
					local154 += 2;
				} else if (local149 == 9) {
					local154 -= 2;
					local159++;
				} else if (local149 == 10) {
					local154 += 2;
					local159++;
				} else if (local149 == 11) {
					local159 += 2;
					local154 -= 2;
				} else if (local149 == 12) {
					local159 += 2;
					local154--;
				} else if (local149 == 13) {
					local159 += 2;
				} else if (local149 == 14) {
					local154++;
					local159 += 2;
				} else if (local149 == 15) {
					local159 += 2;
					local154 += 2;
				}
				if (local19) {
					local38.aBoolean434 = true;
					local38.anInt6650 = local159;
					local38.anInt6656 = local154;
				} else {
					local38.method5255(local159, local154, Static444.aByteArray87[arg1]);
				}
			} else {
				local149 = arg0.method146(1);
				@Pc(422) int local422;
				@Pc(432) int local432;
				@Pc(443) int local443;
				@Pc(450) int local450;
				if (local149 == 0) {
					local154 = arg0.method146(12);
					local159 = local154 >> 10;
					local422 = local154 >> 5 & 0x1F;
					if (local422 > 15) {
						local422 -= 32;
					}
					local432 = local154 & 0x1F;
					if (local432 > 15) {
						local432 -= 32;
					}
					local443 = local422 + local38.anIntArray590[0];
					local450 = local432 + local38.anIntArray589[0];
					if (local19) {
						local38.aBoolean434 = true;
						local38.anInt6650 = local450;
						local38.anInt6656 = local443;
					} else {
						local38.method5255(local450, local443, Static444.aByteArray87[arg1]);
					}
					local38.aByte95 = (byte) (local38.aByte95 + local159 & 0x3);
					if (Static453.anInt7845 == arg1) {
						Static152.anInt2600 = local38.aByte95;
					}
				} else {
					local154 = arg0.method146(30);
					local159 = local154 >> 28;
					local422 = local154 >> 14 & 0x3FFF;
					local432 = local154 & 0x3FFF;
					local443 = (local422 + Static437.anInt7555 + local38.anIntArray590[0] & 0x3FFF) - Static437.anInt7555;
					local450 = (local432 + local38.anIntArray589[0] + Static134.anInt5502 & 0x3FFF) - Static134.anInt5502;
					if (local19) {
						local38.aBoolean434 = true;
						local38.anInt6650 = local450;
						local38.anInt6656 = local443;
					} else {
						local38.method5255(local450, local443, Static444.aByteArray87[arg1]);
					}
					local38.aByte95 = (byte) (local38.aByte95 + local159 & 0x3);
					if (Static453.anInt7845 == arg1) {
						Static152.anInt2600 = local38.aByte95;
					}
				}
			}
		} else if (local19) {
			local38.aBoolean434 = false;
		} else if (arg1 == Static453.anInt7845) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(65) Class174 local65 = Static455.aClass174Array3[arg1] = new Class174();
			local65.anInt4946 = (Static134.anInt5502 + local38.anIntArray589[0] >> 6) + (Static437.anInt7555 + local38.anIntArray590[0] >> 6 << 14) + (local38.aByte95 << 28);
			if (local38.anInt6644 == -1) {
				local65.anInt4948 = local38.aClass255_7.method5749();
			} else {
				local65.anInt4948 = local38.anInt6644;
			}
			local65.aBoolean330 = local38.aBoolean432;
			local65.anInt4949 = local38.anInt7090;
			if (local38.anInt6627 > 0) {
				Static378.method5173(local38);
			}
			Static311.aClass26_Sub2_Sub2_Sub1Array1[arg1] = null;
			if (arg0.method146(1) != 0) {
				Static313.method4476(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z[[BLclient!mi;)V")
	public static void method307(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class155_Sub1 arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.anInt4453; local8++) {
			Static81.method1403();
			for (@Pc(14) int local14 = 0; local14 < Static135.anInt2314 >> 3; local14++) {
				for (@Pc(18) int local18 = 0; local18 < Static352.anInt6022 >> 3; local18++) {
					@Pc(28) int local28 = Static257.anIntArrayArrayArray13[local8][local14][local18];
					if (local28 != -1) {
						@Pc(38) int local38 = local28 >> 24 & 0x3;
						if (!arg1.aBoolean304 || local38 == 0) {
							@Pc(52) int local52 = local28 >> 1 & 0x3;
							@Pc(58) int local58 = local28 >> 14 & 0x3FF;
							@Pc(64) int local64 = local28 >> 3 & 0x7FF;
							@Pc(74) int local74 = local64 / 8 + (local58 / 8 << 8);
							for (@Pc(76) int local76 = 0; local76 < Static157.anIntArray255.length; local76++) {
								if (Static157.anIntArray255[local76] == local74 && arg0[local76] != null) {
									arg1.method3663(local38, arg0[local76], local18 * 8, local8, (local64 & 0x7) * 8, local14 * 8, Static276.aClass109_10, local52, Static170.aClass112Array1, (local58 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}

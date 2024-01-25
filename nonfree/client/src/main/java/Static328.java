import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!np", name = "f", descriptor = "Lclient!im;")
	public static final Class140 aClass140_89 = new Class140(10, -1);

	@OriginalMember(owner = "client!np", name = "i", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_72 = new Class306("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

	@OriginalMember(owner = "client!np", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString55 = "";

	@OriginalMember(owner = "client!np", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean432 = true;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZZZ)V")
	public static void method5044(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static452.anInt7735--;
			if (Static452.anInt7735 == 0) {
				Static212.anIntArray347 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static467.anInt7880--;
		if (Static467.anInt7880 == 0) {
			Static488.anIntArray759 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public static void method5045() {
		if (Static544.aClass1_Sub22_Sub1_1.method4661(Static374.anInt6861) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static45.anInt915 - 4 & 0xFF);
		@Pc(25) int local25 = Static45.anInt915 % Static459.anInt7799;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (@Pc(31) int local31 = 0; local31 < Static482.anInt7990; local31++) {
				Static406.aByteArrayArrayArray15[local27][local25][local31] = local21;
			}
		}
		if (Static501.anInt8491 == 3) {
			return;
		}
		for (@Pc(65) int local65 = 0; local65 < 2; local65++) {
			Static220.anIntArray429[local65] = -1000000;
			Static238.anIntArray611[local65] = 1000000;
			client.lb[local65] = 0;
			Static383.anIntArray578[local65] = 1000000;
			Static306.anIntArray564[local65] = 0;
		}
		@Pc(137) int local137;
		if (Static448.anInt7701 != 1) {
			local137 = Static38.method884(Static501.anInt8491, Static522.anInt8770, Static516.anInt8682);
			if (local137 - Static504.anInt8519 >= 3200 || (Static530.aByteArrayArrayArray17[Static501.anInt8491][Static522.anInt8770 >> 9][Static516.anInt8682 >> 9] & 0x4) == 0) {
				return;
			}
			Static451.method6569(Static522.anInt8770 >> 9, 1, Static516.anInt8682 >> 9, false, Static242.aClass255ArrayArrayArray2);
			return;
		}
		if ((Static530.aByteArrayArrayArray17[Static501.anInt8491][Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 >> 9][Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 >> 9] & 0x4) != 0) {
			Static451.method6569(Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 >> 9, 0, Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 >> 9, false, Static242.aClass255ArrayArrayArray2);
		}
		if (Static381.anInt6946 >= 2560) {
			return;
		}
		local137 = Static522.anInt8770 >> 9;
		@Pc(141) int local141 = Static516.anInt8682 >> 9;
		@Pc(146) int local146 = Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 >> 9;
		@Pc(151) int local151 = Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 >> 9;
		@Pc(163) int local163;
		if (local137 >= local146) {
			local163 = local137 - local146;
		} else {
			local163 = local146 - local137;
		}
		@Pc(180) int local180;
		if (local151 <= local141) {
			local180 = local141 - local151;
		} else {
			local180 = local151 - local141;
		}
		if ((local163 != 0 || local180 != 0) && -Static459.anInt7799 < local163 && Static459.anInt7799 > local163 && local180 > -Static482.anInt7990 && local180 < Static482.anInt7990) {
			@Pc(257) int local257;
			@Pc(259) int local259;
			if (local163 > local180) {
				local257 = local180 * 65536 / local163;
				local259 = 32768;
				while (local137 != local146) {
					if (local137 < local146) {
						local137++;
					} else if (local146 < local137) {
						local137--;
					}
					if ((Static530.aByteArrayArrayArray17[Static501.anInt8491][local137][local141] & 0x4) != 0) {
						Static451.method6569(local137, 1, local141, false, Static242.aClass255ArrayArrayArray2);
						return;
					}
					local259 += local257;
					if (local259 >= 65536) {
						if (local141 < local151) {
							local141++;
						} else if (local141 > local151) {
							local141--;
						}
						local259 -= 65536;
						if ((Static530.aByteArrayArrayArray17[Static501.anInt8491][local137][local141] & 0x4) != 0) {
							Static451.method6569(local137, 1, local141, false, Static242.aClass255ArrayArrayArray2);
							return;
						}
					}
				}
				return;
			}
			local257 = local163 * 65536 / local180;
			local259 = 32768;
			while (local141 != local151) {
				if (local141 < local151) {
					local141++;
				} else if (local141 > local151) {
					local141--;
				}
				if ((Static530.aByteArrayArrayArray17[Static501.anInt8491][local137][local141] & 0x4) != 0) {
					Static451.method6569(local137, 1, local141, false, Static242.aClass255ArrayArrayArray2);
					return;
				}
				local259 += local257;
				if (local259 >= 65536) {
					local259 -= 65536;
					if (local137 < local146) {
						local137++;
					} else if (local137 > local146) {
						local137--;
					}
					if ((Static530.aByteArrayArrayArray17[Static501.anInt8491][local137][local141] & 0x4) != 0) {
						Static451.method6569(local137, 1, local141, false, Static242.aClass255ArrayArrayArray2);
						return;
					}
				}
			}
			return;
		}
		Static234.method4051(null, "RC: " + local137 + "," + local141 + " " + local146 + "," + local151 + " " + Static470.anInt7897 + "," + Static534.anInt9007);
		return;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZII)Z")
	public static boolean method5046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method5048(@OriginalArg(1) String arg0) {
		return Static362.method5397(arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!kr;)V")
	public static void method5050(@OriginalArg(1) Class171 arg0) {
		Static244.aClass171_79 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)I")
	public static int method5051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return local11 + (arg0 + (arg0 >>> 31)) % arg1;
	}
}

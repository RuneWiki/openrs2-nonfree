import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_173 = new Class119("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public static void method5684() {
		if (!Static433.aBoolean798) {
			return;
		}
		@Pc(16) Class124 local16 = Static334.method4492(Static331.anInt5639, Static353.anInt6050);
		if (local16 != null && local16.anObjectArray32 != null) {
			@Pc(25) Class1_Sub40 local25 = new Class1_Sub40();
			local25.aClass124_14 = local16;
			local25.anObjectArray36 = local16.anObjectArray32;
			Static298.method4076(local25);
		}
		Static257.anInt4671 = -1;
		Static433.aBoolean798 = false;
		Static33.anInt530 = -1;
		if (local16 != null) {
			Static160.method2323(local16);
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)Z")
	public static boolean method5685() {
		try {
			return Static171.method5260();
		} catch (@Pc(14) IOException local14) {
			Static34.method490();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(81) String local81 = "T2 - " + (Static371.aClass12_160 == null ? -1 : Static371.aClass12_160.method231()) + "," + (Static114.aClass12_56 == null ? -1 : Static114.aClass12_56.method231()) + "," + (Static148.aClass12_78 == null ? -1 : Static148.aClass12_78.method231()) + " - " + Static245.anInt4432 + "," + (Static199.anInt3480 + Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray283[0]) + "," + (Static164.anInt2731 + Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray284[0]) + " - ";
			for (@Pc(83) int local83 = 0; local83 < Static245.anInt4432 && local83 < 50; local83++) {
				local81 = local81 + Static336.aClass1_Sub28_Sub1_2.aByteArray86[local83] + ",";
			}
			Static55.method972(local19, local81);
			Static368.method4884(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)I")
	public static int method5692(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(31) double local31 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local14 > local31) {
			local40 = local31;
		}
		if (local38 < local40) {
			local40 = local38;
		}
		@Pc(54) double local54 = local14;
		if (local31 > local14) {
			local54 = local31;
		}
		if (local38 > local54) {
			local54 = local38;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local54 + local40) / 2.0D;
		if (local54 != local40) {
			if (local76 < 0.5D) {
				local70 = (local54 - local40) / (local54 + local40);
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local40) / (2.0D - local40 - local54);
			}
			if (local54 == local14) {
				local68 = (local31 - local38) / (local54 - local40);
			} else if (local31 == local54) {
				local68 = (local38 - local14) / (local54 - local40) + 2.0D;
			} else if (local38 == local54) {
				local68 = (local14 - local31) / (-local40 + local54) + 4.0D;
			}
		}
		local68 /= 6.0D;
		@Pc(165) int local165 = (int) (local68 * 256.0D);
		@Pc(170) int local170 = (int) (local70 * 256.0D);
		@Pc(175) int local175 = (int) (local76 * 256.0D);
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local175 < 0) {
			local175 = 0;
		} else if (local175 > 255) {
			local175 = 255;
		}
		if (local175 > 243) {
			local170 >>= 0x4;
		} else if (local175 > 217) {
			local170 >>= 0x3;
		} else if (local175 > 192) {
			local170 >>= 0x2;
		} else if (local175 > 179) {
			local170 >>= 0x1;
		}
		return (local175 >> 1) + ((local165 & 0xFF) >> 2 << 10) + (local170 >> 5 << 7);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
	public static void method5693(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg0, 1);
		local8.method2667();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method5697(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static104.aClass82_24.anInt2180 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static342.aClass155_2.anInt4483; local18++) {
			@Pc(25) Class162 local25 = Static342.aClass155_2.method3548(local18);
			if ((!arg0 || local25.aBoolean535) && local25.anInt4711 == -1 && local25.anInt4702 == -1 && local25.anInt4712 == 0 && local25.aString55.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static253.anInt4611 = -1;
					Static394.aShortArray102 = null;
					return;
				}
				if (local14.length <= local16) {
					@Pc(77) short[] local77 = new short[local14.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local16; local79++) {
						local77[local79] = local14[local79];
					}
					local14 = local77;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static253.anInt4611 = local16;
		Static401.anInt6678 = 0;
		Static394.aShortArray102 = local14;
		@Pc(117) String[] local117 = new String[Static253.anInt4611];
		for (@Pc(124) int local124 = 0; local124 < Static253.anInt4611; local124++) {
			local117[local124] = Static342.aClass155_2.method3548(local14[local124]).aString55;
		}
		Static63.method1066(Static394.aShortArray102, local117);
		Static104.aClass82_24.method1837();
		Static104.aClass82_24.anInt2180 = 2;
	}
}

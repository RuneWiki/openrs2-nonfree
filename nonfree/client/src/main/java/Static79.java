import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "[I")
	public static final int[] anIntArray114 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BILclient!of;)V")
	public static void method1389(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub30_Sub1 arg1) {
		@Pc(15) boolean local15 = arg1.method3924(1) == 1;
		if (local15) {
			Static149.anIntArray236[Static182.anInt3388++] = arg0;
		}
		@Pc(30) int local30 = arg1.method3924(2);
		@Pc(34) Class6_Sub2_Sub1_Sub1 local34 = Static171.aClass6_Sub2_Sub1_Sub1Array1[arg0];
		if (local30 != 0) {
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(154) int local154;
			if (local30 == 1) {
				local144 = arg1.method3924(3);
				local149 = local34.anIntArray536[0];
				local154 = local34.anIntArray537[0];
				if (local144 == 0) {
					local149--;
					local154--;
				} else if (local144 == 1) {
					local154--;
				} else if (local144 == 2) {
					local154--;
					local149++;
				} else if (local144 == 3) {
					local149--;
				} else if (local144 == 4) {
					local149++;
				} else if (local144 == 5) {
					local154++;
					local149--;
				} else if (local144 == 6) {
					local154++;
				} else if (local144 == 7) {
					local149++;
					local154++;
				}
				if (local15) {
					local34.aBoolean52 = true;
					local34.anInt993 = local149;
					local34.anInt980 = local154;
				} else {
					local34.method713(Static251.aByteArray45[arg0], local154, local149);
				}
			} else if (local30 == 2) {
				local144 = arg1.method3924(4);
				local149 = local34.anIntArray536[0];
				local154 = local34.anIntArray537[0];
				if (local144 == 0) {
					local149 -= 2;
					local154 -= 2;
				} else if (local144 == 1) {
					local149--;
					local154 -= 2;
				} else if (local144 == 2) {
					local154 -= 2;
				} else if (local144 == 3) {
					local154 -= 2;
					local149++;
				} else if (local144 == 4) {
					local154 -= 2;
					local149 += 2;
				} else if (local144 == 5) {
					local149 -= 2;
					local154--;
				} else if (local144 == 6) {
					local154--;
					local149 += 2;
				} else if (local144 == 7) {
					local149 -= 2;
				} else if (local144 == 8) {
					local149 += 2;
				} else if (local144 == 9) {
					local154++;
					local149 -= 2;
				} else if (local144 == 10) {
					local149 += 2;
					local154++;
				} else if (local144 == 11) {
					local154 += 2;
					local149 -= 2;
				} else if (local144 == 12) {
					local149--;
					local154 += 2;
				} else if (local144 == 13) {
					local154 += 2;
				} else if (local144 == 14) {
					local154 += 2;
					local149++;
				} else if (local144 == 15) {
					local149 += 2;
					local154 += 2;
				}
				if (local15) {
					local34.anInt993 = local149;
					local34.aBoolean52 = true;
					local34.anInt980 = local154;
				} else {
					local34.method713(Static251.aByteArray45[arg0], local154, local149);
				}
			} else {
				local144 = arg1.method3924(1);
				@Pc(418) int local418;
				@Pc(426) int local426;
				@Pc(438) int local438;
				@Pc(446) int local446;
				if (local144 == 0) {
					local149 = arg1.method3924(12);
					local154 = local149 >> 10;
					local418 = local149 >> 5 & 0x1F;
					if (local418 > 15) {
						local418 -= 32;
					}
					local426 = local149 & 0x1F;
					if (local426 > 15) {
						local426 -= 32;
					}
					local438 = local34.anIntArray536[0] + local418;
					local446 = local34.anIntArray537[0] + local426;
					if (local15) {
						local34.aBoolean52 = true;
						local34.anInt993 = local438;
						local34.anInt980 = local446;
					} else {
						local34.method713(Static251.aByteArray45[arg0], local446, local438);
					}
					local34.aByte86 = (byte) (local154 + local34.aByte86 & 0x3);
					if (Static373.anInt6574 == arg0) {
						Static221.anInt4855 = local34.aByte86;
					}
				} else {
					local149 = arg1.method3924(30);
					local154 = local149 >> 28;
					local418 = local149 >> 14 & 0x3FFF;
					local426 = local149 & 0x3FFF;
					local438 = (local418 + Static381.anInt6688 + local34.anIntArray536[0] & 0x3FFF) - Static381.anInt6688;
					local446 = (local426 + Static285.anInt5187 + local34.anIntArray537[0] & 0x3FFF) - Static285.anInt5187;
					if (local15) {
						local34.anInt980 = local446;
						local34.aBoolean52 = true;
						local34.anInt993 = local438;
					} else {
						local34.method713(Static251.aByteArray45[arg0], local446, local438);
					}
					local34.aByte86 = (byte) (local154 + local34.aByte86 & 0x3);
					if (arg0 == Static373.anInt6574) {
						Static221.anInt4855 = local34.aByte86;
					}
				}
			}
		} else if (local15) {
			local34.aBoolean52 = false;
		} else if (Static373.anInt6574 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(62) Class171 local62 = Static114.aClass171Array1[arg0] = new Class171();
			local62.anInt4895 = (local34.aByte86 << 28) + (Static381.anInt6688 + local34.anIntArray536[0] >> 6 << 14) + (local34.anIntArray537[0] + Static285.anInt5187 >> 6);
			if (local34.anInt971 == -1) {
				local62.anInt4899 = local34.aClass216_7.method4985();
			} else {
				local62.anInt4899 = local34.anInt971;
			}
			local62.aBoolean346 = local34.aBoolean54;
			local62.anInt4901 = local34.anInt6081;
			if (local34.anInt978 > 0) {
				Static421.method5483(local34);
			}
			Static171.aClass6_Sub2_Sub1_Sub1Array1[arg0] = null;
			if (arg1.method3924(1) != 0) {
				Static382.method5205(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I")
	public static int method1390(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(37) int local37 = local25 | local25 >>> 8;
		@Pc(43) int local43 = local37 | local37 >>> 16;
		return arg0 & ~local43;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
	public static void method1391(@OriginalArg(0) int arg0) {
		Static97.anInt2094 = -1;
		Static348.anInt6296 = arg0;
		Static367.anInt6516 = -1;
		Static28.method540();
	}
}

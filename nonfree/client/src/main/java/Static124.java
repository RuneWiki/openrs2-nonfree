import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	public static int anInt2626;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BZ)V")
	public static void method2241(@OriginalArg(1) boolean arg0) {
		Static88.anInt1816 = 0;
		Static41.anInt759 = 0;
		Static333.method4529();
		Static255.method3689(arg0);
		Static241.method3552();
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static88.anInt1816; local27++) {
			local33 = Static31.anIntArray35[local27];
			if (Static24.anInt5323 != Static143.aClass16_Sub1_Sub5_Sub2Array1[local33].anInt6015) {
				if (Static143.aClass16_Sub1_Sub5_Sub2Array1[local33].aClass264_1.method5578()) {
					Static425.method5429(Static143.aClass16_Sub1_Sub5_Sub2Array1[local33]);
				}
				Static143.aClass16_Sub1_Sub5_Sub2Array1[local33].method4766(null);
				Static143.aClass16_Sub1_Sub5_Sub2Array1[local33] = null;
			}
		}
		if (Static146.aClass4_Sub12_Sub1_3.anInt2997 != Static454.anInt4075) {
			throw new RuntimeException("gnp1 pos:" + Static146.aClass4_Sub12_Sub1_3.anInt2997 + " psize:" + Static454.anInt4075);
		}
		for (local33 = 0; local33 < Static12.anInt163; local33++) {
			if (Static143.aClass16_Sub1_Sub5_Sub2Array1[Static342.anIntArray412[local33]] == null) {
				throw new RuntimeException("gnp2 pos:" + local33 + " size:" + Static12.anInt163);
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)Z")
	public static boolean method2242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static112.method2030(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static231.anInt4434;
		@Pc(14) int local14 = arg2 << Static231.anInt4434;
		@Pc(23) int local23 = Static417.aClass65Array4[arg0].l(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static231.anInt4434 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static231.anInt4434 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static231.anInt4434 - 7);
		if (arg3 == 1) {
			if (local10 > Static153.anInt3073) {
				if (!Static299.method4088(local10, local23, local14)) {
					return false;
				}
				if (!Static299.method4088(local10, local23, local14 + Static333.anInt5747)) {
					return false;
				}
				if (!Static299.method4088(local10, local23, local14 + Static4.anInt5935)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static299.method4088(local10, local31, local14)) {
					return false;
				}
				if (!Static299.method4088(local10, local31, local14 + Static333.anInt5747)) {
					return false;
				}
				if (!Static299.method4088(local10, local31, local14 + Static4.anInt5935)) {
					return false;
				}
			}
			if (!Static299.method4088(local10, local39, local14)) {
				return false;
			} else if (Static299.method4088(local10, local39, local14 + Static333.anInt5747)) {
				return Static299.method4088(local10, local39, local14 + Static4.anInt5935);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static209.anInt3921) {
				if (!Static299.method4088(local10, local23, local14 + Static4.anInt5935)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static333.anInt5747, local23, local14 + Static4.anInt5935)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static4.anInt5935, local23, local14 + Static4.anInt5935)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static299.method4088(local10, local31, local14 + Static4.anInt5935)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static333.anInt5747, local31, local14 + Static4.anInt5935)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static4.anInt5935, local31, local14 + Static4.anInt5935)) {
					return false;
				}
			}
			if (!Static299.method4088(local10, local39, local14 + Static4.anInt5935)) {
				return false;
			} else if (Static299.method4088(local10 + Static333.anInt5747, local39, local14 + Static4.anInt5935)) {
				return Static299.method4088(local10 + Static4.anInt5935, local39, local14 + Static4.anInt5935);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static153.anInt3073) {
				if (!Static299.method4088(local10 + Static4.anInt5935, local23, local14)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static4.anInt5935, local23, local14 + Static333.anInt5747)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static4.anInt5935, local23, local14 + Static4.anInt5935)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static299.method4088(local10 + Static4.anInt5935, local31, local14)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static4.anInt5935, local31, local14 + Static333.anInt5747)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static4.anInt5935, local31, local14 + Static4.anInt5935)) {
					return false;
				}
			}
			if (!Static299.method4088(local10 + Static4.anInt5935, local39, local14)) {
				return false;
			} else if (Static299.method4088(local10 + Static4.anInt5935, local39, local14 + Static333.anInt5747)) {
				return Static299.method4088(local10 + Static4.anInt5935, local39, local14 + Static4.anInt5935);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static209.anInt3921) {
				if (!Static299.method4088(local10, local23, local14)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static333.anInt5747, local23, local14)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static4.anInt5935, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static299.method4088(local10, local31, local14)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static333.anInt5747, local31, local14)) {
					return false;
				}
				if (!Static299.method4088(local10 + Static4.anInt5935, local31, local14)) {
					return false;
				}
			}
			if (!Static299.method4088(local10, local39, local14)) {
				return false;
			} else if (Static299.method4088(local10 + Static333.anInt5747, local39, local14)) {
				return Static299.method4088(local10 + Static4.anInt5935, local39, local14);
			} else {
				return false;
			}
		} else if (!Static299.method4088(local10 + Static333.anInt5747, local47, local14 + Static333.anInt5747)) {
			return false;
		} else if (arg3 == 16) {
			return Static299.method4088(local10, local39, local14 + Static4.anInt5935);
		} else if (arg3 == 32) {
			return Static299.method4088(local10 + Static4.anInt5935, local39, local14 + Static4.anInt5935);
		} else if (arg3 == 64) {
			return Static299.method4088(local10 + Static4.anInt5935, local39, local14);
		} else if (arg3 == 128) {
			return Static299.method4088(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z")
	public static boolean method2246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static55.method934(arg1, arg0) || Static13.method137(arg0, arg1);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method2247(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}

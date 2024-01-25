import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "Z")
	public static boolean aBoolean492 = false;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "[I")
	public static final int[] anIntArray619 = new int[5];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lclient!ns;")
	public static Class175 method5647(@OriginalArg(0) int arg0) {
		@Pc(8) Class175[] local8 = Static155.method2328();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class175 local16 = local8[local10];
			if (local16.anInt4655 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIILclient!nu;)V")
	public static void method5648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26_Sub4 arg3) {
		@Pc(4) Class223 local4 = Static165.method2394(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass26_Sub4_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IFIIIII[FIFIFI)V")
	public static void method5649(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(14) int local14 = arg2 - arg3;
		@Pc(18) int local18 = arg0 - arg9;
		@Pc(22) int local22 = arg5 - arg4;
		@Pc(43) float local43 = arg6[2] * (float) local14 + (float) local18 * arg6[0] + (float) local22 * arg6[1];
		@Pc(64) float local64 = arg6[5] * (float) local14 + arg6[3] * (float) local18 + (float) local22 * arg6[4];
		@Pc(85) float local85 = (float) local14 * arg6[8] + arg6[6] * (float) local18 + (float) local22 * arg6[7];
		@Pc(96) float local96;
		@Pc(103) float local103;
		if (arg11 == 0) {
			local96 = local43 + arg10 + 0.5F;
			local103 = arg8 + 0.5F - local85;
		} else if (arg11 == 1) {
			local103 = local85 + arg8 + 0.5F;
			local96 = local43 + arg10 + 0.5F;
		} else if (arg11 == 2) {
			local103 = arg1 + 0.5F - local64;
			local96 = arg10 + 0.5F - local43;
		} else if (arg11 == 3) {
			local103 = arg1 + 0.5F - local64;
			local96 = local43 + arg10 + 0.5F;
		} else if (arg11 == 4) {
			local103 = arg1 + 0.5F - local64;
			local96 = arg8 + local85 + 0.5F;
		} else {
			local103 = arg1 + 0.5F - local64;
			local96 = arg8 + 0.5F - local85;
		}
		@Pc(216) float local216;
		if (arg7 == 1) {
			local216 = local96;
			local96 = -local103;
			local103 = local216;
		} else if (arg7 == 2) {
			local103 = -local103;
			local96 = -local96;
		} else if (arg7 == 3) {
			local216 = local96;
			local96 = local103;
			local103 = -local216;
		}
		Static276.aFloat136 = local96;
		Static130.aFloat61 = local103;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public static void method5650() {
		Static333.aClass164_22.method3509();
		Static315.aClass24_9.method299();
		Static372.aClass24_10.method299();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!kh;)V")
	public static void method5651(@OriginalArg(1) Class26_Sub2_Sub4 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static274.anInt4617 == arg0.anInt7110 || arg0.anInt7046 == -1 || arg0.anInt7069 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class139 local26 = Static364.aClass151_2.method3293(arg0.anInt7046);
			if (local26.aBoolean245 || arg0.anInt7050 + 1 > local26.anIntArray345[arg0.anInt7061]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(53) int local53 = arg0.anInt7110 - arg0.anInt7112;
			@Pc(59) int local59 = Static274.anInt4617 - arg0.anInt7112;
			@Pc(70) int local70 = arg0.anInt7105 * 128 + arg0.method5512() * 64;
			@Pc(81) int local81 = arg0.anInt7048 * 128 + arg0.method5512() * 64;
			@Pc(92) int local92 = arg0.anInt7059 * 128 + arg0.method5512() * 64;
			@Pc(104) int local104 = arg0.anInt7088 * 128 + arg0.method5512() * 64;
			arg0.anInt7388 = (local59 * local92 + (local53 - local59) * local70) / local53;
			arg0.anInt7383 = (local59 * local104 + (local53 - local59) * local81) / local53;
		}
		arg0.anInt7114 = 0;
		if (arg0.anInt7093 == 0) {
			arg0.method5505(8192);
		}
		if (arg0.anInt7093 == 1) {
			arg0.method5505(12288);
		}
		if (arg0.anInt7093 == 2) {
			arg0.method5505(0);
		}
		if (arg0.anInt7093 == 3) {
			arg0.method5505(4096);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)Z")
	public static boolean method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static194.method2806(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static168.anInt3026;
		@Pc(14) int local14 = arg2 << Static168.anInt3026;
		@Pc(23) int local23 = Static244.aClass165Array8[arg0].l(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static168.anInt3026 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static168.anInt3026 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static168.anInt3026 - 7);
		if (arg3 == 1) {
			if (local10 > Static279.anInt7421) {
				if (!Static302.method4020(local10, local23, local14)) {
					return false;
				}
				if (!Static302.method4020(local10, local23, local14 + Static297.anInt4923)) {
					return false;
				}
				if (!Static302.method4020(local10, local23, local14 + Static363.anInt5820)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static302.method4020(local10, local31, local14)) {
					return false;
				}
				if (!Static302.method4020(local10, local31, local14 + Static297.anInt4923)) {
					return false;
				}
				if (!Static302.method4020(local10, local31, local14 + Static363.anInt5820)) {
					return false;
				}
			}
			if (!Static302.method4020(local10, local39, local14)) {
				return false;
			} else if (Static302.method4020(local10, local39, local14 + Static297.anInt4923)) {
				return Static302.method4020(local10, local39, local14 + Static363.anInt5820);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static432.anInt7276) {
				if (!Static302.method4020(local10, local23, local14 + Static363.anInt5820)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static297.anInt4923, local23, local14 + Static363.anInt5820)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static363.anInt5820, local23, local14 + Static363.anInt5820)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static302.method4020(local10, local31, local14 + Static363.anInt5820)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static297.anInt4923, local31, local14 + Static363.anInt5820)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static363.anInt5820, local31, local14 + Static363.anInt5820)) {
					return false;
				}
			}
			if (!Static302.method4020(local10, local39, local14 + Static363.anInt5820)) {
				return false;
			} else if (Static302.method4020(local10 + Static297.anInt4923, local39, local14 + Static363.anInt5820)) {
				return Static302.method4020(local10 + Static363.anInt5820, local39, local14 + Static363.anInt5820);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static279.anInt7421) {
				if (!Static302.method4020(local10 + Static363.anInt5820, local23, local14)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static363.anInt5820, local23, local14 + Static297.anInt4923)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static363.anInt5820, local23, local14 + Static363.anInt5820)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static302.method4020(local10 + Static363.anInt5820, local31, local14)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static363.anInt5820, local31, local14 + Static297.anInt4923)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static363.anInt5820, local31, local14 + Static363.anInt5820)) {
					return false;
				}
			}
			if (!Static302.method4020(local10 + Static363.anInt5820, local39, local14)) {
				return false;
			} else if (Static302.method4020(local10 + Static363.anInt5820, local39, local14 + Static297.anInt4923)) {
				return Static302.method4020(local10 + Static363.anInt5820, local39, local14 + Static363.anInt5820);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static432.anInt7276) {
				if (!Static302.method4020(local10, local23, local14)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static297.anInt4923, local23, local14)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static363.anInt5820, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static302.method4020(local10, local31, local14)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static297.anInt4923, local31, local14)) {
					return false;
				}
				if (!Static302.method4020(local10 + Static363.anInt5820, local31, local14)) {
					return false;
				}
			}
			if (!Static302.method4020(local10, local39, local14)) {
				return false;
			} else if (Static302.method4020(local10 + Static297.anInt4923, local39, local14)) {
				return Static302.method4020(local10 + Static363.anInt5820, local39, local14);
			} else {
				return false;
			}
		} else if (!Static302.method4020(local10 + Static297.anInt4923, local47, local14 + Static297.anInt4923)) {
			return false;
		} else if (arg3 == 16) {
			return Static302.method4020(local10, local39, local14 + Static363.anInt5820);
		} else if (arg3 == 32) {
			return Static302.method4020(local10 + Static363.anInt5820, local39, local14 + Static363.anInt5820);
		} else if (arg3 == 64) {
			return Static302.method4020(local10 + Static363.anInt5820, local39, local14);
		} else if (arg3 == 128) {
			return Static302.method4020(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[I[IZI)V")
	public static void method5653(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg3; local55 < arg0; local55++) {
			if (arg1[local55] < (local53 & local55) + local20) {
				@Pc(74) int local74 = arg1[local55];
				arg1[local55] = arg1[local16];
				arg1[local16] = local74;
				@Pc(88) int local88 = arg2[local55];
				arg2[local55] = arg2[local16];
				arg2[local16++] = local88;
			}
		}
		arg1[arg0] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg0] = arg2[local16];
		arg2[local16] = local34;
		method5653(local16 - 1, arg1, arg2, arg3);
		method5653(arg0, arg1, arg2, local16 + 1);
	}
}

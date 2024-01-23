import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!ak;")
	public static Class7 aClass7_38;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Lclient!i;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "[S")
	public static short[] aShortArray16 = new short[256];

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "[I")
	public static int[] anIntArray118 = new int[100];

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "[C")
	public static char[] aCharArray5 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString23 = "Face here";

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)I")
	public static int method707(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static252.method3964();
		for (@Pc(20) Class1_Sub9 local20 = arg0 ? (Class1_Sub9) Static278.aClass22_21.method640() : (Class1_Sub9) Static278.aClass22_21.method637(); local20 != null; local20 = (Class1_Sub9) Static278.aClass22_21.method637()) {
			if ((local20.aLong51 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local20.aLong51 & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) local20.aLong202;
					Static224.anIntArray535[local42] = Static236.anIntArray578[local42];
					local20.method4534();
					return local42;
				}
				local20.method4534();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BZII[Lclient!ac;[B)V")
	public static void method708(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(6) Class1_Sub18 local6 = new Class1_Sub18(arg4);
		@Pc(8) int local8 = -1;
		while (true) {
			@Pc(12) int local12 = local6.method3096();
			if (local12 == 0) {
				return;
			}
			@Pc(17) int local17 = 0;
			local8 += local12;
			while (true) {
				@Pc(25) int local25 = local6.method3117();
				if (local25 == 0) {
					break;
				}
				local17 += local25 - 1;
				@Pc(41) int local41 = local17 >> 6 & 0x3F;
				@Pc(45) int local45 = local17 >> 12;
				@Pc(49) int local49 = local17 & 0x3F;
				@Pc(53) int local53 = local6.method3122();
				@Pc(57) int local57 = local53 >> 2;
				@Pc(61) int local61 = local53 & 0x3;
				@Pc(66) int local66 = local41 + arg2;
				@Pc(70) int local70 = local49 + arg1;
				if (local66 > 0 && local70 > 0 && local66 < 103 && local70 < 103) {
					@Pc(90) Class2 local90 = null;
					if (!arg0) {
						@Pc(94) int local94 = local45;
						if ((Static242.aByteArrayArrayArray23[1][local66][local70] & 0x2) == 2) {
							local94 = local45 - 1;
						}
						if (local94 >= 0) {
							local90 = arg3[local94];
						}
					}
					Static232.method3822(local8, !arg0, local70, local57, local66, local45, local90, arg0, local45, local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!rf;)V")
	public static void method710(@OriginalArg(1) Class6_Sub6 arg0) {
		@Pc(9) Class79 local9 = arg0.method3503();
		arg0.anInt4544 = local9.anInt2197;
		if (arg0.anInt4558 == 0) {
			arg0.anInt4551 = 0;
			return;
		}
		if (arg0.anInt4572 != -1 && arg0.anInt4506 == 0) {
			@Pc(43) Class133 local43 = Static262.method4031(arg0.anInt4572);
			if (arg0.anInt4581 > 0 && local43.anInt4030 == 0) {
				arg0.anInt4551++;
				return;
			}
			if (arg0.anInt4581 <= 0 && local43.anInt4019 == 0) {
				arg0.anInt4551++;
				return;
			}
		}
		if (arg0.anInt4580 != -1 && Static261.anInt5259 >= arg0.anInt4548) {
			@Pc(96) Class25 local96 = Static280.method4295(arg0.anInt4580);
			if (local96.aBoolean78 && local96.anInt838 != -1) {
				@Pc(111) Class133 local111 = Static262.method4031(local96.anInt838);
				if (arg0.anInt4581 > 0 && local111.anInt4030 == 0) {
					arg0.anInt4551++;
					return;
				}
				if (arg0.anInt4581 <= 0 && local111.anInt4019 == 0) {
					arg0.anInt4551++;
					return;
				}
			}
		}
		@Pc(150) int local150 = arg0.anInt4569;
		@Pc(153) int local153 = arg0.anInt4562;
		@Pc(169) int local169 = arg0.anIntArray519[arg0.anInt4558 - 1] * 128 + arg0.method3509() * 64;
		@Pc(186) int local186 = arg0.anIntArray516[arg0.anInt4558 - 1] * 128 + arg0.method3509() * 64;
		if (local169 - local153 > 256 || local169 - local153 < -256 || local186 - local150 > 256 || local186 - local150 < -256) {
			arg0.anInt4562 = local169;
			arg0.anInt4569 = local186;
			return;
		}
		@Pc(222) int local222 = 4;
		if (local169 <= local153) {
			if (local153 > local169) {
				if (local150 < local186) {
					arg0.anInt4579 = 768;
				} else if (local186 >= local150) {
					arg0.anInt4579 = 512;
				} else {
					arg0.anInt4579 = 256;
				}
			} else if (local150 < local186) {
				arg0.anInt4579 = 1024;
			} else if (local150 > local186) {
				arg0.anInt4579 = 0;
			}
		} else if (local186 > local150) {
			arg0.anInt4579 = 1280;
		} else if (local150 > local186) {
			arg0.anInt4579 = 1792;
		} else {
			arg0.anInt4579 = 1536;
		}
		@Pc(307) int local307 = local9.anInt2212;
		@Pc(316) int local316 = arg0.anInt4579 - arg0.anInt4511 & 0x7FF;
		if (local316 > 1024) {
			local316 -= 2048;
		}
		@Pc(324) boolean local324 = true;
		@Pc(326) byte local326 = 1;
		if (local316 >= -256 && local316 <= 256) {
			local307 = local9.anInt2224;
		} else if (local316 >= 256 && local316 < 768) {
			local307 = local9.anInt2201;
		} else if (local316 >= -768 && local316 <= -256) {
			local307 = local9.anInt2218;
		}
		if (local307 == -1) {
			local307 = local9.anInt2224;
		}
		arg0.anInt4544 = local307;
		if (arg0 instanceof Class6_Sub6_Sub1) {
			local324 = ((Class6_Sub6_Sub1) arg0).aClass19_1.aBoolean59;
		}
		if (local324) {
			if (arg0.anInt4579 != arg0.anInt4511 && arg0.anInt4513 == -1 && arg0.anInt4503 != 0) {
				local222 = 2;
			}
			if (arg0.anInt4558 > 2) {
				local222 = 6;
			}
			if (arg0.anInt4558 > 3) {
				local222 = 8;
			}
			if (arg0.anInt4551 > 0 && arg0.anInt4558 > 1) {
				local222 = 8;
				arg0.anInt4551--;
			}
		} else {
			if (arg0.anInt4558 > 1) {
				local222 = 6;
			}
			if (arg0.anInt4558 > 2) {
				local222 = 8;
			}
			if (arg0.anInt4551 > 0 && arg0.anInt4558 > 1) {
				local222 = 8;
				arg0.anInt4551--;
			}
		}
		if (arg0.aByteArray76[arg0.anInt4558 - 1] == 2) {
			local222 <<= 0x1;
			local326 = 2;
		} else if (arg0.aByteArray76[arg0.anInt4558 - 1] == 0) {
			local222 >>= 0x1;
			local326 = 0;
		}
		if (local222 < 8 || local9.anInt2225 == -1) {
			if (local9.anInt2221 != -1 && local326 == 0) {
				if (local9.anInt2212 == arg0.anInt4544 && local9.anInt2205 != -1) {
					arg0.anInt4544 = local9.anInt2205;
				} else if (local9.anInt2218 == arg0.anInt4544 && local9.anInt2196 != -1) {
					arg0.anInt4544 = local9.anInt2196;
				} else if (arg0.anInt4544 == local9.anInt2201 && local9.anInt2215 != -1) {
					arg0.anInt4544 = local9.anInt2215;
				} else {
					arg0.anInt4544 = local9.anInt2221;
				}
			}
		} else if (arg0.anInt4544 == local9.anInt2212 && local9.anInt2207 != -1) {
			arg0.anInt4544 = local9.anInt2207;
		} else if (arg0.anInt4544 == local9.anInt2218 && local9.anInt2199 != -1) {
			arg0.anInt4544 = local9.anInt2199;
		} else if (arg0.anInt4544 == local9.anInt2201 && local9.anInt2214 != -1) {
			arg0.anInt4544 = local9.anInt2214;
		} else {
			arg0.anInt4544 = local9.anInt2225;
		}
		if (local9.anInt2208 != -1) {
			local222 <<= 0x7;
			if (arg0.anInt4558 == 1) {
				@Pc(649) int local649 = arg0.anInt4554 * arg0.anInt4554;
				@Pc(670) int local670 = (arg0.anInt4569 > local186 ? arg0.anInt4569 - local186 : local186 - arg0.anInt4569) << 7;
				@Pc(691) int local691 = (arg0.anInt4562 > local169 ? arg0.anInt4562 - local169 : local169 - arg0.anInt4562) << 7;
				@Pc(698) int local698 = local691 <= local670 ? local670 : local691;
				@Pc(705) int local705 = local698 * local9.anInt2208 * 2;
				if (local649 > local705) {
					arg0.anInt4554 /= 2;
				} else if (local649 / 2 > local698) {
					arg0.anInt4554 -= local9.anInt2208;
					if (arg0.anInt4554 < 0) {
						arg0.anInt4554 = 0;
					}
				} else if (local222 > arg0.anInt4554) {
					arg0.anInt4554 += local9.anInt2208;
					if (local222 < arg0.anInt4554) {
						arg0.anInt4554 = local222;
					}
				}
			} else if (local222 > arg0.anInt4554) {
				arg0.anInt4554 += local9.anInt2208;
				if (local222 < arg0.anInt4554) {
					arg0.anInt4554 = local222;
				}
			} else if (arg0.anInt4554 > 0) {
				arg0.anInt4554 -= local9.anInt2208;
				if (arg0.anInt4554 < 0) {
					arg0.anInt4554 = 0;
				}
			}
			local222 = arg0.anInt4554 >> 7;
			if (local222 < 1) {
				local222 = 1;
			}
		}
		if (local169 > local153) {
			arg0.anInt4562 += local222;
			if (arg0.anInt4562 > local169) {
				arg0.anInt4562 = local169;
			}
		} else if (local169 < local153) {
			arg0.anInt4562 -= local222;
			if (local169 > arg0.anInt4562) {
				arg0.anInt4562 = local169;
			}
		}
		if (local186 > local150) {
			arg0.anInt4569 += local222;
			if (arg0.anInt4569 > local186) {
				arg0.anInt4569 = local186;
			}
		} else if (local186 < local150) {
			arg0.anInt4569 -= local222;
			if (local186 > arg0.anInt4569) {
				arg0.anInt4569 = local186;
			}
		}
		if (arg0.anInt4562 == local169 && arg0.anInt4569 == local186) {
			if (arg0.anInt4581 > 0) {
				arg0.anInt4581--;
			}
			arg0.anInt4558--;
		}
	}
}

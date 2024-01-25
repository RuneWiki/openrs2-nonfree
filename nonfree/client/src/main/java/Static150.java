import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	public static int anInt2937;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!mp;")
	public static Class5_Sub26 aClass5_Sub26_1;

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_35 = new Class109(4);

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
	public static int anInt2938 = 0;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
	public static final int anInt2939 = -1;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
	public static int anInt2940 = 0;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
	public static int anInt2941 = -1;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)V")
	public static void method2709(@OriginalArg(1) int arg0) {
		@Pc(1) Class5_Sub1_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class51 local8 = Static56.aClass51Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static236.anInt4222; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static350.anInt6715; local15++) {
						local1 = local8.method1858(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class51 local41 = Static56.aClass51Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method1856(local15, local12) - local41.method1856(local15, local12);
									@Pc(67) int local67 = local8.method1856(local15 + 1, local12) - local41.method1856(local15 + 1, local12);
									@Pc(85) int local85 = local8.method1856(local15 + 1, local12 + 1) - local41.method1856(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method1856(local15, local12 + 1) - local41.method1856(local15, local12 + 1);
									local41.method1851(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] method2710(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return arg1 ? Static238.method4238(local21) : local21;
		} else if (arg0 instanceof Class22) {
			@Pc(35) Class22 local35 = (Class22) arg0;
			return local35.method5482();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[Lclient!bm;ZIIIIILclient!ea;[B)[I")
	public static int[] method2711(@OriginalArg(1) Class24[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class55 arg7, @OriginalArg(9) byte[] arg8) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(27) int local27;
		if (!arg1) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				@Pc(11) Class24 local11 = arg0[local5];
				for (local13 = 0; local13 < 64; local13++) {
					for (local17 = 0; local17 < 64; local17++) {
						local23 = local13 + arg6;
						local27 = local17 + arg3;
						if (local23 >= 0 && Static22.anInt481 > local23 && local27 >= 0 && local27 < Static269.anInt5281) {
							local11.method480(local23, local27);
						}
					}
				}
			}
		}
		@Pc(71) Class5_Sub12 local71 = new Class5_Sub12(arg8);
		@Pc(80) int local80 = arg4 + arg6;
		local13 = arg5 + arg3;
		for (local17 = 0; local17 < arg2; local17++) {
			for (local23 = 0; local23 < 64; local23++) {
				for (local27 = 0; local27 < 64; local27++) {
					Static104.method1877(local71, false, local13 + local27, arg1, 0, local17, 0, arg3 + local27, local23 + local80, arg6 + local23, 0);
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(147) int local147;
		@Pc(162) int local162;
		@Pc(176) int local176;
		@Pc(180) int local180;
		@Pc(225) int local225;
		@Pc(182) int local182;
		while (local71.anInt5731 < local71.aByteArray90.length) {
			local147 = local71.method5115();
			if (local147 == 128) {
				Static163.anIntArray334[0] = local71.method5106();
				Static163.anIntArray334[1] = local71.method5066();
				Static163.anIntArray334[2] = local71.method5066();
				Static163.anIntArray334[3] = local71.method5066();
				Static163.anIntArray334[4] = local71.method5106();
				local139 = true;
			} else {
				if (local147 != 129) {
					local71.anInt5731--;
					break;
				}
				if (Static332.aByteArrayArrayArray16 == null) {
					Static332.aByteArrayArrayArray16 = new byte[4][][];
				}
				local141 = true;
				for (local162 = 0; local162 < 4; local162++) {
					@Pc(168) byte local168 = local71.method5098();
					if (local168 == 0 && Static332.aByteArrayArrayArray16[local162] != null) {
						local176 = arg6;
						local180 = arg6 + 64;
						local182 = arg3;
						if (local180 < 0) {
							local180 = 0;
						} else if (Static22.anInt481 <= local180) {
							local180 = Static22.anInt481;
						}
						if (arg6 < 0) {
							local176 = 0;
						} else if (arg6 >= Static22.anInt481) {
							local176 = Static22.anInt481;
						}
						if (arg3 < 0) {
							local182 = 0;
						} else if (arg3 >= Static269.anInt5281) {
							local182 = Static269.anInt5281;
						}
						local225 = arg3 + 64;
						if (local225 < 0) {
							local225 = 0;
						} else if (Static269.anInt5281 <= local225) {
							local225 = Static269.anInt5281;
						}
						while (local176 < local180) {
							while (local182 < local225) {
								Static332.aByteArrayArrayArray16[local162][local176][local182] = 0;
								local182++;
							}
							local176++;
						}
					} else if (local168 == 1) {
						if (Static332.aByteArrayArrayArray16[local162] == null) {
							Static332.aByteArrayArrayArray16[local162] = new byte[Static22.anInt481 + 1][Static269.anInt5281 + 1];
						}
						for (local176 = 0; local176 < 64; local176 += 4) {
							for (local180 = 0; local180 < 64; local180 += 4) {
								@Pc(428) byte local428 = local71.method5098();
								for (local225 = local176 + arg6; local225 < local176 + arg6 + 4; local225++) {
									for (@Pc(439) int local439 = local180 + arg3; local439 < local180 + arg3 + 4; local439++) {
										if (local225 >= 0 && Static22.anInt481 > local225 && local439 >= 0 && local439 < Static269.anInt5281) {
											Static332.aByteArrayArrayArray16[local162][local225][local439] = local428;
										}
									}
								}
							}
						}
					} else if (local168 == 2) {
						if (Static332.aByteArrayArrayArray16[local162] == null) {
							Static332.aByteArrayArrayArray16[local162] = new byte[Static22.anInt481 + 1][Static269.anInt5281 + 1];
						}
						if (local162 > 0) {
							local176 = arg6;
							local180 = arg6 + 64;
							local182 = arg3;
							if (arg6 < 0) {
								local176 = 0;
							} else if (arg6 >= Static22.anInt481) {
								local176 = Static22.anInt481;
							}
							if (local180 < 0) {
								local180 = 0;
							} else if (local180 >= Static22.anInt481) {
								local180 = Static22.anInt481;
							}
							local225 = arg3 + 64;
							if (arg3 < 0) {
								local182 = 0;
							} else if (Static269.anInt5281 <= arg3) {
								local182 = Static269.anInt5281;
							}
							if (local225 < 0) {
								local225 = 0;
							} else if (Static269.anInt5281 <= local225) {
								local225 = Static269.anInt5281;
							}
							while (local176 < local180) {
								while (local225 > local182) {
									Static332.aByteArrayArrayArray16[local162][local176][local182] = Static332.aByteArrayArrayArray16[local162 - 1][local176][local182];
									local182++;
								}
								local176++;
							}
						}
					}
				}
			}
		}
		@Pc(595) int local595;
		if (!arg1) {
			@Pc(559) Class65 local559 = null;
			label278: while (true) {
				while (true) {
					while (local71.anInt5731 < local71.aByteArray90.length) {
						local162 = local71.method5115();
						if (local162 == 0) {
							local559 = new Class65(local71);
						} else if (local162 == 1) {
							local595 = local71.method5115();
							if (local595 > 0) {
								for (local176 = 0; local176 < local595; local176++) {
									@Pc(606) Class5_Sub9_Sub1 local606 = new Class5_Sub9_Sub1(local71);
									if (local606.anInt718 == 31) {
										@Pc(618) Class165 local618 = Static60.method1848(local71.method5106());
										local606.method635(local618.anInt5076, local618.anInt5069, local618.anInt5071, local618.anInt5074);
									}
									local606.anInt703 += arg6 << 7;
									local606.anInt708 += arg3 << 7;
									local182 = local606.anInt703 >> 7;
									local225 = local606.anInt708 >> 7;
									if (local182 >= 0 && local225 >= 0 && local182 < Static22.anInt481 && Static269.anInt5281 > local225) {
										local606.anInt704 = Static217.anIntArrayArrayArray8[local606.anInt722][local182][local225] - local606.anInt704;
										if (arg7.method5207() > 0) {
											Static300.method5272(local606);
										}
									}
								}
							}
						} else if (local162 == 2) {
							if (local559 == null) {
								local559 = new Class65();
							}
							local559.method1423(local71);
						} else {
							throw new IllegalStateException();
						}
					}
					if (local559 != null) {
						for (local162 = 0; local162 < 8; local162++) {
							for (local595 = 0; local595 < 8; local595++) {
								local176 = (arg6 >> 3) + local162;
								local180 = local595 + (arg3 >> 3);
								if (local176 >= 0 && local176 < Static22.anInt481 >> 3 && local180 >= 0 && local180 < Static269.anInt5281 >> 3) {
									Static236.method3917(local180, local559, local176);
								}
							}
						}
					}
					break label278;
				}
			}
		}
		if (!local141 && Static332.aByteArrayArrayArray16 != null) {
			for (local147 = 0; local147 < 4; local147++) {
				if (Static332.aByteArrayArrayArray16[local147] != null) {
					for (local162 = 0; local162 < 16; local162++) {
						for (local595 = 0; local595 < 16; local595++) {
							local176 = local162 + (arg6 >> 2);
							local180 = local595 + (arg3 >> 2);
							if (local176 >= 0 && local176 < 26 && local180 >= 0 && local180 < 26) {
								Static332.aByteArrayArrayArray16[local147][local176][local180] = 0;
							}
						}
					}
				}
			}
		}
		if (local139) {
			return Static163.anIntArray334;
		} else {
			return null;
		}
	}
}

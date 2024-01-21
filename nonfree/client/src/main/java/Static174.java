import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
	public static int anInt3744;

	@OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
	public static int anInt3745;

	@OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
	private static int anInt3746;

	@OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
	public static int anInt3747;

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
	public static int anInt3748;

	@OriginalMember(owner = "client!ta", name = "ab", descriptor = "Lclient!sg;")
	public static Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
	public static int anInt3749;

	@OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
	public static int anInt3750;

	@OriginalMember(owner = "client!ta", name = "kb", descriptor = "I")
	public static int anInt3752;

	@OriginalMember(owner = "client!ta", name = "U", descriptor = "[I")
	private static int[] anIntArray316 = new int[1024];

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "Z")
	private static boolean aBoolean208 = false;

	@OriginalMember(owner = "client!ta", name = "eb", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!ta", name = "fb", descriptor = "[I")
	public static final int[] anIntArray319 = new int[65536];

	@OriginalMember(owner = "client!ta", name = "gb", descriptor = "Z")
	private static boolean aBoolean210 = false;

	@OriginalMember(owner = "client!ta", name = "hb", descriptor = "Z")
	public static boolean aBoolean211 = true;

	@OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
	public static int anInt3751 = 0;

	@OriginalMember(owner = "client!ta", name = "jb", descriptor = "F")
	private static float aFloat1 = 1.0F;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method2834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(5) int[] local5 = anInterface3_2.method2595(arg18, aFloat1);
		@Pc(12) int local12;
		if (local5 == null) {
			local12 = anInterface3_2.method2592(arg18);
			method2848(arg0, arg1, arg2, arg3, arg4, arg5, method2851(local12, arg6), method2851(local12, arg7), method2851(local12, arg8));
			return;
		}
		aBoolean210 = anInterface3_2.method2598(arg18);
		aBoolean208 = anInterface3_2.method2597(arg18);
		local12 = arg4 - arg3;
		@Pc(47) int local47 = arg1 - arg0;
		@Pc(51) int local51 = arg5 - arg3;
		@Pc(55) int local55 = arg2 - arg0;
		@Pc(59) int local59 = arg7 - arg6;
		@Pc(63) int local63 = arg8 - arg6;
		@Pc(65) int local65 = 0;
		if (arg1 != arg0) {
			local65 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(80) int local80 = 0;
		if (arg2 != arg1) {
			local80 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(95) int local95 = 0;
		if (arg2 != arg0) {
			local95 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(116) int local116 = local12 * local55 - local51 * local47;
		if (local116 == 0) {
			return;
		}
		@Pc(131) int local131 = (local59 * local55 - local63 * local47 << 9) / local116;
		@Pc(143) int local143 = (local63 * local12 - local59 * local51 << 9) / local116;
		@Pc(147) int local147 = arg9 - arg10;
		@Pc(151) int local151 = arg12 - arg13;
		@Pc(155) int local155 = arg15 - arg16;
		@Pc(159) int local159 = arg11 - arg9;
		@Pc(163) int local163 = arg14 - arg12;
		@Pc(167) int local167 = arg17 - arg15;
		@Pc(177) int local177 = local159 * arg12 - local163 * arg9 << 14;
		@Pc(187) int local187 = local163 * arg15 - local167 * arg12 << 5;
		@Pc(197) int local197 = local167 * arg9 - local159 * arg15 << 5;
		@Pc(207) int local207 = local147 * arg12 - local151 * arg9 << 14;
		@Pc(217) int local217 = local151 * arg15 - local155 * arg12 << 5;
		@Pc(227) int local227 = local155 * arg9 - local147 * arg15 << 5;
		@Pc(237) int local237 = local151 * local159 - local147 * local163 << 14;
		@Pc(247) int local247 = local155 * local163 - local151 * local167 << 5;
		@Pc(257) int local257 = local147 * local167 - local155 * local159 << 5;
		@Pc(336) int local336;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt3746) {
				if (arg1 > anInt3746) {
					arg1 = anInt3746;
				}
				if (arg2 > anInt3746) {
					arg2 = anInt3746;
				}
				arg6 = (arg6 << 9) + local131 - local131 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local95 * arg0;
						arg3 -= local65 * arg0;
						arg6 -= local143 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local80 * arg1;
						arg1 = 0;
					}
					local336 = arg0 - anInt3747;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (arg0 != arg1 && local95 < local65 || arg0 == arg1 && local95 > local80) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2853(Static46.anIntArray334, local5, arg0, arg5 >> 16, arg4 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local95;
									arg4 += local80;
									arg6 += local143;
									arg0 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2853(Static46.anIntArray334, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2853(Static46.anIntArray334, local5, arg0, arg4 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local95;
									arg4 += local80;
									arg6 += local143;
									arg0 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2853(Static46.anIntArray334, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local95 * arg0;
						arg3 -= local65 * arg0;
						arg6 -= local143 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local80 * arg2;
						arg2 = 0;
					}
					local336 = arg0 - anInt3747;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if ((arg0 == arg2 || local95 >= local65) && (arg0 != arg2 || local80 <= local65)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method2853(Static46.anIntArray334, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local80;
									arg3 += local65;
									arg6 += local143;
									arg0 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2853(Static46.anIntArray334, local5, arg0, arg3 >> 16, arg4 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg4 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method2853(Static46.anIntArray334, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local80;
									arg3 += local65;
									arg6 += local143;
									arg0 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2853(Static46.anIntArray334, local5, arg0, arg4 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg4 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt3746) {
				if (arg2 > anInt3746) {
					arg2 = anInt3746;
				}
				if (arg0 > anInt3746) {
					arg0 = anInt3746;
				}
				arg7 = (arg7 << 9) + local131 - local131 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local65 * arg1;
						arg4 -= local80 * arg1;
						arg7 -= local143 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local95 * arg2;
						arg2 = 0;
					}
					local336 = arg1 - anInt3747;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (arg1 != arg2 && local65 < local80 || arg1 == arg2 && local65 > local95) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method2853(Static46.anIntArray334, local5, arg1, arg3 >> 16, arg5 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local65;
									arg5 += local95;
									arg7 += local143;
									arg1 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2853(Static46.anIntArray334, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg3 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method2853(Static46.anIntArray334, local5, arg1, arg5 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local65;
									arg5 += local95;
									arg7 += local143;
									arg1 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2853(Static46.anIntArray334, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg3 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local65 * arg1;
						arg4 -= local80 * arg1;
						arg7 -= local143 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local95 * arg0;
						arg0 = 0;
					}
					local336 = arg1 - anInt3747;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (local65 < local80) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2853(Static46.anIntArray334, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local95;
									arg4 += local80;
									arg7 += local143;
									arg1 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2853(Static46.anIntArray334, local5, arg1, arg5 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2853(Static46.anIntArray334, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local95;
									arg4 += local80;
									arg7 += local143;
									arg1 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2853(Static46.anIntArray334, local5, arg1, arg4 >> 16, arg5 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (arg2 < anInt3746) {
			if (arg0 > anInt3746) {
				arg0 = anInt3746;
			}
			if (arg1 > anInt3746) {
				arg1 = anInt3746;
			}
			arg8 = (arg8 << 9) + local131 - local131 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local80 * arg2;
					arg5 -= local95 * arg2;
					arg8 -= local143 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local65 * arg0;
					arg0 = 0;
				}
				local336 = arg2 - anInt3747;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (local80 < local95) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method2853(Static46.anIntArray334, local5, arg2, arg4 >> 16, arg3 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local80;
								arg3 += local65;
								arg8 += local143;
								arg2 += Static46.anInt4199;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method2853(Static46.anIntArray334, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg4 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static46.anInt4199;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method2853(Static46.anIntArray334, local5, arg2, arg3 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local80;
								arg3 += local65;
								arg8 += local143;
								arg2 += Static46.anInt4199;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method2853(Static46.anIntArray334, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg4 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static46.anInt4199;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local80 * arg2;
					arg5 -= local95 * arg2;
					arg8 -= local143 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local65 * arg1;
					arg1 = 0;
				}
				local336 = arg2 - anInt3747;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (local80 < local95) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method2853(Static46.anIntArray334, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local65;
								arg5 += local95;
								arg8 += local143;
								arg2 += Static46.anInt4199;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method2853(Static46.anIntArray334, local5, arg2, arg3 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg3 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static46.anInt4199;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method2853(Static46.anIntArray334, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local65;
								arg5 += local95;
								arg8 += local143;
								arg2 += Static46.anInt4199;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method2853(Static46.anIntArray334, local5, arg2, arg5 >> 16, arg3 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg3 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static46.anInt4199;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
	public static void method2835() {
		anInt3748 = anInt3750 / 2;
		anInt3747 = anInt3746 / 2;
		anInt3752 = -anInt3748;
		anInt3745 = anInt3750 - anInt3748;
		anInt3749 = -anInt3747;
		anInt3744 = anInt3746 - anInt3747;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public static void method2836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		@Pc(5) int[] local5 = anInterface3_2.method2595(arg18, aFloat1);
		@Pc(12) int local12;
		if (local5 == null) {
			local12 = anInterface3_2.method2592(arg18);
			method2848(arg0, arg1, arg2, arg3, arg4, arg5, method2851(local12, arg6), method2851(local12, arg7), method2851(local12, arg8));
			return;
		}
		aBoolean210 = anInterface3_2.method2598(arg18);
		aBoolean208 = anInterface3_2.method2597(arg18);
		local12 = arg4 - arg3;
		@Pc(47) int local47 = arg1 - arg0;
		@Pc(51) int local51 = arg5 - arg3;
		@Pc(55) int local55 = arg2 - arg0;
		@Pc(59) int local59 = arg7 - arg6;
		@Pc(63) int local63 = arg8 - arg6;
		@Pc(65) int local65 = 0;
		if (arg1 != arg0) {
			local65 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(80) int local80 = 0;
		if (arg2 != arg1) {
			local80 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(95) int local95 = 0;
		if (arg2 != arg0) {
			local95 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		@Pc(116) int local116 = local12 * local55 - local51 * local47;
		if (local116 == 0) {
			return;
		}
		@Pc(131) int local131 = (local59 * local55 - local63 * local47 << 9) / local116;
		@Pc(143) int local143 = (local63 * local12 - local59 * local51 << 9) / local116;
		@Pc(147) int local147 = arg9 - arg10;
		@Pc(151) int local151 = arg12 - arg13;
		@Pc(155) int local155 = arg15 - arg16;
		@Pc(159) int local159 = arg11 - arg9;
		@Pc(163) int local163 = arg14 - arg12;
		@Pc(167) int local167 = arg17 - arg15;
		@Pc(177) int local177 = local159 * arg12 - local163 * arg9 << 14;
		@Pc(187) int local187 = local163 * arg15 - local167 * arg12 << 8;
		@Pc(197) int local197 = local167 * arg9 - local159 * arg15 << 5;
		@Pc(207) int local207 = local147 * arg12 - local151 * arg9 << 14;
		@Pc(217) int local217 = local151 * arg15 - local155 * arg12 << 8;
		@Pc(227) int local227 = local155 * arg9 - local147 * arg15 << 5;
		@Pc(237) int local237 = local151 * local159 - local147 * local163 << 14;
		@Pc(247) int local247 = local155 * local163 - local151 * local167 << 8;
		@Pc(257) int local257 = local147 * local167 - local155 * local159 << 5;
		@Pc(336) int local336;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt3746) {
				if (arg1 > anInt3746) {
					arg1 = anInt3746;
				}
				if (arg2 > anInt3746) {
					arg2 = anInt3746;
				}
				arg6 = (arg6 << 9) + local131 - local131 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local95 * arg0;
						arg3 -= local65 * arg0;
						arg6 -= local143 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local80 * arg1;
						arg1 = 0;
					}
					local336 = arg0 - anInt3747;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (arg0 != arg1 && local95 < local65 || arg0 == arg1 && local95 > local80) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2852(Static46.anIntArray334, local5, arg0, arg5 >> 16, arg4 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local95;
									arg4 += local80;
									arg6 += local143;
									arg0 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2852(Static46.anIntArray334, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2852(Static46.anIntArray334, local5, arg0, arg4 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local95;
									arg4 += local80;
									arg6 += local143;
									arg0 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2852(Static46.anIntArray334, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local95 * arg0;
						arg3 -= local65 * arg0;
						arg6 -= local143 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local80 * arg2;
						arg2 = 0;
					}
					local336 = arg0 - anInt3747;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if ((arg0 == arg2 || local95 >= local65) && (arg0 != arg2 || local80 <= local65)) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method2852(Static46.anIntArray334, local5, arg0, arg3 >> 16, arg5 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local80;
									arg3 += local65;
									arg6 += local143;
									arg0 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2852(Static46.anIntArray334, local5, arg0, arg3 >> 16, arg4 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg4 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method2852(Static46.anIntArray334, local5, arg0, arg5 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
									arg5 += local80;
									arg3 += local65;
									arg6 += local143;
									arg0 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2852(Static46.anIntArray334, local5, arg0, arg4 >> 16, arg3 >> 16, arg6, local131, local177, local207, local237, local187, local217, local247);
							arg4 += local95;
							arg3 += local65;
							arg6 += local143;
							arg0 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt3746) {
				if (arg2 > anInt3746) {
					arg2 = anInt3746;
				}
				if (arg0 > anInt3746) {
					arg0 = anInt3746;
				}
				arg7 = (arg7 << 9) + local131 - local131 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local65 * arg1;
						arg4 -= local80 * arg1;
						arg7 -= local143 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local95 * arg2;
						arg2 = 0;
					}
					local336 = arg1 - anInt3747;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (arg1 != arg2 && local65 < local80 || arg1 == arg2 && local65 > local95) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method2852(Static46.anIntArray334, local5, arg1, arg3 >> 16, arg5 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local65;
									arg5 += local95;
									arg7 += local143;
									arg1 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2852(Static46.anIntArray334, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg3 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method2852(Static46.anIntArray334, local5, arg1, arg5 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local65;
									arg5 += local95;
									arg7 += local143;
									arg1 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2852(Static46.anIntArray334, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg3 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local65 * arg1;
						arg4 -= local80 * arg1;
						arg7 -= local143 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local95 * arg0;
						arg0 = 0;
					}
					local336 = arg1 - anInt3747;
					local177 += local197 * local336;
					local207 += local227 * local336;
					local237 += local257 * local336;
					if (local65 < local80) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2852(Static46.anIntArray334, local5, arg1, arg3 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local95;
									arg4 += local80;
									arg7 += local143;
									arg1 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2852(Static46.anIntArray334, local5, arg1, arg5 >> 16, arg4 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2852(Static46.anIntArray334, local5, arg1, arg4 >> 16, arg3 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
									arg3 += local95;
									arg4 += local80;
									arg7 += local143;
									arg1 += Static46.anInt4199;
									local177 += local197;
									local207 += local227;
									local237 += local257;
								}
							}
							method2852(Static46.anIntArray334, local5, arg1, arg4 >> 16, arg5 >> 16, arg7, local131, local177, local207, local237, local187, local217, local247);
							arg5 += local65;
							arg4 += local80;
							arg7 += local143;
							arg1 += Static46.anInt4199;
							local177 += local197;
							local207 += local227;
							local237 += local257;
						}
					}
				}
			}
		} else if (arg2 < anInt3746) {
			if (arg0 > anInt3746) {
				arg0 = anInt3746;
			}
			if (arg1 > anInt3746) {
				arg1 = anInt3746;
			}
			arg8 = (arg8 << 9) + local131 - local131 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local80 * arg2;
					arg5 -= local95 * arg2;
					arg8 -= local143 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local65 * arg0;
					arg0 = 0;
				}
				local336 = arg2 - anInt3747;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (local80 < local95) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method2852(Static46.anIntArray334, local5, arg2, arg4 >> 16, arg3 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local80;
								arg3 += local65;
								arg8 += local143;
								arg2 += Static46.anInt4199;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method2852(Static46.anIntArray334, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg4 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static46.anInt4199;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method2852(Static46.anIntArray334, local5, arg2, arg3 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local80;
								arg3 += local65;
								arg8 += local143;
								arg2 += Static46.anInt4199;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method2852(Static46.anIntArray334, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg4 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static46.anInt4199;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local80 * arg2;
					arg5 -= local95 * arg2;
					arg8 -= local143 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local65 * arg1;
					arg1 = 0;
				}
				local336 = arg2 - anInt3747;
				local177 += local197 * local336;
				local207 += local227 * local336;
				local237 += local257 * local336;
				if (local80 < local95) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method2852(Static46.anIntArray334, local5, arg2, arg4 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local65;
								arg5 += local95;
								arg8 += local143;
								arg2 += Static46.anInt4199;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method2852(Static46.anIntArray334, local5, arg2, arg3 >> 16, arg5 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg3 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static46.anInt4199;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method2852(Static46.anIntArray334, local5, arg2, arg5 >> 16, arg4 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
								arg4 += local65;
								arg5 += local95;
								arg8 += local143;
								arg2 += Static46.anInt4199;
								local177 += local197;
								local207 += local227;
								local237 += local257;
							}
						}
						method2852(Static46.anIntArray334, local5, arg2, arg5 >> 16, arg3 >> 16, arg8, local131, local177, local207, local237, local187, local217, local247);
						arg3 += local80;
						arg5 += local95;
						arg8 += local143;
						arg2 += Static46.anInt4199;
						local177 += local197;
						local207 += local227;
						local237 += local257;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([IIIIIIII)V")
	private static void method2837(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (aBoolean209) {
			if (arg3 > anInt3750) {
				arg3 = anInt3750;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
		}
		if (arg2 >= arg3) {
			return;
		}
		arg1 += arg2;
		arg4 += arg5 * arg2;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(138) int local138;
		@Pc(32) int local32;
		@Pc(46) int local46;
		if (!aBoolean211) {
			local32 = arg3 - arg2;
			if (anInt3751 == 0) {
				do {
					arg0[arg1++] = anIntArray319[arg4 >> 8];
					arg4 += arg5;
					local32--;
				} while (local32 > 0);
			} else {
				local98 = anInt3751;
				local102 = 256 - anInt3751;
				do {
					local46 = anIntArray319[arg4 >> 8];
					arg4 += arg5;
					@Pc(379) int local379 = ((local46 & 0xFF00FF) * local102 >> 8 & 0xFF00FF) + ((local46 & 0xFF00) * local102 >> 8 & 0xFF00);
					local138 = arg0[arg1];
					arg0[arg1++] = local379 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
					local32--;
				} while (local32 > 0);
			}
			return;
		}
		local32 = arg3 - arg2 >> 2;
		@Pc(36) int local36 = arg5 << 2;
		@Pc(53) int local53;
		if (anInt3751 == 0) {
			if (local32 > 0) {
				do {
					local46 = anIntArray319[arg4 >> 8];
					arg4 += local36;
					local53 = arg1 + 1;
					arg0[arg1] = local46;
					@Pc(58) int local58 = local53 + 1;
					arg0[local53] = local46;
					@Pc(63) int local63 = local58 + 1;
					arg0[local58] = local46;
					arg1 = local63 + 1;
					arg0[local63] = local46;
					local32--;
				} while (local32 > 0);
			}
			local32 = arg3 - arg2 & 0x3;
			if (local32 > 0) {
				local46 = anIntArray319[arg4 >> 8];
				do {
					arg0[arg1++] = local46;
					local32--;
				} while (local32 > 0);
				return;
			}
			return;
		}
		local98 = anInt3751;
		local102 = 256 - anInt3751;
		if (local32 > 0) {
			do {
				local46 = anIntArray319[arg4 >> 8];
				arg4 += local36;
				local46 = ((local46 & 0xFF00FF) * local102 >> 8 & 0xFF00FF) + ((local46 & 0xFF00) * local102 >> 8 & 0xFF00);
				local138 = arg0[arg1];
				local53 = arg1 + 1;
				arg0[arg1] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local138 = arg0[local53];
				arg0[local53++] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local138 = arg0[local53];
				arg0[local53++] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local138 = arg0[local53];
				arg1 = local53 + 1;
				arg0[local53] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
				local32--;
			} while (local32 > 0);
		}
		local32 = arg3 - arg2 & 0x3;
		if (local32 <= 0) {
			return;
		}
		local46 = anIntArray319[arg4 >> 8];
		local46 = ((local46 & 0xFF00FF) * local102 >> 8 & 0xFF00FF) + ((local46 & 0xFF00) * local102 >> 8 & 0xFF00);
		do {
			local138 = arg0[arg1];
			arg0[arg1++] = local46 + ((local138 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local138 & 0xFF00) * local98 >> 8 & 0xFF00);
			local32--;
		} while (local32 > 0);
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "()I")
	public static int method2838() {
		return anIntArray316[0] % Static46.anInt4199;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
	private static void method2839() {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 512; local5++) {
			@Pc(15) double local15 = (double) (local5 >> 3) / 64.0D + 0.0078125D;
			@Pc(24) double local24 = (double) (local5 & 0x7) / 8.0D + 0.0625D;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				@Pc(32) double local32 = (double) local26 / 128.0D;
				@Pc(34) double local34 = local32;
				@Pc(36) double local36 = local32;
				@Pc(38) double local38 = local32;
				if (local24 != 0.0D) {
					@Pc(52) double local52;
					if (local32 < 0.5D) {
						local52 = local32 * (local24 + 1.0D);
					} else {
						local52 = local32 + local24 - local32 * local24;
					}
					@Pc(67) double local67 = local32 * 2.0D - local52;
					@Pc(71) double local71 = local15 + 0.3333333333333333D;
					if (local71 > 1.0D) {
						local71--;
					}
					@Pc(85) double local85 = local15 - 0.3333333333333333D;
					if (local85 < 0.0D) {
						local85++;
					}
					if (local71 * 6.0D < 1.0D) {
						local34 = local67 + (local52 - local67) * 6.0D * local71;
					} else if (local71 * 2.0D < 1.0D) {
						local34 = local52;
					} else if (local71 * 3.0D < 2.0D) {
						local34 = local67 + (local52 - local67) * (0.6666666666666666D - local71) * 6.0D;
					} else {
						local34 = local67;
					}
					if (local15 * 6.0D < 1.0D) {
						local36 = local67 + (local52 - local67) * 6.0D * local15;
					} else if (local15 * 2.0D < 1.0D) {
						local36 = local52;
					} else if (local15 * 3.0D < 2.0D) {
						local36 = local67 + (local52 - local67) * (0.6666666666666666D - local15) * 6.0D;
					} else {
						local36 = local67;
					}
					if (local85 * 6.0D < 1.0D) {
						local38 = local67 + (local52 - local67) * 6.0D * local85;
					} else if (local85 * 2.0D < 1.0D) {
						local38 = local52;
					} else if (local85 * 3.0D < 2.0D) {
						local38 = local67 + (local52 - local67) * (0.6666666666666666D - local85) * 6.0D;
					} else {
						local38 = local67;
					}
				}
				local34 = Math.pow(local34, (double) aFloat1);
				local36 = Math.pow(local36, (double) aFloat1);
				local38 = Math.pow(local38, (double) aFloat1);
				@Pc(254) int local254 = (int) (local34 * 256.0D);
				@Pc(259) int local259 = (int) (local36 * 256.0D);
				@Pc(264) int local264 = (int) (local38 * 256.0D);
				@Pc(274) int local274 = (local254 << 16) + (local259 << 8) + local264;
				if (local274 == 0) {
					local274 = 1;
				}
				anIntArray319[local3++] = local274;
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(F)V")
	private static void method2840(@OriginalArg(0) float arg0) {
		aFloat1 = arg0;
		aFloat1 = (float) ((double) aFloat1 + Math.random() * 0.03D - 0.015D);
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "()V")
	public static void method2841() {
		method2843(Static46.anInt4202, Static46.anInt4197, Static46.anInt4201, Static46.anInt4200);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([IIIIII)V")
	private static void method2842(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (aBoolean209) {
			if (arg4 > anInt3750) {
				arg4 = anInt3750;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg1 += arg3;
		@Pc(24) int local24 = arg4 - arg3 >> 2;
		@Pc(30) int local30;
		if (anInt3751 == 0) {
			while (true) {
				local24--;
				if (local24 < 0) {
					local24 = arg4 - arg3 & 0x3;
					while (true) {
						local24--;
						if (local24 < 0) {
							return;
						}
						arg0[arg1++] = arg2;
					}
				}
				local30 = arg1 + 1;
				arg0[arg1] = arg2;
				arg0[local30++] = arg2;
				arg0[local30++] = arg2;
				arg1 = local30 + 1;
				arg0[local30] = arg2;
			}
		} else if (anInt3751 == 254) {
			while (true) {
				local24--;
				if (local24 < 0) {
					local24 = arg4 - arg3 & 0x3;
					while (true) {
						local24--;
						if (local24 < 0) {
							return;
						}
						arg0[arg1++] = arg0[arg1];
					}
				}
				local30 = arg1 + 1;
				arg0[arg1] = arg0[local30];
				arg0[local30++] = arg0[local30];
				arg0[local30++] = arg0[local30];
				arg1 = local30 + 1;
				arg0[local30] = arg0[arg1];
			}
		} else {
			@Pc(121) int local121 = anInt3751;
			@Pc(125) int local125 = 256 - anInt3751;
			@Pc(145) int local145 = ((arg2 & 0xFF00FF) * local125 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * local125 >> 8 & 0xFF00);
			while (true) {
				local24--;
				@Pc(150) int local150;
				if (local24 < 0) {
					local24 = arg4 - arg3 & 0x3;
					while (true) {
						local24--;
						if (local24 < 0) {
							return;
						}
						local150 = arg0[arg1];
						arg0[arg1++] = local145 + ((local150 & 0xFF00FF) * local121 >> 8 & 0xFF00FF) + ((local150 & 0xFF00) * local121 >> 8 & 0xFF00);
					}
				}
				local150 = arg0[arg1];
				local30 = arg1 + 1;
				arg0[arg1] = local145 + ((local150 & 0xFF00FF) * local121 >> 8 & 0xFF00FF) + ((local150 & 0xFF00) * local121 >> 8 & 0xFF00);
				@Pc(179) int local179 = arg0[local30];
				@Pc(182) int local182 = local30 + 1;
				arg0[local30] = local145 + ((local179 & 0xFF00FF) * local121 >> 8 & 0xFF00FF) + ((local179 & 0xFF00) * local121 >> 8 & 0xFF00);
				@Pc(208) int local208 = arg0[local182];
				@Pc(211) int local211 = local182 + 1;
				arg0[local182] = local145 + ((local208 & 0xFF00FF) * local121 >> 8 & 0xFF00FF) + ((local208 & 0xFF00) * local121 >> 8 & 0xFF00);
				@Pc(237) int local237 = arg0[local211];
				arg1 = local211 + 1;
				arg0[local211] = local145 + ((local237 & 0xFF00FF) * local121 >> 8 & 0xFF00FF) + ((local237 & 0xFF00) * local121 >> 8 & 0xFF00);
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(IIII)V")
	private static void method2843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt3750 = arg2 - arg0;
		anInt3746 = arg3 - arg1;
		method2835();
		if (anIntArray316.length < anInt3746) {
			anIntArray316 = new int[Static155.method2190(anInt3746)];
		}
		@Pc(23) int local23 = arg1 * Static46.anInt4199 + arg0;
		for (@Pc(25) int local25 = 0; local25 < anInt3746; local25++) {
			anIntArray316[local25] = local23;
			local23 += Static46.anInt4199;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sg;)V")
	public static void method2845(@OriginalArg(0) Interface3 arg0) {
		anInterface3_2 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V")
	public static void method2846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aBoolean209 = arg0 < 0 || arg0 > anInt3750 || arg1 < 0 || arg1 > anInt3750 || arg2 < 0 || arg2 > anInt3750;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIIIIII)V")
	public static void method2847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = 0;
		if (arg1 != arg0) {
			local1 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		@Pc(16) int local16 = 0;
		if (arg2 != arg1) {
			local16 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(31) int local31 = 0;
		if (arg2 != arg0) {
			local31 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt3746) {
				if (arg1 > anInt3746) {
					arg1 = anInt3746;
				}
				if (arg2 > anInt3746) {
					arg2 = anInt3746;
				}
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local31 < local1 || arg0 == arg1 && local31 > local16) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2842(Static46.anIntArray334, arg0, arg6, arg5 >> 16, arg4 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static46.anInt4199;
								}
							}
							method2842(Static46.anIntArray334, arg0, arg6, arg5 >> 16, arg3 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static46.anInt4199;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2842(Static46.anIntArray334, arg0, arg6, arg4 >> 16, arg5 >> 16);
									arg5 += local31;
									arg4 += local16;
									arg0 += Static46.anInt4199;
								}
							}
							method2842(Static46.anIntArray334, arg0, arg6, arg3 >> 16, arg5 >> 16);
							arg5 += local31;
							arg3 += local1;
							arg0 += Static46.anInt4199;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local31 * arg0;
						arg3 -= local1 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local16 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local31 < local1 || arg0 == arg2 && local16 > local1) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method2842(Static46.anIntArray334, arg0, arg6, arg5 >> 16, arg3 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static46.anInt4199;
								}
							}
							method2842(Static46.anIntArray334, arg0, arg6, arg4 >> 16, arg3 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static46.anInt4199;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method2842(Static46.anIntArray334, arg0, arg6, arg3 >> 16, arg5 >> 16);
									arg5 += local16;
									arg3 += local1;
									arg0 += Static46.anInt4199;
								}
							}
							method2842(Static46.anIntArray334, arg0, arg6, arg3 >> 16, arg4 >> 16);
							arg4 += local31;
							arg3 += local1;
							arg0 += Static46.anInt4199;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt3746) {
				if (arg2 > anInt3746) {
					arg2 = anInt3746;
				}
				if (arg0 > anInt3746) {
					arg0 = anInt3746;
				}
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local31 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && local1 < local16 || arg1 == arg2 && local1 > local31) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method2842(Static46.anIntArray334, arg1, arg6, arg3 >> 16, arg5 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static46.anInt4199;
								}
							}
							method2842(Static46.anIntArray334, arg1, arg6, arg3 >> 16, arg4 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static46.anInt4199;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method2842(Static46.anIntArray334, arg1, arg6, arg5 >> 16, arg3 >> 16);
									arg3 += local1;
									arg5 += local31;
									arg1 += Static46.anInt4199;
								}
							}
							method2842(Static46.anIntArray334, arg1, arg6, arg4 >> 16, arg3 >> 16);
							arg3 += local1;
							arg4 += local16;
							arg1 += Static46.anInt4199;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local1 * arg1;
						arg4 -= local16 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local31 * arg0;
						arg0 = 0;
					}
					if (local1 < local16) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2842(Static46.anIntArray334, arg1, arg6, arg3 >> 16, arg4 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static46.anInt4199;
								}
							}
							method2842(Static46.anIntArray334, arg1, arg6, arg5 >> 16, arg4 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static46.anInt4199;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2842(Static46.anIntArray334, arg1, arg6, arg4 >> 16, arg3 >> 16);
									arg3 += local31;
									arg4 += local16;
									arg1 += Static46.anInt4199;
								}
							}
							method2842(Static46.anIntArray334, arg1, arg6, arg4 >> 16, arg5 >> 16);
							arg5 += local1;
							arg4 += local16;
							arg1 += Static46.anInt4199;
						}
					}
				}
			}
		} else if (arg2 < anInt3746) {
			if (arg0 > anInt3746) {
				arg0 = anInt3746;
			}
			if (arg1 > anInt3746) {
				arg1 = anInt3746;
			}
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local1 * arg0;
					arg0 = 0;
				}
				if (local16 < local31) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method2842(Static46.anIntArray334, arg2, arg6, arg4 >> 16, arg3 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static46.anInt4199;
							}
						}
						method2842(Static46.anIntArray334, arg2, arg6, arg4 >> 16, arg5 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static46.anInt4199;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method2842(Static46.anIntArray334, arg2, arg6, arg3 >> 16, arg4 >> 16);
								arg4 += local16;
								arg3 += local1;
								arg2 += Static46.anInt4199;
							}
						}
						method2842(Static46.anIntArray334, arg2, arg6, arg5 >> 16, arg4 >> 16);
						arg4 += local16;
						arg5 += local31;
						arg2 += Static46.anInt4199;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local16 * arg2;
					arg5 -= local31 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg1 = 0;
				}
				if (local16 < local31) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method2842(Static46.anIntArray334, arg2, arg6, arg4 >> 16, arg5 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static46.anInt4199;
							}
						}
						method2842(Static46.anIntArray334, arg2, arg6, arg3 >> 16, arg5 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static46.anInt4199;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method2842(Static46.anIntArray334, arg2, arg6, arg5 >> 16, arg4 >> 16);
								arg4 += local1;
								arg5 += local31;
								arg2 += Static46.anInt4199;
							}
						}
						method2842(Static46.anIntArray334, arg2, arg6, arg5 >> 16, arg3 >> 16);
						arg3 += local16;
						arg5 += local31;
						arg2 += Static46.anInt4199;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg4 - arg3;
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(11) int local11 = arg5 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg7 - arg6;
		@Pc(23) int local23 = arg8 - arg6;
		@Pc(36) int local36;
		if (arg2 == arg1) {
			local36 = 0;
		} else {
			local36 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		@Pc(48) int local48;
		if (arg1 == arg0) {
			local48 = 0;
		} else {
			local48 = (local3 << 16) / local7;
		}
		@Pc(60) int local60;
		if (arg2 == arg0) {
			local60 = 0;
		} else {
			local60 = (local11 << 16) / local15;
		}
		@Pc(71) int local71 = local3 * local15 - local11 * local7;
		if (local71 == 0) {
			return;
		}
		@Pc(86) int local86 = (local19 * local15 - local23 * local7 << 8) / local71;
		@Pc(98) int local98 = (local23 * local3 - local19 * local11 << 8) / local71;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt3746) {
				if (arg1 > anInt3746) {
					arg1 = anInt3746;
				}
				if (arg2 > anInt3746) {
					arg2 = anInt3746;
				}
				arg6 = (arg6 << 8) + local86 - local86 * arg3;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg5 -= local60 * arg0;
						arg3 -= local48 * arg0;
						arg6 -= local98 * arg0;
						arg0 = 0;
					}
					arg4 <<= 0x10;
					if (arg1 < 0) {
						arg4 -= local36 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && local60 < local48 || arg0 == arg1 && local60 > local36) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2837(Static46.anIntArray334, arg0, arg5 >> 16, arg4 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += Static46.anInt4199;
								}
							}
							method2837(Static46.anIntArray334, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static46.anInt4199;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2837(Static46.anIntArray334, arg0, arg4 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local60;
									arg4 += local36;
									arg6 += local98;
									arg0 += Static46.anInt4199;
								}
							}
							method2837(Static46.anIntArray334, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
							arg5 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static46.anInt4199;
						}
					}
				} else {
					arg4 = arg3 <<= 0x10;
					if (arg0 < 0) {
						arg4 -= local60 * arg0;
						arg3 -= local48 * arg0;
						arg6 -= local98 * arg0;
						arg0 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local36 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && local60 < local48 || arg0 == arg2 && local36 > local48) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method2837(Static46.anIntArray334, arg0, arg5 >> 16, arg3 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += Static46.anInt4199;
								}
							}
							method2837(Static46.anIntArray334, arg0, arg4 >> 16, arg3 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static46.anInt4199;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray316[arg0];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return;
									}
									method2837(Static46.anIntArray334, arg0, arg3 >> 16, arg5 >> 16, arg6, local86);
									arg5 += local36;
									arg3 += local48;
									arg6 += local98;
									arg0 += Static46.anInt4199;
								}
							}
							method2837(Static46.anIntArray334, arg0, arg3 >> 16, arg4 >> 16, arg6, local86);
							arg4 += local60;
							arg3 += local48;
							arg6 += local98;
							arg0 += Static46.anInt4199;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt3746) {
				if (arg2 > anInt3746) {
					arg2 = anInt3746;
				}
				if (arg0 > anInt3746) {
					arg0 = anInt3746;
				}
				arg7 = (arg7 << 8) + local86 - local86 * arg4;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg3 -= local48 * arg1;
						arg4 -= local36 * arg1;
						arg7 -= local98 * arg1;
						arg1 = 0;
					}
					arg5 <<= 0x10;
					if (arg2 < 0) {
						arg5 -= local60 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || local48 >= local36) && (arg1 != arg2 || local48 <= local60)) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method2837(Static46.anIntArray334, arg1, arg5 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += Static46.anInt4199;
								}
							}
							method2837(Static46.anIntArray334, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static46.anInt4199;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg0--;
									if (arg0 < 0) {
										return;
									}
									method2837(Static46.anIntArray334, arg1, arg3 >> 16, arg5 >> 16, arg7, local86);
									arg3 += local48;
									arg5 += local60;
									arg7 += local98;
									arg1 += Static46.anInt4199;
								}
							}
							method2837(Static46.anIntArray334, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
							arg3 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static46.anInt4199;
						}
					}
				} else {
					arg5 = arg4 <<= 0x10;
					if (arg1 < 0) {
						arg5 -= local48 * arg1;
						arg4 -= local36 * arg1;
						arg7 -= local98 * arg1;
						arg1 = 0;
					}
					arg3 <<= 0x10;
					if (arg0 < 0) {
						arg3 -= local60 * arg0;
						arg0 = 0;
					}
					if (local48 < local36) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2837(Static46.anIntArray334, arg1, arg3 >> 16, arg4 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += Static46.anInt4199;
								}
							}
							method2837(Static46.anIntArray334, arg1, arg5 >> 16, arg4 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static46.anInt4199;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray316[arg1];
						while (true) {
							arg0--;
							if (arg0 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return;
									}
									method2837(Static46.anIntArray334, arg1, arg4 >> 16, arg3 >> 16, arg7, local86);
									arg3 += local60;
									arg4 += local36;
									arg7 += local98;
									arg1 += Static46.anInt4199;
								}
							}
							method2837(Static46.anIntArray334, arg1, arg4 >> 16, arg5 >> 16, arg7, local86);
							arg5 += local48;
							arg4 += local36;
							arg7 += local98;
							arg1 += Static46.anInt4199;
						}
					}
				}
			}
		} else if (arg2 < anInt3746) {
			if (arg0 > anInt3746) {
				arg0 = anInt3746;
			}
			if (arg1 > anInt3746) {
				arg1 = anInt3746;
			}
			arg8 = (arg8 << 8) + local86 - local86 * arg5;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local36 * arg2;
					arg5 -= local60 * arg2;
					arg8 -= local98 * arg2;
					arg2 = 0;
				}
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg3 -= local48 * arg0;
					arg0 = 0;
				}
				if (local36 < local60) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method2837(Static46.anIntArray334, arg2, arg4 >> 16, arg3 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += Static46.anInt4199;
							}
						}
						method2837(Static46.anIntArray334, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static46.anInt4199;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								method2837(Static46.anIntArray334, arg2, arg3 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local36;
								arg3 += local48;
								arg8 += local98;
								arg2 += Static46.anInt4199;
							}
						}
						method2837(Static46.anIntArray334, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
						arg4 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static46.anInt4199;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= local36 * arg2;
					arg5 -= local60 * arg2;
					arg8 -= local98 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local48 * arg1;
					arg1 = 0;
				}
				if (local36 < local60) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method2837(Static46.anIntArray334, arg2, arg4 >> 16, arg5 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += Static46.anInt4199;
							}
						}
						method2837(Static46.anIntArray334, arg2, arg3 >> 16, arg5 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static46.anInt4199;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray316[arg2];
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								method2837(Static46.anIntArray334, arg2, arg5 >> 16, arg4 >> 16, arg8, local86);
								arg4 += local48;
								arg5 += local60;
								arg8 += local98;
								arg2 += Static46.anInt4199;
							}
						}
						method2837(Static46.anIntArray334, arg2, arg5 >> 16, arg3 >> 16, arg8, local86);
						arg3 += local36;
						arg5 += local60;
						arg8 += local98;
						arg2 += Static46.anInt4199;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(II)V")
	public static void method2849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = anIntArray316[0];
		@Pc(7) int local7 = local3 / Static46.anInt4199;
		@Pc(13) int local13 = local3 - local7 * Static46.anInt4199;
		anInt3748 = arg0 - local13;
		anInt3747 = arg1 - local7;
		anInt3752 = -anInt3748;
		anInt3745 = anInt3750 - anInt3748;
		anInt3749 = -anInt3747;
		anInt3744 = anInt3746 - anInt3747;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(F)V")
	public static void method2850(@OriginalArg(0) float arg0) {
		method2840(arg0);
		method2839();
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(II)I")
	private static int method2851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method2852(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		if (aBoolean209) {
			if (arg4 > anInt3750) {
				arg4 = anInt3750;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg5 += arg6 * arg3;
		@Pc(28) int local28 = arg4 - arg3;
		@Pc(140) int local140;
		@Pc(128) int local128;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(62) int local62;
		@Pc(34) int local34;
		@Pc(114) int local114;
		@Pc(157) int local157;
		@Pc(136) int local136;
		@Pc(42) int local42;
		@Pc(50) int local50;
		@Pc(58) int local58;
		@Pc(154) int local154;
		if (!aBoolean210) {
			local34 = arg3 - anInt3748;
			local42 = arg7 + (arg10 >> 3) * local34;
			local50 = arg8 + (arg11 >> 3) * local34;
			local58 = arg9 + (arg12 >> 3) * local34;
			local62 = local58 >> 14;
			if (local62 == 0) {
				local68 = 0;
				local72 = 0;
			} else {
				local68 = local42 / local62;
				local72 = local50 / local62;
			}
			arg7 = local42 + arg10;
			arg8 = local50 + arg11;
			arg9 = local58 + arg12;
			local62 = arg9 >> 14;
			if (local62 == 0) {
				local99 = 0;
				local103 = 0;
			} else {
				local99 = arg7 / local62;
				local103 = arg8 / local62;
			}
			local114 = (local68 << 18) + local72;
			local128 = (local99 - local68 >> 3 << 18) + (local103 - local72 >> 3);
			local28 >>= 0x3;
			local136 = arg6 << 3;
			local140 = arg5 >> 8;
			if (aBoolean208) {
				if (local28 > 0) {
					do {
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						local157 = arg2 + 1;
						arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg2 = local157 + 1;
						arg0[local157] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local68 = local99;
						local72 = local103;
						arg7 += arg10;
						arg8 += arg11;
						arg9 += arg12;
						local62 = arg9 >> 14;
						if (local62 == 0) {
							local99 = 0;
							local103 = 0;
						} else {
							local99 = arg7 / local62;
							local103 = arg8 / local62;
						}
						local114 = (local68 << 18) + local72;
						local128 = (local99 - local68 >> 3 << 18) + (local103 - local72 >> 3);
						arg5 += local136;
						local140 = arg5 >> 8;
						local28--;
					} while (local28 > 0);
				}
				local28 = arg4 - arg3 & 0x7;
				if (local28 > 0) {
					do {
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local28--;
					} while (local28 > 0);
					return;
				}
			} else {
				if (local28 > 0) {
					do {
						@Pc(1470) int local1470;
						if ((local1470 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[arg2] = ((local1470 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1470 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157 = arg2 + 1;
						local114 += local128;
						@Pc(1507) int local1507;
						if ((local1507 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1507 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1507 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1544) int local1544;
						if ((local1544 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1544 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1544 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1581) int local1581;
						if ((local1581 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1581 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1581 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1618) int local1618;
						if ((local1618 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1618 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1618 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1655) int local1655;
						if ((local1655 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1655 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1655 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1692) int local1692;
						if ((local1692 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1692 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1692 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1729) int local1729;
						if ((local1729 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1729 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1729 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						arg2 = local157 + 1;
						local68 = local99;
						local72 = local103;
						arg7 += arg10;
						arg8 += arg11;
						arg9 += arg12;
						local62 = arg9 >> 14;
						if (local62 == 0) {
							local99 = 0;
							local103 = 0;
						} else {
							local99 = arg7 / local62;
							local103 = arg8 / local62;
						}
						local114 = (local68 << 18) + local72;
						local128 = (local99 - local68 >> 3 << 18) + (local103 - local72 >> 3);
						arg5 += local136;
						local140 = arg5 >> 8;
						local28--;
					} while (local28 > 0);
				}
				local28 = arg4 - arg3 & 0x7;
				if (local28 > 0) {
					do {
						@Pc(1840) int local1840;
						if ((local1840 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[arg2] = ((local1840 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1840 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						arg2++;
						local114 += local128;
						local28--;
					} while (local28 > 0);
				}
			}
			return;
		}
		local34 = arg3 - anInt3748;
		local42 = arg7 + (arg10 >> 3) * local34;
		local50 = arg8 + (arg11 >> 3) * local34;
		local58 = arg9 + (arg12 >> 3) * local34;
		local62 = local58 >> 12;
		if (local62 == 0) {
			local68 = 0;
			local72 = 0;
		} else {
			local68 = local42 / local62;
			local72 = local50 / local62;
		}
		arg7 = local42 + arg10;
		arg8 = local50 + arg11;
		arg9 = local58 + arg12;
		local62 = arg9 >> 12;
		if (local62 == 0) {
			local99 = 0;
			local103 = 0;
		} else {
			local99 = arg7 / local62;
			local103 = arg8 / local62;
		}
		local114 = (local68 << 20) + local72;
		local128 = (local99 - local68 >> 3 << 20) + (local103 - local72 >> 3);
		local28 >>= 0x3;
		local136 = arg6 << 3;
		local140 = arg5 >> 8;
		if (aBoolean208) {
			if (local28 > 0) {
				do {
					local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					local157 = arg2 + 1;
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(189) int local189 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local189 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local189 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(224) int local224 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local224 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local224 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(259) int local259 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local259 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local259 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(294) int local294 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local294 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local294 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(329) int local329 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local329 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local329 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(364) int local364 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local364 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local364 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(399) int local399 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg2 = local157 + 1;
					arg0[local157] = ((local399 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local399 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local68 = local99;
					local72 = local103;
					arg7 += arg10;
					arg8 += arg11;
					arg9 += arg12;
					local62 = arg9 >> 12;
					if (local62 == 0) {
						local99 = 0;
						local103 = 0;
					} else {
						local99 = arg7 / local62;
						local103 = arg8 / local62;
					}
					local114 = (local68 << 20) + local72;
					local128 = (local99 - local68 >> 3 << 20) + (local103 - local72 >> 3);
					arg5 += local136;
					local140 = arg5 >> 8;
					local28--;
				} while (local28 > 0);
			}
			local28 = arg4 - arg3 & 0x7;
			if (local28 > 0) {
				do {
					local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					local28--;
				} while (local28 > 0);
				return;
			}
			return;
		}
		if (local28 > 0) {
			do {
				@Pc(550) int local550;
				if ((local550 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[arg2] = ((local550 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local550 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157 = arg2 + 1;
				local114 += local128;
				@Pc(587) int local587;
				if ((local587 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local587 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local587 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(624) int local624;
				if ((local624 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local624 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local624 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(661) int local661;
				if ((local661 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local661 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local661 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(698) int local698;
				if ((local698 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local698 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local698 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(735) int local735;
				if ((local735 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local735 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local735 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(772) int local772;
				if ((local772 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local772 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local772 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(809) int local809;
				if ((local809 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local809 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local809 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2 = local157 + 1;
				local68 = local99;
				local72 = local103;
				arg7 += arg10;
				arg8 += arg11;
				arg9 += arg12;
				local62 = arg9 >> 12;
				if (local62 == 0) {
					local99 = 0;
					local103 = 0;
				} else {
					local99 = arg7 / local62;
					local103 = arg8 / local62;
				}
				local114 = (local68 << 20) + local72;
				local128 = (local99 - local68 >> 3 << 20) + (local103 - local72 >> 3);
				arg5 += local136;
				local140 = arg5 >> 8;
				local28--;
			} while (local28 > 0);
		}
		local28 = arg4 - arg3 & 0x7;
		if (local28 <= 0) {
			return;
		}
		do {
			@Pc(920) int local920;
			if ((local920 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
				arg0[arg2] = ((local920 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local920 & 0xFF00) * local140 & 0xFF0000) >> 8;
			}
			arg2++;
			local114 += local128;
			local28--;
		} while (local28 > 0);
		return;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "([I[IIIIIIIIIIIIII)V")
	private static void method2853(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12) {
		if (aBoolean209) {
			if (arg4 > anInt3750) {
				arg4 = anInt3750;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		arg2 += arg3;
		arg5 += arg6 * arg3;
		@Pc(28) int local28 = arg4 - arg3;
		@Pc(140) int local140;
		@Pc(128) int local128;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(56) int local56;
		@Pc(34) int local34;
		@Pc(114) int local114;
		@Pc(157) int local157;
		@Pc(136) int local136;
		@Pc(40) int local40;
		@Pc(46) int local46;
		@Pc(52) int local52;
		@Pc(154) int local154;
		if (!aBoolean210) {
			local34 = arg3 - anInt3748;
			local40 = arg7 + arg10 * local34;
			local46 = arg8 + arg11 * local34;
			local52 = arg9 + arg12 * local34;
			local56 = local52 >> 14;
			if (local56 == 0) {
				local62 = 0;
				local66 = 0;
			} else {
				local62 = local40 / local56;
				local66 = local46 / local56;
			}
			local40 += arg10 * local28;
			local46 += arg11 * local28;
			local52 += arg12 * local28;
			local56 = local52 >> 14;
			if (local56 == 0) {
				local99 = 0;
				local103 = 0;
			} else {
				local99 = local40 / local56;
				local103 = local46 / local56;
			}
			local114 = (local62 << 18) + local66;
			local128 = ((local99 - local62) / local28 << 18) + (local103 - local66) / local28;
			local28 >>= 0x3;
			local136 = arg6 << 3;
			local140 = arg5 >> 8;
			if (aBoolean208) {
				if (local28 > 0) {
					do {
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						local157 = arg2 + 1;
						arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[local157++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg2 = local157 + 1;
						arg0[local157] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						arg5 += local136;
						local140 = arg5 >> 8;
						local28--;
					} while (local28 > 0);
				}
				local28 = arg4 - arg3 & 0x7;
				if (local28 > 0) {
					do {
						local154 = arg1[(local114 & 0x3F80) + (local114 >>> 25)];
						arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
						local114 += local128;
						local28--;
					} while (local28 > 0);
					return;
				}
			} else {
				if (local28 > 0) {
					do {
						@Pc(1305) int local1305;
						if ((local1305 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[arg2] = ((local1305 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1305 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157 = arg2 + 1;
						local114 += local128;
						@Pc(1342) int local1342;
						if ((local1342 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1342 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1342 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1379) int local1379;
						if ((local1379 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1379 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1379 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1416) int local1416;
						if ((local1416 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1416 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1416 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1453) int local1453;
						if ((local1453 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1453 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1453 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1490) int local1490;
						if ((local1490 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1490 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1490 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1527) int local1527;
						if ((local1527 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1527 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1527 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						local157++;
						local114 += local128;
						@Pc(1564) int local1564;
						if ((local1564 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[local157] = ((local1564 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1564 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						arg2 = local157 + 1;
						local114 += local128;
						arg5 += local136;
						local140 = arg5 >> 8;
						local28--;
					} while (local28 > 0);
				}
				local28 = arg4 - arg3 & 0x7;
				if (local28 > 0) {
					do {
						@Pc(1620) int local1620;
						if ((local1620 = arg1[(local114 & 0x3F80) + (local114 >>> 25)]) != 0) {
							arg0[arg2] = ((local1620 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local1620 & 0xFF00) * local140 & 0xFF0000) >> 8;
						}
						arg2++;
						local114 += local128;
						local28--;
					} while (local28 > 0);
				}
			}
			return;
		}
		local34 = arg3 - anInt3748;
		local40 = arg7 + arg10 * local34;
		local46 = arg8 + arg11 * local34;
		local52 = arg9 + arg12 * local34;
		local56 = local52 >> 12;
		if (local56 == 0) {
			local62 = 0;
			local66 = 0;
		} else {
			local62 = local40 / local56;
			local66 = local46 / local56;
		}
		local40 += arg10 * local28;
		local46 += arg11 * local28;
		local52 += arg12 * local28;
		local56 = local52 >> 12;
		if (local56 == 0) {
			local99 = 0;
			local103 = 0;
		} else {
			local99 = local40 / local56;
			local103 = local46 / local56;
		}
		local114 = (local62 << 20) + local66;
		local128 = ((local99 - local62) / local28 << 20) + (local103 - local66) / local28;
		local28 >>= 0x3;
		local136 = arg6 << 3;
		local140 = arg5 >> 8;
		if (aBoolean208) {
			if (local28 > 0) {
				do {
					local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					local157 = arg2 + 1;
					arg0[arg2] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(189) int local189 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local189 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local189 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(224) int local224 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local224 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local224 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(259) int local259 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local259 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local259 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(294) int local294 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local294 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local294 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(329) int local329 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local329 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local329 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(364) int local364 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[local157++] = ((local364 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local364 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					@Pc(399) int local399 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg2 = local157 + 1;
					arg0[local157] = ((local399 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local399 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					arg5 += local136;
					local140 = arg5 >> 8;
					local28--;
				} while (local28 > 0);
			}
			local28 = arg4 - arg3 & 0x7;
			if (local28 > 0) {
				do {
					local154 = arg1[(local114 & 0xFC0) + (local114 >>> 26)];
					arg0[arg2++] = ((local154 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local154 & 0xFF00) * local140 & 0xFF0000) >> 8;
					local114 += local128;
					local28--;
				} while (local28 > 0);
				return;
			}
			return;
		}
		if (local28 > 0) {
			do {
				@Pc(495) int local495;
				if ((local495 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[arg2] = ((local495 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local495 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157 = arg2 + 1;
				local114 += local128;
				@Pc(532) int local532;
				if ((local532 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local532 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local532 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(569) int local569;
				if ((local569 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local569 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local569 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(606) int local606;
				if ((local606 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local606 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local606 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(643) int local643;
				if ((local643 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local643 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local643 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(680) int local680;
				if ((local680 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local680 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local680 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(717) int local717;
				if ((local717 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local717 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local717 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				local157++;
				local114 += local128;
				@Pc(754) int local754;
				if ((local754 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
					arg0[local157] = ((local754 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local754 & 0xFF00) * local140 & 0xFF0000) >> 8;
				}
				arg2 = local157 + 1;
				local114 += local128;
				arg5 += local136;
				local140 = arg5 >> 8;
				local28--;
			} while (local28 > 0);
		}
		local28 = arg4 - arg3 & 0x7;
		if (local28 <= 0) {
			return;
		}
		do {
			@Pc(810) int local810;
			if ((local810 = arg1[(local114 & 0xFC0) + (local114 >>> 26)]) != 0) {
				arg0[arg2] = ((local810 & 0xFF00FF) * local140 & 0xFF00FF00) + ((local810 & 0xFF00) * local140 & 0xFF0000) >> 8;
			}
			arg2++;
			local114 += local128;
			local28--;
		} while (local28 > 0);
		return;
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "()I")
	public static int method2854() {
		return anIntArray316[0] / Static46.anInt4199;
	}
}

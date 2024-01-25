import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "Lclient!oja;")
	public static Class256 aClass256_7;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
	public static int anInt6092;

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_12 = new Class336(10, -1);

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "J")
	public static volatile long aLong198 = 0L;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!ka;Lclient!el;IIII)V")
	public static void method5500(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			arg1.method2543(arg0.fa(), arg2, arg0.RA(), arg0.EA(), arg0.HA(), arg0.na(), arg0.V(), arg4, arg3, arg0.G());
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	public static void method5501() {
		Static651.anInt10356 = 0;
		Static360.anInt5808++;
		Static28.anInt551 = 0;
		Static621.method8748();
		Static100.method1769();
		Static476.method6893();
		@Pc(21) boolean local21 = false;
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static651.anInt10356; local23++) {
			local29 = Static96.anIntArray149[local23];
			@Pc(36) Class3_Sub3 local36 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local29);
			@Pc(39) Class28_Sub1_Sub1_Sub1_Sub2 local39 = local36.aClass28_Sub1_Sub1_Sub1_Sub2_1;
			if (Static43.aBoolean74 && Static662.method9137(local29)) {
				Static286.method4531();
			}
			if (local39.anInt10786 != Static360.anInt5808) {
				if (local39.aClass300_1.method7268()) {
					Static666.method9184(local39);
				}
				local39.method9335((Class300) null);
				local21 = true;
				local36.method9380();
			}
		}
		if (local21) {
			Static567.anInt5909 = Static522.aClass83_34.method2378();
			Static522.aClass83_34.method2367(Static84.aClass3_Sub3Array1);
		}
		if (Static210.aClass3_Sub25_Sub1_3.anInt9765 != Static467.anInt7682) {
			throw new RuntimeException("gnp1 pos:" + Static210.aClass3_Sub25_Sub1_3.anInt9765 + " psize:" + Static467.anInt7682);
		}
		for (local29 = 0; local29 < Static561.anInt9114; local29++) {
			if (Static522.aClass83_34.method2368((long) Static131.anIntArray226[local29]) == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static561.anInt9114);
			}
		}
		if (Static567.anInt5909 - Static561.anInt9114 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static567.anInt5909 - Static561.anInt9114));
		}
		for (@Pc(169) int local169 = 0; local169 < Static567.anInt5909; local169++) {
			if (Static360.anInt5808 != Static84.aClass3_Sub3Array1[local169].aClass28_Sub1_Sub1_Sub1_Sub2_1.anInt10786) {
				throw new RuntimeException("gnp4 uk:" + Static84.aClass3_Sub3Array1[local169].aClass28_Sub1_Sub1_Sub1_Sub2_1.anInt10762);
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIII)V")
	public static void method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static532.anInt8768 = arg2;
		Static322.anInt5378 = arg4;
		Static225.anInt4206 = arg1;
		Static72.anInt1357 = arg0;
		Static676.anInt10886 = arg3;
		if (Static72.anInt1357 >= 100) {
			@Pc(29) int local29 = Static225.anInt4206 * 512 + 256;
			@Pc(35) int local35 = Static532.anInt8768 * 512 + 256;
			@Pc(44) int local44 = Static168.method3058(Static309.anInt5138, local29, local35) - Static322.anInt5378;
			@Pc(49) int local49 = local29 - Static509.anInt8222;
			@Pc(54) int local54 = local44 - Static146.anInt2945;
			@Pc(59) int local59 = local35 - Static652.anInt10382;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local59 * local59 + local49 * local49));
			Static520.anInt8367 = (int) (Math.atan2((double) local54, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static57.anInt1188 = (int) (Math.atan2((double) local49, (double) local59) * -2607.5945876176133D) & 0x3FFF;
			if (Static520.anInt8367 < 1024) {
				Static520.anInt8367 = 1024;
			}
			Static631.anInt10060 = 0;
			if (Static520.anInt8367 > 3072) {
				Static520.anInt8367 = 3072;
			}
		}
		Static153.anInt3036 = -1;
		Static410.anInt6542 = -1;
		Static428.anInt6834 = 2;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIII[B)V")
	public static void method5504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		arg2 += arg0;
		@Pc(24) int local24 = arg1 - arg0 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg1 - arg0 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(29) int local29 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg2 = local39 + 1;
			arg3[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method5505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 > 2000 || arg7 > 2000 || arg5 > 2000 || arg0 > 2000 || arg2 > 2000 || arg1 > 2000) {
			return false;
		} else if (arg6 >= -2000 && arg7 >= -2000 && arg5 >= -2000 && arg0 >= -2000 && arg2 >= -2000 && arg1 >= -2000) {
			@Pc(62) int local62;
			if (Static15.anInt8490 == 2) {
				local62 = Static39.anInt907 * arg6 + arg0;
				if (local62 >= 0 && Static78.anIntArray318.length > local62 && (arg8 << 8) - 38400 < Static78.anIntArray318[local62]) {
					return false;
				}
				local62 = arg2 + arg7 * Static39.anInt907;
				if (local62 >= 0 && local62 < Static78.anIntArray318.length && Static78.anIntArray318[local62] > (arg3 << 8) - 38400) {
					return false;
				}
				local62 = arg1 + arg5 * Static39.anInt907;
				if (local62 >= 0 && Static78.anIntArray318.length > local62 && (arg4 << 8) - 38400 < Static78.anIntArray318[local62]) {
					return false;
				}
			}
			local62 = arg2 - arg0;
			@Pc(147) int local147 = arg7 - arg6;
			@Pc(152) int local152 = arg1 - arg0;
			@Pc(157) int local157 = arg5 - arg6;
			@Pc(161) int local161 = arg3 - arg8;
			if (arg6 < arg7 && arg5 > arg5) {
				if (arg5 >= arg7) {
					arg5++;
				} else {
					arg7++;
				}
				arg6--;
			} else if (arg5 > arg7) {
				arg7--;
				if (arg5 >= arg6) {
					arg5++;
				} else {
					arg6++;
				}
			} else {
				arg5--;
				if (arg7 < arg6) {
					arg6++;
				} else {
					arg7++;
				}
			}
			@Pc(211) int local211 = arg4 - arg8;
			@Pc(213) int local213 = 0;
			if (arg6 != arg7) {
				local213 = (arg2 - arg0 << 12) / (arg7 - arg6);
			}
			@Pc(234) int local234 = 0;
			if (arg5 != arg7) {
				local234 = (arg1 - arg2 << 12) / (arg5 - arg7);
			}
			@Pc(251) int local251 = 0;
			if (arg6 != arg5) {
				local251 = (arg0 - arg1 << 12) / (arg6 - arg5);
			}
			@Pc(278) int local278 = local157 * local62 - local147 * local152;
			if (local278 == 0) {
				return false;
			}
			@Pc(298) int local298 = (local157 * local161 - local147 * local211 << 8) / local278;
			@Pc(310) int local310 = (local62 * local211 - local161 * local152 << 8) / local278;
			if (arg7 >= arg6 && arg5 >= arg6) {
				if (arg6 >= Static254.anInt4533) {
					return true;
				}
				arg8 = local298 + (arg8 << 8) - arg0 * local298;
				if (arg7 > Static254.anInt4533) {
					arg7 = Static254.anInt4533;
				}
				if (arg5 > Static254.anInt4533) {
					arg5 = Static254.anInt4533;
				}
				if (arg5 <= arg7) {
					arg2 = arg0 <<= 0xC;
					if (arg6 < 0) {
						arg8 -= local310 * arg6;
						arg2 -= local251 * arg6;
						arg0 -= local213 * arg6;
						arg6 = 0;
					}
					arg1 <<= 0xC;
					if (arg5 < 0) {
						arg1 -= arg5 * local234;
						arg5 = 0;
					}
					if ((arg6 == arg5 || local213 <= local251) && (arg6 != arg5 || local213 >= local234)) {
						arg7 -= arg5;
						arg5 -= arg6;
						arg6 = Static39.anInt907 * arg6;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg6, arg8, (arg0 >> 12) - 1, (arg1 >> 12) - -1)) {
										return false;
									}
									arg1 += local234;
									arg8 += local310;
									arg0 += local213;
									arg6 += Static39.anInt907;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg6, arg8, (arg0 >> 12) - 1, (arg2 >> 12) + 1)) {
								return false;
							}
							arg8 += local310;
							arg2 += local251;
							arg0 += local213;
							arg6 += Static39.anInt907;
						}
					} else {
						arg7 -= arg5;
						arg5 -= arg6;
						arg6 *= Static39.anInt907;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg6, arg8, (arg1 >> 12) - 1, (arg0 >> 12) + 1)) {
										return false;
									}
									arg8 += local310;
									arg1 += local234;
									arg6 += Static39.anInt907;
									arg0 += local213;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg6, arg8, (arg2 >> 12) - 1, (arg0 >> 12) + 1)) {
								return false;
							}
							arg2 += local251;
							arg0 += local213;
							arg8 += local310;
							arg6 += Static39.anInt907;
						}
					}
				} else {
					arg1 = arg0 <<= 0xC;
					arg2 <<= 0xC;
					if (arg6 < 0) {
						arg0 -= arg6 * local213;
						arg1 -= local251 * arg6;
						arg8 -= arg6 * local310;
						arg6 = 0;
					}
					if (arg7 < 0) {
						arg2 -= local234 * arg7;
						arg7 = 0;
					}
					if ((arg7 == arg6 || local213 <= local251) && (arg7 != arg6 || local234 >= local251)) {
						arg5 -= arg7;
						arg7 -= arg6;
						arg6 *= Static39.anInt907;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg6, arg8, (arg2 >> 12) - 1, (arg1 >> 12) + 1)) {
										return false;
									}
									arg1 += local251;
									arg8 += local310;
									arg6 += Static39.anInt907;
									arg2 += local234;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg6, arg8, (arg0 >> 12) - 1, (arg1 >> 12) + 1)) {
								return false;
							}
							arg6 += Static39.anInt907;
							arg0 += local213;
							arg1 += local251;
							arg8 += local310;
						}
					} else {
						arg5 -= arg7;
						arg7 -= arg6;
						arg6 = Static39.anInt907 * arg6;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg6, arg8, (arg1 >> 12) - 1, (arg2 >> 12) - -1)) {
										return false;
									}
									arg6 += Static39.anInt907;
									arg1 += local251;
									arg2 += local234;
									arg8 += local310;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg6, arg8, (arg1 >> 12) - 1, (arg0 >> 12) - -1)) {
								return false;
							}
							arg6 += Static39.anInt907;
							arg8 += local310;
							arg1 += local251;
							arg0 += local213;
						}
					}
				}
			} else if (arg5 < arg7) {
				if (Static254.anInt4533 <= arg5) {
					return true;
				}
				if (arg7 > Static254.anInt4533) {
					arg7 = Static254.anInt4533;
				}
				if (Static254.anInt4533 < arg6) {
					arg6 = Static254.anInt4533;
				}
				arg4 = local298 + (arg4 << 8) - arg1 * local298;
				if (arg7 <= arg6) {
					arg0 = arg1 <<= 0xC;
					if (arg5 < 0) {
						arg0 -= arg5 * local234;
						arg4 -= local310 * arg5;
						arg1 -= arg5 * local251;
						arg5 = 0;
					}
					arg2 <<= 0xC;
					if (arg7 < 0) {
						arg2 -= local213 * arg7;
						arg7 = 0;
					}
					if (local234 < local251) {
						arg6 -= arg7;
						arg7 -= arg5;
						arg5 = Static39.anInt907 * arg5;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg5, arg4, (arg2 >> 12) - 1, (arg1 >> 12) - -1)) {
										return false;
									}
									arg1 += local251;
									arg4 += local310;
									arg2 += local213;
									arg5 += Static39.anInt907;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg5, arg4, (arg0 >> 12) - 1, (arg1 >> 12) + 1)) {
								return false;
							}
							arg0 += local234;
							arg5 += Static39.anInt907;
							arg4 += local310;
							arg1 += local251;
						}
					} else {
						arg6 -= arg7;
						arg7 -= arg5;
						arg5 = Static39.anInt907 * arg5;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg5, arg4, (arg1 >> 12) - 1, (arg2 >> 12) + 1)) {
										return false;
									}
									arg5 += Static39.anInt907;
									arg2 += local213;
									arg1 += local251;
									arg4 += local310;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg5, arg4, (arg1 >> 12) - 1, (arg0 >> 12) + 1)) {
								return false;
							}
							arg5 += Static39.anInt907;
							arg0 += local234;
							arg1 += local251;
							arg4 += local310;
						}
					}
				} else {
					arg2 = arg1 <<= 0xC;
					arg0 <<= 0xC;
					if (arg5 < 0) {
						arg4 -= arg5 * local310;
						arg1 -= local251 * arg5;
						arg2 -= arg5 * local234;
						arg5 = 0;
					}
					if (arg6 < 0) {
						arg0 -= arg6 * local213;
						arg6 = 0;
					}
					if (local234 < local251) {
						arg7 -= arg6;
						arg6 -= arg5;
						arg5 = Static39.anInt907 * arg5;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg5, arg4, (arg2 >> 12) - 1, (arg0 >> 12) - -1)) {
										return false;
									}
									arg5 += Static39.anInt907;
									arg2 += local234;
									arg0 += local213;
									arg4 += local310;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg5, arg4, (arg2 >> 12) - 1, (arg1 >> 12) - -1)) {
								return false;
							}
							arg5 += Static39.anInt907;
							arg2 += local234;
							arg1 += local251;
							arg4 += local310;
						}
					} else {
						arg7 -= arg6;
						arg6 -= arg5;
						arg5 *= Static39.anInt907;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg5, arg4, (arg0 >> 12) - 1, (arg2 >> 12) + 1)) {
										return false;
									}
									arg2 += local234;
									arg4 += local310;
									arg0 += local213;
									arg5 += Static39.anInt907;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg5, arg4, (arg1 >> 12) - 1, (arg2 >> 12) + 1)) {
								return false;
							}
							arg2 += local234;
							arg4 += local310;
							arg5 += Static39.anInt907;
							arg1 += local251;
						}
					}
				}
			} else if (arg7 >= Static254.anInt4533) {
				return true;
			} else {
				if (Static254.anInt4533 < arg6) {
					arg6 = Static254.anInt4533;
				}
				arg3 = (arg3 << 8) + local298 - local298 * arg2;
				if (Static254.anInt4533 < arg5) {
					arg5 = Static254.anInt4533;
				}
				if (arg5 >= arg6) {
					arg1 = arg2 <<= 0xC;
					if (arg7 < 0) {
						arg2 -= arg7 * local234;
						arg1 -= local213 * arg7;
						arg3 -= local310 * arg7;
						arg7 = 0;
					}
					arg0 <<= 0xC;
					if (arg6 < 0) {
						arg0 -= arg6 * local251;
						arg6 = 0;
					}
					if (local234 <= local213) {
						arg5 -= arg6;
						arg6 -= arg7;
						arg7 = Static39.anInt907 * arg7;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg7, arg3, (arg2 >> 12) - 1, (arg0 >> 12) + 1)) {
										return false;
									}
									arg2 += local234;
									arg7 += Static39.anInt907;
									arg3 += local310;
									arg0 += local251;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg7, arg3, (arg2 >> 12) - 1, (arg1 >> 12) + 1)) {
								return false;
							}
							arg1 += local213;
							arg7 += Static39.anInt907;
							arg2 += local234;
							arg3 += local310;
						}
					} else {
						arg5 -= arg6;
						arg6 -= arg7;
						arg7 = Static39.anInt907 * arg7;
						while (true) {
							arg6--;
							if (arg6 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg7, arg3, (arg0 >> 12) - 1, (arg2 >> 12) + 1)) {
										return false;
									}
									arg2 += local234;
									arg0 += local251;
									arg7 += Static39.anInt907;
									arg3 += local310;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg7, arg3, (arg1 >> 12) - 1, (arg2 >> 12) + 1)) {
								return false;
							}
							arg1 += local213;
							arg7 += Static39.anInt907;
							arg3 += local310;
							arg2 += local234;
						}
					}
				} else {
					arg0 = arg2 <<= 0xC;
					arg1 <<= 0xC;
					if (arg7 < 0) {
						arg3 -= arg7 * local310;
						arg2 -= arg7 * local234;
						arg0 -= local213 * arg7;
						arg7 = 0;
					}
					if (arg5 < 0) {
						arg1 -= local251 * arg5;
						arg5 = 0;
					}
					if (arg5 != arg7 && local213 < local234 || arg5 == arg7 && local251 < local213) {
						arg6 -= arg5;
						arg5 -= arg7;
						arg7 *= Static39.anInt907;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg7, arg3, (arg0 >> 12) - 1, (arg1 >> 12) - -1)) {
										return false;
									}
									arg7 += Static39.anInt907;
									arg1 += local251;
									arg3 += local310;
									arg0 += local213;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg7, arg3, (arg0 >> 12) - 1, (arg2 >> 12) - -1)) {
								return false;
							}
							arg2 += local234;
							arg7 += Static39.anInt907;
							arg3 += local310;
							arg0 += local213;
						}
					} else {
						arg6 -= arg5;
						arg5 -= arg7;
						arg7 *= Static39.anInt907;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg6--;
									if (arg6 < 0) {
										return true;
									}
									if (!Static357.method5253(local298, Static78.anIntArray318, arg7, arg3, (arg1 >> 12) - 1, (arg0 >> 12) + 1)) {
										return false;
									}
									arg3 += local310;
									arg1 += local251;
									arg7 += Static39.anInt907;
									arg0 += local213;
								}
							}
							if (!Static357.method5253(local298, Static78.anIntArray318, arg7, arg3, (arg2 >> 12) - 1, (arg0 >> 12) + 1)) {
								return false;
							}
							arg7 += Static39.anInt907;
							arg2 += local234;
							arg3 += local310;
							arg0 += local213;
						}
					}
				}
			}
		} else {
			return false;
		}
	}
}

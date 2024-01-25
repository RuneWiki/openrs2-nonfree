import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!st", name = "g", descriptor = "Lclient!ll;")
	public static Class216 aClass216_2;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!td;Lclient!wia;)V")
	public static void method7803(@OriginalArg(1) Class333 arg0, @OriginalArg(2) Class386 arg1) {
		Static656.aString117 = "";
		Static486.aClass333_6 = arg0;
		Static617.aClass386_128 = arg1;
		if (Class17_Sub1_Sub1.aString105.startsWith("win")) {
			Static656.aString117 = Static656.aString117 + "windows/";
		} else if (Class17_Sub1_Sub1.aString105.startsWith("linux")) {
			Static656.aString117 = Static656.aString117 + "linux/";
		} else if (Class17_Sub1_Sub1.aString105.startsWith("mac")) {
			Static656.aString117 = Static656.aString117 + "macos/";
		}
		if (Static486.aClass333_6.aBoolean694) {
			Static656.aString117 = Static656.aString117 + "msjava/";
		} else if (Class17_Sub1_Sub1.aString104.startsWith("amd64") || Class17_Sub1_Sub1.aString104.startsWith("x86_64")) {
			Static656.aString117 = Static656.aString117 + "x86_64/";
		} else if (Class17_Sub1_Sub1.aString104.startsWith("i386") || Class17_Sub1_Sub1.aString104.startsWith("i486") || Class17_Sub1_Sub1.aString104.startsWith("i586") || Class17_Sub1_Sub1.aString104.startsWith("x86")) {
			Static656.aString117 = Static656.aString117 + "x86/";
		} else if (Class17_Sub1_Sub1.aString104.startsWith("ppc")) {
			Static656.aString117 = Static656.aString117 + "ppc/";
		} else {
			Static656.aString117 = Static656.aString117 + "universal/";
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!fb;BZII)V")
	public static void method7804(@OriginalArg(0) Class12_Sub2_Sub2_Sub1_Sub2 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray241[0];
		@Pc(15) int local15 = arg0.anIntArray242[0];
		if (local10 < 0 || Static26.anInt462 <= local10 || local15 < 0 || Static445.anInt6140 <= local15 || (arg1 < 0 || arg1 >= Static26.anInt462 || arg2 < 0 || arg2 >= Static445.anInt6140)) {
			return;
		}
		@Pc(73) int local73 = Static254.method3732(-4, 0, 0, arg1, Static226.aClass226Array3[arg0.aByte146], true, arg0.method2422(), Static422.anIntArray562, local10, 0, 0, local15, Static314.anIntArray437, arg2);
		if (local73 >= 1 && local73 <= 3) {
			for (@Pc(83) int local83 = 0; local83 < local73 - 1; local83++) {
				arg0.method2437(Static422.anIntArray562[local83], (byte) 2, Static314.anIntArray437[local83]);
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)V")
	public static void method7805(@OriginalArg(1) int arg0) {
		Static665.anInt4336 = arg0;
		Static629.aClass264_62.method6360();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIIBIII)Z")
	public static boolean method7808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 > 2000 || arg7 > 2000 || arg8 > 2000 || arg6 > 2000 || arg3 > 2000 || arg2 > 2000) {
			return false;
		} else if (arg5 >= -2000 && arg7 >= -2000 && arg8 >= -2000 && arg6 >= -2000 && arg3 >= -2000 && arg2 >= -2000) {
			@Pc(60) int local60;
			if (Static38.anInt993 == 2) {
				local60 = arg5 * Static429.anInt4560 + arg6;
				if (local60 >= 0 && Static643.anIntArray801.length > local60 && Static643.anIntArray801[local60] > (arg0 << 8) - 38400) {
					return false;
				}
				local60 = Static429.anInt4560 * arg7 + arg3;
				if (local60 >= 0 && local60 < Static643.anIntArray801.length && Static643.anIntArray801[local60] > (arg4 << 8) - 38400) {
					return false;
				}
				local60 = Static429.anInt4560 * arg8 + arg2;
				if (local60 >= 0 && Static643.anIntArray801.length > local60 && (arg1 << 8) - 38400 < Static643.anIntArray801[local60]) {
					return false;
				}
			}
			local60 = arg3 - arg6;
			@Pc(155) int local155 = arg7 - arg5;
			@Pc(160) int local160 = arg2 - arg6;
			@Pc(165) int local165 = arg8 - arg5;
			@Pc(170) int local170 = arg4 - arg0;
			@Pc(175) int local175 = arg1 - arg0;
			if (arg7 > arg5 && arg8 > arg8) {
				if (arg7 > arg8) {
					arg7++;
				} else {
					arg8++;
				}
				arg5--;
			} else if (arg7 >= arg8) {
				if (arg5 <= arg7) {
					arg7++;
				} else {
					arg5++;
				}
				arg8--;
			} else {
				arg7--;
				if (arg5 > arg8) {
					arg5++;
				} else {
					arg8++;
				}
			}
			@Pc(218) int local218 = 0;
			if (arg7 != arg5) {
				local218 = (arg3 - arg6 << 12) / (arg7 - arg5);
			}
			@Pc(237) int local237 = 0;
			if (arg8 != arg7) {
				local237 = (arg2 - arg3 << 12) / (arg8 - arg7);
			}
			@Pc(254) int local254 = 0;
			if (arg5 != arg8) {
				local254 = (arg6 - arg2 << 12) / (arg5 - arg8);
			}
			@Pc(280) int local280 = local60 * local165 - local160 * local155;
			if (local280 == 0) {
				return false;
			}
			@Pc(300) int local300 = (local170 * local165 - local155 * local175 << 8) / local280;
			@Pc(312) int local312 = (local60 * local175 - local170 * local160 << 8) / local280;
			if (arg5 <= arg7 && arg5 <= arg8) {
				if (arg5 >= Static415.anInt7538) {
					return true;
				}
				arg0 = local300 + (arg0 << 8) - arg6 * local300;
				if (Static415.anInt7538 < arg8) {
					arg8 = Static415.anInt7538;
				}
				if (Static415.anInt7538 < arg7) {
					arg7 = Static415.anInt7538;
				}
				if (arg7 >= arg8) {
					arg3 = arg6 <<= 0xC;
					if (arg5 < 0) {
						arg6 -= local218 * arg5;
						arg0 -= arg5 * local312;
						arg3 -= arg5 * local254;
						arg5 = 0;
					}
					arg2 <<= 0xC;
					if (arg8 < 0) {
						arg2 -= arg8 * local237;
						arg8 = 0;
					}
					if ((arg8 == arg5 || local254 >= local218) && (arg5 != arg8 || local237 <= local218)) {
						arg7 -= arg8;
						arg8 -= arg5;
						arg5 = Static429.anInt4560 * arg5;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static318.method5026((arg2 >> 12) + 1, arg5, arg0, local300, (arg6 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg6 += local218;
									arg2 += local237;
									arg5 += Static429.anInt4560;
									arg0 += local312;
								}
							}
							if (!Static318.method5026((arg3 >> 12) + 1, arg5, arg0, local300, (arg6 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg0 += local312;
							arg5 += Static429.anInt4560;
							arg6 += local218;
							arg3 += local254;
						}
					} else {
						arg7 -= arg8;
						arg8 -= arg5;
						arg5 *= Static429.anInt4560;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static318.method5026((arg6 >> 12) + 1, arg5, arg0, local300, (arg2 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg0 += local312;
									arg6 += local218;
									arg5 += Static429.anInt4560;
									arg2 += local237;
								}
							}
							if (!Static318.method5026((arg6 >> 12) + 1, arg5, arg0, local300, (arg3 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg0 += local312;
							arg3 += local254;
							arg5 += Static429.anInt4560;
							arg6 += local218;
						}
					}
				} else {
					arg2 = arg6 <<= 0xC;
					if (arg5 < 0) {
						arg0 -= local312 * arg5;
						arg6 -= arg5 * local218;
						arg2 -= arg5 * local254;
						arg5 = 0;
					}
					arg3 <<= 0xC;
					if (arg7 < 0) {
						arg3 -= arg7 * local237;
						arg7 = 0;
					}
					if (arg5 != arg7 && local254 < local218 || arg5 == arg7 && local237 < local254) {
						arg8 -= arg7;
						arg7 -= arg5;
						arg5 = Static429.anInt4560 * arg5;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static318.method5026((arg3 >> 12) + 1, arg5, arg0, local300, (arg2 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg2 += local254;
									arg0 += local312;
									arg5 += Static429.anInt4560;
									arg3 += local237;
								}
							}
							if (!Static318.method5026((arg6 >> 12) + 1, arg5, arg0, local300, (arg2 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg6 += local218;
							arg2 += local254;
							arg5 += Static429.anInt4560;
							arg0 += local312;
						}
					} else {
						arg8 -= arg7;
						arg7 -= arg5;
						arg5 *= Static429.anInt4560;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static318.method5026((arg2 >> 12) + 1, arg5, arg0, local300, (arg3 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg2 += local254;
									arg0 += local312;
									arg3 += local237;
									arg5 += Static429.anInt4560;
								}
							}
							if (!Static318.method5026((arg2 >> 12) + 1, arg5, arg0, local300, (arg6 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg2 += local254;
							arg6 += local218;
							arg5 += Static429.anInt4560;
							arg0 += local312;
						}
					}
				}
			} else if (arg8 < arg7) {
				if (arg8 >= Static415.anInt7538) {
					return true;
				}
				if (Static415.anInt7538 < arg7) {
					arg7 = Static415.anInt7538;
				}
				if (Static415.anInt7538 < arg5) {
					arg5 = Static415.anInt7538;
				}
				arg1 = local300 + (arg1 << 8) - arg2 * local300;
				if (arg7 > arg5) {
					arg3 = arg2 <<= 0xC;
					if (arg8 < 0) {
						arg2 -= arg8 * local254;
						arg3 -= arg8 * local237;
						arg1 -= arg8 * local312;
						arg8 = 0;
					}
					arg6 <<= 0xC;
					if (arg5 < 0) {
						arg6 -= local218 * arg5;
						arg5 = 0;
					}
					if (local237 < local254) {
						arg7 -= arg5;
						arg5 -= arg8;
						arg8 = Static429.anInt4560 * arg8;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static318.method5026((arg6 >> 12) + 1, arg8, arg1, local300, (arg3 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg8 += Static429.anInt4560;
									arg1 += local312;
									arg6 += local218;
									arg3 += local237;
								}
							}
							if (!Static318.method5026((arg2 >> 12) + 1, arg8, arg1, local300, (arg3 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg2 += local254;
							arg8 += Static429.anInt4560;
							arg3 += local237;
							arg1 += local312;
						}
					} else {
						arg7 -= arg5;
						arg5 -= arg8;
						arg8 = Static429.anInt4560 * arg8;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg7--;
									if (arg7 < 0) {
										return true;
									}
									if (!Static318.method5026((arg3 >> 12) + 1, arg8, arg1, local300, (arg6 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg6 += local218;
									arg1 += local312;
									arg3 += local237;
									arg8 += Static429.anInt4560;
								}
							}
							if (!Static318.method5026((arg3 >> 12) + 1, arg8, arg1, local300, (arg2 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg8 += Static429.anInt4560;
							arg3 += local237;
							arg2 += local254;
							arg1 += local312;
						}
					}
				} else {
					arg6 = arg2 <<= 0xC;
					arg3 <<= 0xC;
					if (arg8 < 0) {
						arg2 -= local254 * arg8;
						arg6 -= local237 * arg8;
						arg1 -= local312 * arg8;
						arg8 = 0;
					}
					if (arg7 < 0) {
						arg3 -= local218 * arg7;
						arg7 = 0;
					}
					if (local254 > local237) {
						arg5 -= arg7;
						arg7 -= arg8;
						arg8 *= Static429.anInt4560;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static318.method5026((arg2 >> 12) + 1, arg8, arg1, local300, (arg3 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg8 += Static429.anInt4560;
									arg1 += local312;
									arg2 += local254;
									arg3 += local218;
								}
							}
							if (!Static318.method5026((arg2 >> 12) + 1, arg8, arg1, local300, (arg6 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg8 += Static429.anInt4560;
							arg1 += local312;
							arg6 += local237;
							arg2 += local254;
						}
					} else {
						arg5 -= arg7;
						arg7 -= arg8;
						arg8 *= Static429.anInt4560;
						while (true) {
							arg7--;
							if (arg7 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static318.method5026((arg3 >> 12) + 1, arg8, arg1, local300, (arg2 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg8 += Static429.anInt4560;
									arg1 += local312;
									arg2 += local254;
									arg3 += local218;
								}
							}
							if (!Static318.method5026((arg6 >> 12) + 1, arg8, arg1, local300, (arg2 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg1 += local312;
							arg8 += Static429.anInt4560;
							arg6 += local237;
							arg2 += local254;
						}
					}
				}
			} else if (arg7 >= Static415.anInt7538) {
				return true;
			} else {
				if (arg8 > Static415.anInt7538) {
					arg8 = Static415.anInt7538;
				}
				if (arg5 > Static415.anInt7538) {
					arg5 = Static415.anInt7538;
				}
				arg4 = (arg4 << 8) + (local300 - (arg3 * local300));
				if (arg5 <= arg8) {
					arg2 = arg3 <<= 0xC;
					if (arg7 < 0) {
						arg2 -= local218 * arg7;
						arg4 -= arg7 * local312;
						arg3 -= arg7 * local237;
						arg7 = 0;
					}
					arg6 <<= 0xC;
					if (arg5 < 0) {
						arg6 -= local254 * arg5;
						arg5 = 0;
					}
					if (local218 < local237) {
						arg8 -= arg5;
						arg5 -= arg7;
						arg7 = Static429.anInt4560 * arg7;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static318.method5026((arg3 >> 12) + 1, arg7, arg4, local300, (arg6 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg4 += local312;
									arg7 += Static429.anInt4560;
									arg6 += local254;
									arg3 += local237;
								}
							}
							if (!Static318.method5026((arg3 >> 12) + 1, arg7, arg4, local300, (arg2 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg3 += local237;
							arg7 += Static429.anInt4560;
							arg4 += local312;
							arg2 += local218;
						}
					} else {
						arg8 -= arg5;
						arg5 -= arg7;
						arg7 *= Static429.anInt4560;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg8--;
									if (arg8 < 0) {
										return true;
									}
									if (!Static318.method5026((arg6 >> 12) + 1, arg7, arg4, local300, (arg3 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg3 += local237;
									arg7 += Static429.anInt4560;
									arg4 += local312;
									arg6 += local254;
								}
							}
							if (!Static318.method5026((arg2 >> 12) + 1, arg7, arg4, local300, (arg3 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg4 += local312;
							arg2 += local218;
							arg3 += local237;
							arg7 += Static429.anInt4560;
						}
					}
				} else {
					arg6 = arg3 <<= 0xC;
					if (arg7 < 0) {
						arg4 -= arg7 * local312;
						arg3 -= local237 * arg7;
						arg6 -= local218 * arg7;
						arg7 = 0;
					}
					arg2 <<= 0xC;
					if (arg8 < 0) {
						arg2 -= arg8 * local254;
						arg8 = 0;
					}
					if (arg7 != arg8 && local218 < local237 || arg7 == arg8 && local218 > local254) {
						arg5 -= arg8;
						arg8 -= arg7;
						arg7 *= Static429.anInt4560;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static318.method5026((arg2 >> 12) + 1, arg7, arg4, local300, (arg6 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg2 += local254;
									arg6 += local218;
									arg4 += local312;
									arg7 += Static429.anInt4560;
								}
							}
							if (!Static318.method5026((arg3 >> 12) + 1, arg7, arg4, local300, (arg6 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg6 += local218;
							arg7 += Static429.anInt4560;
							arg4 += local312;
							arg3 += local237;
						}
					} else {
						arg5 -= arg8;
						arg8 -= arg7;
						arg7 = Static429.anInt4560 * arg7;
						while (true) {
							arg8--;
							if (arg8 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static318.method5026((arg6 >> 12) + 1, arg7, arg4, local300, (arg2 >> 12) - 1, Static643.anIntArray801)) {
										return false;
									}
									arg2 += local254;
									arg6 += local218;
									arg4 += local312;
									arg7 += Static429.anInt4560;
								}
							}
							if (!Static318.method5026((arg6 >> 12) + 1, arg7, arg4, local300, (arg3 >> 12) - 1, Static643.anIntArray801)) {
								return false;
							}
							arg7 += Static429.anInt4560;
							arg3 += local237;
							arg6 += local218;
							arg4 += local312;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)Z")
	public static boolean method7811(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!wia;BLclient!d;)V")
	public static void method7812(@OriginalArg(0) Class386 arg0, @OriginalArg(2) Interface3 arg1) {
		Static132.anInterface3_1 = arg1;
		Static391.aClass386_89 = arg0;
	}
}

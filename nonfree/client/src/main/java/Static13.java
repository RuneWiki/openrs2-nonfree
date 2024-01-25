import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString100 = null;

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "Lclient!ss;")
	public static final Class340 aClass340_9 = new Class340("", 15);

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
	public static int anInt8389 = 0;

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray49 = new String[100];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7471(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static340.anInt6395; local16++) {
			if (arg0.equalsIgnoreCase(Static438.aStringArray47[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method7472(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static245.aClass18Array14 == Static93.aClass18Array33) {
			return;
		}
		@Pc(10) int local10 = Static549.aClass18Array30[arg1].method8542(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class18 local23 = Static549.aClass18Array30[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method8542(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method7473() {
		Static300.aClass2_Sub26_Sub3_8.method7010();
		Static311.anInt5615 = 1;
		Static151.aClass2_Sub26_Sub3_5 = null;
		Static337.aClass124_71 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZIIIIIII)Z")
	public static boolean method7475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 > 2000 || arg1 > 2000 || arg2 > 2000 || arg8 > 2000 || arg6 > 2000 || arg3 > 2000) {
			return false;
		} else if (arg5 >= -2000 && arg1 >= -2000 && arg2 >= -2000 && arg8 >= -2000 && arg6 >= -2000 && arg3 >= -2000) {
			@Pc(64) int local64;
			if (Static507.anInt9029 == 2) {
				local64 = arg8 + Static171.anInt3607 * arg5;
				if (local64 >= 0 && local64 < Static553.anIntArray490.length && Static553.anIntArray490[local64] > (arg7 << 8) - 38400) {
					return false;
				}
				local64 = arg1 * Static171.anInt3607 + arg6;
				if (local64 >= 0 && Static553.anIntArray490.length > local64 && Static553.anIntArray490[local64] > (arg0 << 8) - 38400) {
					return false;
				}
				local64 = arg3 + Static171.anInt3607 * arg2;
				if (local64 >= 0 && Static553.anIntArray490.length > local64 && Static553.anIntArray490[local64] > (arg4 << 8) - 38400) {
					return false;
				}
			}
			local64 = arg6 - arg8;
			@Pc(166) int local166 = arg1 - arg5;
			@Pc(171) int local171 = arg3 - arg8;
			@Pc(176) int local176 = arg2 - arg5;
			@Pc(180) int local180 = arg0 - arg7;
			if (arg1 > arg5 && arg2 > arg2) {
				arg5--;
				if (arg2 < arg1) {
					arg1++;
				} else {
					arg2++;
				}
			} else if (arg2 > arg1) {
				if (arg5 > arg2) {
					arg5++;
				} else {
					arg2++;
				}
				arg1--;
			} else {
				if (arg5 <= arg1) {
					arg1++;
				} else {
					arg5++;
				}
				arg2--;
			}
			@Pc(229) int local229 = arg4 - arg7;
			@Pc(231) int local231 = 0;
			if (arg5 != arg1) {
				local231 = (arg6 - arg8 << 12) / (arg1 - arg5);
			}
			@Pc(248) int local248 = 0;
			if (arg1 != arg2) {
				local248 = (arg3 - arg6 << 12) / (arg2 - arg1);
			}
			@Pc(269) int local269 = 0;
			if (arg2 != arg5) {
				local269 = (arg8 - arg3 << 12) / (arg5 - arg2);
			}
			@Pc(293) int local293 = local64 * local176 - local171 * local166;
			if (local293 == 0) {
				return false;
			}
			@Pc(313) int local313 = (local180 * local176 - local166 * local229 << 8) / local293;
			@Pc(326) int local326 = (local229 * local64 - local171 * local180 << 8) / local293;
			if (arg1 >= arg5 && arg5 <= arg2) {
				if (arg5 >= Static167.anInt3590) {
					return true;
				}
				if (arg1 > Static167.anInt3590) {
					arg1 = Static167.anInt3590;
				}
				if (arg2 > Static167.anInt3590) {
					arg2 = Static167.anInt3590;
				}
				arg7 = (arg7 << 8) + local313 - arg8 * local313;
				if (arg2 <= arg1) {
					arg6 = arg8 <<= 0xC;
					if (arg5 < 0) {
						arg8 -= arg5 * local231;
						arg6 -= local269 * arg5;
						arg7 -= arg5 * local326;
						arg5 = 0;
					}
					arg3 <<= 0xC;
					if (arg2 < 0) {
						arg3 -= local248 * arg2;
						arg2 = 0;
					}
					if ((arg2 == arg5 || local231 <= local269) && (arg5 != arg2 || local248 <= local231)) {
						arg1 -= arg2;
						arg2 -= arg5;
						arg5 *= Static171.anInt3607;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg8 >> 12) - 1, arg7, arg5, local313, (arg3 >> 12) + 1)) {
										return false;
									}
									arg8 += local231;
									arg7 += local326;
									arg3 += local248;
									arg5 += Static171.anInt3607;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg8 >> 12) - 1, arg7, arg5, local313, (arg6 >> 12) + 1)) {
								return false;
							}
							arg8 += local231;
							arg6 += local269;
							arg5 += Static171.anInt3607;
							arg7 += local326;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg5;
						arg5 = Static171.anInt3607 * arg5;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg3 >> 12) - 1, arg7, arg5, local313, (arg8 >> 12) + 1)) {
										return false;
									}
									arg3 += local248;
									arg8 += local231;
									arg5 += Static171.anInt3607;
									arg7 += local326;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg6 >> 12) - 1, arg7, arg5, local313, (arg8 >> 12) + 1)) {
								return false;
							}
							arg7 += local326;
							arg8 += local231;
							arg6 += local269;
							arg5 += Static171.anInt3607;
						}
					}
				} else {
					arg3 = arg8 <<= 0xC;
					if (arg5 < 0) {
						arg8 -= local231 * arg5;
						arg7 -= arg5 * local326;
						arg3 -= local269 * arg5;
						arg5 = 0;
					}
					arg6 <<= 0xC;
					if (arg1 < 0) {
						arg6 -= arg1 * local248;
						arg1 = 0;
					}
					if (arg5 != arg1 && local231 > local269 || arg5 == arg1 && local248 < local269) {
						arg2 -= arg1;
						arg1 -= arg5;
						arg5 *= Static171.anInt3607;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg3 >> 12) - 1, arg7, arg5, local313, (arg6 >> 12) + 1)) {
										return false;
									}
									arg3 += local269;
									arg5 += Static171.anInt3607;
									arg6 += local248;
									arg7 += local326;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg3 >> 12) - 1, arg7, arg5, local313, (arg8 >> 12) + 1)) {
								return false;
							}
							arg7 += local326;
							arg5 += Static171.anInt3607;
							arg8 += local231;
							arg3 += local269;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg5;
						arg5 *= Static171.anInt3607;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg6 >> 12) - 1, arg7, arg5, local313, (arg3 >> 12) + 1)) {
										return false;
									}
									arg7 += local326;
									arg5 += Static171.anInt3607;
									arg3 += local269;
									arg6 += local248;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg8 >> 12) - 1, arg7, arg5, local313, (arg3 >> 12) + 1)) {
								return false;
							}
							arg5 += Static171.anInt3607;
							arg8 += local231;
							arg7 += local326;
							arg3 += local269;
						}
					}
				}
			} else if (arg2 < arg1) {
				if (arg2 >= Static167.anInt3590) {
					return true;
				}
				arg4 = local313 + (arg4 << 8) - local313 * arg3;
				if (arg1 > Static167.anInt3590) {
					arg1 = Static167.anInt3590;
				}
				if (Static167.anInt3590 < arg5) {
					arg5 = Static167.anInt3590;
				}
				if (arg1 > arg5) {
					arg6 = arg3 <<= 0xC;
					arg8 <<= 0xC;
					if (arg2 < 0) {
						arg6 -= arg2 * local248;
						arg3 -= local269 * arg2;
						arg4 -= local326 * arg2;
						arg2 = 0;
					}
					if (arg5 < 0) {
						arg8 -= arg5 * local231;
						arg5 = 0;
					}
					if (local248 < local269) {
						arg1 -= arg5;
						arg5 -= arg2;
						arg2 *= Static171.anInt3607;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg6 >> 12) - 1, arg4, arg2, local313, (arg8 >> 12) + 1)) {
										return false;
									}
									arg8 += local231;
									arg6 += local248;
									arg4 += local326;
									arg2 += Static171.anInt3607;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg6 >> 12) - 1, arg4, arg2, local313, (arg3 >> 12) + 1)) {
								return false;
							}
							arg2 += Static171.anInt3607;
							arg4 += local326;
							arg6 += local248;
							arg3 += local269;
						}
					} else {
						arg1 -= arg5;
						arg5 -= arg2;
						arg2 *= Static171.anInt3607;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg1--;
									if (arg1 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg8 >> 12) - 1, arg4, arg2, local313, (arg6 >> 12) + 1)) {
										return false;
									}
									arg2 += Static171.anInt3607;
									arg4 += local326;
									arg8 += local231;
									arg6 += local248;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg3 >> 12) - 1, arg4, arg2, local313, (arg6 >> 12) + 1)) {
								return false;
							}
							arg2 += Static171.anInt3607;
							arg6 += local248;
							arg3 += local269;
							arg4 += local326;
						}
					}
				} else {
					arg8 = arg3 <<= 0xC;
					arg6 <<= 0xC;
					if (arg2 < 0) {
						arg3 -= local269 * arg2;
						arg8 -= local248 * arg2;
						arg4 -= local326 * arg2;
						arg2 = 0;
					}
					if (arg1 < 0) {
						arg6 -= local231 * arg1;
						arg1 = 0;
					}
					if (local269 <= local248) {
						arg5 -= arg1;
						arg1 -= arg2;
						arg2 *= Static171.anInt3607;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg3 >> 12) - 1, arg4, arg2, local313, (arg6 >> 12) + 1)) {
										return false;
									}
									arg2 += Static171.anInt3607;
									arg3 += local269;
									arg6 += local231;
									arg4 += local326;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg3 >> 12) - 1, arg4, arg2, local313, (arg8 >> 12) + 1)) {
								return false;
							}
							arg4 += local326;
							arg3 += local269;
							arg8 += local248;
							arg2 += Static171.anInt3607;
						}
					} else {
						arg5 -= arg1;
						arg1 -= arg2;
						arg2 = Static171.anInt3607 * arg2;
						while (true) {
							arg1--;
							if (arg1 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg6 >> 12) - 1, arg4, arg2, local313, (arg3 >> 12) + 1)) {
										return false;
									}
									arg2 += Static171.anInt3607;
									arg6 += local231;
									arg4 += local326;
									arg3 += local269;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg8 >> 12) - 1, arg4, arg2, local313, (arg3 >> 12) + 1)) {
								return false;
							}
							arg8 += local248;
							arg2 += Static171.anInt3607;
							arg4 += local326;
							arg3 += local269;
						}
					}
				}
			} else if (arg1 >= Static167.anInt3590) {
				return true;
			} else {
				if (Static167.anInt3590 < arg5) {
					arg5 = Static167.anInt3590;
				}
				if (arg2 > Static167.anInt3590) {
					arg2 = Static167.anInt3590;
				}
				arg0 = (arg0 << 8) + local313 - arg6 * local313;
				if (arg5 > arg2) {
					arg8 = arg6 <<= 0xC;
					if (arg1 < 0) {
						arg6 -= arg1 * local248;
						arg0 -= arg1 * local326;
						arg8 -= arg1 * local231;
						arg1 = 0;
					}
					arg3 <<= 0xC;
					if (arg2 < 0) {
						arg3 -= local269 * arg2;
						arg2 = 0;
					}
					if (arg2 != arg1 && local231 < local248 || arg1 == arg2 && local231 > local269) {
						arg5 -= arg2;
						arg2 -= arg1;
						arg1 *= Static171.anInt3607;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg8 >> 12) - 1, arg0, arg1, local313, (arg3 >> 12) + 1)) {
										return false;
									}
									arg3 += local269;
									arg1 += Static171.anInt3607;
									arg8 += local231;
									arg0 += local326;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg8 >> 12) - 1, arg0, arg1, local313, (arg6 >> 12) + 1)) {
								return false;
							}
							arg1 += Static171.anInt3607;
							arg6 += local248;
							arg0 += local326;
							arg8 += local231;
						}
					} else {
						arg5 -= arg2;
						arg2 -= arg1;
						arg1 *= Static171.anInt3607;
						while (true) {
							arg2--;
							if (arg2 < 0) {
								while (true) {
									arg5--;
									if (arg5 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg3 >> 12) - 1, arg0, arg1, local313, (arg8 >> 12) + 1)) {
										return false;
									}
									arg8 += local231;
									arg3 += local269;
									arg0 += local326;
									arg1 += Static171.anInt3607;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg6 >> 12) - 1, arg0, arg1, local313, (arg8 >> 12) + 1)) {
								return false;
							}
							arg0 += local326;
							arg6 += local248;
							arg1 += Static171.anInt3607;
							arg8 += local231;
						}
					}
				} else {
					arg3 = arg6 <<= 0xC;
					if (arg1 < 0) {
						arg6 -= local248 * arg1;
						arg3 -= local231 * arg1;
						arg0 -= arg1 * local326;
						arg1 = 0;
					}
					arg8 <<= 0xC;
					if (arg5 < 0) {
						arg8 -= local269 * arg5;
						arg5 = 0;
					}
					if (local231 < local248) {
						arg2 -= arg5;
						arg5 -= arg1;
						arg1 = Static171.anInt3607 * arg1;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg8 >> 12) - 1, arg0, arg1, local313, (arg6 >> 12) + 1)) {
										return false;
									}
									arg6 += local248;
									arg0 += local326;
									arg1 += Static171.anInt3607;
									arg8 += local269;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg3 >> 12) - 1, arg0, arg1, local313, (arg6 >> 12) + 1)) {
								return false;
							}
							arg3 += local231;
							arg0 += local326;
							arg6 += local248;
							arg1 += Static171.anInt3607;
						}
					} else {
						arg2 -= arg5;
						arg5 -= arg1;
						arg1 *= Static171.anInt3607;
						while (true) {
							arg5--;
							if (arg5 < 0) {
								while (true) {
									arg2--;
									if (arg2 < 0) {
										return true;
									}
									if (!Static319.method5280(Static553.anIntArray490, (arg6 >> 12) - 1, arg0, arg1, local313, (arg8 >> 12) + 1)) {
										return false;
									}
									arg8 += local269;
									arg6 += local248;
									arg1 += Static171.anInt3607;
									arg0 += local326;
								}
							}
							if (!Static319.method5280(Static553.anIntArray490, (arg6 >> 12) - 1, arg0, arg1, local313, (arg3 >> 12) + 1)) {
								return false;
							}
							arg6 += local248;
							arg3 += local231;
							arg1 += Static171.anInt3607;
							arg0 += local326;
						}
					}
				}
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIZI[Lclient!uf;)V")
	public static void method7476(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class357[] arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg4.length; local3++) {
			@Pc(14) Class357 local14 = arg4[local3];
			if (local14 != null && local14.anInt10449 == arg0) {
				Static233.method4208(arg3, arg2, arg1, local14);
				Static645.method8762(arg3, arg2, local14);
				if (local14.anInt10403 > local14.anInt10393 - local14.anInt10395) {
					local14.anInt10403 = local14.anInt10393 - local14.anInt10395;
				}
				if (local14.anInt10413 - local14.anInt10465 < local14.anInt10458) {
					local14.anInt10458 = local14.anInt10413 - local14.anInt10465;
				}
				if (local14.anInt10403 < 0) {
					local14.anInt10403 = 0;
				}
				if (local14.anInt10458 < 0) {
					local14.anInt10458 = 0;
				}
				if (local14.anInt10430 == 0) {
					Static171.method3357(arg1, local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZ)V")
	public static void method7477(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class2_Sub12 local10 = (Class2_Sub12) Static158.aClass271_21.method7177(); local10 != null; local10 = (Class2_Sub12) Static158.aClass271_21.method7175()) {
			if (local10.aClass2_Sub26_Sub5_1 != null) {
				Static270.aClass2_Sub26_Sub4_2.method7390(local10.aClass2_Sub26_Sub5_1);
				local10.aClass2_Sub26_Sub5_1 = null;
			}
			if (local10.aClass2_Sub26_Sub5_2 != null) {
				Static270.aClass2_Sub26_Sub4_2.method7390(local10.aClass2_Sub26_Sub5_2);
				local10.aClass2_Sub26_Sub5_2 = null;
			}
			local10.method9825();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(51) Class2_Sub12 local51 = (Class2_Sub12) Static148.aClass271_11.method7177(); local51 != null; local51 = (Class2_Sub12) Static148.aClass271_11.method7175()) {
			if (local51.aClass2_Sub26_Sub5_1 != null) {
				Static270.aClass2_Sub26_Sub4_2.method7390(local51.aClass2_Sub26_Sub5_1);
				local51.aClass2_Sub26_Sub5_1 = null;
			}
			local51.method9825();
		}
		for (@Pc(78) Class2_Sub12 local78 = (Class2_Sub12) Static555.aClass335_42.method8358(); local78 != null; local78 = (Class2_Sub12) Static555.aClass335_42.method8355()) {
			if (local78.aClass2_Sub26_Sub5_1 != null) {
				Static270.aClass2_Sub26_Sub4_2.method7390(local78.aClass2_Sub26_Sub5_1);
				local78.aClass2_Sub26_Sub5_1 = null;
			}
			local78.method9825();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIII)I")
	public static int method7478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static245.aClass18Array14 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(24) int local24 = arg2 >> 9;
			@Pc(28) int local28 = arg4 >> 9;
			if (arg3 < 0 || arg0 < 0 || Static222.anInt4533 - 1 < arg3 || arg0 > Static668.anInt11370 - 1) {
				return 0;
			} else if (local24 >= 1 && local28 >= 1 && local24 <= Static222.anInt4533 - 1 && local28 <= Static668.anInt11370 - 1) {
				@Pc(88) boolean local88 = (Static96.aByteArrayArrayArray10[1][arg2 >> 9][arg4 >> 9] & 0x2) != 0;
				@Pc(116) boolean local116;
				@Pc(135) boolean local135;
				if ((arg2 & 0x1FF) == 0) {
					local116 = (Static96.aByteArrayArrayArray10[1][local24 - 1][arg4 >> 9] & 0x2) != 0;
					local135 = (Static96.aByteArrayArrayArray10[1][local24][arg4 >> 9] & 0x2) != 0;
					if (local135 != local116) {
						local88 = (Static96.aByteArrayArrayArray10[1][arg3][arg0] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x1FF) == 0) {
					local116 = (Static96.aByteArrayArrayArray10[1][arg2 >> 9][local28 - 1] & 0x2) != 0;
					local135 = (Static96.aByteArrayArrayArray10[1][arg2 >> 9][local28] & 0x2) != 0;
					if (local116 != local135) {
						local88 = (Static96.aByteArrayArrayArray10[1][arg3][arg0] & 0x2) != 0;
					}
				}
				if (local88) {
					arg1++;
				}
				return Static245.aClass18Array14[arg1].method8542(arg4, arg2);
			} else {
				return 0;
			}
		} else {
			return Static245.aClass18Array14[arg1].method8542(arg4, arg2);
		}
	}
}

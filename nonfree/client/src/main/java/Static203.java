import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_65 = new Class37(5);

	@OriginalMember(owner = "client!nl", name = "N", descriptor = "[S")
	public static short[] aShortArray59 = new short[256];

	@OriginalMember(owner = "client!nl", name = "O", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30 = null;

	@OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
	public static int anInt4293 = 99;

	@OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
	public static int anInt4294 = 1;

	@OriginalMember(owner = "client!nl", name = "T", descriptor = "S")
	public static short aShort68 = 256;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3683(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static295.anInt5953; local19++) {
			if (arg0.equalsIgnoreCase(Static301.aStringArray36[local19])) {
				return local19;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)Z")
	public static boolean method3685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static235.method5310(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static263.aClass12Array2[arg0].method2704(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static286.anInt5739) {
					if (!Static62.method5782(local10, local23, local14)) {
						return false;
					}
					if (!Static62.method5782(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static62.method5782(local10, local27, local14)) {
						return false;
					}
					if (!Static62.method5782(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static62.method5782(local10, local31, local14)) {
					return false;
				}
				if (!Static62.method5782(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static55.anInt1333) {
					if (!Static62.method5782(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static62.method5782(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static62.method5782(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static62.method5782(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static62.method5782(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static62.method5782(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static286.anInt5739) {
					if (!Static62.method5782(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static62.method5782(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static62.method5782(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static62.method5782(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static62.method5782(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static62.method5782(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static55.anInt1333) {
					if (!Static62.method5782(local10, local23, local14)) {
						return false;
					}
					if (!Static62.method5782(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static62.method5782(local10, local27, local14)) {
						return false;
					}
					if (!Static62.method5782(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static62.method5782(local10, local31, local14)) {
					return false;
				}
				if (!Static62.method5782(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static62.method5782(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static62.method5782(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static62.method5782(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static62.method5782(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static62.method5782(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	public static void method3687() {
		@Pc(1) Class37 local1 = Static211.aClass37_70;
		synchronized (Static211.aClass37_70) {
			Static211.aClass37_70.method919();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!wm;Z)V")
	public static void method3688(@OriginalArg(0) Class10_Sub1_Sub2 arg0) {
		arg0.aBoolean306 = false;
		@Pc(18) Class177 local18;
		if (arg0.anInt4034 != -1) {
			local18 = Static354.method5863(arg0.anInt4034);
			if (local18 == null || local18.anIntArray529 == null) {
				arg0.anInt4034 = -1;
				arg0.aBoolean307 = false;
			} else {
				label297: {
					arg0.anInt4030++;
					if (local18.anIntArray529.length > arg0.anInt4074 && arg0.anInt4030 > local18.anIntArray528[arg0.anInt4074]) {
						arg0.anInt4074++;
						arg0.anInt4030 = 1;
						arg0.anInt4020++;
						Static351.method3417(arg0.anInt6726, Static127.aClass10_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6728, arg0.anInt4074, local18);
					}
					if (arg0.anInt4074 >= local18.anIntArray529.length) {
						arg0.anInt4074 = 0;
						arg0.anInt4030 = 0;
						if (arg0.aBoolean307) {
							arg0.anInt4034 = arg0.method3408().method2555();
							if (arg0.anInt4034 == -1) {
								arg0.aBoolean307 = false;
								break label297;
							}
							local18 = Static354.method5863(arg0.anInt4034);
						}
						Static351.method3417(arg0.anInt6726, Static127.aClass10_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6728, arg0.anInt4074, local18);
					}
					arg0.anInt4020 = arg0.anInt4074 + 1;
					if (local18.anIntArray529.length <= arg0.anInt4020) {
						arg0.anInt4020 = 0;
					}
				}
			}
		}
		@Pc(193) Class177 local193;
		if (arg0.anInt4058 != -1 && Static282.anInt3516 >= arg0.anInt4076) {
			@Pc(178) Class162 local178 = Static264.method4763(arg0.anInt4058);
			@Pc(181) int local181 = local178.anInt4910;
			if (local181 == -1) {
				arg0.anInt4058 = -1;
			} else {
				label299: {
					local193 = Static354.method5863(local181);
					if (local178.aBoolean394) {
						if (local193.anInt5410 == 3) {
							if (arg0.anInt4085 > 0 && arg0.anInt4073 <= Static282.anInt3516 && arg0.anInt4054 < Static282.anInt3516) {
								arg0.anInt4058 = -1;
								break label299;
							}
						} else if (local193.anInt5410 == 1 && arg0.anInt4085 > 0 && Static282.anInt3516 >= arg0.anInt4073 && arg0.anInt4054 < Static282.anInt3516) {
							arg0.anInt4076 = Static282.anInt3516 + 1;
							break label299;
						}
					}
					if (local193 == null || local193.anIntArray529 == null) {
						arg0.anInt4058 = -1;
					} else {
						if (arg0.anInt4038 < 0) {
							arg0.anInt4038 = 0;
							Static351.method3417(arg0.anInt6726, arg0 == Static127.aClass10_Sub1_Sub2_Sub2_1, arg0.anInt6728, 0, local193);
						}
						arg0.anInt4013++;
						if (local193.anIntArray529.length > arg0.anInt4038 && arg0.anInt4013 > local193.anIntArray528[arg0.anInt4038]) {
							arg0.anInt4013 = 1;
							arg0.anInt4038++;
							Static351.method3417(arg0.anInt6726, Static127.aClass10_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6728, arg0.anInt4038, local193);
						}
						if (local193.anIntArray529.length <= arg0.anInt4038) {
							if (local178.aBoolean394) {
								arg0.anInt4038 -= local193.anInt5408;
								arg0.anInt4041++;
								if (arg0.anInt4041 >= local193.anInt5422) {
									arg0.anInt4058 = -1;
								} else if (arg0.anInt4038 >= 0 && local193.anIntArray529.length > arg0.anInt4038) {
									Static351.method3417(arg0.anInt6726, Static127.aClass10_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6728, arg0.anInt4038, local193);
								} else {
									arg0.anInt4058 = -1;
								}
							} else {
								arg0.anInt4058 = -1;
							}
						}
						arg0.anInt4018 = arg0.anInt4038 + 1;
						if (arg0.anInt4018 >= local193.anIntArray529.length) {
							if (local178.aBoolean394) {
								arg0.anInt4018 -= local193.anInt5408;
								if (local193.anInt5422 <= arg0.anInt4041 + 1) {
									arg0.anInt4018 = -1;
								} else if (arg0.anInt4018 < 0 || arg0.anInt4018 >= local193.anIntArray529.length) {
									arg0.anInt4018 = -1;
								}
							} else {
								arg0.anInt4018 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4026 != -1 && arg0.anInt4062 <= 1) {
			local18 = Static354.method5863(arg0.anInt4026);
			if (local18.anInt5410 == 3) {
				if (arg0.anInt4085 > 0 && arg0.anInt4073 <= Static282.anInt3516 && Static282.anInt3516 > arg0.anInt4054) {
					arg0.anInt4026 = -1;
				}
			} else if (local18.anInt5410 == 1 && arg0.anInt4085 > 0 && Static282.anInt3516 >= arg0.anInt4073 && arg0.anInt4054 < Static282.anInt3516) {
				arg0.anInt4062 = 2;
			}
		}
		if (arg0.anInt4026 != -1 && arg0.anInt4062 == 0) {
			local18 = Static354.method5863(arg0.anInt4026);
			if (local18 == null || local18.anIntArray529 == null) {
				arg0.anInt4026 = -1;
			} else {
				arg0.anInt4027++;
				if (local18.anIntArray529.length > arg0.lb && local18.anIntArray528[arg0.lb] < arg0.anInt4027) {
					arg0.anInt4027 = 1;
					arg0.lb++;
					Static351.method3417(arg0.anInt6726, Static127.aClass10_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6728, arg0.lb, local18);
				}
				if (arg0.lb >= local18.anIntArray529.length) {
					arg0.anInt4010++;
					arg0.lb -= local18.anInt5408;
					if (local18.anInt5422 <= arg0.anInt4010) {
						arg0.anInt4026 = -1;
					} else if (arg0.lb >= 0 && local18.anIntArray529.length > arg0.lb) {
						Static351.method3417(arg0.anInt6726, arg0 == Static127.aClass10_Sub1_Sub2_Sub2_1, arg0.anInt6728, arg0.lb, local18);
					} else {
						arg0.anInt4026 = -1;
					}
				}
				arg0.anInt4039 = arg0.lb + 1;
				if (arg0.anInt4039 >= local18.anIntArray529.length) {
					arg0.anInt4039 -= local18.anInt5408;
					if (local18.anInt5422 <= arg0.anInt4010 + 1) {
						arg0.anInt4039 = -1;
					} else if (arg0.anInt4039 < 0 || arg0.anInt4039 >= local18.anIntArray529.length) {
						arg0.anInt4039 = -1;
					}
				}
				arg0.aBoolean306 = local18.aBoolean452;
			}
		}
		if (arg0.anInt4062 > 0) {
			arg0.anInt4062--;
		}
		for (@Pc(750) int local750 = 0; local750 < arg0.aClass138Array3.length; local750++) {
			@Pc(757) Class138 local757 = arg0.aClass138Array3[local750];
			if (local757 != null) {
				if (local757.anInt3780 > 0) {
					local757.anInt3780--;
				} else {
					local193 = Static354.method5863(local757.anInt3779);
					if (local193 == null || local193.anIntArray529 == null) {
						arg0.aClass138Array3[local750] = null;
					} else {
						local757.anInt3771++;
						if (local193.anIntArray529.length > local757.anInt3778 && local193.anIntArray528[local757.anInt3778] < local757.anInt3771) {
							local757.anInt3778++;
							local757.anInt3771 = 1;
							Static351.method3417(arg0.anInt6726, Static127.aClass10_Sub1_Sub2_Sub2_1 == arg0, arg0.anInt6728, local757.anInt3778, local193);
						}
						if (local193.anIntArray529.length <= local757.anInt3778) {
							local757.anInt3781++;
							local757.anInt3778 -= local193.anInt5408;
							if (local757.anInt3781 >= local193.anInt5422) {
								arg0.aClass138Array3[local750] = null;
							} else if (local757.anInt3778 >= 0 && local193.anIntArray529.length > local757.anInt3778) {
								Static351.method3417(arg0.anInt6726, arg0 == Static127.aClass10_Sub1_Sub2_Sub2_1, arg0.anInt6728, local757.anInt3778, local193);
							} else {
								arg0.aClass138Array3[local750] = null;
							}
						}
						local757.anInt3777 = local757.anInt3778 + 1;
						if (local757.anInt3777 >= local193.anIntArray529.length) {
							local757.anInt3777 -= local193.anInt5408;
							if (local757.anInt3781 + 1 >= local193.anInt5422) {
								local757.anInt3777 = -1;
							} else if (local757.anInt3777 < 0 || local193.anIntArray529.length <= local757.anInt3777) {
								local757.anInt3777 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZIII)I")
	public static int method3689(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub1 local12 = (Class1_Sub1) Static158.aClass207_24.method5555((long) arg1);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(28) int local28 = 0; local28 < local12.anIntArray3.length; local28++) {
			if (local12.anIntArray3[local28] >= 0 && local12.anIntArray3[local28] < Static157.anInt3294) {
				@Pc(51) Class102 local51 = Static348.method5333(local12.anIntArray3[local28]);
				@Pc(60) int local60 = local51.method1996(Static262.method1693(arg2).anInt6009, arg2);
				if (arg0) {
					local18 += local60 * local12.anIntArray4[local28];
				} else {
					local18 += local60;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!wd;IIIII)Ljava/awt/Frame;")
	public static Frame method3690(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg0.method5677()) {
			return null;
		}
		@Pc(20) Class206[] local20 = Static250.method4495(arg0);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg3 == local20[local28].anInt6440 && arg2 == local20[local28].anInt6444 && (!local26 || local20[local28].anInt6441 > arg1)) {
				arg1 = local20[local28].anInt6441;
				local26 = true;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(94) Class193 local94 = arg0.method5657(arg3, arg1, arg2);
		while (local94.anInt5986 == 0) {
			Static163.method2863(10L);
		}
		@Pc(117) Frame local117 = (Frame) local94.anObject7;
		if (local117 == null) {
			return null;
		} else if (local94.anInt5986 == 2) {
			Static278.method4962(local117, arg0);
			return null;
		} else {
			return local117;
		}
	}
}

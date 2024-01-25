import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!jm", name = "H", descriptor = "Lclient!iq;")
	public static Class104 aClass104_93;

	@OriginalMember(owner = "client!jm", name = "P", descriptor = "Lclient!kd;")
	public static Class117 aClass117_3;

	@OriginalMember(owner = "client!jm", name = "N", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!jm", name = "S", descriptor = "I")
	public static int anInt3667 = 0;

	@OriginalMember(owner = "client!jm", name = "T", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_116 = new Class221(86, 3);

	@OriginalMember(owner = "client!jm", name = "U", descriptor = "[S")
	public static final short[] aShortArray38 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)I")
	public static int method3195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg0;
			arg0 = local12;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg4;
		} else if (local3 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return 8 - arg0 - arg4;
		}
	}

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)Lclient!on;")
	public static Class120_Sub1 method3196() {
		return Static339.aClass120_Sub1Array6.length > Static137.anInt2916 ? Static339.aClass120_Sub1Array6[Static137.anInt2916++] : null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!mr;I)V")
	public static void method3198(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		arg0.aBoolean614 = false;
		@Pc(17) Class84 local17;
		if (arg0.anInt6901 != -1) {
			local17 = Static91.method1822(arg0.anInt6901);
			if (local17 == null || local17.anIntArray197 == null) {
				arg0.aBoolean613 = false;
				arg0.anInt6901 = -1;
			} else {
				label297: {
					arg0.anInt6943++;
					if (local17.anIntArray197.length > arg0.anInt6942 && arg0.anInt6943 > local17.anIntArray198[arg0.anInt6942]) {
						arg0.anInt6943 = 1;
						arg0.anInt6899++;
						arg0.anInt6942++;
						Static41.method4705(Static177.aClass1_Sub2_Sub3_Sub1_1 == arg0, arg0.anInt6942, arg0.anInt6888, arg0.anInt6893, local17, arg0.aByte77);
					}
					if (arg0.anInt6942 >= local17.anIntArray197.length) {
						arg0.anInt6942 = 0;
						arg0.anInt6943 = 0;
						if (arg0.aBoolean613) {
							arg0.anInt6901 = arg0.method5778().method4173();
							if (arg0.anInt6901 == -1) {
								arg0.aBoolean613 = false;
								break label297;
							}
							local17 = Static91.method1822(arg0.anInt6901);
						}
						Static41.method4705(arg0 == Static177.aClass1_Sub2_Sub3_Sub1_1, arg0.anInt6942, arg0.anInt6888, arg0.anInt6893, local17, arg0.aByte77);
					}
					arg0.anInt6899 = arg0.anInt6942 + 1;
					if (arg0.anInt6899 >= local17.anIntArray197.length) {
						arg0.anInt6899 = 0;
					}
				}
			}
		}
		@Pc(191) Class84 local191;
		if (arg0.anInt6902 != -1 && arg0.anInt6948 <= Static6.anInt91) {
			@Pc(175) Class177 local175 = Static41.method4707(arg0.anInt6902);
			@Pc(178) int local178 = local175.anInt5808;
			if (local178 == -1) {
				arg0.anInt6902 = -1;
			} else {
				label299: {
					local191 = Static91.method1822(local178);
					if (local175.aBoolean516) {
						if (local191.anInt2443 == 3) {
							if (arg0.anInt6963 > 0 && Static6.anInt91 >= arg0.anInt6956 && Static6.anInt91 > arg0.anInt6933) {
								arg0.anInt6902 = -1;
								break label299;
							}
						} else if (local191.anInt2443 == 1 && arg0.anInt6963 > 0 && arg0.anInt6956 <= Static6.anInt91 && Static6.anInt91 > arg0.anInt6933) {
							arg0.anInt6948 = Static6.anInt91 + 1;
							break label299;
						}
					}
					if (local191 == null || local191.anIntArray197 == null) {
						arg0.anInt6902 = -1;
					} else {
						if (arg0.anInt6898 < 0) {
							arg0.anInt6898 = 0;
							Static41.method4705(arg0 == Static177.aClass1_Sub2_Sub3_Sub1_1, 0, arg0.anInt6888, arg0.anInt6893, local191, arg0.aByte77);
						}
						arg0.anInt6945++;
						if (local191.anIntArray197.length > arg0.anInt6898 && arg0.anInt6945 > local191.anIntArray198[arg0.anInt6898]) {
							arg0.anInt6898++;
							arg0.anInt6945 = 1;
							Static41.method4705(Static177.aClass1_Sub2_Sub3_Sub1_1 == arg0, arg0.anInt6898, arg0.anInt6888, arg0.anInt6893, local191, arg0.aByte77);
						}
						if (arg0.anInt6898 >= local191.anIntArray197.length) {
							if (local175.aBoolean516) {
								arg0.anInt6898 -= local191.anInt2452;
								arg0.anInt6912++;
								if (local191.anInt2462 <= arg0.anInt6912) {
									arg0.anInt6902 = -1;
								} else if (arg0.anInt6898 >= 0 && local191.anIntArray197.length > arg0.anInt6898) {
									Static41.method4705(arg0 == Static177.aClass1_Sub2_Sub3_Sub1_1, arg0.anInt6898, arg0.anInt6888, arg0.anInt6893, local191, arg0.aByte77);
								} else {
									arg0.anInt6902 = -1;
								}
							} else {
								arg0.anInt6902 = -1;
							}
						}
						arg0.anInt6957 = arg0.anInt6898 + 1;
						if (local191.anIntArray197.length <= arg0.anInt6957) {
							if (local175.aBoolean516) {
								arg0.anInt6957 -= local191.anInt2452;
								if (local191.anInt2462 <= arg0.anInt6912 + 1) {
									arg0.anInt6957 = -1;
								} else if (arg0.anInt6957 < 0 || arg0.anInt6957 >= local191.anIntArray197.length) {
									arg0.anInt6957 = -1;
								}
							} else {
								arg0.anInt6957 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6915 != -1 && arg0.anInt6900 <= 1) {
			local17 = Static91.method1822(arg0.anInt6915);
			if (local17.anInt2443 == 3) {
				if (arg0.anInt6963 > 0 && arg0.anInt6956 <= Static6.anInt91 && arg0.anInt6933 < Static6.anInt91) {
					arg0.anInt6915 = -1;
				}
			} else if (local17.anInt2443 == 1 && arg0.anInt6963 > 0 && Static6.anInt91 >= arg0.anInt6956 && Static6.anInt91 > arg0.anInt6933) {
				arg0.anInt6900 = 2;
			}
		}
		if (arg0.anInt6915 != -1 && arg0.anInt6900 == 0) {
			local17 = Static91.method1822(arg0.anInt6915);
			if (local17 == null || local17.anIntArray197 == null) {
				arg0.anInt6915 = -1;
			} else {
				arg0.anInt6921++;
				if (arg0.anInt6895 < local17.anIntArray197.length && arg0.anInt6921 > local17.anIntArray198[arg0.anInt6895]) {
					arg0.anInt6921 = 1;
					arg0.anInt6895++;
					Static41.method4705(arg0 == Static177.aClass1_Sub2_Sub3_Sub1_1, arg0.anInt6895, arg0.anInt6888, arg0.anInt6893, local17, arg0.aByte77);
				}
				if (local17.anIntArray197.length <= arg0.anInt6895) {
					arg0.anInt6895 -= local17.anInt2452;
					arg0.anInt6908++;
					if (arg0.anInt6908 >= local17.anInt2462) {
						arg0.anInt6915 = -1;
					} else if (arg0.anInt6895 >= 0 && local17.anIntArray197.length > arg0.anInt6895) {
						Static41.method4705(arg0 == Static177.aClass1_Sub2_Sub3_Sub1_1, arg0.anInt6895, arg0.anInt6888, arg0.anInt6893, local17, arg0.aByte77);
					} else {
						arg0.anInt6915 = -1;
					}
				}
				arg0.anInt6904 = arg0.anInt6895 + 1;
				if (arg0.anInt6904 >= local17.anIntArray197.length) {
					arg0.anInt6904 -= local17.anInt2452;
					if (local17.anInt2462 <= arg0.anInt6908 + 1) {
						arg0.anInt6904 = -1;
					} else if (arg0.anInt6904 < 0 || local17.anIntArray197.length <= arg0.anInt6904) {
						arg0.anInt6904 = -1;
					}
				}
				arg0.aBoolean614 = local17.aBoolean232;
			}
		}
		if (arg0.anInt6900 > 0) {
			arg0.anInt6900--;
		}
		for (@Pc(735) int local735 = 0; local735 < arg0.aClass212Array3.length; local735++) {
			@Pc(742) Class212 local742 = arg0.aClass212Array3[local735];
			if (local742 != null) {
				if (local742.anInt6753 > 0) {
					local742.anInt6753--;
				} else {
					local191 = Static91.method1822(local742.anInt6755);
					if (local191 == null || local191.anIntArray197 == null) {
						arg0.aClass212Array3[local735] = null;
					} else {
						local742.anInt6756++;
						if (local191.anIntArray197.length > local742.anInt6752 && local742.anInt6756 > local191.anIntArray198[local742.anInt6752]) {
							local742.anInt6756 = 1;
							local742.anInt6752++;
							Static41.method4705(Static177.aClass1_Sub2_Sub3_Sub1_1 == arg0, local742.anInt6752, arg0.anInt6888, arg0.anInt6893, local191, arg0.aByte77);
						}
						if (local742.anInt6752 >= local191.anIntArray197.length) {
							local742.anInt6759++;
							local742.anInt6752 -= local191.anInt2452;
							if (local742.anInt6759 >= local191.anInt2462) {
								arg0.aClass212Array3[local735] = null;
							} else if (local742.anInt6752 >= 0 && local742.anInt6752 < local191.anIntArray197.length) {
								Static41.method4705(Static177.aClass1_Sub2_Sub3_Sub1_1 == arg0, local742.anInt6752, arg0.anInt6888, arg0.anInt6893, local191, arg0.aByte77);
							} else {
								arg0.aClass212Array3[local735] = null;
							}
						}
						local742.anInt6757 = local742.anInt6752 + 1;
						if (local191.anIntArray197.length <= local742.anInt6757) {
							local742.anInt6757 -= local191.anInt2452;
							if (local742.anInt6759 + 1 >= local191.anInt2462) {
								local742.anInt6757 = -1;
							} else if (local742.anInt6757 < 0 || local742.anInt6757 >= local191.anIntArray197.length) {
								local742.anInt6757 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!sc;)V")
	public static void method3199(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class179 arg1) {
		while (true) {
			@Pc(6) Class26 local6 = arg1.method4880(arg0);
			while (local6.anInt484 == 0) {
				Static248.method4401(10L);
			}
			if (local6.anInt484 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static248.method4401(100L);
		}
	}
}

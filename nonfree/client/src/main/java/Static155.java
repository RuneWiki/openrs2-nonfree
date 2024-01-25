import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!jr", name = "J", descriptor = "Lclient!lf;")
	public static Class90 aClass90_10;

	@OriginalMember(owner = "client!jr", name = "N", descriptor = "[I")
	public static int[] anIntArray356;

	@OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
	public static int anInt3113 = 0;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLclient!jj;)V")
	public static void method2946(@OriginalArg(1) Class5_Sub3_Sub3 arg0) {
		arg0.aBoolean414 = false;
		@Pc(17) Class121 local17;
		if (arg0.anInt4975 != -1) {
			local17 = Static133.method2520(arg0.anInt4975);
			if (local17 == null || local17.anIntArray446 == null) {
				arg0.anInt4975 = -1;
				arg0.aBoolean412 = false;
			} else {
				label297: {
					arg0.anInt4954++;
					if (arg0.anInt4941 < local17.anIntArray446.length && local17.anIntArray444[arg0.anInt4941] < arg0.anInt4954) {
						arg0.anInt4941++;
						arg0.anInt4973++;
						arg0.anInt4954 = 1;
						Static131.method2490(arg0 == Static130.aClass5_Sub3_Sub3_Sub1_1, local17, arg0.anInt4941, arg0.anInt5047, arg0.anInt5050);
					}
					if (local17.anIntArray446.length <= arg0.anInt4941) {
						arg0.anInt4954 = 0;
						arg0.anInt4941 = 0;
						if (arg0.aBoolean412) {
							arg0.anInt4975 = arg0.method4533().method1429();
							if (arg0.anInt4975 == -1) {
								arg0.aBoolean412 = false;
								break label297;
							}
							local17 = Static133.method2520(arg0.anInt4975);
						}
						Static131.method2490(Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0, local17, arg0.anInt4941, arg0.anInt5047, arg0.anInt5050);
					}
					arg0.anInt4973 = arg0.anInt4941 + 1;
					if (arg0.anInt4973 >= local17.anIntArray446.length) {
						arg0.anInt4973 = 0;
					}
				}
			}
		}
		@Pc(183) Class121 local183;
		if (arg0.anInt4934 != -1 && arg0.anInt4951 <= Static215.anInt4246) {
			@Pc(172) Class125 local172 = Static183.method3571(arg0.anInt4934);
			@Pc(175) int local175 = local172.anInt3913;
			if (local175 == -1) {
				arg0.anInt4934 = -1;
			} else {
				label299: {
					local183 = Static133.method2520(local175);
					if (local172.aBoolean335) {
						if (local183.anInt3776 == 3) {
							if (arg0.anInt4984 > 0 && Static215.anInt4246 >= arg0.anInt4961 && Static215.anInt4246 > arg0.anInt4971) {
								arg0.anInt4934 = -1;
								break label299;
							}
						} else if (local183.anInt3776 == 1 && arg0.anInt4984 > 0 && Static215.anInt4246 >= arg0.anInt4961 && Static215.anInt4246 > arg0.anInt4971) {
							arg0.anInt4951 = Static215.anInt4246 + 1;
							break label299;
						}
					}
					if (local183 == null || local183.anIntArray446 == null) {
						arg0.anInt4934 = -1;
					} else {
						if (arg0.anInt4979 < 0) {
							arg0.anInt4979 = 0;
							Static131.method2490(Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0, local183, 0, arg0.anInt5047, arg0.anInt5050);
						}
						arg0.anInt4976++;
						if (arg0.anInt4979 < local183.anIntArray446.length && local183.anIntArray444[arg0.anInt4979] < arg0.anInt4976) {
							arg0.anInt4979++;
							arg0.anInt4976 = 1;
							Static131.method2490(Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0, local183, arg0.anInt4979, arg0.anInt5047, arg0.anInt5050);
						}
						if (local183.anIntArray446.length <= arg0.anInt4979) {
							if (local172.aBoolean335) {
								arg0.anInt4979 -= local183.anInt3769;
								arg0.anInt4939++;
								if (local183.anInt3773 <= arg0.anInt4939) {
									arg0.anInt4934 = -1;
								} else if (arg0.anInt4979 >= 0 && local183.anIntArray446.length > arg0.anInt4979) {
									Static131.method2490(Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0, local183, arg0.anInt4979, arg0.anInt5047, arg0.anInt5050);
								} else {
									arg0.anInt4934 = -1;
								}
							} else {
								arg0.anInt4934 = -1;
							}
						}
						arg0.anInt4972 = arg0.anInt4979 + 1;
						if (arg0.anInt4972 >= local183.anIntArray446.length) {
							if (local172.aBoolean335) {
								arg0.anInt4972 -= local183.anInt3769;
								if (arg0.anInt4939 + 1 >= local183.anInt3773) {
									arg0.anInt4972 = -1;
								} else if (arg0.anInt4972 < 0 || arg0.anInt4972 >= local183.anIntArray446.length) {
									arg0.anInt4972 = -1;
								}
							} else {
								arg0.anInt4972 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4977 != -1 && arg0.anInt4936 <= 1) {
			local17 = Static133.method2520(arg0.anInt4977);
			if (local17.anInt3776 == 3) {
				if (arg0.anInt4984 > 0 && Static215.anInt4246 >= arg0.anInt4961 && arg0.anInt4971 < Static215.anInt4246) {
					arg0.anInt4977 = -1;
				}
			} else if (local17.anInt3776 == 1 && arg0.anInt4984 > 0 && arg0.anInt4961 <= Static215.anInt4246 && arg0.anInt4971 < Static215.anInt4246) {
				arg0.anInt4936 = 2;
			}
		}
		if (arg0.anInt4977 != -1 && arg0.anInt4936 == 0) {
			local17 = Static133.method2520(arg0.anInt4977);
			if (local17 == null || local17.anIntArray446 == null) {
				arg0.anInt4977 = -1;
			} else {
				arg0.anInt4957++;
				if (local17.anIntArray446.length > arg0.anInt4950 && arg0.anInt4957 > local17.anIntArray444[arg0.anInt4950]) {
					arg0.anInt4957 = 1;
					arg0.anInt4950++;
					Static131.method2490(Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0, local17, arg0.anInt4950, arg0.anInt5047, arg0.anInt5050);
				}
				if (local17.anIntArray446.length <= arg0.anInt4950) {
					arg0.anInt4950 -= local17.anInt3769;
					arg0.anInt4922++;
					if (arg0.anInt4922 >= local17.anInt3773) {
						arg0.anInt4977 = -1;
					} else if (arg0.anInt4950 >= 0 && local17.anIntArray446.length > arg0.anInt4950) {
						Static131.method2490(Static130.aClass5_Sub3_Sub3_Sub1_1 == arg0, local17, arg0.anInt4950, arg0.anInt5047, arg0.anInt5050);
					} else {
						arg0.anInt4977 = -1;
					}
				}
				arg0.anInt4965 = arg0.anInt4950 + 1;
				if (arg0.anInt4965 >= local17.anIntArray446.length) {
					arg0.anInt4965 -= local17.anInt3769;
					if (local17.anInt3773 <= arg0.anInt4922 + 1) {
						arg0.anInt4965 = -1;
					} else if (arg0.anInt4965 < 0 || local17.anIntArray446.length <= arg0.anInt4965) {
						arg0.anInt4965 = -1;
					}
				}
				arg0.aBoolean414 = local17.aBoolean319;
			}
		}
		if (arg0.anInt4936 > 0) {
			arg0.anInt4936--;
		}
		for (@Pc(725) int local725 = 0; local725 < arg0.aClass59Array3.length; local725++) {
			@Pc(732) Class59 local732 = arg0.aClass59Array3[local725];
			if (local732 != null) {
				if (local732.anInt1767 > 0) {
					local732.anInt1767--;
				} else {
					local183 = Static133.method2520(local732.anInt1772);
					if (local183 == null || local183.anIntArray446 == null) {
						arg0.aClass59Array3[local725] = null;
					} else {
						local732.anInt1770++;
						if (local183.anIntArray446.length > local732.anInt1771 && local732.anInt1770 > local183.anIntArray444[local732.anInt1771]) {
							local732.anInt1770 = 1;
							local732.anInt1771++;
							Static131.method2490(arg0 == Static130.aClass5_Sub3_Sub3_Sub1_1, local183, local732.anInt1771, arg0.anInt5047, arg0.anInt5050);
						}
						if (local183.anIntArray446.length <= local732.anInt1771) {
							local732.anInt1771 -= local183.anInt3769;
							local732.anInt1769++;
							if (local183.anInt3773 <= local732.anInt1769) {
								arg0.aClass59Array3[local725] = null;
							} else if (local732.anInt1771 >= 0 && local183.anIntArray446.length > local732.anInt1771) {
								Static131.method2490(arg0 == Static130.aClass5_Sub3_Sub3_Sub1_1, local183, local732.anInt1771, arg0.anInt5047, arg0.anInt5050);
							} else {
								arg0.aClass59Array3[local725] = null;
							}
						}
						local732.anInt1766 = local732.anInt1771 + 1;
						if (local183.anIntArray446.length <= local732.anInt1766) {
							local732.anInt1766 -= local183.anInt3769;
							if (local732.anInt1769 + 1 >= local183.anInt3773) {
								local732.anInt1766 = -1;
							} else if (local732.anInt1766 < 0 || local183.anIntArray446.length <= local732.anInt1766) {
								local732.anInt1766 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[Ljava/lang/String;[S)V")
	public static void method2947(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) short[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) String local16 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local16;
		@Pc(30) short local30 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local30;
		for (@Pc(42) int local42 = arg1; local42 < arg0; local42++) {
			if (local16 == null || arg2[local42] != null && arg2[local42].compareTo(local16) < (local42 & 0x1)) {
				@Pc(63) String local63 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12] = local63;
				@Pc(77) short local77 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12++] = local77;
			}
		}
		arg2[arg0] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg0] = arg3[local12];
		arg3[local12] = local30;
		method2947(local12 - 1, arg1, arg2, arg3);
		method2947(arg0, local12 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BIIIII)V")
	public static void method2948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg2; local8 <= arg1; local8++) {
			Static97.method1784(arg3, Static327.anIntArrayArray63[local8], arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZI)Z")
	public static boolean method2949(@OriginalArg(0) boolean arg0) {
		@Pc(11) boolean local11 = Static34.aClass2_6.method3295();
		if (arg0 == local11) {
			return true;
		}
		if (!arg0) {
			Static34.aClass2_6.method3319();
		} else if (!Static34.aClass2_6.method3289()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static344.aBoolean555 = arg0;
			Static114.method2086(Static180.aClass110_6);
			return true;
		}
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V")
	public static void method2951() {
		Static231.method4162(Static34.aClass2_6, (long) Static215.anInt4246);
		if (Static100.anInt2086 != -1) {
			Static217.method3977(Static100.anInt2086);
		}
		for (@Pc(19) int local19 = 0; local19 < Static118.anInt4791; local19++) {
			if (Static313.aBooleanArray30[local19]) {
				Static253.aBooleanArray27[local19] = true;
			}
			Static30.aBooleanArray4[local19] = Static313.aBooleanArray30[local19];
			Static313.aBooleanArray30[local19] = false;
		}
		Static32.anInt790 = Static215.anInt4246;
		if (Static34.aClass2_6.method3305()) {
			Static61.aBoolean124 = true;
		}
		Static193.aClass177_12 = null;
		if (Static100.anInt2086 != -1) {
			Static118.anInt4791 = 0;
			Static156.method2955();
		}
		Static34.aClass2_6.method3327();
		Static129.method2436(Static147.anInt2901);
		Static78.anInt1579 = 0;
	}
}

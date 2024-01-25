import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Lclient!l;")
	public static Class17 aClass17_48;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method5138() {
		Static86.method3567();
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static194.aClass70Array1[local16].method1797();
		}
		Static154.method2542();
		Static372.method2347();
		System.gc();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLclient!dw;Z)V")
	public static void method5139(@OriginalArg(1) Class3_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static373.anInt4900 >= 400) {
			return;
		}
		@Pc(14) Class65 local14 = arg0.aClass65_1;
		if (local14.anIntArray155 != null) {
			local14 = local14.method1710(Static344.aClass108_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean137) {
			return;
		}
		@Pc(37) String local37 = local14.aString21;
		if (local14.anInt2122 != 0) {
			@Pc(53) String local53 = Static320.aClass10_28 == Static423.aClass10_43 ? Static72.aClass209_40.method4562(Static388.anInt6533) : Static350.aClass209_138.method4562(Static388.anInt6533);
			local37 = local37 + Static26.method509(local14.anInt2122, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6217) + " (" + local53 + local14.anInt2122 + ")";
		}
		if (!Static385.aBoolean441) {
			if (!arg1) {
				@Pc(83) String[] local83 = local14.aStringArray10;
				if (Static120.aBoolean203) {
					local83 = Static335.method767(local83);
				}
				@Pc(93) int local93;
				if (local83 != null) {
					for (local93 = 4; local93 >= 0; local93--) {
						if (local83[local93] != null && (Static199.aClass10_22 != Static320.aClass10_28 || !local83[local93].equalsIgnoreCase(Static58.aClass209_31.method4562(Static388.anInt6533)))) {
							@Pc(113) byte local113 = 0;
							@Pc(115) int local115 = Static238.anInt4575;
							if (local93 == 0) {
								local113 = 60;
							}
							if (local93 == 1) {
								local113 = 46;
							}
							if (local93 == 2) {
								local113 = 5;
							}
							if (local93 == 3) {
								local113 = 11;
							}
							if (local93 == 4) {
								local113 = 8;
							}
							if (local93 == local14.anInt2123) {
								local115 = local14.anInt2145;
							}
							if (local14.anInt2149 == local93) {
								local115 = local14.anInt2141;
							}
							Static172.method2802(local113, local115, true, (long) arg0.anInt6137, local83[local93], 0, "<col=ffff00>" + local37, -1, false, 0);
						}
					}
				}
				if (Static320.aClass10_28 == Static199.aClass10_22 && local83 != null) {
					for (local93 = 4; local93 >= 0; local93--) {
						if (local83[local93] != null && local83[local93].equalsIgnoreCase(Static58.aClass209_31.method4562(Static388.anInt6533))) {
							@Pc(220) short local220 = 0;
							if (local14.anInt2122 > Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6217) {
								local220 = 2000;
							}
							@Pc(233) short local233 = 0;
							if (local93 == 0) {
								local233 = 60;
							}
							if (local93 == 1) {
								local233 = 46;
							}
							if (local93 == 2) {
								local233 = 5;
							}
							if (local93 == 3) {
								local233 = 11;
							}
							if (local93 == 4) {
								local233 = 8;
							}
							if (local233 != 0) {
								local233 += local220;
							}
							Static172.method2802(local233, local14.anInt2137, true, (long) arg0.anInt6137, local83[local93], 0, "<col=ffff00>" + local37, -1, false, 0);
						}
					}
				}
			}
			Static172.method2802(1012, Static161.anInt6992, true, (long) arg0.anInt6137, Static84.aClass209_45.method4562(Static388.anInt6533), 0, "<col=ffff00>" + local37, -1, arg1, 0);
		} else if (!arg1) {
			@Pc(336) Class132 local336 = Static404.anInt6738 == -1 ? null : Static186.aClass161_1.method3729(Static404.anInt6738);
			if ((Static201.anInt3539 & 0x2) != 0) {
				if (local336 == null || local14.method1702(Static404.anInt6738, local336.anInt3608) != local336.anInt3608) {
					Static172.method2802(50, Static323.anInt5618, true, (long) arg0.anInt6137, Static118.aString34, 0, Static254.aString46 + " -> <col=ffff00>" + local37, -1, false, 0);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ya;Lclient!ij;IIIII)V")
	public static void method5142(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static254.anInt4782) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static42.anInt4340) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static386.anInt6463 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class106 local62 = Static440.aClass106ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static58.aClass64Array1[local17].l(local23, local32) + Static58.aClass64Array1[local17].l(local23 + 1, local32) + Static58.aClass64Array1[local17].l(local23, local32 + 1) + Static58.aClass64Array1[local17].l(local23 + 1, local32 + 1)) / 4 - (Static58.aClass64Array1[arg2].l(arg3, arg4) + Static58.aClass64Array1[arg2].l(arg3 + 1, arg4) + Static58.aClass64Array1[arg2].l(arg3, arg4 + 1) + Static58.aClass64Array1[arg2].l(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class3_Sub5 local143 = local62.aClass3_Sub5_1;
									@Pc(146) Class3_Sub5 local146 = local62.aClass3_Sub5_2;
									if (local143 != null && local143.method5135()) {
										arg1.method5136(arg0, (local23 - arg3) * Static8.anInt242 + (1 - arg5) * Static414.anInt6898, local1, local143, (local32 - arg4) * Static8.anInt242 + (1 - arg6) * Static414.anInt6898, local140);
									}
									if (local146 != null && local146.method5135()) {
										arg1.method5136(arg0, (local23 - arg3) * Static8.anInt242 + (1 - arg5) * Static414.anInt6898, local1, local146, (local32 - arg4) * Static8.anInt242 + (1 - arg6) * Static414.anInt6898, local140);
									}
									for (@Pc(219) Class4 local219 = local62.aClass4_3; local219 != null; local219 = local219.aClass4_1) {
										@Pc(223) Class3_Sub2 local223 = local219.aClass3_Sub2_1;
										if (local223 != null && local223.method5135() && (local23 == local223.aShort85 || local23 == local3) && (local32 == local223.aShort86 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort87 + 1 - local223.aShort85;
											@Pc(260) int local260 = local223.aShort88 + 1 - local223.aShort86;
											arg1.method5136(arg0, (local223.aShort85 - arg3) * Static8.anInt242 + (local252 - arg5) * Static414.anInt6898, local1, local223, (local223.aShort86 - arg4) * Static8.anInt242 + (local260 - arg6) * Static414.anInt6898, local140);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}

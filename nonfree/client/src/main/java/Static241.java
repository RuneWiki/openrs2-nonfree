import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Lclient!kk;")
	public static Class192 aClass192_2;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "[I")
	public static final int[] anIntArray343 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BLclient!kn;)V")
	public static void method3665(@OriginalArg(1) Class14_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt2924 != -1) {
			@Pc(15) Class200 local15 = Static396.aClass359_2.method8415(arg0.anInt2924);
			if (local15 == null || local15.anIntArray389 == null) {
				arg0.anInt2924 = -1;
				arg0.aBoolean257 = false;
			} else {
				label277: {
					arg0.anInt2954++;
					if (local15.anIntArray389.length > arg0.anInt2933 && arg0.anInt2954 > local15.anIntArray388[arg0.anInt2933]) {
						arg0.anInt2933++;
						arg0.anInt2963++;
						arg0.anInt2954 = 1;
						if (!arg0.aBoolean255) {
							Static270.method4083(local15, arg0.anInt2933, arg0);
						}
					}
					if (arg0.anInt2933 >= local15.anIntArray389.length) {
						arg0.anInt2954 = 0;
						arg0.anInt2933 = 0;
						if (arg0.aBoolean257) {
							arg0.anInt2924 = arg0.method2519().method6937();
							if (arg0.anInt2924 == -1) {
								arg0.aBoolean257 = false;
								break label277;
							}
							local15 = Static396.aClass359_2.method8415(arg0.anInt2924);
						}
						if (!arg0.aBoolean255) {
							Static270.method4083(local15, arg0.anInt2933, arg0);
						}
					}
					arg0.anInt2963 = arg0.anInt2933 + 1;
					if (local15.anIntArray389 == null) {
						arg0.aBoolean257 = false;
						arg0.anInt2924 = -1;
					} else if (arg0.anInt2963 >= local15.anIntArray389.length) {
						arg0.anInt2963 = 0;
					}
				}
			}
		}
		@Pc(197) Class200 local197;
		for (@Pc(155) int local155 = 0; local155 < arg0.aClass315Array3.length; local155++) {
			if (arg0.aClass315Array3[local155].anInt8720 != -1 && Static235.anInt3998 >= arg0.aClass315Array3[local155].anInt8721) {
				@Pc(185) Class68 local185 = Static452.aClass170_4.method4001(arg0.aClass315Array3[local155].anInt8720);
				@Pc(188) int local188 = local185.anInt1416;
				if (local188 == -1) {
					arg0.aClass315Array3[local155].anInt8720 = -1;
				} else {
					local197 = Static396.aClass359_2.method8415(local188);
					if (local185.aBoolean114) {
						if (local197.anInt4875 == 3) {
							if (arg0.anInt2973 > 0 && Static235.anInt3998 >= arg0.anInt2912 && Static235.anInt3998 > arg0.anInt2942) {
								arg0.aClass315Array3[local155].anInt8720 = -1;
								continue;
							}
						} else if (local197.anInt4875 == 1 && arg0.anInt2973 > 0 && arg0.anInt2912 <= Static235.anInt3998 && Static235.anInt3998 > arg0.anInt2942) {
							arg0.aClass315Array3[local155].anInt8721 = Static235.anInt3998 + 1;
							continue;
						}
					}
					if (local197 == null || local197.anIntArray389 == null) {
						arg0.aClass315Array3[local155].anInt8720 = -1;
					} else {
						if (arg0.aClass315Array3[local155].anInt8725 < 0) {
							arg0.aClass315Array3[local155].anInt8725 = 0;
							if (!arg0.aBoolean255) {
								Static270.method4083(local197, 0, arg0);
							}
						}
						arg0.aClass315Array3[local155].anInt8724++;
						if (arg0.aClass315Array3[local155].anInt8725 < local197.anIntArray389.length && local197.anIntArray388[arg0.aClass315Array3[local155].anInt8725] < arg0.aClass315Array3[local155].anInt8724) {
							arg0.aClass315Array3[local155].anInt8724 = 1;
							arg0.aClass315Array3[local155].anInt8725++;
							if (!arg0.aBoolean255) {
								Static270.method4083(local197, arg0.aClass315Array3[local155].anInt8725, arg0);
							}
						}
						if (local197.anIntArray389.length <= arg0.aClass315Array3[local155].anInt8725) {
							if (local185.aBoolean114) {
								arg0.aClass315Array3[local155].anInt8725 -= local197.anInt4887;
								arg0.aClass315Array3[local155].anInt8728++;
								if (local197.anInt4883 <= arg0.aClass315Array3[local155].anInt8728) {
									arg0.aClass315Array3[local155].anInt8720 = -1;
								} else if (arg0.aClass315Array3[local155].anInt8725 < 0 || arg0.aClass315Array3[local155].anInt8725 >= local197.anIntArray389.length) {
									arg0.aClass315Array3[local155].anInt8720 = -1;
								} else if (!arg0.aBoolean255) {
									Static270.method4083(local197, arg0.aClass315Array3[local155].anInt8725, arg0);
								}
							} else {
								arg0.aClass315Array3[local155].anInt8720 = -1;
							}
						}
						arg0.aClass315Array3[local155].anInt8719 = arg0.aClass315Array3[local155].anInt8725 + 1;
						if (local197.anIntArray389.length <= arg0.aClass315Array3[local155].anInt8719) {
							if (local185.aBoolean114) {
								arg0.aClass315Array3[local155].anInt8719 -= local197.anInt4887;
								if (local197.anInt4883 <= arg0.aClass315Array3[local155].anInt8728 + 1) {
									arg0.aClass315Array3[local155].anInt8719 = -1;
								} else if (arg0.aClass315Array3[local155].anInt8719 < 0 || local197.anIntArray389.length <= arg0.aClass315Array3[local155].anInt8719) {
									arg0.aClass315Array3[local155].anInt8719 = -1;
								}
							} else {
								arg0.aClass315Array3[local155].anInt8719 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(574) Class200 local574;
		if (arg0.anInt2930 != -1 && arg0.anInt2918 <= 1) {
			local574 = Static396.aClass359_2.method8415(arg0.anInt2930);
			if (local574.anInt4875 == 3) {
				if (arg0.anInt2973 > 0 && arg0.anInt2912 <= Static235.anInt3998 && Static235.anInt3998 > arg0.anInt2942) {
					arg0.anIntArray243 = null;
					arg0.anInt2930 = -1;
				}
			} else if (local574.anInt4875 == 1 && arg0.anInt2973 > 0 && Static235.anInt3998 >= arg0.anInt2912 && arg0.anInt2942 < Static235.anInt3998) {
				arg0.anInt2918 = 2;
			}
		}
		if (arg0.anInt2930 != -1 && arg0.anInt2918 == 0) {
			local574 = Static396.aClass359_2.method8415(arg0.anInt2930);
			if (local574 == null || local574.anIntArray389 == null) {
				arg0.anIntArray243 = null;
				arg0.anInt2930 = -1;
			} else {
				arg0.anInt2947++;
				if (arg0.anInt2914 < local574.anIntArray389.length && local574.anIntArray388[arg0.anInt2914] < arg0.anInt2947) {
					arg0.anInt2947 = 1;
					arg0.anInt2914++;
					if (!arg0.aBoolean255) {
						Static270.method4083(local574, arg0.anInt2914, arg0);
					}
				}
				if (arg0.anInt2914 >= local574.anIntArray389.length) {
					arg0.anInt2913++;
					arg0.anInt2914 -= local574.anInt4887;
					if (arg0.anInt2913 >= local574.anInt4883) {
						arg0.anIntArray243 = null;
						arg0.anInt2930 = -1;
					} else if (arg0.anInt2914 < 0 || local574.anIntArray389.length <= arg0.anInt2914) {
						arg0.anInt2930 = -1;
						arg0.anIntArray243 = null;
					} else if (!arg0.aBoolean255) {
						Static270.method4083(local574, arg0.anInt2914, arg0);
					}
				}
				arg0.anInt2903 = arg0.anInt2914 + 1;
				if (local574.anIntArray389.length <= arg0.anInt2903) {
					arg0.anInt2903 -= local574.anInt4887;
					if (local574.anInt4883 <= arg0.anInt2913 + 1) {
						arg0.anInt2903 = -1;
					} else if (arg0.anInt2903 < 0 || arg0.anInt2903 >= local574.anIntArray389.length) {
						arg0.anInt2903 = -1;
					}
				}
			}
		}
		if (arg0.anInt2918 > 0) {
			arg0.anInt2918--;
		}
		for (@Pc(829) int local829 = 0; local829 < arg0.aClass299Array3.length; local829++) {
			@Pc(836) Class299 local836 = arg0.aClass299Array3[local829];
			if (local836 != null) {
				if (local836.anInt8047 > 0) {
					local836.anInt8047--;
				} else {
					local197 = Static396.aClass359_2.method8415(local836.anInt8050);
					if (local197 == null || local197.anIntArray389 == null) {
						arg0.aClass299Array3[local829] = null;
					} else {
						local836.anInt8044++;
						if (local197.anIntArray389.length > local836.anInt8045 && local836.anInt8044 > local197.anIntArray388[local836.anInt8045]) {
							local836.anInt8044 = 1;
							local836.anInt8045++;
							if (!arg0.aBoolean255) {
								Static270.method4083(local197, local836.anInt8045, arg0);
							}
						}
						if (local197.anIntArray389.length <= local836.anInt8045) {
							local836.anInt8045 -= local197.anInt4887;
							local836.anInt8048++;
							if (local836.anInt8048 >= local197.anInt4883) {
								arg0.aClass299Array3[local829] = null;
							} else if (local836.anInt8045 < 0 || local197.anIntArray389.length <= local836.anInt8045) {
								arg0.aClass299Array3[local829] = null;
							} else if (!arg0.aBoolean255) {
								Static270.method4083(local197, local836.anInt8045, arg0);
							}
						}
						local836.anInt8049 = local836.anInt8045 + 1;
						if (local197.anIntArray389.length <= local836.anInt8049) {
							local836.anInt8049 -= local197.anInt4887;
							if (local197.anInt4883 <= local836.anInt8048 + 1) {
								local836.anInt8049 = -1;
							} else if (local836.anInt8049 < 0 || local197.anIntArray389.length <= local836.anInt8049) {
								local836.anInt8049 = -1;
							}
						}
					}
				}
			}
		}
	}
}

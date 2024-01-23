import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
	public static int anInt1125 = 0;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString68 = "Loading...";

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method939(@OriginalArg(1) Class53_Sub1 arg0) {
		arg0.aBoolean284 = false;
		@Pc(19) Class46 local19;
		if (arg0.anInt4005 != -1) {
			local19 = Static156.method2501(arg0.anInt4005);
			if (local19 == null || local19.anIntArray95 == null) {
				arg0.anInt4005 = -1;
			} else {
				arg0.anInt4000++;
				if (arg0.anInt4046 < local19.anIntArray95.length && local19.anIntArray94[arg0.anInt4046] < arg0.anInt4000) {
					arg0.anInt4019++;
					arg0.anInt4000 = 1;
					arg0.anInt4046++;
					Static213.method3474(local19, arg0.anInt4002, arg0.anInt3974, arg0.anInt4046, arg0 == Static154.aClass53_Sub1_Sub1_2);
				}
				if (arg0.anInt4046 >= local19.anIntArray95.length) {
					arg0.anInt4000 = 0;
					arg0.anInt4046 = 0;
					Static213.method3474(local19, arg0.anInt4002, arg0.anInt3974, arg0.anInt4046, Static154.aClass53_Sub1_Sub1_2 == arg0);
				}
				arg0.anInt4019 = arg0.anInt4046 + 1;
				if (arg0.anInt4019 >= local19.anIntArray95.length) {
					arg0.anInt4019 = 0;
				}
			}
		}
		@Pc(166) Class46 local166;
		if (arg0.anInt3961 != -1 && Static50.anInt954 >= arg0.anInt3984) {
			@Pc(149) Class112 local149 = Static132.method2005(arg0.anInt3961);
			@Pc(152) int local152 = local149.anInt3134;
			if (local152 == -1) {
				arg0.anInt3961 = -1;
			} else {
				label303: {
					local166 = Static156.method2501(local152);
					if (local149.aBoolean222) {
						if (local166.anInt1240 == 3) {
							if (arg0.anInt4030 > 0 && arg0.anInt4034 <= Static50.anInt954 && Static50.anInt954 > arg0.anInt3966) {
								arg0.anInt3961 = -1;
								break label303;
							}
						} else if (local166.anInt1240 == 1 && arg0.anInt4030 > 0 && arg0.anInt4034 <= Static50.anInt954 && arg0.anInt3966 < Static50.anInt954) {
							arg0.anInt3984 = Static50.anInt954 + 1;
							break label303;
						}
					}
					if (local166 == null || local166.anIntArray95 == null) {
						arg0.anInt3961 = -1;
					} else {
						if (arg0.anInt4026 < 0) {
							arg0.anInt4026 = 0;
							Static213.method3474(local166, arg0.anInt4002, arg0.anInt3974, 0, arg0 == Static154.aClass53_Sub1_Sub1_2);
						}
						arg0.anInt3968++;
						if (local166.anIntArray95.length > arg0.anInt4026 && local166.anIntArray94[arg0.anInt4026] < arg0.anInt3968) {
							arg0.anInt3968 = 1;
							arg0.anInt4026++;
							Static213.method3474(local166, arg0.anInt4002, arg0.anInt3974, arg0.anInt4026, Static154.aClass53_Sub1_Sub1_2 == arg0);
						}
						if (arg0.anInt4026 >= local166.anIntArray95.length) {
							if (local149.aBoolean222) {
								arg0.anInt3989++;
								arg0.anInt4026 -= local166.anInt1242;
								if (local166.anInt1239 <= arg0.anInt3989) {
									arg0.anInt3961 = -1;
								} else if (arg0.anInt4026 >= 0 && local166.anIntArray95.length > arg0.anInt4026) {
									Static213.method3474(local166, arg0.anInt4002, arg0.anInt3974, arg0.anInt4026, Static154.aClass53_Sub1_Sub1_2 == arg0);
								} else {
									arg0.anInt3961 = -1;
								}
							} else {
								arg0.anInt3961 = -1;
							}
						}
						arg0.anInt3976 = arg0.anInt4026 + 1;
						if (arg0.anInt3976 >= local166.anIntArray95.length) {
							if (local149.aBoolean222) {
								arg0.anInt3976 -= local166.anInt1242;
								if (local166.anInt1239 <= arg0.anInt3989 + 1) {
									arg0.anInt3976 = -1;
								} else if (arg0.anInt3976 < 0 || arg0.anInt3976 >= local166.anIntArray95.length) {
									arg0.anInt3976 = -1;
								}
							} else {
								arg0.anInt3976 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4007 != -1 && arg0.anInt3996 <= 1) {
			local19 = Static156.method2501(arg0.anInt4007);
			if (local19.anInt1240 == 3) {
				if (arg0.anInt4030 > 0 && Static50.anInt954 >= arg0.anInt4034 && arg0.anInt3966 < Static50.anInt954) {
					arg0.anInt4007 = -1;
				}
			} else if (local19.anInt1240 == 1 && arg0.anInt4030 > 0 && Static50.anInt954 >= arg0.anInt4034 && Static50.anInt954 > arg0.anInt3966) {
				arg0.anInt3996 = 2;
			}
		}
		if (arg0.anInt4007 != -1 && arg0.anInt3996 == 0) {
			local19 = Static156.method2501(arg0.anInt4007);
			if (local19 == null || local19.anIntArray95 == null) {
				arg0.anInt4007 = -1;
			} else {
				arg0.anInt4044++;
				if (local19.anIntArray95.length > arg0.anInt3970 && arg0.anInt4044 > local19.anIntArray94[arg0.anInt3970]) {
					arg0.anInt3970++;
					arg0.anInt4044 = 1;
					Static213.method3474(local19, arg0.anInt4002, arg0.anInt3974, arg0.anInt3970, arg0 == Static154.aClass53_Sub1_Sub1_2);
				}
				if (arg0.anInt3970 >= local19.anIntArray95.length) {
					arg0.anInt4001++;
					arg0.anInt3970 -= local19.anInt1242;
					if (local19.anInt1239 <= arg0.anInt4001) {
						arg0.anInt4007 = -1;
					} else if (arg0.anInt3970 >= 0 && arg0.anInt3970 < local19.anIntArray95.length) {
						Static213.method3474(local19, arg0.anInt4002, arg0.anInt3974, arg0.anInt3970, arg0 == Static154.aClass53_Sub1_Sub1_2);
					} else {
						arg0.anInt4007 = -1;
					}
				}
				arg0.anInt4011 = arg0.anInt3970 + 1;
				if (arg0.anInt4011 >= local19.anIntArray95.length) {
					arg0.anInt4011 -= local19.anInt1242;
					if (arg0.anInt4001 + 1 >= local19.anInt1239) {
						arg0.anInt4011 = -1;
					} else if (arg0.anInt4011 < 0 || arg0.anInt4011 >= local19.anIntArray95.length) {
						arg0.anInt4011 = -1;
					}
				}
				arg0.aBoolean284 = local19.aBoolean73;
			}
		}
		if (arg0.anInt3996 > 0) {
			arg0.anInt3996--;
		}
		for (@Pc(746) int local746 = 0; local746 < arg0.aClass153Array3.length; local746++) {
			@Pc(760) Class153 local760 = arg0.aClass153Array3[local746];
			if (local760 != null) {
				if (local760.anInt4462 > 0) {
					local760.anInt4462--;
				} else {
					local166 = Static156.method2501(local760.anInt4457);
					if (local166 == null || local166.anIntArray95 == null) {
						arg0.aClass153Array3[local746] = null;
					} else {
						local760.anInt4461++;
						if (local166.anIntArray95.length > local760.anInt4463 && local166.anIntArray94[local760.anInt4463] < local760.anInt4461) {
							local760.anInt4461 = 1;
							local760.anInt4463++;
							Static213.method3474(local166, arg0.anInt4002, arg0.anInt3974, local760.anInt4463, arg0 == Static154.aClass53_Sub1_Sub1_2);
						}
						if (local760.anInt4463 >= local166.anIntArray95.length) {
							local760.anInt4463 -= local166.anInt1242;
							local760.anInt4466++;
							if (local166.anInt1239 <= local760.anInt4466) {
								arg0.aClass153Array3[local746] = null;
							} else if (local760.anInt4463 >= 0 && local166.anIntArray95.length > local760.anInt4463) {
								Static213.method3474(local166, arg0.anInt4002, arg0.anInt3974, local760.anInt4463, arg0 == Static154.aClass53_Sub1_Sub1_2);
							} else {
								arg0.aClass153Array3[local746] = null;
							}
						}
						local760.anInt4465 = local760.anInt4463 + 1;
						if (local166.anIntArray95.length <= local760.anInt4465) {
							local760.anInt4465 -= local166.anInt1242;
							if (local760.anInt4466 + 1 >= local166.anInt1239) {
								local760.anInt4465 = -1;
							} else if (local760.anInt4465 < 0 || local760.anInt4465 >= local166.anIntArray95.length) {
								local760.anInt4465 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public static void method941() {
		Static258.aClass26_52.method511();
		Static66.aClass26_11.method511();
	}
}

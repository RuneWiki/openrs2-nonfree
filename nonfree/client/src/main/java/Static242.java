import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
	public static int anInt5730;

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
	public static int anInt5735;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "I")
	public static int anInt5737;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)V")
	public static void method4560(@OriginalArg(0) int arg0) {
		Static301.anInt5208 = 3;
		Static36.anInt599 = -1;
		Static7.anInt120 = arg0;
		Static351.anInt6021 = 100;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZIZILclient!mv;ILclient!mv;)I")
	public static int method4561(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class56_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class56_Sub1 arg5) {
		@Pc(15) int local15 = Static140.method2397(arg0, arg5, arg3, arg4);
		if (local15 != 0) {
			return arg0 ? -local15 : local15;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static140.method2397(arg1, arg5, arg3, arg2);
			return arg1 ? -local37 : local37;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!ms;I)V")
	public static void method4562(@OriginalArg(0) Class24_Sub3_Sub2 arg0) {
		arg0.anInt6256 = 0;
		@Pc(19) Class137 local19;
		if (arg0.anInt6238 != -1) {
			local19 = Static281.aClass98_3.method2405(arg0.anInt6238);
			if (local19 == null || local19.anIntArray403 == null) {
				arg0.aBoolean403 = false;
				arg0.anInt6238 = -1;
			} else {
				label394: {
					arg0.anInt6214++;
					if (arg0.anInt6260 < local19.anIntArray403.length && arg0.anInt6214 > local19.anIntArray404[arg0.anInt6260]) {
						arg0.anInt6212++;
						arg0.anInt6260++;
						arg0.anInt6214 = 1;
						Static302.method4200(local19, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, arg0.anInt6260, Static263.aClass24_Sub3_Sub2_Sub2_4 == arg0);
					}
					if (arg0.anInt6260 >= local19.anIntArray403.length) {
						arg0.anInt6214 = 0;
						arg0.anInt6260 = 0;
						if (arg0.aBoolean403) {
							arg0.anInt6238 = arg0.method4923().method37();
							if (arg0.anInt6238 == -1) {
								arg0.aBoolean403 = false;
								break label394;
							}
							local19 = Static281.aClass98_3.method2405(arg0.anInt6238);
						}
						Static302.method4200(local19, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, arg0.anInt6260, Static263.aClass24_Sub3_Sub2_Sub2_4 == arg0);
					}
					arg0.anInt6212 = arg0.anInt6260 + 1;
					if (arg0.anInt6212 >= local19.anIntArray403.length) {
						arg0.anInt6212 = 0;
					}
				}
			}
		}
		@Pc(179) int local179;
		@Pc(193) Class137 local193;
		@Pc(176) Class156 local176;
		if (arg0.anInt6274 != -1 && Static400.anInt6752 >= arg0.anInt6240) {
			local176 = Static147.aClass107_1.method2639(arg0.anInt6274);
			local179 = local176.anInt4316;
			if (local179 == -1) {
				arg0.anInt6274 = -1;
			} else {
				label396: {
					local193 = Static281.aClass98_3.method2405(local179);
					if (local176.aBoolean289) {
						if (local193.anInt4044 == 3) {
							if (arg0.anInt6291 > 0 && Static400.anInt6752 >= arg0.anInt6285 && Static400.anInt6752 > arg0.anInt6261) {
								arg0.anInt6274 = -1;
								break label396;
							}
						} else if (local193.anInt4044 == 1 && arg0.anInt6291 > 0 && Static400.anInt6752 >= arg0.anInt6285 && Static400.anInt6752 > arg0.anInt6261) {
							arg0.anInt6240 = Static400.anInt6752 + 1;
							break label396;
						}
					}
					if (local193 == null || local193.anIntArray403 == null) {
						arg0.anInt6274 = -1;
					} else {
						if (arg0.anInt6210 < 0) {
							arg0.anInt6210 = 0;
							Static302.method4200(local193, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, 0, arg0 == Static263.aClass24_Sub3_Sub2_Sub2_4);
						}
						arg0.anInt6233++;
						if (arg0.anInt6210 < local193.anIntArray403.length && local193.anIntArray404[arg0.anInt6210] < arg0.anInt6233) {
							arg0.anInt6210++;
							arg0.anInt6233 = 1;
							Static302.method4200(local193, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, arg0.anInt6210, Static263.aClass24_Sub3_Sub2_Sub2_4 == arg0);
						}
						if (local193.anIntArray403.length <= arg0.anInt6210) {
							if (local176.aBoolean289) {
								arg0.anInt6210 -= local193.anInt4046;
								arg0.anInt6277++;
								if (local193.anInt4047 <= arg0.anInt6277) {
									arg0.anInt6274 = -1;
								} else if (arg0.anInt6210 >= 0 && local193.anIntArray403.length > arg0.anInt6210) {
									Static302.method4200(local193, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, arg0.anInt6210, arg0 == Static263.aClass24_Sub3_Sub2_Sub2_4);
								} else {
									arg0.anInt6274 = -1;
								}
							} else {
								arg0.anInt6274 = -1;
							}
						}
						arg0.anInt6223 = arg0.anInt6210 + 1;
						if (arg0.anInt6223 >= local193.anIntArray403.length) {
							if (local176.aBoolean289) {
								arg0.anInt6223 -= local193.anInt4046;
								if (local193.anInt4047 <= arg0.anInt6277 + 1) {
									arg0.anInt6223 = -1;
								} else if (arg0.anInt6223 < 0 || arg0.anInt6223 >= local193.anIntArray403.length) {
									arg0.anInt6223 = -1;
								}
							} else {
								arg0.anInt6223 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6270 != -1 && arg0.anInt6221 <= Static400.anInt6752) {
			local176 = Static147.aClass107_1.method2639(arg0.anInt6270);
			local179 = local176.anInt4316;
			if (local179 == -1) {
				arg0.anInt6270 = -1;
			} else {
				label399: {
					local193 = Static281.aClass98_3.method2405(local179);
					if (local176.aBoolean289) {
						if (local193.anInt4044 == 3) {
							if (arg0.anInt6291 > 0 && Static400.anInt6752 >= arg0.anInt6285 && Static400.anInt6752 > arg0.anInt6261) {
								arg0.anInt6270 = -1;
								break label399;
							}
						} else if (local193.anInt4044 == 1 && arg0.anInt6291 > 0 && arg0.anInt6285 <= Static400.anInt6752 && arg0.anInt6261 < Static400.anInt6752) {
							arg0.anInt6221 = Static400.anInt6752 + 1;
							break label399;
						}
					}
					if (local193 == null || local193.anIntArray403 == null) {
						arg0.anInt6270 = -1;
					} else {
						if (arg0.anInt6237 < 0) {
							arg0.anInt6237 = 0;
							Static302.method4200(local193, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, 0, Static263.aClass24_Sub3_Sub2_Sub2_4 == arg0);
						}
						arg0.anInt6216++;
						if (arg0.anInt6237 < local193.anIntArray403.length && arg0.anInt6216 > local193.anIntArray404[arg0.anInt6237]) {
							arg0.anInt6216 = 1;
							arg0.anInt6237++;
							Static302.method4200(local193, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, arg0.anInt6237, Static263.aClass24_Sub3_Sub2_Sub2_4 == arg0);
						}
						if (arg0.anInt6237 >= local193.anIntArray403.length) {
							if (local176.aBoolean289) {
								arg0.anInt6237 -= local193.anInt4046;
								arg0.anInt6284++;
								if (arg0.anInt6284 >= local193.anInt4047) {
									arg0.anInt6270 = -1;
								} else if (arg0.anInt6237 >= 0 && arg0.anInt6237 < local193.anIntArray403.length) {
									Static302.method4200(local193, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, arg0.anInt6237, Static263.aClass24_Sub3_Sub2_Sub2_4 == arg0);
								} else {
									arg0.anInt6270 = -1;
								}
							} else {
								arg0.anInt6270 = -1;
							}
						}
						arg0.anInt6273 = arg0.anInt6237 + 1;
						if (arg0.anInt6273 >= local193.anIntArray403.length) {
							if (local176.aBoolean289) {
								arg0.anInt6273 -= local193.anInt4046;
								if (local193.anInt4047 <= arg0.anInt6284 + 1) {
									arg0.anInt6273 = -1;
								} else if (arg0.anInt6273 < 0 || arg0.anInt6273 >= local193.anIntArray403.length) {
									arg0.anInt6273 = -1;
								}
							} else {
								arg0.anInt6273 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6211 != -1 && arg0.anInt6250 <= 1) {
			local19 = Static281.aClass98_3.method2405(arg0.anInt6211);
			if (local19.anInt4044 == 3) {
				if (arg0.anInt6291 > 0 && Static400.anInt6752 >= arg0.anInt6285 && arg0.anInt6261 < Static400.anInt6752) {
					arg0.anInt6211 = -1;
				}
			} else if (local19.anInt4044 == 1 && arg0.anInt6291 > 0 && arg0.anInt6285 <= Static400.anInt6752 && Static400.anInt6752 > arg0.anInt6261) {
				arg0.anInt6250 = 2;
			}
		}
		if (arg0.anInt6211 != -1 && arg0.anInt6250 == 0) {
			local19 = Static281.aClass98_3.method2405(arg0.anInt6211);
			if (local19 == null || local19.anIntArray403 == null) {
				arg0.anInt6211 = -1;
			} else {
				arg0.anInt6222++;
				if (arg0.anInt6231 < local19.anIntArray403.length && arg0.anInt6222 > local19.anIntArray404[arg0.anInt6231]) {
					arg0.anInt6222 = 1;
					arg0.anInt6231++;
					Static302.method4200(local19, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, arg0.anInt6231, arg0 == Static263.aClass24_Sub3_Sub2_Sub2_4);
				}
				if (arg0.anInt6231 >= local19.anIntArray403.length) {
					arg0.anInt6264++;
					arg0.anInt6231 -= local19.anInt4046;
					if (local19.anInt4047 <= arg0.anInt6264) {
						arg0.anInt6211 = -1;
					} else if (arg0.anInt6231 >= 0 && arg0.anInt6231 < local19.anIntArray403.length) {
						Static302.method4200(local19, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, arg0.anInt6231, arg0 == Static263.aClass24_Sub3_Sub2_Sub2_4);
					} else {
						arg0.anInt6211 = -1;
					}
				}
				arg0.anInt6271 = arg0.anInt6231 + 1;
				if (arg0.anInt6271 >= local19.anIntArray403.length) {
					arg0.anInt6271 -= local19.anInt4046;
					if (arg0.anInt6264 + 1 >= local19.anInt4047) {
						arg0.anInt6271 = -1;
					} else if (arg0.anInt6271 < 0 || local19.anIntArray403.length <= arg0.anInt6271) {
						arg0.anInt6271 = -1;
					}
				}
				arg0.anInt6256 = local19.anInt4034;
			}
		}
		if (arg0.anInt6250 > 0) {
			arg0.anInt6250--;
		}
		for (@Pc(1066) int local1066 = 0; local1066 < arg0.aClass91Array3.length; local1066++) {
			@Pc(1073) Class91 local1073 = arg0.aClass91Array3[local1066];
			if (local1073 != null) {
				if (local1073.anInt2759 > 0) {
					local1073.anInt2759--;
				} else {
					@Pc(1092) Class137 local1092 = Static281.aClass98_3.method2405(local1073.anInt2758);
					if (local1092 == null || local1092.anIntArray403 == null) {
						arg0.aClass91Array3[local1066] = null;
					} else {
						local1073.anInt2762++;
						if (local1092.anIntArray403.length > local1073.anInt2761 && local1073.anInt2762 > local1092.anIntArray404[local1073.anInt2761]) {
							local1073.anInt2761++;
							local1073.anInt2762 = 1;
							Static302.method4200(local1092, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, local1073.anInt2761, Static263.aClass24_Sub3_Sub2_Sub2_4 == arg0);
						}
						if (local1092.anIntArray403.length <= local1073.anInt2761) {
							local1073.anInt2763++;
							local1073.anInt2761 -= local1092.anInt4046;
							if (local1073.anInt2763 >= local1092.anInt4047) {
								arg0.aClass91Array3[local1066] = null;
							} else if (local1073.anInt2761 >= 0 && local1073.anInt2761 < local1092.anIntArray403.length) {
								Static302.method4200(local1092, arg0.anInt7092, arg0.anInt7094, arg0.aByte98, local1073.anInt2761, arg0 == Static263.aClass24_Sub3_Sub2_Sub2_4);
							} else {
								arg0.aClass91Array3[local1066] = null;
							}
						}
						local1073.anInt2755 = local1073.anInt2761 + 1;
						if (local1092.anIntArray403.length <= local1073.anInt2755) {
							local1073.anInt2755 -= local1092.anInt4046;
							if (local1092.anInt4047 <= local1073.anInt2763 + 1) {
								local1073.anInt2755 = -1;
							} else if (local1073.anInt2755 < 0 || local1092.anIntArray403.length <= local1073.anInt2755) {
								local1073.anInt2755 = -1;
							}
						}
					}
				}
			}
		}
	}
}

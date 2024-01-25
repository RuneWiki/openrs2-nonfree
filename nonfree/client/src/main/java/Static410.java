import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!r", name = "l", descriptor = "J")
	public static long aLong209;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	public static int anInt7609 = 0;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	public static int anInt7616 = 0;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "Lclient!jr;")
	public static final Class155 aClass155_22 = new Class155("", 16);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_389 = new Class305(46, -1);

	@OriginalMember(owner = "client!r", name = "o", descriptor = "[F")
	public static final float[] aFloatArray63 = new float[4];

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Z")
	public static boolean aBoolean568 = false;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIC)I")
	public static int method6766(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!md;)V")
	public static void method6776(@OriginalArg(1) Class20_Sub1_Sub1 arg0) {
		arg0.anInt8997 = 0;
		@Pc(19) Class176 local19;
		if (arg0.anInt9030 != -1) {
			local19 = Static35.aClass152_1.method4045(arg0.anInt9030);
			if (local19 == null || local19.anIntArray432 == null) {
				arg0.anInt9030 = -1;
				arg0.aBoolean677 = false;
			} else {
				label394: {
					arg0.anInt8974++;
					if (local19.anIntArray432.length > arg0.anInt8973 && arg0.anInt8974 > local19.anIntArray433[arg0.anInt8973]) {
						arg0.anInt8974 = 1;
						arg0.anInt8973++;
						arg0.anInt8993++;
						Static425.method6639(arg0.aByte108, local19, arg0.anInt8949, arg0.anInt8973, Static107.aClass20_Sub1_Sub1_Sub1_1 == arg0, arg0.anInt8954);
					}
					if (local19.anIntArray432.length <= arg0.anInt8973) {
						arg0.anInt8974 = 0;
						arg0.anInt8973 = 0;
						if (arg0.aBoolean677) {
							arg0.anInt9030 = arg0.method7819().method7702();
							if (arg0.anInt9030 == -1) {
								arg0.aBoolean677 = false;
								break label394;
							}
							local19 = Static35.aClass152_1.method4045(arg0.anInt9030);
						}
						Static425.method6639(arg0.aByte108, local19, arg0.anInt8949, arg0.anInt8973, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
					}
					arg0.anInt8993 = arg0.anInt8973 + 1;
					if (local19.anIntArray432.length <= arg0.anInt8993) {
						arg0.anInt8993 = 0;
					}
				}
			}
		}
		@Pc(184) int local184;
		@Pc(198) Class176 local198;
		@Pc(181) Class87 local181;
		if (arg0.anInt8970 != -1 && Static445.anInt7791 >= arg0.anInt8991) {
			local181 = Static530.aClass195_2.method5439(arg0.anInt8970);
			local184 = local181.anInt2314;
			if (local184 == -1) {
				arg0.anInt8970 = -1;
			} else {
				label396: {
					local198 = Static35.aClass152_1.method4045(local184);
					if (local181.aBoolean193) {
						if (local198.anInt5280 == 3) {
							if (arg0.anInt9037 > 0 && arg0.anInt8978 <= Static445.anInt7791 && arg0.anInt8975 < Static445.anInt7791) {
								arg0.anInt8970 = -1;
								break label396;
							}
						} else if (local198.anInt5280 == 1 && arg0.anInt9037 > 0 && Static445.anInt7791 >= arg0.anInt8978 && Static445.anInt7791 > arg0.anInt8975) {
							arg0.anInt8991 = Static445.anInt7791 + 1;
							break label396;
						}
					}
					if (local198 == null || local198.anIntArray432 == null) {
						arg0.anInt8970 = -1;
					} else {
						if (arg0.anInt9026 < 0) {
							arg0.anInt9026 = 0;
							Static425.method6639(arg0.aByte108, local198, arg0.anInt8949, 0, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
						}
						arg0.anInt8968++;
						if (arg0.anInt9026 < local198.anIntArray432.length && arg0.anInt8968 > local198.anIntArray433[arg0.anInt9026]) {
							arg0.anInt9026++;
							arg0.anInt8968 = 1;
							Static425.method6639(arg0.aByte108, local198, arg0.anInt8949, arg0.anInt9026, Static107.aClass20_Sub1_Sub1_Sub1_1 == arg0, arg0.anInt8954);
						}
						if (arg0.anInt9026 >= local198.anIntArray432.length) {
							if (local181.aBoolean193) {
								arg0.anInt9026 -= local198.anInt5288;
								arg0.anInt8965++;
								if (arg0.anInt8965 >= local198.anInt5287) {
									arg0.anInt8970 = -1;
								} else if (arg0.anInt9026 >= 0 && arg0.anInt9026 < local198.anIntArray432.length) {
									Static425.method6639(arg0.aByte108, local198, arg0.anInt8949, arg0.anInt9026, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
								} else {
									arg0.anInt8970 = -1;
								}
							} else {
								arg0.anInt8970 = -1;
							}
						}
						arg0.anInt9027 = arg0.anInt9026 + 1;
						if (local198.anIntArray432.length <= arg0.anInt9027) {
							if (local181.aBoolean193) {
								arg0.anInt9027 -= local198.anInt5288;
								if (arg0.anInt8965 + 1 >= local198.anInt5287) {
									arg0.anInt9027 = -1;
								} else if (arg0.anInt9027 < 0 || arg0.anInt9027 >= local198.anIntArray432.length) {
									arg0.anInt9027 = -1;
								}
							} else {
								arg0.anInt9027 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8967 != -1 && arg0.anInt8999 <= Static445.anInt7791) {
			local181 = Static530.aClass195_2.method5439(arg0.anInt8967);
			local184 = local181.anInt2314;
			if (local184 == -1) {
				arg0.anInt8967 = -1;
			} else {
				label400: {
					local198 = Static35.aClass152_1.method4045(local184);
					if (local181.aBoolean193) {
						if (local198.anInt5280 == 3) {
							if (arg0.anInt9037 > 0 && Static445.anInt7791 >= arg0.anInt8978 && Static445.anInt7791 > arg0.anInt8975) {
								arg0.anInt8967 = -1;
								break label400;
							}
						} else if (local198.anInt5280 == 1 && arg0.anInt9037 > 0 && Static445.anInt7791 >= arg0.anInt8978 && arg0.anInt8975 < Static445.anInt7791) {
							arg0.anInt8999 = Static445.anInt7791 + 1;
							break label400;
						}
					}
					if (local198 == null || local198.anIntArray432 == null) {
						arg0.anInt8967 = -1;
					} else {
						if (arg0.anInt9011 < 0) {
							arg0.anInt9011 = 0;
							Static425.method6639(arg0.aByte108, local198, arg0.anInt8949, 0, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
						}
						arg0.anInt8958++;
						if (arg0.anInt9011 < local198.anIntArray432.length && arg0.anInt8958 > local198.anIntArray433[arg0.anInt9011]) {
							arg0.anInt9011++;
							arg0.anInt8958 = 1;
							Static425.method6639(arg0.aByte108, local198, arg0.anInt8949, arg0.anInt9011, Static107.aClass20_Sub1_Sub1_Sub1_1 == arg0, arg0.anInt8954);
						}
						if (arg0.anInt9011 >= local198.anIntArray432.length) {
							if (local181.aBoolean193) {
								arg0.anInt9003++;
								arg0.anInt9011 -= local198.anInt5288;
								if (arg0.anInt9003 >= local198.anInt5287) {
									arg0.anInt8967 = -1;
								} else if (arg0.anInt9011 >= 0 && local198.anIntArray432.length > arg0.anInt9011) {
									Static425.method6639(arg0.aByte108, local198, arg0.anInt8949, arg0.anInt9011, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
								} else {
									arg0.anInt8967 = -1;
								}
							} else {
								arg0.anInt8967 = -1;
							}
						}
						arg0.anInt8984 = arg0.anInt9011 + 1;
						if (local198.anIntArray432.length <= arg0.anInt8984) {
							if (local181.aBoolean193) {
								arg0.anInt8984 -= local198.anInt5288;
								if (local198.anInt5287 <= arg0.anInt9003 + 1) {
									arg0.anInt8984 = -1;
								} else if (arg0.anInt8984 < 0 || arg0.anInt8984 >= local198.anIntArray432.length) {
									arg0.anInt8984 = -1;
								}
							} else {
								arg0.anInt8984 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt9022 != -1 && arg0.anInt9009 <= 1) {
			local19 = Static35.aClass152_1.method4045(arg0.anInt9022);
			if (local19.anInt5280 == 3) {
				if (arg0.anInt9037 > 0 && Static445.anInt7791 >= arg0.anInt8978 && Static445.anInt7791 > arg0.anInt8975) {
					arg0.anInt9022 = -1;
				}
			} else if (local19.anInt5280 == 1 && arg0.anInt9037 > 0 && arg0.anInt8978 <= Static445.anInt7791 && Static445.anInt7791 > arg0.anInt8975) {
				arg0.anInt9009 = 2;
			}
		}
		if (arg0.anInt9022 != -1 && arg0.anInt9009 == 0) {
			local19 = Static35.aClass152_1.method4045(arg0.anInt9022);
			if (local19 == null || local19.anIntArray432 == null) {
				arg0.anInt9022 = -1;
			} else {
				arg0.anInt9033++;
				if (arg0.anInt8961 < local19.anIntArray432.length && arg0.anInt9033 > local19.anIntArray433[arg0.anInt8961]) {
					arg0.anInt8961++;
					arg0.anInt9033 = 1;
					Static425.method6639(arg0.aByte108, local19, arg0.anInt8949, arg0.anInt8961, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
				}
				if (arg0.anInt8961 >= local19.anIntArray432.length) {
					arg0.anInt8988++;
					arg0.anInt8961 -= local19.anInt5288;
					if (local19.anInt5287 <= arg0.anInt8988) {
						arg0.anInt9022 = -1;
					} else if (arg0.anInt8961 >= 0 && local19.anIntArray432.length > arg0.anInt8961) {
						Static425.method6639(arg0.aByte108, local19, arg0.anInt8949, arg0.anInt8961, Static107.aClass20_Sub1_Sub1_Sub1_1 == arg0, arg0.anInt8954);
					} else {
						arg0.anInt9022 = -1;
					}
				}
				arg0.anInt8979 = arg0.anInt8961 + 1;
				if (arg0.anInt8979 >= local19.anIntArray432.length) {
					arg0.anInt8979 -= local19.anInt5288;
					if (local19.anInt5287 <= arg0.anInt8988 + 1) {
						arg0.anInt8979 = -1;
					} else if (arg0.anInt8979 < 0 || local19.anIntArray432.length <= arg0.anInt8979) {
						arg0.anInt8979 = -1;
					}
				}
				arg0.anInt8997 = local19.anInt5282;
			}
		}
		if (arg0.anInt9009 > 0) {
			arg0.anInt9009--;
		}
		for (@Pc(1060) int local1060 = 0; local1060 < arg0.aClass286Array3.length; local1060++) {
			@Pc(1067) Class286 local1067 = arg0.aClass286Array3[local1060];
			if (local1067 != null) {
				if (local1067.anInt8552 > 0) {
					local1067.anInt8552--;
				} else {
					local198 = Static35.aClass152_1.method4045(local1067.anInt8551);
					if (local198 == null || local198.anIntArray432 == null) {
						arg0.aClass286Array3[local1060] = null;
					} else {
						local1067.anInt8554++;
						if (local198.anIntArray432.length > local1067.anInt8555 && local198.anIntArray433[local1067.anInt8555] < local1067.anInt8554) {
							local1067.anInt8554 = 1;
							local1067.anInt8555++;
							Static425.method6639(arg0.aByte108, local198, arg0.anInt8949, local1067.anInt8555, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
						}
						if (local198.anIntArray432.length <= local1067.anInt8555) {
							local1067.anInt8555 -= local198.anInt5288;
							local1067.anInt8553++;
							if (local198.anInt5287 <= local1067.anInt8553) {
								arg0.aClass286Array3[local1060] = null;
							} else if (local1067.anInt8555 >= 0 && local1067.anInt8555 < local198.anIntArray432.length) {
								Static425.method6639(arg0.aByte108, local198, arg0.anInt8949, local1067.anInt8555, arg0 == Static107.aClass20_Sub1_Sub1_Sub1_1, arg0.anInt8954);
							} else {
								arg0.aClass286Array3[local1060] = null;
							}
						}
						local1067.anInt8556 = local1067.anInt8555 + 1;
						if (local1067.anInt8556 >= local198.anIntArray432.length) {
							local1067.anInt8556 -= local198.anInt5288;
							if (local1067.anInt8553 + 1 >= local198.anInt5287) {
								local1067.anInt8556 = -1;
							} else if (local1067.anInt8556 < 0 || local198.anIntArray432.length <= local1067.anInt8556) {
								local1067.anInt8556 = -1;
							}
						}
					}
				}
			}
		}
	}
}

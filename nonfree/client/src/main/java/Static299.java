import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public static int anInt5549;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
	public static int anInt5552;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!uda;")
	public static final Class292 aClass292_10 = new Class292(1);

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
	public static int anInt5548 = -1;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "S")
	public static short aShort97 = 205;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!dc;)V")
	public static void method4747(@OriginalArg(1) Class49_Sub2_Sub2 arg0) {
		arg0.anInt4306 = 0;
		@Pc(19) Class199 local19;
		if (arg0.anInt4282 != -1) {
			local19 = Static182.aClass218_1.method5221(arg0.anInt4282);
			if (local19 == null || local19.anIntArray574 == null) {
				arg0.anInt4282 = -1;
				arg0.aBoolean306 = false;
			} else {
				label394: {
					arg0.anInt4291++;
					if (arg0.anInt4286 < local19.anIntArray574.length && local19.anIntArray575[arg0.anInt4286] < arg0.anInt4291) {
						arg0.anInt4305++;
						arg0.anInt4286++;
						arg0.anInt4291 = 1;
						Static381.method5839(arg0.anInt7141, arg0 == Static63.aClass49_Sub2_Sub2_Sub1_1, local19, arg0.anInt4286, arg0.aByte98, arg0.anInt7137);
					}
					if (local19.anIntArray574.length <= arg0.anInt4286) {
						arg0.anInt4286 = 0;
						arg0.anInt4291 = 0;
						if (arg0.aBoolean306) {
							arg0.anInt4282 = arg0.method3799().method5395();
							if (arg0.anInt4282 == -1) {
								arg0.aBoolean306 = false;
								break label394;
							}
							local19 = Static182.aClass218_1.method5221(arg0.anInt4282);
						}
						Static381.method5839(arg0.anInt7141, arg0 == Static63.aClass49_Sub2_Sub2_Sub1_1, local19, arg0.anInt4286, arg0.aByte98, arg0.anInt7137);
					}
					arg0.anInt4305 = arg0.anInt4286 + 1;
					if (arg0.anInt4305 >= local19.anIntArray574.length) {
						arg0.anInt4305 = 0;
					}
				}
			}
		}
		@Pc(171) int local171;
		@Pc(180) Class199 local180;
		@Pc(168) Class52 local168;
		if (arg0.anInt4307 != -1 && arg0.anInt4298 <= Static436.anInt6850) {
			local168 = Static489.aClass194_2.method4810(arg0.anInt4307);
			local171 = local168.anInt1342;
			if (local171 == -1) {
				arg0.anInt4307 = -1;
			} else {
				label396: {
					local180 = Static182.aClass218_1.method5221(local171);
					if (local168.aBoolean84) {
						if (local180.anInt5741 == 3) {
							if (arg0.anInt4339 > 0 && arg0.anInt4322 <= Static436.anInt6850 && Static436.anInt6850 > arg0.anInt4278) {
								arg0.anInt4307 = -1;
								break label396;
							}
						} else if (local180.anInt5741 == 1 && arg0.anInt4339 > 0 && Static436.anInt6850 >= arg0.anInt4322 && Static436.anInt6850 > arg0.anInt4278) {
							arg0.anInt4298 = Static436.anInt6850 + 1;
							break label396;
						}
					}
					if (local180 == null || local180.anIntArray574 == null) {
						arg0.anInt4307 = -1;
					} else {
						if (arg0.anInt4334 < 0) {
							arg0.anInt4334 = 0;
							Static381.method5839(arg0.anInt7141, Static63.aClass49_Sub2_Sub2_Sub1_1 == arg0, local180, 0, arg0.aByte98, arg0.anInt7137);
						}
						arg0.anInt4262++;
						if (arg0.anInt4334 < local180.anIntArray574.length && arg0.anInt4262 > local180.anIntArray575[arg0.anInt4334]) {
							arg0.anInt4262 = 1;
							arg0.anInt4334++;
							Static381.method5839(arg0.anInt7141, arg0 == Static63.aClass49_Sub2_Sub2_Sub1_1, local180, arg0.anInt4334, arg0.aByte98, arg0.anInt7137);
						}
						if (arg0.anInt4334 >= local180.anIntArray574.length) {
							if (local168.aBoolean84) {
								arg0.anInt4334 -= local180.anInt5746;
								arg0.anInt4317++;
								if (local180.anInt5735 <= arg0.anInt4317) {
									arg0.anInt4307 = -1;
								} else if (arg0.anInt4334 >= 0 && arg0.anInt4334 < local180.anIntArray574.length) {
									Static381.method5839(arg0.anInt7141, arg0 == Static63.aClass49_Sub2_Sub2_Sub1_1, local180, arg0.anInt4334, arg0.aByte98, arg0.anInt7137);
								} else {
									arg0.anInt4307 = -1;
								}
							} else {
								arg0.anInt4307 = -1;
							}
						}
						arg0.anInt4313 = arg0.anInt4334 + 1;
						if (arg0.anInt4313 >= local180.anIntArray574.length) {
							if (local168.aBoolean84) {
								arg0.anInt4313 -= local180.anInt5746;
								if (arg0.anInt4317 + 1 >= local180.anInt5735) {
									arg0.anInt4313 = -1;
								} else if (arg0.anInt4313 < 0 || arg0.anInt4313 >= local180.anIntArray574.length) {
									arg0.anInt4313 = -1;
								}
							} else {
								arg0.anInt4313 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4289 != -1 && arg0.anInt4304 <= Static436.anInt6850) {
			local168 = Static489.aClass194_2.method4810(arg0.anInt4289);
			local171 = local168.anInt1342;
			if (local171 == -1) {
				arg0.anInt4289 = -1;
			} else {
				label399: {
					local180 = Static182.aClass218_1.method5221(local171);
					if (local168.aBoolean84) {
						if (local180.anInt5741 == 3) {
							if (arg0.anInt4339 > 0 && Static436.anInt6850 >= arg0.anInt4322 && Static436.anInt6850 > arg0.anInt4278) {
								arg0.anInt4289 = -1;
								break label399;
							}
						} else if (local180.anInt5741 == 1 && arg0.anInt4339 > 0 && Static436.anInt6850 >= arg0.anInt4322 && arg0.anInt4278 < Static436.anInt6850) {
							arg0.anInt4304 = Static436.anInt6850 + 1;
							break label399;
						}
					}
					if (local180 == null || local180.anIntArray574 == null) {
						arg0.anInt4289 = -1;
					} else {
						if (arg0.anInt4284 < 0) {
							arg0.anInt4284 = 0;
							Static381.method5839(arg0.anInt7141, arg0 == Static63.aClass49_Sub2_Sub2_Sub1_1, local180, 0, arg0.aByte98, arg0.anInt7137);
						}
						arg0.anInt4290++;
						if (local180.anIntArray574.length > arg0.anInt4284 && local180.anIntArray575[arg0.anInt4284] < arg0.anInt4290) {
							arg0.anInt4284++;
							arg0.anInt4290 = 1;
							Static381.method5839(arg0.anInt7141, arg0 == Static63.aClass49_Sub2_Sub2_Sub1_1, local180, arg0.anInt4284, arg0.aByte98, arg0.anInt7137);
						}
						if (local180.anIntArray574.length <= arg0.anInt4284) {
							if (local168.aBoolean84) {
								arg0.anInt4284 -= local180.anInt5746;
								arg0.anInt4314++;
								if (local180.anInt5735 <= arg0.anInt4314) {
									arg0.anInt4289 = -1;
								} else if (arg0.anInt4284 >= 0 && arg0.anInt4284 < local180.anIntArray574.length) {
									Static381.method5839(arg0.anInt7141, Static63.aClass49_Sub2_Sub2_Sub1_1 == arg0, local180, arg0.anInt4284, arg0.aByte98, arg0.anInt7137);
								} else {
									arg0.anInt4289 = -1;
								}
							} else {
								arg0.anInt4289 = -1;
							}
						}
						arg0.anInt4327 = arg0.anInt4284 + 1;
						if (local180.anIntArray574.length <= arg0.anInt4327) {
							if (local168.aBoolean84) {
								arg0.anInt4327 -= local180.anInt5746;
								if (local180.anInt5735 <= arg0.anInt4314 + 1) {
									arg0.anInt4327 = -1;
								} else if (arg0.anInt4327 < 0 || arg0.anInt4327 >= local180.anIntArray574.length) {
									arg0.anInt4327 = -1;
								}
							} else {
								arg0.anInt4327 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4297 != -1 && arg0.anInt4316 <= 1) {
			local19 = Static182.aClass218_1.method5221(arg0.anInt4297);
			if (local19.anInt5741 == 3) {
				if (arg0.anInt4339 > 0 && arg0.anInt4322 <= Static436.anInt6850 && Static436.anInt6850 > arg0.anInt4278) {
					arg0.anInt4297 = -1;
				}
			} else if (local19.anInt5741 == 1 && arg0.anInt4339 > 0 && arg0.anInt4322 <= Static436.anInt6850 && arg0.anInt4278 < Static436.anInt6850) {
				arg0.anInt4316 = 2;
			}
		}
		if (arg0.anInt4297 != -1 && arg0.anInt4316 == 0) {
			local19 = Static182.aClass218_1.method5221(arg0.anInt4297);
			if (local19 == null || local19.anIntArray574 == null) {
				arg0.anInt4297 = -1;
			} else {
				arg0.anInt4265++;
				if (local19.anIntArray574.length > arg0.anInt4303 && arg0.anInt4265 > local19.anIntArray575[arg0.anInt4303]) {
					arg0.anInt4265 = 1;
					arg0.anInt4303++;
					Static381.method5839(arg0.anInt7141, Static63.aClass49_Sub2_Sub2_Sub1_1 == arg0, local19, arg0.anInt4303, arg0.aByte98, arg0.anInt7137);
				}
				if (local19.anIntArray574.length <= arg0.anInt4303) {
					arg0.anInt4293++;
					arg0.anInt4303 -= local19.anInt5746;
					if (local19.anInt5735 <= arg0.anInt4293) {
						arg0.anInt4297 = -1;
					} else if (arg0.anInt4303 >= 0 && arg0.anInt4303 < local19.anIntArray574.length) {
						Static381.method5839(arg0.anInt7141, arg0 == Static63.aClass49_Sub2_Sub2_Sub1_1, local19, arg0.anInt4303, arg0.aByte98, arg0.anInt7137);
					} else {
						arg0.anInt4297 = -1;
					}
				}
				arg0.anInt4288 = arg0.anInt4303 + 1;
				if (arg0.anInt4288 >= local19.anIntArray574.length) {
					arg0.anInt4288 -= local19.anInt5746;
					if (local19.anInt5735 <= arg0.anInt4293 + 1) {
						arg0.anInt4288 = -1;
					} else if (arg0.anInt4288 < 0 || arg0.anInt4288 >= local19.anIntArray574.length) {
						arg0.anInt4288 = -1;
					}
				}
				arg0.anInt4306 = local19.anInt5740;
			}
		}
		if (arg0.anInt4316 > 0) {
			arg0.anInt4316--;
		}
		for (@Pc(1030) int local1030 = 0; local1030 < arg0.aClass166Array3.length; local1030++) {
			@Pc(1037) Class166 local1037 = arg0.aClass166Array3[local1030];
			if (local1037 != null) {
				if (local1037.anInt4911 > 0) {
					local1037.anInt4911--;
				} else {
					local180 = Static182.aClass218_1.method5221(local1037.anInt4909);
					if (local180 == null || local180.anIntArray574 == null) {
						arg0.aClass166Array3[local1030] = null;
					} else {
						local1037.anInt4903++;
						if (local1037.anInt4904 < local180.anIntArray574.length && local180.anIntArray575[local1037.anInt4904] < local1037.anInt4903) {
							local1037.anInt4903 = 1;
							local1037.anInt4904++;
							Static381.method5839(arg0.anInt7141, Static63.aClass49_Sub2_Sub2_Sub1_1 == arg0, local180, local1037.anInt4904, arg0.aByte98, arg0.anInt7137);
						}
						if (local180.anIntArray574.length <= local1037.anInt4904) {
							local1037.anInt4907++;
							local1037.anInt4904 -= local180.anInt5746;
							if (local1037.anInt4907 >= local180.anInt5735) {
								arg0.aClass166Array3[local1030] = null;
							} else if (local1037.anInt4904 >= 0 && local180.anIntArray574.length > local1037.anInt4904) {
								Static381.method5839(arg0.anInt7141, Static63.aClass49_Sub2_Sub2_Sub1_1 == arg0, local180, local1037.anInt4904, arg0.aByte98, arg0.anInt7137);
							} else {
								arg0.aClass166Array3[local1030] = null;
							}
						}
						local1037.anInt4905 = local1037.anInt4904 + 1;
						if (local180.anIntArray574.length <= local1037.anInt4905) {
							local1037.anInt4905 -= local180.anInt5746;
							if (local1037.anInt4907 + 1 >= local180.anInt5735) {
								local1037.anInt4905 = -1;
							} else if (local1037.anInt4905 < 0 || local1037.anInt4905 >= local180.anIntArray574.length) {
								local1037.anInt4905 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public static void method4748() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static3.aBooleanArray1[local7] = true;
		}
	}
}

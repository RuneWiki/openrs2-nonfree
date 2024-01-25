import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "Lclient!jo;")
	public static Class168 aClass168_35;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_32 = new Class181(83, 4);

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_60 = new Class254(62, 6);

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_33 = new Class181(41, -1);

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	public static int anInt2833 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLclient!fp;)V")
	public static void method2505(@OriginalArg(1) Class11_Sub1_Sub1 arg0) {
		arg0.anInt7396 = 0;
		@Pc(18) Class16 local18;
		if (arg0.anInt7390 != -1) {
			local18 = Static114.aClass156_2.method4101(arg0.anInt7390);
			if (local18 == null || local18.anIntArray47 == null) {
				arg0.aBoolean545 = false;
				arg0.anInt7390 = -1;
			} else {
				label394: {
					arg0.anInt7422++;
					if (arg0.anInt7383 < local18.anIntArray47.length && arg0.anInt7422 > local18.anIntArray46[arg0.anInt7383]) {
						arg0.anInt7422 = 1;
						arg0.anInt7356++;
						arg0.anInt7383++;
						Static360.method5794(arg0.anInt7347, local18, arg0.anInt7351, arg0.aByte77, arg0.anInt7383, arg0 == Static350.aClass11_Sub1_Sub1_Sub2_4);
					}
					if (local18.anIntArray47.length <= arg0.anInt7383) {
						arg0.anInt7383 = 0;
						arg0.anInt7422 = 0;
						if (arg0.aBoolean545) {
							arg0.anInt7390 = arg0.method6209().method4461();
							if (arg0.anInt7390 == -1) {
								arg0.aBoolean545 = false;
								break label394;
							}
							local18 = Static114.aClass156_2.method4101(arg0.anInt7390);
						}
						Static360.method5794(arg0.anInt7347, local18, arg0.anInt7351, arg0.aByte77, arg0.anInt7383, arg0 == Static350.aClass11_Sub1_Sub1_Sub2_4);
					}
					arg0.anInt7356 = arg0.anInt7383 + 1;
					if (local18.anIntArray47.length <= arg0.anInt7356) {
						arg0.anInt7356 = 0;
					}
				}
			}
		}
		@Pc(183) int local183;
		@Pc(196) Class16 local196;
		@Pc(180) Class212 local180;
		if (arg0.anInt7384 != -1 && arg0.anInt7405 <= Static508.anInt8998) {
			local180 = Static355.aClass278_2.method6826(arg0.anInt7384);
			local183 = local180.anInt6056;
			if (local183 == -1) {
				arg0.anInt7384 = -1;
			} else {
				label396: {
					local196 = Static114.aClass156_2.method4101(local183);
					if (local180.aBoolean450) {
						if (local196.anInt589 == 3) {
							if (arg0.anInt7435 > 0 && Static508.anInt8998 >= arg0.anInt7391 && Static508.anInt8998 > arg0.anInt7428) {
								arg0.anInt7384 = -1;
								break label396;
							}
						} else if (local196.anInt589 == 1 && arg0.anInt7435 > 0 && arg0.anInt7391 <= Static508.anInt8998 && Static508.anInt8998 > arg0.anInt7428) {
							arg0.anInt7405 = Static508.anInt8998 + 1;
							break label396;
						}
					}
					if (local196 == null || local196.anIntArray47 == null) {
						arg0.anInt7384 = -1;
					} else {
						if (arg0.anInt7417 < 0) {
							arg0.anInt7417 = 0;
							Static360.method5794(arg0.anInt7347, local196, arg0.anInt7351, arg0.aByte77, 0, arg0 == Static350.aClass11_Sub1_Sub1_Sub2_4);
						}
						arg0.anInt7408++;
						if (local196.anIntArray47.length > arg0.anInt7417 && arg0.anInt7408 > local196.anIntArray46[arg0.anInt7417]) {
							arg0.anInt7417++;
							arg0.anInt7408 = 1;
							Static360.method5794(arg0.anInt7347, local196, arg0.anInt7351, arg0.aByte77, arg0.anInt7417, arg0 == Static350.aClass11_Sub1_Sub1_Sub2_4);
						}
						if (arg0.anInt7417 >= local196.anIntArray47.length) {
							if (local180.aBoolean450) {
								arg0.anInt7400++;
								arg0.anInt7417 -= local196.anInt587;
								if (local196.anInt576 <= arg0.anInt7400) {
									arg0.anInt7384 = -1;
								} else if (arg0.anInt7417 >= 0 && local196.anIntArray47.length > arg0.anInt7417) {
									Static360.method5794(arg0.anInt7347, local196, arg0.anInt7351, arg0.aByte77, arg0.anInt7417, Static350.aClass11_Sub1_Sub1_Sub2_4 == arg0);
								} else {
									arg0.anInt7384 = -1;
								}
							} else {
								arg0.anInt7384 = -1;
							}
						}
						arg0.anInt7398 = arg0.anInt7417 + 1;
						if (arg0.anInt7398 >= local196.anIntArray47.length) {
							if (local180.aBoolean450) {
								arg0.anInt7398 -= local196.anInt587;
								if (local196.anInt576 <= arg0.anInt7400 + 1) {
									arg0.anInt7398 = -1;
								} else if (arg0.anInt7398 < 0 || local196.anIntArray47.length <= arg0.anInt7398) {
									arg0.anInt7398 = -1;
								}
							} else {
								arg0.anInt7398 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7393 != -1 && Static508.anInt8998 >= arg0.anInt7385) {
			local180 = Static355.aClass278_2.method6826(arg0.anInt7393);
			local183 = local180.anInt6056;
			if (local183 == -1) {
				arg0.anInt7393 = -1;
			} else {
				label399: {
					local196 = Static114.aClass156_2.method4101(local183);
					if (local180.aBoolean450) {
						if (local196.anInt589 == 3) {
							if (arg0.anInt7435 > 0 && Static508.anInt8998 >= arg0.anInt7391 && arg0.anInt7428 < Static508.anInt8998) {
								arg0.anInt7393 = -1;
								break label399;
							}
						} else if (local196.anInt589 == 1 && arg0.anInt7435 > 0 && Static508.anInt8998 >= arg0.anInt7391 && Static508.anInt8998 > arg0.anInt7428) {
							arg0.anInt7385 = Static508.anInt8998 + 1;
							break label399;
						}
					}
					if (local196 == null || local196.anIntArray47 == null) {
						arg0.anInt7393 = -1;
					} else {
						if (arg0.anInt7360 < 0) {
							arg0.anInt7360 = 0;
							Static360.method5794(arg0.anInt7347, local196, arg0.anInt7351, arg0.aByte77, 0, Static350.aClass11_Sub1_Sub1_Sub2_4 == arg0);
						}
						arg0.anInt7425++;
						if (arg0.anInt7360 < local196.anIntArray47.length && local196.anIntArray46[arg0.anInt7360] < arg0.anInt7425) {
							arg0.anInt7360++;
							arg0.anInt7425 = 1;
							Static360.method5794(arg0.anInt7347, local196, arg0.anInt7351, arg0.aByte77, arg0.anInt7360, Static350.aClass11_Sub1_Sub1_Sub2_4 == arg0);
						}
						if (arg0.anInt7360 >= local196.anIntArray47.length) {
							if (local180.aBoolean450) {
								arg0.anInt7420++;
								arg0.anInt7360 -= local196.anInt587;
								if (arg0.anInt7420 >= local196.anInt576) {
									arg0.anInt7393 = -1;
								} else if (arg0.anInt7360 >= 0 && arg0.anInt7360 < local196.anIntArray47.length) {
									Static360.method5794(arg0.anInt7347, local196, arg0.anInt7351, arg0.aByte77, arg0.anInt7360, Static350.aClass11_Sub1_Sub1_Sub2_4 == arg0);
								} else {
									arg0.anInt7393 = -1;
								}
							} else {
								arg0.anInt7393 = -1;
							}
						}
						arg0.anInt7423 = arg0.anInt7360 + 1;
						if (arg0.anInt7423 >= local196.anIntArray47.length) {
							if (local180.aBoolean450) {
								arg0.anInt7423 -= local196.anInt587;
								if (local196.anInt576 <= arg0.anInt7420 + 1) {
									arg0.anInt7423 = -1;
								} else if (arg0.anInt7423 < 0 || local196.anIntArray47.length <= arg0.anInt7423) {
									arg0.anInt7423 = -1;
								}
							} else {
								arg0.anInt7423 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7387 != -1 && arg0.anInt7401 <= 1) {
			local18 = Static114.aClass156_2.method4101(arg0.anInt7387);
			if (local18.anInt589 == 3) {
				if (arg0.anInt7435 > 0 && arg0.anInt7391 <= Static508.anInt8998 && arg0.anInt7428 < Static508.anInt8998) {
					arg0.anInt7387 = -1;
				}
			} else if (local18.anInt589 == 1 && arg0.anInt7435 > 0 && arg0.anInt7391 <= Static508.anInt8998 && Static508.anInt8998 > arg0.anInt7428) {
				arg0.anInt7401 = 2;
			}
		}
		if (arg0.anInt7387 != -1 && arg0.anInt7401 == 0) {
			local18 = Static114.aClass156_2.method4101(arg0.anInt7387);
			if (local18 == null || local18.anIntArray47 == null) {
				arg0.anInt7387 = -1;
			} else {
				arg0.anInt7414++;
				if (local18.anIntArray47.length > arg0.anInt7361 && local18.anIntArray46[arg0.anInt7361] < arg0.anInt7414) {
					arg0.anInt7414 = 1;
					arg0.anInt7361++;
					Static360.method5794(arg0.anInt7347, local18, arg0.anInt7351, arg0.aByte77, arg0.anInt7361, arg0 == Static350.aClass11_Sub1_Sub1_Sub2_4);
				}
				if (local18.anIntArray47.length <= arg0.anInt7361) {
					arg0.anInt7368++;
					arg0.anInt7361 -= local18.anInt587;
					if (local18.anInt576 <= arg0.anInt7368) {
						arg0.anInt7387 = -1;
					} else if (arg0.anInt7361 >= 0 && local18.anIntArray47.length > arg0.anInt7361) {
						Static360.method5794(arg0.anInt7347, local18, arg0.anInt7351, arg0.aByte77, arg0.anInt7361, arg0 == Static350.aClass11_Sub1_Sub1_Sub2_4);
					} else {
						arg0.anInt7387 = -1;
					}
				}
				arg0.anInt7371 = arg0.anInt7361 + 1;
				if (local18.anIntArray47.length <= arg0.anInt7371) {
					arg0.anInt7371 -= local18.anInt587;
					if (local18.anInt576 <= arg0.anInt7368 + 1) {
						arg0.anInt7371 = -1;
					} else if (arg0.anInt7371 < 0 || local18.anIntArray47.length <= arg0.anInt7371) {
						arg0.anInt7371 = -1;
					}
				}
				arg0.anInt7396 = local18.anInt586;
			}
		}
		if (arg0.anInt7401 > 0) {
			arg0.anInt7401--;
		}
		for (@Pc(1070) int local1070 = 0; local1070 < arg0.aClass324Array3.length; local1070++) {
			@Pc(1077) Class324 local1077 = arg0.aClass324Array3[local1070];
			if (local1077 != null) {
				if (local1077.anInt9241 > 0) {
					local1077.anInt9241--;
				} else {
					local196 = Static114.aClass156_2.method4101(local1077.anInt9238);
					if (local196 == null || local196.anIntArray47 == null) {
						arg0.aClass324Array3[local1070] = null;
					} else {
						local1077.anInt9237++;
						if (local196.anIntArray47.length > local1077.anInt9242 && local196.anIntArray46[local1077.anInt9242] < local1077.anInt9237) {
							local1077.anInt9237 = 1;
							local1077.anInt9242++;
							Static360.method5794(arg0.anInt7347, local196, arg0.anInt7351, arg0.aByte77, local1077.anInt9242, arg0 == Static350.aClass11_Sub1_Sub1_Sub2_4);
						}
						if (local196.anIntArray47.length <= local1077.anInt9242) {
							local1077.anInt9240++;
							local1077.anInt9242 -= local196.anInt587;
							if (local196.anInt576 <= local1077.anInt9240) {
								arg0.aClass324Array3[local1070] = null;
							} else if (local1077.anInt9242 >= 0 && local196.anIntArray47.length > local1077.anInt9242) {
								Static360.method5794(arg0.anInt7347, local196, arg0.anInt7351, arg0.aByte77, local1077.anInt9242, arg0 == Static350.aClass11_Sub1_Sub1_Sub2_4);
							} else {
								arg0.aClass324Array3[local1070] = null;
							}
						}
						local1077.anInt9239 = local1077.anInt9242 + 1;
						if (local196.anIntArray47.length <= local1077.anInt9239) {
							local1077.anInt9239 -= local196.anInt587;
							if (local1077.anInt9240 + 1 >= local196.anInt576) {
								local1077.anInt9239 = -1;
							} else if (local1077.anInt9239 < 0 || local1077.anInt9239 >= local196.anIntArray47.length) {
								local1077.anInt9239 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
	public static void method2508() {
		Static403.method6315();
	}
}

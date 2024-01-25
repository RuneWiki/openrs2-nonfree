import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	public static int anInt6160;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	public static int anInt6156 = 0;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!db;")
	public static final Class64 aClass64_305 = new Class64(83, 5);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLclient!tga;)Z")
	public static boolean method5226(@OriginalArg(1) Class315 arg0) {
		return Static250.aClass315_5 == arg0 || arg0 == Static58.aClass315_3 || Static463.aClass315_7 == arg0 || arg0 == Static440.aClass315_6;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!sda;)V")
	public static void method5228(@OriginalArg(1) Class4_Sub13 arg0) {
		if (arg0.aClass4_Sub16_5 != null) {
			arg0.aClass4_Sub16_5.anInt3113 = 0;
		}
		arg0.aBoolean532 = false;
		for (@Pc(18) Class4_Sub13 local18 = arg0.method6220(); local18 != null; local18 = arg0.method6216()) {
			method5228(local18);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!vj;I)V")
	public static void method5229(@OriginalArg(0) Class10_Sub1_Sub2 arg0) {
		arg0.anInt8498 = 0;
		@Pc(19) Class77 local19;
		if (arg0.anInt8491 != -1) {
			local19 = Static168.aClass327_2.method7326(arg0.anInt8491);
			if (local19 == null || local19.anIntArray238 == null) {
				arg0.anInt8491 = -1;
				arg0.aBoolean592 = false;
			} else {
				label394: {
					arg0.anInt8526++;
					if (local19.anIntArray238.length > arg0.anInt8518 && local19.anIntArray240[arg0.anInt8518] < arg0.anInt8526) {
						arg0.anInt8484++;
						arg0.anInt8518++;
						arg0.anInt8526 = 1;
						Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, arg0.anInt8518, local19, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg0);
					}
					if (arg0.anInt8518 >= local19.anIntArray238.length) {
						arg0.anInt8518 = 0;
						arg0.anInt8526 = 0;
						if (arg0.aBoolean592) {
							arg0.anInt8491 = arg0.method7026().method3356();
							if (arg0.anInt8491 == -1) {
								arg0.aBoolean592 = false;
								break label394;
							}
							local19 = Static168.aClass327_2.method7326(arg0.anInt8491);
						}
						Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, arg0.anInt8518, local19, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg0);
					}
					arg0.anInt8484 = arg0.anInt8518 + 1;
					if (arg0.anInt8484 >= local19.anIntArray238.length) {
						arg0.anInt8484 = 0;
					}
				}
			}
		}
		@Pc(187) int local187;
		@Pc(202) Class77 local202;
		@Pc(184) Class318 local184;
		if (arg0.anInt8504 != -1 && Static237.anInt7561 >= arg0.anInt8514) {
			local184 = Static206.aClass275_1.method6050(arg0.anInt8504);
			local187 = local184.anInt8788;
			if (local187 == -1) {
				arg0.anInt8504 = -1;
			} else {
				label396: {
					local202 = Static168.aClass327_2.method7326(local187);
					if (local184.aBoolean610) {
						if (local202.anInt2587 == 3) {
							if (arg0.anInt8536 > 0 && arg0.anInt8462 <= Static237.anInt7561 && Static237.anInt7561 > arg0.anInt8509) {
								arg0.anInt8504 = -1;
								break label396;
							}
						} else if (local202.anInt2587 == 1 && arg0.anInt8536 > 0 && arg0.anInt8462 <= Static237.anInt7561 && Static237.anInt7561 > arg0.anInt8509) {
							arg0.anInt8514 = Static237.anInt7561 + 1;
							break label396;
						}
					}
					if (local202 == null || local202.anIntArray238 == null) {
						arg0.anInt8504 = -1;
					} else {
						if (arg0.anInt8500 < 0) {
							arg0.anInt8500 = 0;
							Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, 0, local202, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg0);
						}
						arg0.anInt8481++;
						if (arg0.anInt8500 < local202.anIntArray238.length && arg0.anInt8481 > local202.anIntArray240[arg0.anInt8500]) {
							arg0.anInt8481 = 1;
							arg0.anInt8500++;
							Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, arg0.anInt8500, local202, arg0 == Static129.aClass10_Sub1_Sub2_Sub2_1);
						}
						if (arg0.anInt8500 >= local202.anIntArray238.length) {
							if (local184.aBoolean610) {
								arg0.anInt8500 -= local202.anInt2575;
								arg0.anInt8528++;
								if (local202.anInt2577 <= arg0.anInt8528) {
									arg0.anInt8504 = -1;
								} else if (arg0.anInt8500 >= 0 && arg0.anInt8500 < local202.anIntArray238.length) {
									Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, arg0.anInt8500, local202, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg0);
								} else {
									arg0.anInt8504 = -1;
								}
							} else {
								arg0.anInt8504 = -1;
							}
						}
						arg0.anInt8507 = arg0.anInt8500 + 1;
						if (local202.anIntArray238.length <= arg0.anInt8507) {
							if (local184.aBoolean610) {
								arg0.anInt8507 -= local202.anInt2575;
								if (arg0.anInt8528 + 1 >= local202.anInt2577) {
									arg0.anInt8507 = -1;
								} else if (arg0.anInt8507 < 0 || arg0.anInt8507 >= local202.anIntArray238.length) {
									arg0.anInt8507 = -1;
								}
							} else {
								arg0.anInt8507 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8529 != -1 && Static237.anInt7561 >= arg0.anInt8516) {
			local184 = Static206.aClass275_1.method6050(arg0.anInt8529);
			local187 = local184.anInt8788;
			if (local187 == -1) {
				arg0.anInt8529 = -1;
			} else {
				label399: {
					local202 = Static168.aClass327_2.method7326(local187);
					if (local184.aBoolean610) {
						if (local202.anInt2587 == 3) {
							if (arg0.anInt8536 > 0 && arg0.anInt8462 <= Static237.anInt7561 && arg0.anInt8509 < Static237.anInt7561) {
								arg0.anInt8529 = -1;
								break label399;
							}
						} else if (local202.anInt2587 == 1 && arg0.anInt8536 > 0 && Static237.anInt7561 >= arg0.anInt8462 && arg0.anInt8509 < Static237.anInt7561) {
							arg0.anInt8516 = Static237.anInt7561 + 1;
							break label399;
						}
					}
					if (local202 == null || local202.anIntArray238 == null) {
						arg0.anInt8529 = -1;
					} else {
						if (arg0.anInt8460 < 0) {
							arg0.anInt8460 = 0;
							Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, 0, local202, arg0 == Static129.aClass10_Sub1_Sub2_Sub2_1);
						}
						arg0.anInt8519++;
						if (arg0.anInt8460 < local202.anIntArray238.length && local202.anIntArray240[arg0.anInt8460] < arg0.anInt8519) {
							arg0.anInt8460++;
							arg0.anInt8519 = 1;
							Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, arg0.anInt8460, local202, arg0 == Static129.aClass10_Sub1_Sub2_Sub2_1);
						}
						if (arg0.anInt8460 >= local202.anIntArray238.length) {
							if (local184.aBoolean610) {
								arg0.anInt8470++;
								arg0.anInt8460 -= local202.anInt2575;
								if (local202.anInt2577 <= arg0.anInt8470) {
									arg0.anInt8529 = -1;
								} else if (arg0.anInt8460 >= 0 && arg0.anInt8460 < local202.anIntArray238.length) {
									Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, arg0.anInt8460, local202, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg0);
								} else {
									arg0.anInt8529 = -1;
								}
							} else {
								arg0.anInt8529 = -1;
							}
						}
						arg0.anInt8515 = arg0.anInt8460 + 1;
						if (arg0.anInt8515 >= local202.anIntArray238.length) {
							if (local184.aBoolean610) {
								arg0.anInt8515 -= local202.anInt2575;
								if (local202.anInt2577 <= arg0.anInt8470 + 1) {
									arg0.anInt8515 = -1;
								} else if (arg0.anInt8515 < 0 || arg0.anInt8515 >= local202.anIntArray238.length) {
									arg0.anInt8515 = -1;
								}
							} else {
								arg0.anInt8515 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8483 != -1 && arg0.anInt8510 <= 1) {
			local19 = Static168.aClass327_2.method7326(arg0.anInt8483);
			if (local19.anInt2587 == 3) {
				if (arg0.anInt8536 > 0 && arg0.anInt8462 <= Static237.anInt7561 && arg0.anInt8509 < Static237.anInt7561) {
					arg0.anInt8483 = -1;
					arg0.anIntArray651 = null;
				}
			} else if (local19.anInt2587 == 1 && arg0.anInt8536 > 0 && arg0.anInt8462 <= Static237.anInt7561 && arg0.anInt8509 < Static237.anInt7561) {
				arg0.anInt8510 = 2;
			}
		}
		if (arg0.anInt8483 != -1 && arg0.anInt8510 == 0) {
			local19 = Static168.aClass327_2.method7326(arg0.anInt8483);
			if (local19 == null || local19.anIntArray238 == null) {
				arg0.anIntArray651 = null;
				arg0.anInt8483 = -1;
			} else {
				arg0.anInt8468++;
				if (arg0.anInt8521 < local19.anIntArray238.length && arg0.anInt8468 > local19.anIntArray240[arg0.anInt8521]) {
					arg0.anInt8521++;
					arg0.anInt8468 = 1;
					Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, arg0.anInt8521, local19, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg0);
				}
				if (local19.anIntArray238.length <= arg0.anInt8521) {
					arg0.anInt8527++;
					arg0.anInt8521 -= local19.anInt2575;
					if (arg0.anInt8527 >= local19.anInt2577) {
						arg0.anIntArray651 = null;
						arg0.anInt8483 = -1;
					} else if (arg0.anInt8521 >= 0 && local19.anIntArray238.length > arg0.anInt8521) {
						Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, arg0.anInt8521, local19, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg0);
					} else {
						arg0.anIntArray651 = null;
						arg0.anInt8483 = -1;
					}
				}
				arg0.anInt8506 = arg0.anInt8521 + 1;
				if (local19.anIntArray238.length <= arg0.anInt8506) {
					arg0.anInt8506 -= local19.anInt2575;
					if (arg0.anInt8527 + 1 >= local19.anInt2577) {
						arg0.anInt8506 = -1;
					} else if (arg0.anInt8506 < 0 || local19.anIntArray238.length <= arg0.anInt8506) {
						arg0.anInt8506 = -1;
					}
				}
				arg0.anInt8498 = local19.anInt2584;
			}
		}
		if (arg0.anInt8510 > 0) {
			arg0.anInt8510--;
		}
		for (@Pc(1079) int local1079 = 0; local1079 < arg0.aClass261Array3.length; local1079++) {
			@Pc(1086) Class261 local1086 = arg0.aClass261Array3[local1079];
			if (local1086 != null) {
				if (local1086.anInt6946 > 0) {
					local1086.anInt6946--;
				} else {
					local202 = Static168.aClass327_2.method7326(local1086.anInt6949);
					if (local202 == null || local202.anIntArray238 == null) {
						arg0.aClass261Array3[local1079] = null;
					} else {
						local1086.anInt6947++;
						if (local1086.anInt6950 < local202.anIntArray238.length && local202.anIntArray240[local1086.anInt6950] < local1086.anInt6947) {
							local1086.anInt6950++;
							local1086.anInt6947 = 1;
							Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, local1086.anInt6950, local202, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg0);
						}
						if (local1086.anInt6950 >= local202.anIntArray238.length) {
							local1086.anInt6945++;
							local1086.anInt6950 -= local202.anInt2575;
							if (local202.anInt2577 <= local1086.anInt6945) {
								arg0.aClass261Array3[local1079] = null;
							} else if (local1086.anInt6950 >= 0 && local1086.anInt6950 < local202.anIntArray238.length) {
								Static240.method4084(arg0.aByte101, arg0.anInt8934, arg0.anInt8929, local1086.anInt6950, local202, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg0);
							} else {
								arg0.aClass261Array3[local1079] = null;
							}
						}
						local1086.anInt6948 = local1086.anInt6950 + 1;
						if (local202.anIntArray238.length <= local1086.anInt6948) {
							local1086.anInt6948 -= local202.anInt2575;
							if (local1086.anInt6945 + 1 >= local202.anInt2577) {
								local1086.anInt6948 = -1;
							} else if (local1086.anInt6948 < 0 || local1086.anInt6948 >= local202.anIntArray238.length) {
								local1086.anInt6948 = -1;
							}
						}
					}
				}
			}
		}
	}
}

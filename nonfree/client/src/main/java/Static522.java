import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BLclient!rq;)V")
	public static void method7344(@OriginalArg(1) Class29_Sub2_Sub1 arg0) {
		arg0.anInt8553 = 0;
		@Pc(18) Class108 local18;
		if (arg0.anInt8535 != -1) {
			local18 = Static31.aClass345_1.method7798(arg0.anInt8535);
			if (local18 == null || local18.anIntArray312 == null) {
				arg0.anInt8535 = -1;
				arg0.aBoolean597 = false;
			} else {
				label394: {
					arg0.anInt8532++;
					if (arg0.anInt8581 < local18.anIntArray312.length && arg0.anInt8532 > local18.anIntArray313[arg0.anInt8581]) {
						arg0.anInt8581++;
						arg0.anInt8532 = 1;
						arg0.anInt8515++;
						Static294.method4111(arg0.anInt8581, arg0.anInt9218, arg0 == Static426.aClass29_Sub2_Sub1_Sub2_2, arg0.anInt9222, local18, arg0.aByte103);
					}
					if (local18.anIntArray312.length <= arg0.anInt8581) {
						arg0.anInt8532 = 0;
						arg0.anInt8581 = 0;
						if (arg0.aBoolean597) {
							arg0.anInt8535 = arg0.method7009().method2397();
							if (arg0.anInt8535 == -1) {
								arg0.aBoolean597 = false;
								break label394;
							}
							local18 = Static31.aClass345_1.method7798(arg0.anInt8535);
						}
						Static294.method4111(arg0.anInt8581, arg0.anInt9218, arg0 == Static426.aClass29_Sub2_Sub1_Sub2_2, arg0.anInt9222, local18, arg0.aByte103);
					}
					arg0.anInt8515 = arg0.anInt8581 + 1;
					if (local18.anIntArray312.length <= arg0.anInt8515) {
						arg0.anInt8515 = 0;
					}
				}
			}
		}
		@Pc(179) int local179;
		@Pc(188) Class108 local188;
		@Pc(176) Class237 local176;
		if (arg0.anInt8525 != -1 && Static358.anInt6263 >= arg0.anInt8548) {
			local176 = Static448.aClass117_2.method2317(arg0.anInt8525);
			local179 = local176.anInt6458;
			if (local179 == -1) {
				arg0.anInt8525 = -1;
			} else {
				label396: {
					local188 = Static31.aClass345_1.method7798(local179);
					if (local176.aBoolean443) {
						if (local188.anInt2593 == 3) {
							if (arg0.anInt8583 > 0 && Static358.anInt6263 >= arg0.anInt8507 && Static358.anInt6263 > arg0.anInt8567) {
								arg0.anInt8525 = -1;
								break label396;
							}
						} else if (local188.anInt2593 == 1 && arg0.anInt8583 > 0 && Static358.anInt6263 >= arg0.anInt8507 && arg0.anInt8567 < Static358.anInt6263) {
							arg0.anInt8548 = Static358.anInt6263 + 1;
							break label396;
						}
					}
					if (local188 == null || local188.anIntArray312 == null) {
						arg0.anInt8525 = -1;
					} else {
						if (arg0.anInt8542 < 0) {
							arg0.anInt8542 = 0;
							Static294.method4111(0, arg0.anInt9218, Static426.aClass29_Sub2_Sub1_Sub2_2 == arg0, arg0.anInt9222, local188, arg0.aByte103);
						}
						arg0.anInt8561++;
						if (local188.anIntArray312.length > arg0.anInt8542 && arg0.anInt8561 > local188.anIntArray313[arg0.anInt8542]) {
							arg0.anInt8561 = 1;
							arg0.anInt8542++;
							Static294.method4111(arg0.anInt8542, arg0.anInt9218, arg0 == Static426.aClass29_Sub2_Sub1_Sub2_2, arg0.anInt9222, local188, arg0.aByte103);
						}
						if (local188.anIntArray312.length <= arg0.anInt8542) {
							if (local176.aBoolean443) {
								arg0.anInt8505++;
								arg0.anInt8542 -= local188.anInt2603;
								if (arg0.anInt8505 >= local188.anInt2599) {
									arg0.anInt8525 = -1;
								} else if (arg0.anInt8542 >= 0 && arg0.anInt8542 < local188.anIntArray312.length) {
									Static294.method4111(arg0.anInt8542, arg0.anInt9218, Static426.aClass29_Sub2_Sub1_Sub2_2 == arg0, arg0.anInt9222, local188, arg0.aByte103);
								} else {
									arg0.anInt8525 = -1;
								}
							} else {
								arg0.anInt8525 = -1;
							}
						}
						arg0.anInt8529 = arg0.anInt8542 + 1;
						if (local188.anIntArray312.length <= arg0.anInt8529) {
							if (local176.aBoolean443) {
								arg0.anInt8529 -= local188.anInt2603;
								if (arg0.anInt8505 + 1 >= local188.anInt2599) {
									arg0.anInt8529 = -1;
								} else if (arg0.anInt8529 < 0 || local188.anIntArray312.length <= arg0.anInt8529) {
									arg0.anInt8529 = -1;
								}
							} else {
								arg0.anInt8529 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8534 != -1 && arg0.anInt8543 <= Static358.anInt6263) {
			local176 = Static448.aClass117_2.method2317(arg0.anInt8534);
			local179 = local176.anInt6458;
			if (local179 == -1) {
				arg0.anInt8534 = -1;
			} else {
				label400: {
					local188 = Static31.aClass345_1.method7798(local179);
					if (local176.aBoolean443) {
						if (local188.anInt2593 == 3) {
							if (arg0.anInt8583 > 0 && Static358.anInt6263 >= arg0.anInt8507 && Static358.anInt6263 > arg0.anInt8567) {
								arg0.anInt8534 = -1;
								break label400;
							}
						} else if (local188.anInt2593 == 1 && arg0.anInt8583 > 0 && Static358.anInt6263 >= arg0.anInt8507 && arg0.anInt8567 < Static358.anInt6263) {
							arg0.anInt8543 = Static358.anInt6263 + 1;
							break label400;
						}
					}
					if (local188 == null || local188.anIntArray312 == null) {
						arg0.anInt8534 = -1;
					} else {
						if (arg0.anInt8555 < 0) {
							arg0.anInt8555 = 0;
							Static294.method4111(0, arg0.anInt9218, Static426.aClass29_Sub2_Sub1_Sub2_2 == arg0, arg0.anInt9222, local188, arg0.aByte103);
						}
						arg0.anInt8512++;
						if (arg0.anInt8555 < local188.anIntArray312.length && local188.anIntArray313[arg0.anInt8555] < arg0.anInt8512) {
							arg0.anInt8512 = 1;
							arg0.anInt8555++;
							Static294.method4111(arg0.anInt8555, arg0.anInt9218, arg0 == Static426.aClass29_Sub2_Sub1_Sub2_2, arg0.anInt9222, local188, arg0.aByte103);
						}
						if (local188.anIntArray312.length <= arg0.anInt8555) {
							if (local176.aBoolean443) {
								arg0.anInt8555 -= local188.anInt2603;
								arg0.anInt8566++;
								if (local188.anInt2599 <= arg0.anInt8566) {
									arg0.anInt8534 = -1;
								} else if (arg0.anInt8555 >= 0 && arg0.anInt8555 < local188.anIntArray312.length) {
									Static294.method4111(arg0.anInt8555, arg0.anInt9218, Static426.aClass29_Sub2_Sub1_Sub2_2 == arg0, arg0.anInt9222, local188, arg0.aByte103);
								} else {
									arg0.anInt8534 = -1;
								}
							} else {
								arg0.anInt8534 = -1;
							}
						}
						arg0.anInt8550 = arg0.anInt8555 + 1;
						if (arg0.anInt8550 >= local188.anIntArray312.length) {
							if (local176.aBoolean443) {
								arg0.anInt8550 -= local188.anInt2603;
								if (arg0.anInt8566 + 1 >= local188.anInt2599) {
									arg0.anInt8550 = -1;
								} else if (arg0.anInt8550 < 0 || arg0.anInt8550 >= local188.anIntArray312.length) {
									arg0.anInt8550 = -1;
								}
							} else {
								arg0.anInt8550 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8538 != -1 && arg0.anInt8563 <= 1) {
			local18 = Static31.aClass345_1.method7798(arg0.anInt8538);
			if (local18.anInt2593 == 3) {
				if (arg0.anInt8583 > 0 && Static358.anInt6263 >= arg0.anInt8507 && Static358.anInt6263 > arg0.anInt8567) {
					arg0.anInt8538 = -1;
				}
			} else if (local18.anInt2593 == 1 && arg0.anInt8583 > 0 && arg0.anInt8507 <= Static358.anInt6263 && Static358.anInt6263 > arg0.anInt8567) {
				arg0.anInt8563 = 2;
			}
		}
		if (arg0.anInt8538 != -1 && arg0.anInt8563 == 0) {
			local18 = Static31.aClass345_1.method7798(arg0.anInt8538);
			if (local18 == null || local18.anIntArray312 == null) {
				arg0.anInt8538 = -1;
			} else {
				arg0.anInt8577++;
				if (arg0.anInt8536 < local18.anIntArray312.length && local18.anIntArray313[arg0.anInt8536] < arg0.anInt8577) {
					arg0.anInt8577 = 1;
					arg0.anInt8536++;
					Static294.method4111(arg0.anInt8536, arg0.anInt9218, arg0 == Static426.aClass29_Sub2_Sub1_Sub2_2, arg0.anInt9222, local18, arg0.aByte103);
				}
				if (arg0.anInt8536 >= local18.anIntArray312.length) {
					arg0.anInt8536 -= local18.anInt2603;
					arg0.anInt8516++;
					if (arg0.anInt8516 >= local18.anInt2599) {
						arg0.anInt8538 = -1;
					} else if (arg0.anInt8536 >= 0 && local18.anIntArray312.length > arg0.anInt8536) {
						Static294.method4111(arg0.anInt8536, arg0.anInt9218, arg0 == Static426.aClass29_Sub2_Sub1_Sub2_2, arg0.anInt9222, local18, arg0.aByte103);
					} else {
						arg0.anInt8538 = -1;
					}
				}
				arg0.anInt8540 = arg0.anInt8536 + 1;
				if (arg0.anInt8540 >= local18.anIntArray312.length) {
					arg0.anInt8540 -= local18.anInt2603;
					if (local18.anInt2599 <= arg0.anInt8516 + 1) {
						arg0.anInt8540 = -1;
					} else if (arg0.anInt8540 < 0 || arg0.anInt8540 >= local18.anIntArray312.length) {
						arg0.anInt8540 = -1;
					}
				}
				arg0.anInt8553 = local18.anInt2598;
			}
		}
		if (arg0.anInt8563 > 0) {
			arg0.anInt8563--;
		}
		for (@Pc(1070) int local1070 = 0; local1070 < arg0.aClass325Array3.length; local1070++) {
			@Pc(1077) Class325 local1077 = arg0.aClass325Array3[local1070];
			if (local1077 != null) {
				if (local1077.anInt9009 > 0) {
					local1077.anInt9009--;
				} else {
					local188 = Static31.aClass345_1.method7798(local1077.anInt9008);
					if (local188 == null || local188.anIntArray312 == null) {
						arg0.aClass325Array3[local1070] = null;
					} else {
						local1077.anInt9002++;
						if (local1077.anInt9006 < local188.anIntArray312.length && local188.anIntArray313[local1077.anInt9006] < local1077.anInt9002) {
							local1077.anInt9002 = 1;
							local1077.anInt9006++;
							Static294.method4111(local1077.anInt9006, arg0.anInt9218, Static426.aClass29_Sub2_Sub1_Sub2_2 == arg0, arg0.anInt9222, local188, arg0.aByte103);
						}
						if (local1077.anInt9006 >= local188.anIntArray312.length) {
							local1077.anInt9006 -= local188.anInt2603;
							local1077.anInt9007++;
							if (local188.anInt2599 <= local1077.anInt9007) {
								arg0.aClass325Array3[local1070] = null;
							} else if (local1077.anInt9006 >= 0 && local1077.anInt9006 < local188.anIntArray312.length) {
								Static294.method4111(local1077.anInt9006, arg0.anInt9218, Static426.aClass29_Sub2_Sub1_Sub2_2 == arg0, arg0.anInt9222, local188, arg0.aByte103);
							} else {
								arg0.aClass325Array3[local1070] = null;
							}
						}
						local1077.anInt9005 = local1077.anInt9006 + 1;
						if (local188.anIntArray312.length <= local1077.anInt9005) {
							local1077.anInt9005 -= local188.anInt2603;
							if (local188.anInt2599 <= local1077.anInt9007 + 1) {
								local1077.anInt9005 = -1;
							} else if (local1077.anInt9005 < 0 || local188.anIntArray312.length <= local1077.anInt9005) {
								local1077.anInt9005 = -1;
							}
						}
					}
				}
			}
		}
	}
}

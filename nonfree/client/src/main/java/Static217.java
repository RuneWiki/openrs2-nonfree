import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!sp;B)V")
	public static void method4644(@OriginalArg(0) Class41_Sub2_Sub1_Sub4 arg0) {
		@Pc(12) Class185 local12;
		if (arg0.anInt9512 != -1) {
			local12 = Static545.aClass240_2.method5680(arg0.anInt9512);
			if (local12 == null || local12.anIntArray280 == null) {
				arg0.aBoolean739 = false;
				arg0.anInt9512 = -1;
			} else {
				label390: {
					arg0.anInt9462++;
					if (arg0.anInt9526 < local12.anIntArray280.length && local12.anIntArray282[arg0.anInt9526] < arg0.anInt9462) {
						arg0.anInt9462 = 1;
						arg0.anInt9527++;
						arg0.anInt9526++;
						Static462.method6421(arg0 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2, arg0.anInt9444, local12, arg0.aByte117, arg0.anInt9442, arg0.anInt9526);
					}
					if (local12.anIntArray280.length <= arg0.anInt9526) {
						arg0.anInt9526 = 0;
						arg0.anInt9462 = 0;
						if (arg0.aBoolean739) {
							arg0.anInt9512 = arg0.method7861().method7941();
							if (arg0.anInt9512 == -1) {
								arg0.aBoolean739 = false;
								break label390;
							}
							local12 = Static545.aClass240_2.method5680(arg0.anInt9512);
						}
						Static462.method6421(arg0 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2, arg0.anInt9444, local12, arg0.aByte117, arg0.anInt9442, arg0.anInt9526);
					}
					arg0.anInt9527 = arg0.anInt9526 + 1;
					if (arg0.anInt9527 >= local12.anIntArray280.length) {
						arg0.anInt9527 = 0;
					}
				}
			}
		}
		@Pc(184) int local184;
		@Pc(194) Class185 local194;
		@Pc(181) Class284 local181;
		if (arg0.anInt9528 != -1 && arg0.anInt9459 <= Static506.anInt8251) {
			local181 = Static368.aClass278_1.method6127(arg0.anInt9528);
			local184 = local181.anInt7490;
			if (local184 == -1) {
				arg0.anInt9528 = -1;
			} else {
				label392: {
					local194 = Static545.aClass240_2.method5680(local184);
					if (local181.aBoolean565) {
						if (local194.anInt4987 == 3) {
							if (arg0.anInt9534 > 0 && arg0.anInt9506 <= Static506.anInt8251 && arg0.anInt9529 < Static506.anInt8251) {
								arg0.anInt9528 = -1;
								break label392;
							}
						} else if (local194.anInt4987 == 1 && arg0.anInt9534 > 0 && arg0.anInt9506 <= Static506.anInt8251 && arg0.anInt9529 < Static506.anInt8251) {
							arg0.anInt9459 = Static506.anInt8251 + 1;
							break label392;
						}
					}
					if (local194 == null || local194.anIntArray280 == null) {
						arg0.anInt9528 = -1;
					} else {
						if (arg0.anInt9525 < 0) {
							arg0.anInt9525 = 0;
							Static462.method6421(arg0 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2, arg0.anInt9444, local194, arg0.aByte117, arg0.anInt9442, 0);
						}
						arg0.anInt9470++;
						if (arg0.anInt9525 < local194.anIntArray280.length && local194.anIntArray282[arg0.anInt9525] < arg0.anInt9470) {
							arg0.anInt9470 = 1;
							arg0.anInt9525++;
							Static462.method6421(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == arg0, arg0.anInt9444, local194, arg0.aByte117, arg0.anInt9442, arg0.anInt9525);
						}
						if (arg0.anInt9525 >= local194.anIntArray280.length) {
							if (local181.aBoolean565) {
								arg0.anInt9525 -= local194.anInt4971;
								arg0.anInt9476++;
								if (local194.anInt4979 <= arg0.anInt9476) {
									arg0.anInt9528 = -1;
								} else if (arg0.anInt9525 >= 0 && arg0.anInt9525 < local194.anIntArray280.length) {
									Static462.method6421(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == arg0, arg0.anInt9444, local194, arg0.aByte117, arg0.anInt9442, arg0.anInt9525);
								} else {
									arg0.anInt9528 = -1;
								}
							} else {
								arg0.anInt9528 = -1;
							}
						}
						arg0.anInt9498 = arg0.anInt9525 + 1;
						if (arg0.anInt9498 >= local194.anIntArray280.length) {
							if (local181.aBoolean565) {
								arg0.anInt9498 -= local194.anInt4971;
								if (local194.anInt4979 <= arg0.anInt9476 + 1) {
									arg0.anInt9498 = -1;
								} else if (arg0.anInt9498 < 0 || arg0.anInt9498 >= local194.anIntArray280.length) {
									arg0.anInt9498 = -1;
								}
							} else {
								arg0.anInt9498 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt9482 != -1 && Static506.anInt8251 >= arg0.anInt9468) {
			local181 = Static368.aClass278_1.method6127(arg0.anInt9482);
			local184 = local181.anInt7490;
			if (local184 == -1) {
				arg0.anInt9482 = -1;
			} else {
				label395: {
					local194 = Static545.aClass240_2.method5680(local184);
					if (local181.aBoolean565) {
						if (local194.anInt4987 == 3) {
							if (arg0.anInt9534 > 0 && arg0.anInt9506 <= Static506.anInt8251 && arg0.anInt9529 < Static506.anInt8251) {
								arg0.anInt9482 = -1;
								break label395;
							}
						} else if (local194.anInt4987 == 1 && arg0.anInt9534 > 0 && arg0.anInt9506 <= Static506.anInt8251 && Static506.anInt8251 > arg0.anInt9529) {
							arg0.anInt9468 = Static506.anInt8251 + 1;
							break label395;
						}
					}
					if (local194 == null || local194.anIntArray280 == null) {
						arg0.anInt9482 = -1;
					} else {
						if (arg0.anInt9455 < 0) {
							arg0.anInt9455 = 0;
							Static462.method6421(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == arg0, arg0.anInt9444, local194, arg0.aByte117, arg0.anInt9442, 0);
						}
						arg0.anInt9523++;
						if (local194.anIntArray280.length > arg0.anInt9455 && arg0.anInt9523 > local194.anIntArray282[arg0.anInt9455]) {
							arg0.anInt9455++;
							arg0.anInt9523 = 1;
							Static462.method6421(arg0 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2, arg0.anInt9444, local194, arg0.aByte117, arg0.anInt9442, arg0.anInt9455);
						}
						if (local194.anIntArray280.length <= arg0.anInt9455) {
							if (local181.aBoolean565) {
								arg0.anInt9455 -= local194.anInt4971;
								arg0.anInt9510++;
								if (arg0.anInt9510 >= local194.anInt4979) {
									arg0.anInt9482 = -1;
								} else if (arg0.anInt9455 >= 0 && arg0.anInt9455 < local194.anIntArray280.length) {
									Static462.method6421(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == arg0, arg0.anInt9444, local194, arg0.aByte117, arg0.anInt9442, arg0.anInt9455);
								} else {
									arg0.anInt9482 = -1;
								}
							} else {
								arg0.anInt9482 = -1;
							}
						}
						arg0.anInt9477 = arg0.anInt9455 + 1;
						if (local194.anIntArray280.length <= arg0.anInt9477) {
							if (local181.aBoolean565) {
								arg0.anInt9477 -= local194.anInt4971;
								if (arg0.anInt9510 + 1 >= local194.anInt4979) {
									arg0.anInt9477 = -1;
								} else if (arg0.anInt9477 < 0 || arg0.anInt9477 >= local194.anIntArray280.length) {
									arg0.anInt9477 = -1;
								}
							} else {
								arg0.anInt9477 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt9489 != -1 && arg0.anInt9509 <= 1) {
			local12 = Static545.aClass240_2.method5680(arg0.anInt9489);
			if (local12.anInt4987 == 3) {
				if (arg0.anInt9534 > 0 && arg0.anInt9506 <= Static506.anInt8251 && arg0.anInt9529 < Static506.anInt8251) {
					arg0.anInt9489 = -1;
					arg0.anIntArray627 = null;
				}
			} else if (local12.anInt4987 == 1 && arg0.anInt9534 > 0 && arg0.anInt9506 <= Static506.anInt8251 && arg0.anInt9529 < Static506.anInt8251) {
				arg0.anInt9509 = 2;
			}
		}
		if (arg0.anInt9489 != -1 && arg0.anInt9509 == 0) {
			local12 = Static545.aClass240_2.method5680(arg0.anInt9489);
			if (local12 == null || local12.anIntArray280 == null) {
				arg0.anInt9489 = -1;
				arg0.anIntArray627 = null;
			} else {
				arg0.anInt9478++;
				if (arg0.anInt9473 < local12.anIntArray280.length && arg0.anInt9478 > local12.anIntArray282[arg0.anInt9473]) {
					arg0.anInt9478 = 1;
					arg0.anInt9473++;
					Static462.method6421(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == arg0, arg0.anInt9444, local12, arg0.aByte117, arg0.anInt9442, arg0.anInt9473);
				}
				if (local12.anIntArray280.length <= arg0.anInt9473) {
					arg0.anInt9463++;
					arg0.anInt9473 -= local12.anInt4971;
					if (arg0.anInt9463 >= local12.anInt4979) {
						arg0.anIntArray627 = null;
						arg0.anInt9489 = -1;
					} else if (arg0.anInt9473 >= 0 && local12.anIntArray280.length > arg0.anInt9473) {
						Static462.method6421(arg0 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2, arg0.anInt9444, local12, arg0.aByte117, arg0.anInt9442, arg0.anInt9473);
					} else {
						arg0.anInt9489 = -1;
						arg0.anIntArray627 = null;
					}
				}
				arg0.anInt9460 = arg0.anInt9473 + 1;
				if (arg0.anInt9460 >= local12.anIntArray280.length) {
					arg0.anInt9460 -= local12.anInt4971;
					if (arg0.anInt9463 + 1 >= local12.anInt4979) {
						arg0.anInt9460 = -1;
					} else if (arg0.anInt9460 < 0 || local12.anIntArray280.length <= arg0.anInt9460) {
						arg0.anInt9460 = -1;
					}
				}
			}
		}
		if (arg0.anInt9509 > 0) {
			arg0.anInt9509--;
		}
		for (@Pc(1086) int local1086 = 0; local1086 < arg0.aClass152Array3.length; local1086++) {
			@Pc(1093) Class152 local1093 = arg0.aClass152Array3[local1086];
			if (local1093 != null) {
				if (local1093.anInt4140 > 0) {
					local1093.anInt4140--;
				} else {
					local194 = Static545.aClass240_2.method5680(local1093.anInt4139);
					if (local194 == null || local194.anIntArray280 == null) {
						arg0.aClass152Array3[local1086] = null;
					} else {
						local1093.anInt4136++;
						if (local194.anIntArray280.length > local1093.anInt4135 && local1093.anInt4136 > local194.anIntArray282[local1093.anInt4135]) {
							local1093.anInt4135++;
							local1093.anInt4136 = 1;
							Static462.method6421(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == arg0, arg0.anInt9444, local194, arg0.aByte117, arg0.anInt9442, local1093.anInt4135);
						}
						if (local194.anIntArray280.length <= local1093.anInt4135) {
							local1093.anInt4141++;
							local1093.anInt4135 -= local194.anInt4971;
							if (local1093.anInt4141 >= local194.anInt4979) {
								arg0.aClass152Array3[local1086] = null;
							} else if (local1093.anInt4135 >= 0 && local1093.anInt4135 < local194.anIntArray280.length) {
								Static462.method6421(arg0 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2, arg0.anInt9444, local194, arg0.aByte117, arg0.anInt9442, local1093.anInt4135);
							} else {
								arg0.aClass152Array3[local1086] = null;
							}
						}
						local1093.anInt4137 = local1093.anInt4135 + 1;
						if (local194.anIntArray280.length <= local1093.anInt4137) {
							local1093.anInt4137 -= local194.anInt4971;
							if (local1093.anInt4141 + 1 >= local194.anInt4979) {
								local1093.anInt4137 = -1;
							} else if (local1093.anInt4137 < 0 || local1093.anInt4137 >= local194.anIntArray280.length) {
								local1093.anInt4137 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIILclient!r;)V")
	public static void method4645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class45 arg2) {
		Static288.aClass45_9 = arg2;
		Static554.aClass344ArrayArray1 = new Class344[arg1][arg0];
		if (Static122.anIntArray123 != null) {
			Static565.aClass12_4 = Static470.method6496(Static122.anIntArray123[0], Static122.anIntArray123[2], Static122.anIntArray123[4], Static122.anIntArray123[1], Static122.anIntArray123[3], Static122.anIntArray123[5]);
		}
		Static429.aClass344_2 = new Class344();
		Static385.method5696();
	}
}

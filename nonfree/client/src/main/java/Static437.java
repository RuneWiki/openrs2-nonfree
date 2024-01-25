import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_18 = new Class244(14, 4);

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "I")
	public static int anInt7908 = 0;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(BLclient!ns;)V")
	public static void method6777(@OriginalArg(1) Class20_Sub2_Sub2_Sub1 arg0) {
		@Pc(12) Class21 local12;
		if (arg0.anInt5571 != -1) {
			local12 = Static294.aClass373_2.method8738(arg0.anInt5571);
			if (local12 == null || local12.anIntArray15 == null) {
				arg0.aBoolean375 = false;
				arg0.anInt5571 = -1;
			} else {
				label357: {
					arg0.anInt5499++;
					if (arg0.anInt5533 < local12.anIntArray15.length && local12.anIntArray17[arg0.anInt5533] < arg0.anInt5499) {
						arg0.anInt5532++;
						arg0.anInt5499 = 1;
						arg0.anInt5533++;
						if (!arg0.aBoolean377) {
							Static558.method8052(arg0.anInt5533, arg0, local12);
						}
					}
					if (local12.anIntArray15.length <= arg0.anInt5533) {
						arg0.anInt5499 = 0;
						arg0.anInt5533 = 0;
						if (arg0.aBoolean375) {
							arg0.anInt5571 = arg0.method4911().method5479();
							if (arg0.anInt5571 == -1) {
								arg0.aBoolean375 = false;
								break label357;
							}
							local12 = Static294.aClass373_2.method8738(arg0.anInt5571);
						}
						if (!arg0.aBoolean377) {
							Static558.method8052(arg0.anInt5533, arg0, local12);
						}
					}
					arg0.anInt5532 = arg0.anInt5533 + 1;
					if (local12.anIntArray15 == null) {
						arg0.anInt5571 = -1;
						arg0.aBoolean375 = false;
					} else if (local12.anIntArray15.length <= arg0.anInt5532) {
						arg0.anInt5532 = 0;
					}
				}
			}
		}
		@Pc(179) int local179;
		@Pc(192) Class21 local192;
		@Pc(176) Class93 local176;
		if (arg0.anInt5519 != -1 && Static113.anInt2243 >= arg0.anInt5555) {
			local176 = Static436.aClass292_2.method7401(arg0.anInt5519);
			local179 = local176.anInt2750;
			if (local179 == -1) {
				arg0.anInt5519 = -1;
			} else {
				label358: {
					local192 = Static294.aClass373_2.method8738(local179);
					if (local176.aBoolean189) {
						if (local192.anInt347 == 3) {
							if (arg0.anInt5576 > 0 && Static113.anInt2243 >= arg0.anInt5512 && arg0.anInt5553 < Static113.anInt2243) {
								arg0.anInt5519 = -1;
								break label358;
							}
						} else if (local192.anInt347 == 1 && arg0.anInt5576 > 0 && arg0.anInt5512 <= Static113.anInt2243 && arg0.anInt5553 < Static113.anInt2243) {
							arg0.anInt5555 = Static113.anInt2243 + 1;
							break label358;
						}
					}
					if (local192 == null || local192.anIntArray15 == null) {
						arg0.anInt5519 = -1;
					} else {
						if (arg0.lb < 0) {
							arg0.lb = 0;
							if (!arg0.aBoolean377) {
								Static558.method8052(0, arg0, local192);
							}
						}
						arg0.anInt5515++;
						if (local192.anIntArray15.length > arg0.lb && arg0.anInt5515 > local192.anIntArray17[arg0.lb]) {
							arg0.anInt5515 = 1;
							arg0.lb++;
							if (!arg0.aBoolean377) {
								Static558.method8052(arg0.lb, arg0, local192);
							}
						}
						if (arg0.lb >= local192.anIntArray15.length) {
							if (local176.aBoolean189) {
								arg0.lb -= local192.anInt346;
								arg0.anInt5560++;
								if (arg0.anInt5560 >= local192.anInt357) {
									arg0.anInt5519 = -1;
								} else if (arg0.lb < 0 || arg0.lb >= local192.anIntArray15.length) {
									arg0.anInt5519 = -1;
								} else if (!arg0.aBoolean377) {
									Static558.method8052(arg0.lb, arg0, local192);
								}
							} else {
								arg0.anInt5519 = -1;
							}
						}
						arg0.anInt5509 = arg0.lb + 1;
						if (arg0.anInt5509 >= local192.anIntArray15.length) {
							if (local176.aBoolean189) {
								arg0.anInt5509 -= local192.anInt346;
								if (arg0.anInt5560 + 1 >= local192.anInt357) {
									arg0.anInt5509 = -1;
								} else if (arg0.anInt5509 < 0 || local192.anIntArray15.length <= arg0.anInt5509) {
									arg0.anInt5509 = -1;
								}
							} else {
								arg0.anInt5509 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5558 != -1 && arg0.anInt5489 <= Static113.anInt2243) {
			local176 = Static436.aClass292_2.method7401(arg0.anInt5558);
			local179 = local176.anInt2750;
			if (local179 == -1) {
				arg0.anInt5558 = -1;
			} else {
				label361: {
					local192 = Static294.aClass373_2.method8738(local179);
					if (local176.aBoolean189) {
						if (local192.anInt347 == 3) {
							if (arg0.anInt5576 > 0 && Static113.anInt2243 >= arg0.anInt5512 && Static113.anInt2243 > arg0.anInt5553) {
								arg0.anInt5558 = -1;
								break label361;
							}
						} else if (local192.anInt347 == 1 && arg0.anInt5576 > 0 && Static113.anInt2243 >= arg0.anInt5512 && Static113.anInt2243 > arg0.anInt5553) {
							arg0.anInt5489 = Static113.anInt2243 + 1;
							break label361;
						}
					}
					if (local192 == null || local192.anIntArray15 == null) {
						arg0.anInt5558 = -1;
					} else {
						if (arg0.anInt5543 < 0) {
							arg0.anInt5543 = 0;
							if (!arg0.aBoolean377) {
								Static558.method8052(0, arg0, local192);
							}
						}
						arg0.anInt5494++;
						if (arg0.anInt5543 < local192.anIntArray15.length && local192.anIntArray17[arg0.anInt5543] < arg0.anInt5494) {
							arg0.anInt5494 = 1;
							arg0.anInt5543++;
							if (!arg0.aBoolean377) {
								Static558.method8052(arg0.anInt5543, arg0, local192);
							}
						}
						if (local192.anIntArray15.length <= arg0.anInt5543) {
							if (local176.aBoolean189) {
								arg0.anInt5543 -= local192.anInt346;
								arg0.anInt5537++;
								if (arg0.anInt5537 >= local192.anInt357) {
									arg0.anInt5558 = -1;
								} else if (arg0.anInt5543 < 0 || local192.anIntArray15.length <= arg0.anInt5543) {
									arg0.anInt5558 = -1;
								} else if (!arg0.aBoolean377) {
									Static558.method8052(arg0.anInt5543, arg0, local192);
								}
							} else {
								arg0.anInt5558 = -1;
							}
						}
						arg0.anInt5540 = arg0.anInt5543 + 1;
						if (arg0.anInt5540 >= local192.anIntArray15.length) {
							if (local176.aBoolean189) {
								arg0.anInt5540 -= local192.anInt346;
								if (local192.anInt357 <= arg0.anInt5537 + 1) {
									arg0.anInt5540 = -1;
								} else if (arg0.anInt5540 < 0 || arg0.anInt5540 >= local192.anIntArray15.length) {
									arg0.anInt5540 = -1;
								}
							} else {
								arg0.anInt5540 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5549 != -1 && arg0.anInt5516 <= 1) {
			local12 = Static294.aClass373_2.method8738(arg0.anInt5549);
			if (local12.anInt347 == 3) {
				if (arg0.anInt5576 > 0 && arg0.anInt5512 <= Static113.anInt2243 && Static113.anInt2243 > arg0.anInt5553) {
					arg0.anInt5549 = -1;
					arg0.anIntArray327 = null;
				}
			} else if (local12.anInt347 == 1 && arg0.anInt5576 > 0 && Static113.anInt2243 >= arg0.anInt5512 && arg0.anInt5553 < Static113.anInt2243) {
				arg0.anInt5516 = 2;
			}
		}
		if (arg0.anInt5549 != -1 && arg0.anInt5516 == 0) {
			local12 = Static294.aClass373_2.method8738(arg0.anInt5549);
			if (local12 == null || local12.anIntArray15 == null) {
				arg0.anInt5549 = -1;
				arg0.anIntArray327 = null;
			} else {
				arg0.anInt5502++;
				if (local12.anIntArray15.length > arg0.anInt5503 && local12.anIntArray17[arg0.anInt5503] < arg0.anInt5502) {
					arg0.anInt5502 = 1;
					arg0.anInt5503++;
					if (!arg0.aBoolean377) {
						Static558.method8052(arg0.anInt5503, arg0, local12);
					}
				}
				if (arg0.anInt5503 >= local12.anIntArray15.length) {
					arg0.anInt5503 -= local12.anInt346;
					arg0.anInt5566++;
					if (arg0.anInt5566 >= local12.anInt357) {
						arg0.anInt5549 = -1;
						arg0.anIntArray327 = null;
					} else if (arg0.anInt5503 < 0 || arg0.anInt5503 >= local12.anIntArray15.length) {
						arg0.anInt5549 = -1;
						arg0.anIntArray327 = null;
					} else if (!arg0.aBoolean377) {
						Static558.method8052(arg0.anInt5503, arg0, local12);
					}
				}
				arg0.anInt5546 = arg0.anInt5503 + 1;
				if (arg0.anInt5546 >= local12.anIntArray15.length) {
					arg0.anInt5546 -= local12.anInt346;
					if (local12.anInt357 <= arg0.anInt5566 + 1) {
						arg0.anInt5546 = -1;
					} else if (arg0.anInt5546 < 0 || local12.anIntArray15.length <= arg0.anInt5546) {
						arg0.anInt5546 = -1;
					}
				}
			}
		}
		if (arg0.anInt5516 > 0) {
			arg0.anInt5516--;
		}
		for (@Pc(985) int local985 = 0; local985 < arg0.aClass113Array3.length; local985++) {
			@Pc(992) Class113 local992 = arg0.aClass113Array3[local985];
			if (local992 != null) {
				if (local992.anInt3646 > 0) {
					local992.anInt3646--;
				} else {
					local192 = Static294.aClass373_2.method8738(local992.anInt3650);
					if (local192 == null || local192.anIntArray15 == null) {
						arg0.aClass113Array3[local985] = null;
					} else {
						local992.anInt3649++;
						if (local192.anIntArray15.length > local992.anInt3647 && local992.anInt3649 > local192.anIntArray17[local992.anInt3647]) {
							local992.anInt3647++;
							local992.anInt3649 = 1;
							if (!arg0.aBoolean377) {
								Static558.method8052(local992.anInt3647, arg0, local192);
							}
						}
						if (local992.anInt3647 >= local192.anIntArray15.length) {
							local992.anInt3652++;
							local992.anInt3647 -= local192.anInt346;
							if (local192.anInt357 <= local992.anInt3652) {
								arg0.aClass113Array3[local985] = null;
							} else if (local992.anInt3647 < 0 || local192.anIntArray15.length <= local992.anInt3647) {
								arg0.aClass113Array3[local985] = null;
							} else if (!arg0.aBoolean377) {
								Static558.method8052(local992.anInt3647, arg0, local192);
							}
						}
						local992.anInt3651 = local992.anInt3647 + 1;
						if (local192.anIntArray15.length <= local992.anInt3651) {
							local992.anInt3651 -= local192.anInt346;
							if (local192.anInt357 <= local992.anInt3652 + 1) {
								local992.anInt3651 = -1;
							} else if (local992.anInt3651 < 0 || local192.anIntArray15.length <= local992.anInt3651) {
								local992.anInt3651 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZII)Z")
	public static boolean method6779(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static516.method7740(arg1, arg0) & Static582.method8191(arg1, arg0);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIILclient!gi;IIIIILclient!og;)V")
	public static void method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class131 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class266 arg10) {
		Static185.anInt3405 = arg8;
		Static660.aClass266_13 = arg10;
		Static389.anInt6495 = arg9;
		Static34.aClass370_1 = null;
		Static169.anInt3098 = arg4;
		Static247.anInt4363 = arg3;
		Static135.aClass370_2 = null;
		Static148.anInt2728 = arg1;
		Static181.aClass370_3 = null;
		Static515.anInt8111 = arg7;
		Static398.anInt6569 = arg2;
		Static571.aClass131_22 = arg5;
		Static280.anInt4770 = arg0;
		Static410.anInt6694 = arg6;
		Static7.method109();
		Static386.aBoolean450 = true;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!qba;I)V")
	public static void method3579(@OriginalArg(0) Class34_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anInt9647 != -1) {
			@Pc(16) Class239 local16 = Static13.aClass213_1.method5008(arg0.anInt9647);
			if (local16 == null || local16.anIntArray339 == null) {
				arg0.anInt9647 = -1;
				arg0.aBoolean673 = false;
			} else {
				label277: {
					arg0.anInt9678++;
					if (arg0.anInt9648 < local16.anIntArray339.length && local16.anIntArray337[arg0.anInt9648] < arg0.anInt9678) {
						arg0.anInt9678 = 1;
						arg0.anInt9648++;
						arg0.anInt9653++;
						if (!arg0.aBoolean674) {
							Static305.method4420(arg0, local16, arg0.anInt9648);
						}
					}
					if (arg0.anInt9648 >= local16.anIntArray339.length) {
						arg0.anInt9648 = 0;
						arg0.anInt9678 = 0;
						if (arg0.aBoolean673) {
							arg0.anInt9647 = arg0.method7878().method6294();
							if (arg0.anInt9647 == -1) {
								arg0.aBoolean673 = false;
								break label277;
							}
							local16 = Static13.aClass213_1.method5008(arg0.anInt9647);
						}
						if (!arg0.aBoolean674) {
							Static305.method4420(arg0, local16, arg0.anInt9648);
						}
					}
					arg0.anInt9653 = arg0.anInt9648 + 1;
					if (local16.anIntArray339 == null) {
						arg0.anInt9647 = -1;
						arg0.aBoolean673 = false;
					} else if (arg0.anInt9653 >= local16.anIntArray339.length) {
						arg0.anInt9653 = 0;
					}
				}
			}
		}
		@Pc(211) Class239 local211;
		for (@Pc(170) int local170 = 0; local170 < arg0.aClass190Array3.length; local170++) {
			if (arg0.aClass190Array3[local170].anInt5051 != -1 && arg0.aClass190Array3[local170].anInt5054 <= Static122.anInt2190) {
				@Pc(199) Class106 local199 = Static366.aClass182_2.method4107(arg0.aClass190Array3[local170].anInt5051);
				@Pc(202) int local202 = local199.anInt2680;
				if (local202 == -1) {
					arg0.aClass190Array3[local170].anInt5051 = -1;
				} else {
					local211 = Static13.aClass213_1.method5008(local202);
					if (local199.aBoolean203) {
						if (local211.anInt6412 == 3) {
							if (arg0.anInt9705 > 0 && Static122.anInt2190 >= arg0.anInt9685 && arg0.anInt9642 < Static122.anInt2190) {
								arg0.aClass190Array3[local170].anInt5051 = -1;
								continue;
							}
						} else if (local211.anInt6412 == 1 && arg0.anInt9705 > 0 && arg0.anInt9685 <= Static122.anInt2190 && Static122.anInt2190 > arg0.anInt9642) {
							arg0.aClass190Array3[local170].anInt5054 = Static122.anInt2190 + 1;
							continue;
						}
					}
					if (local211 == null || local211.anIntArray339 == null) {
						arg0.aClass190Array3[local170].anInt5051 = -1;
					} else {
						if (arg0.aClass190Array3[local170].anInt5047 < 0) {
							arg0.aClass190Array3[local170].anInt5047 = 0;
							if (!arg0.aBoolean674) {
								Static305.method4420(arg0, local211, 0);
							}
						}
						arg0.aClass190Array3[local170].anInt5053++;
						if (arg0.aClass190Array3[local170].anInt5047 < local211.anIntArray339.length && local211.anIntArray337[arg0.aClass190Array3[local170].anInt5047] < arg0.aClass190Array3[local170].anInt5053) {
							arg0.aClass190Array3[local170].anInt5053 = 1;
							arg0.aClass190Array3[local170].anInt5047++;
							if (!arg0.aBoolean674) {
								Static305.method4420(arg0, local211, arg0.aClass190Array3[local170].anInt5047);
							}
						}
						if (local211.anIntArray339.length <= arg0.aClass190Array3[local170].anInt5047) {
							if (local199.aBoolean203) {
								arg0.aClass190Array3[local170].anInt5047 -= local211.anInt6414;
								arg0.aClass190Array3[local170].anInt5055++;
								if (local211.anInt6408 <= arg0.aClass190Array3[local170].anInt5055) {
									arg0.aClass190Array3[local170].anInt5051 = -1;
								} else if (arg0.aClass190Array3[local170].anInt5047 < 0 || arg0.aClass190Array3[local170].anInt5047 >= local211.anIntArray339.length) {
									arg0.aClass190Array3[local170].anInt5051 = -1;
								} else if (!arg0.aBoolean674) {
									Static305.method4420(arg0, local211, arg0.aClass190Array3[local170].anInt5047);
								}
							} else {
								arg0.aClass190Array3[local170].anInt5051 = -1;
							}
						}
						arg0.aClass190Array3[local170].anInt5057 = arg0.aClass190Array3[local170].anInt5047 + 1;
						if (local211.anIntArray339.length <= arg0.aClass190Array3[local170].anInt5057) {
							if (local199.aBoolean203) {
								arg0.aClass190Array3[local170].anInt5057 -= local211.anInt6414;
								if (local211.anInt6408 <= arg0.aClass190Array3[local170].anInt5055 + 1) {
									arg0.aClass190Array3[local170].anInt5057 = -1;
								} else if (arg0.aClass190Array3[local170].anInt5057 < 0 || local211.anIntArray339.length <= arg0.aClass190Array3[local170].anInt5057) {
									arg0.aClass190Array3[local170].anInt5057 = -1;
								}
							} else {
								arg0.aClass190Array3[local170].anInt5057 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(588) Class239 local588;
		if (arg0.anInt9664 != -1 && arg0.anInt9698 <= 1) {
			local588 = Static13.aClass213_1.method5008(arg0.anInt9664);
			if (local588.anInt6412 == 3) {
				if (arg0.anInt9705 > 0 && arg0.anInt9685 <= Static122.anInt2190 && arg0.anInt9642 < Static122.anInt2190) {
					arg0.anInt9664 = -1;
					arg0.anIntArray527 = null;
				}
			} else if (local588.anInt6412 == 1 && arg0.anInt9705 > 0 && arg0.anInt9685 <= Static122.anInt2190 && arg0.anInt9642 < Static122.anInt2190) {
				arg0.anInt9698 = 2;
			}
		}
		if (arg0.anInt9664 != -1 && arg0.anInt9698 == 0) {
			local588 = Static13.aClass213_1.method5008(arg0.anInt9664);
			if (local588 == null || local588.anIntArray339 == null) {
				arg0.anInt9664 = -1;
				arg0.anIntArray527 = null;
			} else {
				arg0.anInt9680++;
				if (local588.anIntArray339.length > arg0.anInt9674 && local588.anIntArray337[arg0.anInt9674] < arg0.anInt9680) {
					arg0.anInt9680 = 1;
					arg0.anInt9674++;
					if (!arg0.aBoolean674) {
						Static305.method4420(arg0, local588, arg0.anInt9674);
					}
				}
				if (local588.anIntArray339.length <= arg0.anInt9674) {
					arg0.anInt9641++;
					arg0.anInt9674 -= local588.anInt6414;
					if (local588.anInt6408 <= arg0.anInt9641) {
						arg0.anInt9664 = -1;
						arg0.anIntArray527 = null;
					} else if (arg0.anInt9674 < 0 || arg0.anInt9674 >= local588.anIntArray339.length) {
						arg0.anIntArray527 = null;
						arg0.anInt9664 = -1;
					} else if (!arg0.aBoolean674) {
						Static305.method4420(arg0, local588, arg0.anInt9674);
					}
				}
				arg0.anInt9697 = arg0.anInt9674 + 1;
				if (arg0.anInt9697 >= local588.anIntArray339.length) {
					arg0.anInt9697 -= local588.anInt6414;
					if (local588.anInt6408 <= arg0.anInt9641 + 1) {
						arg0.anInt9697 = -1;
					} else if (arg0.anInt9697 < 0 || arg0.anInt9697 >= local588.anIntArray339.length) {
						arg0.anInt9697 = -1;
					}
				}
			}
		}
		if (arg0.anInt9698 > 0) {
			arg0.anInt9698--;
		}
		for (@Pc(829) int local829 = 0; local829 < arg0.aClass158Array3.length; local829++) {
			@Pc(836) Class158 local836 = arg0.aClass158Array3[local829];
			if (local836 != null) {
				if (local836.anInt4336 > 0) {
					local836.anInt4336--;
				} else {
					local211 = Static13.aClass213_1.method5008(local836.anInt4334);
					if (local211 == null || local211.anIntArray339 == null) {
						arg0.aClass158Array3[local829] = null;
					} else {
						local836.anInt4335++;
						if (local836.anInt4332 < local211.anIntArray339.length && local211.anIntArray337[local836.anInt4332] < local836.anInt4335) {
							local836.anInt4332++;
							local836.anInt4335 = 1;
							if (!arg0.aBoolean674) {
								Static305.method4420(arg0, local211, local836.anInt4332);
							}
						}
						if (local836.anInt4332 >= local211.anIntArray339.length) {
							local836.anInt4332 -= local211.anInt6414;
							local836.anInt4333++;
							if (local836.anInt4333 >= local211.anInt6408) {
								arg0.aClass158Array3[local829] = null;
							} else if (local836.anInt4332 < 0 || local211.anIntArray339.length <= local836.anInt4332) {
								arg0.aClass158Array3[local829] = null;
							} else if (!arg0.aBoolean674) {
								Static305.method4420(arg0, local211, local836.anInt4332);
							}
						}
						local836.anInt4331 = local836.anInt4332 + 1;
						if (local836.anInt4331 >= local211.anIntArray339.length) {
							local836.anInt4331 -= local211.anInt6414;
							if (local836.anInt4333 + 1 >= local211.anInt6408) {
								local836.anInt4331 = -1;
							} else if (local836.anInt4331 < 0 || local211.anIntArray339.length <= local836.anInt4331) {
								local836.anInt4331 = -1;
							}
						}
					}
				}
			}
		}
	}
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "I")
	public static int anInt9131;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_88 = new Class305(30, 3);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fda;I)V")
	public static void method7744(@OriginalArg(0) Class28_Sub1_Sub4_Sub2 arg0) {
		if (arg0.anInt5479 != -1) {
			@Pc(19) Class175 local19 = Static591.aClass66_2.method1768(arg0.anInt5479);
			if (local19 == null || local19.anIntArray288 == null) {
				arg0.anInt5479 = -1;
				arg0.aBoolean470 = false;
			} else {
				label277: {
					arg0.anInt5493++;
					if (arg0.anInt5499 < local19.anIntArray288.length && arg0.anInt5493 > local19.anIntArray291[arg0.anInt5499]) {
						arg0.anInt5493 = 1;
						arg0.anInt5477++;
						arg0.anInt5499++;
						if (!arg0.aBoolean468) {
							Static146.method2653(arg0.anInt5499, local19, arg0);
						}
					}
					if (arg0.anInt5499 >= local19.anIntArray288.length) {
						arg0.anInt5493 = 0;
						arg0.anInt5499 = 0;
						if (arg0.aBoolean470) {
							arg0.anInt5479 = arg0.method4580().method4117();
							if (arg0.anInt5479 == -1) {
								arg0.aBoolean470 = false;
								break label277;
							}
							local19 = Static591.aClass66_2.method1768(arg0.anInt5479);
						}
						if (!arg0.aBoolean468) {
							Static146.method2653(arg0.anInt5499, local19, arg0);
						}
					}
					arg0.anInt5477 = arg0.anInt5499 + 1;
					if (local19.anIntArray288 == null) {
						arg0.anInt5479 = -1;
						arg0.aBoolean470 = false;
					} else if (local19.anIntArray288.length <= arg0.anInt5477) {
						arg0.anInt5477 = 0;
					}
				}
			}
		}
		@Pc(196) Class175 local196;
		for (@Pc(160) int local160 = 0; local160 < arg0.aClass227Array3.length; local160++) {
			if (arg0.aClass227Array3[local160].anInt6677 != -1 && Static26.anInt350 >= arg0.aClass227Array3[local160].anInt6673) {
				@Pc(184) Class338 local184 = Static239.aClass91_1.method2243(arg0.aClass227Array3[local160].anInt6677);
				@Pc(187) int local187 = local184.anInt9376;
				if (local187 == -1) {
					arg0.aClass227Array3[local160].anInt6677 = -1;
				} else {
					local196 = Static591.aClass66_2.method1768(local187);
					if (local184.aBoolean794) {
						if (local196.anInt5026 == 3) {
							if (arg0.anInt5525 > 0 && arg0.anInt5463 <= Static26.anInt350 && Static26.anInt350 > arg0.anInt5473) {
								arg0.aClass227Array3[local160].anInt6677 = -1;
								continue;
							}
						} else if (local196.anInt5026 == 1 && arg0.anInt5525 > 0 && Static26.anInt350 >= arg0.anInt5463 && arg0.anInt5473 < Static26.anInt350) {
							arg0.aClass227Array3[local160].anInt6673 = Static26.anInt350 + 1;
							continue;
						}
					}
					if (local196 == null || local196.anIntArray288 == null) {
						arg0.aClass227Array3[local160].anInt6677 = -1;
					} else {
						if (arg0.aClass227Array3[local160].anInt6678 < 0) {
							arg0.aClass227Array3[local160].anInt6678 = 0;
							if (!arg0.aBoolean468) {
								Static146.method2653(0, local196, arg0);
							}
						}
						arg0.aClass227Array3[local160].anInt6680++;
						if (local196.anIntArray288.length > arg0.aClass227Array3[local160].anInt6678 && local196.anIntArray291[arg0.aClass227Array3[local160].anInt6678] < arg0.aClass227Array3[local160].anInt6680) {
							arg0.aClass227Array3[local160].anInt6680 = 1;
							arg0.aClass227Array3[local160].anInt6678++;
							if (!arg0.aBoolean468) {
								Static146.method2653(arg0.aClass227Array3[local160].anInt6678, local196, arg0);
							}
						}
						if (local196.anIntArray288.length <= arg0.aClass227Array3[local160].anInt6678) {
							if (local184.aBoolean794) {
								arg0.aClass227Array3[local160].anInt6678 -= local196.anInt5029;
								arg0.aClass227Array3[local160].anInt6675++;
								if (local196.anInt5024 <= arg0.aClass227Array3[local160].anInt6675) {
									arg0.aClass227Array3[local160].anInt6677 = -1;
								} else if (arg0.aClass227Array3[local160].anInt6678 < 0 || arg0.aClass227Array3[local160].anInt6678 >= local196.anIntArray288.length) {
									arg0.aClass227Array3[local160].anInt6677 = -1;
								} else if (!arg0.aBoolean468) {
									Static146.method2653(arg0.aClass227Array3[local160].anInt6678, local196, arg0);
								}
							} else {
								arg0.aClass227Array3[local160].anInt6677 = -1;
							}
						}
						arg0.aClass227Array3[local160].anInt6674 = arg0.aClass227Array3[local160].anInt6678 + 1;
						if (arg0.aClass227Array3[local160].anInt6674 >= local196.anIntArray288.length) {
							if (local184.aBoolean794) {
								arg0.aClass227Array3[local160].anInt6674 -= local196.anInt5029;
								if (arg0.aClass227Array3[local160].anInt6675 + 1 >= local196.anInt5024) {
									arg0.aClass227Array3[local160].anInt6674 = -1;
								} else if (arg0.aClass227Array3[local160].anInt6674 < 0 || local196.anIntArray288.length <= arg0.aClass227Array3[local160].anInt6674) {
									arg0.aClass227Array3[local160].anInt6674 = -1;
								}
							} else {
								arg0.aClass227Array3[local160].anInt6674 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(571) Class175 local571;
		if (arg0.anInt5482 != -1 && arg0.anInt5475 <= 1) {
			local571 = Static591.aClass66_2.method1768(arg0.anInt5482);
			if (local571.anInt5026 == 3) {
				if (arg0.anInt5525 > 0 && arg0.anInt5463 <= Static26.anInt350 && arg0.anInt5473 < Static26.anInt350) {
					arg0.anIntArray305 = null;
					arg0.anInt5482 = -1;
				}
			} else if (local571.anInt5026 == 1 && arg0.anInt5525 > 0 && arg0.anInt5463 <= Static26.anInt350 && arg0.anInt5473 < Static26.anInt350) {
				arg0.anInt5475 = 2;
			}
		}
		if (arg0.anInt5482 != -1 && arg0.anInt5475 == 0) {
			local571 = Static591.aClass66_2.method1768(arg0.anInt5482);
			if (local571 == null || local571.anIntArray288 == null) {
				arg0.anInt5482 = -1;
				arg0.anIntArray305 = null;
			} else {
				arg0.anInt5504++;
				if (local571.anIntArray288.length > arg0.anInt5498 && local571.anIntArray291[arg0.anInt5498] < arg0.anInt5504) {
					arg0.anInt5504 = 1;
					arg0.anInt5498++;
					if (!arg0.aBoolean468) {
						Static146.method2653(arg0.anInt5498, local571, arg0);
					}
				}
				if (arg0.anInt5498 >= local571.anIntArray288.length) {
					arg0.anInt5453++;
					arg0.anInt5498 -= local571.anInt5029;
					if (local571.anInt5024 <= arg0.anInt5453) {
						arg0.anIntArray305 = null;
						arg0.anInt5482 = -1;
					} else if (arg0.anInt5498 < 0 || local571.anIntArray288.length <= arg0.anInt5498) {
						arg0.anIntArray305 = null;
						arg0.anInt5482 = -1;
					} else if (!arg0.aBoolean468) {
						Static146.method2653(arg0.anInt5498, local571, arg0);
					}
				}
				arg0.anInt5456 = arg0.anInt5498 + 1;
				if (arg0.anInt5456 >= local571.anIntArray288.length) {
					arg0.anInt5456 -= local571.anInt5029;
					if (arg0.anInt5453 + 1 >= local571.anInt5024) {
						arg0.anInt5456 = -1;
					} else if (arg0.anInt5456 < 0 || local571.anIntArray288.length <= arg0.anInt5456) {
						arg0.anInt5456 = -1;
					}
				}
			}
		}
		if (arg0.anInt5475 > 0) {
			arg0.anInt5475--;
		}
		for (@Pc(812) int local812 = 0; local812 < arg0.aClass321Array3.length; local812++) {
			@Pc(818) Class321 local818 = arg0.aClass321Array3[local812];
			if (local818 != null) {
				if (local818.anInt8970 > 0) {
					local818.anInt8970--;
				} else {
					local196 = Static591.aClass66_2.method1768(local818.anInt8974);
					if (local196 == null || local196.anIntArray288 == null) {
						arg0.aClass321Array3[local812] = null;
					} else {
						local818.anInt8976++;
						if (local818.anInt8975 < local196.anIntArray288.length && local818.anInt8976 > local196.anIntArray291[local818.anInt8975]) {
							local818.anInt8976 = 1;
							local818.anInt8975++;
							if (!arg0.aBoolean468) {
								Static146.method2653(local818.anInt8975, local196, arg0);
							}
						}
						if (local818.anInt8975 >= local196.anIntArray288.length) {
							local818.anInt8972++;
							local818.anInt8975 -= local196.anInt5029;
							if (local196.anInt5024 <= local818.anInt8972) {
								arg0.aClass321Array3[local812] = null;
							} else if (local818.anInt8975 < 0 || local818.anInt8975 >= local196.anIntArray288.length) {
								arg0.aClass321Array3[local812] = null;
							} else if (!arg0.aBoolean468) {
								Static146.method2653(local818.anInt8975, local196, arg0);
							}
						}
						local818.anInt8971 = local818.anInt8975 + 1;
						if (local196.anIntArray288.length <= local818.anInt8971) {
							local818.anInt8971 -= local196.anInt5029;
							if (local196.anInt5024 <= local818.anInt8972 + 1) {
								local818.anInt8971 = -1;
							} else if (local818.anInt8971 < 0 || local196.anIntArray288.length <= local818.anInt8971) {
								local818.anInt8971 = -1;
							}
						}
					}
				}
			}
		}
	}
}

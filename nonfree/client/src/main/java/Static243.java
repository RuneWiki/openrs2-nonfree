import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!jea", name = "K", descriptor = "I")
	public static int anInt4471;

	@OriginalMember(owner = "client!jea", name = "F", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_61 = new Class98(34, -1);

	@OriginalMember(owner = "client!jea", name = "I", descriptor = "Z")
	public static boolean aBoolean327 = true;

	@OriginalMember(owner = "client!jea", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!va;)V")
	public static void method3795(@OriginalArg(1) Class15_Sub2_Sub4 arg0) {
		arg0.anInt8971 = 0;
		@Pc(19) Class63 local19;
		if (arg0.anInt8985 != -1) {
			local19 = Static388.aClass324_2.method7265(arg0.anInt8985);
			if (local19 == null || local19.anIntArray127 == null) {
				arg0.anInt8985 = -1;
				arg0.aBoolean579 = false;
			} else {
				label394: {
					arg0.anInt8993++;
					if (arg0.anInt8954 < local19.anIntArray127.length && arg0.anInt8993 > local19.anIntArray128[arg0.anInt8954]) {
						arg0.anInt8934++;
						arg0.anInt8954++;
						arg0.anInt8993 = 1;
						Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt8911, arg0.aByte98, local19, arg0.anInt8913, arg0.anInt8954);
					}
					if (local19.anIntArray127.length <= arg0.anInt8954) {
						arg0.anInt8954 = 0;
						arg0.anInt8993 = 0;
						if (arg0.aBoolean579) {
							arg0.anInt8985 = arg0.method7131().method3825();
							if (arg0.anInt8985 == -1) {
								arg0.aBoolean579 = false;
								break label394;
							}
							local19 = Static388.aClass324_2.method7265(arg0.anInt8985);
						}
						Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt8911, arg0.aByte98, local19, arg0.anInt8913, arg0.anInt8954);
					}
					arg0.anInt8934 = arg0.anInt8954 + 1;
					if (arg0.anInt8934 >= local19.anIntArray127.length) {
						arg0.anInt8934 = 0;
					}
				}
			}
		}
		@Pc(187) int local187;
		@Pc(201) Class63 local201;
		@Pc(184) Class239 local184;
		if (arg0.anInt8947 != -1 && arg0.anInt8952 <= Static363.anInt6671) {
			local184 = Static475.aClass291_2.method6548(arg0.anInt8947);
			local187 = local184.anInt6960;
			if (local187 == -1) {
				arg0.anInt8947 = -1;
			} else {
				label396: {
					local201 = Static388.aClass324_2.method7265(local187);
					if (local184.aBoolean477) {
						if (local201.anInt1381 == 3) {
							if (arg0.anInt8997 > 0 && arg0.anInt8991 <= Static363.anInt6671 && arg0.anInt8961 < Static363.anInt6671) {
								arg0.anInt8947 = -1;
								break label396;
							}
						} else if (local201.anInt1381 == 1 && arg0.anInt8997 > 0 && arg0.anInt8991 <= Static363.anInt6671 && arg0.anInt8961 < Static363.anInt6671) {
							arg0.anInt8952 = Static363.anInt6671 + 1;
							break label396;
						}
					}
					if (local201 == null || local201.anIntArray127 == null) {
						arg0.anInt8947 = -1;
					} else {
						if (arg0.anInt8951 < 0) {
							arg0.anInt8951 = 0;
							Static32.method514(arg0 == Static461.aClass15_Sub2_Sub4_Sub2_2, arg0.anInt8911, arg0.aByte98, local201, arg0.anInt8913, 0);
						}
						arg0.anInt8972++;
						if (local201.anIntArray127.length > arg0.anInt8951 && local201.anIntArray128[arg0.anInt8951] < arg0.anInt8972) {
							arg0.anInt8972 = 1;
							arg0.anInt8951++;
							Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt8911, arg0.aByte98, local201, arg0.anInt8913, arg0.anInt8951);
						}
						if (arg0.anInt8951 >= local201.anIntArray127.length) {
							if (local184.aBoolean477) {
								arg0.anInt8926++;
								arg0.anInt8951 -= local201.anInt1378;
								if (arg0.anInt8926 >= local201.anInt1382) {
									arg0.anInt8947 = -1;
								} else if (arg0.anInt8951 >= 0 && arg0.anInt8951 < local201.anIntArray127.length) {
									Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt8911, arg0.aByte98, local201, arg0.anInt8913, arg0.anInt8951);
								} else {
									arg0.anInt8947 = -1;
								}
							} else {
								arg0.anInt8947 = -1;
							}
						}
						arg0.anInt8928 = arg0.anInt8951 + 1;
						if (local201.anIntArray127.length <= arg0.anInt8928) {
							if (local184.aBoolean477) {
								arg0.anInt8928 -= local201.anInt1378;
								if (arg0.anInt8926 + 1 >= local201.anInt1382) {
									arg0.anInt8928 = -1;
								} else if (arg0.anInt8928 < 0 || local201.anIntArray127.length <= arg0.anInt8928) {
									arg0.anInt8928 = -1;
								}
							} else {
								arg0.anInt8928 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8968 != -1 && Static363.anInt6671 >= arg0.anInt8982) {
			local184 = Static475.aClass291_2.method6548(arg0.anInt8968);
			local187 = local184.anInt6960;
			if (local187 == -1) {
				arg0.anInt8968 = -1;
			} else {
				label399: {
					local201 = Static388.aClass324_2.method7265(local187);
					if (local184.aBoolean477) {
						if (local201.anInt1381 == 3) {
							if (arg0.anInt8997 > 0 && Static363.anInt6671 >= arg0.anInt8991 && Static363.anInt6671 > arg0.anInt8961) {
								arg0.anInt8968 = -1;
								break label399;
							}
						} else if (local201.anInt1381 == 1 && arg0.anInt8997 > 0 && arg0.anInt8991 <= Static363.anInt6671 && arg0.anInt8961 < Static363.anInt6671) {
							arg0.anInt8982 = Static363.anInt6671 + 1;
							break label399;
						}
					}
					if (local201 == null || local201.anIntArray127 == null) {
						arg0.anInt8968 = -1;
					} else {
						if (arg0.anInt8970 < 0) {
							arg0.anInt8970 = 0;
							Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt8911, arg0.aByte98, local201, arg0.anInt8913, 0);
						}
						arg0.anInt8973++;
						if (arg0.anInt8970 < local201.anIntArray127.length && arg0.anInt8973 > local201.anIntArray128[arg0.anInt8970]) {
							arg0.anInt8970++;
							arg0.anInt8973 = 1;
							Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt8911, arg0.aByte98, local201, arg0.anInt8913, arg0.anInt8970);
						}
						if (arg0.anInt8970 >= local201.anIntArray127.length) {
							if (local184.aBoolean477) {
								arg0.anInt8970 -= local201.anInt1378;
								arg0.anInt8917++;
								if (local201.anInt1382 <= arg0.anInt8917) {
									arg0.anInt8968 = -1;
								} else if (arg0.anInt8970 >= 0 && local201.anIntArray127.length > arg0.anInt8970) {
									Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt8911, arg0.aByte98, local201, arg0.anInt8913, arg0.anInt8970);
								} else {
									arg0.anInt8968 = -1;
								}
							} else {
								arg0.anInt8968 = -1;
							}
						}
						arg0.anInt8959 = arg0.anInt8970 + 1;
						if (local201.anIntArray127.length <= arg0.anInt8959) {
							if (local184.aBoolean477) {
								arg0.anInt8959 -= local201.anInt1378;
								if (local201.anInt1382 <= arg0.anInt8917 + 1) {
									arg0.anInt8959 = -1;
								} else if (arg0.anInt8959 < 0 || arg0.anInt8959 >= local201.anIntArray127.length) {
									arg0.anInt8959 = -1;
								}
							} else {
								arg0.anInt8959 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8932 != -1 && arg0.anInt8955 <= 1) {
			local19 = Static388.aClass324_2.method7265(arg0.anInt8932);
			if (local19.anInt1381 == 3) {
				if (arg0.anInt8997 > 0 && Static363.anInt6671 >= arg0.anInt8991 && arg0.anInt8961 < Static363.anInt6671) {
					arg0.anInt8932 = -1;
				}
			} else if (local19.anInt1381 == 1 && arg0.anInt8997 > 0 && Static363.anInt6671 >= arg0.anInt8991 && arg0.anInt8961 < Static363.anInt6671) {
				arg0.anInt8955 = 2;
			}
		}
		if (arg0.anInt8932 != -1 && arg0.anInt8955 == 0) {
			local19 = Static388.aClass324_2.method7265(arg0.anInt8932);
			if (local19 == null || local19.anIntArray127 == null) {
				arg0.anInt8932 = -1;
			} else {
				arg0.anInt8944++;
				if (arg0.anInt8975 < local19.anIntArray127.length && arg0.anInt8944 > local19.anIntArray128[arg0.anInt8975]) {
					arg0.anInt8975++;
					arg0.anInt8944 = 1;
					Static32.method514(arg0 == Static461.aClass15_Sub2_Sub4_Sub2_2, arg0.anInt8911, arg0.aByte98, local19, arg0.anInt8913, arg0.anInt8975);
				}
				if (arg0.anInt8975 >= local19.anIntArray127.length) {
					arg0.anInt8975 -= local19.anInt1378;
					arg0.anInt8969++;
					if (local19.anInt1382 <= arg0.anInt8969) {
						arg0.anInt8932 = -1;
					} else if (arg0.anInt8975 >= 0 && arg0.anInt8975 < local19.anIntArray127.length) {
						Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt8911, arg0.aByte98, local19, arg0.anInt8913, arg0.anInt8975);
					} else {
						arg0.anInt8932 = -1;
					}
				}
				arg0.anInt8929 = arg0.anInt8975 + 1;
				if (arg0.anInt8929 >= local19.anIntArray127.length) {
					arg0.anInt8929 -= local19.anInt1378;
					if (local19.anInt1382 <= arg0.anInt8969 + 1) {
						arg0.anInt8929 = -1;
					} else if (arg0.anInt8929 < 0 || arg0.anInt8929 >= local19.anIntArray127.length) {
						arg0.anInt8929 = -1;
					}
				}
				arg0.anInt8971 = local19.anInt1386;
			}
		}
		if (arg0.anInt8955 > 0) {
			arg0.anInt8955--;
		}
		for (@Pc(1059) int local1059 = 0; local1059 < arg0.aClass140Array3.length; local1059++) {
			@Pc(1066) Class140 local1066 = arg0.aClass140Array3[local1059];
			if (local1066 != null) {
				if (local1066.anInt4044 > 0) {
					local1066.anInt4044--;
				} else {
					local201 = Static388.aClass324_2.method7265(local1066.anInt4049);
					if (local201 == null || local201.anIntArray127 == null) {
						arg0.aClass140Array3[local1059] = null;
					} else {
						local1066.anInt4045++;
						if (local1066.anInt4048 < local201.anIntArray127.length && local201.anIntArray128[local1066.anInt4048] < local1066.anInt4045) {
							local1066.anInt4048++;
							local1066.anInt4045 = 1;
							Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt8911, arg0.aByte98, local201, arg0.anInt8913, local1066.anInt4048);
						}
						if (local1066.anInt4048 >= local201.anIntArray127.length) {
							local1066.anInt4042++;
							local1066.anInt4048 -= local201.anInt1378;
							if (local1066.anInt4042 >= local201.anInt1382) {
								arg0.aClass140Array3[local1059] = null;
							} else if (local1066.anInt4048 >= 0 && local1066.anInt4048 < local201.anIntArray127.length) {
								Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg0, arg0.anInt8911, arg0.aByte98, local201, arg0.anInt8913, local1066.anInt4048);
							} else {
								arg0.aClass140Array3[local1059] = null;
							}
						}
						local1066.anInt4040 = local1066.anInt4048 + 1;
						if (local201.anIntArray127.length <= local1066.anInt4040) {
							local1066.anInt4040 -= local201.anInt1378;
							if (local1066.anInt4042 + 1 >= local201.anInt1382) {
								local1066.anInt4040 = -1;
							} else if (local1066.anInt4040 < 0 || local1066.anInt4040 >= local201.anIntArray127.length) {
								local1066.anInt4040 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IB)V")
	public static void method3796(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(4, arg0);
		local8.method3257();
	}
}

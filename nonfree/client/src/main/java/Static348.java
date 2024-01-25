import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	public static int anInt6642;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "S")
	public static short aShort95 = 1;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[100];

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
	public static int method5637(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0xF3333333) + (local13 & 0x33333333);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(42) int local42 = local31 + (local31 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!oo;)V")
	public static void method5638(@OriginalArg(1) Class67_Sub3_Sub3 arg0) {
		arg0.aBoolean329 = false;
		@Pc(26) Class111 local26;
		if (arg0.anInt5040 != -1) {
			local26 = Static306.method5143(arg0.anInt5040);
			if (local26 == null || local26.anIntArray191 == null) {
				arg0.anInt5040 = -1;
				arg0.aBoolean328 = false;
			} else {
				label297: {
					arg0.anInt5006++;
					if (arg0.anInt5021 < local26.anIntArray191.length && arg0.anInt5006 > local26.anIntArray190[arg0.anInt5021]) {
						arg0.anInt5021++;
						arg0.anInt5018++;
						arg0.anInt5006 = 1;
						Static354.method5681(arg0.anInt6310, arg0.anInt6308, local26, Static156.aClass67_Sub3_Sub3_Sub2_2 == arg0, arg0.anInt5021);
					}
					if (arg0.anInt5021 >= local26.anIntArray191.length) {
						arg0.anInt5021 = 0;
						arg0.anInt5006 = 0;
						if (arg0.aBoolean328) {
							arg0.anInt5040 = arg0.method4374().method935();
							if (arg0.anInt5040 == -1) {
								arg0.aBoolean328 = false;
								break label297;
							}
							local26 = Static306.method5143(arg0.anInt5040);
						}
						Static354.method5681(arg0.anInt6310, arg0.anInt6308, local26, arg0 == Static156.aClass67_Sub3_Sub3_Sub2_2, arg0.anInt5021);
					}
					arg0.anInt5018 = arg0.anInt5021 + 1;
					if (local26.anIntArray191.length <= arg0.anInt5018) {
						arg0.anInt5018 = 0;
					}
				}
			}
		}
		@Pc(198) Class111 local198;
		if (arg0.anInt5043 != -1 && arg0.anInt5061 <= Static293.anInt5807) {
			@Pc(182) Class213 local182 = Static89.method1296(arg0.anInt5043);
			@Pc(185) int local185 = local182.anInt6649;
			if (local185 == -1) {
				arg0.anInt5043 = -1;
			} else {
				label299: {
					local198 = Static306.method5143(local185);
					if (local182.aBoolean424) {
						if (local198.anInt2713 == 3) {
							if (arg0.anInt5063 > 0 && Static293.anInt5807 >= arg0.anInt5037 && Static293.anInt5807 > arg0.anInt5014) {
								arg0.anInt5043 = -1;
								break label299;
							}
						} else if (local198.anInt2713 == 1 && arg0.anInt5063 > 0 && Static293.anInt5807 >= arg0.anInt5037 && arg0.anInt5014 < Static293.anInt5807) {
							arg0.anInt5061 = Static293.anInt5807 + 1;
							break label299;
						}
					}
					if (local198 == null || local198.anIntArray191 == null) {
						arg0.anInt5043 = -1;
					} else {
						if (arg0.anInt5039 < 0) {
							arg0.anInt5039 = 0;
							Static354.method5681(arg0.anInt6310, arg0.anInt6308, local198, arg0 == Static156.aClass67_Sub3_Sub3_Sub2_2, 0);
						}
						arg0.anInt5007++;
						if (arg0.anInt5039 < local198.anIntArray191.length && arg0.anInt5007 > local198.anIntArray190[arg0.anInt5039]) {
							arg0.anInt5007 = 1;
							arg0.anInt5039++;
							Static354.method5681(arg0.anInt6310, arg0.anInt6308, local198, Static156.aClass67_Sub3_Sub3_Sub2_2 == arg0, arg0.anInt5039);
						}
						if (local198.anIntArray191.length <= arg0.anInt5039) {
							if (local182.aBoolean424) {
								arg0.anInt5032++;
								arg0.anInt5039 -= local198.anInt2723;
								if (local198.anInt2714 <= arg0.anInt5032) {
									arg0.anInt5043 = -1;
								} else if (arg0.anInt5039 >= 0 && arg0.anInt5039 < local198.anIntArray191.length) {
									Static354.method5681(arg0.anInt6310, arg0.anInt6308, local198, Static156.aClass67_Sub3_Sub3_Sub2_2 == arg0, arg0.anInt5039);
								} else {
									arg0.anInt5043 = -1;
								}
							} else {
								arg0.anInt5043 = -1;
							}
						}
						arg0.anInt5058 = arg0.anInt5039 + 1;
						if (arg0.anInt5058 >= local198.anIntArray191.length) {
							if (local182.aBoolean424) {
								arg0.anInt5058 -= local198.anInt2723;
								if (local198.anInt2714 <= arg0.anInt5032 + 1) {
									arg0.anInt5058 = -1;
								} else if (arg0.anInt5058 < 0 || arg0.anInt5058 >= local198.anIntArray191.length) {
									arg0.anInt5058 = -1;
								}
							} else {
								arg0.anInt5058 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5013 != -1 && arg0.anInt5001 <= 1) {
			local26 = Static306.method5143(arg0.anInt5013);
			if (local26.anInt2713 == 3) {
				if (arg0.anInt5063 > 0 && arg0.anInt5037 <= Static293.anInt5807 && Static293.anInt5807 > arg0.anInt5014) {
					arg0.anInt5013 = -1;
				}
			} else if (local26.anInt2713 == 1 && arg0.anInt5063 > 0 && Static293.anInt5807 >= arg0.anInt5037 && Static293.anInt5807 > arg0.anInt5014) {
				arg0.anInt5001 = 2;
			}
		}
		if (arg0.anInt5013 != -1 && arg0.anInt5001 == 0) {
			local26 = Static306.method5143(arg0.anInt5013);
			if (local26 == null || local26.anIntArray191 == null) {
				arg0.anInt5013 = -1;
			} else {
				arg0.anInt5005++;
				if (local26.anIntArray191.length > arg0.anInt5060 && local26.anIntArray190[arg0.anInt5060] < arg0.anInt5005) {
					arg0.anInt5005 = 1;
					arg0.anInt5060++;
					Static354.method5681(arg0.anInt6310, arg0.anInt6308, local26, Static156.aClass67_Sub3_Sub3_Sub2_2 == arg0, arg0.anInt5060);
				}
				if (local26.anIntArray191.length <= arg0.anInt5060) {
					arg0.anInt5000++;
					arg0.anInt5060 -= local26.anInt2723;
					if (local26.anInt2714 <= arg0.anInt5000) {
						arg0.anInt5013 = -1;
					} else if (arg0.anInt5060 >= 0 && local26.anIntArray191.length > arg0.anInt5060) {
						Static354.method5681(arg0.anInt6310, arg0.anInt6308, local26, arg0 == Static156.aClass67_Sub3_Sub3_Sub2_2, arg0.anInt5060);
					} else {
						arg0.anInt5013 = -1;
					}
				}
				arg0.anInt5015 = arg0.anInt5060 + 1;
				if (arg0.anInt5015 >= local26.anIntArray191.length) {
					arg0.anInt5015 -= local26.anInt2723;
					if (local26.anInt2714 <= arg0.anInt5000 + 1) {
						arg0.anInt5015 = -1;
					} else if (arg0.anInt5015 < 0 || arg0.anInt5015 >= local26.anIntArray191.length) {
						arg0.anInt5015 = -1;
					}
				}
				arg0.aBoolean329 = local26.aBoolean187;
			}
		}
		if (arg0.anInt5001 > 0) {
			arg0.anInt5001--;
		}
		for (@Pc(750) int local750 = 0; local750 < arg0.aClass72Array3.length; local750++) {
			@Pc(757) Class72 local757 = arg0.aClass72Array3[local750];
			if (local757 != null) {
				if (local757.anInt1555 > 0) {
					local757.anInt1555--;
				} else {
					local198 = Static306.method5143(local757.anInt1550);
					if (local198 == null || local198.anIntArray191 == null) {
						arg0.aClass72Array3[local750] = null;
					} else {
						local757.anInt1544++;
						if (local198.anIntArray191.length > local757.anInt1552 && local198.anIntArray190[local757.anInt1552] < local757.anInt1544) {
							local757.anInt1552++;
							local757.anInt1544 = 1;
							Static354.method5681(arg0.anInt6310, arg0.anInt6308, local198, arg0 == Static156.aClass67_Sub3_Sub3_Sub2_2, local757.anInt1552);
						}
						if (local198.anIntArray191.length <= local757.anInt1552) {
							local757.anInt1549++;
							local757.anInt1552 -= local198.anInt2723;
							if (local757.anInt1549 >= local198.anInt2714) {
								arg0.aClass72Array3[local750] = null;
							} else if (local757.anInt1552 >= 0 && local757.anInt1552 < local198.anIntArray191.length) {
								Static354.method5681(arg0.anInt6310, arg0.anInt6308, local198, arg0 == Static156.aClass67_Sub3_Sub3_Sub2_2, local757.anInt1552);
							} else {
								arg0.aClass72Array3[local750] = null;
							}
						}
						local757.anInt1545 = local757.anInt1552 + 1;
						if (local198.anIntArray191.length <= local757.anInt1545) {
							local757.anInt1545 -= local198.anInt2723;
							if (local757.anInt1549 + 1 >= local198.anInt2714) {
								local757.anInt1545 = -1;
							} else if (local757.anInt1545 < 0 || local757.anInt1545 >= local198.anIntArray191.length) {
								local757.anInt1545 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([BIIZ)Z")
	public static boolean method5639(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class11_Sub25 local12 = new Class11_Sub25(arg0);
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(18) int local18 = local12.method5193();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(61) int local61;
				@Pc(88) Class84 local88;
				do {
					@Pc(65) int local65;
					@Pc(70) int local70;
					do {
						do {
							do {
								do {
									@Pc(34) int local34;
									while (local28) {
										local34 = local12.method5188();
										if (local34 == 0) {
											continue label68;
										}
										local12.method5185();
									}
									local34 = local12.method5188();
									if (local34 == 0) {
										continue label68;
									}
									local26 += local34 - 1;
									@Pc(49) int local49 = local26 & 0x3F;
									@Pc(55) int local55 = local26 >> 6 & 0x3F;
									local61 = local12.method5185() >> 2;
									local65 = arg1 + local55;
									local70 = local49 + arg2;
								} while (local65 <= 0);
							} while (local70 <= 0);
						} while (Static24.anInt454 - 1 <= local65);
					} while (Static240.anInt4832 - 1 <= local70);
					local88 = Static108.method1650(local14);
				} while (local61 == 22 && !Static280.aBoolean11 && local88.anInt2016 == 0 && local88.anInt2006 != 1 && !local88.aBoolean138);
				local28 = true;
				if (!local88.method1636()) {
					local7 = false;
					Static106.anInt1980++;
				}
			}
		}
	}
}

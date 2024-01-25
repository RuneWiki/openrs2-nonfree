import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!en", name = "qb", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_30 = new Class243(68, 3);

	@OriginalMember(owner = "client!en", name = "Eb", descriptor = "I")
	public static int anInt2224 = 0;

	@OriginalMember(owner = "client!en", name = "Gb", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_69 = new Class202("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(ZI)Lclient!wca;")
	public static Class310 method2143(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static235.aClass310ArrayArray2[local14] == null || Static235.aClass310ArrayArray2[local14][local18] == null) {
			@Pc(32) boolean local32 = Static106.method1964(local14);
			if (!local32) {
				return null;
			}
		}
		return Static235.aClass310ArrayArray2[local14][local18];
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BLclient!dda;)V")
	public static void method2147(@OriginalArg(1) Class53 arg0) {
		Static302.aClass53_87 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(JIIIZBLjava/lang/String;ILjava/lang/String;IZ)V")
	public static void method2154(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (!Static452.aBoolean600 && Static323.anInt6016 < 500) {
			@Pc(17) int local17 = arg8 == -1 ? Static94.anInt1853 : arg8;
			@Pc(36) Class2_Sub44 local36 = new Class2_Sub44(arg5, arg7, local17, arg2, arg1, arg0, arg6, arg3, arg4, arg9);
			Static448.aClass249_63.method6523(local36);
			Static323.anInt6016++;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)Lclient!wu;")
	public static Class320 method2156(@OriginalArg(0) int arg0) {
		@Pc(8) Class320[] local8 = Static505.method7419();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class320 local16 = local8[local10];
			if (local16.anInt9380 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(B)I")
	public static int method2158() {
		return 16;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!cd;I)V")
	public static void method2162(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		arg0.anInt5026 = 0;
		@Pc(18) Class4 local18;
		if (arg0.anInt5063 != -1) {
			local18 = Static396.aClass157_2.method3745(arg0.anInt5063);
			if (local18 == null || local18.anIntArray11 == null) {
				arg0.anInt5063 = -1;
				arg0.aBoolean385 = false;
			} else {
				label394: {
					arg0.anInt5030++;
					if (arg0.anInt5032 < local18.anIntArray11.length && arg0.anInt5030 > local18.anIntArray12[arg0.anInt5032]) {
						arg0.anInt5030 = 1;
						arg0.anInt5032++;
						arg0.anInt5071++;
						Static250.method3962(arg0.anInt5032, arg0.anInt7659, arg0.aByte90, local18, arg0 == Static266.aClass1_Sub1_Sub2_Sub1_1, arg0.anInt7660);
					}
					if (arg0.anInt5032 >= local18.anIntArray11.length) {
						arg0.anInt5030 = 0;
						arg0.anInt5032 = 0;
						if (arg0.aBoolean385) {
							arg0.anInt5063 = arg0.method4393().method709();
							if (arg0.anInt5063 == -1) {
								arg0.aBoolean385 = false;
								break label394;
							}
							local18 = Static396.aClass157_2.method3745(arg0.anInt5063);
						}
						Static250.method3962(arg0.anInt5032, arg0.anInt7659, arg0.aByte90, local18, arg0 == Static266.aClass1_Sub1_Sub2_Sub1_1, arg0.anInt7660);
					}
					arg0.anInt5071 = arg0.anInt5032 + 1;
					if (local18.anIntArray11.length <= arg0.anInt5071) {
						arg0.anInt5071 = 0;
					}
				}
			}
		}
		@Pc(182) int local182;
		@Pc(196) Class4 local196;
		@Pc(179) Class226 local179;
		if (arg0.anInt5097 != -1 && arg0.anInt5061 <= Static115.anInt2326) {
			local179 = Static305.aClass14_1.method555(arg0.anInt5097);
			local182 = local179.anInt6964;
			if (local182 == -1) {
				arg0.anInt5097 = -1;
			} else {
				label396: {
					local196 = Static396.aClass157_2.method3745(local182);
					if (local179.aBoolean524) {
						if (local196.anInt121 == 3) {
							if (arg0.anInt5105 > 0 && arg0.anInt5068 <= Static115.anInt2326 && Static115.anInt2326 > arg0.anInt5033) {
								arg0.anInt5097 = -1;
								break label396;
							}
						} else if (local196.anInt121 == 1 && arg0.anInt5105 > 0 && Static115.anInt2326 >= arg0.anInt5068 && Static115.anInt2326 > arg0.anInt5033) {
							arg0.anInt5061 = Static115.anInt2326 + 1;
							break label396;
						}
					}
					if (local196 == null || local196.anIntArray11 == null) {
						arg0.anInt5097 = -1;
					} else {
						if (arg0.anInt5031 < 0) {
							arg0.anInt5031 = 0;
							Static250.method3962(0, arg0.anInt7659, arg0.aByte90, local196, arg0 == Static266.aClass1_Sub1_Sub2_Sub1_1, arg0.anInt7660);
						}
						arg0.anInt5050++;
						if (local196.anIntArray11.length > arg0.anInt5031 && local196.anIntArray12[arg0.anInt5031] < arg0.anInt5050) {
							arg0.anInt5050 = 1;
							arg0.anInt5031++;
							Static250.method3962(arg0.anInt5031, arg0.anInt7659, arg0.aByte90, local196, Static266.aClass1_Sub1_Sub2_Sub1_1 == arg0, arg0.anInt7660);
						}
						if (arg0.anInt5031 >= local196.anIntArray11.length) {
							if (local179.aBoolean524) {
								arg0.anInt5052++;
								arg0.anInt5031 -= local196.anInt116;
								if (local196.anInt127 <= arg0.anInt5052) {
									arg0.anInt5097 = -1;
								} else if (arg0.anInt5031 >= 0 && local196.anIntArray11.length > arg0.anInt5031) {
									Static250.method3962(arg0.anInt5031, arg0.anInt7659, arg0.aByte90, local196, Static266.aClass1_Sub1_Sub2_Sub1_1 == arg0, arg0.anInt7660);
								} else {
									arg0.anInt5097 = -1;
								}
							} else {
								arg0.anInt5097 = -1;
							}
						}
						arg0.anInt5081 = arg0.anInt5031 + 1;
						if (arg0.anInt5081 >= local196.anIntArray11.length) {
							if (local179.aBoolean524) {
								arg0.anInt5081 -= local196.anInt116;
								if (local196.anInt127 <= arg0.anInt5052 + 1) {
									arg0.anInt5081 = -1;
								} else if (arg0.anInt5081 < 0 || local196.anIntArray11.length <= arg0.anInt5081) {
									arg0.anInt5081 = -1;
								}
							} else {
								arg0.anInt5081 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5060 != -1 && Static115.anInt2326 >= arg0.anInt5084) {
			local179 = Static305.aClass14_1.method555(arg0.anInt5060);
			local182 = local179.anInt6964;
			if (local182 == -1) {
				arg0.anInt5060 = -1;
			} else {
				label399: {
					local196 = Static396.aClass157_2.method3745(local182);
					if (local179.aBoolean524) {
						if (local196.anInt121 == 3) {
							if (arg0.anInt5105 > 0 && arg0.anInt5068 <= Static115.anInt2326 && Static115.anInt2326 > arg0.anInt5033) {
								arg0.anInt5060 = -1;
								break label399;
							}
						} else if (local196.anInt121 == 1 && arg0.anInt5105 > 0 && arg0.anInt5068 <= Static115.anInt2326 && arg0.anInt5033 < Static115.anInt2326) {
							arg0.anInt5084 = Static115.anInt2326 + 1;
							break label399;
						}
					}
					if (local196 == null || local196.anIntArray11 == null) {
						arg0.anInt5060 = -1;
					} else {
						if (arg0.anInt5034 < 0) {
							arg0.anInt5034 = 0;
							Static250.method3962(0, arg0.anInt7659, arg0.aByte90, local196, Static266.aClass1_Sub1_Sub2_Sub1_1 == arg0, arg0.anInt7660);
						}
						arg0.anInt5041++;
						if (local196.anIntArray11.length > arg0.anInt5034 && arg0.anInt5041 > local196.anIntArray12[arg0.anInt5034]) {
							arg0.anInt5034++;
							arg0.anInt5041 = 1;
							Static250.method3962(arg0.anInt5034, arg0.anInt7659, arg0.aByte90, local196, arg0 == Static266.aClass1_Sub1_Sub2_Sub1_1, arg0.anInt7660);
						}
						if (arg0.anInt5034 >= local196.anIntArray11.length) {
							if (local179.aBoolean524) {
								arg0.anInt5057++;
								arg0.anInt5034 -= local196.anInt116;
								if (arg0.anInt5057 >= local196.anInt127) {
									arg0.anInt5060 = -1;
								} else if (arg0.anInt5034 >= 0 && arg0.anInt5034 < local196.anIntArray11.length) {
									Static250.method3962(arg0.anInt5034, arg0.anInt7659, arg0.aByte90, local196, Static266.aClass1_Sub1_Sub2_Sub1_1 == arg0, arg0.anInt7660);
								} else {
									arg0.anInt5060 = -1;
								}
							} else {
								arg0.anInt5060 = -1;
							}
						}
						arg0.anInt5101 = arg0.anInt5034 + 1;
						if (local196.anIntArray11.length <= arg0.anInt5101) {
							if (local179.aBoolean524) {
								arg0.anInt5101 -= local196.anInt116;
								if (local196.anInt127 <= arg0.anInt5057 + 1) {
									arg0.anInt5101 = -1;
								} else if (arg0.anInt5101 < 0 || local196.anIntArray11.length <= arg0.anInt5101) {
									arg0.anInt5101 = -1;
								}
							} else {
								arg0.anInt5101 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5051 != -1 && arg0.anInt5094 <= 1) {
			local18 = Static396.aClass157_2.method3745(arg0.anInt5051);
			if (local18.anInt121 == 3) {
				if (arg0.anInt5105 > 0 && arg0.anInt5068 <= Static115.anInt2326 && Static115.anInt2326 > arg0.anInt5033) {
					arg0.anInt5051 = -1;
				}
			} else if (local18.anInt121 == 1 && arg0.anInt5105 > 0 && arg0.anInt5068 <= Static115.anInt2326 && Static115.anInt2326 > arg0.anInt5033) {
				arg0.anInt5094 = 2;
			}
		}
		if (arg0.anInt5051 != -1 && arg0.anInt5094 == 0) {
			local18 = Static396.aClass157_2.method3745(arg0.anInt5051);
			if (local18 == null || local18.anIntArray11 == null) {
				arg0.anInt5051 = -1;
			} else {
				arg0.anInt5037++;
				if (local18.anIntArray11.length > arg0.anInt5080 && arg0.anInt5037 > local18.anIntArray12[arg0.anInt5080]) {
					arg0.anInt5037 = 1;
					arg0.anInt5080++;
					Static250.method3962(arg0.anInt5080, arg0.anInt7659, arg0.aByte90, local18, arg0 == Static266.aClass1_Sub1_Sub2_Sub1_1, arg0.anInt7660);
				}
				if (arg0.anInt5080 >= local18.anIntArray11.length) {
					arg0.anInt5028++;
					arg0.anInt5080 -= local18.anInt116;
					if (local18.anInt127 <= arg0.anInt5028) {
						arg0.anInt5051 = -1;
					} else if (arg0.anInt5080 >= 0 && arg0.anInt5080 < local18.anIntArray11.length) {
						Static250.method3962(arg0.anInt5080, arg0.anInt7659, arg0.aByte90, local18, Static266.aClass1_Sub1_Sub2_Sub1_1 == arg0, arg0.anInt7660);
					} else {
						arg0.anInt5051 = -1;
					}
				}
				arg0.anInt5029 = arg0.anInt5080 + 1;
				if (local18.anIntArray11.length <= arg0.anInt5029) {
					arg0.anInt5029 -= local18.anInt116;
					if (arg0.anInt5028 + 1 >= local18.anInt127) {
						arg0.anInt5029 = -1;
					} else if (arg0.anInt5029 < 0 || arg0.anInt5029 >= local18.anIntArray11.length) {
						arg0.anInt5029 = -1;
					}
				}
				arg0.anInt5026 = local18.anInt125;
			}
		}
		if (arg0.anInt5094 > 0) {
			arg0.anInt5094--;
		}
		for (@Pc(1057) int local1057 = 0; local1057 < arg0.aClass149Array3.length; local1057++) {
			@Pc(1064) Class149 local1064 = arg0.aClass149Array3[local1057];
			if (local1064 != null) {
				if (local1064.anInt4194 > 0) {
					local1064.anInt4194--;
				} else {
					local196 = Static396.aClass157_2.method3745(local1064.anInt4196);
					if (local196 == null || local196.anIntArray11 == null) {
						arg0.aClass149Array3[local1057] = null;
					} else {
						local1064.anInt4197++;
						if (local196.anIntArray11.length > local1064.anInt4200 && local196.anIntArray12[local1064.anInt4200] < local1064.anInt4197) {
							local1064.anInt4200++;
							local1064.anInt4197 = 1;
							Static250.method3962(local1064.anInt4200, arg0.anInt7659, arg0.aByte90, local196, Static266.aClass1_Sub1_Sub2_Sub1_1 == arg0, arg0.anInt7660);
						}
						if (local196.anIntArray11.length <= local1064.anInt4200) {
							local1064.anInt4199++;
							local1064.anInt4200 -= local196.anInt116;
							if (local1064.anInt4199 >= local196.anInt127) {
								arg0.aClass149Array3[local1057] = null;
							} else if (local1064.anInt4200 >= 0 && local1064.anInt4200 < local196.anIntArray11.length) {
								Static250.method3962(local1064.anInt4200, arg0.anInt7659, arg0.aByte90, local196, arg0 == Static266.aClass1_Sub1_Sub2_Sub1_1, arg0.anInt7660);
							} else {
								arg0.aClass149Array3[local1057] = null;
							}
						}
						local1064.anInt4192 = local1064.anInt4200 + 1;
						if (local196.anIntArray11.length <= local1064.anInt4192) {
							local1064.anInt4192 -= local196.anInt116;
							if (local1064.anInt4199 + 1 >= local196.anInt127) {
								local1064.anInt4192 = -1;
							} else if (local1064.anInt4192 < 0 || local1064.anInt4192 >= local196.anIntArray11.length) {
								local1064.anInt4192 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2163(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local11 < local19 && Static297.method4697(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local19 && Static297.method4697(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(49) int local49 = local19 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(66) int local66 = local11; local66 < local19; local66++) {
			@Pc(72) char local72 = arg0.charAt(local66);
			if (Static353.method4514(local72)) {
				@Pc(80) char local80 = Static518.method7530(local72);
				if (local80 != '\u0000') {
					local64.append(local80);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}
}

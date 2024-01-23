import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
	public static int anInt1532;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
	public static int anInt1539;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "Lclient!ec;")
	public static Class46 aClass46_7 = new Class46(260);

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
	public static int anInt1540 = 0;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)Lclient!mf;")
	public static Class2_Sub3_Sub16 method1312() {
		@Pc(12) Class2_Sub3_Sub16 local12 = (Class2_Sub3_Sub16) Static99.aClass144_5.method3663();
		if (local12 != null) {
			local12.method4926();
			local12.method4613();
			return local12;
		}
		do {
			local12 = (Class2_Sub3_Sub16) Static8.aClass144_1.method3663();
			if (local12 == null) {
				return null;
			}
			if (local12.method2720() > Static6.method126()) {
				return null;
			}
			local12.method4926();
			local12.method4613();
		} while ((local12.aLong295 & Long.MIN_VALUE) == 0L);
		return local12;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Lclient!bo;")
	public static Class22 method1316() {
		try {
			return (Class22) Class.forName("Class22_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return new Class22_Sub1();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)I")
	public static int method1318(@OriginalArg(0) int arg0) {
		if (Static42.aClass45_1 != null) {
			Static42.aClass45_1.method1045();
			Static42.aClass45_1 = null;
		}
		Static55.anInt1260++;
		if (Static55.anInt1260 > 4) {
			Static55.anInt1260 = 0;
			Static257.anInt5346 = 0;
			return arg0;
		}
		Static257.anInt5346 = 0;
		if (Static26.anInt553 == Static251.anInt5003) {
			Static26.anInt553 = Static106.anInt2314;
		} else {
			Static26.anInt553 = Static251.anInt5003;
		}
		return -1;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[BI)Z")
	public static boolean method1322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) boolean local8 = true;
		@Pc(10) int local10 = -1;
		@Pc(15) Class2_Sub26 local15 = new Class2_Sub26(arg2);
		label58: while (true) {
			@Pc(23) int local23 = local15.method4240();
			if (local23 == 0) {
				return local8;
			}
			local10 += local23;
			@Pc(31) boolean local31 = false;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(39) int local39;
				while (!local31) {
					local39 = local15.method4217();
					if (local39 == 0) {
						continue label58;
					}
					local33 += local39 - 1;
					@Pc(71) int local71 = local33 >> 6 & 0x3F;
					@Pc(75) int local75 = local71 + arg1;
					@Pc(79) int local79 = local33 & 0x3F;
					@Pc(84) int local84 = local79 + arg0;
					@Pc(90) int local90 = local15.method4261() >> 2;
					if (local75 > 0 && local84 > 0 && local75 < 103 && local84 < 103) {
						@Pc(113) Class143 local113 = Static218.method3692(local10);
						if (local90 != 22 || Static106.aBoolean183 || local113.anInt4490 != 0 || local113.anInt4526 == 1 || local113.aBoolean381) {
							local31 = true;
							if (!local113.method3654()) {
								Static148.anInt3167++;
								local8 = false;
							}
						}
					}
				}
				local39 = local15.method4217();
				if (local39 == 0) {
					break;
				}
				local15.method4261();
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "(I)V")
	public static void method1324() {
		if (Static52.method1039() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static213.anInt4460 - 4 & 0xFF);
		@Pc(23) int local23 = Static213.anInt4460 % 104;
		@Pc(25) int local25;
		@Pc(30) int local30;
		for (local25 = 0; local25 < 4; local25++) {
			for (local30 = 0; local30 < 104; local30++) {
				Static104.aByteArrayArrayArray6[local25][local23][local30] = local19;
			}
		}
		if (Static208.anInt4335 == 3) {
			return;
		}
		for (local25 = 0; local25 < 2; local25++) {
			Static162.anIntArray257[local25] = -1000000;
			Static40.anIntArray60[local25] = 1000000;
			Static212.anIntArray362[local25] = 0;
			Static112.anIntArray165[local25] = 1000000;
			Static170.anIntArray294[local25] = 0;
		}
		if (Static101.anInt6027 != 1) {
			local25 = Static99.method1894(Static208.anInt4335, Static255.anInt5182, Static271.anInt5632);
			if (local25 - Static133.anInt2729 < 800 && (Static134.aByteArrayArrayArray9[Static208.anInt4335][Static271.anInt5632 >> 7][Static255.anInt5182 >> 7] & 0x4) != 0) {
				Static284.method4718(1, Static180.aClass2_Sub31ArrayArrayArray2, false, Static271.anInt5632 >> 7, Static255.anInt5182 >> 7);
			}
			return;
		}
		if ((Static134.aByteArrayArrayArray9[Static208.anInt4335][Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7][Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7] & 0x4) != 0) {
			Static284.method4718(0, Static180.aClass2_Sub31ArrayArrayArray2, false, Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7, Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7);
		}
		if (Static210.anInt4376 >= 310) {
			return;
		}
		local25 = Static271.anInt5632 >> 7;
		local30 = Static255.anInt5182 >> 7;
		@Pc(136) int local136 = Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7;
		@Pc(148) int local148;
		if (local25 >= local136) {
			local148 = local25 - local136;
		} else {
			local148 = local136 - local25;
		}
		@Pc(159) int local159 = Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7;
		@Pc(167) int local167;
		if (local30 >= local159) {
			local167 = local30 - local159;
		} else {
			local167 = local159 - local30;
		}
		if (local148 == 0 && local167 == 0 || local148 <= -104 || local148 >= 104 || local167 <= -104 || local167 >= 104) {
			Static108.method2009(null, "RC: " + local25 + "," + local30 + " " + local136 + "," + local159 + " " + Static125.anInt5772 + "," + Static203.anInt4236);
			return;
		}
		@Pc(240) int local240;
		@Pc(242) int local242;
		if (local167 >= local148) {
			local240 = local148 * 65536 / local167;
			local242 = 32768;
			while (local30 != local159) {
				if (local159 > local30) {
					local30++;
				} else if (local159 < local30) {
					local30--;
				}
				if ((Static134.aByteArrayArrayArray9[Static208.anInt4335][local25][local30] & 0x4) != 0) {
					Static284.method4718(1, Static180.aClass2_Sub31ArrayArrayArray2, false, local25, local30);
					break;
				}
				local242 += local240;
				if (local242 >= 65536) {
					if (local136 > local25) {
						local25++;
					} else if (local25 > local136) {
						local25--;
					}
					local242 -= 65536;
					if ((Static134.aByteArrayArrayArray9[Static208.anInt4335][local25][local30] & 0x4) != 0) {
						Static284.method4718(1, Static180.aClass2_Sub31ArrayArrayArray2, false, local25, local30);
						break;
					}
				}
			}
			return;
		}
		local240 = local167 * 65536 / local148;
		local242 = 32768;
		while (local25 != local136) {
			if (local25 < local136) {
				local25++;
			} else if (local136 < local25) {
				local25--;
			}
			if ((Static134.aByteArrayArrayArray9[Static208.anInt4335][local25][local30] & 0x4) != 0) {
				Static284.method4718(1, Static180.aClass2_Sub31ArrayArrayArray2, false, local25, local30);
				break;
			}
			local242 += local240;
			if (local242 >= 65536) {
				if (local30 < local159) {
					local30++;
				} else if (local30 > local159) {
					local30--;
				}
				local242 -= 65536;
				if ((Static134.aByteArrayArrayArray9[Static208.anInt4335][local25][local30] & 0x4) != 0) {
					Static284.method4718(1, Static180.aClass2_Sub31ArrayArrayArray2, false, local25, local30);
					break;
				}
			}
		}
	}
}

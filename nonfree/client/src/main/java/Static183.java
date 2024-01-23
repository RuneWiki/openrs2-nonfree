import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!o", name = "N", descriptor = "Z")
	public static boolean aBoolean435;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "[I")
	public static int[] anIntArray683 = new int[1000];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!ak;I)Lclient!em;")
	public static Class48 method4443(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1) {
		return Static126.method1947(arg0, arg1) ? Static256.method3980() : null;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method4445() {
		Static63.aClass1_Sub18_Sub1_1.method3126();
		@Pc(9) int local9 = Static63.aClass1_Sub18_Sub1_1.method3129(8);
		@Pc(18) int local18;
		if (Static293.anInt5831 > local9) {
			for (local18 = local9; local18 < Static293.anInt5831; local18++) {
				Static246.anIntArray395[Static110.anInt2061++] = Static75.anIntArray178[local18];
			}
		}
		if (local9 > Static293.anInt5831) {
			throw new RuntimeException("gnpov1");
		}
		Static293.anInt5831 = 0;
		for (local18 = 0; local18 < local9; local18++) {
			@Pc(70) int local70 = Static75.anIntArray178[local18];
			@Pc(74) Class6_Sub6_Sub1 local74 = Static211.aClass6_Sub6_Sub1Array2[local70];
			@Pc(79) int local79 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
			if (local79 == 0) {
				Static75.anIntArray178[Static293.anInt5831++] = local70;
				local74.anInt4519 = Static261.anInt5259;
			} else {
				@Pc(102) int local102 = Static63.aClass1_Sub18_Sub1_1.method3129(2);
				if (local102 == 0) {
					Static75.anIntArray178[Static293.anInt5831++] = local70;
					local74.anInt4519 = Static261.anInt5259;
					Static294.anIntArray687[Static101.anInt1926++] = local70;
				} else {
					@Pc(147) int local147;
					@Pc(157) int local157;
					if (local102 == 1) {
						Static75.anIntArray178[Static293.anInt5831++] = local70;
						local74.anInt4519 = Static261.anInt5259;
						local147 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
						local74.method3513(1, local147);
						local157 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
						if (local157 == 1) {
							Static294.anIntArray687[Static101.anInt1926++] = local70;
						}
					} else if (local102 == 2) {
						Static75.anIntArray178[Static293.anInt5831++] = local70;
						local74.anInt4519 = Static261.anInt5259;
						if (Static63.aClass1_Sub18_Sub1_1.method3129(1) == 1) {
							local147 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
							local74.method3513(2, local147);
							local157 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
							local74.method3513(2, local157);
						} else {
							local147 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
							local74.method3513(0, local147);
						}
						local147 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
						if (local147 == 1) {
							Static294.anIntArray687[Static101.anInt1926++] = local70;
						}
					} else if (local102 == 3) {
						Static246.anIntArray395[Static110.anInt2061++] = local70;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method4447(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 = (local7 << 5) + ((long) arg0.charAt(local12)) - local7;
		}
		return local7;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)[Lclient!bf;")
	public static Class1_Sub2_Sub2[] method4449() {
		@Pc(13) Class1_Sub2_Sub2[] local13 = new Class1_Sub2_Sub2[Static105.anInt1963];
		for (@Pc(15) int local15 = 0; local15 < Static105.anInt1963; local15++) {
			@Pc(26) int local26 = Static113.anIntArray273[local15] * Static49.anIntArray135[local15];
			@Pc(30) byte[] local30 = Static299.aByteArrayArray15[local15];
			if (Static235.aBooleanArray21[local15]) {
				@Pc(107) byte[] local107 = Static65.aByteArrayArray4[local15];
				@Pc(110) int[] local110 = new int[local26];
				for (@Pc(112) int local112 = 0; local112 < local26; local112++) {
					local110[local112] = Static158.anIntArray366[local30[local112] & 0xFF] | (local107[local112] & 0xFF) << 24;
				}
				if (Static240.aBoolean369) {
					local13[local15] = new Class1_Sub2_Sub2_Sub2_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[local15], Static134.anIntArray306[local15], Static49.anIntArray135[local15], Static113.anIntArray273[local15], local110);
				} else {
					local13[local15] = new Class1_Sub2_Sub2_Sub1_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[local15], Static134.anIntArray306[local15], Static49.anIntArray135[local15], Static113.anIntArray273[local15], local110);
				}
			} else {
				@Pc(37) int[] local37 = new int[local26];
				for (@Pc(39) int local39 = 0; local39 < local26; local39++) {
					local37[local39] = Static158.anIntArray366[local30[local39] & 0xFF];
				}
				if (Static240.aBoolean369) {
					local13[local15] = new Class1_Sub2_Sub2_Sub2(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[local15], Static134.anIntArray306[local15], Static49.anIntArray135[local15], Static113.anIntArray273[local15], local37);
				} else {
					local13[local15] = new Class1_Sub2_Sub2_Sub1(Static214.anInt4248, Static67.anInt1375, Static227.anIntArray557[local15], Static134.anIntArray306[local15], Static49.anIntArray135[local15], Static113.anIntArray273[local15], local37);
				}
			}
		}
		Static247.method3867();
		return local13;
	}

	@OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
	public static void method4455() {
		Static210.aClass31_32.method850();
		Static296.aClass31_46.method850();
		Static98.aClass31_15.method850();
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public static void method4456() {
		if (Static224.anInt4701 == 0 || Static224.anInt4701 == 5) {
			return;
		}
		try {
			if (++Static65.anInt1318 > 2000) {
				if (Static155.aClass73_3 != null) {
					Static155.aClass73_3.method1691();
					Static155.aClass73_3 = null;
				}
				if (Static276.anInt5535 >= 1) {
					Static170.anInt3132 = -5;
					Static224.anInt4701 = 0;
					return;
				}
				Static276.anInt5535++;
				Static65.anInt1318 = 0;
				if (Static89.anInt1687 == Static52.anInt1108) {
					Static52.anInt1108 = Static254.anInt5889;
				} else {
					Static52.anInt1108 = Static89.anInt1687;
				}
				Static224.anInt4701 = 1;
			}
			if (Static224.anInt4701 == 1) {
				Static4.aClass118_2 = Static13.aClass84_3.method1964(Static286.aString169, Static52.anInt1108);
				Static224.anInt4701 = 2;
			}
			if (Static224.anInt4701 == 2) {
				if (Static4.aClass118_2.anInt3187 == 2) {
					throw new IOException();
				}
				if (Static4.aClass118_2.anInt3187 != 1) {
					return;
				}
				Static155.aClass73_3 = new Class73((Socket) Static4.aClass118_2.anObject3, Static13.aClass84_3);
				Static4.aClass118_2 = null;
				@Pc(108) long local108 = Static211.aLong36 = Static136.method2158(Static70.aString39);
				@Pc(115) int local115 = (int) (local108 >> 16 & 0x1FL);
				Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
				Static270.aClass1_Sub18_Sub1_3.method3093(14);
				Static270.aClass1_Sub18_Sub1_3.method3093(local115);
				Static155.aClass73_3.method1685(2, Static270.aClass1_Sub18_Sub1_3.aByteArray71);
				if (Static72.aClass24_1 != null) {
					Static72.aClass24_1.method2458();
				}
				if (Static159.aClass24_2 != null) {
					Static159.aClass24_2.method2458();
				}
				@Pc(155) int local155 = Static155.aClass73_3.method1686();
				if (Static72.aClass24_1 != null) {
					Static72.aClass24_1.method2458();
				}
				if (Static159.aClass24_2 != null) {
					Static159.aClass24_2.method2458();
				}
				if (local155 != 0) {
					Static224.anInt4701 = 0;
					Static170.anInt3132 = local155;
					Static155.aClass73_3.method1691();
					Static155.aClass73_3 = null;
					return;
				}
				Static224.anInt4701 = 3;
			}
			if (Static224.anInt4701 == 3) {
				if (Static155.aClass73_3.method1687() < 8) {
					return;
				}
				Static155.aClass73_3.method1689(8, Static63.aClass1_Sub18_Sub1_1.aByteArray71, 0);
				Static63.aClass1_Sub18_Sub1_1.anInt3911 = 0;
				@Pc(217) int[] local217 = new int[4];
				Static267.aLong172 = Static63.aClass1_Sub18_Sub1_1.method3112();
				local217[3] = (int) Static267.aLong172;
				Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
				local217[0] = (int) (Math.random() * 9.9999999E7D);
				local217[2] = (int) (Static267.aLong172 >> 32);
				local217[1] = (int) (Math.random() * 9.9999999E7D);
				Static270.aClass1_Sub18_Sub1_3.method3093(10);
				Static270.aClass1_Sub18_Sub1_3.method3119(local217[0]);
				Static270.aClass1_Sub18_Sub1_3.method3119(local217[1]);
				Static270.aClass1_Sub18_Sub1_3.method3119(local217[2]);
				Static270.aClass1_Sub18_Sub1_3.method3119(local217[3]);
				Static270.aClass1_Sub18_Sub1_3.method3091(Static136.method2158(Static70.aString39));
				Static270.aClass1_Sub18_Sub1_3.method3067(Static234.aString159);
				Static270.aClass1_Sub18_Sub1_3.method3058(Static62.aBigInteger2, Static46.aBigInteger1);
				Static118.aClass1_Sub18_Sub1_2.anInt3911 = 0;
				if (Static98.anInt1878 == 40) {
					Static118.aClass1_Sub18_Sub1_2.method3093(18);
				} else {
					Static118.aClass1_Sub18_Sub1_2.method3093(16);
				}
				Static118.aClass1_Sub18_Sub1_2.method3123(Static270.aClass1_Sub18_Sub1_3.anInt3911 + Static94.method1537(Static266.aString179) + 163);
				Static118.aClass1_Sub18_Sub1_2.method3119(540);
				Static118.aClass1_Sub18_Sub1_2.method3093(Static30.anInt655);
				Static118.aClass1_Sub18_Sub1_2.method3093(Static149.aBoolean196 ? 1 : 0);
				Static118.aClass1_Sub18_Sub1_2.method3093(1);
				Static118.aClass1_Sub18_Sub1_2.method3093(Static136.method2157());
				Static118.aClass1_Sub18_Sub1_2.method3123(Static145.anInt2690);
				Static118.aClass1_Sub18_Sub1_2.method3123(Static166.anInt3046);
				Static118.aClass1_Sub18_Sub1_2.method3093(Static29.anInt623);
				Static251.method3953(Static118.aClass1_Sub18_Sub1_2);
				Static118.aClass1_Sub18_Sub1_2.method3067(Static266.aString179);
				Static118.aClass1_Sub18_Sub1_2.method3119(Static129.anInt3918);
				Static118.aClass1_Sub18_Sub1_2.method3119(Static110.method1724());
				Static37.aBoolean219 = true;
				Static118.aClass1_Sub18_Sub1_2.method3123(Static170.anInt3124);
				Static118.aClass1_Sub18_Sub1_2.method3119(Static253.aClass7_205.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static79.aClass7_132.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static251.aClass7_203.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static41.aClass7_41.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static60.aClass7_60.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static216.aClass7_178.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static67.aClass7_68.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static27.aClass7_29.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static58.aClass7_58.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static299.aClass7_240.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static169.aClass7_138.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static52.aClass7_47.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static82.aClass7_82.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static39.aClass7_39.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static284.aClass7_229.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static227.aClass7_184.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static12.aClass7_18.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static158.aClass7_133.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static95.aClass7_87.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static272.aClass7_218.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static195.aClass7_162.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static44.aClass7_43.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static54.aClass7_48.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static133.aClass7_117.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static140.aClass7_121.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static136.aClass7_119.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static107.aClass7_97.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static204.aClass7_168.method254());
				Static118.aClass1_Sub18_Sub1_2.method3119(Static75.aClass7_74.method254());
				Static118.aClass1_Sub18_Sub1_2.method3080(Static270.aClass1_Sub18_Sub1_3.anInt3911, Static270.aClass1_Sub18_Sub1_3.aByteArray71);
				Static155.aClass73_3.method1685(Static118.aClass1_Sub18_Sub1_2.anInt3911, Static118.aClass1_Sub18_Sub1_2.aByteArray71);
				Static270.aClass1_Sub18_Sub1_3.method3127(local217);
				for (@Pc(603) int local603 = 0; local603 < 4; local603++) {
					local217[local603] += 50;
				}
				Static63.aClass1_Sub18_Sub1_1.method3127(local217);
				Static224.anInt4701 = 4;
			}
			if (Static224.anInt4701 == 4) {
				if (Static155.aClass73_3.method1687() < 1) {
					return;
				}
				@Pc(637) int local637 = Static155.aClass73_3.method1686();
				if (local637 == 21) {
					Static224.anInt4701 = 7;
				} else if (local637 == 29) {
					Static224.anInt4701 = 10;
				} else if (local637 == 1) {
					Static224.anInt4701 = 5;
					Static170.anInt3132 = local637;
					return;
				} else if (local637 == 2) {
					Static224.anInt4701 = 8;
				} else if (local637 == 15) {
					Static224.anInt4701 = 0;
					Static170.anInt3132 = local637;
					return;
				} else if (local637 == 23 && Static276.anInt5535 < 1) {
					Static276.anInt5535++;
					Static224.anInt4701 = 1;
					Static65.anInt1318 = 0;
					Static155.aClass73_3.method1691();
					Static155.aClass73_3 = null;
					return;
				} else {
					Static170.anInt3132 = local637;
					Static224.anInt4701 = 0;
					Static155.aClass73_3.method1691();
					Static155.aClass73_3 = null;
					return;
				}
			}
			if (Static224.anInt4701 == 6) {
				Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
				Static270.aClass1_Sub18_Sub1_3.method3130(17);
				Static155.aClass73_3.method1685(Static270.aClass1_Sub18_Sub1_3.anInt3911, Static270.aClass1_Sub18_Sub1_3.aByteArray71);
				Static224.anInt4701 = 4;
				return;
			}
			if (Static224.anInt4701 == 7) {
				if (Static155.aClass73_3.method1687() >= 1) {
					Static251.anInt5125 = Static155.aClass73_3.method1686() * 60 + 180;
					Static170.anInt3132 = 21;
					Static224.anInt4701 = 0;
					Static155.aClass73_3.method1691();
					Static155.aClass73_3 = null;
					return;
				}
				return;
			}
			if (Static224.anInt4701 == 10) {
				if (Static155.aClass73_3.method1687() < 1) {
					return;
				}
				Static221.anInt4610 = Static155.aClass73_3.method1686();
				Static170.anInt3132 = 29;
				Static224.anInt4701 = 0;
				Static155.aClass73_3.method1691();
				Static155.aClass73_3 = null;
				return;
			}
			if (Static224.anInt4701 == 8) {
				if (Static155.aClass73_3.method1687() < 14) {
					return;
				}
				Static155.aClass73_3.method1689(14, Static63.aClass1_Sub18_Sub1_1.aByteArray71, 0);
				Static63.aClass1_Sub18_Sub1_1.anInt3911 = 0;
				Static95.anInt1824 = Static63.aClass1_Sub18_Sub1_1.method3122();
				Static106.anInt1990 = Static63.aClass1_Sub18_Sub1_1.method3122();
				Static146.aBoolean190 = Static63.aClass1_Sub18_Sub1_1.method3122() == 1;
				Static155.aBoolean216 = Static63.aClass1_Sub18_Sub1_1.method3122() == 1;
				Static163.aBoolean350 = Static63.aClass1_Sub18_Sub1_1.method3122() == 1;
				Static49.aBoolean89 = Static63.aClass1_Sub18_Sub1_1.method3122() == 1;
				Static27.aBoolean52 = Static63.aClass1_Sub18_Sub1_1.method3122() == 1;
				Static216.anInt4446 = Static63.aClass1_Sub18_Sub1_1.method3107();
				Static169.aBoolean235 = Static63.aClass1_Sub18_Sub1_1.method3122() == 1;
				Static77.aBoolean118 = Static63.aClass1_Sub18_Sub1_1.method3122() == 1;
				Static25.method2384(Static77.aBoolean118);
				Static222.method3548(Static77.aBoolean118);
				if (!Static149.aBoolean196) {
					if (Static146.aBoolean190 && !Static163.aBoolean350 || Static169.aBoolean235) {
						try {
							Static301.method946("zap", Static13.aClass84_3.anApplet1);
						} catch (@Pc(928) Throwable local928) {
						}
					} else {
						try {
							Static301.method946("unzap", Static13.aClass84_3.anApplet1);
						} catch (@Pc(918) Throwable local918) {
						}
					}
				}
				try {
					Static301.method946("loggedin", Static13.aClass84_3.anApplet1);
				} catch (@Pc(936) Throwable local936) {
				}
				Static221.anInt4611 = Static63.aClass1_Sub18_Sub1_1.method3128();
				Static292.anInt5802 = Static63.aClass1_Sub18_Sub1_1.method3107();
				Static224.anInt4701 = 9;
			}
			if (Static224.anInt4701 == 9) {
				if (Static155.aClass73_3.method1687() < Static292.anInt5802) {
					return;
				}
				Static63.aClass1_Sub18_Sub1_1.anInt3911 = 0;
				Static155.aClass73_3.method1689(Static292.anInt5802, Static63.aClass1_Sub18_Sub1_1.aByteArray71, 0);
				Static170.anInt3132 = 2;
				Static224.anInt4701 = 0;
				Static296.method4527();
				Static75.anInt1495 = -1;
				Static44.method816(false);
				Static221.anInt4611 = -1;
				return;
			}
		} catch (@Pc(992) IOException local992) {
			if (Static155.aClass73_3 != null) {
				Static155.aClass73_3.method1691();
				Static155.aClass73_3 = null;
			}
			if (Static276.anInt5535 < 1) {
				Static224.anInt4701 = 1;
				if (Static89.anInt1687 == Static52.anInt1108) {
					Static52.anInt1108 = Static254.anInt5889;
				} else {
					Static52.anInt1108 = Static89.anInt1687;
				}
				Static65.anInt1318 = 0;
				Static276.anInt5535++;
			} else {
				Static170.anInt3132 = -4;
				Static224.anInt4701 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lclient!ng;")
	public static Class120 method4458(@OriginalArg(0) int arg0) {
		@Pc(10) Class120 local10 = (Class120) Static163.aClass31_35.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static2.aClass7_5.method253(Static197.method3005(arg0), Static260.method4021(arg0));
		local10 = new Class120();
		local10.anInt3282 = arg0;
		if (local27 != null) {
			local10.method2672(new Class1_Sub18(local27));
		}
		local10.method2669();
		if (local10.anInt3302 != -1) {
			local10.method2679(method4458(local10.anInt3308), method4458(local10.anInt3302));
		}
		if (local10.anInt3314 != -1) {
			local10.method2681(method4458(local10.anInt3293), method4458(local10.anInt3314));
		}
		if (!Static98.aBoolean137 && local10.aBoolean246) {
			local10.anInt3277 = 0;
			local10.aStringArray16 = Static260.aStringArray30;
			local10.aBoolean245 = false;
			local10.aString113 = Static288.aString186;
			local10.aStringArray15 = Static32.aStringArray4;
		}
		Static163.aClass31_35.method851(local10, (long) arg0);
		return local10;
	}
}

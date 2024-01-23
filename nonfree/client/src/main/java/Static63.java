import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
	public static int anInt1254;

	@OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
	public static int anInt1256;

	@OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
	public static int anInt1263;

	@OriginalMember(owner = "client!fh", name = "lb", descriptor = "Lclient!pa;")
	public static Class86 aClass86_24;

	@OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
	public static int anInt1255 = -1;

	@OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
	public static int anInt1260 = 0;

	@OriginalMember(owner = "client!fh", name = "cb", descriptor = "[[I")
	private static int[][] anIntArrayArray7 = new int[5][5000];

	@OriginalMember(owner = "client!fh", name = "db", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array28 = new Class50[1000];

	@OriginalMember(owner = "client!fh", name = "gb", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
	public static int anInt1265 = 0;

	@OriginalMember(owner = "client!fh", name = "mb", descriptor = "[I")
	public static int[] anIntArray102 = new int[2000];

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V")
	public static void method969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static183.aBoolean171 = true;
		Static112.anInt2215 = arg0;
		Static58.anInt1157 = arg1;
		Static145.anInt2964 = arg2;
		Static218.anInt3570 = -1;
		anInt1255 = -1;
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)V")
	public static void method970() {
		Static170.aClass84_30.method2576();
		Static199.aClass84_32.method2576();
		Static201.aClass84_34.method2576();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!pa;Lclient!pa;)V")
	public static void method971(@OriginalArg(1) Class86 arg0, @OriginalArg(2) Class86 arg1) {
		Static94.aClass86_85 = arg1;
		Static188.aClass86_72 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZ)V")
	public static void method972(@OriginalArg(1) boolean arg0) {
		Static140.aBoolean123 = arg0;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(35) int local35;
		@Pc(123) int local123;
		@Pc(127) int local127;
		@Pc(154) int local154;
		@Pc(158) int local158;
		@Pc(162) int local162;
		if (!Static140.aBoolean123) {
			local13 = Static97.aClass1_Sub17_Sub1_2.method2134();
			local20 = (Static217.anInt4289 - Static97.aClass1_Sub17_Sub1_2.anInt2656) / 16;
			Static24.anIntArrayArray5 = new int[local20][4];
			for (local24 = 0; local24 < local20; local24++) {
				for (local28 = 0; local28 < 4; local28++) {
					Static24.anIntArrayArray5[local24][local28] = Static97.aClass1_Sub17_Sub1_2.method2159();
				}
			}
			local28 = Static97.aClass1_Sub17_Sub1_2.method2178();
			local35 = Static97.aClass1_Sub17_Sub1_2.method2129();
			local123 = Static97.aClass1_Sub17_Sub1_2.method2131();
			local127 = Static97.aClass1_Sub17_Sub1_2.method2134();
			Static6.aByteArrayArray1 = new byte[local20][];
			Static99.anIntArray520 = new int[local20];
			Static77.anIntArray126 = null;
			Static64.aByteArrayArray3 = new byte[local20][];
			Static103.anIntArray197 = new int[local20];
			Static87.aByteArrayArray6 = null;
			Static16.anIntArray34 = new int[local20];
			@Pc(408) boolean local408 = false;
			local20 = 0;
			if ((local123 / 8 == 48 || local123 / 8 == 49) && (local13 / 8) == 48) {
				local408 = true;
			}
			if (local123 / 8 == 48 && local13 / 8 == 148) {
				local408 = true;
			}
			for (local154 = (local123 - 6) / 8; local154 <= (local123 + 6) / 8; local154++) {
				for (local158 = (local13 - 6) / 8; local158 <= (local13 + 6) / 8; local158++) {
					local162 = local158 + (local154 << 8);
					if (local408 && (local158 == 49 || local158 == 149 || local158 == 147 || local154 == 50 || local154 == 49 && local158 == 47)) {
						Static103.anIntArray197[local20] = local162;
						Static99.anIntArray520[local20] = -1;
						Static16.anIntArray34[local20] = -1;
					} else {
						Static103.anIntArray197[local20] = local162;
						Static99.anIntArray520[local20] = Static136.aClass86_Sub1_16.method3336(Static17.method257(new Class50[] { Static183.aClass50_1235, Static160.method2684(local154), Static198.aClass50_1293, Static160.method2684(local158) }));
						Static16.anIntArray34[local20] = Static136.aClass86_Sub1_16.method3336(Static17.method257(new Class50[] { Static122.aClass50_832, Static160.method2684(local154), Static198.aClass50_1293, Static160.method2684(local158) }));
					}
					local20++;
				}
			}
			Static2.method45(local127, local13, local28, local35, local123);
			return;
		}
		local13 = Static97.aClass1_Sub17_Sub1_2.method2178();
		Static97.aClass1_Sub17_Sub1_2.method2189();
		for (local20 = 0; local20 < 4; local20++) {
			for (local24 = 0; local24 < 13; local24++) {
				for (local28 = 0; local28 < 13; local28++) {
					local35 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
					if (local35 == 1) {
						Static7.anIntArrayArrayArray3[local20][local24][local28] = Static97.aClass1_Sub17_Sub1_2.method2181(26);
					} else {
						Static7.anIntArrayArrayArray3[local20][local24][local28] = -1;
					}
				}
			}
		}
		Static97.aClass1_Sub17_Sub1_2.method2188();
		local24 = (Static217.anInt4289 - Static97.aClass1_Sub17_Sub1_2.anInt2656) / 16;
		Static24.anIntArrayArray5 = new int[local24][4];
		for (local28 = 0; local28 < local24; local28++) {
			for (local35 = 0; local35 < 4; local35++) {
				Static24.anIntArrayArray5[local28][local35] = Static97.aClass1_Sub17_Sub1_2.method2123();
			}
		}
		local35 = Static97.aClass1_Sub17_Sub1_2.method2178();
		local123 = Static97.aClass1_Sub17_Sub1_2.method2178();
		local127 = Static97.aClass1_Sub17_Sub1_2.method2131();
		@Pc(131) int local131 = Static97.aClass1_Sub17_Sub1_2.method2128();
		Static103.anIntArray197 = new int[local24];
		Static87.aByteArrayArray6 = null;
		Static64.aByteArrayArray3 = new byte[local24][];
		Static6.aByteArrayArray1 = new byte[local24][];
		Static99.anIntArray520 = new int[local24];
		Static77.anIntArray126 = null;
		Static16.anIntArray34 = new int[local24];
		local24 = 0;
		for (local154 = 0; local154 < 4; local154++) {
			for (local158 = 0; local158 < 13; local158++) {
				for (local162 = 0; local162 < 13; local162++) {
					@Pc(172) int local172 = Static7.anIntArrayArrayArray3[local154][local158][local162];
					if (local172 != -1) {
						@Pc(182) int local182 = local172 >> 14 & 0x3FF;
						@Pc(188) int local188 = local172 >> 3 & 0x7FF;
						@Pc(198) int local198 = local188 / 8 + (local182 / 8 << 8);
						for (@Pc(200) int local200 = 0; local200 < local24; local200++) {
							if (Static103.anIntArray197[local200] == local198) {
								local198 = -1;
								break;
							}
						}
						if (local198 != -1) {
							Static103.anIntArray197[local24] = local198;
							@Pc(236) int local236 = local198 >> 8 & 0xFF;
							@Pc(240) int local240 = local198 & 0xFF;
							Static99.anIntArray520[local24] = Static136.aClass86_Sub1_16.method3336(Static17.method257(new Class50[] { Static183.aClass50_1235, Static160.method2684(local236), Static198.aClass50_1293, Static160.method2684(local240) }));
							Static16.anIntArray34[local24] = Static136.aClass86_Sub1_16.method3336(Static17.method257(new Class50[] { Static122.aClass50_832, Static160.method2684(local236), Static198.aClass50_1293, Static160.method2684(local240) }));
							local24++;
						}
					}
				}
			}
		}
		Static2.method45(local123, local13, local127, local131, local35);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!wb;IZ)V")
	public static void method973(@OriginalArg(0) Class1_Sub29 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Object[] local4 = arg0.anObjectArray33;
		@Pc(14) int local14 = (Integer) local4[0];
		@Pc(18) Class1_Sub1_Sub1 local18 = Static229.method3480(local14);
		if (local18 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		Static163.anInt3371 = 0;
		@Pc(27) int local27 = 0;
		@Pc(30) int[] local30 = local18.anIntArray8;
		@Pc(32) int local32 = -1;
		@Pc(35) int[] local35 = local18.anIntArray9;
		@Pc(37) byte local37 = -1;
		@Pc(51) int local51;
		@Pc(64) int local64;
		try {
			Static218.anIntArray383 = new int[local18.anInt36];
			Static142.aClass50Array55 = new Class50[local18.anInt37];
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			for (local51 = 1; local51 < local4.length; local51++) {
				if (local4[local51] instanceof Integer) {
					local64 = (Integer) local4[local51];
					if (local64 == -2147483647) {
						local64 = arg0.anInt4353;
					}
					if (local64 == -2147483646) {
						local64 = arg0.anInt4357;
					}
					if (local64 == -2147483645) {
						local64 = arg0.aClass93_119 == null ? -1 : arg0.aClass93_119.anInt3603;
					}
					if (local64 == -2147483644) {
						local64 = arg0.anInt4350;
					}
					if (local64 == -2147483643) {
						local64 = arg0.aClass93_119 == null ? -1 : arg0.aClass93_119.anInt3614;
					}
					if (local64 == -2147483642) {
						local64 = arg0.aClass93_120 == null ? -1 : arg0.aClass93_120.anInt3603;
					}
					if (local64 == -2147483641) {
						local64 = arg0.aClass93_120 == null ? -1 : arg0.aClass93_120.anInt3614;
					}
					if (local64 == -2147483640) {
						local64 = arg0.anInt4356;
					}
					if (local64 == -2147483639) {
						local64 = arg0.anInt4355;
					}
					Static218.anIntArray383[local49++] = local64;
				} else if (local4[local51] instanceof Class50) {
					@Pc(169) Class50 local169 = (Class50) local4[local51];
					if (local169.method1236(Static207.aClass50_1325)) {
						local169 = arg0.aClass50_1377;
					}
					Static142.aClass50Array55[local47++] = local169;
				}
			}
			local64 = 0;
			label3375: while (true) {
				local64++;
				if (arg1 < local64) {
					throw new RuntimeException("slow");
				}
				local32++;
				@Pc(211) int local211 = local30[local32];
				@Pc(781) int local781;
				@Pc(775) int local775;
				@Pc(614) int local614;
				@Pc(640) int local640;
				@Pc(568) Class50 local568;
				if (local211 < 100) {
					if (local211 == 0) {
						Static225.anIntArray502[local23++] = local35[local32];
						continue;
					}
					@Pc(234) int local234;
					if (local211 == 1) {
						local234 = local35[local32];
						Static225.anIntArray502[local23++] = Static24.anIntArray49[local234];
						continue;
					}
					if (local211 == 2) {
						local234 = local35[local32];
						local23--;
						Static209.method3278(Static225.anIntArray502[local23], local234);
						continue;
					}
					if (local211 == 3) {
						Static73.aClass50Array63[local27++] = local18.aClass50Array1[local32];
						continue;
					}
					if (local211 == 6) {
						local32 += local35[local32];
						continue;
					}
					if (local211 == 7) {
						local23 -= 2;
						if (Static225.anIntArray502[local23] != Static225.anIntArray502[local23 + 1]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local211 == 8) {
						local23 -= 2;
						if (Static225.anIntArray502[local23 + 1] == Static225.anIntArray502[local23]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local211 == 9) {
						local23 -= 2;
						if (Static225.anIntArray502[local23 + 1] > Static225.anIntArray502[local23]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local211 == 10) {
						local23 -= 2;
						if (Static225.anIntArray502[local23] > Static225.anIntArray502[local23 + 1]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local211 == 21) {
						if (Static163.anInt3371 == 0) {
							return;
						}
						@Pc(397) Class2 local397 = Static230.aClass2Array2[--Static163.anInt3371];
						local32 = local397.anInt62;
						Static218.anIntArray383 = local397.anIntArray13;
						local18 = local397.aClass1_Sub1_Sub1_1;
						Static142.aClass50Array55 = local397.aClass50Array2;
						local30 = local18.anIntArray8;
						local35 = local18.anIntArray9;
						continue;
					}
					if (local211 == 25) {
						local234 = local35[local32];
						Static225.anIntArray502[local23++] = Static53.method804(local234);
						continue;
					}
					if (local211 == 27) {
						local234 = local35[local32];
						local23--;
						Static190.method3130(local234, Static225.anIntArray502[local23]);
						continue;
					}
					if (local211 == 31) {
						local23 -= 2;
						if (Static225.anIntArray502[local23 + 1] >= Static225.anIntArray502[local23]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local211 == 32) {
						local23 -= 2;
						if (Static225.anIntArray502[local23] >= Static225.anIntArray502[local23 + 1]) {
							local32 += local35[local32];
						}
						continue;
					}
					if (local211 == 33) {
						Static225.anIntArray502[local23++] = Static218.anIntArray383[local35[local32]];
						continue;
					}
					@Pc(516) int local516;
					if (local211 == 34) {
						local516 = local35[local32];
						local23--;
						Static218.anIntArray383[local516] = Static225.anIntArray502[local23];
						continue;
					}
					if (local211 == 35) {
						Static73.aClass50Array63[local27++] = Static142.aClass50Array55[local35[local32]];
						continue;
					}
					if (local211 == 36) {
						local516 = local35[local32];
						local27--;
						Static142.aClass50Array55[local516] = Static73.aClass50Array63[local27];
						continue;
					}
					if (local211 == 37) {
						local234 = local35[local32];
						local27 -= local234;
						local568 = Static49.method775(local27, Static73.aClass50Array63, local234);
						Static73.aClass50Array63[local27++] = local568;
						continue;
					}
					if (local211 == 38) {
						local23--;
						continue;
					}
					if (local211 == 39) {
						local27--;
						continue;
					}
					if (local211 == 40) {
						local234 = local35[local32];
						@Pc(604) Class1_Sub1_Sub1 local604 = Static229.method3480(local234);
						@Pc(608) Class50[] local608 = new Class50[local604.anInt37];
						@Pc(612) int[] local612 = new int[local604.anInt36];
						for (local614 = 0; local614 < local604.anInt38; local614++) {
							local612[local614] = Static225.anIntArray502[local23 + local614 - local604.anInt38];
						}
						for (local640 = 0; local640 < local604.anInt34; local640++) {
							local608[local640] = Static73.aClass50Array63[local27 + local640 - local604.anInt34];
						}
						local27 -= local604.anInt34;
						local23 -= local604.anInt38;
						@Pc(678) Class2 local678 = new Class2();
						local678.aClass1_Sub1_Sub1_1 = local18;
						local678.anIntArray13 = Static218.anIntArray383;
						local678.aClass50Array2 = Static142.aClass50Array55;
						local678.anInt62 = local32;
						if (Static230.aClass2Array2.length <= Static163.anInt3371) {
							throw new RuntimeException();
						}
						Static230.aClass2Array2[Static163.anInt3371++] = local678;
						Static218.anIntArray383 = local612;
						Static142.aClass50Array55 = local608;
						local32 = -1;
						local18 = local604;
						local35 = local604.anIntArray9;
						local30 = local604.anIntArray8;
						continue;
					}
					if (local211 == 42) {
						Static225.anIntArray502[local23++] = anIntArray102[local35[local32]];
						continue;
					}
					if (local211 == 43) {
						local234 = local35[local32];
						local23--;
						anIntArray102[local234] = Static225.anIntArray502[local23];
						Static165.method2130(local234);
						continue;
					}
					if (local211 == 44) {
						local234 = local35[local32] >> 16;
						local23--;
						local775 = Static225.anIntArray502[local23];
						local781 = local35[local32] & 0xFFFF;
						if (local775 >= 0 && local775 <= 5000) {
							Static182.anIntArray426[local234] = local775;
							@Pc(799) byte local799 = -1;
							if (local781 == 105) {
								local799 = 0;
							}
							local614 = 0;
							while (true) {
								if (local775 <= local614) {
									continue label3375;
								}
								anIntArrayArray7[local234][local614] = local799;
								local614++;
							}
						}
						throw new RuntimeException();
					}
					if (local211 == 45) {
						local234 = local35[local32];
						local23--;
						local781 = Static225.anIntArray502[local23];
						if (local781 >= 0 && Static182.anIntArray426[local234] > local781) {
							Static225.anIntArray502[local23++] = anIntArrayArray7[local234][local781];
							continue;
						}
						throw new RuntimeException();
					}
					if (local211 == 46) {
						local234 = local35[local32];
						local23 -= 2;
						local781 = Static225.anIntArray502[local23];
						if (local781 >= 0 && Static182.anIntArray426[local234] > local781) {
							anIntArrayArray7[local234][local781] = Static225.anIntArray502[local23 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local211 == 47) {
						@Pc(906) Class50 local906 = aClass50Array28[local35[local32]];
						if (local906 == null) {
							local906 = Static16.aClass50_130;
						}
						Static73.aClass50Array63[local27++] = local906;
						continue;
					}
					if (local211 == 48) {
						local234 = local35[local32];
						local27--;
						aClass50Array28[local234] = Static73.aClass50Array63[local27];
						Static36.method581(local234);
						continue;
					}
					if (local211 == 51) {
						@Pc(950) Class90 local950 = local18.aClass90Array1[local35[local32]];
						local23--;
						@Pc(960) Class1_Sub5 local960 = (Class1_Sub5) local950.method2819((long) Static225.anIntArray502[local23]);
						if (local960 != null) {
							local32 += local960.anInt409;
						}
						continue;
					}
				}
				@Pc(976) boolean local976;
				if (local35[local32] == 1) {
					local976 = true;
				} else {
					local976 = false;
				}
				@Pc(11259) Class93 local11259;
				@Pc(11230) Class93 local11230;
				@Pc(2173) int local2173;
				@Pc(1017) Class93 local1017;
				@Pc(1057) int local1057;
				if (local211 < 300) {
					if (local211 == 100) {
						local23 -= 3;
						local781 = Static225.anIntArray502[local23];
						local775 = Static225.anIntArray502[local23 + 1];
						local1057 = Static225.anIntArray502[local23 + 2];
						if (local775 == 0) {
							throw new RuntimeException();
						}
						local11230 = Static164.method2725(local781);
						if (local11230.aClass93Array1 == null) {
							local11230.aClass93Array1 = new Class93[local1057 + 1];
						}
						if (local1057 >= local11230.aClass93Array1.length) {
							@Pc(11774) Class93[] local11774 = new Class93[local1057 + 1];
							for (local2173 = 0; local2173 < local11230.aClass93Array1.length; local2173++) {
								local11774[local2173] = local11230.aClass93Array1[local2173];
							}
							local11230.aClass93Array1 = local11774;
						}
						if (local1057 > 0 && local11230.aClass93Array1[local1057 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1057 - 1));
						}
						@Pc(11827) Class93 local11827 = new Class93();
						local11827.anInt3660 = local11827.anInt3603 = local11230.anInt3603;
						local11827.aBoolean156 = true;
						local11827.anInt3656 = local775;
						local11827.anInt3614 = local1057;
						local11230.aClass93Array1[local1057] = local11827;
						if (local976) {
							Static6.aClass93_5 = local11827;
						} else {
							Static228.aClass93_122 = local11827;
						}
						Static66.method999(local11230);
						continue;
					}
					@Pc(11894) Class93 local11894;
					if (local211 == 101) {
						local1017 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
						if (local1017.anInt3614 == -1) {
							if (local976) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local11894 = Static164.method2725(local1017.anInt3603);
						local11894.aClass93Array1[local1017.anInt3614] = null;
						Static66.method999(local11894);
						continue;
					}
					if (local211 == 102) {
						local23--;
						local1017 = Static164.method2725(Static225.anIntArray502[local23]);
						local1017.aClass93Array1 = null;
						Static66.method999(local1017);
						continue;
					}
					if (local211 == 200) {
						local23 -= 2;
						local781 = Static225.anIntArray502[local23];
						local775 = Static225.anIntArray502[local23 + 1];
						local11259 = Static186.method3524(local775, local781);
						if (local11259 != null && local775 != -1) {
							Static225.anIntArray502[local23++] = 1;
							if (local976) {
								Static6.aClass93_5 = local11259;
							} else {
								Static228.aClass93_122 = local11259;
							}
							continue;
						}
						Static225.anIntArray502[local23++] = 0;
						continue;
					}
					if (local211 == 201) {
						local23--;
						local781 = Static225.anIntArray502[local23];
						local11894 = Static164.method2725(local781);
						if (local11894 == null) {
							Static225.anIntArray502[local23++] = 0;
						} else {
							Static225.anIntArray502[local23++] = 1;
							if (local976) {
								Static6.aClass93_5 = local11894;
							} else {
								Static228.aClass93_122 = local11894;
							}
						}
						continue;
					}
				} else if (local211 < 500) {
					if (local211 == 403) {
						local23 -= 2;
						local781 = Static225.anIntArray502[local23];
						if (local781 >= 7) {
							local781 -= 7;
						}
						local775 = Static225.anIntArray502[local23 + 1];
						Static230.aClass20_Sub3_Sub1_3.aClass25_2.method762(local775, local781);
						continue;
					}
					if (local211 == 404) {
						local23 -= 2;
						local775 = Static225.anIntArray502[local23 + 1];
						local781 = Static225.anIntArray502[local23];
						Static230.aClass20_Sub3_Sub1_3.aClass25_2.method771(local781, local775);
						continue;
					}
					if (local211 == 410) {
						local23--;
						@Pc(11716) boolean local11716 = Static225.anIntArray502[local23] != 0;
						Static230.aClass20_Sub3_Sub1_3.aClass25_2.method768(local11716);
						continue;
					}
				} else {
					@Pc(1200) boolean local1200;
					if (local211 >= 1000 && local211 < 1100 || local211 >= 2000 && local211 < 2100) {
						if (local211 < 2000) {
							local1017 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
						} else {
							local23--;
							local1017 = Static164.method2725(Static225.anIntArray502[local23]);
							local211 -= 1000;
						}
						if (local211 == 1000) {
							local23 -= 4;
							local1017.anInt3657 = Static225.anIntArray502[local23];
							local1017.anInt3590 = Static225.anIntArray502[local23 + 1];
							local775 = Static225.anIntArray502[local23 + 2];
							local1057 = Static225.anIntArray502[local23 + 3];
							if (local1057 < 0) {
								local1057 = 0;
							} else if (local1057 > 5) {
								local1057 = 5;
							}
							if (local775 < 0) {
								local775 = 0;
							} else if (local775 > 5) {
								local775 = 5;
							}
							local1017.aByte11 = (byte) local1057;
							local1017.aByte9 = (byte) local775;
							Static66.method999(local1017);
							Static87.method1367(local1017);
							continue;
						}
						if (local211 == 1001) {
							local23 -= 4;
							local1017.anInt3669 = Static225.anIntArray502[local23];
							local1017.anInt3640 = Static225.anIntArray502[local23 + 1];
							local1017.anInt3664 = 0;
							local1017.anInt3604 = 0;
							local775 = Static225.anIntArray502[local23 + 2];
							if (local775 < 0) {
								local775 = 0;
							} else if (local775 > 4) {
								local775 = 4;
							}
							local1057 = Static225.anIntArray502[local23 + 3];
							if (local1057 < 0) {
								local1057 = 0;
							} else if (local1057 > 4) {
								local1057 = 4;
							}
							local1017.aByte8 = (byte) local775;
							local1017.aByte10 = (byte) local1057;
							Static66.method999(local1017);
							if (local1017.anInt3656 == 0) {
								Static71.method1029(local1017, false);
							}
							Static87.method1367(local1017);
							continue;
						}
						if (local211 == 1003) {
							local23--;
							local1200 = Static225.anIntArray502[local23] == 1;
							if (local1017.aBoolean165 != local1200) {
								local1017.aBoolean165 = local1200;
								Static66.method999(local1017);
							}
							continue;
						}
						if (local211 == 1004) {
							local23 -= 2;
							local1017.anInt3596 = Static225.anIntArray502[local23];
							local1017.anInt3666 = Static225.anIntArray502[local23 + 1];
							Static66.method999(local1017);
							if (local1017.anInt3656 == 0) {
								Static71.method1029(local1017, false);
							}
							Static87.method1367(local1017);
							continue;
						}
					} else {
						@Pc(1594) Class50 local1594;
						if (local211 >= 1100 && local211 < 1200 || !(local211 < 2100 || local211 >= 2200)) {
							if (local211 >= 2000) {
								local211 -= 1000;
								local23--;
								local1017 = Static164.method2725(Static225.anIntArray502[local23]);
							} else {
								local1017 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
							}
							if (local211 == 1100) {
								local23 -= 2;
								local1017.anInt3653 = Static225.anIntArray502[local23];
								if (local1017.anInt3653 > local1017.anInt3628 - local1017.anInt3600) {
									local1017.anInt3653 = local1017.anInt3628 - local1017.anInt3600;
								}
								if (local1017.anInt3653 < 0) {
									local1017.anInt3653 = 0;
								}
								local1017.anInt3608 = Static225.anIntArray502[local23 + 1];
								if (local1017.anInt3608 > local1017.anInt3587 - local1017.anInt3620) {
									local1017.anInt3608 = local1017.anInt3587 - local1017.anInt3620;
								}
								if (local1017.anInt3608 < 0) {
									local1017.anInt3608 = 0;
								}
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1101) {
								local23--;
								local1017.anInt3591 = Static225.anIntArray502[local23];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1102) {
								local23--;
								local1017.aBoolean164 = Static225.anIntArray502[local23] == 1;
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1103) {
								local23--;
								local1017.anInt3610 = Static225.anIntArray502[local23];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1104) {
								local23--;
								local1017.anInt3675 = Static225.anIntArray502[local23];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1105) {
								local23--;
								local1017.anInt3676 = Static225.anIntArray502[local23];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1106) {
								local23--;
								local1017.anInt3652 = Static225.anIntArray502[local23];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1107) {
								local23--;
								local1017.aBoolean162 = Static225.anIntArray502[local23] == 1;
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1108) {
								local1017.anInt3615 = 1;
								local23--;
								local1017.anInt3632 = Static225.anIntArray502[local23];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1109) {
								local23 -= 6;
								local1017.anInt3612 = Static225.anIntArray502[local23];
								local1017.anInt3665 = Static225.anIntArray502[local23 + 1];
								local1017.anInt3607 = Static225.anIntArray502[local23 + 2];
								local1017.anInt3624 = Static225.anIntArray502[local23 + 3];
								local1017.anInt3674 = Static225.anIntArray502[local23 + 4];
								local1017.anInt3627 = Static225.anIntArray502[local23 + 5];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1110) {
								local23--;
								local775 = Static225.anIntArray502[local23];
								if (local1017.anInt3606 != local775) {
									local1017.anInt3636 = 0;
									local1017.anInt3654 = 0;
									local1017.anInt3606 = local775;
									Static66.method999(local1017);
								}
								continue;
							}
							if (local211 == 1111) {
								local23--;
								local1017.aBoolean159 = Static225.anIntArray502[local23] == 1;
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1112) {
								local27--;
								local1594 = Static73.aClass50Array63[local27];
								if (!local1594.method1236(local1017.aClass50_1188)) {
									local1017.aClass50_1188 = local1594;
									Static66.method999(local1017);
								}
								continue;
							}
							if (local211 == 1113) {
								local23--;
								local1017.anInt3639 = Static225.anIntArray502[local23];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1114) {
								local23 -= 3;
								local1017.anInt3616 = Static225.anIntArray502[local23];
								local1017.anInt3617 = Static225.anIntArray502[local23 + 1];
								local1017.anInt3625 = Static225.anIntArray502[local23 + 2];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1115) {
								local23--;
								local1017.aBoolean157 = Static225.anIntArray502[local23] == 1;
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1116) {
								local23--;
								local1017.anInt3651 = Static225.anIntArray502[local23];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1117) {
								local23--;
								local1017.anInt3659 = Static225.anIntArray502[local23];
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1118) {
								local23--;
								local1017.aBoolean166 = Static225.anIntArray502[local23] == 1;
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1119) {
								local23--;
								local1017.aBoolean167 = Static225.anIntArray502[local23] == 1;
								Static66.method999(local1017);
								continue;
							}
							if (local211 == 1120) {
								local23 -= 2;
								local1017.anInt3628 = Static225.anIntArray502[local23];
								local1017.anInt3587 = Static225.anIntArray502[local23 + 1];
								Static66.method999(local1017);
								if (local1017.anInt3656 == 0) {
									Static71.method1029(local1017, false);
								}
								continue;
							}
							if (local211 == 1121) {
								Static66.method999(local1017);
								local23 -= 2;
								continue;
							}
							if (local211 == 1122) {
								local23--;
								local1017.aBoolean163 = Static225.anIntArray502[local23] == 1;
								Static66.method999(local1017);
								continue;
							}
						} else if (local211 >= 1200 && local211 < 1300 || !(local211 < 2200 || local211 >= 2300)) {
							if (local211 >= 2000) {
								local211 -= 1000;
								local23--;
								local1017 = Static164.method2725(Static225.anIntArray502[local23]);
							} else {
								local1017 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
							}
							Static66.method999(local1017);
							if (local211 == 1200 || local211 == 1205) {
								local23 -= 2;
								local1057 = Static225.anIntArray502[local23 + 1];
								local775 = Static225.anIntArray502[local23];
								if (local775 == -1) {
									local1017.anInt3632 = -1;
									local1017.anInt3615 = 1;
									local1017.anInt3595 = -1;
								} else {
									local1017.anInt3595 = local775;
									local1017.anInt3623 = local1057;
									@Pc(1878) Class70 local1878 = Static16.method227(local775);
									if (local211 == 1205) {
										local1017.aBoolean161 = false;
									} else {
										local1017.aBoolean161 = true;
									}
									local1017.anInt3607 = local1878.anInt2446;
									local1017.anInt3612 = local1878.anInt2436;
									local1017.anInt3674 = local1878.anInt2452;
									local1017.anInt3624 = local1878.anInt2410;
									local1017.anInt3627 = local1878.anInt2451;
									if (local1017.anInt3604 > 0) {
										local1017.anInt3627 = local1017.anInt3627 * 32 / local1017.anInt3604;
									} else if (local1017.anInt3669 > 0) {
										local1017.anInt3627 = local1017.anInt3627 * 32 / local1017.anInt3669;
									}
									local1017.anInt3665 = local1878.anInt2427;
								}
								continue;
							}
							if (local211 == 1201) {
								local1017.anInt3615 = 2;
								local23--;
								local1017.anInt3632 = Static225.anIntArray502[local23];
								continue;
							}
							if (local211 == 1202) {
								local1017.anInt3615 = 3;
								local1017.anInt3632 = Static230.aClass20_Sub3_Sub1_3.aClass25_2.method772();
								continue;
							}
							if (local211 == 1203) {
								local1017.anInt3615 = 6;
								local23--;
								local1017.anInt3632 = Static225.anIntArray502[local23];
								continue;
							}
							if (local211 == 1204) {
								local1017.anInt3615 = 5;
								local23--;
								local1017.anInt3632 = Static225.anIntArray502[local23];
								continue;
							}
						} else if (local211 >= 1300 && local211 < 1400 || local211 >= 2300 && local211 < 2400) {
							if (local211 >= 2000) {
								local23--;
								local1017 = Static164.method2725(Static225.anIntArray502[local23]);
								local211 -= 1000;
							} else {
								local1017 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
							}
							if (local211 == 1300) {
								local23--;
								local775 = Static225.anIntArray502[local23] - 1;
								if (local775 >= 0 && local775 <= 9) {
									local27--;
									local1017.method2901(Static73.aClass50Array63[local27], local775);
									continue;
								}
								local27--;
								continue;
							}
							if (local211 == 1301) {
								local23 -= 2;
								local775 = Static225.anIntArray502[local23];
								local1057 = Static225.anIntArray502[local23 + 1];
								local1017.aClass93_105 = Static186.method3524(local1057, local775);
								continue;
							}
							if (local211 == 1302) {
								local23--;
								local1017.aBoolean158 = Static225.anIntArray502[local23] == 1;
								continue;
							}
							if (local211 == 1303) {
								local23--;
								local1017.anInt3648 = Static225.anIntArray502[local23];
								continue;
							}
							if (local211 == 1304) {
								local23--;
								local1017.anInt3630 = Static225.anIntArray502[local23];
								continue;
							}
							if (local211 == 1305) {
								local27--;
								local1017.aClass50_1197 = Static73.aClass50Array63[local27];
								continue;
							}
							if (local211 == 1306) {
								local27--;
								local1017.aClass50_1190 = Static73.aClass50Array63[local27];
								continue;
							}
							if (local211 == 1307) {
								local1017.aClass50Array69 = null;
								continue;
							}
						} else {
							if (local211 >= 1400 && local211 < 1500 || local211 >= 2400 && local211 < 2500) {
								if (local211 < 2000) {
									local1017 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
								} else {
									local211 -= 1000;
									local23--;
									local1017 = Static164.method2725(Static225.anIntArray502[local23]);
								}
								@Pc(2061) int[] local2061 = null;
								local27--;
								local1594 = Static73.aClass50Array63[local27];
								if (local1594.method1249() > 0 && local1594.method1241(local1594.method1249() - 1) == 89) {
									local23--;
									local614 = Static225.anIntArray502[local23];
									if (local614 > 0) {
										local2061 = new int[local614];
										while (local614-- > 0) {
											local23--;
											local2061[local614] = Static225.anIntArray502[local23];
										}
									}
									local1594 = local1594.method1216(local1594.method1249() - 1, 0);
								}
								@Pc(2128) Object[] local2128 = new Object[local1594.method1249() + 1];
								for (local640 = local2128.length - 1; local640 >= 1; local640--) {
									if (local1594.method1241(local640 - 1) == 115) {
										local27--;
										local2128[local640] = Static73.aClass50Array63[local27];
									} else {
										local23--;
										local2128[local640] = Integer.valueOf(Static225.anIntArray502[local23]);
									}
								}
								local23--;
								local2173 = Static225.anIntArray502[local23];
								if (local2173 == -1) {
									local2128 = null;
								} else {
									local2128[0] = Integer.valueOf(local2173);
								}
								local1017.aBoolean155 = true;
								if (local211 == 1400) {
									local1017.anObjectArray8 = local2128;
								} else if (local211 == 1401) {
									local1017.anObjectArray6 = local2128;
								} else if (local211 == 1402) {
									local1017.anObjectArray2 = local2128;
								} else if (local211 == 1403) {
									local1017.anObjectArray7 = local2128;
								} else if (local211 == 1404) {
									local1017.anObjectArray31 = local2128;
								} else if (local211 == 1405) {
									local1017.anObjectArray5 = local2128;
								} else if (local211 == 1406) {
									local1017.anObjectArray10 = local2128;
								} else if (local211 == 1407) {
									local1017.anObjectArray22 = local2128;
									local1017.anIntArray387 = local2061;
								} else if (local211 == 1408) {
									local1017.anObjectArray29 = local2128;
								} else if (local211 == 1409) {
									local1017.anObjectArray12 = local2128;
								} else if (local211 == 1410) {
									local1017.anObjectArray15 = local2128;
								} else if (local211 == 1411) {
									local1017.anObjectArray16 = local2128;
								} else if (local211 == 1412) {
									local1017.anObjectArray21 = local2128;
								} else if (local211 == 1414) {
									local1017.anObjectArray25 = local2128;
									local1017.anIntArray390 = local2061;
								} else if (local211 == 1415) {
									local1017.anIntArray400 = local2061;
									local1017.anObjectArray23 = local2128;
								} else if (local211 == 1416) {
									local1017.anObjectArray11 = local2128;
								} else if (local211 == 1417) {
									local1017.anObjectArray3 = local2128;
								} else if (local211 == 1418) {
									local1017.anObjectArray20 = local2128;
								} else if (local211 == 1419) {
									local1017.anObjectArray26 = local2128;
								} else if (local211 == 1420) {
									local1017.anObjectArray30 = local2128;
								} else if (local211 == 1421) {
									local1017.anObjectArray24 = local2128;
								} else if (local211 == 1422) {
									local1017.anObjectArray18 = local2128;
								} else if (local211 == 1423) {
									local1017.anObjectArray9 = local2128;
								} else if (local211 == 1424) {
									local1017.anObjectArray27 = local2128;
								} else if (local211 == 1425) {
									local1017.anObjectArray28 = local2128;
								} else if (local211 == 1426) {
									local1017.anObjectArray13 = local2128;
								} else if (local211 == 1427) {
									local1017.anObjectArray19 = local2128;
								} else if (local211 == 1428) {
									local1017.anIntArray391 = local2061;
									local1017.anObjectArray4 = local2128;
								} else if (local211 == 1429) {
									local1017.anIntArray393 = local2061;
									local1017.anObjectArray17 = local2128;
								}
								continue;
							}
							if (local211 < 1600) {
								local1017 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
								if (local211 == 1500) {
									Static225.anIntArray502[local23++] = local1017.anInt3631;
									continue;
								}
								if (local211 == 1501) {
									Static225.anIntArray502[local23++] = local1017.anInt3619;
									continue;
								}
								if (local211 == 1502) {
									Static225.anIntArray502[local23++] = local1017.anInt3600;
									continue;
								}
								if (local211 == 1503) {
									Static225.anIntArray502[local23++] = local1017.anInt3620;
									continue;
								}
								if (local211 == 1504) {
									Static225.anIntArray502[local23++] = local1017.aBoolean165 ? 1 : 0;
									continue;
								}
								if (local211 == 1505) {
									Static225.anIntArray502[local23++] = local1017.anInt3660;
									continue;
								}
							} else if (local211 < 1700) {
								local1017 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
								if (local211 == 1600) {
									Static225.anIntArray502[local23++] = local1017.anInt3653;
									continue;
								}
								if (local211 == 1601) {
									Static225.anIntArray502[local23++] = local1017.anInt3608;
									continue;
								}
								if (local211 == 1602) {
									Static73.aClass50Array63[local27++] = local1017.aClass50_1188;
									continue;
								}
								if (local211 == 1603) {
									Static225.anIntArray502[local23++] = local1017.anInt3628;
									continue;
								}
								if (local211 == 1604) {
									Static225.anIntArray502[local23++] = local1017.anInt3587;
									continue;
								}
								if (local211 == 1605) {
									Static225.anIntArray502[local23++] = local1017.anInt3627;
									continue;
								}
								if (local211 == 1606) {
									Static225.anIntArray502[local23++] = local1017.anInt3607;
									continue;
								}
								if (local211 == 1607) {
									Static225.anIntArray502[local23++] = local1017.anInt3674;
									continue;
								}
								if (local211 == 1608) {
									Static225.anIntArray502[local23++] = local1017.anInt3624;
									continue;
								}
								if (local211 == 1609) {
									Static225.anIntArray502[local23++] = local1017.anInt3610;
									continue;
								}
							} else if (local211 < 1800) {
								local1017 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
								if (local211 == 1700) {
									Static225.anIntArray502[local23++] = local1017.anInt3595;
									continue;
								}
								if (local211 == 1701) {
									if (local1017.anInt3595 == -1) {
										Static225.anIntArray502[local23++] = 0;
									} else {
										Static225.anIntArray502[local23++] = local1017.anInt3623;
									}
									continue;
								}
								if (local211 == 1702) {
									Static225.anIntArray502[local23++] = local1017.anInt3614;
									continue;
								}
							} else if (local211 < 1900) {
								local1017 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
								if (local211 == 1800) {
									Static225.anIntArray502[local23++] = Static170.method2810(Static35.method552(local1017));
									continue;
								}
								if (local211 == 1801) {
									local23--;
									local775 = Static225.anIntArray502[local23];
									local775--;
									if (local1017.aClass50Array69 != null && local775 < local1017.aClass50Array69.length && local1017.aClass50Array69[local775] != null) {
										Static73.aClass50Array63[local27++] = local1017.aClass50Array69[local775];
										continue;
									}
									Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									continue;
								}
								if (local211 == 1802) {
									if (local1017.aClass50_1197 == null) {
										Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									} else {
										Static73.aClass50Array63[local27++] = local1017.aClass50_1197;
									}
									continue;
								}
							} else if (local211 < 2600) {
								local23--;
								local1017 = Static164.method2725(Static225.anIntArray502[local23]);
								if (local211 == 2500) {
									Static225.anIntArray502[local23++] = local1017.anInt3631;
									continue;
								}
								if (local211 == 2501) {
									Static225.anIntArray502[local23++] = local1017.anInt3619;
									continue;
								}
								if (local211 == 2502) {
									Static225.anIntArray502[local23++] = local1017.anInt3600;
									continue;
								}
								if (local211 == 2503) {
									Static225.anIntArray502[local23++] = local1017.anInt3620;
									continue;
								}
								if (local211 == 2504) {
									Static225.anIntArray502[local23++] = local1017.aBoolean165 ? 1 : 0;
									continue;
								}
								if (local211 == 2505) {
									Static225.anIntArray502[local23++] = local1017.anInt3660;
									continue;
								}
							} else if (local211 < 2700) {
								local23--;
								local1017 = Static164.method2725(Static225.anIntArray502[local23]);
								if (local211 == 2600) {
									Static225.anIntArray502[local23++] = local1017.anInt3653;
									continue;
								}
								if (local211 == 2601) {
									Static225.anIntArray502[local23++] = local1017.anInt3608;
									continue;
								}
								if (local211 == 2602) {
									Static73.aClass50Array63[local27++] = local1017.aClass50_1188;
									continue;
								}
								if (local211 == 2603) {
									Static225.anIntArray502[local23++] = local1017.anInt3628;
									continue;
								}
								if (local211 == 2604) {
									Static225.anIntArray502[local23++] = local1017.anInt3587;
									continue;
								}
								if (local211 == 2605) {
									Static225.anIntArray502[local23++] = local1017.anInt3627;
									continue;
								}
								if (local211 == 2606) {
									Static225.anIntArray502[local23++] = local1017.anInt3607;
									continue;
								}
								if (local211 == 2607) {
									Static225.anIntArray502[local23++] = local1017.anInt3674;
									continue;
								}
								if (local211 == 2608) {
									Static225.anIntArray502[local23++] = local1017.anInt3624;
									continue;
								}
								if (local211 == 2609) {
									Static225.anIntArray502[local23++] = local1017.anInt3610;
									continue;
								}
							} else if (local211 < 2800) {
								if (local211 == 2700) {
									local23--;
									local1017 = Static164.method2725(Static225.anIntArray502[local23]);
									Static225.anIntArray502[local23++] = local1017.anInt3595;
									continue;
								}
								if (local211 == 2701) {
									local23--;
									local1017 = Static164.method2725(Static225.anIntArray502[local23]);
									if (local1017.anInt3595 == -1) {
										Static225.anIntArray502[local23++] = 0;
									} else {
										Static225.anIntArray502[local23++] = local1017.anInt3623;
									}
									continue;
								}
								if (local211 == 2702) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									@Pc(2979) Class1_Sub13 local2979 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local781);
									if (local2979 == null) {
										Static225.anIntArray502[local23++] = 0;
									} else {
										Static225.anIntArray502[local23++] = 1;
									}
									continue;
								}
								if (local211 == 2703) {
									local23--;
									local1017 = Static164.method2725(Static225.anIntArray502[local23]);
									if (local1017.aClass93Array1 == null) {
										Static225.anIntArray502[local23++] = 0;
										continue;
									}
									local775 = local1017.aClass93Array1.length;
									for (local1057 = 0; local1057 < local1017.aClass93Array1.length; local1057++) {
										if (local1017.aClass93Array1[local1057] == null) {
											local775 = local1057;
											break;
										}
									}
									Static225.anIntArray502[local23++] = local775;
									continue;
								}
								if (local211 == 2704 || local211 == 2705) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23 + 1];
									local781 = Static225.anIntArray502[local23];
									@Pc(3071) Class1_Sub13 local3071 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local781);
									if (local3071 != null && local775 == local3071.anInt1588) {
										Static225.anIntArray502[local23++] = 1;
										continue;
									}
									Static225.anIntArray502[local23++] = 0;
									continue;
								}
							} else if (local211 < 2900) {
								local23--;
								local1017 = Static164.method2725(Static225.anIntArray502[local23]);
								if (local211 == 2800) {
									Static225.anIntArray502[local23++] = Static170.method2810(Static35.method552(local1017));
									continue;
								}
								if (local211 == 2801) {
									local23--;
									local775 = Static225.anIntArray502[local23];
									local775--;
									if (local1017.aClass50Array69 != null && local1017.aClass50Array69.length > local775 && local1017.aClass50Array69[local775] != null) {
										Static73.aClass50Array63[local27++] = local1017.aClass50Array69[local775];
										continue;
									}
									Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									continue;
								}
								if (local211 == 2802) {
									if (local1017.aClass50_1197 == null) {
										Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									} else {
										Static73.aClass50Array63[local27++] = local1017.aClass50_1197;
									}
									continue;
								}
							} else if (local211 < 3200) {
								if (local211 == 3100) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static123.method1275(local568, Static136.aClass50_488, 0);
									continue;
								}
								if (local211 == 3101) {
									local23 -= 2;
									Static170.method2814(Static225.anIntArray502[local23], Static230.aClass20_Sub3_Sub1_3, Static225.anIntArray502[local23 + 1]);
									continue;
								}
								if (local211 == 3103) {
									Static95.method1498();
									continue;
								}
								if (local211 == 3104) {
									local775 = 0;
									local27--;
									local568 = Static73.aClass50Array63[local27];
									if (local568.method1234()) {
										local775 = local568.method1235();
									}
									Static32.aClass1_Sub17_Sub1_1.method2182(201);
									Static32.aClass1_Sub17_Sub1_1.method2124(local775);
									continue;
								}
								if (local211 == 3105) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static32.aClass1_Sub17_Sub1_1.method2182(225);
									Static32.aClass1_Sub17_Sub1_1.method2171(local568.method1221());
									continue;
								}
								if (local211 == 3106) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static32.aClass1_Sub17_Sub1_1.method2182(243);
									Static32.aClass1_Sub17_Sub1_1.method2175(local568.method1249() + 1);
									Static32.aClass1_Sub17_Sub1_1.method2174(local568);
									continue;
								}
								if (local211 == 3107) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									local27--;
									local1594 = Static73.aClass50Array63[local27];
									Static2.method46(local781, local1594);
									continue;
								}
								if (local211 == 3108) {
									local23 -= 3;
									local775 = Static225.anIntArray502[local23 + 1];
									local1057 = Static225.anIntArray502[local23 + 2];
									local781 = Static225.anIntArray502[local23];
									local11230 = Static164.method2725(local1057);
									Static141.method3018(local775, local781, local11230);
									continue;
								}
								if (local211 == 3109) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23 + 1];
									local781 = Static225.anIntArray502[local23];
									local11259 = local976 ? Static6.aClass93_5 : Static228.aClass93_122;
									Static141.method3018(local775, local781, local11259);
									continue;
								}
								if (local211 == 3110) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static32.aClass1_Sub17_Sub1_1.method2182(223);
									Static32.aClass1_Sub17_Sub1_1.method2151(local781);
									continue;
								}
							} else if (local211 < 3300) {
								if (local211 == 3200) {
									local23 -= 3;
									Static103.method1590(Static225.anIntArray502[local23 + 1], Static225.anIntArray502[local23], Static225.anIntArray502[local23 + 2]);
									continue;
								}
								if (local211 == 3201) {
									local23--;
									Static103.method1593(Static225.anIntArray502[local23]);
									continue;
								}
								if (local211 == 3202) {
									local23 -= 2;
									Static187.method3088(Static225.anIntArray502[local23], Static225.anIntArray502[local23 + 1]);
									continue;
								}
							} else if (local211 < 3400) {
								if (local211 == 3300) {
									Static225.anIntArray502[local23++] = Static107.anInt2132;
									continue;
								}
								if (local211 == 3301) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = Static97.method1528(local781, local775);
									continue;
								}
								if (local211 == 3302) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23 + 1];
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static28.method397(local781, local775);
									continue;
								}
								if (local211 == 3303) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = Static109.method1728(local775, local781);
									continue;
								}
								if (local211 == 3304) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static62.method940(local781).anInt285;
									continue;
								}
								if (local211 == 3305) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static143.anIntArray303[local781];
									continue;
								}
								if (local211 == 3306) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static218.anIntArray385[local781];
									continue;
								}
								if (local211 == 3307) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static140.anIntArray300[local781];
									continue;
								}
								if (local211 == 3308) {
									local781 = Static212.anInt4195;
									local775 = (Static230.aClass20_Sub3_Sub1_3.anInt3022 >> 7) + Static91.anInt4078;
									local1057 = (Static230.aClass20_Sub3_Sub1_3.anInt3008 >> 7) + Static101.anInt2041;
									Static225.anIntArray502[local23++] = (local775 << 14) + ((local781 << 28) + local1057);
									continue;
								}
								if (local211 == 3309) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = local781 >> 14 & 0x3FFF;
									continue;
								}
								if (local211 == 3310) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = local781 >> 28;
									continue;
								}
								if (local211 == 3311) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = local781 & 0x3FFF;
									continue;
								}
								if (local211 == 3312) {
									Static225.anIntArray502[local23++] = Static224.aBoolean3 ? 1 : 0;
									continue;
								}
								if (local211 == 3313) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23] + 32768;
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = Static97.method1528(local781, local775);
									continue;
								}
								if (local211 == 3314) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23 + 1];
									local781 = Static225.anIntArray502[local23] + 32768;
									Static225.anIntArray502[local23++] = Static28.method397(local781, local775);
									continue;
								}
								if (local211 == 3315) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23] + 32768;
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = Static109.method1728(local775, local781);
									continue;
								}
								if (local211 == 3316) {
									if (Static122.anInt2447 >= 2) {
										Static225.anIntArray502[local23++] = Static122.anInt2447;
									} else {
										Static225.anIntArray502[local23++] = 0;
									}
									continue;
								}
								if (local211 == 3317) {
									Static225.anIntArray502[local23++] = Static219.anInt2996;
									continue;
								}
								if (local211 == 3318) {
									Static225.anIntArray502[local23++] = Static59.anInt1179;
									continue;
								}
								if (local211 == 3321) {
									Static225.anIntArray502[local23++] = Static11.anInt228;
									continue;
								}
								if (local211 == 3322) {
									Static225.anIntArray502[local23++] = Static220.anInt4308;
									continue;
								}
								if (local211 == 3323) {
									if (Static5.anInt101 >= 5 && Static5.anInt101 <= 9) {
										Static225.anIntArray502[local23++] = 1;
										continue;
									}
									Static225.anIntArray502[local23++] = 0;
									continue;
								}
								if (local211 == 3324) {
									if (Static5.anInt101 >= 5 && Static5.anInt101 <= 9) {
										Static225.anIntArray502[local23++] = Static5.anInt101;
										continue;
									}
									Static225.anIntArray502[local23++] = 0;
									continue;
								}
								if (local211 == 3325) {
									if (Static65.anInt4126 <= 0) {
										Static225.anIntArray502[local23++] = 0;
									} else {
										Static225.anIntArray502[local23++] = 1;
									}
									continue;
								}
								if (local211 == 3326) {
									Static225.anIntArray502[local23++] = Static230.aClass20_Sub3_Sub1_3.anInt1505;
									continue;
								}
								if (local211 == 3327) {
									Static225.anIntArray502[local23++] = Static230.aClass20_Sub3_Sub1_3.aClass25_2.aBoolean47 ? 1 : 0;
									continue;
								}
								if (local211 == 3328) {
									Static225.anIntArray502[local23++] = Static138.anInt2817;
									continue;
								}
								if (local211 == 3329) {
									Static225.anIntArray502[local23++] = Static47.anInt979;
									continue;
								}
								if (local211 == 3330) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static192.method3141(local781);
									continue;
								}
								if (local211 == 3331) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23 + 1];
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static104.method1601(local775, local781, false);
									continue;
								}
								if (local211 == 3332) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = Static104.method1601(local775, local781, true);
									continue;
								}
								if (local211 == 3333) {
									Static225.anIntArray502[local23++] = Static22.anInt427;
									continue;
								}
							} else if (local211 < 3500) {
								@Pc(10893) Class1_Sub1_Sub4 local10893;
								if (local211 == 3400) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									local10893 = Static159.method3316(local781);
									Static73.aClass50Array63[local27++] = local10893.method282(local775);
									continue;
								}
								if (local211 == 3408) {
									local23 -= 4;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									local1057 = Static225.anIntArray502[local23 + 2];
									local614 = Static225.anIntArray502[local23 + 3];
									@Pc(10933) Class1_Sub1_Sub4 local10933 = Static159.method3316(local1057);
									if (local781 == local10933.anInt393 && local775 == local10933.anInt388) {
										if (local775 == 115) {
											Static73.aClass50Array63[local27++] = local10933.method282(local614);
										} else {
											Static225.anIntArray502[local23++] = local10933.method281(local614);
										}
										continue;
									}
									throw new RuntimeException("C3408-1");
								}
								if (local211 == 3409) {
									local23 -= 3;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									local1057 = Static225.anIntArray502[local23 + 2];
									@Pc(10995) Class1_Sub1_Sub4 local10995 = Static159.method3316(local775);
									if (local10995.anInt388 != local781) {
										throw new RuntimeException("C3409-1");
									}
									Static225.anIntArray502[local23++] = local10995.method285(local1057) ? 1 : 0;
									continue;
								}
								if (local211 == 3410) {
									local27--;
									local1594 = Static73.aClass50Array63[local27];
									local23--;
									local781 = Static225.anIntArray502[local23];
									local10893 = Static159.method3316(local781);
									if (local10893.anInt388 != 115) {
										throw new RuntimeException("C3410-1");
									}
									Static225.anIntArray502[local23++] = local10893.method289(local1594) ? 1 : 0;
									continue;
								}
							} else if (local211 < 3700) {
								if (local211 == 3600) {
									if (Static56.anInt1096 == 0) {
										Static225.anIntArray502[local23++] = -2;
									} else if (Static56.anInt1096 == 1) {
										Static225.anIntArray502[local23++] = -1;
									} else {
										Static225.anIntArray502[local23++] = Static21.anInt420;
									}
									continue;
								}
								if (local211 == 3601) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static56.anInt1096 == 2 && local781 < Static21.anInt420) {
										Static73.aClass50Array63[local27++] = Static149.aClass50Array58[local781];
										continue;
									}
									Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									continue;
								}
								if (local211 == 3602) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static56.anInt1096 == 2 && local781 < Static21.anInt420) {
										Static225.anIntArray502[local23++] = Static206.anIntArray467[local781];
										continue;
									}
									Static225.anIntArray502[local23++] = 0;
									continue;
								}
								if (local211 == 3603) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static56.anInt1096 == 2 && Static21.anInt420 > local781) {
										Static225.anIntArray502[local23++] = Static113.anIntArray254[local781];
										continue;
									}
									Static225.anIntArray502[local23++] = 0;
									continue;
								}
								if (local211 == 3604) {
									local23--;
									local775 = Static225.anIntArray502[local23];
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static179.method2942(local775, local568);
									continue;
								}
								if (local211 == 3605) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static12.method183(local568.method1221());
									continue;
								}
								if (local211 == 3606) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static146.method2477(local568.method1221());
									continue;
								}
								if (local211 == 3607) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static93.method1462(local568.method1221());
									continue;
								}
								if (local211 == 3608) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static195.method3167(local568.method1221());
									continue;
								}
								if (local211 == 3609) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									if (local568.method1240(Static102.aClass50_673) || local568.method1240(Static42.aClass50_324)) {
										local568 = local568.method1244(7);
									}
									Static225.anIntArray502[local23++] = Static231.method3485(local568) ? 1 : 0;
									continue;
								}
								if (local211 == 3610) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static56.anInt1096 == 2 && local781 < Static21.anInt420) {
										Static73.aClass50Array63[local27++] = Static131.aClass50Array50[local781];
										continue;
									}
									Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									continue;
								}
								if (local211 == 3611) {
									if (Static60.aClass50_422 == null) {
										Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									} else {
										Static73.aClass50Array63[local27++] = Static60.aClass50_422.method1218();
									}
									continue;
								}
								if (local211 == 3612) {
									if (Static60.aClass50_422 == null) {
										Static225.anIntArray502[local23++] = 0;
									} else {
										Static225.anIntArray502[local23++] = Static213.anInt4208;
									}
									continue;
								}
								if (local211 == 3613) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static60.aClass50_422 != null && local781 < Static213.anInt4208) {
										Static73.aClass50Array63[local27++] = Static212.aClass1_Sub9Array1[local781].aClass50_336.method1218();
										continue;
									}
									Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									continue;
								}
								if (local211 == 3614) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static60.aClass50_422 != null && local781 < Static213.anInt4208) {
										Static225.anIntArray502[local23++] = Static212.aClass1_Sub9Array1[local781].anInt937;
										continue;
									}
									Static225.anIntArray502[local23++] = 0;
									continue;
								}
								if (local211 == 3615) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static60.aClass50_422 != null && Static213.anInt4208 > local781) {
										Static225.anIntArray502[local23++] = Static212.aClass1_Sub9Array1[local781].aByte3;
										continue;
									}
									Static225.anIntArray502[local23++] = 0;
									continue;
								}
								if (local211 == 3616) {
									Static225.anIntArray502[local23++] = Static206.aByte16;
									continue;
								}
								if (local211 == 3617) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static216.method3378(local568);
									continue;
								}
								if (local211 == 3618) {
									Static225.anIntArray502[local23++] = Static146.aByte6;
									continue;
								}
								if (local211 == 3619) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static61.method917(local568.method1221());
									continue;
								}
								if (local211 == 3620) {
									Static227.method3435();
									continue;
								}
								if (local211 == 3621) {
									if (Static56.anInt1096 == 0) {
										Static225.anIntArray502[local23++] = -1;
									} else {
										Static225.anIntArray502[local23++] = Static201.anInt4066;
									}
									continue;
								}
								if (local211 == 3622) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static56.anInt1096 != 0 && local781 < Static201.anInt4066) {
										Static73.aClass50Array63[local27++] = Static130.method2183(Static118.aLongArray5[local781]).method1218();
										continue;
									}
									Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									continue;
								}
								if (local211 == 3623) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									if (local568.method1240(Static102.aClass50_673) || local568.method1240(Static42.aClass50_324)) {
										local568 = local568.method1244(7);
									}
									Static225.anIntArray502[local23++] = Static36.method583(local568) ? 1 : 0;
									continue;
								}
								if (local211 == 3624) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static212.aClass1_Sub9Array1 != null && Static213.anInt4208 > local781 && Static212.aClass1_Sub9Array1[local781].aClass50_336.method1256(Static230.aClass20_Sub3_Sub1_3.aClass50_493)) {
										Static225.anIntArray502[local23++] = 1;
										continue;
									}
									Static225.anIntArray502[local23++] = 0;
									continue;
								}
								if (local211 == 3625) {
									if (Static219.aClass50_1010 == null) {
										Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									} else {
										Static73.aClass50Array63[local27++] = Static219.aClass50_1010.method1218();
									}
									continue;
								}
								if (local211 == 3626) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static60.aClass50_422 != null && Static213.anInt4208 > local781) {
										Static73.aClass50Array63[local27++] = Static212.aClass1_Sub9Array1[local781].aClass50_332;
										continue;
									}
									Static73.aClass50Array63[local27++] = Static136.aClass50_488;
									continue;
								}
								if (local211 == 3627) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									if (Static56.anInt1096 == 2 && local781 >= 0 && Static21.anInt420 > local781) {
										Static225.anIntArray502[local23++] = Static11.aBooleanArray1[local781] ? 1 : 0;
										continue;
									}
									Static225.anIntArray502[local23++] = 0;
									continue;
								}
								if (local211 == 3628) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									if (local568.method1240(Static102.aClass50_673) || local568.method1240(Static42.aClass50_324)) {
										local568 = local568.method1244(7);
									}
									Static225.anIntArray502[local23++] = Static85.method1279(local568);
									continue;
								}
							} else if (local211 < 4000) {
								if (local211 == 3903) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static35.aClass100Array1[local781].method3001();
									continue;
								}
								if (local211 == 3904) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static35.aClass100Array1[local781].anInt3800;
									continue;
								}
								if (local211 == 3905) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static35.aClass100Array1[local781].anInt3793;
									continue;
								}
								if (local211 == 3906) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static35.aClass100Array1[local781].anInt3804;
									continue;
								}
								if (local211 == 3907) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static35.aClass100Array1[local781].anInt3795;
									continue;
								}
								if (local211 == 3908) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static35.aClass100Array1[local781].anInt3796;
									continue;
								}
								if (local211 == 3910) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									local775 = Static35.aClass100Array1[local781].method3003();
									Static225.anIntArray502[local23++] = local775 == 0 ? 1 : 0;
									continue;
								}
								if (local211 == 3911) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									local775 = Static35.aClass100Array1[local781].method3003();
									Static225.anIntArray502[local23++] = local775 == 2 ? 1 : 0;
									continue;
								}
								if (local211 == 3912) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									local775 = Static35.aClass100Array1[local781].method3003();
									Static225.anIntArray502[local23++] = local775 == 5 ? 1 : 0;
									continue;
								}
								if (local211 == 3913) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									local775 = Static35.aClass100Array1[local781].method3003();
									Static225.anIntArray502[local23++] = local775 == 1 ? 1 : 0;
									continue;
								}
							} else if (local211 < 4100) {
								if (local211 == 4000) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = local775 + local781;
									continue;
								}
								if (local211 == 4001) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = local781 - local775;
									continue;
								}
								if (local211 == 4002) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23 + 1];
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = local775 * local781;
									continue;
								}
								if (local211 == 4003) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = local781 / local775;
									continue;
								}
								if (local211 == 4004) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = (int) (Math.random() * (double) local781);
									continue;
								}
								if (local211 == 4005) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = (int) ((double) (local781 + 1) * Math.random());
									continue;
								}
								if (local211 == 4006) {
									local23 -= 5;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									local1057 = Static225.anIntArray502[local23 + 2];
									local614 = Static225.anIntArray502[local23 + 3];
									local640 = Static225.anIntArray502[local23 + 4];
									Static225.anIntArray502[local23++] = (local640 - local1057) * (local775 - local781) / (local614 - local1057) + local781;
									continue;
								}
								@Pc(4998) long local4998;
								@Pc(5003) long local5003;
								if (local211 == 4007) {
									local23 -= 2;
									local4998 = Static225.anIntArray502[local23 + 1];
									local5003 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = (int) (local5003 + local4998 * local5003 / 100L);
									continue;
								}
								if (local211 == 4008) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23 + 1];
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = 0x1 << local775 | local781;
									continue;
								}
								if (local211 == 4009) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23 + 1];
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = -(0x1 << local775) - 1 & local781;
									continue;
								}
								if (local211 == 4010) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = (0x1 << local775 & local781) == 0 ? 0 : 1;
									continue;
								}
								if (local211 == 4011) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23 + 1];
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = local781 % local775;
									continue;
								}
								if (local211 == 4012) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									if (local781 == 0) {
										Static225.anIntArray502[local23++] = 0;
									} else {
										Static225.anIntArray502[local23++] = (int) Math.pow((double) local781, (double) local775);
									}
									continue;
								}
								if (local211 == 4013) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									if (local781 == 0) {
										Static225.anIntArray502[local23++] = 0;
									} else if (local775 == 0) {
										Static225.anIntArray502[local23++] = Integer.MAX_VALUE;
									} else {
										Static225.anIntArray502[local23++] = (int) Math.pow((double) local781, 1.0D / (double) local775);
									}
									continue;
								}
								if (local211 == 4014) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = local781 & local775;
									continue;
								}
								if (local211 == 4015) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23 + 1];
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = local775 | local781;
									continue;
								}
								if (local211 == 4016) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = local781 < local775 ? local781 : local775;
									continue;
								}
								if (local211 == 4017) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = local775 >= local781 ? local775 : local781;
									continue;
								}
								if (local211 == 4018) {
									local23 -= 3;
									local5003 = Static225.anIntArray502[local23];
									local4998 = Static225.anIntArray502[local23 + 1];
									@Pc(5348) long local5348 = (long) Static225.anIntArray502[local23 + 2];
									Static225.anIntArray502[local23++] = (int) (local5003 * local5348 / local4998);
									continue;
								}
							} else if (local211 >= 4200) {
								@Pc(5651) Class1_Sub1_Sub12 local5651;
								if (local211 < 4300) {
									if (local211 == 4200) {
										local23--;
										local781 = Static225.anIntArray502[local23];
										Static73.aClass50Array63[local27++] = Static16.method227(local781).aClass50_833;
										continue;
									}
									@Pc(5404) Class70 local5404;
									if (local211 == 4201) {
										local23 -= 2;
										local775 = Static225.anIntArray502[local23 + 1];
										local781 = Static225.anIntArray502[local23];
										local5404 = Static16.method227(local781);
										if (local775 >= 1 && local775 <= 5 && local5404.aClass50Array44[local775 - 1] != null) {
											Static73.aClass50Array63[local27++] = local5404.aClass50Array44[local775 - 1];
											continue;
										}
										Static73.aClass50Array63[local27++] = Static136.aClass50_488;
										continue;
									}
									if (local211 == 4202) {
										local23 -= 2;
										local781 = Static225.anIntArray502[local23];
										local775 = Static225.anIntArray502[local23 + 1];
										local5404 = Static16.method227(local781);
										if (local775 >= 1 && local775 <= 5 && local5404.aClass50Array45[local775 - 1] != null) {
											Static73.aClass50Array63[local27++] = local5404.aClass50Array45[local775 - 1];
											continue;
										}
										Static73.aClass50Array63[local27++] = Static136.aClass50_488;
										continue;
									}
									if (local211 == 4203) {
										local23--;
										local781 = Static225.anIntArray502[local23];
										Static225.anIntArray502[local23++] = Static16.method227(local781).anInt2438;
										continue;
									}
									if (local211 == 4204) {
										local23--;
										local781 = Static225.anIntArray502[local23];
										Static225.anIntArray502[local23++] = Static16.method227(local781).anInt2430 == 1 ? 1 : 0;
										continue;
									}
									@Pc(5551) Class70 local5551;
									if (local211 == 4205) {
										local23--;
										local781 = Static225.anIntArray502[local23];
										local5551 = Static16.method227(local781);
										if (local5551.anInt2401 == -1 && local5551.anInt2429 >= 0) {
											Static225.anIntArray502[local23++] = local5551.anInt2429;
											continue;
										}
										Static225.anIntArray502[local23++] = local781;
										continue;
									}
									if (local211 == 4206) {
										local23--;
										local781 = Static225.anIntArray502[local23];
										local5551 = Static16.method227(local781);
										if (local5551.anInt2401 >= 0 && local5551.anInt2429 >= 0) {
											Static225.anIntArray502[local23++] = local5551.anInt2429;
											continue;
										}
										Static225.anIntArray502[local23++] = local781;
										continue;
									}
									if (local211 == 4207) {
										local23--;
										local781 = Static225.anIntArray502[local23];
										Static225.anIntArray502[local23++] = Static16.method227(local781).aBoolean105 ? 1 : 0;
										continue;
									}
									if (local211 == 4208) {
										local23 -= 2;
										local781 = Static225.anIntArray502[local23];
										local775 = Static225.anIntArray502[local23 + 1];
										local5651 = Static37.method596(local775);
										if (local5651.method1943()) {
											Static73.aClass50Array63[local27++] = Static16.method227(local781).method1947(local5651.aClass50_831, local775);
										} else {
											Static225.anIntArray502[local23++] = Static16.method227(local781).method1953(local5651.anInt2388, local775);
										}
										continue;
									}
									if (local211 == 4210) {
										local27--;
										local568 = Static73.aClass50Array63[local27];
										local23--;
										local775 = Static225.anIntArray502[local23];
										Static13.method190(local775 == 1, local568);
										Static225.anIntArray502[local23++] = Static8.anInt180;
										continue;
									}
									if (local211 == 4211) {
										if (Static56.aShortArray9 != null && Static171.anInt3500 < Static8.anInt180) {
											Static225.anIntArray502[local23++] = Static56.aShortArray9[Static171.anInt3500++] & 0xFFFF;
											continue;
										}
										Static225.anIntArray502[local23++] = -1;
										continue;
									}
									if (local211 == 4212) {
										Static171.anInt3500 = 0;
										continue;
									}
								} else if (local211 >= 4400) {
									if (local211 < 4500) {
										if (local211 == 4400) {
											local23 -= 2;
											local781 = Static225.anIntArray502[local23];
											local775 = Static225.anIntArray502[local23 + 1];
											local5651 = Static37.method596(local775);
											if (local5651.method1943()) {
												Static73.aClass50Array63[local27++] = Static148.method2487(local781).method604(local5651.aClass50_831, local775);
											} else {
												Static225.anIntArray502[local23++] = Static148.method2487(local781).method607(local775, local5651.anInt2388);
											}
											continue;
										}
									} else if (local211 >= 4600) {
										if (local211 < 5100) {
											if (local211 == 5000) {
												Static225.anIntArray502[local23++] = Static147.anInt3081;
												continue;
											}
											if (local211 == 5001) {
												local23 -= 3;
												Static147.anInt3081 = Static225.anIntArray502[local23];
												Static1.anInt42 = Static225.anIntArray502[local23 + 1];
												Static140.anInt2857 = Static225.anIntArray502[local23 + 2];
												Static32.aClass1_Sub17_Sub1_1.method2182(43);
												Static32.aClass1_Sub17_Sub1_1.method2175(Static147.anInt3081);
												Static32.aClass1_Sub17_Sub1_1.method2175(Static1.anInt42);
												Static32.aClass1_Sub17_Sub1_1.method2175(Static140.anInt2857);
												continue;
											}
											if (local211 == 5002) {
												local23 -= 2;
												local27--;
												local568 = Static73.aClass50Array63[local27];
												local775 = Static225.anIntArray502[local23];
												local1057 = Static225.anIntArray502[local23 + 1];
												Static32.aClass1_Sub17_Sub1_1.method2182(53);
												Static32.aClass1_Sub17_Sub1_1.method2171(local568.method1221());
												Static32.aClass1_Sub17_Sub1_1.method2175(local775 - 1);
												Static32.aClass1_Sub17_Sub1_1.method2175(local1057);
												continue;
											}
											if (local211 == 5003) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												local1594 = null;
												if (local781 < 100) {
													local1594 = Static8.aClass50Array12[local781];
												}
												if (local1594 == null) {
													local1594 = Static136.aClass50_488;
												}
												Static73.aClass50Array63[local27++] = local1594;
												continue;
											}
											if (local211 == 5004) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												local775 = -1;
												if (local781 < 100 && Static8.aClass50Array12[local781] != null) {
													local775 = Static158.anIntArray349[local781];
												}
												Static225.anIntArray502[local23++] = local775;
												continue;
											}
											if (local211 == 5005) {
												Static225.anIntArray502[local23++] = Static1.anInt42;
												continue;
											}
											if (local211 == 5008) {
												local27--;
												local568 = Static73.aClass50Array63[local27];
												if (local568.method1240(Static8.aClass50_85)) {
													Static218.method2873(local568);
													continue;
												}
												if (Static122.anInt2447 == 0 && (Static138.anInt2817 == 1 || Static47.anInt979 == 1)) {
													continue;
												}
												local1594 = local568.method1233();
												@Pc(6031) byte local6031 = 0;
												@Pc(6033) byte local6033 = 0;
												if (local1594.method1240(Static138.aClass50_944)) {
													local568 = local568.method1244(Static138.aClass50_944.method1249());
													local6031 = 0;
												} else if (local1594.method1240(Static132.aClass50_923)) {
													local568 = local568.method1244(Static132.aClass50_923.method1249());
													local6031 = 1;
												} else if (local1594.method1240(Static33.aClass50_247)) {
													local6031 = 2;
													local568 = local568.method1244(Static33.aClass50_247.method1249());
												} else if (local1594.method1240(Static66.aClass50_470)) {
													local6031 = 3;
													local568 = local568.method1244(Static66.aClass50_470.method1249());
												} else if (local1594.method1240(Static185.aClass50_1243)) {
													local6031 = 4;
													local568 = local568.method1244(Static185.aClass50_1243.method1249());
												} else if (local1594.method1240(Static140.aClass50_968)) {
													local6031 = 5;
													local568 = local568.method1244(Static140.aClass50_968.method1249());
												} else if (local1594.method1240(Static130.aClass50_904)) {
													local6031 = 6;
													local568 = local568.method1244(Static130.aClass50_904.method1249());
												} else if (local1594.method1240(Static58.aClass50_412)) {
													local6031 = 7;
													local568 = local568.method1244(Static58.aClass50_412.method1249());
												} else if (local1594.method1240(Static233.aClass50_1429)) {
													local568 = local568.method1244(Static233.aClass50_1429.method1249());
													local6031 = 8;
												} else if (local1594.method1240(Static175.aClass50_1198)) {
													local6031 = 9;
													local568 = local568.method1244(Static175.aClass50_1198.method1249());
												} else if (local1594.method1240(Static102.aClass50_669)) {
													local568 = local568.method1244(Static102.aClass50_669.method1249());
													local6031 = 10;
												} else if (local1594.method1240(Static45.aClass50_337)) {
													local568 = local568.method1244(Static45.aClass50_337.method1249());
													local6031 = 11;
												} else if (Static195.anInt3972 != 0) {
													if (local1594.method1240(Static138.aClass50_946)) {
														local6031 = 0;
														local568 = local568.method1244(Static138.aClass50_946.method1249());
													} else if (local1594.method1240(Static132.aClass50_924)) {
														local568 = local568.method1244(Static132.aClass50_924.method1249());
														local6031 = 1;
													} else if (local1594.method1240(Static33.aClass50_246)) {
														local6031 = 2;
														local568 = local568.method1244(Static33.aClass50_246.method1249());
													} else if (local1594.method1240(Static66.aClass50_473)) {
														local6031 = 3;
														local568 = local568.method1244(Static66.aClass50_473.method1249());
													} else if (local1594.method1240(Static185.aClass50_1241)) {
														local568 = local568.method1244(Static185.aClass50_1241.method1249());
														local6031 = 4;
													} else if (local1594.method1240(Static140.aClass50_967)) {
														local6031 = 5;
														local568 = local568.method1244(Static140.aClass50_967.method1249());
													} else if (local1594.method1240(Static130.aClass50_905)) {
														local568 = local568.method1244(Static130.aClass50_905.method1249());
														local6031 = 6;
													} else if (local1594.method1240(Static58.aClass50_414)) {
														local568 = local568.method1244(Static58.aClass50_414.method1249());
														local6031 = 7;
													} else if (local1594.method1240(Static233.aClass50_1427)) {
														local6031 = 8;
														local568 = local568.method1244(Static233.aClass50_1427.method1249());
													} else if (local1594.method1240(Static175.aClass50_1191)) {
														local6031 = 9;
														local568 = local568.method1244(Static175.aClass50_1191.method1249());
													} else if (local1594.method1240(Static102.aClass50_670)) {
														local6031 = 10;
														local568 = local568.method1244(Static102.aClass50_670.method1249());
													} else if (local1594.method1240(Static45.aClass50_338)) {
														local568 = local568.method1244(Static45.aClass50_338.method1249());
														local6031 = 11;
													}
												}
												local1594 = local568.method1233();
												if (local1594.method1240(Static196.aClass50_1286)) {
													local6033 = 1;
													local568 = local568.method1244(Static196.aClass50_1286.method1249());
												} else if (local1594.method1240(Static117.aClass50_795)) {
													local568 = local568.method1244(Static117.aClass50_795.method1249());
													local6033 = 2;
												} else if (local1594.method1240(Static201.aClass50_1312)) {
													local6033 = 3;
													local568 = local568.method1244(Static201.aClass50_1312.method1249());
												} else if (local1594.method1240(Static150.aClass50_1031)) {
													local568 = local568.method1244(Static150.aClass50_1031.method1249());
													local6033 = 4;
												} else if (local1594.method1240(Static203.aClass50_273)) {
													local568 = local568.method1244(Static203.aClass50_273.method1249());
													local6033 = 5;
												} else if (Static195.anInt3972 != 0) {
													if (local1594.method1240(Static196.aClass50_1285)) {
														local6033 = 1;
														local568 = local568.method1244(Static196.aClass50_1285.method1249());
													} else if (local1594.method1240(Static117.aClass50_796)) {
														local568 = local568.method1244(Static117.aClass50_796.method1249());
														local6033 = 2;
													} else if (local1594.method1240(Static201.aClass50_1313)) {
														local6033 = 3;
														local568 = local568.method1244(Static201.aClass50_1313.method1249());
													} else if (local1594.method1240(Static150.aClass50_1029)) {
														local568 = local568.method1244(Static150.aClass50_1029.method1249());
														local6033 = 4;
													} else if (local1594.method1240(Static203.aClass50_275)) {
														local568 = local568.method1244(Static203.aClass50_275.method1249());
														local6033 = 5;
													}
												}
												Static32.aClass1_Sub17_Sub1_1.method2182(247);
												Static32.aClass1_Sub17_Sub1_1.method2175(0);
												local640 = Static32.aClass1_Sub17_Sub1_1.anInt2656;
												Static32.aClass1_Sub17_Sub1_1.method2175(local6031);
												Static32.aClass1_Sub17_Sub1_1.method2175(local6033);
												Static219.method2430(Static32.aClass1_Sub17_Sub1_1, local568);
												Static32.aClass1_Sub17_Sub1_1.method2179(Static32.aClass1_Sub17_Sub1_1.anInt2656 - local640);
												continue;
											}
											if (local211 == 5009) {
												local27 -= 2;
												local568 = Static73.aClass50Array63[local27];
												local1594 = Static73.aClass50Array63[local27 + 1];
												if (Static122.anInt2447 != 0 || Static138.anInt2817 != 1 && Static47.anInt979 != 1) {
													Static32.aClass1_Sub17_Sub1_1.method2182(64);
													Static32.aClass1_Sub17_Sub1_1.method2175(0);
													local1057 = Static32.aClass1_Sub17_Sub1_1.anInt2656;
													Static32.aClass1_Sub17_Sub1_1.method2171(local568.method1221());
													Static219.method2430(Static32.aClass1_Sub17_Sub1_1, local1594);
													Static32.aClass1_Sub17_Sub1_1.method2179(Static32.aClass1_Sub17_Sub1_1.anInt2656 - local1057);
												}
												continue;
											}
											if (local211 == 5010) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												local1594 = null;
												if (local781 < 100) {
													local1594 = Static187.aClass50Array73[local781];
												}
												if (local1594 == null) {
													local1594 = Static136.aClass50_488;
												}
												Static73.aClass50Array63[local27++] = local1594;
												continue;
											}
											if (local211 == 5011) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												local1594 = null;
												if (local781 < 100) {
													local1594 = Static132.aClass50Array52[local781];
												}
												if (local1594 == null) {
													local1594 = Static136.aClass50_488;
												}
												Static73.aClass50Array63[local27++] = local1594;
												continue;
											}
											if (local211 == 5012) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												local775 = -1;
												if (local781 < 100) {
													local775 = Static199.anIntArray462[local781];
												}
												Static225.anIntArray502[local23++] = local775;
												continue;
											}
											if (local211 == 5015) {
												if (Static230.aClass20_Sub3_Sub1_3 == null || Static230.aClass20_Sub3_Sub1_3.aClass50_493 == null) {
													local568 = Static7.aClass50_67;
												} else {
													local568 = Static230.aClass20_Sub3_Sub1_3.method1089();
												}
												Static73.aClass50Array63[local27++] = local568;
												continue;
											}
											if (local211 == 5016) {
												Static225.anIntArray502[local23++] = Static140.anInt2857;
												continue;
											}
											if (local211 == 5017) {
												Static225.anIntArray502[local23++] = Static68.anInt1303;
												continue;
											}
											if (local211 == 5050) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												Static73.aClass50Array63[local27++] = Static152.method2546(local781).aClass50_1426;
												continue;
											}
											@Pc(6845) Class1_Sub1_Sub18 local6845;
											if (local211 == 5051) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												local6845 = Static152.method2546(local781);
												if (local6845.anIntArray513 == null) {
													Static225.anIntArray502[local23++] = 0;
												} else {
													Static225.anIntArray502[local23++] = local6845.anIntArray513.length;
												}
												continue;
											}
											if (local211 == 5052) {
												local23 -= 2;
												local781 = Static225.anIntArray502[local23];
												local775 = Static225.anIntArray502[local23 + 1];
												@Pc(6882) Class1_Sub1_Sub18 local6882 = Static152.method2546(local781);
												local614 = local6882.anIntArray513[local775];
												Static225.anIntArray502[local23++] = local614;
												continue;
											}
											if (local211 == 5053) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												local6845 = Static152.method2546(local781);
												if (local6845.anIntArray517 == null) {
													Static225.anIntArray502[local23++] = 0;
												} else {
													Static225.anIntArray502[local23++] = local6845.anIntArray517.length;
												}
												continue;
											}
											if (local211 == 5054) {
												local23 -= 2;
												local781 = Static225.anIntArray502[local23];
												local775 = Static225.anIntArray502[local23 + 1];
												Static225.anIntArray502[local23++] = Static152.method2546(local781).anIntArray517[local775];
												continue;
											}
											if (local211 == 5055) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												Static73.aClass50Array63[local27++] = Static219.method2418(local781).method1910();
												continue;
											}
											if (local211 == 5056) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												@Pc(6986) Class1_Sub1_Sub11 local6986 = Static219.method2418(local781);
												if (local6986.anIntArray263 == null) {
													Static225.anIntArray502[local23++] = 0;
												} else {
													Static225.anIntArray502[local23++] = local6986.anIntArray263.length;
												}
												continue;
											}
											if (local211 == 5057) {
												local23 -= 2;
												local781 = Static225.anIntArray502[local23];
												local775 = Static225.anIntArray502[local23 + 1];
												Static225.anIntArray502[local23++] = Static219.method2418(local781).anIntArray263[local775];
												continue;
											}
											if (local211 == 5058) {
												Static230.aClass80_2 = new Class80();
												local23--;
												Static230.aClass80_2.anInt3082 = Static225.anIntArray502[local23];
												Static230.aClass80_2.aClass1_Sub1_Sub11_1 = Static219.method2418(Static230.aClass80_2.anInt3082);
												Static230.aClass80_2.anIntArray317 = new int[Static230.aClass80_2.aClass1_Sub1_Sub11_1.method1912()];
												continue;
											}
											if (local211 == 5059) {
												Static32.aClass1_Sub17_Sub1_1.method2182(120);
												Static32.aClass1_Sub17_Sub1_1.method2175(0);
												local781 = Static32.aClass1_Sub17_Sub1_1.anInt2656;
												Static32.aClass1_Sub17_Sub1_1.method2175(0);
												Static32.aClass1_Sub17_Sub1_1.method2151(Static230.aClass80_2.anInt3082);
												Static230.aClass80_2.aClass1_Sub1_Sub11_1.method1918(Static230.aClass80_2.anIntArray317, Static32.aClass1_Sub17_Sub1_1);
												Static32.aClass1_Sub17_Sub1_1.method2179(Static32.aClass1_Sub17_Sub1_1.anInt2656 - local781);
												continue;
											}
											if (local211 == 5060) {
												local27--;
												local568 = Static73.aClass50Array63[local27];
												Static32.aClass1_Sub17_Sub1_1.method2182(200);
												Static32.aClass1_Sub17_Sub1_1.method2175(0);
												local775 = Static32.aClass1_Sub17_Sub1_1.anInt2656;
												Static32.aClass1_Sub17_Sub1_1.method2171(local568.method1221());
												Static32.aClass1_Sub17_Sub1_1.method2151(Static230.aClass80_2.anInt3082);
												Static230.aClass80_2.aClass1_Sub1_Sub11_1.method1918(Static230.aClass80_2.anIntArray317, Static32.aClass1_Sub17_Sub1_1);
												Static32.aClass1_Sub17_Sub1_1.method2179(Static32.aClass1_Sub17_Sub1_1.anInt2656 - local775);
												continue;
											}
											if (local211 == 5061) {
												Static32.aClass1_Sub17_Sub1_1.method2182(120);
												Static32.aClass1_Sub17_Sub1_1.method2175(0);
												local781 = Static32.aClass1_Sub17_Sub1_1.anInt2656;
												Static32.aClass1_Sub17_Sub1_1.method2175(1);
												Static32.aClass1_Sub17_Sub1_1.method2151(Static230.aClass80_2.anInt3082);
												Static230.aClass80_2.aClass1_Sub1_Sub11_1.method1918(Static230.aClass80_2.anIntArray317, Static32.aClass1_Sub17_Sub1_1);
												Static32.aClass1_Sub17_Sub1_1.method2179(Static32.aClass1_Sub17_Sub1_1.anInt2656 - local781);
												continue;
											}
											if (local211 == 5062) {
												local23 -= 2;
												local781 = Static225.anIntArray502[local23];
												local775 = Static225.anIntArray502[local23 + 1];
												Static225.anIntArray502[local23++] = Static152.method2546(local781).anIntArray516[local775];
												continue;
											}
											if (local211 == 5063) {
												local23 -= 2;
												local781 = Static225.anIntArray502[local23];
												local775 = Static225.anIntArray502[local23 + 1];
												Static225.anIntArray502[local23++] = Static152.method2546(local781).anIntArray515[local775];
												continue;
											}
											if (local211 == 5064) {
												local23 -= 2;
												local781 = Static225.anIntArray502[local23];
												local775 = Static225.anIntArray502[local23 + 1];
												if (local775 == -1) {
													Static225.anIntArray502[local23++] = -1;
												} else {
													Static225.anIntArray502[local23++] = Static152.method2546(local781).method3521(local775);
												}
												continue;
											}
											if (local211 == 5065) {
												local23 -= 2;
												local781 = Static225.anIntArray502[local23];
												local775 = Static225.anIntArray502[local23 + 1];
												if (local775 == -1) {
													Static225.anIntArray502[local23++] = -1;
												} else {
													Static225.anIntArray502[local23++] = Static152.method2546(local781).method3516(local775);
												}
												continue;
											}
											if (local211 == 5066) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												Static225.anIntArray502[local23++] = Static219.method2418(local781).method1912();
												continue;
											}
											if (local211 == 5067) {
												local23 -= 2;
												local775 = Static225.anIntArray502[local23 + 1];
												local781 = Static225.anIntArray502[local23];
												local1057 = Static219.method2418(local781).method1916(local775);
												Static225.anIntArray502[local23++] = local1057;
												continue;
											}
											if (local211 == 5068) {
												local23 -= 2;
												local781 = Static225.anIntArray502[local23];
												local775 = Static225.anIntArray502[local23 + 1];
												Static230.aClass80_2.anIntArray317[local781] = local775;
												continue;
											}
											if (local211 == 5069) {
												local23 -= 2;
												local781 = Static225.anIntArray502[local23];
												local775 = Static225.anIntArray502[local23 + 1];
												Static230.aClass80_2.anIntArray317[local781] = local775;
												continue;
											}
											if (local211 == 5070) {
												local23 -= 3;
												local1057 = Static225.anIntArray502[local23 + 2];
												local781 = Static225.anIntArray502[local23];
												local775 = Static225.anIntArray502[local23 + 1];
												@Pc(7445) Class1_Sub1_Sub11 local7445 = Static219.method2418(local781);
												if (local7445.method1916(local775) != 0) {
													throw new RuntimeException("bad command");
												}
												Static225.anIntArray502[local23++] = local7445.method1917(local775, local1057);
												continue;
											}
										} else if (local211 < 5200) {
											if (local211 == 5100) {
												if (Static188.aBooleanArray21[86]) {
													Static225.anIntArray502[local23++] = 1;
												} else {
													Static225.anIntArray502[local23++] = 0;
												}
												continue;
											}
											if (local211 == 5101) {
												if (Static188.aBooleanArray21[82]) {
													Static225.anIntArray502[local23++] = 1;
												} else {
													Static225.anIntArray502[local23++] = 0;
												}
												continue;
											}
											if (local211 == 5102) {
												if (Static188.aBooleanArray21[81]) {
													Static225.anIntArray502[local23++] = 1;
												} else {
													Static225.anIntArray502[local23++] = 0;
												}
												continue;
											}
										} else if (local211 < 5300) {
											if (local211 == 5200) {
												local23--;
												Static169.method2782(Static225.anIntArray502[local23]);
												continue;
											}
											if (local211 == 5201) {
												Static225.anIntArray502[local23++] = Static175.method2905();
												continue;
											}
											if (local211 == 5202) {
												local23--;
												Static11.method179(Static225.anIntArray502[local23]);
												continue;
											}
											if (local211 == 5203) {
												local27--;
												Static97.method1526(Static73.aClass50Array63[local27]);
												continue;
											}
											if (local211 == 5204) {
												Static73.aClass50Array63[local27 - 1] = Static52.method2673(Static73.aClass50Array63[local27 - 1]);
												continue;
											}
											if (local211 == 5205) {
												local27--;
												Static101.method1575(Static73.aClass50Array63[local27]);
												continue;
											}
											if (local211 == 5206) {
												local23--;
												local781 = Static225.anIntArray502[local23];
												@Pc(7647) Class1_Sub1_Sub6 local7647 = Static104.method1597(local781 & 0x3FFF, local781 >> 14 & 0x3FFF);
												if (local7647 == null) {
													Static73.aClass50Array63[local27++] = Static136.aClass50_488;
												} else {
													Static73.aClass50Array63[local27++] = local7647.aClass50_396;
												}
												continue;
											}
											if (local211 == 5207) {
												local27--;
												@Pc(7674) Class1_Sub1_Sub6 local7674 = Static95.method1497(Static73.aClass50Array63[local27]);
												if (local7674 != null && local7674.aClass50_397 != null) {
													Static73.aClass50Array63[local27++] = local7674.aClass50_397;
													continue;
												}
												Static73.aClass50Array63[local27++] = Static136.aClass50_488;
												continue;
											}
										} else if (local211 >= 5400) {
											if (local211 < 5500) {
												if (local211 == 5400) {
													local27 -= 2;
													local1594 = Static73.aClass50Array63[local27 + 1];
													local568 = Static73.aClass50Array63[local27];
													local23--;
													local1057 = Static225.anIntArray502[local23];
													Static32.aClass1_Sub17_Sub1_1.method2182(96);
													Static32.aClass1_Sub17_Sub1_1.method2175(Static121.method1936(local568) + Static121.method1936(local1594) + 1);
													Static32.aClass1_Sub17_Sub1_1.method2174(local568);
													Static32.aClass1_Sub17_Sub1_1.method2174(local1594);
													Static32.aClass1_Sub17_Sub1_1.method2175(local1057);
													continue;
												}
												if (local211 == 5401) {
													local23 -= 2;
													Static12.aShortArray2[Static225.anIntArray502[local23]] = (short) Static232.method3502(Static225.anIntArray502[local23 + 1]);
													Static35.method551();
													Static41.method650();
													Static194.method3143();
													Static86.method1293();
													Static188.method3106();
													continue;
												}
												if (local211 == 5405) {
													local23 -= 2;
													local775 = Static225.anIntArray502[local23 + 1];
													local781 = Static225.anIntArray502[local23];
													if (local781 >= 0 && local781 < 2) {
														Static220.anIntArrayArrayArray13[local781] = new int[local775 << 1][4];
													}
													continue;
												}
												if (local211 == 5406) {
													local23 -= 7;
													local781 = Static225.anIntArray502[local23];
													local775 = Static225.anIntArray502[local23 + 1] << 1;
													local640 = Static225.anIntArray502[local23 + 4];
													local2173 = Static225.anIntArray502[local23 + 5];
													local1057 = Static225.anIntArray502[local23 + 2];
													local614 = Static225.anIntArray502[local23 + 3];
													@Pc(9717) int local9717 = Static225.anIntArray502[local23 + 6];
													if (local781 >= 0 && local781 < 2 && Static220.anIntArrayArrayArray13[local781] != null && local775 >= 0 && Static220.anIntArrayArrayArray13[local781].length > local775) {
														Static220.anIntArrayArrayArray13[local781][local775] = new int[] { (local1057 >> 14 & 0x3FFF) * 128, local614, (local1057 & 0x3FFF) * 128, local9717 };
														Static220.anIntArrayArrayArray13[local781][local775 + 1] = new int[] { (local640 >> 14 & 0x3FFF) * 128, local2173, (local640 & 0x3FFF) * 128 };
													}
													continue;
												}
												if (local211 == 5407) {
													local23--;
													local781 = Static220.anIntArrayArrayArray13[Static225.anIntArray502[local23]].length >> 1;
													Static225.anIntArray502[local23++] = local781;
													continue;
												}
												if (local211 == 5408) {
													Static225.anIntArray502[local23++] = 0;
													continue;
												}
												if (local211 == 5409) {
													Static23.method330();
													continue;
												}
												if (local211 == 5411) {
													if (Static69.aFrame1 == null) {
														Static124.method1979(Static5.method80(), false);
													} else {
														System.exit(0);
													}
													continue;
												}
												if (local211 == 5419) {
													local568 = Static136.aClass50_488;
													if (Static179.aClass116_7 != null) {
														local568 = Static125.method2000(Static179.aClass116_7.anInt4154);
														try {
															if (Static179.aClass116_7.anObject5 != null) {
																@Pc(9882) byte[] local9882 = ((String) Static179.aClass116_7.anObject5).getBytes("ISO-8859-1");
																local568 = Static20.method301(local9882.length, 0, local9882);
															}
														} catch (@Pc(9891) UnsupportedEncodingException local9891) {
														}
													}
													Static73.aClass50Array63[local27++] = local568;
													continue;
												}
												if (local211 == 5420) {
													Static225.anIntArray502[local23++] = Static201.anInt4058 == 2 ? 1 : 0;
													continue;
												}
												if (local211 == 5421) {
													local27--;
													local568 = Static73.aClass50Array63[local27];
													local23--;
													local1200 = Static225.anIntArray502[local23] == 1;
													Static124.method1979(Static17.method257(new Class50[] { Static5.method80(), local568 }), local1200);
													continue;
												}
												if (local211 == 5422) {
													local27 -= 2;
													local1594 = Static73.aClass50Array63[local27 + 1];
													local568 = Static73.aClass50Array63[local27];
													local23--;
													local1057 = Static225.anIntArray502[local23];
													if (local568.method1249() > 0) {
														if (Static73.aClass50Array62 == null) {
															Static73.aClass50Array62 = new Class50[Static234.anIntArray521[Static186.anInt4481]];
														}
														Static73.aClass50Array62[local1057] = local568;
													}
													if (local1594.method1249() > 0) {
														if (Static185.aClass50Array72 == null) {
															Static185.aClass50Array72 = new Class50[Static234.anIntArray521[Static186.anInt4481]];
														}
														Static185.aClass50Array72[local1057] = local1594;
													}
													continue;
												}
											} else if (local211 < 5600) {
												if (local211 == 5500) {
													local23 -= 4;
													local781 = Static225.anIntArray502[local23];
													local1057 = Static225.anIntArray502[local23 + 2];
													local614 = Static225.anIntArray502[local23 + 3];
													local775 = Static225.anIntArray502[local23 + 1];
													Static25.method366(local775, local1057, false, (local781 >> 14 & 0x3FFF) - Static91.anInt4078, local614, (local781 & 0x3FFF) - Static101.anInt2041);
													continue;
												}
												if (local211 == 5501) {
													local23 -= 4;
													local781 = Static225.anIntArray502[local23];
													local775 = Static225.anIntArray502[local23 + 1];
													local1057 = Static225.anIntArray502[local23 + 2];
													local614 = Static225.anIntArray502[local23 + 3];
													Static45.method690(local1057, local614, (local781 & 0x3FFF) - Static101.anInt2041, local775, (local781 >> 14 & 0x3FFF) - Static91.anInt4078);
													continue;
												}
												if (local211 == 5502) {
													local23 -= 6;
													local781 = Static225.anIntArray502[local23];
													if (local781 >= 2) {
														throw new RuntimeException();
													}
													Static217.anInt4288 = local781;
													local775 = Static225.anIntArray502[local23 + 1];
													if (Static220.anIntArrayArrayArray13[Static217.anInt4288].length >> 1 <= local775 + 1) {
														throw new RuntimeException();
													}
													Static6.anInt108 = 0;
													Static129.anInt2543 = local775;
													Static150.anInt3128 = Static225.anIntArray502[local23 + 2];
													Static22.anInt422 = Static225.anIntArray502[local23 + 3];
													local1057 = Static225.anIntArray502[local23 + 4];
													if (local1057 >= 2) {
														throw new RuntimeException();
													}
													Static144.anInt2937 = local1057;
													local614 = Static225.anIntArray502[local23 + 5];
													if (local614 + 1 >= Static220.anIntArrayArrayArray13[Static144.anInt2937].length >> 1) {
														throw new RuntimeException();
													}
													Static196.anInt3983 = local614;
													Static28.anInt544 = 3;
													continue;
												}
												if (local211 == 5503) {
													Static42.method670();
													continue;
												}
												if (local211 == 5504) {
													local23 -= 2;
													Static176.anInt3690 = Static225.anIntArray502[local23];
													Static104.anInt2068 = Static225.anIntArray502[local23 + 1];
													Static56.method823();
													continue;
												}
												if (local211 == 5505) {
													Static225.anIntArray502[local23++] = Static176.anInt3690;
													continue;
												}
												if (local211 == 5506) {
													Static225.anIntArray502[local23++] = Static104.anInt2068;
													continue;
												}
											} else if (local211 < 5700) {
												if (local211 == 5600) {
													local27 -= 2;
													local1594 = Static73.aClass50Array63[local27 + 1];
													local568 = Static73.aClass50Array63[local27];
													local23--;
													local1057 = Static225.anIntArray502[local23];
													if (Static220.anInt4304 == 10 && Static226.anInt4351 == 0 && Static2.anInt52 == 0) {
														Static57.method839(local1594, local568, local1057);
													}
													continue;
												}
												if (local211 == 5601) {
													Static94.method3473();
													continue;
												}
												if (local211 == 5602) {
													if (Static226.anInt4351 == 0) {
														Static133.anInt2753 = -2;
													}
													continue;
												}
												if (local211 == 5603) {
													local23 -= 4;
													if (Static220.anInt4304 == 10 && Static226.anInt4351 == 0 && Static2.anInt52 == 0) {
														Static76.method1102(Static225.anIntArray502[local23 + 3], Static225.anIntArray502[local23], Static225.anIntArray502[local23 + 1], Static225.anIntArray502[local23 + 2]);
													}
													continue;
												}
												if (local211 == 5604) {
													local27--;
													if (Static220.anInt4304 == 10 && Static226.anInt4351 == 0 && Static2.anInt52 == 0) {
														Static56.method820(Static73.aClass50Array63[local27].method1221());
													}
													continue;
												}
												if (local211 == 5605) {
													local27 -= 2;
													local23 -= 4;
													if (Static220.anInt4304 == 10 && Static226.anInt4351 == 0 && Static2.anInt52 == 0) {
														Static69.method1010(Static225.anIntArray502[local23 + 3], Static225.anIntArray502[local23 + 1], Static225.anIntArray502[local23 + 2], Static73.aClass50Array63[local27].method1221(), Static225.anIntArray502[local23], Static73.aClass50Array63[local27 + 1]);
													}
													continue;
												}
												if (local211 == 5606) {
													if (Static2.anInt52 == 0) {
														Static151.anInt3156 = -2;
													}
													continue;
												}
												if (local211 == 5607) {
													Static225.anIntArray502[local23++] = Static133.anInt2753;
													continue;
												}
												if (local211 == 5608) {
													Static225.anIntArray502[local23++] = Static193.anInt3061;
													continue;
												}
												if (local211 == 5609) {
													Static225.anIntArray502[local23++] = Static151.anInt3156;
													continue;
												}
												if (local211 == 5610) {
													for (local781 = 0; local781 < 5; local781++) {
														Static73.aClass50Array63[local27++] = Static184.aClass50Array71.length > local781 ? Static184.aClass50Array71[local781] : Static136.aClass50_488;
													}
													Static184.aClass50Array71 = null;
													continue;
												}
											} else if (local211 < 6100) {
												if (local211 == 6001) {
													local23--;
													local781 = Static225.anIntArray502[local23];
													if (local781 < 1) {
														local781 = 1;
													}
													if (local781 > 4) {
														local781 = 4;
													}
													Static231.anInt4421 = local781;
													if (Static231.anInt4421 == 1) {
														Static215.method3361(0.9F);
													}
													if (Static231.anInt4421 == 2) {
														Static215.method3361(0.8F);
													}
													if (Static231.anInt4421 == 3) {
														Static215.method3361(0.7F);
													}
													if (Static231.anInt4421 == 4) {
														Static215.method3361(0.6F);
													}
													Static41.method650();
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6002) {
													local23--;
													Static14.method197(Static225.anIntArray502[local23] == 1);
													Static61.method919();
													Static86.method1288();
													Static49.method763();
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6003) {
													local23--;
													Static34.aBoolean18 = Static225.anIntArray502[local23] == 1;
													Static49.method763();
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6005) {
													local23--;
													Static24.aBoolean14 = Static225.anIntArray502[local23] == 1;
													Static86.method1288();
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6006) {
													local23--;
													Static205.aBoolean196 = Static225.anIntArray502[local23] == 1;
													((Class82) Static215.anInterface4_3).method2513(!Static205.aBoolean196);
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6007) {
													local23--;
													Static125.aBoolean111 = Static225.anIntArray502[local23] == 1;
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6008) {
													local23--;
													Static74.aBoolean69 = Static225.anIntArray502[local23] == 1;
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6009) {
													local23--;
													Static148.aBoolean130 = Static225.anIntArray502[local23] == 1;
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6010) {
													local23--;
													Static35.aBoolean27 = Static225.anIntArray502[local23] == 1;
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6011) {
													local23--;
													local781 = Static225.anIntArray502[local23];
													if (local781 < 0 || local781 > 2) {
														local781 = 0;
													}
													Static214.anInt4250 = local781;
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6012) {
													local23--;
													Static129.aBoolean113 = Static225.anIntArray502[local23] == 1;
													if (Static231.anInt4421 == 1) {
														Static215.method3361(0.9F);
													}
													if (Static231.anInt4421 == 2) {
														Static215.method3361(0.8F);
													}
													if (Static231.anInt4421 == 3) {
														Static215.method3361(0.7F);
													}
													if (Static231.anInt4421 == 4) {
														Static215.method3361(0.6F);
													}
													Static86.method1288();
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6014) {
													local23--;
													Static70.aBoolean65 = Static225.anIntArray502[local23] == 1;
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6015) {
													local23--;
													Static137.aBoolean119 = Static225.anIntArray502[local23] == 1;
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6016) {
													local23--;
													local781 = Static225.anIntArray502[local23];
													if (local781 < 0 || local781 > 2) {
														local781 = 0;
													}
													Static207.anInt4148 = local781;
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6017) {
													local23--;
													Static151.aBoolean134 = Static225.anIntArray502[local23] == 1;
													Static86.method1294();
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6018) {
													local23--;
													local781 = Static225.anIntArray502[local23];
													if (local781 < 0) {
														local781 = 0;
													}
													if (local781 > 127) {
														local781 = 127;
													}
													Static172.anInt3511 = local781;
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6019) {
													local23--;
													local781 = Static225.anIntArray502[local23];
													if (local781 < 0) {
														local781 = 0;
													}
													if (local781 > 255) {
														local781 = 255;
													}
													if (Static152.anInt3168 != local781) {
														if (Static152.anInt3168 == 0 && Static35.anInt737 != -1) {
															Static200.method3205(local781, Static35.anInt737, Static58.aClass86_Sub1_9);
															Static159.aBoolean199 = false;
														} else if (local781 == 0) {
															Static144.method2380();
															Static159.aBoolean199 = false;
														} else {
															Static83.method1865(local781);
														}
														Static152.anInt3168 = local781;
													}
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6020) {
													local23--;
													local781 = Static225.anIntArray502[local23];
													if (local781 < 0) {
														local781 = 0;
													}
													if (local781 > 127) {
														local781 = 127;
													}
													Static146.anInt3076 = local781;
													Static79.method2553(Static4.aClass87_1);
													Static91.aBoolean192 = false;
													continue;
												}
												if (local211 == 6021) {
													local23--;
													Static150.aBoolean132 = Static225.anIntArray502[local23] == 1;
													Static49.method763();
													continue;
												}
											} else if (local211 < 6200) {
												if (local211 == 6101) {
													Static225.anIntArray502[local23++] = Static231.anInt4421;
													continue;
												}
												if (local211 == 6102) {
													Static225.anIntArray502[local23++] = Static79.method2552() ? 1 : 0;
													continue;
												}
												if (local211 == 6103) {
													Static225.anIntArray502[local23++] = Static34.aBoolean18 ? 1 : 0;
													continue;
												}
												if (local211 == 6105) {
													Static225.anIntArray502[local23++] = Static24.aBoolean14 ? 1 : 0;
													continue;
												}
												if (local211 == 6106) {
													Static225.anIntArray502[local23++] = Static205.aBoolean196 ? 1 : 0;
													continue;
												}
												if (local211 == 6107) {
													Static225.anIntArray502[local23++] = Static125.aBoolean111 ? 1 : 0;
													continue;
												}
												if (local211 == 6108) {
													Static225.anIntArray502[local23++] = Static74.aBoolean69 ? 1 : 0;
													continue;
												}
												if (local211 == 6109) {
													Static225.anIntArray502[local23++] = Static148.aBoolean130 ? 1 : 0;
													continue;
												}
												if (local211 == 6110) {
													Static225.anIntArray502[local23++] = Static35.aBoolean27 ? 1 : 0;
													continue;
												}
												if (local211 == 6111) {
													Static225.anIntArray502[local23++] = Static214.anInt4250;
													continue;
												}
												if (local211 == 6112) {
													Static225.anIntArray502[local23++] = Static129.aBoolean113 ? 1 : 0;
													continue;
												}
												if (local211 == 6114) {
													Static225.anIntArray502[local23++] = Static70.aBoolean65 ? 1 : 0;
													continue;
												}
												if (local211 == 6115) {
													Static225.anIntArray502[local23++] = Static137.aBoolean119 ? 1 : 0;
													continue;
												}
												if (local211 == 6116) {
													Static225.anIntArray502[local23++] = Static207.anInt4148;
													continue;
												}
												if (local211 == 6117) {
													Static225.anIntArray502[local23++] = Static151.aBoolean134 ? 1 : 0;
													continue;
												}
												if (local211 == 6118) {
													Static225.anIntArray502[local23++] = Static172.anInt3511;
													continue;
												}
												if (local211 == 6119) {
													Static225.anIntArray502[local23++] = Static152.anInt3168;
													continue;
												}
												if (local211 == 6120) {
													Static225.anIntArray502[local23++] = Static146.anInt3076;
													continue;
												}
												if (local211 == 6121) {
													Static225.anIntArray502[local23++] = 0;
													continue;
												}
											} else if (local211 < 6300) {
												if (local211 == 6200) {
													local23 -= 2;
													Static66.aShort5 = (short) Static225.anIntArray502[local23];
													if (Static66.aShort5 <= 0) {
														Static66.aShort5 = 256;
													}
													Static32.aShort1 = (short) Static225.anIntArray502[local23 + 1];
													if (Static32.aShort1 <= 0) {
														Static32.aShort1 = 205;
													}
													continue;
												}
												if (local211 == 6201) {
													local23 -= 2;
													Static80.aShort9 = (short) Static225.anIntArray502[local23];
													if (Static80.aShort9 <= 0) {
														Static80.aShort9 = 256;
													}
													Static174.aShort33 = (short) Static225.anIntArray502[local23 + 1];
													if (Static174.aShort33 <= 0) {
														Static174.aShort33 = 320;
													}
													continue;
												}
												if (local211 == 6202) {
													local23 -= 4;
													Static153.aShort26 = (short) Static225.anIntArray502[local23];
													if (Static153.aShort26 <= 0) {
														Static153.aShort26 = 1;
													}
													Static32.aShort2 = (short) Static225.anIntArray502[local23 + 1];
													if (Static32.aShort2 <= 0) {
														Static32.aShort2 = 32767;
													} else if (Static153.aShort26 > Static32.aShort2) {
														Static32.aShort2 = Static153.aShort26;
													}
													Static61.aShort4 = (short) Static225.anIntArray502[local23 + 2];
													if (Static61.aShort4 <= 0) {
														Static61.aShort4 = 1;
													}
													Static74.aShort7 = (short) Static225.anIntArray502[local23 + 3];
													if (Static74.aShort7 <= 0) {
														Static74.aShort7 = 32767;
													} else if (Static61.aShort4 > Static74.aShort7) {
														Static74.aShort7 = Static61.aShort4;
													}
													continue;
												}
												if (local211 == 6203) {
													Static219.method2426(Static186.aClass93_126.anInt3600, Static186.aClass93_126.anInt3620);
													Static225.anIntArray502[local23++] = Static97.anInt1975;
													Static225.anIntArray502[local23++] = Static207.anInt4153;
													continue;
												}
												if (local211 == 6204) {
													Static225.anIntArray502[local23++] = Static80.aShort9;
													Static225.anIntArray502[local23++] = Static174.aShort33;
													continue;
												}
												if (local211 == 6205) {
													Static225.anIntArray502[local23++] = Static66.aShort5;
													Static225.anIntArray502[local23++] = Static32.aShort1;
													continue;
												}
											} else if (local211 < 6400) {
												if (local211 == 6300) {
													Static225.anIntArray502[local23++] = (int) (Static179.method2941() / 60000L);
													continue;
												}
												if (local211 == 6301) {
													Static225.anIntArray502[local23++] = (int) (Static179.method2941() / 86400000L) - 11745;
													continue;
												}
												if (local211 == 6302) {
													local23 -= 3;
													local1057 = Static225.anIntArray502[local23 + 2];
													local781 = Static225.anIntArray502[local23];
													local775 = Static225.anIntArray502[local23 + 1];
													Static85.aCalendar2.clear();
													Static85.aCalendar2.set(11, 12);
													Static85.aCalendar2.set(local1057, local775, local781);
													Static225.anIntArray502[local23++] = (int) (Static85.aCalendar2.getTime().getTime() / 86400000L) - 11745;
													continue;
												}
												if (local211 == 6303) {
													Static85.aCalendar2.clear();
													Static85.aCalendar2.setTime(new Date(Static179.method2941()));
													Static225.anIntArray502[local23++] = Static85.aCalendar2.get(1);
													continue;
												}
												if (local211 == 6304) {
													local1200 = true;
													local23--;
													local781 = Static225.anIntArray502[local23];
													if (local781 < 0) {
														local1200 = (local781 + 1) % 4 == 0;
													} else if (local781 < 1582) {
														local1200 = local781 % 4 == 0;
													} else if (local781 % 4 != 0) {
														local1200 = false;
													} else if (local781 % 100 != 0) {
														local1200 = true;
													} else if (local781 % 400 != 0) {
														local1200 = false;
													}
													Static225.anIntArray502[local23++] = local1200 ? 1 : 0;
													continue;
												}
											} else if (local211 < 6500) {
												if (local211 == 6400) {
													Static225.anIntArray502[local23++] = Static13.aBoolean11 ? 1 : 0;
													continue;
												}
												if (local211 == 6401) {
													local27--;
													local568 = Static73.aClass50Array63[local27];
													local23--;
													local775 = Static225.anIntArray502[local23];
													@Pc(8710) String local8710;
													try {
														local8710 = new String(local568.method1230(), "ISO-8859-1");
													} catch (@Pc(8712) UnsupportedEncodingException local8712) {
														local8710 = new String(local568.method1230());
													}
													if (Static13.aBoolean11) {
														if (Static18.aBrowsercontrol1 == null) {
															Static18.aBrowsercontrol1 = new browsercontrol("about:blank");
														}
														Static57.anInt1120 = local775;
														Static18.aBrowsercontrol1.method2290(local8710);
														Static122.aBoolean104 = true;
													}
													continue;
												}
												if (local211 == 6402) {
													if (Static18.aBrowsercontrol1 != null) {
														Static18.aBrowsercontrol1.method2290("about:blank");
														Static122.aBoolean104 = true;
														Static57.anInt1120 = 0;
													}
													continue;
												}
												if (local211 == 6403) {
													Static73.aClass50Array63[local27++] = Static4.aClass50_32;
													continue;
												}
												if (local211 == 6404) {
													Static73.aClass50Array63[local27++] = Static88.aClass50_587;
													continue;
												}
												if (local211 == 6405) {
													Static225.anIntArray502[local23++] = Static147.method2481() ? 1 : 0;
													continue;
												}
												if (local211 == 6406) {
													Static225.anIntArray502[local23++] = Static143.method2360() ? 1 : 0;
													continue;
												}
											}
										} else if (local211 == 5304) {
											Static225.anIntArray502[local23++] = 0;
											continue;
										}
									} else if (local211 == 4500) {
										local23 -= 2;
										local781 = Static225.anIntArray502[local23];
										local775 = Static225.anIntArray502[local23 + 1];
										local5651 = Static37.method596(local775);
										if (local5651.method1943()) {
											Static73.aClass50Array63[local27++] = Static229.method3477(local781).method3541(local5651.aClass50_831, local775);
										} else {
											Static225.anIntArray502[local23++] = Static229.method3477(local781).method3542(local775, local5651.anInt2388);
										}
										continue;
									}
								} else if (local211 == 4300) {
									local23 -= 2;
									local781 = Static225.anIntArray502[local23];
									local775 = Static225.anIntArray502[local23 + 1];
									local5651 = Static37.method596(local775);
									if (local5651.method1943()) {
										Static73.aClass50Array63[local27++] = Static162.method2710(local781).method3118(local5651.aClass50_831, local775);
									} else {
										Static225.anIntArray502[local23++] = Static162.method2710(local781).method3126(local775, local5651.anInt2388);
									}
									continue;
								}
							} else {
								if (local211 == 4100) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									local23--;
									local775 = Static225.anIntArray502[local23];
									Static73.aClass50Array63[local27++] = Static17.method257(new Class50[] { local568, Static160.method2684(local775) });
									continue;
								}
								if (local211 == 4101) {
									local27 -= 2;
									local1594 = Static73.aClass50Array63[local27 + 1];
									local568 = Static73.aClass50Array63[local27];
									Static73.aClass50Array63[local27++] = Static17.method257(new Class50[] { local568, local1594 });
									continue;
								}
								if (local211 == 4102) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									local23--;
									local775 = Static225.anIntArray502[local23];
									Static73.aClass50Array63[local27++] = Static17.method257(new Class50[] { local568, Static36.method582(local775) });
									continue;
								}
								if (local211 == 4103) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static73.aClass50Array63[local27++] = local568.method1233();
									continue;
								}
								if (local211 == 4104) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									@Pc(10253) long local10253 = ((long) local781 + 11745L) * 86400000L;
									Static85.aCalendar2.setTime(new Date(local10253));
									local614 = Static85.aCalendar2.get(5);
									local640 = Static85.aCalendar2.get(2);
									local2173 = Static85.aCalendar2.get(1);
									Static73.aClass50Array63[local27++] = Static17.method257(new Class50[] { Static160.method2684(local614), Static126.aClass50_888, Static94.aClass50Array83[local640], Static126.aClass50_888, Static160.method2684(local2173) });
									continue;
								}
								if (local211 == 4105) {
									local27 -= 2;
									local1594 = Static73.aClass50Array63[local27 + 1];
									local568 = Static73.aClass50Array63[local27];
									if (Static230.aClass20_Sub3_Sub1_3.aClass25_2 != null && Static230.aClass20_Sub3_Sub1_3.aClass25_2.aBoolean47) {
										Static73.aClass50Array63[local27++] = local1594;
										continue;
									}
									Static73.aClass50Array63[local27++] = local568;
									continue;
								}
								if (local211 == 4106) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static73.aClass50Array63[local27++] = Static160.method2684(local781);
									continue;
								}
								if (local211 == 4107) {
									local27 -= 2;
									Static225.anIntArray502[local23++] = Static73.aClass50Array63[local27].method1253(Static73.aClass50Array63[local27 + 1]);
									continue;
								}
								@Pc(10413) Class1_Sub1_Sub10_Sub1 local10413;
								@Pc(10408) byte[] local10408;
								if (local211 == 4108) {
									local23 -= 2;
									local775 = Static225.anIntArray502[local23];
									local27--;
									local568 = Static73.aClass50Array63[local27];
									local1057 = Static225.anIntArray502[local23 + 1];
									local10408 = Static25.aClass86_Sub1_2.method3325(local1057, 0);
									local10413 = new Class1_Sub1_Sub10_Sub1(local10408);
									local10413.method1832(Static208.aClass78Array7, null);
									Static225.anIntArray502[local23++] = local10413.method1829(local568, local775);
									continue;
								}
								if (local211 == 4109) {
									local23 -= 2;
									local27--;
									local568 = Static73.aClass50Array63[local27];
									local775 = Static225.anIntArray502[local23];
									local1057 = Static225.anIntArray502[local23 + 1];
									local10408 = Static25.aClass86_Sub1_2.method3325(local1057, 0);
									local10413 = new Class1_Sub1_Sub10_Sub1(local10408);
									local10413.method1832(Static208.aClass78Array7, null);
									Static225.anIntArray502[local23++] = local10413.method1822(local568, local775);
									continue;
								}
								if (local211 == 4110) {
									local27 -= 2;
									local568 = Static73.aClass50Array63[local27];
									local1594 = Static73.aClass50Array63[local27 + 1];
									local23--;
									if (Static225.anIntArray502[local23] == 1) {
										Static73.aClass50Array63[local27++] = local568;
									} else {
										Static73.aClass50Array63[local27++] = local1594;
									}
									continue;
								}
								if (local211 == 4111) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									Static73.aClass50Array63[local27++] = Static154.method1824(local568);
									continue;
								}
								if (local211 == 4112) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									local23--;
									local775 = Static225.anIntArray502[local23];
									if (local775 == -1) {
										throw new RuntimeException("null char");
									}
									Static73.aClass50Array63[local27++] = local568.method1219(local775);
									continue;
								}
								if (local211 == 4113) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static201.method3212(local781) ? 1 : 0;
									continue;
								}
								if (local211 == 4114) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static86.method1291(local781) ? 1 : 0;
									continue;
								}
								if (local211 == 4115) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static68.method1008(local781) ? 1 : 0;
									continue;
								}
								if (local211 == 4116) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static139.method2308(local781) ? 1 : 0;
									continue;
								}
								if (local211 == 4117) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									if (local568 == null) {
										Static225.anIntArray502[local23++] = 0;
									} else {
										Static225.anIntArray502[local23++] = local568.method1249();
									}
									continue;
								}
								if (local211 == 4118) {
									local23 -= 2;
									local27--;
									local568 = Static73.aClass50Array63[local27];
									local775 = Static225.anIntArray502[local23];
									local1057 = Static225.anIntArray502[local23 + 1];
									Static73.aClass50Array63[local27++] = local568.method1216(local1057, local775);
									continue;
								}
								if (local211 == 4119) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									@Pc(10710) boolean local10710 = false;
									local1594 = Static234.method3539(local568.method1249());
									for (local614 = 0; local614 < local568.method1249(); local614++) {
										local640 = local568.method1241(local614);
										if (local640 == 60) {
											local10710 = true;
										} else if (local640 == 62) {
											local10710 = false;
										} else if (!local10710) {
											local1594.method1255(local640);
										}
									}
									local1594.method1215();
									Static73.aClass50Array63[local27++] = local1594;
									continue;
								}
								if (local211 == 4120) {
									local27--;
									local568 = Static73.aClass50Array63[local27];
									local23 -= 2;
									local775 = Static225.anIntArray502[local23];
									local1057 = Static225.anIntArray502[local23 + 1];
									Static225.anIntArray502[local23++] = local568.method1239(local1057, local775);
									continue;
								}
								if (local211 == 4121) {
									local27 -= 2;
									local568 = Static73.aClass50Array63[local27];
									local1594 = Static73.aClass50Array63[local27 + 1];
									local23--;
									local1057 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = local568.method1237(local1057, local1594);
									continue;
								}
								if (local211 == 4122) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static52.method2674(local781);
									continue;
								}
								if (local211 == 4123) {
									local23--;
									local781 = Static225.anIntArray502[local23];
									Static225.anIntArray502[local23++] = Static187.method3090(local781);
									continue;
								}
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(12016) Exception local12016) {
			if (local18.aClass50_17 == null) {
				if (Static46.anInt954 != 0) {
					Static123.method1275(Static26.aClass50_199, Static136.aClass50_488, 0);
				}
				Static204.method3249(local12016, "CS2 - scr:" + local18.aLong173 + " op:" + local37);
			} else {
				@Pc(12049) Class50 local12049 = Static234.method3539(30);
				local12049.method1259(Static224.aClass50_29).method1259(local18.aClass50_17);
				for (local51 = Static163.anInt3371 - 1; local51 >= 0; local51--) {
					local12049.method1259(Static20.aClass50_162).method1259(Static230.aClass2Array2[local51].aClass1_Sub1_Sub1_1.aClass50_17);
				}
				if (local37 == 40) {
					local64 = local35[local32];
					local12049.method1259(Static53.aClass50_380).method1259(Static160.method2684(local64));
				}
				if (Static46.anInt954 != 0) {
					Static123.method1275(Static17.method257(new Class50[] { Static218.aClass50_1182, local18.aClass50_17 }), Static136.aClass50_488, 0);
				}
				Static204.method3249(local12016, "CS2 - scr:" + local18.aLong173 + " op:" + local37 + new String(local12049.method1230()));
			}
		}
	}
}

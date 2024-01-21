import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!of", name = "c", descriptor = "I")
	public static int anInt2744;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "I")
	public static int anInt2747;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt2745 = -1;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!tg;")
	public static Class81 aClass81_990 = Static120.method2057("Mitglieder)2Welt");

	@OriginalMember(owner = "client!of", name = "i", descriptor = "I")
	public static int anInt2746 = 0;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	public static int anInt2751 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method2146() {
		@Pc(18) int local18;
		for (@Pc(11) int local11 = -1; local11 < Static25.anInt645; local11++) {
			if (local11 == -1) {
				local18 = 2047;
			} else {
				local18 = Static176.anIntArray423[local11];
			}
			@Pc(28) Class1_Sub2_Sub1_Sub3_Sub1 local28 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local18];
			if (local28 != null && local28.anInt3035 > 0) {
				local28.anInt3035--;
				if (local28.anInt3035 == 0) {
					local28.aClass81_1088 = null;
				}
			}
		}
		for (local18 = 0; local18 < Static35.anInt962; local18++) {
			@Pc(67) int local67 = Static85.anIntArray15[local18];
			@Pc(71) Class1_Sub2_Sub1_Sub3_Sub2 local71 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local67];
			if (local71 != null && local71.anInt3035 > 0) {
				local71.anInt3035--;
				if (local71.anInt3035 == 0) {
					local71.aClass81_1088 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILclient!gf;IIII)V")
	public static void method2147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class28 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(5) Class1_Sub2_Sub8 local5 = Static14.method220(arg3);
		@Pc(18) int local18;
		@Pc(21) int local21;
		if (arg0 == 1 || arg0 == 3) {
			local18 = local5.anInt1277;
			local21 = local5.anInt1237;
		} else {
			local21 = local5.anInt1277;
			local18 = local5.anInt1237;
		}
		@Pc(41) int local41;
		@Pc(50) int local50;
		if (arg1 + local18 <= 104) {
			local41 = arg1 + (local18 >> 1);
			local50 = arg1 + (local18 + 1 >> 1);
		} else {
			local50 = arg1 + 1;
			local41 = arg1;
		}
		@Pc(79) int local79;
		@Pc(73) int local73;
		if (local21 + arg7 <= 104) {
			local73 = arg7 + (local21 + 1 >> 1);
			local79 = (local21 >> 1) + arg7;
		} else {
			local79 = arg7;
			local73 = arg7 + 1;
		}
		@Pc(91) int[][] local91 = Static157.anIntArrayArrayArray7[arg6];
		@Pc(99) int local99 = (local18 << 6) + (arg1 << 7);
		@Pc(125) int local125 = local91[local50][local73] + local91[local41][local73] + local91[local50][local79] + local91[local41][local79] >> 2;
		@Pc(142) long local142 = (long) (arg0 << 20 | arg7 << 7 | arg1 | arg5 << 14 | 0x40000000);
		if (local5.anInt1256 == 0) {
			local142 |= Long.MIN_VALUE;
		}
		if (local5.anInt1251 == 1) {
			local142 |= 0x400000L;
		}
		local142 |= (long) arg3 << 32;
		@Pc(175) int local175 = (local21 << 6) + (arg7 << 7);
		@Pc(199) Class1_Sub2_Sub1 local199;
		if (arg5 == 22) {
			if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
				local199 = local5.method942(local125, 22, arg0, local175, local91, local99);
			} else {
				local199 = new Class1_Sub2_Sub1_Sub2(arg3, 22, arg0, arg6, arg1, arg7, local5.anInt1272, true, null);
			}
			Static177.method3058(arg2, arg1, arg7, local125, local199, local142);
			if (local5.anInt1261 == 1) {
				arg4.method1036(arg7, arg1);
			}
		} else if (arg5 == 10 || arg5 == 11) {
			if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
				local199 = local5.method942(local125, 10, arg0, local175, local91, local99);
			} else {
				local199 = new Class1_Sub2_Sub1_Sub2(arg3, 10, arg0, arg6, arg1, arg7, local5.anInt1272, true, null);
			}
			if (local199 != null) {
				Static170.method3006(arg2, arg1, arg7, local125, local18, local21, local199, arg5 == 11 ? 256 : 0, local142);
			}
			if (local5.anInt1261 != 0) {
				arg4.method1048(local5.aBoolean46, arg1, arg7, local21, local18);
			}
		} else if (arg5 >= 12) {
			if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
				local199 = local5.method942(local125, arg5, arg0, local175, local91, local99);
			} else {
				local199 = new Class1_Sub2_Sub1_Sub2(arg3, arg5, arg0, arg6, arg1, arg7, local5.anInt1272, true, null);
			}
			Static170.method3006(arg2, arg1, arg7, local125, 1, 1, local199, 0, local142);
			if (local5.anInt1261 != 0) {
				arg4.method1048(local5.aBoolean46, arg1, arg7, local21, local18);
			}
		} else if (arg5 == 0) {
			if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
				local199 = local5.method942(local125, 0, arg0, local175, local91, local99);
			} else {
				local199 = new Class1_Sub2_Sub1_Sub2(arg3, 0, arg0, arg6, arg1, arg7, local5.anInt1272, true, null);
			}
			Static88.method1497(arg2, arg1, arg7, local125, local199, null, Static68.anIntArray144[arg0], 0, local142);
			if (local5.anInt1261 != 0) {
				arg4.method1038(arg7, arg0, local5.aBoolean46, arg5, arg1);
			}
		} else if (arg5 == 1) {
			if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
				local199 = local5.method942(local125, 1, arg0, local175, local91, local99);
			} else {
				local199 = new Class1_Sub2_Sub1_Sub2(arg3, 1, arg0, arg6, arg1, arg7, local5.anInt1272, true, null);
			}
			Static88.method1497(arg2, arg1, arg7, local125, local199, null, Static118.anIntArray281[arg0], 0, local142);
			if (local5.anInt1261 != 0) {
				arg4.method1038(arg7, arg0, local5.aBoolean46, arg5, arg1);
			}
		} else {
			@Pc(512) int local512;
			if (arg5 == 2) {
				local512 = arg0 + 1 & 0x3;
				@Pc(549) Class1_Sub2_Sub1 local549;
				@Pc(535) Class1_Sub2_Sub1 local535;
				if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
					local535 = local5.method942(local125, 2, arg0 + 4, local175, local91, local99);
					local549 = local5.method942(local125, 2, local512, local175, local91, local99);
				} else {
					local535 = new Class1_Sub2_Sub1_Sub2(arg3, 2, arg0 + 4, arg6, arg1, arg7, local5.anInt1272, true, null);
					local549 = new Class1_Sub2_Sub1_Sub2(arg3, 2, local512, arg6, arg1, arg7, local5.anInt1272, true, null);
				}
				Static88.method1497(arg2, arg1, arg7, local125, local535, local549, Static68.anIntArray144[arg0], Static68.anIntArray144[local512], local142);
				if (local5.anInt1261 != 0) {
					arg4.method1038(arg7, arg0, local5.aBoolean46, arg5, arg1);
				}
			} else if (arg5 == 3) {
				if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
					local199 = local5.method942(local125, 3, arg0, local175, local91, local99);
				} else {
					local199 = new Class1_Sub2_Sub1_Sub2(arg3, 3, arg0, arg6, arg1, arg7, local5.anInt1272, true, null);
				}
				Static88.method1497(arg2, arg1, arg7, local125, local199, null, Static118.anIntArray281[arg0], 0, local142);
				if (local5.anInt1261 != 0) {
					arg4.method1038(arg7, arg0, local5.aBoolean46, arg5, arg1);
				}
			} else if (arg5 == 9) {
				if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
					local199 = local5.method942(local125, arg5, arg0, local175, local91, local99);
				} else {
					local199 = new Class1_Sub2_Sub1_Sub2(arg3, arg5, arg0, arg6, arg1, arg7, local5.anInt1272, true, null);
				}
				Static170.method3006(arg2, arg1, arg7, local125, 1, 1, local199, 0, local142);
				if (local5.anInt1261 != 0) {
					arg4.method1048(local5.aBoolean46, arg1, arg7, local21, local18);
				}
			} else if (arg5 == 4) {
				if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
					local199 = local5.method942(local125, 4, arg0, local175, local91, local99);
				} else {
					local199 = new Class1_Sub2_Sub1_Sub2(arg3, 4, arg0, arg6, arg1, arg7, local5.anInt1272, true, null);
				}
				Static165.method2898(arg2, arg1, arg7, local125, local199, null, Static68.anIntArray144[arg0], 0, 0, 0, local142);
			} else {
				@Pc(791) long local791;
				@Pc(827) Class1_Sub2_Sub1 local827;
				if (arg5 == 5) {
					local512 = 16;
					local791 = Static21.method421(arg2, arg1, arg7);
					if (local791 != 0L) {
						local512 = Static14.method220((int) (local791 >>> 32) & Integer.MAX_VALUE).anInt1253;
					}
					if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
						local827 = local5.method942(local125, 4, arg0, local175, local91, local99);
					} else {
						local827 = new Class1_Sub2_Sub1_Sub2(arg3, 4, arg0, arg6, arg1, arg7, local5.anInt1272, true, null);
					}
					Static165.method2898(arg2, arg1, arg7, local125, local827, null, Static68.anIntArray144[arg0], 0, local512 * Static65.anIntArray132[arg0], local512 * Static70.anIntArray148[arg0], local142);
				} else if (arg5 == 6) {
					local512 = 8;
					local791 = Static21.method421(arg2, arg1, arg7);
					if (local791 != 0L) {
						local512 = Static14.method220((int) (local791 >>> 32) & Integer.MAX_VALUE).anInt1253 / 2;
					}
					if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
						local827 = local5.method942(local125, 4, arg0 + 4, local175, local91, local99);
					} else {
						local827 = new Class1_Sub2_Sub1_Sub2(arg3, 4, arg0 + 4, arg6, arg1, arg7, local5.anInt1272, true, null);
					}
					Static165.method2898(arg2, arg1, arg7, local125, local827, null, 256, arg0, Static54.anIntArray110[arg0] * local512, local512 * Static66.anIntArray137[arg0], local142);
				} else if (arg5 == 7) {
					@Pc(959) int local959 = arg0 + 2 & 0x3;
					if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
						local199 = local5.method942(local125, 4, local959 + 4, local175, local91, local99);
					} else {
						local199 = new Class1_Sub2_Sub1_Sub2(arg3, 4, local959 + 4, arg6, arg1, arg7, local5.anInt1272, true, null);
					}
					Static165.method2898(arg2, arg1, arg7, local125, local199, null, 256, local959, 0, 0, local142);
				} else if (arg5 == 8) {
					local512 = 8;
					local791 = Static21.method421(arg2, arg1, arg7);
					@Pc(1027) int local1027 = arg0 + 2 & 0x3;
					if (local791 != 0L) {
						local512 = Static14.method220(Integer.MAX_VALUE & (int) (local791 >>> 32)).anInt1253 / 2;
					}
					@Pc(1082) Class1_Sub2_Sub1 local1082;
					if (local5.anInt1272 == -1 && local5.anIntArray108 == null) {
						local827 = local5.method942(local125, 4, arg0 + 4, local175, local91, local99);
						local1082 = local5.method942(local125, 4, local1027 + 4, local175, local91, local99);
					} else {
						local827 = new Class1_Sub2_Sub1_Sub2(arg3, 4, arg0 + 4, arg6, arg1, arg7, local5.anInt1272, true, null);
						local1082 = new Class1_Sub2_Sub1_Sub2(arg3, 4, local1027 + 4, arg6, arg1, arg7, local5.anInt1272, true, null);
					}
					Static165.method2898(arg2, arg1, arg7, local125, local827, local1082, 256, arg0, Static54.anIntArray110[arg0] * local512, Static66.anIntArray137[arg0] * local512, local142);
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public static void method2148() {
		aClass81_990 = null;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
	public static void method2149() {
		Static104.aClass1_Sub8_Sub1_2.method366(31);
		for (@Pc(30) Class1_Sub4 local30 = (Class1_Sub4) Static119.aClass5_8.method140(); local30 != null; local30 = (Class1_Sub4) Static119.aClass5_8.method132()) {
			if (local30.anInt157 == 0) {
				Static139.method2337(true, local30);
			}
		}
		if (Static46.aClass77_7 != null) {
			Static51.method913(Static46.aClass77_7);
			Static46.aClass77_7 = null;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIILclient!fb;IZJ)Z")
	public static boolean method2151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub2_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static8.anInt164 || local4 >= Static141.anInt709) {
					return false;
				}
				@Pc(25) Class1_Sub17 local25 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt1851 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class75 local49 = new Class75();
		local49.aLong118 = arg11;
		local49.anInt3155 = arg0;
		local49.anInt3152 = arg5;
		local49.anInt3159 = arg6;
		local49.anInt3156 = arg7;
		local49.aClass1_Sub2_Sub1_7 = arg8;
		local49.anInt3166 = arg9;
		local49.anInt3164 = arg1;
		local49.anInt3158 = arg2;
		local49.anInt3161 = arg1 + arg3 - 1;
		local49.anInt3165 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static167.aClass1_Sub17ArrayArrayArray1[local124][local92][local95] == null) {
						Static167.aClass1_Sub17ArrayArrayArray1[local124][local92][local95] = new Class1_Sub17(local124, local92, local95);
					}
				}
				@Pc(157) Class1_Sub17 local157 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][local92][local95];
				local157.aClass75Array2[local157.anInt1851] = local49;
				local157.anIntArray176[local157.anInt1851] = local98;
				local157.anInt1852 |= local98;
				local157.anInt1851++;
			}
		}
		if (arg10) {
			Static180.aClass75Array3[Static10.anInt233++] = local49;
		}
		return true;
	}
}

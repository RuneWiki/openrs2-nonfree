import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public static int anInt5889;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
	public static int anInt5893;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString423 = "Close";

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	public static void method4527() {
		@Pc(22) int local22 = Static175.aByteArrayArray2.length;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			if (Static175.aByteArrayArray2[local24] != null) {
				@Pc(33) int local33 = -1;
				for (@Pc(35) int local35 = 0; local35 < Static114.anInt2476; local35++) {
					if (Static12.anIntArray356[local35] == Static234.anIntArray456[local24]) {
						local33 = local35;
						break;
					}
				}
				if (local33 == -1) {
					Static12.anIntArray356[Static114.anInt2476] = Static234.anIntArray456[local24];
					local33 = Static114.anInt2476++;
				}
				@Pc(81) Class1_Sub14 local81 = new Class1_Sub14(Static175.aByteArrayArray2[local24]);
				@Pc(83) int local83 = 0;
				while (Static175.aByteArrayArray2[local24].length > local81.anInt3000 && local83 < 511 && Static147.anInt3287 < 1023) {
					@Pc(107) int local107 = local33 | local83++ << 6;
					@Pc(111) int local111 = local81.method2244();
					@Pc(115) int local115 = local111 >> 14;
					@Pc(121) int local121 = local111 >> 7 & 0x3F;
					@Pc(125) int local125 = local111 & 0x3F;
					@Pc(138) int local138 = local121 + (Static234.anIntArray456[local24] >> 8) * 64 - Static159.anInt3527;
					@Pc(151) int local151 = local125 + (Static234.anIntArray456[local24] & 0xFF) * 64 - Static217.anInt4673;
					@Pc(157) Class145 local157 = Static197.method3172(local81.method2244());
					if (Static105.aClass2_Sub4_Sub1Array1[local107] == null && (local157.aByte21 & 0x1) > 0 && local115 == Static204.anInt4430 && local138 >= 0 && local157.anInt4909 + local138 < 104 && local151 >= 0 && local151 + local157.anInt4909 < 104) {
						Static105.aClass2_Sub4_Sub1Array1[local107] = new Class2_Sub4_Sub1();
						@Pc(204) Class2_Sub4_Sub1 local204 = Static105.aClass2_Sub4_Sub1Array1[local107];
						Static100.anIntArray224[Static147.anInt3287++] = local107;
						local204.anInt2824 = Static133.anInt3061;
						local204.method1239(local157);
						local204.method2089(local204.aClass145_1.anInt4909);
						local204.anInt2823 = local204.anInt2766 = Static37.anIntArray119[local204.aClass145_1.aByte19];
						local204.anInt2797 = local204.aClass145_1.anInt4926;
						if (local204.anInt2797 == 0) {
							local204.anInt2766 = 0;
						}
						local204.anInt2832 = local204.aClass145_1.anInt4933;
						local204.method2087(true, local138, local204.method2088(), local151);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
	public static void method4528(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub3_Sub22 local9 = Static271.method4108(3, arg0);
		local9.method4464();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!kc;IIZIIIII)V")
	public static void method4529(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) int local9 = arg6 & 0x3;
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (local9 == 1 || local9 == 3) {
			local20 = arg0.anInt3227;
			local23 = arg0.anInt3182;
		} else {
			local20 = arg0.anInt3182;
			local23 = arg0.anInt3227;
		}
		@Pc(44) int local44;
		@Pc(52) int local52;
		if (local23 + arg3 <= 104) {
			local44 = (local23 >> 1) + arg3;
			local52 = (local23 + 1 >> 1) + arg3;
		} else {
			local52 = arg3 + 1;
			local44 = arg3;
		}
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (arg1 + local20 > 104) {
			local70 = arg1;
			local74 = arg1 + 1;
		} else {
			local74 = (local20 + 1 >> 1) + arg1;
			local70 = (local20 >> 1) + arg1;
		}
		@Pc(94) int[][] local94 = Static46.anIntArrayArrayArray1[arg5];
		@Pc(102) int local102 = (local20 << 6) + (arg1 << 7);
		@Pc(104) int local104 = 0;
		@Pc(112) int local112 = (local23 << 6) + (arg3 << 7);
		@Pc(138) int local138 = local94[local44][local70] + local94[local52][local70] + local94[local44][local74] + local94[local52][local74] >> 2;
		@Pc(145) int[][] local145;
		if (arg5 != 0) {
			local145 = Static46.anIntArrayArrayArray1[0];
			local104 = local138 - (local145[local44][local70] + local145[local52][local70] + local145[local44][local74] + local145[local52][local74] >> 2);
		}
		local145 = null;
		if (arg5 < 3) {
			local145 = Static46.anIntArrayArrayArray1[arg5 + 1];
		}
		@Pc(202) Class128 local202 = arg0.method2325(null, local94, false, local145, arg4, true, local112, arg6, local102, local138);
		Static177.method2837(local202.aClass46_Sub1_4, local112 - arg2, local104, local102 - arg7);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZIIIILclient!qm;ZIII)V")
	public static void method4530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class1_Sub14 arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(33) int local33;
		if (arg4 < 0 || arg4 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				local33 = arg7.method2199();
				if (local33 == 0) {
					break;
				}
				if (local33 == 1) {
					arg7.method2199();
					break;
				}
				if (local33 <= 49) {
					arg7.method2199();
				}
			}
			return;
		}
		if (!arg2 && !arg8) {
			Static303.aByteArrayArrayArray19[arg0][arg4][arg3] = 0;
		}
		while (true) {
			local33 = arg7.method2199();
			if (local33 == 0) {
				if (arg2) {
					Static46.anIntArrayArrayArray1[0][arg10 + arg4][arg3 + arg1] = Static299.anIntArrayArrayArray14[0][arg10 + arg4][arg1 + arg3];
				} else if (arg0 == 0) {
					Static46.anIntArrayArrayArray1[0][arg10 + arg4][arg1 + arg3] = -Static175.method289(arg6 + 932731, 556238 - -arg5) * 8;
				} else {
					Static46.anIntArrayArrayArray1[arg0][arg10 + arg4][arg1 + arg3] = Static46.anIntArrayArrayArray1[arg0 - 1][arg4 + arg10][arg1 + arg3] - 240;
				}
				break;
			}
			if (local33 == 1) {
				@Pc(132) int local132 = arg7.method2199();
				if (arg2) {
					Static46.anIntArrayArrayArray1[0][arg10 + arg4][arg3 + arg1] = local132 * 8 + Static299.anIntArrayArrayArray14[0][arg4 + arg10][arg1 + arg3];
				} else {
					if (local132 == 1) {
						local132 = 0;
					}
					if (arg0 == 0) {
						Static46.anIntArrayArrayArray1[0][arg10 + arg4][arg1 + arg3] = -local132 * 8;
					} else {
						Static46.anIntArrayArrayArray1[arg0][arg10 + arg4][arg1 + arg3] = Static46.anIntArrayArrayArray1[arg0 - 1][arg10 + arg4][arg3 + arg1] - local132 * 8;
					}
				}
				break;
			}
			if (local33 > 49) {
				if (local33 <= 81) {
					if (!arg2 && !arg8) {
						Static303.aByteArrayArrayArray19[arg0][arg4][arg3] = (byte) (local33 - 49);
					}
				} else if (!arg8) {
					Static257.aByteArrayArrayArray15[arg0][arg4][arg3] = (byte) (local33 - 81);
				}
			} else if (arg8) {
				arg7.method2199();
			} else {
				Static266.aByteArrayArrayArray16[arg0][arg4][arg3] = arg7.method2212();
				Static43.aByteArrayArrayArray1[arg0][arg4][arg3] = (byte) ((local33 - 2) / 4);
				Static111.aByteArrayArrayArray3[arg0][arg4][arg3] = (byte) (arg9 + local33 - 2 & 0x3);
			}
		}
	}
}

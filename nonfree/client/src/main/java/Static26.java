import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt3084 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILclient!ij;JLclient!ij;Lclient!ij;)V")
	public static void method2451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) Class5 arg7) {
		@Pc(3) Class115 local3 = new Class115();
		local3.aClass5_8 = arg4;
		local3.anInt4450 = arg1 * 128 + 64;
		local3.anInt4443 = arg2 * 128 + 64;
		local3.anInt4441 = arg3;
		local3.aLong161 = arg5;
		local3.aClass5_7 = arg6;
		local3.aClass5_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub7 local42 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1124; local46++) {
				@Pc(52) Class83 local52 = local42.aClass83Array3[local46];
				if ((local52.aLong118 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass5_5.method3680();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt4452 = -local34;
		if (Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub7(arg0, arg1, arg2);
		}
		Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass115_1 = local3;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method2452() {
		Static217.aClass53_30.method1498();
		Static55.aClass53_10.method1498();
		Static217.aClass53_29.method1498();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
	public static void method2453() {
		@Pc(3) int local3 = Static92.anIntArray128[Static197.anInt2420];
		@Pc(7) Class31[] local7 = Static92.aClass31ArrayArray1[Static197.anInt2420];
		Static30.anInt2194 = 0;
		label187: for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class31 local16 = local7[local11];
			@Pc(20) int local20;
			if (Static139.anIntArray208 != null) {
				for (local20 = 0; local20 < Static139.anIntArray208.length; local20++) {
					if (Static139.anIntArray208[local20] != -1000000 && (local16.anInt1138 <= Static139.anIntArray208[local20] || local16.anInt1148 <= Static139.anIntArray208[local20]) && (local16.anInt1146 <= Static126.anIntArray172[local20] || local16.anInt1135 <= Static126.anIntArray172[local20]) && (local16.anInt1146 >= Static181.anIntArray300[local20] || local16.anInt1135 >= Static181.anIntArray300[local20]) && (local16.anInt1137 <= Static80.anIntArray112[local20] || local16.anInt1154 <= Static80.anIntArray112[local20]) && (local16.anInt1137 >= Static163.anIntArray230[local20] || local16.anInt1154 >= Static163.anIntArray230[local20])) {
						continue label187;
					}
				}
			}
			@Pc(118) int local118;
			@Pc(129) int local129;
			@Pc(161) int local161;
			@Pc(140) boolean local140;
			if (local16.anInt1136 == 1) {
				local20 = local16.anInt1152 + Static62.anInt1432 - Static72.anInt1643;
				if (local20 >= 0 && local20 <= Static62.anInt1432 + Static62.anInt1432) {
					local118 = local16.anInt1149 + Static62.anInt1432 - Static220.anInt4646;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt1150 + Static62.anInt1432 - Static220.anInt4646;
					if (local129 > Static62.anInt1432 + Static62.anInt1432) {
						local129 = Static62.anInt1432 + Static62.anInt1432;
					}
					local140 = false;
					while (local118 <= local129) {
						if (Static165.aBooleanArrayArray1[local20][local118++]) {
							local140 = true;
							break;
						}
					}
					if (local140) {
						local161 = Static155.anInt3423 - local16.anInt1146;
						if (local161 > 32) {
							local16.anInt1155 = 1;
						} else {
							if (local161 >= -32) {
								continue;
							}
							local16.anInt1155 = 2;
							local161 = -local161;
						}
						local16.anInt1139 = (local16.anInt1137 - Static70.anInt1623 << 8) / local161;
						local16.anInt1140 = (local16.anInt1154 - Static70.anInt1623 << 8) / local161;
						local16.anInt1141 = (local16.anInt1138 - Static115.anInt2533 << 8) / local161;
						local16.anInt1145 = (local16.anInt1148 - Static115.anInt2533 << 8) / local161;
						Static19.aClass31Array2[Static30.anInt2194++] = local16;
					}
				}
			} else if (local16.anInt1136 == 2) {
				local20 = local16.anInt1149 + Static62.anInt1432 - Static220.anInt4646;
				if (local20 >= 0 && local20 <= Static62.anInt1432 + Static62.anInt1432) {
					local118 = local16.anInt1152 + Static62.anInt1432 - Static72.anInt1643;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt1151 + Static62.anInt1432 - Static72.anInt1643;
					if (local129 > Static62.anInt1432 + Static62.anInt1432) {
						local129 = Static62.anInt1432 + Static62.anInt1432;
					}
					local140 = false;
					while (local118 <= local129) {
						if (Static165.aBooleanArrayArray1[local118++][local20]) {
							local140 = true;
							break;
						}
					}
					if (local140) {
						local161 = Static70.anInt1623 - local16.anInt1137;
						if (local161 > 32) {
							local16.anInt1155 = 3;
						} else {
							if (local161 >= -32) {
								continue;
							}
							local16.anInt1155 = 4;
							local161 = -local161;
						}
						local16.anInt1144 = (local16.anInt1146 - Static155.anInt3423 << 8) / local161;
						local16.anInt1134 = (local16.anInt1135 - Static155.anInt3423 << 8) / local161;
						local16.anInt1141 = (local16.anInt1138 - Static115.anInt2533 << 8) / local161;
						local16.anInt1145 = (local16.anInt1148 - Static115.anInt2533 << 8) / local161;
						Static19.aClass31Array2[Static30.anInt2194++] = local16;
					}
				}
			} else if (local16.anInt1136 == 4) {
				local20 = local16.anInt1138 - Static115.anInt2533;
				if (local20 > 128) {
					local118 = local16.anInt1149 + Static62.anInt1432 - Static220.anInt4646;
					if (local118 < 0) {
						local118 = 0;
					}
					local129 = local16.anInt1150 + Static62.anInt1432 - Static220.anInt4646;
					if (local129 > Static62.anInt1432 + Static62.anInt1432) {
						local129 = Static62.anInt1432 + Static62.anInt1432;
					}
					if (local118 <= local129) {
						@Pc(411) int local411 = local16.anInt1152 + Static62.anInt1432 - Static72.anInt1643;
						if (local411 < 0) {
							local411 = 0;
						}
						local161 = local16.anInt1151 + Static62.anInt1432 - Static72.anInt1643;
						if (local161 > Static62.anInt1432 + Static62.anInt1432) {
							local161 = Static62.anInt1432 + Static62.anInt1432;
						}
						@Pc(433) boolean local433 = false;
						label159: for (@Pc(435) int local435 = local411; local435 <= local161; local435++) {
							for (@Pc(438) int local438 = local118; local438 <= local129; local438++) {
								if (Static165.aBooleanArrayArray1[local435][local438]) {
									local433 = true;
									break label159;
								}
							}
						}
						if (local433) {
							local16.anInt1155 = 5;
							local16.anInt1144 = (local16.anInt1146 - Static155.anInt3423 << 8) / local20;
							local16.anInt1134 = (local16.anInt1135 - Static155.anInt3423 << 8) / local20;
							local16.anInt1139 = (local16.anInt1137 - Static70.anInt1623 << 8) / local20;
							local16.anInt1140 = (local16.anInt1154 - Static70.anInt1623 << 8) / local20;
							Static19.aClass31Array2[Static30.anInt2194++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBI)I")
	public static int method2454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(35) int local35 = arg0;
		@Pc(39) int local39 = arg2 & 0x7F;
		if (arg0 < 3 && (Static150.aByteArrayArrayArray9[1][local11][local7] & 0x2) == 2) {
			local35 = arg0 + 1;
		}
		@Pc(81) int local81 = local39 * Static20.anIntArrayArrayArray2[local35][local11 + 1][local7] + Static20.anIntArrayArrayArray2[local35][local11][local7] * (128 - local39) >> 7;
		@Pc(113) int local113 = Static20.anIntArrayArrayArray2[local35][local11][local7 + 1] * (128 - local39) + local39 * Static20.anIntArrayArrayArray2[local35][local11 + 1][local7 + 1] >> 7;
		@Pc(117) int local117 = arg1 & 0x7F;
		return (128 - local117) * local81 + local117 * local113 >> 7;
	}
}

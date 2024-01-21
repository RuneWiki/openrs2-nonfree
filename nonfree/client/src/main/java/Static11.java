import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "Lclient!ac;")
	public static Class4 aClass4_2;

	@OriginalMember(owner = "client!bf", name = "Ob", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_14;

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][105][105];

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1027 = Static80.method1463("Enter amount:");

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1026 = aClass63_1027;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	public static int anInt1914 = 0;

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "[I")
	public static int[] anIntArray222 = new int[50];

	@OriginalMember(owner = "client!bf", name = "Wb", descriptor = "I")
	public static int anInt1969 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!rd;Lclient!rd;Lclient!rd;I)V")
	public static void method1282(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class63 arg2) {
		Static49.aClass63_795 = arg0;
		Static49.aClass63_799 = arg1;
		Static49.aClass63_789 = arg2;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
	public static void method1286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static36.method866(arg1)) {
			Static51.method1068(arg5, arg0, Static68.aClass6_Sub3_Sub17ArrayArray1[arg1], 0, arg2, 0, arg4, -1, arg3);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)I")
	public static int method1287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class6_Sub3_Sub3_Sub4.anIntArray342[arg1 * 1024 / arg3] >> 1;
		return (local20 * arg0 >> 16) + ((65536 - local20) * arg2 >> 16);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!bf;I)Lclient!rd;")
	public static Class63 method1296(@OriginalArg(0) Class6_Sub4 arg0) {
		return Static31.method800(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
	public static void method1299() {
		anIntArray222 = null;
		aClass6_Sub3_Sub3_Sub3_14 = null;
		aClass4_2 = null;
		aClass63_1027 = null;
		anIntArrayArrayArray6 = null;
		aClass63_1026 = null;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(II)Z")
	public static boolean method1309(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(II)I")
	public static int method1325(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(IZ)V")
	public static void method1338(@OriginalArg(1) boolean arg0) {
		Static69.aBoolean105 = arg0;
		@Pc(15) int local15;
		@Pc(19) int local19;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(39) int local39;
		@Pc(132) int local132;
		@Pc(155) int local155;
		@Pc(159) int local159;
		@Pc(163) int local163;
		if (!Static69.aBoolean105) {
			local15 = Static88.aClass6_Sub4_Sub1_5.method1335();
			local19 = Static88.aClass6_Sub4_Sub1_5.method1321();
			local24 = Static88.aClass6_Sub4_Sub1_5.method1306();
			local28 = Static88.aClass6_Sub4_Sub1_5.method1295();
			local32 = (Static14.anInt464 - Static88.aClass6_Sub4_Sub1_5.anInt1949) / 16;
			Static97.anIntArrayArray35 = new int[local32][4];
			for (local39 = 0; local39 < local32; local39++) {
				for (local132 = 0; local132 < 4; local132++) {
					Static97.anIntArrayArray35[local39][local132] = Static88.aClass6_Sub4_Sub1_5.method1318();
				}
			}
			local132 = Static88.aClass6_Sub4_Sub1_5.method1300();
			@Pc(379) boolean local379 = false;
			Static6.anIntArray15 = new int[local32];
			if ((local15 / 8 == 48 || local15 / 8 == 49) && (local132 / 8) == 48) {
				local379 = true;
			}
			Static25.anIntArray76 = new int[local32];
			Static60.aByteArrayArray5 = new byte[local32][];
			Static41.anIntArray145 = new int[local32];
			Static98.aByteArrayArray8 = new byte[local32][];
			local32 = 0;
			if (local15 / 8 == 48 && local132 / 8 == 148) {
				local379 = true;
			}
			for (local155 = (local15 - 6) / 8; local155 <= (local15 + 6) / 8; local155++) {
				for (local159 = (local132 - 6) / 8; local159 <= (local132 + 6) / 8; local159++) {
					local163 = (local155 << 8) + local159;
					if (!local379 || local159 != 49 && local159 != 149 && local159 != 147 && local155 != 50 && (local155 != 49 || local159 != 47)) {
						Static6.anIntArray15[local32] = local163;
						Static41.anIntArray145[local32] = Static67.aClass7_Sub1_11.method91(Static15.method374(new Class63[] { Static115.aClass63_1711, Static118.method2114(local155), Static52.aClass63_844, Static118.method2114(local159) }));
						Static25.anIntArray76[local32] = Static67.aClass7_Sub1_11.method91(Static15.method374(new Class63[] { Static12.aClass63_278, Static118.method2114(local155), Static52.aClass63_844, Static118.method2114(local159) }));
						local32++;
					}
				}
			}
			Static93.method1704(local28, local132, local19, local24, local15);
			return;
		}
		local15 = Static88.aClass6_Sub4_Sub1_5.method1306();
		local19 = Static88.aClass6_Sub4_Sub1_5.method1295();
		Static88.aClass6_Sub4_Sub1_5.method1344();
		for (local24 = 0; local24 < 4; local24++) {
			for (local28 = 0; local28 < 13; local28++) {
				for (local32 = 0; local32 < 13; local32++) {
					local39 = Static88.aClass6_Sub4_Sub1_5.method1349(1);
					if (local39 == 1) {
						Static17.anIntArrayArrayArray10[local24][local28][local32] = Static88.aClass6_Sub4_Sub1_5.method1349(26);
					} else {
						Static17.anIntArrayArrayArray10[local24][local28][local32] = -1;
					}
				}
			}
		}
		Static88.aClass6_Sub4_Sub1_5.method1341();
		local28 = (Static14.anInt464 - Static88.aClass6_Sub4_Sub1_5.anInt1949) / 16;
		Static97.anIntArrayArray35 = new int[local28][4];
		for (local32 = 0; local32 < local28; local32++) {
			for (local39 = 0; local39 < 4; local39++) {
				Static97.anIntArrayArray35[local32][local39] = Static88.aClass6_Sub4_Sub1_5.method1327();
			}
		}
		local39 = Static88.aClass6_Sub4_Sub1_5.method1295();
		local132 = Static88.aClass6_Sub4_Sub1_5.method1312();
		@Pc(136) int local136 = Static88.aClass6_Sub4_Sub1_5.method1335();
		Static60.aByteArrayArray5 = new byte[local28][];
		Static41.anIntArray145 = new int[local28];
		Static6.anIntArray15 = new int[local28];
		Static98.aByteArrayArray8 = new byte[local28][];
		Static25.anIntArray76 = new int[local28];
		local28 = 0;
		for (local155 = 0; local155 < 4; local155++) {
			for (local159 = 0; local159 < 13; local159++) {
				for (local163 = 0; local163 < 13; local163++) {
					@Pc(173) int local173 = Static17.anIntArrayArrayArray10[local155][local159][local163];
					if (local173 != -1) {
						@Pc(183) int local183 = local173 >> 3 & 0x7FF;
						@Pc(189) int local189 = local173 >> 14 & 0x3FF;
						@Pc(199) int local199 = (local189 / 8 << 8) + local183 / 8;
						for (@Pc(201) int local201 = 0; local201 < local28; local201++) {
							if (local199 == Static6.anIntArray15[local201]) {
								local199 = -1;
								break;
							}
						}
						if (local199 != -1) {
							Static6.anIntArray15[local28] = local199;
							@Pc(233) int local233 = local199 >> 8 & 0xFF;
							@Pc(237) int local237 = local199 & 0xFF;
							Static41.anIntArray145[local28] = Static67.aClass7_Sub1_11.method91(Static15.method374(new Class63[] { Static115.aClass63_1711, Static118.method2114(local233), Static52.aClass63_844, Static118.method2114(local237) }));
							Static25.anIntArray76[local28] = Static67.aClass7_Sub1_11.method91(Static15.method374(new Class63[] { Static12.aClass63_278, Static118.method2114(local233), Static52.aClass63_844, Static118.method2114(local237) }));
							local28++;
						}
					}
				}
			}
		}
		Static93.method1704(local15, local136, local132, local39, local19);
	}
}

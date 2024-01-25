import java.awt.Container;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "Lclient!am;")
	public static Class11 aClass11_39;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!mk;")
	public static final Class130 aClass130_28 = new Class130();

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString54 = "Loading defaults - ";

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIILclient!lo;IIIILclient!lo;)V")
	public static void method1409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class2_Sub2_Sub1 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class2_Sub2_Sub1 arg6) {
		@Pc(7) int local7 = arg6.method5436();
		if (local7 == -1) {
			return;
		}
		@Pc(22) Class60 local22 = (Class60) Static46.aClass154_14.method4222((long) local7);
		if (local22 == null) {
			@Pc(29) Class206[] local29 = Static367.method5454(Static292.aClass11_130, local7);
			if (local29 == null) {
				return;
			}
			local22 = Static164.aClass92_7.method4506(local29[0]);
			Static46.aClass154_14.method4221((long) local7, local22);
		}
		Static346.method5622(arg2.method5425() * 64, arg2.anInt6466, arg2.anInt6465, arg4 >> 1, 0, arg3 >> 1);
		@Pc(73) int local73 = arg1 + Static257.anIntArray436[0] - 18;
		@Pc(81) int local81 = local73 + arg0 / 4 * 18;
		@Pc(91) int local91 = Static257.anIntArray436[1] + arg5 - 16 - 54;
		@Pc(99) int local99 = local91 + arg0 % 4 * 18;
		local22.method5675(local81, local99);
		if (arg2 == arg6) {
			Static164.aClass92_7.method4522(18, 18, local81 - 1, local99 - 1, -256);
		}
		@Pc(121) Class17_Sub4 local121 = Static281.method4830();
		local121.aClass2_Sub2_Sub1_1 = arg6;
		local121.anInt2754 = local99 + 16;
		local121.anInt2757 = local81;
		local121.anInt2755 = local81 + 16;
		local121.anInt2758 = local99;
		Static145.aClass204_7.method5365(local121);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIBLclient!qs;IIIII)Z")
	public static boolean method1410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class174 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg7 - 64;
		@Pc(23) int local23 = arg0 - 64;
		Static36.anIntArrayArray11[64][64] = 99;
		Static218.anIntArrayArray41[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static304.anIntArray499[0] = arg7;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local37 + 1;
		Static333.anIntArray5[0] = arg0;
		@Pc(56) int[][] local56 = arg4.anIntArrayArray53;
		while (local48 != local51) {
			local7 = Static304.anIntArray499[local48];
			local9 = Static333.anIntArray5[local48];
			local48 = local48 + 1 & 0xFFF;
			@Pc(76) int local76 = local7 - local18;
			@Pc(81) int local81 = local9 - local23;
			@Pc(87) int local87 = local7 - arg4.anInt5481;
			@Pc(93) int local93 = local9 - arg4.anInt5486;
			if (arg2 == -4) {
				if (arg9 == local7 && arg1 == local9) {
					Static330.anInt6452 = local9;
					Static295.anInt5963 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static265.method4632(arg9, arg1, local7, local9, 2, 2, arg5, arg6)) {
					Static330.anInt6452 = local9;
					Static295.anInt5963 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg4.method4667(2, arg1, 2, local7, arg6, arg3, arg5, arg9, local9)) {
					Static295.anInt5963 = local7;
					Static330.anInt6452 = local9;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg4.method4653(arg1, arg6, arg9, local9, 2, arg3, local7, arg5)) {
					Static295.anInt5963 = local7;
					Static330.anInt6452 = local9;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg4.method4657(2, arg8, local7, arg2, local9, arg9, arg1)) {
					Static330.anInt6452 = local9;
					Static295.anInt5963 = local7;
					return true;
				}
			} else if (arg4.method4658(arg2, arg1, local7, arg9, 2, arg8, local9)) {
				Static295.anInt5963 = local7;
				Static330.anInt6452 = local9;
				return true;
			}
			@Pc(248) int local248 = Static218.anIntArrayArray41[local76][local81] + 1;
			if (local76 > 0 && Static36.anIntArrayArray11[local76 - 1][local81] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static304.anIntArray499[local51] = local7 - 1;
				Static333.anIntArray5[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static36.anIntArrayArray11[local76 - 1][local81] = 2;
				Static218.anIntArrayArray41[local76 - 1][local81] = local248;
			}
			if (local76 < 126 && Static36.anIntArrayArray11[local76 + 1][local81] == 0 && (local56[local87 + 2][local93] & 0x60E40000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static304.anIntArray499[local51] = local7 + 1;
				Static333.anIntArray5[local51] = local9;
				Static36.anIntArrayArray11[local76 + 1][local81] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static218.anIntArrayArray41[local76 + 1][local81] = local248;
			}
			if (local81 > 0 && Static36.anIntArrayArray11[local76][local81 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static304.anIntArray499[local51] = local7;
				Static333.anIntArray5[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static36.anIntArrayArray11[local76][local81 - 1] = 1;
				Static218.anIntArrayArray41[local76][local81 - 1] = local248;
			}
			if (local81 < 126 && Static36.anIntArrayArray11[local76][local81 + 1] == 0 && (local56[local87][local93 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static304.anIntArray499[local51] = local7;
				Static333.anIntArray5[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static36.anIntArrayArray11[local76][local81 + 1] = 4;
				Static218.anIntArrayArray41[local76][local81 + 1] = local248;
			}
			if (local76 > 0 && local81 > 0 && Static36.anIntArrayArray11[local76 - 1][local81 - 1] == 0 && (local56[local87 - 1][local93] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local87][local93 - 1] & 0x63E40000) == 0) {
				Static304.anIntArray499[local51] = local7 - 1;
				Static333.anIntArray5[local51] = local9 - 1;
				Static36.anIntArrayArray11[local76 - 1][local81 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static218.anIntArrayArray41[local76 - 1][local81 - 1] = local248;
			}
			if (local76 < 126 && local81 > 0 && Static36.anIntArrayArray11[local76 + 1][local81 - 1] == 0 && (local56[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local93] & 0x78E40000) == 0) {
				Static304.anIntArray499[local51] = local7 + 1;
				Static333.anIntArray5[local51] = local9 - 1;
				Static36.anIntArrayArray11[local76 + 1][local81 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static218.anIntArrayArray41[local76 + 1][local81 - 1] = local248;
			}
			if (local76 > 0 && local81 < 126 && Static36.anIntArrayArray11[local76 - 1][local81 + 1] == 0 && (local56[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local87][local93 + 2] & 0x7E240000) == 0) {
				Static304.anIntArray499[local51] = local7 - 1;
				Static333.anIntArray5[local51] = local9 + 1;
				Static36.anIntArrayArray11[local76 - 1][local81 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static218.anIntArrayArray41[local76 - 1][local81 + 1] = local248;
			}
			if (local76 < 126 && local81 < 126 && Static36.anIntArrayArray11[local76 + 1][local81 + 1] == 0 && (local56[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static304.anIntArray499[local51] = local7 + 1;
				Static333.anIntArray5[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static36.anIntArrayArray11[local76 + 1][local81 + 1] = 12;
				Static218.anIntArrayArray41[local76 + 1][local81 + 1] = local248;
			}
		}
		Static330.anInt6452 = local9;
		Static295.anInt5963 = local7;
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	public static void method1411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub1_Sub8 local12 = Static155.method2994(arg1, 1);
		local12.method2031();
		local12.anInt2410 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public static void method1412() {
		if (Static172.aString127.toLowerCase().indexOf("microsoft") != -1) {
			Static2.anIntArray419[222] = 59;
			Static2.anIntArray419[191] = 73;
			Static2.anIntArray419[223] = 28;
			Static2.anIntArray419[220] = 74;
			Static2.anIntArray419[221] = 43;
			Static2.anIntArray419[188] = 71;
			Static2.anIntArray419[219] = 42;
			Static2.anIntArray419[187] = 27;
			Static2.anIntArray419[190] = 72;
			Static2.anIntArray419[186] = 57;
			Static2.anIntArray419[189] = 26;
			Static2.anIntArray419[192] = 58;
			return;
		}
		Static2.anIntArray419[44] = 71;
		Static2.anIntArray419[93] = 43;
		Static2.anIntArray419[91] = 42;
		Static2.anIntArray419[92] = 74;
		Static2.anIntArray419[45] = 26;
		if (Static172.aMethod2 == null) {
			Static2.anIntArray419[192] = 58;
			Static2.anIntArray419[222] = 59;
		} else {
			Static2.anIntArray419[520] = 59;
			Static2.anIntArray419[192] = 28;
			Static2.anIntArray419[222] = 58;
		}
		Static2.anIntArray419[47] = 73;
		Static2.anIntArray419[61] = 27;
		Static2.anIntArray419[59] = 57;
		Static2.anIntArray419[46] = 72;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIZ)V")
	public static void method1413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg4) {
			Static75.method1394();
		}
		if (Static315.aFrame2 != null && (arg1 != 3 || Static143.anInt3193 != arg0 || arg2 != Static229.anInt4770)) {
			Static72.method1361(Static315.aFrame2, Static212.aClass120_3);
			Static315.aFrame2 = null;
		}
		if (arg1 == 3 && Static315.aFrame2 == null) {
			Static315.aFrame2 = Static19.method5601(arg2, 0, arg0, Static212.aClass120_3);
			if (Static315.aFrame2 != null) {
				Static143.anInt3193 = arg0;
				Static229.anInt4770 = arg2;
				Static290.method4960(Static212.aClass120_3);
			}
		}
		if (arg1 == 3 && Static315.aFrame2 == null) {
			method1413(-1, Static56.anInt1228, -1, arg3, true);
			return;
		}
		@Pc(99) Container local99;
		@Pc(77) Insets local77;
		if (Static315.aFrame2 != null) {
			Static193.anInt4171 = arg0;
			local99 = Static315.aFrame2;
			Static135.anInt3077 = arg2;
		} else if (Static350.aFrame3 == null) {
			local99 = Static212.aClass120_3.anApplet1;
			Static193.anInt4171 = local99.getSize().width;
			Static135.anInt3077 = local99.getSize().height;
		} else {
			local77 = Static350.aFrame3.getInsets();
			Static193.anInt4171 = Static350.aFrame3.getSize().width - local77.left - local77.right;
			@Pc(95) int local95 = local77.top + local77.bottom;
			Static135.anInt3077 = Static350.aFrame3.getSize().height - local95;
			local99 = Static350.aFrame3;
		}
		@Pc(159) int local159;
		if (arg1 == 1) {
			Static202.anInt4258 = 765;
			Static74.anInt1655 = 0;
			Static38.anInt832 = 503;
			Static23.anInt411 = (Static193.anInt4171 - 765) / 2;
		} else if (Static161.anInt3644 < 96 && Static6.anInt1971 == 0) {
			local159 = Static193.anInt4171 > 1024 ? 1024 : Static193.anInt4171;
			Static23.anInt411 = (Static193.anInt4171 - local159) / 2;
			@Pc(175) int local175 = Static135.anInt3077 <= 768 ? Static135.anInt3077 : 768;
			Static202.anInt4258 = local159;
			Static74.anInt1655 = 0;
			Static38.anInt832 = local175;
		} else {
			Static202.anInt4258 = Static193.anInt4171;
			Static38.anInt832 = Static135.anInt3077;
			Static74.anInt1655 = 0;
			Static23.anInt411 = 0;
		}
		if (Static306.anInt6192 != 0) {
			@Pc(194) boolean local194;
			if (Static202.anInt4258 < 1024 && Static38.anInt832 < 768) {
				local194 = true;
			} else {
				local194 = false;
			}
		}
		if (arg4) {
			Static306.method5196(Static6.anInt1971);
		} else {
			Static101.aCanvas8.setSize(Static202.anInt4258, Static38.anInt832);
			if (Static164.aClass92_7 != null) {
				Static164.aClass92_7.method4482();
			}
			if (Static350.aFrame3 == local99) {
				local77 = Static350.aFrame3.getInsets();
				Static101.aCanvas8.setLocation(local77.left + Static23.anInt411, local77.top - -Static74.anInt1655);
			} else {
				Static101.aCanvas8.setLocation(Static23.anInt411, Static74.anInt1655);
			}
		}
		if (arg1 < 2) {
			Static257.aBoolean448 = false;
		} else {
			Static257.aBoolean448 = true;
		}
		if (Static310.anInt6220 != -1) {
			Static219.method3774(true);
		}
		if (Static131.aClass171_3 != null && (Static139.anInt3135 == 30 || Static139.anInt3135 == 25)) {
			Static65.method1096();
		}
		for (local159 = 0; local159 < 100; local159++) {
			Static60.aBooleanArray8[local159] = true;
		}
		Static350.aBoolean592 = true;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!am;ZILclient!am;)V")
	public static void method1415(@OriginalArg(0) Class11 arg0, @OriginalArg(3) Class11 arg1) {
		Static171.aClass11_76 = arg0;
		Static135.aClass11_63 = arg1;
		Static277.aBoolean496 = true;
		@Pc(15) int local15 = Static171.aClass11_76.method277() - 1;
		Static94.anInt2090 = local15 * 256 + Static171.aClass11_76.method292(local15);
		Static189.aStringArray30 = new String[] { null, null, null, null, Static220.aString168 };
		Static321.aStringArray43 = new String[] { null, null, Static105.aString228, null, null };
	}
}

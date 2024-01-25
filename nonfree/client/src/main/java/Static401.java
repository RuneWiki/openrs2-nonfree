import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	public static int anInt6678;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!qh;")
	public static final Class199 aClass199_172 = new Class199(32);

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_236 = new Class103(75, 3);

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "[[B")
	public static final byte[][] aByteArrayArray28 = new byte[1000][];

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	public static int anInt6679 = 0;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Lclient!jk;")
	public static Class124 aClass124_12 = null;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
	public static int anInt6680 = -1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIIIIIBI)V")
	public static void method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12) {
		if (Static94.aClass157Array1 == null) {
			return;
		}
		@Pc(18) Class25_Sub5_Sub1 local18;
		@Pc(14) int local14;
		if (arg12 >= 0) {
			local14 = arg12 - 1;
			local18 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local14];
		} else {
			local14 = -arg12 - 1;
			if (Static296.anInt5181 == local14) {
				local18 = Static447.aClass25_Sub5_Sub1_Sub2_4;
			} else {
				local18 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local14];
			}
		}
		if (local18 == null) {
			return;
		}
		@Pc(44) Class68 local44 = Static341.aClass75_4.method1616(arg9);
		@Pc(56) int local56;
		@Pc(53) int local53;
		if (arg5 == 1 || arg5 == 3) {
			local53 = local44.anInt1810;
			local56 = local44.anInt1803;
		} else {
			local53 = local44.anInt1803;
			local56 = local44.anInt1810;
		}
		@Pc(75) int local75 = arg4 + (local56 >> 1);
		@Pc(83) int local83 = arg4 + (local56 + 1 >> 1);
		@Pc(90) int local90 = arg11 + (local53 >> 1);
		@Pc(98) int local98 = (local53 + 1 >> 1) + arg11;
		@Pc(102) Class157 local102 = Static94.aClass157Array1[arg10];
		@Pc(126) int local126 = local102.ua(local75, local90) + local102.ua(local83, local90) + local102.ua(local75, local98) + local102.ua(local83, local98) >> 2;
		@Pc(130) Class1_Sub17 local130 = new Class1_Sub17();
		local130.anInt1721 = arg11;
		local130.anInt1723 = local18.aByte94;
		local130.anInt1711 = arg6 + Static236.anInt4213;
		local130.anInt1720 = arg4;
		@Pc(150) int local150;
		if (arg8 > arg7) {
			local150 = arg8;
			arg8 = arg7;
			arg7 = local150;
		}
		local130.anInt1712 = arg5;
		local130.anInt1716 = Static236.anInt4213 + arg2;
		local130.anInt1709 = arg9;
		local130.anInt1724 = arg3;
		local130.anInt1713 = arg8 + arg4;
		if (arg1 < arg0) {
			local150 = arg0;
			arg0 = arg1;
			arg1 = local150;
		}
		local130.anInt1717 = arg4 + arg7;
		local130.anInt1722 = (local53 << 6) + (local130.anInt1721 << 7);
		local130.anInt1718 = arg11 + arg0;
		local130.anInt1710 = local126;
		local130.anInt1715 = (local56 << 6) + (local130.anInt1720 << 7);
		local130.anInt1719 = arg1 + arg11;
		Static432.aClass227_52.method4972(local130);
		local18.aClass1_Sub17_3 = local130;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V")
	public static void method5217(@OriginalArg(0) int arg0) {
		Static203.anInt6056 = arg0;
		Static25.aClass102_4.method2271();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method5218() {
		if (!Static336.method4512()) {
			return;
		}
		if (Static54.aStringArray8 == null) {
			Static58.method1035();
		}
		Static61.anInt1467 = 0;
		Static413.aBoolean744 = true;
		try {
			Static187.aClipboard1 = Static159.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(16) Exception local16) {
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZBII)I")
	public static int method5219(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub43 local13 = Static346.method4702(arg1, arg0);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local13.anIntArray507.length) {
			return local13.anIntArray507[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5220(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local27++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static274.aCharArray5[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(78) int local78 = local52.length() - 1;
					local70 = ' ';
					local52.setCharAt(local78, Character.toUpperCase(local52.charAt(local78)));
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ql;Lclient!za;BLclient!qr;)V")
	public static void method5223(@OriginalArg(0) Class1_Sub36 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) Class205 arg2) {
		@Pc(10) Class6 local10 = arg2.method4526(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.YA();
		if (local10.ZA() > local16) {
			local16 = local10.ZA();
		}
		@Pc(38) int local38 = arg0.anInt5631;
		@Pc(41) int local41 = arg0.anInt5635;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(61) int local61;
		@Pc(88) int local88;
		if (arg2.aString65 != null) {
			local43 = Static58.aClass89_1.method1993(null, null, Static29.aStringArray7, arg2.aString65);
			for (local61 = 0; local61 < local43; local61++) {
				@Pc(67) String local67 = Static29.aStringArray7[local61];
				if (local43 - 1 > local61) {
					local67 = local67.substring(0, local67.length() - 4);
				}
				local88 = Static199.aClass88_4.method1956(local67);
				if (local45 < local88) {
					local45 = local88;
				}
			}
			local47 = local43 * Static199.aClass88_4.method1959() + Static199.aClass88_4.method1955() / 2;
		}
		local61 = local16 / 2 + arg0.anInt5631;
		@Pc(122) int local122 = arg0.anInt5635;
		if (local38 < local16 + Static167.anInt2095) {
			local38 = Static167.anInt2095;
			local61 = local45 / 2 + Static167.anInt2095 + local16 / 2 + 5 + 10;
		} else if (Static167.anInt2096 - local16 < local38) {
			local61 = Static167.anInt2096 - local16 / 2 - local45 / 2 - 5 - 10;
			local38 = Static167.anInt2096 - local16;
		}
		if (local41 < Static167.anInt2091 + local16) {
			local41 = Static167.anInt2091;
			local122 = Static167.anInt2091 + local16 / 2 + 10;
		} else if (local41 > Static167.anInt2088 - local16) {
			local41 = Static167.anInt2088 - local16;
			local122 = Static167.anInt2088 - local16 / 2 - local47 - 10;
		}
		local88 = (int) (Math.atan2((double) (local38 - arg0.anInt5631), (double) (local41 - arg0.anInt5635)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5890((float) local16 / 2.0F + (float) local38, (float) local16 / 2.0F + (float) local41, 4096, local88);
		@Pc(260) int local260 = -2;
		@Pc(262) int local262 = -2;
		@Pc(264) int local264 = -2;
		@Pc(266) int local266 = -2;
		if (arg2.aString65 != null) {
			local262 = local122;
			local260 = local61 - local45 / 2 - 5;
			local264 = local45 + local260 + 10;
			local266 = local43 * Static199.aClass88_4.method1959() + local122 + 3;
			if (arg2.anInt5759 != 0) {
				arg1.method5729(local264 - local260, local260, local266 - local122, arg2.anInt5759, local122);
			}
			if (arg2.anInt5763 != 0) {
				arg1.method5767(local260, local266 - local122, local122, arg2.anInt5763, local264 - local260);
			}
			for (@Pc(332) int local332 = 0; local332 < local43; local332++) {
				@Pc(338) String local338 = Static29.aStringArray7[local332];
				if (local332 < local43 - 1) {
					local338 = local338.substring(0, local338.length() - 4);
				}
				Static199.aClass88_4.method1957(arg1, local338, local61, local122, arg2.anInt5753);
				local122 += Static199.aClass88_4.method1959();
			}
		}
		if (arg2.anInt5765 == -1 && arg2.aString65 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(386) Class1_Sub38 local386 = new Class1_Sub38(arg0);
		local386.anInt6238 = local266;
		local386.anInt6244 = local262;
		local386.anInt6241 = local41 - local16;
		local386.anInt6237 = local260;
		local386.anInt6245 = local16 + local38;
		local386.anInt6243 = local264;
		local386.anInt6242 = local41 + local16;
		local386.anInt6239 = local38 - local16;
		Static103.aClass227_8.method4972(local386);
	}
}

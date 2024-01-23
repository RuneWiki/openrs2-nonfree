import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
	public static int anInt5100;

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "Lclient!kb;")
	public static Class83 aClass83_155;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "[I")
	public static int[] anIntArray528;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "[S")
	public static short[] aShortArray80;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
	public static int anInt5101 = 0;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "Lclient!rm;")
	public static Class1_Sub30 aClass1_Sub30_1 = new Class1_Sub30(0, 0);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method4021(@OriginalArg(0) Class83 arg0) {
		Static37.aClass7_Sub1Array1 = Static286.method4696(arg0, Static15.anInt399);
		Static259.anIntArray565 = new int[256];
		@Pc(17) int local17;
		for (local17 = 0; local17 < 3; local17++) {
			@Pc(31) float local31 = (float) (Static59.anIntArray155[local17] >> 8 & 0xFF);
			@Pc(40) float local40 = (float) (Static59.anIntArray155[local17] >> 16 & 0xFF);
			@Pc(50) int local50 = Static59.anIntArray155[local17 + 1] >> 16 & 0xFF;
			@Pc(58) float local58 = ((float) local50 - local40) / 64.0F;
			@Pc(68) int local68 = Static59.anIntArray155[local17 + 1] >> 8 & 0xFF;
			@Pc(76) int local76 = Static59.anIntArray155[local17 + 1] & 0xFF;
			@Pc(83) float local83 = (float) (Static59.anIntArray155[local17] & 0xFF);
			@Pc(91) float local91 = ((float) local76 - local83) / 64.0F;
			@Pc(99) float local99 = ((float) local68 - local31) / 64.0F;
			for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
				Static259.anIntArray565[local101 + local17 * 64] = (int) local83 | (int) local40 << 16 | (int) local31 << 8;
				local40 += local58;
				local83 += local91;
				local31 += local99;
			}
		}
		for (local17 = 192; local17 < 255; local17++) {
			Static259.anIntArray565[local17] = Static59.anIntArray155[3];
		}
		Static59.anIntArray156 = new int[32768];
		Static180.anIntArray364 = new int[32768];
		Static226.method3932(null);
		Static138.anIntArray286 = new int[32768];
		Static298.anIntArray622 = new int[32768];
		Static290.aClass1_Sub2_Sub14_Sub1_5 = new Class1_Sub2_Sub14_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IJ)V")
	public static void method4022(@OriginalArg(1) long arg0) {
		if ((long) 0 >= arg0) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static226.method3931(arg0 - 1L);
			Static226.method3931(1L);
		} else {
			Static226.method3931(arg0);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
	public static void method4023(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static64.method1251(arg1, arg0, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III[Lclient!ok;ZI)V")
	public static void method4024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class116[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(11) Class116 local11 = arg2[local3];
			if (local11 != null && arg0 == local11.anInt4344) {
				Static213.method3740(arg1, arg3, local11, arg4);
				Static154.method2864(arg4, local11, arg1);
				if (local11.anInt4307 > local11.anInt4320 - local11.anInt4363) {
					local11.anInt4307 = local11.anInt4320 - local11.anInt4363;
				}
				if (local11.anInt4307 < 0) {
					local11.anInt4307 = 0;
				}
				if (local11.anInt4321 - local11.anInt4299 < local11.anInt4303) {
					local11.anInt4303 = local11.anInt4321 - local11.anInt4299;
				}
				if (local11.anInt4303 < 0) {
					local11.anInt4303 = 0;
				}
				if (local11.anInt4376 == 0) {
					Static23.method400(arg3, local11);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(JZZ)V")
	public static void method4025(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 0L) {
			return;
		}
		if (Static253.anInt5514 >= 100) {
			Static89.method1540(0, "", Static227.aString158);
			return;
		}
		@Pc(35) String local35 = Static173.method3185(arg0);
		@Pc(37) int local37;
		for (local37 = 0; local37 < Static253.anInt5514; local37++) {
			if (Static3.aLongArray1[local37] == arg0) {
				Static89.method1540(0, "", local35 + Static190.aString124);
				return;
			}
		}
		for (local37 = 0; local37 < Static180.anInt4068; local37++) {
			if (arg0 == Static286.aLongArray11[local37]) {
				Static89.method1540(0, "", Static86.aString58 + local35 + Static245.aString167);
				return;
			}
		}
		if (local35.equals(Static239.aClass25_Sub1_Sub1_2.aString26)) {
			Static89.method1540(0, "", Static159.aString108);
			return;
		}
		Static3.aLongArray1[Static253.anInt5514] = arg0;
		Static271.aStringArray35[Static253.anInt5514] = Static49.method1039(arg0);
		Static56.aBooleanArray4[Static253.anInt5514++] = arg1;
		Static254.anInt5408 = Static27.anInt754;
		Static81.aClass1_Sub16_Sub1_1.method2676(148);
		Static81.aClass1_Sub16_Sub1_1.method2631(arg0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
	public static void method4027() {
		@Pc(8) int local8 = Static126.aByteArrayArray64.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static126.aByteArrayArray64[local10] != null) {
				@Pc(21) int local21 = -1;
				for (@Pc(23) int local23 = 0; local23 < Static153.anInt3543; local23++) {
					if (Static8.anIntArray449[local10] == Static38.anIntArray107[local23]) {
						local21 = local23;
						break;
					}
				}
				if (local21 == -1) {
					Static38.anIntArray107[Static153.anInt3543] = Static8.anIntArray449[local10];
					local21 = Static153.anInt3543++;
				}
				@Pc(67) int local67 = 0;
				@Pc(74) Class1_Sub16 local74 = new Class1_Sub16(Static126.aByteArrayArray64[local10]);
				while (local74.anInt3328 < Static126.aByteArrayArray64[local10].length && local67 < 511) {
					@Pc(97) int local97 = local21 | local67++ << 6;
					@Pc(101) int local101 = local74.method2652();
					@Pc(105) int local105 = local101 >> 14;
					@Pc(111) int local111 = local101 >> 7 & 0x3F;
					@Pc(115) int local115 = local101 & 0x3F;
					@Pc(127) int local127 = (Static8.anIntArray449[local10] >> 8) * 64 + local111 - Static82.anInt1972;
					@Pc(140) int local140 = (Static8.anIntArray449[local10] & 0xFF) * 64 + local115 - Static266.anInt5790;
					@Pc(146) Class143 local146 = Static38.method880(local74.method2652());
					if (Static27.aClass25_Sub1_Sub2Array1[local97] == null && (local146.aByte23 & 0x1) > 0 && local105 == Static228.anInt5022 && local127 >= 0 && local127 + local146.anInt5188 < 104 && local140 >= 0 && local140 + local146.anInt5188 < 104) {
						Static27.aClass25_Sub1_Sub2Array1[local97] = new Class25_Sub1_Sub2();
						@Pc(194) Class25_Sub1_Sub2 local194 = Static27.aClass25_Sub1_Sub2Array1[local97];
						Static65.anIntArray25[Static147.anInt3493++] = local97;
						local194.anInt1658 = Static32.anInt809;
						local194.method1250(local146);
						local194.method1239(local194.aClass143_1.anInt5188);
						local194.anInt1628 = local194.anInt1681 = Static246.anIntArray551[local194.aClass143_1.aByte25];
						local194.anInt1642 = local194.aClass143_1.anInt5183;
						local194.anInt1615 = local194.aClass143_1.anInt5186;
						if (local194.anInt1615 == 0) {
							local194.anInt1681 = 0;
						}
						local194.method1235(true, local194.method1243(), local140, local127);
					}
				}
			}
		}
	}
}

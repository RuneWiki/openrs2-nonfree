import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "[I")
	public static int[] anIntArray422;

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "[I")
	public static int[] anIntArray423;

	@OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
	public static int anInt4547;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Lclient!an;")
	public static Class10 aClass10_48 = new Class10();

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	public static int anInt4542 = 0;

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString153 = "Opened title screen";

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
	public static void method3642() {
		Static231.aClass33_34.method838(5);
		Static250.aClass33_36.method838(5);
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
	public static void method3643() {
		@Pc(8) int local8 = Static171.aByteArrayArray13.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static171.aByteArrayArray13[local10] != null) {
				@Pc(21) int local21 = -1;
				for (@Pc(23) int local23 = 0; local23 < Static162.anInt3216; local23++) {
					if (Static262.anIntArray442[local10] == Static92.anIntArray204[local23]) {
						local21 = local23;
						break;
					}
				}
				if (local21 == -1) {
					Static92.anIntArray204[Static162.anInt3216] = Static262.anIntArray442[local10];
					local21 = Static162.anInt3216++;
				}
				@Pc(67) int local67 = 0;
				@Pc(74) Class4_Sub17 local74 = new Class4_Sub17(Static171.aByteArrayArray13[local10]);
				while (Static171.aByteArrayArray13[local10].length > local74.anInt2400 && local67 < 511) {
					@Pc(96) int local96 = local74.method1837();
					@Pc(102) int local102 = local96 >> 7 & 0x3F;
					@Pc(106) int local106 = local96 >> 14;
					@Pc(113) int local113 = local67++ << 6 | local21;
					@Pc(117) int local117 = local96 & 0x3F;
					@Pc(130) int local130 = local117 + (Static262.anIntArray442[local10] & 0xFF) * 64 - Static239.anInt4613;
					@Pc(142) int local142 = (Static262.anIntArray442[local10] >> 8) * 64 + local102 - Static170.anInt3385;
					@Pc(148) Class175 local148 = Static262.method3970(local74.method1837());
					if (Static100.aClass12_Sub3_Sub1Array1[local113] == null && (local148.aByte26 & 0x1) > 0 && Static168.anInt3342 == local106 && local142 >= 0 && local148.anInt5217 + local142 < 104 && local130 >= 0 && local148.anInt5217 + local130 < 104) {
						Static100.aClass12_Sub3_Sub1Array1[local113] = new Class12_Sub3_Sub1();
						@Pc(192) Class12_Sub3_Sub1 local192 = Static100.aClass12_Sub3_Sub1Array1[local113];
						Static10.anIntArray20[Static68.anInt1262++] = local113;
						local192.anInt4167 = Static104.anInt2226;
						local192.method1562(local148);
						local192.method3362(local192.aClass175_1.anInt5217);
						local192.anInt4136 = local192.anInt4121 = Static103.anIntArray225[local192.aClass175_1.aByte24];
						local192.anInt4126 = local192.aClass175_1.anInt5218;
						local192.anInt4115 = local192.aClass175_1.anInt5219;
						if (local192.anInt4115 == 0) {
							local192.anInt4121 = 0;
						}
						local192.method3367(local142, local130, local192.method3375(), true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(JI)V")
	public static void method3644(@OriginalArg(0) long arg0) {
		if (Static239.anInt4616 == 1 || Static239.anInt4616 == 5) {
			Static53.method869(arg0);
		} else if (Static239.anInt4616 == 2) {
			Static157.method2483();
		} else {
			Static32.method478();
		}
		if (!Static142.aBoolean192) {
			Static60.anInt1152 = 1;
			Static261.aStringArray34[0] = Static129.aString86;
			if (Static209.anInt5551 != 0) {
				Static105.anInt2256 = Static53.anInt1061;
				Static273.anInt1118 = Static24.anInt440;
			} else if (Static44.anInt885 == 0) {
				Static273.anInt1118 = Static72.anInt1326;
				Static105.anInt2256 = Static117.anInt2589;
			} else {
				Static273.anInt1118 = Static35.anInt708;
				Static105.anInt2256 = Static147.anInt2993;
			}
			Static299.aShortArray93[0] = 1007;
			Static196.anIntArray322[0] = Static240.anInt5014;
			Static35.aStringArray7[0] = "";
		}
		if (Static25.anInt448 != -1) {
			Static159.method2494(Static25.anInt448);
		}
		@Pc(87) int local87;
		for (local87 = 0; local87 < Static220.anInt4365; local87++) {
			if (Static222.aBooleanArray20[local87]) {
				Static72.aBooleanArray11[local87] = true;
			}
			Static196.aBooleanArray17[local87] = Static222.aBooleanArray20[local87];
			Static222.aBooleanArray20[local87] = false;
		}
		Static14.aClass22_9 = null;
		Static236.anInt3712 = Static104.anInt2226;
		Static276.aClass22_20 = null;
		Static218.anInt5375 = -1;
		Static267.anInt3572 = -1;
		if (Static178.aBoolean216) {
			Static272.aBoolean337 = true;
		}
		if (Static25.anInt448 != -1) {
			Static220.anInt4365 = 0;
			Static299.method4400();
		}
		if (Static178.aBoolean216) {
			Static186.method2957();
		} else {
			Static166.method2629();
		}
		Static242.method3906();
		if (Static142.aBoolean192) {
			if (Static32.aBoolean50) {
				Static248.method3759();
			} else {
				Static68.method1041();
			}
		} else if (Static14.aClass22_9 != null) {
			Static81.method3279(Static14.aClass22_9, Static94.anInt1945, Static40.anInt849);
		} else if (Static218.anInt5375 != -1) {
			Static81.method3279(null, Static267.anInt3572, Static218.anInt5375);
		}
		local87 = Static142.aBoolean192 ? -1 : Static146.method2354();
		if (local87 == -1) {
			local87 = Static156.anInt3142;
		}
		Static156.method2477(local87);
		if (Static261.anInt4958 == 1) {
			Static261.anInt4958 = 2;
		}
		if (Static34.anInt671 == 1) {
			Static34.anInt671 = 2;
		}
		if (Static14.anInt2092 == 3) {
			for (@Pc(213) int local213 = 0; local213 < Static220.anInt4365; local213++) {
				if (Static196.aBooleanArray17[local213]) {
					if (Static178.aBoolean216) {
						Static186.method2954(Static77.anIntArray154[local213], Static197.anIntArray324[local213], Static267.anIntArray300[local213], Static243.anIntArray427[local213], 16711935, 128);
					} else {
						Static166.method2616(Static77.anIntArray154[local213], Static197.anIntArray324[local213], Static267.anIntArray300[local213], Static243.anIntArray427[local213], 16711935, 128);
					}
				} else if (Static72.aBooleanArray11[local213]) {
					if (Static178.aBoolean216) {
						Static186.method2954(Static77.anIntArray154[local213], Static197.anIntArray324[local213], Static267.anIntArray300[local213], Static243.anIntArray427[local213], 16711680, 128);
					} else {
						Static166.method2616(Static77.anIntArray154[local213], Static197.anIntArray324[local213], Static267.anIntArray300[local213], Static243.anIntArray427[local213], 16711680, 128);
					}
				}
			}
		}
		Static3.method47(Static16.anInt307, Static239.aClass12_Sub3_Sub2_2.anInt4141, Static210.anInt4103, Static239.aClass12_Sub3_Sub2_2.anInt4113);
		Static16.anInt307 = 0;
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V")
	public static void method3645() {
		anIntArray423 = null;
		aClass10_48 = null;
		anIntArray422 = null;
		aString153 = null;
	}
}

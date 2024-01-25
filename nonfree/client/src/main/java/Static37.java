import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!fa;")
	public static Class94 aClass94_1;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public static int anInt891 = -1;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_4 = new Class236(44, 3);

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public static int anInt895 = -1;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method832(@OriginalArg(1) Class62 arg0) {
		if (Static257.anInt5147 < 2 && !Static479.aBoolean594 || Static499.aClass220_17 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static479.aBoolean594 && Static257.anInt5147 < 2) {
			local41 = Static150.aString37 + Static539.aClass40_155.method1063(Static194.anInt3737) + Static516.aString81 + " ->";
		} else if (Static2.aBoolean3 && Static59.aClass18_1.method5977(81) && Static257.anInt5147 > 2) {
			local41 = Static477.method6654((Class5_Sub47) Static521.aClass99_78.aClass5_102.aClass5_283.aClass5_283);
		} else {
			@Pc(60) Class5_Sub47 local60 = (Class5_Sub47) Static521.aClass99_78.aClass5_102.aClass5_283;
			local41 = Static477.method6654(local60);
			@Pc(68) int[] local68 = null;
			if (Static225.method3574(local60.anInt8474)) {
				local68 = Static451.aClass67_2.method2006((int) local60.aLong237).anIntArray35;
			} else if (local60.anInt8478 != -1) {
				local68 = Static451.aClass67_2.method2006(local60.anInt8478).anIntArray35;
			} else if (Static448.method6334(local60.anInt8474)) {
				@Pc(137) Class5_Sub51 local137 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local60.aLong237);
				if (local137 != null) {
					@Pc(142) Class15_Sub2_Sub1_Sub2 local142 = local137.aClass15_Sub2_Sub1_Sub2_2;
					@Pc(145) Class305 local145 = local142.aClass305_1;
					if (local145.anIntArray679 != null) {
						local145 = local145.method7150(Static540.aClass242_1);
					}
					if (local145 != null) {
						local68 = local145.anIntArray681;
					}
				}
			} else if (Static311.method5044(local60.anInt8474)) {
				@Pc(102) Class283 local102;
				if (local60.anInt8474 == 1004) {
					local102 = Static453.aClass88_3.method2294((int) local60.aLong237);
				} else {
					local102 = Static453.aClass88_3.method2294((int) (local60.aLong237 >>> 32 & 0x7FFFFFFFL));
				}
				if (local102.anIntArray632 != null) {
					local102 = local102.method6604(Static540.aClass242_1);
				}
				if (local102 != null) {
					local68 = local102.anIntArray633;
				}
			}
			if (local68 != null) {
				local41 = local41 + Static61.method1174(local68);
			}
		}
		if (Static257.anInt5147 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static257.anInt5147 - 2) + Static246.aClass40_75.method1063(Static194.anInt3737);
		}
		if (Static290.aClass220_14 != null) {
			@Pc(228) Class13 local228 = Static290.aClass220_14.method5473(arg0);
			if (local228 == null) {
				local228 = Static130.aClass13_2;
			}
			local228.method7214(Static372.aClass25Array8, Static290.aClass220_14.anInt6627, Static44.aRandom1, Static290.aClass220_14.anInt6680, Static290.aClass220_14.anInt6628, local41, Static290.aClass220_14.anInt6681, Static290.aClass220_14.anInt6638, Static303.anInt5998, Static66.anIntArray161, Static274.anInt5370, Static323.anInt6144, Static290.aClass220_14.anInt6610, Static208.anIntArray276);
			Static340.method5293(Static66.anIntArray161[1], Static66.anIntArray161[3], Static66.anIntArray161[0], Static66.anIntArray161[2]);
		} else if (Static145.aClass220_7 != null && Static525.aClass155_4 == Static300.aClass155_2) {
			@Pc(293) int local293 = Static130.aClass13_2.method7203(local41, Static19.anInt7581 + 16, Static323.anInt6144, Static44.aRandom1, Static319.anInt6178 + 4, Static372.aClass25Array8, Static208.anIntArray276);
			Static340.method5293(Static19.anInt7581, 16, Static319.anInt6178 + 4, local293 + Static312.aClass256_7.method6113(local41));
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!od;[[BI)V")
	public static void method833(@OriginalArg(0) Class130_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt6544; local7++) {
			Static485.method6727();
			for (@Pc(13) int local13 = 0; local13 < Static460.anInt7894 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static235.anInt4493 >> 3; local17++) {
					@Pc(27) int local27 = Static157.anIntArrayArrayArray1[local7][local13][local17];
					if (local27 != -1) {
						@Pc(37) int local37 = local27 >> 24 & 0x3;
						if (!arg0.aBoolean453 || local37 == 0) {
							@Pc(48) int local48 = local27 >> 1 & 0x3;
							@Pc(54) int local54 = local27 >> 14 & 0x3FF;
							@Pc(60) int local60 = local27 >> 3 & 0x7FF;
							@Pc(70) int local70 = (local54 / 8 << 8) + local60 / 8;
							for (@Pc(72) int local72 = 0; local72 < Static103.anIntArray76.length; local72++) {
								if (Static103.anIntArray76[local72] == local70 && arg1[local72] != null) {
									arg0.method5436((local54 & 0x7) * 8, local37, Static110.aClass62_15, local17 * 8, local13 * 8, local7, (local60 & 0x7) * 8, Static71.aClass10Array3, arg1[local72], local48);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}

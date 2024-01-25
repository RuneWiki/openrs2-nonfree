import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!wo;")
	public static Class216 aClass216_81;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static int anInt4766;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[50][];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V")
	public static void method4269(@OriginalArg(0) int arg0) {
		if (arg0 == Static295.anInt5811) {
			return;
		}
		if (Static295.anInt5811 == 0) {
			Static118.method2489();
		}
		if (arg0 == 40) {
			Static287.method4915();
		}
		if (arg0 != 40 && Static234.aClass148_2 != null) {
			Static234.aClass148_2.method4123();
			Static234.aClass148_2 = null;
		}
		if (Static295.anInt5811 == 25 || Static295.anInt5811 == 28) {
			Static191.aClass216_62.anInt6797 = 2;
			Static121.aClass216_41.anInt6797 = 2;
			Static99.aClass216_33.anInt6797 = 2;
			Static53.aClass216_14.anInt6797 = 2;
			Static208.aClass216_69.anInt6797 = 2;
			Static261.aClass216_19.anInt6797 = 2;
			Static88.aClass216_32.anInt6797 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static96.anInt6251 = 1;
			Static6.anInt274 = 0;
			Static87.anInt2181 = 0;
			Static114.anInt4337 = 1;
			Static76.anInt1981 = 0;
			Static130.method2653(true);
			Static191.aClass216_62.anInt6797 = 1;
			Static121.aClass216_41.anInt6797 = 1;
			Static99.aClass216_33.anInt6797 = 1;
			Static53.aClass216_14.anInt6797 = 1;
			Static208.aClass216_69.anInt6797 = 1;
			Static261.aClass216_19.anInt6797 = 1;
			Static88.aClass216_32.anInt6797 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static53.method1370();
		}
		if (arg0 == 5) {
			Static338.method5467(Static208.aClass32_11, Static193.aClass216_64);
		} else {
			Static314.method5205();
		}
		@Pc(136) boolean local136 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(159) boolean local159 = Static295.anInt5811 == 5 || Static295.anInt5811 == 10 || Static295.anInt5811 == 28;
		if (local136 != local159) {
			if (local136) {
				Static93.anInt2303 = Static211.anInt4525;
				if (Static167.anInt3605 == 0) {
					Static180.method3550();
				} else {
					Static73.method1692(Static211.anInt4525, Static228.aClass216_78, 255);
				}
				Static283.aClass186_3.method4898(false);
			} else {
				Static180.method3550();
				Static283.aClass186_3.method4898(true);
				if (Static254.aClass131_1 != null) {
					Static254.aClass131_1.method3602();
					Static254.aClass131_1 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static208.aClass32_11.method2217();
		}
		Static295.anInt5811 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V")
	public static void method4270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static342.aClass1_Sub8_Sub1_7.method4529(arg0);
		Static342.aClass1_Sub8_Sub1_7.method4542(arg1);
		Static342.aClass1_Sub8_Sub1_7.method4542(arg2);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!be;)V")
	public static void method4271(@OriginalArg(1) Class17_Sub1_Sub1_Sub1 arg0) {
		if (Static115.anInt2635 >= 400 || Static198.aClass17_Sub1_Sub1_Sub1_3 == arg0) {
			return;
		}
		@Pc(147) String local147;
		@Pc(65) int local65;
		if (arg0.anInt795 == 0) {
			@Pc(20) boolean local20 = true;
			if (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt796 != -1 && arg0.anInt796 != -1) {
				@Pc(40) int local40 = arg0.anInt803 >= Static198.aClass17_Sub1_Sub1_Sub1_3.anInt803 ? arg0.anInt803 : Static198.aClass17_Sub1_Sub1_Sub1_3.anInt803;
				@Pc(55) int local55 = Static198.aClass17_Sub1_Sub1_Sub1_3.anInt796 < arg0.anInt796 ? Static198.aClass17_Sub1_Sub1_Sub1_3.anInt796 : arg0.anInt796;
				local65 = local55 + local40 * 10 / 100 + 5;
				@Pc(72) int local72 = Static198.aClass17_Sub1_Sub1_Sub1_3.anInt803 - arg0.anInt803;
				if (local72 < 0) {
					local72 = -local72;
				}
				if (local72 > local65) {
					local20 = false;
				}
			}
			@Pc(100) String local100 = Static8.anInt5875 == 1 ? Static316.aClass34_192.method1285(Static259.anInt2907) : Static316.aClass34_191.method1285(Static259.anInt2907);
			if (arg0.anInt810 > arg0.anInt803) {
				local147 = arg0.method562() + (local20 ? Static125.method2610(Static198.aClass17_Sub1_Sub1_Sub1_3.anInt803, arg0.anInt803) : "<col=ffffff>") + " (" + local100 + arg0.anInt803 + "+" + (arg0.anInt810 - arg0.anInt803) + ")";
			} else {
				local147 = arg0.method562() + (local20 ? Static125.method2610(Static198.aClass17_Sub1_Sub1_Sub1_3.anInt803, arg0.anInt803) : "<col=ffffff>") + " (" + local100 + arg0.anInt803 + ")";
			}
		} else {
			local147 = arg0.method562() + " (" + Static269.aClass34_155.method1285(Static259.anInt2907) + arg0.anInt795 + ")";
		}
		if (!Static91.aBoolean214) {
			for (@Pc(207) int local207 = 7; local207 >= 0; local207--) {
				if (Static7.aStringArray1[local207] != null) {
					@Pc(215) short local215 = 0;
					if (Static8.anInt5875 == 0 && Static7.aStringArray1[local207].equalsIgnoreCase(Static143.aClass34_101.method1285(Static259.anInt2907))) {
						if (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt803 < arg0.anInt803) {
							local215 = 2000;
						}
						if (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt811 != 0 && arg0.anInt811 != 0) {
							if (arg0.anInt811 == Static198.aClass17_Sub1_Sub1_Sub1_3.anInt811) {
								local215 = 2000;
							} else {
								local215 = 0;
							}
						}
					} else if (Static74.aBooleanArray10[local207]) {
						local215 = 2000;
					}
					@Pc(276) short local276 = (short) (local215 + Static226.aShortArray102[local207]);
					local65 = Static132.anIntArray258[local207] == -1 ? Static255.anInt5262 : Static132.anIntArray258[local207];
					Static58.method1506(local65, "<col=ffffff>" + local147, 0, (long) arg0.anInt4867, Static7.aStringArray1[local207], 0, local276);
				}
			}
		} else if ((Static257.anInt5340 & 0x8) != 0) {
			Static58.method1506(Static175.anInt3793, Static281.aString56 + " -> <col=ffffff>" + local147, 0, (long) arg0.anInt4867, Static24.aString15, 0, 30);
		}
		for (@Pc(348) Class1_Sub23 local348 = (Class1_Sub23) Static188.aClass16_22.method410(); local348 != null; local348 = (Class1_Sub23) Static188.aClass16_22.method419()) {
			if (local348.anInt3588 == 21) {
				local348.aString34 = "<col=ffffff>" + local147;
				break;
			}
		}
	}
}

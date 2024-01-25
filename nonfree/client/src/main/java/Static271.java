import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
	public static int anInt4832;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "Lclient!aa;")
	public static Class2 aClass2_12;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
	public static int anInt4840;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!aa;Lclient!qh;IIIII)V")
	public static void method4457(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static56.anInt1240) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static222.anInt4391) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static74.anInt3404 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class204 local62 = Static138.aClass204ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static7.aClass41Array1[local17].method5434(local23, local32) + Static7.aClass41Array1[local17].method5434(local23 + 1, local32) + Static7.aClass41Array1[local17].method5434(local23, local32 + 1) + Static7.aClass41Array1[local17].method5434(local23 + 1, local32 + 1)) / 4 - (Static7.aClass41Array1[arg2].method5434(arg3, arg4) + Static7.aClass41Array1[arg2].method5434(arg3 + 1, arg4) + Static7.aClass41Array1[arg2].method5434(arg3, arg4 + 1) + Static7.aClass41Array1[arg2].method5434(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class5_Sub1 local143 = local62.aClass5_Sub1_1;
									@Pc(146) Class5_Sub1 local146 = local62.aClass5_Sub1_2;
									if (local143 != null && local143.method5681()) {
										arg1.method5677(local1, (local32 - arg4) * 128 + (1 - arg6) * 64, (local23 - arg3) * 128 + (1 - arg5) * 64, arg0, local140, local143);
									}
									if (local146 != null && local146.method5681()) {
										arg1.method5677(local1, (local32 - arg4) * 128 + (1 - arg6) * 64, (local23 - arg3) * 128 + (1 - arg5) * 64, arg0, local140, local146);
									}
									for (@Pc(219) Class17 local219 = local62.aClass17_3; local219 != null; local219 = local219.aClass17_1) {
										@Pc(223) Class5_Sub3 local223 = local219.aClass5_Sub3_1;
										if (local223 != null && local223.method5681() && (local23 == local223.aShort75 || local23 == local3) && (local32 == local223.aShort77 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort78 + 1 - local223.aShort75;
											@Pc(260) int local260 = local223.aShort76 + 1 - local223.aShort77;
											arg1.method5677(local1, (local223.aShort77 - arg4) * 128 + (local260 - arg6) * 64, (local223.aShort75 - arg3) * 128 + (local252 - arg5) * 64, arg0, local140, local223);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)V")
	public static void method4459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static342.aFloat38 > Static342.aFloat37) {
			Static342.aFloat37 = (float) ((double) Static342.aFloat37 + (double) Static342.aFloat37 / 30.0D);
			if (Static342.aFloat37 > Static342.aFloat38) {
				Static342.aFloat37 = Static342.aFloat38;
			}
			Static346.method5645();
			Static342.anInt2137 = (int) Static342.aFloat37 >> 1;
			Static342.aByteArrayArrayArray3 = Static144.method2744(Static342.anInt2137);
		} else if (Static342.aFloat38 < Static342.aFloat37) {
			Static342.aFloat37 = (float) ((double) Static342.aFloat37 - (double) Static342.aFloat37 / 30.0D);
			if (Static342.aFloat38 > Static342.aFloat37) {
				Static342.aFloat37 = Static342.aFloat38;
			}
			Static346.method5645();
			Static342.anInt2137 = (int) Static342.aFloat37 >> 1;
			Static342.aByteArrayArrayArray3 = Static144.method2744(Static342.anInt2137);
		}
		if (Static202.anInt4094 != -1 && Static215.anInt4248 != -1) {
			@Pc(79) int local79 = Static202.anInt4094 - Static90.anInt1760;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(98) int local98 = Static215.anInt4248 - Static185.anInt1061;
			if (local98 < 2 || local98 > 2) {
				local98 /= 8;
			}
			Static90.anInt1760 += local79;
			if (local79 == 0 && local98 == 0) {
				Static215.anInt4248 = -1;
				Static202.anInt4094 = -1;
			}
			Static185.anInt1061 += local98;
			Static346.method5645();
		}
		if (Static177.anInt3677 <= 0) {
			Static239.anInt4658 = -1;
			Static327.anInt6270 = -1;
		} else {
			Static23.anInt530--;
			if (Static23.anInt530 == 0) {
				Static177.anInt3677--;
				Static23.anInt530 = 100;
			}
		}
		if (!Static350.aBoolean585 || Static185.aClass195_5 == null) {
			return;
		}
		for (@Pc(170) Class1_Sub22 local170 = (Class1_Sub22) Static185.aClass195_5.method5029(); local170 != null; local170 = (Class1_Sub22) Static185.aClass195_5.method5021()) {
			@Pc(178) Class202 local178 = Static221.method4034(local170.aClass1_Sub25_1.anInt4124);
			if (Static112.anInt4022 == 0 && local170.method3694(arg0, arg1)) {
				if (local178.aStringArray42 != null) {
					if (local178.aStringArray42[4] != null) {
						Static164.method3162(-1, 0, local178.aString233, (long) local170.aClass1_Sub25_1.anInt4124, 1011, local178.anInt5902, local178.aStringArray42[4]);
					}
					if (local178.aStringArray42[3] != null) {
						Static164.method3162(-1, 0, local178.aString233, (long) local170.aClass1_Sub25_1.anInt4124, 1005, local178.anInt5902, local178.aStringArray42[3]);
					}
					if (local178.aStringArray42[2] != null) {
						Static164.method3162(-1, 0, local178.aString233, (long) local170.aClass1_Sub25_1.anInt4124, 1012, local178.anInt5902, local178.aStringArray42[2]);
					}
					if (local178.aStringArray42[1] != null) {
						Static164.method3162(-1, 0, local178.aString233, (long) local170.aClass1_Sub25_1.anInt4124, 1009, local178.anInt5902, local178.aStringArray42[1]);
					}
					if (local178.aStringArray42[0] != null) {
						Static164.method3162(-1, 0, local178.aString233, (long) local170.aClass1_Sub25_1.anInt4124, 1007, local178.anInt5902, local178.aStringArray42[0]);
					}
				}
				if (!local170.aClass1_Sub25_1.aBoolean349) {
					local170.aClass1_Sub25_1.aBoolean349 = true;
					Static98.method1796(15, local170.aClass1_Sub25_1.anInt4124, local178.anInt5902);
				}
				if (local170.aClass1_Sub25_1.aBoolean349) {
					Static98.method1796(17, local170.aClass1_Sub25_1.anInt4124, local178.anInt5902);
				}
			} else if (local170.aClass1_Sub25_1.aBoolean349) {
				local170.aClass1_Sub25_1.aBoolean349 = false;
				Static98.method1796(16, local170.aClass1_Sub25_1.anInt4124, local178.anInt5902);
			}
		}
	}
}

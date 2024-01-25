import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
	public static final int anInt5330 = 52;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_49 = new Class109(8);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)V")
	public static void method4781() {
		@Pc(5) Class109 local5 = Static342.aClass109_61;
		synchronized (Static342.aClass109_61) {
			Static342.aClass109_61.method2859(5);
		}
		local5 = Static77.aClass109_20;
		synchronized (Static77.aClass109_20) {
			Static77.aClass109_20.method2859(5);
		}
		@Pc(41) Class120 local41 = Static311.aClass120_2;
		synchronized (Static311.aClass120_2) {
			Static311.aClass120_2.method3168();
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
	public static void method4782() {
		Static291.aClass55_11.method5223(((float) Static192.anInt3806 * 0.1F + 0.7F) * 1.1523438F);
		Static291.aClass55_11.method5221(Static139.anInt2689, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static291.aClass55_11.method5164(Static321.anInt6213, -1);
		Static291.aClass55_11.method5179(Static297.aClass54_3);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
	public static String method4783(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) char local6 = ',';
		@Pc(8) char local8 = '.';
		if (arg2 == 0) {
			local6 = '.';
			local8 = ',';
		}
		if (arg2 == 2) {
			local8 = ' ';
		}
		@Pc(24) boolean local24 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local24 = true;
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(26);
		@Pc(42) int local42;
		@Pc(46) int local46;
		if (arg3 > 0) {
			for (local42 = 0; local42 < arg3; local42++) {
				local46 = (int) arg1;
				arg1 /= 10L;
				local38.append((char) (local46 + 48 - (int) arg1 * 10));
			}
			local38.append(local6);
		}
		local42 = 0;
		while (true) {
			local46 = (int) arg1;
			arg1 /= 10L;
			local38.append((char) (local46 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local24) {
					local38.append('-');
				}
				return local38.reverse().toString();
			}
			if (arg0) {
				local42++;
				if (local42 % 3 == 0) {
					local38.append(local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ea;Lclient!ac;IIIII)V")
	public static void method4784(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static345.anInt6647) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static350.anInt6715) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static236.anInt4222 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class174 local62 = Static178.aClass174ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static8.aClass51Array1[local17].method1856(local23, local32) + Static8.aClass51Array1[local17].method1856(local23 + 1, local32) + Static8.aClass51Array1[local17].method1856(local23, local32 + 1) + Static8.aClass51Array1[local17].method1856(local23 + 1, local32 + 1)) / 4 - (Static8.aClass51Array1[arg2].method1856(arg3, arg4) + Static8.aClass51Array1[arg2].method1856(arg3 + 1, arg4) + Static8.aClass51Array1[arg2].method1856(arg3, arg4 + 1) + Static8.aClass51Array1[arg2].method1856(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class4_Sub3 local143 = local62.aClass4_Sub3_2;
									@Pc(146) Class4_Sub3 local146 = local62.aClass4_Sub3_1;
									if (local143 != null && local143.method5895()) {
										arg1.method5897((local23 - arg3) * 128 + (1 - arg5) * 64, arg0, local143, local1, (local32 - arg4) * 128 + (1 - arg6) * 64, local140);
									}
									if (local146 != null && local146.method5895()) {
										arg1.method5897((local23 - arg3) * 128 + (1 - arg5) * 64, arg0, local146, local1, (local32 - arg4) * 128 + (1 - arg6) * 64, local140);
									}
									for (@Pc(219) Class84 local219 = local62.aClass84_3; local219 != null; local219 = local219.aClass84_2) {
										@Pc(223) Class4_Sub5 local223 = local219.aClass4_Sub5_1;
										if (local223 != null && local223.method5895() && (local23 == local223.aShort92 || local23 == local3) && (local32 == local223.aShort93 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort91 + 1 - local223.aShort92;
											@Pc(260) int local260 = local223.aShort90 + 1 - local223.aShort93;
											arg1.method5897((local223.aShort92 - arg3) * 128 + (local252 - arg5) * 64, arg0, local223, local1, (local223.aShort93 - arg4) * 128 + (local260 - arg6) * 64, local140);
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

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V")
	public static void method4785(@OriginalArg(1) int arg0) {
		Static49.anInt4962 = arg0;
		@Pc(7) Class109 local7 = Static39.aClass109_12;
		synchronized (Static39.aClass109_12) {
			Static39.aClass109_12.method2858();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method4786(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static197.anInt3912++;
		Static263.anInt5206 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static63.anInt5185; local7 < Static345.anInt6647; local7++) {
			@Pc(12) Class174[][] local12 = Static178.aClass174ArrayArrayArray3[local7];
			for (local14 = Static329.anInt6378; local14 < Static325.anInt6299; local14++) {
				for (@Pc(17) int local17 = Static12.anInt3796; local17 < Static142.anInt2744; local17++) {
					@Pc(24) Class174 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static172.aBooleanArrayArray6[local14 + Static257.anInt5067 - Static66.anInt5817][local17 + Static257.anInt5067 - Static150.anInt2937] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean438 = true;
							local24.aBoolean439 = true;
							if (local24.aClass84_3 == null) {
								local24.aBoolean440 = false;
							} else {
								local24.aBoolean440 = true;
							}
							Static263.anInt5206++;
						} else {
							local24.aBoolean438 = false;
							local24.aBoolean439 = false;
							local24.aByte47 = 0;
							if (local14 >= Static66.anInt5817 - 16 && local14 <= Static66.anInt5817 + 16 && local17 >= Static150.anInt2937 - 16 && local17 <= Static150.anInt2937 + 16 && (local24.aClass4_Sub3_2 != null || local24.aClass4_Sub3_1 != null || local24.aClass4_Sub1_2 != null || local24.aClass4_Sub1_1 != null || local24.aClass4_Sub4_1 != null || local24.aClass84_3 != null)) {
								Static136.aClass91_1.method3920(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static219.aClass51Array3 == Static8.aClass51Array1;
		for (local14 = Static63.anInt5185; local14 < Static345.anInt6647; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static42.aClass55_3.method5177() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static172.aBooleanArrayArray6.length;
				if (Static329.anInt6378 + Static172.aBooleanArrayArray6.length > Static350.anInt6715) {
					local172 -= Static329.anInt6378 + Static172.aBooleanArrayArray6.length - Static350.anInt6715;
				}
				@Pc(192) int local192 = Static172.aBooleanArrayArray6[0].length;
				if (Static12.anInt3796 + Static172.aBooleanArrayArray6[0].length > Static236.anInt4222) {
					local192 -= Static12.anInt3796 + Static172.aBooleanArrayArray6[0].length - Static236.anInt4222;
				}
				@Pc(213) int local213 = Static310.anInt6638;
				while (true) {
					if (local213 >= local172) {
						Static136.aClass91_1.method3918(local161, Static8.aClass51Array1[local14], true, local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static329.anInt6378 - Static310.anInt6638;
					for (@Pc(222) int local222 = Static241.anInt4869; local222 < local192; local222++) {
						Static206.aBooleanArrayArray5[local213][local222] = false;
						if (Static172.aBooleanArrayArray6[local213][local222]) {
							@Pc(241) int local241 = local222 + Static12.anInt3796 - Static241.anInt4869;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static178.aClass174ArrayArrayArray3[local243][local220][local241] != null && Static178.aClass174ArrayArrayArray3[local243][local220][local241].aByte44 == local14) {
									Static206.aBooleanArrayArray5[local213][local222] = Static178.aClass174ArrayArrayArray3[local243][local220][local241].aBoolean438;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static136.aClass91_1.method3918(local161, Static8.aClass51Array1[local14], false, local14);
			}
			Static136.aClass91_1.method3916();
		}
		if (!Static24.method5486(true)) {
			Static24.method5486(false);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIZIII)I")
	public static int method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(15) int local15 = arg3;
			arg3 = arg0;
			arg0 = local15;
		}
		@Pc(23) int local23 = arg1 & 0x3;
		if (local23 == 0) {
			return arg2;
		} else if (local23 == 1) {
			return arg5;
		} else if (local23 == 2) {
			return 1 + 7 - arg3 - arg2;
		} else {
			return 1 + 7 - arg0 - arg5;
		}
	}
}

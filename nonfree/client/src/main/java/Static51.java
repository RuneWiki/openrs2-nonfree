import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "[Lclient!sa;")
	public static Class215[] aClass215Array6;

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "[J")
	public static long[] aLongArray21;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
	public static int anInt8945;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
	public static int anInt8941 = 0;

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "Z")
	public static boolean aBoolean637 = false;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)I")
	public static int method7361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static119.aShortArrayArray1 == null ? 0 : Static119.aShortArrayArray1[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZLclient!bea;I)V")
	public static void method7362(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class30_Sub1_Sub1_Sub1 arg1) {
		if (Static8.anInt118 >= 400) {
			return;
		}
		if (arg1 != Static440.aClass30_Sub1_Sub1_Sub1_2) {
			@Pc(78) String local78;
			@Pc(127) int local127;
			if (arg1.anInt745 == 0) {
				@Pc(82) boolean local82 = true;
				if (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt748 != -1 && arg1.anInt748 != -1) {
					@Pc(102) int local102 = arg1.anInt730 >= Static440.aClass30_Sub1_Sub1_Sub1_2.anInt730 ? arg1.anInt730 : Static440.aClass30_Sub1_Sub1_Sub1_2.anInt730;
					@Pc(117) int local117 = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt748 < arg1.anInt748 ? Static440.aClass30_Sub1_Sub1_Sub1_2.anInt748 : arg1.anInt748;
					local127 = local102 * 10 / 100 + local117 + 5;
					@Pc(133) int local133 = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt730 - arg1.anInt730;
					if (local133 < 0) {
						local133 = -local133;
					}
					if (local133 > local127) {
						local82 = false;
					}
				}
				@Pc(160) String local160 = Static293.aClass138_7 == Static518.aClass138_8 ? Static405.aClass88_217.method2391(Static345.anInt6495) : Static144.aClass88_160.method2391(Static345.anInt6495);
				if (arg1.anInt730 < arg1.anInt761) {
					local78 = arg1.method778() + (local82 ? Static395.method6205(arg1.anInt730, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt730) : "<col=ffffff>") + " (" + local160 + arg1.anInt730 + "+" + (arg1.anInt761 - arg1.anInt730) + ")";
				} else {
					local78 = arg1.method778() + (local82 ? Static395.method6205(arg1.anInt730, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt730) : "<col=ffffff>") + " (" + local160 + arg1.anInt730 + ")";
				}
			} else {
				local78 = arg1.method778() + " (" + Static104.aClass88_58.method2391(Static345.anInt6495) + arg1.anInt745 + ")";
			}
			if (Static73.aBoolean136) {
				if (!arg0 && (Static266.anInt5318 & 0x8) != 0) {
					Static160.method3297(Static497.aString104 + " -> <col=ffffff>" + local78, 0, 0, 44, -1, true, (long) arg1.anInt4197, Static274.aString59, Static156.anInt3411, false);
				}
			} else if (arg0) {
				Static160.method3297("", 0, 0, -1, 0, false, 0L, "<col=cccccc>" + local78, -1, true);
			} else {
				for (@Pc(276) int local276 = 7; local276 >= 0; local276--) {
					if (Static84.aStringArray10[local276] != null) {
						@Pc(284) short local284 = 0;
						if (Static468.aClass138_6 == Static293.aClass138_7 && Static84.aStringArray10[local276].equalsIgnoreCase(Static285.aClass88_156.method2391(Static345.anInt6495))) {
							if (arg1.anInt730 > Static440.aClass30_Sub1_Sub1_Sub1_2.anInt730) {
								local284 = 2000;
							}
							if (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt737 != 0 && arg1.anInt737 != 0) {
								if (arg1.anInt737 == Static440.aClass30_Sub1_Sub1_Sub1_2.anInt737) {
									local284 = 2000;
								} else {
									local284 = 0;
								}
							}
						} else if (Static59.aBooleanArray16[local276]) {
							local284 = 2000;
						}
						@Pc(342) short local342 = (short) (local284 + Static156.aShortArray52[local276]);
						local127 = Static139.anIntArray233[local276] == -1 ? Static252.anInt5200 : Static139.anIntArray233[local276];
						Static160.method3297("<col=ffffff>" + local78, 0, 0, local342, -1, true, (long) arg1.anInt4197, Static84.aStringArray10[local276], local127, false);
					}
				}
			}
			if (!arg0) {
				for (@Pc(413) Class12_Sub20 local413 = (Class12_Sub20) Static192.aClass73_33.method2005(); local413 != null; local413 = (Class12_Sub20) Static192.aClass73_33.method2009()) {
					if (local413.anInt4329 == 5) {
						local413.aString41 = "<col=ffffff>" + local78;
						break;
					}
				}
			}
		} else if (Static73.aBoolean136 && (Static266.anInt5318 & 0x10) != 0) {
			Static160.method3297(Static497.aString104 + " -> <col=ffffff>" + Static133.aClass88_79.method2391(Static345.anInt6495), 0, 0, 60, -1, true, 0L, Static274.aString59, Static156.anInt3411, false);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Z")
	public static boolean method7363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}

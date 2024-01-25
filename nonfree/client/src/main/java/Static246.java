import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "[Lclient!qs;")
	public static Class200[] aClass200Array1 = new Class200[50];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIB)I")
	public static int method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public static void method3388() {
		Static349.aClass4_Sub30_Sub1_2.method3917();
		@Pc(13) int local13 = Static349.aClass4_Sub30_Sub1_2.method3924(8);
		@Pc(22) int local22;
		if (local13 < Static249.anInt4520) {
			for (local22 = local13; local22 < Static249.anInt4520; local22++) {
				Static22.anIntArray603[Static164.anInt3042++] = Static128.anIntArray171[local22];
			}
		}
		if (local13 > Static249.anInt4520) {
			throw new RuntimeException("gnpov1");
		}
		Static249.anInt4520 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static128.anIntArray171[local22];
			@Pc(64) Class6_Sub2_Sub1_Sub2 local64 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local60];
			@Pc(69) int local69 = Static349.aClass4_Sub30_Sub1_2.method3924(1);
			if (local69 == 0) {
				Static128.anIntArray171[Static249.anInt4520++] = local60;
				local64.anInt6142 = Static175.anInt3261;
			} else {
				@Pc(92) int local92 = Static349.aClass4_Sub30_Sub1_2.method3924(2);
				if (local92 == 0) {
					Static128.anIntArray171[Static249.anInt4520++] = local60;
					local64.anInt6142 = Static175.anInt3261;
					Static239.anIntArray357[Static110.anInt2332++] = local60;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local92 == 1) {
						Static128.anIntArray171[Static249.anInt4520++] = local60;
						local64.anInt6142 = Static175.anInt3261;
						local137 = Static349.aClass4_Sub30_Sub1_2.method3924(3);
						local64.method4775(local137, 1);
						local147 = Static349.aClass4_Sub30_Sub1_2.method3924(1);
						if (local147 == 1) {
							Static239.anIntArray357[Static110.anInt2332++] = local60;
						}
					} else if (local92 == 2) {
						Static128.anIntArray171[Static249.anInt4520++] = local60;
						local64.anInt6142 = Static175.anInt3261;
						if (Static349.aClass4_Sub30_Sub1_2.method3924(1) == 1) {
							local137 = Static349.aClass4_Sub30_Sub1_2.method3924(3);
							local64.method4775(local137, 2);
							local147 = Static349.aClass4_Sub30_Sub1_2.method3924(3);
							local64.method4775(local147, 2);
						} else {
							local137 = Static349.aClass4_Sub30_Sub1_2.method3924(3);
							local64.method4775(local137, 0);
						}
						local137 = Static349.aClass4_Sub30_Sub1_2.method3924(1);
						if (local137 == 1) {
							Static239.anIntArray357[Static110.anInt2332++] = local60;
						}
					} else if (local92 == 3) {
						Static22.anIntArray603[Static164.anInt3042++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	public static void method3390() {
		if (Static223.aClass5_3 != null) {
			Static223.aClass5_3.method119();
			Static223.aClass5_3 = null;
		}
		Static13.method325();
		Static2.method5381();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static395.aClass268Array1[local17].method5815();
		}
		Static455.method5875(false);
		System.gc();
		Static129.method1924();
		Static156.aBoolean213 = false;
		Static49.anInt1347 = -1;
		Static436.method5628(true);
		Static33.anInt781 = 0;
		Static323.anInt5755 = 0;
		Static50.anInt1367 = 0;
		Static285.anInt5187 = 0;
		Static381.anInt6688 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static118.aClass80Array1.length; local58++) {
			Static118.aClass80Array1[local58] = null;
		}
		Static320.method4404();
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static171.aClass6_Sub2_Sub1_Sub1Array1[local77] = null;
		}
		Static249.anInt4520 = 0;
		for (@Pc(91) int local91 = 0; local91 < 32768; local91++) {
			Static176.aClass6_Sub2_Sub1_Sub2Array1[local91] = null;
		}
		Static437.aClass196_41.method4471();
		Static26.method529();
		Static368.anInt6522 = 0;
		Static155.aClass149_1.method3214();
		Static17.method402();
		Static433.method5559();
		Static93.method1521(true);
		try {
			Static459.method3567(Static89.aClass114_3.anApplet1, "loggedout");
		} catch (@Pc(128) Throwable local128) {
		}
		Static67.aClass4_Sub6_1 = null;
		Static252.aLong54 = 0L;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lclient!uf;")
	public static Class84_Sub1 method3391(@OriginalArg(1) int arg0) {
		return Static398.aBoolean455 && Static355.anInt6373 <= arg0 && arg0 <= Static230.anInt4220 ? Static230.aClass84_Sub1Array2[arg0 - Static355.anInt6373] : null;
	}
}

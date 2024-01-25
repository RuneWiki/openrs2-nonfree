import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!nq;")
	public static Class144 aClass144_112;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	public static int anInt6592;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
	public static int anInt6594;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public static int anInt6587 = 0;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
	public static int anInt6591 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!km;)V")
	public static void method5606(@OriginalArg(1) Class67_Sub3_Sub3_Sub1 arg0) {
		if (Static13.anInt245 >= 400) {
			return;
		}
		@Pc(12) Class82 local12 = arg0.aClass82_1;
		if (local12.anIntArray134 != null) {
			local12 = local12.method1569();
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean117) {
			return;
		}
		@Pc(35) String local35 = local12.aString18;
		if (local12.anInt1864 != 0) {
			@Pc(53) String local53 = Static68.anInt1264 == 1 ? Static184.aClass117_65.method2684(Static230.anInt4634) : Static214.aClass117_76.method2684(Static230.anInt4634);
			local35 = local35 + Static99.method617(local12.anInt1864, Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5095) + " (" + local53 + local12.anInt1864 + ")";
		}
		if (Static103.aBoolean118) {
			@Pc(87) Class11_Sub4_Sub6 local87 = Static307.anInt4796 == -1 ? null : Static286.method4771(Static307.anInt4796);
			if ((Static335.anInt6393 & 0x2) != 0) {
				if (local87 == null || local12.method1560(Static307.anInt4796, local87.anInt1448) != local87.anInt1448) {
					Static87.method1252(0, 0, 22, Static63.aString10 + " -> <col=ffff00>" + local35, Static320.anInt6202, (long) arg0.anInt5038, Static110.aString39);
				}
				return;
			}
			return;
		}
		@Pc(133) String[] local133 = local12.aStringArray17;
		if (Static261.aBoolean350) {
			local133 = Static166.method2690(local133);
		}
		@Pc(143) int local143;
		if (local133 != null) {
			for (local143 = 4; local143 >= 0; local143--) {
				if (local133[local143] != null && (Static68.anInt1264 != 0 || !local133[local143].equalsIgnoreCase(Static182.aClass117_63.method2684(Static230.anInt4634)))) {
					@Pc(165) byte local165 = 0;
					@Pc(167) int local167 = Static85.anInt1528;
					if (local143 == 0) {
						local165 = 4;
					}
					if (local143 == 1) {
						local165 = 11;
					}
					if (local143 == 2) {
						local165 = 15;
					}
					if (local143 == 3) {
						local165 = 58;
					}
					if (local143 == 4) {
						local165 = 45;
					}
					if (local143 == local12.anInt1862) {
						local167 = local12.anInt1895;
					}
					if (local143 == local12.anInt1867) {
						local167 = local12.anInt1889;
					}
					Static87.method1252(0, 0, local165, "<col=ffff00>" + local35, local167, (long) arg0.anInt5038, local133[local143]);
				}
			}
		}
		if (Static68.anInt1264 == 0 && local133 != null) {
			for (local143 = 4; local143 >= 0; local143--) {
				if (local133[local143] != null && local133[local143].equalsIgnoreCase(Static182.aClass117_63.method2684(Static230.anInt4634))) {
					@Pc(276) short local276 = 0;
					if (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5095 < local12.anInt1864) {
						local276 = 2000;
					}
					@Pc(285) short local285 = 0;
					if (local143 == 0) {
						local285 = 4;
					}
					if (local143 == 1) {
						local285 = 11;
					}
					if (local143 == 2) {
						local285 = 15;
					}
					if (local143 == 3) {
						local285 = 58;
					}
					if (local143 == 4) {
						local285 = 45;
					}
					if (local285 != 0) {
						local285 += local276;
					}
					Static87.method1252(0, 0, local285, "<col=ffff00>" + local35, local12.anInt1894, (long) arg0.anInt5038, local133[local143]);
				}
			}
		}
		Static87.method1252(0, 0, 1010, "<col=ffff00>" + local35, Static282.anInt5589, (long) arg0.anInt5038, Static16.aClass117_7.method2684(Static230.anInt4634));
	}
}

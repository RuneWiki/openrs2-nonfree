import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "[B")
	public static final byte[] aByteArray77 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "Lclient!cs;")
	public static final Class42 aClass42_49 = new Class42(8);

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean413 = false;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString315 = "scroll:";

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZLclient!re;)V")
	public static void method4780(@OriginalArg(1) Class25_Sub1_Sub1_Sub2 arg0) {
		if (Static27.anInt5324 >= 400) {
			return;
		}
		@Pc(17) Class216 local17 = arg0.aClass216_1;
		if (local17.anIntArray562 != null) {
			local17 = local17.method5777();
			if (local17 == null) {
				return;
			}
		}
		if (!local17.aBoolean480) {
			return;
		}
		@Pc(34) String local34 = local17.aString378;
		if (local17.anInt6551 != 0) {
			@Pc(46) String local46 = Static298.anInt5725 == 1 ? Static195.aString226 : Static27.aString306;
			local34 = local34 + Static44.method3566(Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4070, local17.anInt6551) + " (" + local46 + local17.anInt6551 + ")";
		}
		if (Static100.anInt2199 == 1) {
			Static345.method5684(39, Static121.aString166, Static332.aString362 + " -> <col=ffff00>" + local34, Static100.anInt2198, 0, 0, (long) arg0.anInt5287);
		} else if (Static20.aBoolean40) {
			@Pc(311) Class5_Sub9_Sub1 local311 = Static257.anInt5013 == -1 ? null : Static129.method2470(Static257.anInt5013);
			if ((Static240.anInt4648 & 0x2) != 0) {
				if (local311 == null || local17.method5776(local311.anInt1273, Static257.anInt5013) != local311.anInt1273) {
					Static345.method5684(12, Static221.aString254, Static111.aString151 + " -> <col=ffff00>" + local34, Static258.anInt5020, 0, 0, (long) arg0.anInt5287);
				}
				return;
			}
		} else {
			@Pc(79) String[] local79 = local17.aStringArray44;
			if (Static32.aBoolean62) {
				local79 = Static82.method1813(local79);
			}
			@Pc(89) int local89;
			if (local79 != null) {
				for (local89 = 4; local89 >= 0; local89--) {
					if (local79[local89] != null && (Static298.anInt5725 != 0 || !local79[local89].equalsIgnoreCase(Static248.aString284))) {
						@Pc(105) byte local105 = 0;
						if (local89 == 0) {
							local105 = 15;
						}
						@Pc(111) int local111 = Static333.anInt4630;
						if (local89 == 1) {
							local105 = 51;
						}
						if (local89 == 2) {
							local105 = 6;
						}
						if (local89 == 3) {
							local105 = 13;
						}
						if (local17.anInt6532 == local89) {
							local111 = local17.anInt6558;
						}
						if (local89 == 4) {
							local105 = 46;
						}
						if (local89 == local17.anInt6561) {
							local111 = local17.anInt6534;
						}
						Static345.method5684(local105, local79[local89], "<col=ffff00>" + local34, local111, 0, 0, (long) arg0.anInt5287);
					}
				}
			}
			if (Static298.anInt5725 == 0 && local79 != null) {
				for (local89 = 4; local89 >= 0; local89--) {
					if (local79[local89] != null && local79[local89].equalsIgnoreCase(Static248.aString284)) {
						@Pc(198) short local198 = 0;
						if (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4070 < local17.anInt6551) {
							local198 = 2000;
						}
						@Pc(211) short local211 = 0;
						if (local89 == 0) {
							local211 = 15;
						}
						if (local89 == 1) {
							local211 = 51;
						}
						if (local89 == 2) {
							local211 = 6;
						}
						if (local89 == 3) {
							local211 = 13;
						}
						if (local89 == 4) {
							local211 = 46;
						}
						if (local211 != 0) {
							local211 += local198;
						}
						Static345.method5684(local211, local79[local89], "<col=ffff00>" + local34, local17.anInt6552, 0, 0, (long) arg0.anInt5287);
					}
				}
			}
			Static345.method5684(1009, Static139.aString354, "<col=ffff00>" + local34, Static218.anInt4348, 0, 0, (long) arg0.anInt5287);
			return;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)V")
	public static void method4781() {
		Static27.anInt5261 = -1;
		Static147.aBoolean216 = false;
		Static52.anInt1325 = -1;
		Static200.anInt5712 = 1;
		Static110.aClass170_48 = null;
		Static249.anInt4841 = 0;
		Static163.anInt3276 = 2;
	}
}

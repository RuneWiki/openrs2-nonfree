import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
	public static int anInt1246;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!aj;Lclient!bk;II)V")
	public static void method898(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class8_Sub30 local9 = new Class8_Sub30();
		local9.anInt5001 = arg0.method2334();
		local9.anInt5002 = arg0.method2352();
		local9.anIntArray388 = new int[local9.anInt5001];
		local9.anIntArray389 = new int[local9.anInt5001];
		local9.aByteArrayArrayArray14 = new byte[local9.anInt5001][][];
		local9.aClass163Array2 = new Class163[local9.anInt5001];
		local9.aClass163Array1 = new Class163[local9.anInt5001];
		local9.anIntArray387 = new int[local9.anInt5001];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt5001; local51++) {
			try {
				@Pc(63) int local63 = arg0.method2334();
				@Pc(89) String local89;
				@Pc(93) String local93;
				@Pc(97) int local97;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local89 = arg0.method2372();
					local97 = 0;
					local93 = arg0.method2372();
					if (local63 == 1) {
						local97 = arg0.method2352();
					}
					local9.anIntArray389[local51] = local63;
					local9.anIntArray387[local51] = local97;
					local9.aClass163Array1[local51] = arg1.method448(local93, Static162.method2644(local89));
				} else if (local63 == 3 || local63 == 4) {
					local89 = arg0.method2372();
					local93 = arg0.method2372();
					local97 = arg0.method2334();
					@Pc(100) String[] local100 = new String[local97];
					for (@Pc(102) int local102 = 0; local102 < local97; local102++) {
						local100[local102] = arg0.method2372();
					}
					@Pc(117) byte[][] local117 = new byte[local97][];
					@Pc(136) int local136;
					if (local63 == 3) {
						for (@Pc(125) int local125 = 0; local125 < local97; local125++) {
							local136 = arg0.method2352();
							local117[local125] = new byte[local136];
							arg0.method2339(local117[local125], local136);
						}
					}
					local9.anIntArray389[local51] = local63;
					@Pc(160) Class[] local160 = new Class[local97];
					for (local136 = 0; local136 < local97; local136++) {
						local160[local136] = Static162.method2644(local100[local136]);
					}
					local9.aClass163Array2[local51] = arg1.method458(Static162.method2644(local89), local93, local160);
					local9.aByteArrayArrayArray14[local51] = local117;
				}
			} catch (@Pc(239) ClassNotFoundException local239) {
				local9.anIntArray388[local51] = -1;
			} catch (@Pc(246) SecurityException local246) {
				local9.anIntArray388[local51] = -2;
			} catch (@Pc(253) NullPointerException local253) {
				local9.anIntArray388[local51] = -3;
			} catch (@Pc(260) Exception local260) {
				local9.anIntArray388[local51] = -4;
			} catch (@Pc(267) Throwable local267) {
				local9.anIntArray388[local51] = -5;
			}
		}
		Static235.aClass182_26.method4328(local9);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public static void method899() {
		if (!Static158.method2553() && Static253.anInt4999 != Static34.anInt770) {
			Static273.method4055(Static34.anInt770, false, false, Static250.anInt4960, Static42.anInt957, Static21.aClass36_Sub3_Sub1_1.anIntArray308[0], Static21.aClass36_Sub3_Sub1_1.anIntArray310[0]);
		} else if (Static34.anInt770 != Static136.anInt2741 && Static46.method742(Static34.anInt770)) {
			Static136.anInt2741 = Static34.anInt770;
			Static17.method316();
		}
	}
}

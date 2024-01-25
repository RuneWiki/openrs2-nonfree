import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "[Lclient!ao;")
	public static final Interface1[] anInterface1Array2 = new Interface1[128];

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!fc;ILclient!ofa;I)V")
	public static void method4976(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Class5_Sub22 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class5_Sub9 local13 = new Class5_Sub9();
		local13.anInt1146 = arg1.method5966();
		local13.anInt1144 = arg1.method5913();
		local13.anIntArray79 = new int[local13.anInt1146];
		local13.anIntArray78 = new int[local13.anInt1146];
		local13.aClass91Array1 = new Class91[local13.anInt1146];
		local13.aByteArrayArrayArray1 = new byte[local13.anInt1146][][];
		local13.anIntArray77 = new int[local13.anInt1146];
		local13.aClass91Array2 = new Class91[local13.anInt1146];
		for (@Pc(55) int local55 = 0; local55 < local13.anInt1146; local55++) {
			try {
				@Pc(61) int local61 = arg1.method5966();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local78 = arg1.method5937();
					local82 = arg1.method5937();
					local84 = 0;
					if (local61 == 1) {
						local84 = arg1.method5913();
					}
					local13.anIntArray77[local55] = local61;
					local13.anIntArray79[local55] = local84;
					local13.aClass91Array1[local55] = arg0.method2093(Static338.method5094(local78), local82);
				} else if (local61 == 3 || local61 == 4) {
					local78 = arg1.method5937();
					local82 = arg1.method5937();
					local84 = arg1.method5966();
					@Pc(139) String[] local139 = new String[local84];
					for (@Pc(141) int local141 = 0; local141 < local84; local141++) {
						local139[local141] = arg1.method5937();
					}
					@Pc(156) byte[][] local156 = new byte[local84][];
					@Pc(169) int local169;
					if (local61 == 3) {
						for (@Pc(163) int local163 = 0; local163 < local84; local163++) {
							local169 = arg1.method5913();
							local156[local163] = new byte[local169];
							arg1.method5915(0, local169, local156[local163]);
						}
					}
					local13.anIntArray77[local55] = local61;
					@Pc(198) Class[] local198 = new Class[local84];
					for (local169 = 0; local169 < local84; local169++) {
						local198[local169] = Static338.method5094(local139[local169]);
					}
					local13.aClass91Array2[local55] = arg0.method2097(local198, Static338.method5094(local78), local82);
					local13.aByteArrayArrayArray1[local55] = local156;
				}
			} catch (@Pc(237) ClassNotFoundException local237) {
				local13.anIntArray78[local55] = -1;
			} catch (@Pc(244) SecurityException local244) {
				local13.anIntArray78[local55] = -2;
			} catch (@Pc(251) NullPointerException local251) {
				local13.anIntArray78[local55] = -3;
			} catch (@Pc(258) Exception local258) {
				local13.anIntArray78[local55] = -4;
			} catch (@Pc(265) Throwable local265) {
				local13.anIntArray78[local55] = -5;
			}
		}
		Static360.aClass330_30.method7917(local13);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Z")
	public static boolean method4978(@OriginalArg(0) int arg0) {
		if (arg0 == 50 || arg0 == 25 || arg0 == 6 || arg0 == 44 || arg0 == 1009) {
			return true;
		} else {
			return arg0 == 5 || arg0 == 1006;
		}
	}
}

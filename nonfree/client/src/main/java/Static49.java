import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "[S")
	public static short[] aShortArray11 = new short[500];

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "Lclient!tg;")
	public static Class81 aClass81_418 = Static120.method2057("_");

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "Lclient!tg;")
	public static Class81 aClass81_419 = Static120.method2057("gr-Un:");

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "Lclient!tg;")
	public static Class81 aClass81_420 = Static120.method2057("Angreifen");

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "Lclient!tg;")
	public static Class81 aClass81_421 = Static120.method2057(": ");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!pf;ILclient!ka;)V")
	public static void method867(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(3) Class1_Sub8 arg2) {
		@Pc(5) Class1_Sub16 local5 = new Class1_Sub16();
		local5.anInt1711 = arg2.method336();
		local5.anInt1708 = arg2.method347();
		local5.anIntArray146 = new int[local5.anInt1711];
		local5.anIntArray145 = new int[local5.anInt1711];
		local5.aClass47Array2 = new Class47[local5.anInt1711];
		local5.aByteArrayArrayArray5 = new byte[local5.anInt1711][][];
		local5.aClass47Array1 = new Class47[local5.anInt1711];
		local5.anIntArray147 = new int[local5.anInt1711];
		for (@Pc(58) int local58 = 0; local58 < local5.anInt1711; local58++) {
			try {
				@Pc(64) int local64 = arg2.method336();
				@Pc(83) String local83;
				@Pc(92) String local92;
				@Pc(94) int local94;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local83 = new String(arg2.method344().method2828());
					local92 = new String(arg2.method344().method2828());
					local94 = 0;
					if (local64 == 1) {
						local94 = arg2.method347();
					}
					local5.anIntArray147[local58] = local64;
					local5.anIntArray145[local58] = local94;
					local5.aClass47Array1[local58] = arg1.method2227(Static53.method961(local83), local92);
				} else if (local64 == 3 || local64 == 4) {
					local83 = new String(arg2.method344().method2828());
					local92 = new String(arg2.method344().method2828());
					local94 = arg2.method336();
					@Pc(157) String[] local157 = new String[local94];
					for (@Pc(159) int local159 = 0; local159 < local94; local159++) {
						local157[local159] = new String(arg2.method344().method2828());
					}
					@Pc(183) byte[][] local183 = new byte[local94][];
					@Pc(196) int local196;
					if (local64 == 3) {
						for (@Pc(190) int local190 = 0; local190 < local94; local190++) {
							local196 = arg2.method347();
							local183[local190] = new byte[local196];
							arg2.method319(local196, local183[local190]);
						}
					}
					local5.anIntArray147[local58] = local64;
					@Pc(223) Class[] local223 = new Class[local94];
					for (local196 = 0; local196 < local94; local196++) {
						local223[local196] = Static53.method961(local157[local196]);
					}
					local5.aClass47Array2[local58] = arg1.method2221(local223, Static53.method961(local83), local92);
					local5.aByteArrayArrayArray5[local58] = local183;
				}
			} catch (@Pc(258) ClassNotFoundException local258) {
				local5.anIntArray146[local58] = -1;
			} catch (@Pc(265) SecurityException local265) {
				local5.anIntArray146[local58] = -2;
			} catch (@Pc(272) NullPointerException local272) {
				local5.anIntArray146[local58] = -3;
			} catch (@Pc(279) Exception local279) {
				local5.anIntArray146[local58] = -4;
			} catch (@Pc(286) Throwable local286) {
				local5.anIntArray146[local58] = -5;
			}
		}
		Static157.aClass30_15.method1113(local5);
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V")
	public static void method868() {
		aClass81_421 = null;
		aClass81_418 = null;
		aShortArray11 = null;
		aClass81_420 = null;
		aClass81_419 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ad;I)V")
	public static void method870(@OriginalArg(0) Class1_Sub3 arg0) {
		Static137.method2309(200000, arg0);
	}
}

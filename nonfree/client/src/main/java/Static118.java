import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lclient!f;")
	public static Class73 aClass73_7;

	@OriginalMember(owner = "client!ef", name = "db", descriptor = "Lclient!ri;")
	public static Class284 aClass284_39;

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "[[B")
	public static final byte[][] aByteArrayArray12 = new byte[1000][];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLclient!ie;Lclient!k;)V")
	public static void method2317(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1, @OriginalArg(3) Class168 arg2) {
		@Pc(9) Class3_Sub47 local9 = new Class3_Sub47();
		local9.anInt8339 = arg1.method6814();
		local9.anInt8338 = arg1.method6816();
		local9.aClass309Array1 = new Class309[local9.anInt8339];
		local9.aClass309Array2 = new Class309[local9.anInt8339];
		local9.aByteArrayArrayArray18 = new byte[local9.anInt8339][][];
		local9.anIntArray491 = new int[local9.anInt8339];
		local9.anIntArray490 = new int[local9.anInt8339];
		local9.anIntArray493 = new int[local9.anInt8339];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt8339; local55++) {
			try {
				@Pc(61) int local61 = arg1.method6814();
				@Pc(88) String local88;
				@Pc(92) String local92;
				@Pc(98) int local98;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local88 = arg1.method6786();
					local92 = arg1.method6786();
					local98 = 0;
					if (local61 == 1) {
						local98 = arg1.method6816();
					}
					local9.anIntArray490[local55] = local61;
					local9.anIntArray493[local55] = local98;
					local9.aClass309Array1[local55] = arg2.method4087(local92, Static558.method7651(local88));
				} else if (local61 == 3 || local61 == 4) {
					local88 = arg1.method6786();
					local92 = arg1.method6786();
					local98 = arg1.method6814();
					@Pc(101) String[] local101 = new String[local98];
					for (@Pc(103) int local103 = 0; local103 < local98; local103++) {
						local101[local103] = arg1.method6786();
					}
					@Pc(118) byte[][] local118 = new byte[local98][];
					@Pc(133) int local133;
					if (local61 == 3) {
						for (@Pc(125) int local125 = 0; local125 < local98; local125++) {
							local133 = arg1.method6816();
							local118[local125] = new byte[local133];
							arg1.method6794(local118[local125], local133);
						}
					}
					local9.anIntArray490[local55] = local61;
					@Pc(158) Class[] local158 = new Class[local98];
					for (local133 = 0; local133 < local98; local133++) {
						local158[local133] = Static558.method7651(local101[local133]);
					}
					local9.aClass309Array2[local55] = arg2.method4081(local158, Static558.method7651(local88), local92);
					local9.aByteArrayArrayArray18[local55] = local118;
				}
			} catch (@Pc(237) ClassNotFoundException local237) {
				local9.anIntArray491[local55] = -1;
			} catch (@Pc(244) SecurityException local244) {
				local9.anIntArray491[local55] = -2;
			} catch (@Pc(251) NullPointerException local251) {
				local9.anIntArray491[local55] = -3;
			} catch (@Pc(258) Exception local258) {
				local9.anIntArray491[local55] = -4;
			} catch (@Pc(265) Throwable local265) {
				local9.anIntArray491[local55] = -5;
			}
		}
		Static431.aClass244_56.method5570(local9);
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V")
	public static void method2319() {
		Static196.aClass31_8.method8025(Static570.aFloat226, Static288.aFloat126, Static481.aFloat179);
	}
}

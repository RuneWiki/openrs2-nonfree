import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!dc;")
	public static Class3_Sub9 aClass3_Sub9_7;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Z")
	public static boolean aBoolean538 = false;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "I")
	public static int anInt7495 = 2;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method6548() {
		if (!Static573.aBoolean489) {
			Static202.aFloat79 += (-24.0F - Static202.aFloat79) / 2.0F;
			Static573.aBoolean489 = true;
			Static66.aBoolean84 = true;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!dc;Lclient!rp;B)V")
	public static void method6549(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9 arg1, @OriginalArg(2) Class298 arg2) {
		@Pc(9) Class3_Sub19 local9 = new Class3_Sub19();
		local9.anInt3284 = arg1.method5633();
		local9.anInt3283 = arg1.method5585();
		local9.aClass174Array1 = new Class174[local9.anInt3284];
		local9.aClass174Array2 = new Class174[local9.anInt3284];
		local9.aByteArrayArrayArray9 = new byte[local9.anInt3284][][];
		local9.anIntArray204 = new int[local9.anInt3284];
		local9.anIntArray206 = new int[local9.anInt3284];
		local9.anIntArray205 = new int[local9.anInt3284];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt3284; local51++) {
			try {
				@Pc(57) int local57 = arg1.method5633();
				@Pc(72) String local72;
				@Pc(76) String local76;
				@Pc(78) int local78;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local72 = arg1.method5607();
					local76 = arg1.method5607();
					local78 = 0;
					if (local57 == 1) {
						local78 = arg1.method5585();
					}
					local9.anIntArray205[local51] = local57;
					local9.anIntArray206[local51] = local78;
					local9.aClass174Array2[local51] = arg2.method7275(local76, Static546.method7846(local72));
				} else if (local57 == 3 || local57 == 4) {
					local72 = arg1.method5607();
					local76 = arg1.method5607();
					local78 = arg1.method5633();
					@Pc(135) String[] local135 = new String[local78];
					for (@Pc(137) int local137 = 0; local137 < local78; local137++) {
						local135[local137] = arg1.method5607();
					}
					@Pc(156) byte[][] local156 = new byte[local78][];
					@Pc(169) int local169;
					if (local57 == 3) {
						for (@Pc(161) int local161 = 0; local161 < local78; local161++) {
							local169 = arg1.method5585();
							local156[local161] = new byte[local169];
							arg1.method5577(0, local169, local156[local161]);
						}
					}
					local9.anIntArray205[local51] = local57;
					@Pc(198) Class[] local198 = new Class[local78];
					for (local169 = 0; local169 < local78; local169++) {
						local198[local169] = Static546.method7846(local135[local169]);
					}
					local9.aClass174Array1[local51] = arg2.method7281(local76, local198, Static546.method7846(local72));
					local9.aByteArrayArrayArray9[local51] = local156;
				}
			} catch (@Pc(237) ClassNotFoundException local237) {
				local9.anIntArray204[local51] = -1;
			} catch (@Pc(244) SecurityException local244) {
				local9.anIntArray204[local51] = -2;
			} catch (@Pc(251) NullPointerException local251) {
				local9.anIntArray204[local51] = -3;
			} catch (@Pc(258) Exception local258) {
				local9.anIntArray204[local51] = -4;
			} catch (@Pc(265) Throwable local265) {
				local9.anIntArray204[local51] = -5;
			}
		}
		Static541.aClass216_65.method5449(local9);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!uq;III)V")
	public static void method6550(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class351 local12;
		if (arg2 < Static573.anInt6750) {
			local12 = Static567.aClass351ArrayArrayArray4[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass9_Sub2_Sub4_1 != null && local12.aClass9_Sub2_Sub4_1.method8610()) {
				arg0.method8609(Static568.aClass82_14, true, 0, local12.aClass9_Sub2_Sub4_1, 0, Static188.anInt3555);
			}
		}
		if (arg3 < Static573.anInt6750) {
			local12 = Static567.aClass351ArrayArrayArray4[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass9_Sub2_Sub4_1 != null && local12.aClass9_Sub2_Sub4_1.method8610()) {
				arg0.method8609(Static568.aClass82_14, true, 0, local12.aClass9_Sub2_Sub4_1, Static188.anInt3555, 0);
			}
		}
		if (arg2 < Static573.anInt6750 && arg3 < Static547.anInt9143) {
			local12 = Static567.aClass351ArrayArrayArray4[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass9_Sub2_Sub4_1 != null && local12.aClass9_Sub2_Sub4_1.method8610()) {
				arg0.method8609(Static568.aClass82_14, true, 0, local12.aClass9_Sub2_Sub4_1, Static188.anInt3555, Static188.anInt3555);
			}
		}
		if (arg2 < Static573.anInt6750 && arg3 > 0) {
			local12 = Static567.aClass351ArrayArrayArray4[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass9_Sub2_Sub4_1 != null && local12.aClass9_Sub2_Sub4_1.method8610()) {
				arg0.method8609(Static568.aClass82_14, true, 0, local12.aClass9_Sub2_Sub4_1, -Static188.anInt3555, Static188.anInt3555);
			}
		}
	}
}

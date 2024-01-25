import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_136 = new Class77(73, 0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method4410(@OriginalArg(0) int arg0) {
		Static201.anInt4804 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static166.anInt2967; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static244.anInt1024; local6++) {
				if (Static297.aClass227ArrayArrayArray7[arg0][local3][local6] == null) {
					Static297.aClass227ArrayArrayArray7[arg0][local3][local6] = new Class227(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!km;I)V")
	public static void method4413(@OriginalArg(0) Class82 arg0) {
		if (Static379.anInt1192 < 2 && !Static68.aBoolean110 || Static243.aClass155_26 != null) {
			return;
		}
		@Pc(42) String local42;
		if (Static68.aBoolean110 && Static379.anInt1192 < 2) {
			local42 = Static258.aString34 + Static226.aClass221_144.method5229(Static189.anInt5185) + Static187.aString28 + " ->";
		} else if (Static251.aBoolean337 && Static129.aClass149_1.method3685(81) && Static379.anInt1192 > 2) {
			local42 = Static58.method4853((Class2_Sub7) Static66.aClass210_43.aClass2_199.aClass2_243.aClass2_243);
		} else {
			@Pc(49) Class2_Sub7 local49 = (Class2_Sub7) Static66.aClass210_43.aClass2_199.aClass2_243;
			local42 = Static58.method4853(local49);
			@Pc(55) int[] local55 = null;
			if (Static79.method1414(local49.anInt541)) {
				local55 = Static106.aClass250_1.method5735((int) local49.aLong22).anIntArray326;
			} else if (local49.anInt546 != -1) {
				local55 = Static106.aClass250_1.method5735(local49.anInt546).anIntArray326;
			} else if (Static27.method683(local49.anInt541)) {
				@Pc(138) Class12_Sub1_Sub2_Sub1 local138 = Static107.aClass12_Sub1_Sub2_Sub1Array1[(int) local49.aLong22];
				if (local138 != null) {
					@Pc(143) Class240 local143 = local138.aClass240_1;
					if (local143.anIntArray781 != null) {
						local143 = local143.method5567(Static248.aClass125_1);
					}
					if (local143 != null) {
						local55 = local143.anIntArray783;
					}
				}
			} else if (Static173.method2826(local49.anInt541)) {
				@Pc(106) Class34 local106;
				if (local49.anInt541 == 1007) {
					local106 = Static11.aClass123_5.method2703((int) local49.aLong22);
				} else {
					local106 = Static11.aClass123_5.method2703((int) (local49.aLong22 >>> 32 & 0x7FFFFFFFL));
				}
				if (local106.anIntArray122 != null) {
					local106 = local106.method831(Static248.aClass125_1);
				}
				if (local106 != null) {
					local55 = local106.anIntArray120;
				}
			}
			if (local55 != null) {
				local42 = local42 + Static254.method4014(local55);
			}
		}
		if (Static379.anInt1192 > 2) {
			local42 = local42 + "<col=ffffff> / " + (Static379.anInt1192 - 2) + Static43.aClass221_31.method5229(Static189.anInt5185);
		}
		if (Static186.aClass155_36 != null) {
			@Pc(217) Class13 local217 = Static186.aClass155_36.method3767(arg0);
			if (local217 == null) {
				local217 = Static34.aClass13_1;
			}
			local217.method5616(Static186.aClass155_36.anInt4157, Static222.anInt4113, Static53.anInt1097, Static186.aClass155_36.anInt4165, Static215.anIntArray491, Static186.aClass155_36.anInt4170, Static50.aRandom1, Static186.aClass155_36.anInt4214, Static186.aClass155_36.anInt4182, Static279.anInt4941, local42, Static186.aClass155_36.anInt4142, Static52.aClass5Array11, Static2.anIntArray464);
			Static299.method4675(Static2.anIntArray464[3], Static2.anIntArray464[0], Static2.anIntArray464[1], Static2.anIntArray464[2]);
		} else if (Static392.aClass155_39 != null && Static209.aClass48_2 == Static311.aClass48_3) {
			@Pc(282) int local282 = Static34.aClass13_1.method5624(Static390.anInt6703 + 4, Static214.anInt3952 + 16, Static222.anInt4113, Static215.anIntArray491, Static52.aClass5Array11, local42, Static50.aRandom1);
			Static299.method4675(16, Static390.anInt6703 + 4, Static214.anInt3952, Static60.aClass216_3.method5073(local42) + local282);
		}
	}
}

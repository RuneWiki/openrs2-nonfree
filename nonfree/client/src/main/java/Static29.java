import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public static int anInt500;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method499(@OriginalArg(1) Class101 arg0) {
		if (Static276.anInt5124 < 2 && !Static537.aBoolean683 || Static267.aClass357_180 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static537.aBoolean683 && Static276.anInt5124 < 2) {
			local41 = Static526.aString109 + Static205.aClass134_32.method3906(Static204.anInt8130) + Static13.aString100 + " ->";
		} else if (Static400.aBoolean557 && Static202.aClass191_1.method8963(81) && Static276.anInt5124 > 2) {
			local41 = Static188.method7429(Static577.aClass2_Sub1_Sub13_4);
		} else {
			@Pc(45) Class2_Sub1_Sub13 local45 = Static577.aClass2_Sub1_Sub13_4;
			if (local45 == null) {
				return;
			}
			local41 = Static188.method7429(local45);
			@Pc(54) int[] local54 = null;
			if (Static87.method1543(local45.anInt6866)) {
				local54 = Static372.aClass343_1.method8549((int) local45.aLong181).anIntArray517;
			} else if (local45.anInt6867 != -1) {
				local54 = Static372.aClass343_1.method8549(local45.anInt6867).anIntArray517;
			} else if (Static377.method6405(local45.anInt6866)) {
				@Pc(86) Class2_Sub6 local86 = (Class2_Sub6) Static630.aClass335_29.method8357((long) (int) local45.aLong181);
				if (local86 != null) {
					@Pc(91) Class15_Sub3_Sub3_Sub1_Sub2 local91 = local86.aClass15_Sub3_Sub3_Sub1_Sub2_1;
					@Pc(94) Class312 local94 = local91.aClass312_1;
					if (local94.anIntArray458 != null) {
						local94 = local94.method7953(Static113.aClass282_1);
					}
					if (local94 != null) {
						local54 = local94.anIntArray460;
					}
				}
			} else if (Static190.method3693(local45.anInt6866)) {
				@Pc(126) Class331 local126;
				if (local45.anInt6866 == 1006) {
					local126 = Static251.aClass328_1.method8261((int) local45.aLong181);
				} else {
					local126 = Static251.aClass328_1.method8261((int) (local45.aLong181 >>> 32 & 0x7FFFFFFFL));
				}
				if (local126.anIntArray486 != null) {
					local126 = local126.method8304(Static113.aClass282_1);
				}
				if (local126 != null) {
					local54 = local126.anIntArray483;
				}
			}
			if (local54 != null) {
				local41 = local41 + Static141.method2458(local54);
			}
		}
		if (Static276.anInt5124 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static276.anInt5124 - 2) + Static205.aClass134_25.method3906(Static204.anInt8130);
		}
		if (Static266.aClass357_77 != null) {
			@Pc(220) Class59 local220 = Static266.aClass357_77.method8978(arg0);
			if (local220 == null) {
				local220 = Static253.aClass59_5;
			}
			local220.method9578(Static266.aClass357_77.anInt10395, Static97.anInt1732, Static266.aClass357_77.anInt10479, Static431.anInt2504, Static266.aClass357_77.anInt10415, Static251.aClass71Array25, local41, Static266.aClass357_77.anInt10465, Static214.anIntArray199, Static148.anInt2748, Static277.anIntArray597, Static266.aClass357_77.anInt10481, Static266.aClass357_77.anInt10411, Static138.aRandom1);
			Static427.method7014(Static214.anIntArray199[2], Static214.anIntArray199[1], Static214.anIntArray199[0], Static214.anIntArray199[3]);
		} else if (Static497.aClass357_126 != null && Static19.aClass229_3 == Static551.aClass229_15) {
			@Pc(285) int local285 = Static253.aClass59_5.method9572(Static251.aClass71Array25, Static277.anIntArray597, Static309.anInt5583 + 16, local41, Static97.anInt1732, Static138.aRandom1, Static294.anInt5370 + 4);
			Static427.method7014(Static648.aClass324_12.method8181(local41) + local285, Static309.anInt5583, Static294.anInt5370 + 4, 16);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z")
	public static boolean method500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method5947(@OriginalArg(1) Class15 arg0) {
		if (Static309.anInt6170 < 2 && !Static594.aBoolean851 || Static360.aClass305_3 != null) {
			return;
		}
		@Pc(34) String local34;
		if (Static594.aBoolean851 && Static309.anInt6170 < 2) {
			local34 = Static590.aString133 + Static139.aClass101_31.method2841(Static126.anInt2904) + Static569.aString131 + " ->";
		} else if (Static42.aBoolean85 && Static212.aClass193_1.method6323(81) && Static309.anInt6170 > 2) {
			local34 = Static526.method7770((Class3_Sub40) Static342.aClass183_44.aClass3_161.aClass3_287.aClass3_287);
		} else {
			@Pc(61) Class3_Sub40 local61 = (Class3_Sub40) Static342.aClass183_44.aClass3_161.aClass3_287;
			local34 = Static526.method7770(local61);
			@Pc(67) int[] local67 = null;
			if (Static211.method3720(local61.anInt7324)) {
				local67 = Static517.aClass23_2.method901((int) local61.aLong191).anIntArray18;
			} else if (local61.anInt7316 != -1) {
				local67 = Static517.aClass23_2.method901(local61.anInt7316).anIntArray18;
			} else if (Static566.method8142(local61.anInt7324)) {
				@Pc(156) Class3_Sub46 local156 = (Class3_Sub46) Static331.aClass25_25.method946((long) local61.aLong191);
				if (local156 != null) {
					@Pc(161) Class2_Sub2_Sub1_Sub2 local161 = local156.aClass2_Sub2_Sub1_Sub2_2;
					@Pc(164) Class169 local164 = local161.aClass169_1;
					if (local164.anIntArray306 != null) {
						local164 = local164.method4177(Static588.aClass322_1);
					}
					if (local164 != null) {
						local67 = local164.anIntArray305;
					}
				}
			} else if (Static127.method2533(local61.anInt7324)) {
				@Pc(123) Class292 local123;
				if (local61.anInt7324 == 1004) {
					local123 = Static253.aClass146_2.method3356((int) local61.aLong191);
				} else {
					local123 = Static253.aClass146_2.method3356((int) (local61.aLong191 >>> 32 & 0x7FFFFFFFL));
				}
				if (local123.anIntArray571 != null) {
					local123 = local123.method7198(Static588.aClass322_1);
				}
				if (local123 != null) {
					local67 = local123.anIntArray574;
				}
			}
			if (local67 != null) {
				local34 = local34 + Static260.method4598(local67);
			}
		}
		if (Static309.anInt6170 > 2) {
			local34 = local34 + "<col=ffffff> / " + (Static309.anInt6170 - 2) + Static139.aClass101_24.method2841(Static126.anInt2904);
		}
		if (Static297.aClass305_7 != null) {
			@Pc(222) Class111 local222 = Static297.aClass305_7.method7500(arg0);
			if (local222 == null) {
				local222 = Static162.aClass111_6;
			}
			local222.method6668(local34, Static346.anInt7036, Static533.anInt9677, Static297.aClass305_7.anInt9240, Static154.aRandom1, Static411.anInt8067, Static297.aClass305_7.anInt9175, Static282.anIntArray362, Static297.aClass305_7.anInt9160, Static297.aClass305_7.anInt9174, Static273.anIntArray348, Static528.aClass37Array11, Static297.aClass305_7.anInt9242, Static297.aClass305_7.anInt9205);
			Static30.method982(Static273.anIntArray348[0], Static273.anIntArray348[1], Static273.anIntArray348[2], Static273.anIntArray348[3]);
		} else if (Static260.aClass305_6 != null && Static318.aClass335_2 == Static581.aClass335_4) {
			@Pc(291) int local291 = Static162.aClass111_6.method6674(local34, Static346.anInt7036, Static572.anInt10083 + 16, Static154.aRandom1, Static528.aClass37Array11, Static206.anInt8799 + 4, Static282.anIntArray362);
			Static30.method982(Static206.anInt8799 + 4, Static572.anInt10083, local291 + Static9.aClass297_1.method7314(local34), 16);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!wk;IIIII)V")
	public static void method5948(@OriginalArg(1) Class2_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static415.method6705(arg1, 0, arg2, arg0.anInt9398, arg3, arg0.aByte103, arg0.anInt9396);
	}
}

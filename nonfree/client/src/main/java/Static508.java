import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "Lclient!taa;")
	public static final Class315 aClass315_2 = new Class315();

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7197(@OriginalArg(0) Class87 arg0) {
		if (Static90.anInt1824 < 2 && !Static301.aBoolean423 || Static112.aClass78_4 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static301.aBoolean423 && Static90.anInt1824 < 2) {
			local41 = Static81.aString20 + Static628.aClass369_32.method8475(Static377.anInt6756) + Static109.aString27 + " ->";
		} else if (Static19.aBoolean355 && Static63.aClass32_1.method789(81) && Static90.anInt1824 > 2) {
			local41 = Static603.method8360(Static220.aClass2_Sub5_Sub20_17);
		} else {
			@Pc(34) Class2_Sub5_Sub20 local34 = Static220.aClass2_Sub5_Sub20_17;
			if (local34 == null) {
				return;
			}
			local41 = Static603.method8360(local34);
			@Pc(43) int[] local43 = null;
			if (Static565.method7812(local34.anInt10077)) {
				local43 = Static570.aClass267_2.method6597((int) local34.aLong278).anIntArray506;
			} else if (local34.anInt10075 != -1) {
				local43 = Static570.aClass267_2.method6597(local34.anInt10075).anIntArray506;
			} else if (Static539.method7533(local34.anInt10077)) {
				@Pc(134) Class2_Sub51 local134 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local34.aLong278);
				if (local134 != null) {
					@Pc(139) Class11_Sub1_Sub1_Sub2_Sub2 local139 = local134.aClass11_Sub1_Sub1_Sub2_Sub2_2;
					@Pc(142) Class236 local142 = local139.aClass236_1;
					if (local142.anIntArray462 != null) {
						local142 = local142.method5779(Static438.aClass198_1);
					}
					if (local142 != null) {
						local43 = local142.anIntArray464;
					}
				}
			} else if (Static542.method7600(local34.anInt10077)) {
				@Pc(101) Class350 local101;
				if (local34.anInt10077 == 1012) {
					local101 = Static619.aClass281_4.method6734((int) local34.aLong278);
				} else {
					local101 = Static619.aClass281_4.method6734((int) (local34.aLong278 >>> 32 & 0x7FFFFFFFL));
				}
				if (local101.anIntArray665 != null) {
					local101 = local101.method8080(Static438.aClass198_1);
				}
				if (local101 != null) {
					local43 = local101.anIntArray666;
				}
			}
			if (local43 != null) {
				local41 = local41 + Static550.method7655(local43);
			}
		}
		if (Static90.anInt1824 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static90.anInt1824 - 2) + Static628.aClass369_25.method8475(Static377.anInt6756);
		}
		if (Static630.aClass78_12 != null) {
			@Pc(259) Class64 local259 = Static630.aClass78_12.method1699(arg0);
			if (local259 == null) {
				local259 = Static4.aClass64_1;
			}
			local259.method7496(Static337.anInt9546, Static437.anInt7778, Static630.aClass78_12.anInt1964, Static127.anInt2942, local41, Static67.anIntArray140, Static630.aClass78_12.anInt2013, Static136.anIntArray224, Static185.aClass20Array5, Static630.aClass78_12.anInt1991, Static623.aRandom5, Static630.aClass78_12.anInt1970, Static630.aClass78_12.anInt1990, Static630.aClass78_12.anInt1981);
			Static122.method2496(Static136.anIntArray224[2], Static136.anIntArray224[0], Static136.anIntArray224[3], Static136.anIntArray224[1]);
		} else if (Static619.aClass78_11 != null && Static499.aClass63_15 == Static239.aClass63_14) {
			@Pc(240) int local240 = Static4.aClass64_1.method7492(Static623.aRandom5, Static437.anInt7778, local41, Static436.anInt7766 + 16, Static67.anIntArray140, Static185.aClass20Array5, Static523.anInt8746 + 4);
			Static122.method2496(local240 + Static240.aClass114_19.method3015(local41), Static523.anInt8746 - -4, 16, Static436.anInt7766);
			return;
		}
	}
}

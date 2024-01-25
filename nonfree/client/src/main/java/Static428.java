import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_161 = new Class200(85, 6);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!sl;Lclient!qg;BI)V")
	public static void method6232(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) Class286 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub3 local9 = new Class2_Sub3();
		local9.anInt141 = arg0.method2859();
		local9.anInt140 = arg0.method2881();
		local9.aClass319Array2 = new Class319[local9.anInt141];
		local9.aByteArrayArrayArray1 = new byte[local9.anInt141][][];
		local9.anIntArray15 = new int[local9.anInt141];
		local9.aClass319Array1 = new Class319[local9.anInt141];
		local9.anIntArray17 = new int[local9.anInt141];
		local9.anIntArray16 = new int[local9.anInt141];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt141; local55++) {
			try {
				@Pc(61) int local61 = arg0.method2859();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local78 = arg0.method2833();
					local82 = arg0.method2833();
					local84 = 0;
					if (local61 == 1) {
						local84 = arg0.method2881();
					}
					local9.anIntArray15[local55] = local61;
					local9.anIntArray17[local55] = local84;
					local9.aClass319Array1[local55] = arg1.method6584(local82, Static471.method6672(local78));
				} else if (local61 == 3 || local61 == 4) {
					local78 = arg0.method2833();
					local82 = arg0.method2833();
					local84 = arg0.method2859();
					@Pc(137) String[] local137 = new String[local84];
					for (@Pc(139) int local139 = 0; local139 < local84; local139++) {
						local137[local139] = arg0.method2833();
					}
					@Pc(158) byte[][] local158 = new byte[local84][];
					@Pc(171) int local171;
					if (local61 == 3) {
						for (@Pc(165) int local165 = 0; local165 < local84; local165++) {
							local171 = arg0.method2881();
							local158[local165] = new byte[local171];
							arg0.method2832(local158[local165], local171, 0);
						}
					}
					local9.anIntArray15[local55] = local61;
					@Pc(196) Class[] local196 = new Class[local84];
					for (local171 = 0; local171 < local84; local171++) {
						local196[local171] = Static471.method6672(local137[local171]);
					}
					local9.aClass319Array2[local55] = arg1.method6577(Static471.method6672(local78), local196, local82);
					local9.aByteArrayArrayArray1[local55] = local158;
				}
			} catch (@Pc(235) ClassNotFoundException local235) {
				local9.anIntArray16[local55] = -1;
			} catch (@Pc(242) SecurityException local242) {
				local9.anIntArray16[local55] = -2;
			} catch (@Pc(249) NullPointerException local249) {
				local9.anIntArray16[local55] = -3;
			} catch (@Pc(256) Exception local256) {
				local9.anIntArray16[local55] = -4;
			} catch (@Pc(263) Throwable local263) {
				local9.anIntArray16[local55] = -5;
			}
		}
		Static116.aClass114_12.method2771(local9);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!sl;I)V")
	public static void method6233(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method2853();
		Static399.aClass232Array1 = new Class232[local7];
		for (@Pc(12) int local12 = 0; local12 < local7; local12++) {
			Static399.aClass232Array1[local12] = new Class232();
			Static399.aClass232Array1[local12].anInt6324 = arg0.method2853();
			Static399.aClass232Array1[local12].aString52 = arg0.method2884();
		}
		Static455.anInt9458 = arg0.method2853();
		Static528.anInt3398 = arg0.method2853();
		Static24.anInt502 = arg0.method2853();
		Static614.aClass362_Sub1Array2 = new Class362_Sub1[Static528.anInt3398 + 1 - Static455.anInt9458];
		for (@Pc(63) int local63 = 0; local63 < Static24.anInt502; local63++) {
			@Pc(68) int local68 = arg0.method2853();
			@Pc(76) Class362_Sub1 local76 = Static614.aClass362_Sub1Array2[local68] = new Class362_Sub1();
			local76.anInt10274 = arg0.method2859();
			local76.anInt10278 = arg0.method2881();
			local76.anInt10286 = Static455.anInt9458 + local68;
			local76.aString111 = arg0.method2884();
			local76.aString112 = arg0.method2884();
		}
		Static437.anInt7179 = arg0.method2881();
		Static327.aBoolean416 = true;
	}
}

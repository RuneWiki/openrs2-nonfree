import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static685 {

	@OriginalMember(owner = "client!via", name = "i", descriptor = "I")
	public static int anInt6067;

	@OriginalMember(owner = "client!via", name = "k", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!via", name = "h", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!via", name = "j", descriptor = "I")
	public static int anInt6069 = 0;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!br;Lclient!ika;BI)V")
	public static void method5296(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class3_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub31 local9 = new Class3_Sub31();
		local9.anInt4860 = arg1.method2048(255);
		local9.anInt4859 = arg1.method2036();
		local9.aClass338Array1 = new Class338[local9.anInt4860];
		local9.anIntArray352 = new int[local9.anInt4860];
		local9.aByteArrayArrayArray10 = new byte[local9.anInt4860][][];
		local9.aClass338Array2 = new Class338[local9.anInt4860];
		local9.anIntArray351 = new int[local9.anInt4860];
		local9.anIntArray353 = new int[local9.anInt4860];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt4860; local56++) {
			try {
				@Pc(62) int local62 = arg1.method2048(255);
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(89) int local89;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local83 = arg1.method2014();
					local87 = arg1.method2014();
					local89 = 0;
					if (local62 == 1) {
						local89 = arg1.method2036();
					}
					local9.anIntArray351[local56] = local62;
					local9.anIntArray352[local56] = local89;
					local9.aClass338Array2[local56] = arg0.method1401(local87, Static343.method4888(local83));
				} else if (local62 == 3 || local62 == 4) {
					local83 = arg1.method2014();
					local87 = arg1.method2014();
					local89 = arg1.method2048(255);
					@Pc(144) String[] local144 = new String[local89];
					for (@Pc(146) int local146 = 0; local146 < local89; local146++) {
						local144[local146] = arg1.method2014();
					}
					@Pc(163) byte[][] local163 = new byte[local89][];
					@Pc(176) int local176;
					if (local62 == 3) {
						for (@Pc(170) int local170 = 0; local170 < local89; local170++) {
							local176 = arg1.method2036();
							local163[local170] = new byte[local176];
							arg1.method2064(local176, 0, local163[local170]);
						}
					}
					local9.anIntArray351[local56] = local62;
					@Pc(205) Class[] local205 = new Class[local89];
					for (local176 = 0; local176 < local89; local176++) {
						local205[local176] = Static343.method4888(local144[local176]);
					}
					local9.aClass338Array1[local56] = arg0.method1388(Static343.method4888(local83), local205, local87);
					local9.aByteArrayArrayArray10[local56] = local163;
				}
			} catch (@Pc(248) ClassNotFoundException local248) {
				local9.anIntArray353[local56] = -1;
			} catch (@Pc(255) SecurityException local255) {
				local9.anIntArray353[local56] = -2;
			} catch (@Pc(262) NullPointerException local262) {
				local9.anIntArray353[local56] = -3;
			} catch (@Pc(269) Exception local269) {
				local9.anIntArray353[local56] = -4;
			} catch (@Pc(276) Throwable local276) {
				local9.anIntArray353[local56] = -5;
			}
		}
		Static256.aClass342_26.method7654(local9);
	}
}

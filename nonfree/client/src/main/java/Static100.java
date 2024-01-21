import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!kg", name = "Ub", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!kg", name = "pc", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_7 = new Class91(50);

	@OriginalMember(owner = "client!kg", name = "sc", descriptor = "I")
	public static int anInt2309 = -2;

	@OriginalMember(owner = "client!kg", name = "uc", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_665 = Static181.method2795("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!kg", name = "vc", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_666 = Static181.method2795(")1j");

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
	public static void method1728() {
		Static99.aClass91_6.method2709();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ra;BLclient!a;I)V")
	public static void method1730(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub24 local9 = new Class2_Sub24();
		local9.anInt3723 = arg0.method260();
		local9.anInt3726 = arg0.method248();
		local9.aClass15Array1 = new Class15[local9.anInt3723];
		local9.anIntArray369 = new int[local9.anInt3723];
		local9.anIntArray366 = new int[local9.anInt3723];
		local9.aClass15Array2 = new Class15[local9.anInt3723];
		local9.anIntArray367 = new int[local9.anInt3723];
		local9.aByteArrayArrayArray73 = new byte[local9.anInt3723][][];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt3723; local56++) {
			try {
				@Pc(62) int local62 = arg0.method260();
				@Pc(89) String local89;
				@Pc(98) String local98;
				@Pc(102) int local102;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local89 = new String(arg0.method259().method2418());
					local98 = new String(arg0.method259().method2418());
					local102 = 0;
					if (local62 == 1) {
						local102 = arg0.method248();
					}
					local9.anIntArray369[local56] = local62;
					local9.anIntArray367[local56] = local102;
					local9.aClass15Array2[local56] = arg1.method4(Static215.method3249(local89), local98);
				} else if (local62 == 3 || local62 == 4) {
					local89 = new String(arg0.method259().method2418());
					local98 = new String(arg0.method259().method2418());
					local102 = arg0.method260();
					@Pc(105) String[] local105 = new String[local102];
					for (@Pc(107) int local107 = 0; local107 < local102; local107++) {
						local105[local107] = new String(arg0.method259().method2418());
					}
					@Pc(127) byte[][] local127 = new byte[local102][];
					@Pc(140) int local140;
					if (local62 == 3) {
						for (@Pc(134) int local134 = 0; local134 < local102; local134++) {
							local140 = arg0.method248();
							local127[local134] = new byte[local140];
							arg0.method271(local140, local127[local134]);
						}
					}
					local9.anIntArray369[local56] = local62;
					@Pc(165) Class[] local165 = new Class[local102];
					for (local140 = 0; local140 < local102; local140++) {
						local165[local140] = Static215.method3249(local105[local140]);
					}
					local9.aClass15Array1[local56] = arg1.method7(local98, local165, Static215.method3249(local89));
					local9.aByteArrayArrayArray73[local56] = local127;
				}
			} catch (@Pc(262) ClassNotFoundException local262) {
				local9.anIntArray366[local56] = -1;
			} catch (@Pc(269) SecurityException local269) {
				local9.anIntArray366[local56] = -2;
			} catch (@Pc(276) NullPointerException local276) {
				local9.anIntArray366[local56] = -3;
			} catch (@Pc(283) Exception local283) {
				local9.anIntArray366[local56] = -4;
			} catch (@Pc(290) Throwable local290) {
				local9.anIntArray366[local56] = -5;
			}
		}
		Static180.aClass19_17.method684(local9);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	public static void method1733(@OriginalArg(0) int arg0) {
		Static121.anInt2748 = -1;
		Static113.anInt2598 = -1;
		Static143.anInt3007 = arg0;
		Static140.method2273();
	}
}

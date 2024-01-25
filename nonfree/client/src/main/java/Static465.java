import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qp", name = "D", descriptor = "I")
	public static int anInt8462;

	@OriginalMember(owner = "client!qp", name = "z", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_16 = new Class316(9, 0, 4, 1);

	@OriginalMember(owner = "client!qp", name = "B", descriptor = "Lclient!mk;")
	public static final Class207 aClass207_6 = new Class207();

	@OriginalMember(owner = "client!qp", name = "C", descriptor = "Lclient!sc;")
	public static final Class302 aClass302_12 = new Class302();

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)Z")
	public static boolean method6984(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(18) Class352 local18 = Static437.aClass199_3.method5342(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local18.method8171(arg1);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)V")
	public static void method6988(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		if (Static427.anInt8005 == 2) {
			Static443.anInt8245 = local7;
			Static512.anInt8976 = 0;
			Static25.anInt1035 = local3;
		}
		Static64.aFloat44 = local7;
		Static499.aFloat185 = local3;
		Static394.method6291();
		Static69.aBoolean558 = true;
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "()V")
	public static void method6989() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static383.aClass56ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static383.aClass56ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static489.anInt8688; local6++) {
					for (local9 = 0; local9 < Static596.anInt10195; local9++) {
						if (Static383.aClass56ArrayArrayArray1[local3][local6][local9] != null) {
							Static383.aClass56ArrayArrayArray1[local3][local6][local9].method1820();
						}
						Static383.aClass56ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static383.aClass56ArrayArrayArray1 = null;
		Static86.aClass86Array2 = null;
		if (Static591.aClass56ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static591.aClass56ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static489.anInt8688; local6++) {
					for (local9 = 0; local9 < Static596.anInt10195; local9++) {
						if (Static591.aClass56ArrayArrayArray3[local3][local6][local9] != null) {
							Static591.aClass56ArrayArrayArray3[local3][local6][local9].method1820();
						}
						Static591.aClass56ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static591.aClass56ArrayArrayArray3 = null;
		Static253.aClass86Array4 = null;
		Static405.aClass56ArrayArrayArray2 = null;
		Static34.aClass86Array5 = null;
		Static100.aBooleanArrayArray3 = null;
		Static565.aBooleanArrayArray8 = null;
		Static152.anIntArray197 = null;
		Static320.aBooleanArrayArrayArray2 = null;
		Static121.aBooleanArrayArrayArray1 = null;
		Static528.method7469();
		if (Static322.aClass15_Sub1_Sub2Array1 != null) {
			for (local3 = 0; local3 < Static1.anInt10286; local3++) {
				Static322.aClass15_Sub1_Sub2Array1[local3] = null;
			}
			Static1.anInt10286 = 0;
		}
		Static234.aClass15_Sub1Array3 = null;
		Static351.aClass15_Sub1Array4 = null;
		Static16.aClass15_Sub1Array1 = null;
		if (Static76.aClass15_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static76.aClass15_Sub1Array2.length; local3++) {
				Static76.aClass15_Sub1Array2[local3] = null;
			}
			Static42.anInt1523 = 0;
		}
		if (Static453.aClass15_Sub1Array5 != null) {
			for (local3 = 0; local3 < Static453.aClass15_Sub1Array5.length; local3++) {
				Static453.aClass15_Sub1Array5[local3] = null;
			}
			Static132.anInt3519 = 0;
		}
		if (Static626.aClass204Array1 != null) {
			for (local3 = 0; local3 < Static171.anInt4135; local3++) {
				Static626.aClass204Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static192.anInt4507; local6++) {
				for (local9 = 0; local9 < Static489.anInt8688; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static596.anInt10195; local195++) {
						Static528.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static171.anInt4135 = 0;
		}
		Static76.method1968();
		Static40.aClass194_2 = Static40.aClass194_1;
		Static40.aClass194_2.method5081();
		Static117.aByteArrayArray48 = null;
		Static442.anIntArrayArray43 = null;
		Static431.aShortArrayArray10 = null;
		if (Static394.aClass124Array1 != null) {
			Static163.method3268();
			Static269.aClass16_11.method6099(1);
			Static269.aClass16_11.method6101(0);
		}
		if (Static49.aClass243Array1 != null) {
			Static49.aClass243Array1 = null;
		}
		Static269.aClass16_11 = null;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!ig;IILclient!gh;)V")
	public static void method6990(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class118 arg2) {
		@Pc(9) Class8_Sub6 local9 = new Class8_Sub6();
		local9.anInt1476 = arg0.method8525();
		local9.anInt1475 = arg0.method8540();
		local9.aByteArrayArrayArray8 = new byte[local9.anInt1476][][];
		local9.aClass301Array2 = new Class301[local9.anInt1476];
		local9.aClass301Array1 = new Class301[local9.anInt1476];
		local9.anIntArray56 = new int[local9.anInt1476];
		local9.anIntArray54 = new int[local9.anInt1476];
		local9.anIntArray55 = new int[local9.anInt1476];
		for (@Pc(59) int local59 = 0; local59 < local9.anInt1476; local59++) {
			try {
				@Pc(65) int local65 = arg0.method8525();
				@Pc(84) String local84;
				@Pc(88) String local88;
				@Pc(90) int local90;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local84 = arg0.method8570();
					local88 = arg0.method8570();
					local90 = 0;
					if (local65 == 1) {
						local90 = arg0.method8540();
					}
					local9.anIntArray56[local59] = local65;
					local9.anIntArray54[local59] = local90;
					local9.aClass301Array1[local59] = arg2.method3408(Static486.method7166(local84), local88);
				} else if (local65 == 3 || local65 == 4) {
					local84 = arg0.method8570();
					local88 = arg0.method8570();
					local90 = arg0.method8525();
					@Pc(145) String[] local145 = new String[local90];
					for (@Pc(147) int local147 = 0; local147 < local90; local147++) {
						local145[local147] = arg0.method8570();
					}
					@Pc(162) byte[][] local162 = new byte[local90][];
					@Pc(173) int local173;
					if (local65 == 3) {
						for (@Pc(167) int local167 = 0; local167 < local90; local167++) {
							local173 = arg0.method8540();
							local162[local167] = new byte[local173];
							arg0.method8563(0, local162[local167], local173);
						}
					}
					local9.anIntArray56[local59] = local65;
					@Pc(198) Class[] local198 = new Class[local90];
					for (local173 = 0; local173 < local90; local173++) {
						local198[local173] = Static486.method7166(local145[local173]);
					}
					local9.aClass301Array2[local59] = arg2.method3393(Static486.method7166(local84), local88, local198);
					local9.aByteArrayArrayArray8[local59] = local162;
				}
			} catch (@Pc(237) ClassNotFoundException local237) {
				local9.anIntArray55[local59] = -1;
			} catch (@Pc(244) SecurityException local244) {
				local9.anIntArray55[local59] = -2;
			} catch (@Pc(251) NullPointerException local251) {
				local9.anIntArray55[local59] = -3;
			} catch (@Pc(258) Exception local258) {
				local9.anIntArray55[local59] = -4;
			} catch (@Pc(265) Throwable local265) {
				local9.anIntArray55[local59] = -5;
			}
		}
		Static572.aClass43_61.method1424(local9);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	public static void method6991(@OriginalArg(1) int arg0) {
		@Pc(1) Class8_Sub5_Sub11 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class86 local8 = Static86.aClass86Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static596.anInt10195; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static489.anInt8688; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static172.anInt4156;
							@Pc(32) int local32 = local12 << Static172.anInt4156;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class86 local41 = Static86.aClass86Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8086(local12, local15) - local41.method8086(local12, local15);
									@Pc(71) int local71 = local8.method8086(local12, local15 + 1) - local41.method8086(local12, local15 + 1);
									@Pc(91) int local91 = local8.method8086(local12 + 1, local15 + 1) - local41.method8086(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method8086(local12 + 1, local15) - local41.method8086(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}

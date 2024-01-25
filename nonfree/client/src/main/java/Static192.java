import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
	public static int anInt3589;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
	public static int anInt3590;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "[S")
	public static short[] aShortArray56 = new short[256];

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	public static int anInt3587 = 0;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "[I")
	public static final int[] anIntArray301 = new int[8];

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIILclient!jga;)V")
	public static void method2991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub3_Sub11 arg2) {
		if (arg2 == null || arg2 == Static16.aClass262_68.aClass14_230) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt4754;
		@Pc(18) int local18 = arg2.anInt4750;
		@Pc(21) int local21 = arg2.anInt4752;
		@Pc(25) int local25 = (int) arg2.aLong144;
		@Pc(28) long local28 = arg2.aLong144;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(48) Class14_Sub44 local48;
		@Pc(57) Class12_Sub2_Sub2_Sub1_Sub1 local57;
		@Pc(70) Class14_Sub19 local70;
		if (local21 == 58) {
			local48 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local25);
			if (local48 != null) {
				Static608.anInt10273 = arg0;
				Static285.anInt4869 = 0;
				local57 = local48.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				Static496.anInt8825 = arg1;
				Static538.anInt9253 = 2;
				local70 = Static286.method4081(Static205.aClass394_1, Static353.aClass100_88);
				local70.aClass14_Sub29_Sub1_1.method5892(local25);
				local70.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
				Static576.method8234(local70);
				Static380.method5625(local57.method2422(), -2, local57.method2422(), local57.anIntArray241[0], true, local57.anIntArray242[0], 0, 0);
			}
		}
		@Pc(133) Class14_Sub19 local133;
		if (local21 == 49) {
			Static608.anInt10273 = arg0;
			Static538.anInt9253 = 2;
			Static496.anInt8825 = arg1;
			Static285.anInt4869 = 0;
			local133 = Static286.method4081(Static205.aClass394_1, Static100.aClass100_30);
			local133.aClass14_Sub29_Sub1_1.method5871(Static68.anInt1565);
			local133.aClass14_Sub29_Sub1_1.method5894(Static639.anInt10686);
			local133.aClass14_Sub29_Sub1_1.method5871(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt2945);
			local133.aClass14_Sub29_Sub1_1.method5849(Static402.anInt10315);
			local133.aClass14_Sub29_Sub1_1.method5896(Static68.aClass65_1.method1565(82) ? 1 : 0);
			Static576.method8234(local133);
		}
		@Pc(178) Class12_Sub2_Sub2_Sub1_Sub2 local178;
		@Pc(197) Class14_Sub19 local197;
		if (local21 == 47) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static538.anInt9253 = 2;
				Static285.anInt4869 = 0;
				Static496.anInt8825 = arg1;
				Static608.anInt10273 = arg0;
				local197 = Static286.method4081(Static205.aClass394_1, Static4.aClass100_1);
				local197.aClass14_Sub29_Sub1_1.method5899(Static68.aClass65_1.method1565(82) ? 1 : 0);
				local197.aClass14_Sub29_Sub1_1.method5894(local25);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 2) {
			Static496.anInt8825 = arg1;
			Static608.anInt10273 = arg0;
			Static538.anInt9253 = 2;
			Static285.anInt4869 = 0;
			local133 = Static286.method4081(Static205.aClass394_1, Static401.aClass100_101);
			local133.aClass14_Sub29_Sub1_1.method5892(local15 + Static329.anInt6225);
			local133.aClass14_Sub29_Sub1_1.method5859(local18 + Static202.anInt3755);
			local133.aClass14_Sub29_Sub1_1.method5894((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local133.aClass14_Sub29_Sub1_1.method5896(Static68.aClass65_1.method1565(82) ? 1 : 0);
			Static576.method8234(local133);
			Static368.method5528(local15, local18, local28);
		}
		@Pc(316) Class230 local316;
		if (local21 == 6) {
			local316 = Static572.method8204(local15, local18);
			if (local316 != null) {
				Static348.method5322(local316);
			}
		}
		if (local21 == 3 && Static354.aClass230_5 == null) {
			Static662.method9181(local18, local15);
			Static354.aClass230_5 = Static572.method8204(local15, local18);
			Static634.method8860(Static354.aClass230_5);
		}
		if (local21 == 23) {
			if (Static447.anInt10238 > 0 && Static68.aClass65_1.method1565(82) && Static68.aClass65_1.method1565(81)) {
				Static524.method7529(Static329.anInt6225 + local15, local18 + Static202.anInt3755, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146);
			} else {
				local133 = Static536.method7642(local15, local25, local18);
				if (local25 == 1) {
					local133.aClass14_Sub29_Sub1_1.method5854(-1);
					local133.aClass14_Sub29_Sub1_1.method5854(-1);
					local133.aClass14_Sub29_Sub1_1.method5859((int) Static543.aFloat228);
					local133.aClass14_Sub29_Sub1_1.method5854(57);
					local133.aClass14_Sub29_Sub1_1.method5854(Static470.anInt10171);
					local133.aClass14_Sub29_Sub1_1.method5854(Static422.anInt7593);
					local133.aClass14_Sub29_Sub1_1.method5854(89);
					local133.aClass14_Sub29_Sub1_1.method5859(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998);
					local133.aClass14_Sub29_Sub1_1.method5859(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002);
					local133.aClass14_Sub29_Sub1_1.method5854(63);
				} else {
					Static538.anInt9253 = 1;
					Static608.anInt10273 = arg0;
					Static285.anInt4869 = 0;
					Static496.anInt8825 = arg1;
				}
				Static576.method8234(local133);
				Static380.method5625(1, -4, 1, local15, true, local18, 0, 0);
			}
		}
		if (local21 == 50) {
			Static608.anInt10273 = arg0;
			Static496.anInt8825 = arg1;
			Static285.anInt4869 = 0;
			Static538.anInt9253 = 2;
			local133 = Static286.method4081(Static205.aClass394_1, Static345.aClass100_87);
			local133.aClass14_Sub29_Sub1_1.method5892(local25);
			local133.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
			local133.aClass14_Sub29_Sub1_1.method5871(local15 + Static329.anInt6225);
			local133.aClass14_Sub29_Sub1_1.method5859(local18 + Static202.anInt3755);
			Static576.method8234(local133);
			Static145.method2316(local18, local15);
		}
		if (local21 == 16) {
			local48 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local25);
			if (local48 != null) {
				Static496.anInt8825 = arg1;
				Static608.anInt10273 = arg0;
				local57 = local48.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				Static538.anInt9253 = 2;
				Static285.anInt4869 = 0;
				local70 = Static286.method4081(Static205.aClass394_1, Static97.aClass100_29);
				local70.aClass14_Sub29_Sub1_1.method5899(Static68.aClass65_1.method1565(82) ? 1 : 0);
				local70.aClass14_Sub29_Sub1_1.method5892(local25);
				Static576.method8234(local70);
				Static380.method5625(local57.method2422(), -2, local57.method2422(), local57.anIntArray241[0], true, local57.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 57) {
			Static496.anInt8825 = arg1;
			Static608.anInt10273 = arg0;
			Static538.anInt9253 = 2;
			Static285.anInt4869 = 0;
			local133 = Static286.method4081(Static205.aClass394_1, Static377.aClass100_94);
			local133.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
			local133.aClass14_Sub29_Sub1_1.method5859(Static202.anInt3755 + local18);
			local133.aClass14_Sub29_Sub1_1.method5859(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local133.aClass14_Sub29_Sub1_1.method5871(local15 + Static329.anInt6225);
			Static576.method8234(local133);
			Static368.method5528(local15, local18, local28);
		}
		if (local21 == 22) {
			Static496.anInt8825 = arg1;
			Static538.anInt9253 = 2;
			Static285.anInt4869 = 0;
			Static608.anInt10273 = arg0;
			local133 = Static286.method4081(Static205.aClass394_1, Static573.aClass100_123);
			local133.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
			local133.aClass14_Sub29_Sub1_1.method5892(local25);
			local133.aClass14_Sub29_Sub1_1.method5871(Static202.anInt3755 + local18);
			local133.aClass14_Sub29_Sub1_1.method5859(Static329.anInt6225 + local15);
			Static576.method8234(local133);
			Static145.method2316(local18, local15);
		}
		if (local21 == 52) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static496.anInt8825 = arg1;
				Static538.anInt9253 = 2;
				Static608.anInt10273 = arg0;
				Static285.anInt4869 = 0;
				local197 = Static286.method4081(Static205.aClass394_1, Static112.aClass100_31);
				local197.aClass14_Sub29_Sub1_1.method5871(local25);
				local197.aClass14_Sub29_Sub1_1.method5883(Static68.aClass65_1.method1565(82) ? 1 : 0);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 1006 || local21 == 1003 || local21 == 1007 || local21 == 1008 || local21 == 1002) {
			Static515.method7477(local15, local25, local21);
		}
		if (local21 == 30 || local21 == 1004) {
			Static69.method1357(local15, local18, local25, arg2.aString58);
		}
		if (local21 == 10) {
			local48 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local25);
			if (local48 != null) {
				Static285.anInt4869 = 0;
				local57 = local48.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				Static608.anInt10273 = arg0;
				Static496.anInt8825 = arg1;
				Static538.anInt9253 = 2;
				local70 = Static286.method4081(Static205.aClass394_1, Static273.aClass100_74);
				local70.aClass14_Sub29_Sub1_1.method5892(local25);
				local70.aClass14_Sub29_Sub1_1.method5896(Static68.aClass65_1.method1565(82) ? 1 : 0);
				Static576.method8234(local70);
				Static380.method5625(local57.method2422(), -2, local57.method2422(), local57.anIntArray241[0], true, local57.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 12) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static496.anInt8825 = arg1;
				Static538.anInt9253 = 2;
				Static285.anInt4869 = 0;
				Static608.anInt10273 = arg0;
				local197 = Static286.method4081(Static205.aClass394_1, Static458.aClass100_120);
				local197.aClass14_Sub29_Sub1_1.method5896(Static68.aClass65_1.method1565(82) ? 1 : 0);
				local197.aClass14_Sub29_Sub1_1.method5892(local25);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 17) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static496.anInt8825 = arg1;
				Static285.anInt4869 = 0;
				Static608.anInt10273 = arg0;
				Static538.anInt9253 = 2;
				local197 = Static286.method4081(Static205.aClass394_1, Static88.aClass100_139);
				local197.aClass14_Sub29_Sub1_1.method5883(Static68.aClass65_1.method1565(82) ? 1 : 0);
				local197.aClass14_Sub29_Sub1_1.method5871(local25);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 19) {
			Static608.anInt10273 = arg0;
			Static496.anInt8825 = arg1;
			Static538.anInt9253 = 2;
			Static285.anInt4869 = 0;
			local133 = Static286.method4081(Static205.aClass394_1, Static635.aClass100_135);
			local133.aClass14_Sub29_Sub1_1.method5859(local18 + Static202.anInt3755);
			local133.aClass14_Sub29_Sub1_1.method5892(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local133.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
			local133.aClass14_Sub29_Sub1_1.method5859(Static329.anInt6225 + local15);
			Static576.method8234(local133);
			Static368.method5528(local15, local18, local28);
		}
		if (local21 == 60) {
			Static496.anInt8825 = arg1;
			Static538.anInt9253 = 2;
			Static285.anInt4869 = 0;
			Static608.anInt10273 = arg0;
			local133 = Static286.method4081(Static205.aClass394_1, Static32.aClass100_118);
			local133.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
			local133.aClass14_Sub29_Sub1_1.method5894(Static202.anInt3755 + local18);
			local133.aClass14_Sub29_Sub1_1.method5894(local25);
			local133.aClass14_Sub29_Sub1_1.method5892(local15 + Static329.anInt6225);
			Static576.method8234(local133);
			Static145.method2316(local18, local15);
		}
		if (local21 == 59) {
			Static538.anInt9253 = 2;
			Static608.anInt10273 = arg0;
			Static285.anInt4869 = 0;
			Static496.anInt8825 = arg1;
			local133 = Static286.method4081(Static205.aClass394_1, Static313.aClass100_110);
			local133.aClass14_Sub29_Sub1_1.method5871(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local133.aClass14_Sub29_Sub1_1.method5859(Static329.anInt6225 + local15);
			local133.aClass14_Sub29_Sub1_1.method5871(Static202.anInt3755 + local18);
			local133.aClass14_Sub29_Sub1_1.method5896(Static68.aClass65_1.method1565(82) ? 1 : 0);
			Static576.method8234(local133);
			Static368.method5528(local15, local18, local28);
		}
		if (local21 == 1001) {
			Static538.anInt9253 = 2;
			Static285.anInt4869 = 0;
			Static496.anInt8825 = arg1;
			Static608.anInt10273 = arg0;
			local133 = Static286.method4081(Static205.aClass394_1, Static180.aClass100_51);
			local133.aClass14_Sub29_Sub1_1.method5859(local25);
			Static576.method8234(local133);
		}
		if (local21 == 1011) {
			Static496.anInt8825 = arg1;
			Static538.anInt9253 = 2;
			Static285.anInt4869 = 0;
			Static608.anInt10273 = arg0;
			local133 = Static286.method4081(Static205.aClass394_1, Static339.aClass100_86);
			local133.aClass14_Sub29_Sub1_1.method5892(Static202.anInt3755 + local18);
			local133.aClass14_Sub29_Sub1_1.method5894((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local133.aClass14_Sub29_Sub1_1.method5894(Static329.anInt6225 + local15);
			local133.aClass14_Sub29_Sub1_1.method5883(Static68.aClass65_1.method1565(82) ? 1 : 0);
			Static576.method8234(local133);
			Static368.method5528(local15, local18, local28);
		}
		if (local21 == 48) {
			Static496.anInt8825 = arg1;
			Static538.anInt9253 = 2;
			Static285.anInt4869 = 0;
			Static608.anInt10273 = arg0;
			local133 = Static286.method4081(Static205.aClass394_1, Static292.aClass100_78);
			local133.aClass14_Sub29_Sub1_1.method5894(Static202.anInt3755 + local18);
			local133.aClass14_Sub29_Sub1_1.method5861(Static402.anInt10315);
			local133.aClass14_Sub29_Sub1_1.method5883(Static68.aClass65_1.method1565(82) ? 1 : 0);
			local133.aClass14_Sub29_Sub1_1.method5871(Static68.anInt1565);
			local133.aClass14_Sub29_Sub1_1.method5871(local15 + Static329.anInt6225);
			local133.aClass14_Sub29_Sub1_1.method5892(Static639.anInt10686);
			local133.aClass14_Sub29_Sub1_1.method5859(local25);
			Static576.method8234(local133);
			Static145.method2316(local18, local15);
		}
		if (local21 == 11) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static608.anInt10273 = arg0;
				Static538.anInt9253 = 2;
				Static285.anInt4869 = 0;
				Static496.anInt8825 = arg1;
				local197 = Static286.method4081(Static205.aClass394_1, Static129.aClass100_96);
				local197.aClass14_Sub29_Sub1_1.method5892(local25);
				local197.aClass14_Sub29_Sub1_1.method5896(Static68.aClass65_1.method1565(82) ? 1 : 0);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 5) {
			local316 = Static572.method8204(local15, local18);
			if (local316 != null) {
				Static141.method1563();
				@Pc(1553) Class14_Sub33 local1553 = Static78.method1481(local316);
				Static178.method2842(local1553.method5402(), local1553.anInt6587, local316);
				Static139.aString30 = Static59.method1225(local316);
				Static639.aString114 = local316.aString71 + "<col=ffffff>";
				if (Static139.aString30 == null) {
					Static139.aString30 = "Null";
				}
			}
			return;
		}
		if (local21 == 18) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static538.anInt9253 = 2;
				Static496.anInt8825 = arg1;
				Static608.anInt10273 = arg0;
				Static285.anInt4869 = 0;
				local197 = Static286.method4081(Static205.aClass394_1, Static100.aClass100_30);
				local197.aClass14_Sub29_Sub1_1.method5871(Static68.anInt1565);
				local197.aClass14_Sub29_Sub1_1.method5894(Static639.anInt10686);
				local197.aClass14_Sub29_Sub1_1.method5871(local25);
				local197.aClass14_Sub29_Sub1_1.method5849(Static402.anInt10315);
				local197.aClass14_Sub29_Sub1_1.method5896(Static68.aClass65_1.method1565(82) ? 1 : 0);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 4) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static538.anInt9253 = 2;
				Static608.anInt10273 = arg0;
				Static285.anInt4869 = 0;
				Static496.anInt8825 = arg1;
				local197 = Static286.method4081(Static205.aClass394_1, Static273.aClass100_73);
				local197.aClass14_Sub29_Sub1_1.method5899(Static68.aClass65_1.method1565(82) ? 1 : 0);
				local197.aClass14_Sub29_Sub1_1.method5894(local25);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 20) {
			if (Static447.anInt10238 > 0 && Static68.aClass65_1.method1565(82) && Static68.aClass65_1.method1565(81)) {
				Static524.method7529(Static329.anInt6225 + local15, Static202.anInt3755 + local18, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146);
			} else {
				Static285.anInt4869 = 0;
				Static496.anInt8825 = arg1;
				Static608.anInt10273 = arg0;
				Static538.anInt9253 = 1;
				local133 = Static286.method4081(Static205.aClass394_1, Static246.aClass100_69);
				local133.aClass14_Sub29_Sub1_1.method5892(local18 + Static202.anInt3755);
				local133.aClass14_Sub29_Sub1_1.method5871(Static329.anInt6225 + local15);
				Static576.method8234(local133);
			}
		}
		if (local21 == 1010) {
			Static496.anInt8825 = arg1;
			Static608.anInt10273 = arg0;
			Static538.anInt9253 = 2;
			Static285.anInt4869 = 0;
			local133 = Static286.method4081(Static205.aClass394_1, Static202.aClass100_56);
			local133.aClass14_Sub29_Sub1_1.method5859(local25);
			Static576.method8234(local133);
		}
		if (local21 == 46) {
			Static496.anInt8825 = arg1;
			Static285.anInt4869 = 0;
			Static538.anInt9253 = 2;
			Static608.anInt10273 = arg0;
			local133 = Static286.method4081(Static205.aClass394_1, Static325.aClass100_85);
			local133.aClass14_Sub29_Sub1_1.method5892(local25);
			local133.aClass14_Sub29_Sub1_1.method5899(Static68.aClass65_1.method1565(82) ? 1 : 0);
			local133.aClass14_Sub29_Sub1_1.method5859(local18 + Static202.anInt3755);
			local133.aClass14_Sub29_Sub1_1.method5859(local15 + Static329.anInt6225);
			Static576.method8234(local133);
			Static145.method2316(local18, local15);
		}
		if (local21 == 53) {
			Static496.anInt8825 = arg1;
			Static538.anInt9253 = 2;
			Static285.anInt4869 = 0;
			Static608.anInt10273 = arg0;
			local133 = Static286.method4081(Static205.aClass394_1, Static202.aClass100_55);
			local133.aClass14_Sub29_Sub1_1.method5871(local25);
			local133.aClass14_Sub29_Sub1_1.method5894(local18 + Static202.anInt3755);
			local133.aClass14_Sub29_Sub1_1.method5892(local15 + Static329.anInt6225);
			local133.aClass14_Sub29_Sub1_1.method5899(Static68.aClass65_1.method1565(82) ? 1 : 0);
			Static576.method8234(local133);
			Static145.method2316(local18, local15);
		}
		if (local21 == 51) {
			Static496.anInt8825 = arg1;
			Static608.anInt10273 = arg0;
			Static285.anInt4869 = 0;
			Static538.anInt9253 = 1;
			local133 = Static286.method4081(Static205.aClass394_1, Static302.aClass100_127);
			local133.aClass14_Sub29_Sub1_1.method5859(Static329.anInt6225 + local15);
			local133.aClass14_Sub29_Sub1_1.method5871(Static68.anInt1565);
			local133.aClass14_Sub29_Sub1_1.method5894(Static202.anInt3755 + local18);
			local133.aClass14_Sub29_Sub1_1.method5859(Static639.anInt10686);
			local133.aClass14_Sub29_Sub1_1.method5861(Static402.anInt10315);
			Static576.method8234(local133);
			Static380.method5625(1, -4, 1, local15, true, local18, 0, 0);
		}
		if (local21 == 15) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static285.anInt4869 = 0;
				Static608.anInt10273 = arg0;
				Static538.anInt9253 = 2;
				Static496.anInt8825 = arg1;
				local197 = Static286.method4081(Static205.aClass394_1, Static211.aClass100_62);
				local197.aClass14_Sub29_Sub1_1.method5892(local25);
				local197.aClass14_Sub29_Sub1_1.method5899(Static68.aClass65_1.method1565(82) ? 1 : 0);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 13) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static496.anInt8825 = arg1;
				Static285.anInt4869 = 0;
				Static538.anInt9253 = 2;
				Static608.anInt10273 = arg0;
				local197 = Static286.method4081(Static205.aClass394_1, Static513.aClass100_108);
				local197.aClass14_Sub29_Sub1_1.method5894(local25);
				local197.aClass14_Sub29_Sub1_1.method5896(Static68.aClass65_1.method1565(82) ? 1 : 0);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 1009) {
			Static285.anInt4869 = 0;
			Static538.anInt9253 = 2;
			Static496.anInt8825 = arg1;
			Static608.anInt10273 = arg0;
			local48 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local25);
			if (local48 != null) {
				local57 = local48.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				@Pc(2193) Class283 local2193 = local57.aClass283_1;
				if (local2193.anIntArray638 != null) {
					local2193 = local2193.method7129(Static595.aClass241_1);
				}
				if (local2193 != null) {
					@Pc(2212) Class14_Sub19 local2212 = Static286.method4081(Static205.aClass394_1, Static592.aClass100_28);
					local2212.aClass14_Sub29_Sub1_1.method5859(local2193.anInt8645);
					Static576.method8234(local2212);
				}
			}
		}
		if (local21 == 8) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static538.anInt9253 = 2;
				Static496.anInt8825 = arg1;
				Static608.anInt10273 = arg0;
				Static285.anInt4869 = 0;
				local197 = Static286.method4081(Static205.aClass394_1, Static553.aClass100_119);
				local197.aClass14_Sub29_Sub1_1.method5896(Static68.aClass65_1.method1565(82) ? 1 : 0);
				local197.aClass14_Sub29_Sub1_1.method5892(local25);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 25) {
			local48 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local25);
			if (local48 != null) {
				Static608.anInt10273 = arg0;
				Static496.anInt8825 = arg1;
				local57 = local48.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				Static285.anInt4869 = 0;
				Static538.anInt9253 = 2;
				local70 = Static286.method4081(Static205.aClass394_1, Static223.aClass100_65);
				local70.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
				local70.aClass14_Sub29_Sub1_1.method5859(local25);
				Static576.method8234(local70);
				Static380.method5625(local57.method2422(), -2, local57.method2422(), local57.anIntArray241[0], true, local57.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 45) {
			local48 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local25);
			if (local48 != null) {
				Static496.anInt8825 = arg1;
				Static608.anInt10273 = arg0;
				local57 = local48.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				Static538.anInt9253 = 2;
				Static285.anInt4869 = 0;
				local70 = Static286.method4081(Static205.aClass394_1, Static405.aClass100_103);
				local70.aClass14_Sub29_Sub1_1.method5875(Static402.anInt10315);
				local70.aClass14_Sub29_Sub1_1.method5871(Static68.anInt1565);
				local70.aClass14_Sub29_Sub1_1.method5871(Static639.anInt10686);
				local70.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
				local70.aClass14_Sub29_Sub1_1.method5871(local25);
				Static576.method8234(local70);
				Static380.method5625(local57.method2422(), -2, local57.method2422(), local57.anIntArray241[0], true, local57.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 9) {
			Static608.anInt10273 = arg0;
			Static285.anInt4869 = 0;
			Static496.anInt8825 = arg1;
			Static538.anInt9253 = 2;
			local133 = Static286.method4081(Static205.aClass394_1, Static233.aClass100_67);
			local133.aClass14_Sub29_Sub1_1.method5859(Static68.anInt1565);
			local133.aClass14_Sub29_Sub1_1.method5871(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local133.aClass14_Sub29_Sub1_1.method5859(Static639.anInt10686);
			local133.aClass14_Sub29_Sub1_1.method5894(local15 + Static329.anInt6225);
			local133.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
			local133.aClass14_Sub29_Sub1_1.method5875(Static402.anInt10315);
			local133.aClass14_Sub29_Sub1_1.method5894(Static202.anInt3755 + local18);
			Static576.method8234(local133);
			Static368.method5528(local15, local18, local28);
		}
		if (local21 == 44) {
			local48 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local25);
			if (local48 != null) {
				Static538.anInt9253 = 2;
				Static608.anInt10273 = arg0;
				Static496.anInt8825 = arg1;
				local57 = local48.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				Static285.anInt4869 = 0;
				local70 = Static286.method4081(Static205.aClass394_1, Static476.aClass100_106);
				local70.aClass14_Sub29_Sub1_1.method5859(local25);
				local70.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
				Static576.method8234(local70);
				Static380.method5625(local57.method2422(), -2, local57.method2422(), local57.anIntArray241[0], true, local57.anIntArray242[0], 0, 0);
			}
		}
		if (local21 == 21) {
			local178 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local25];
			if (local178 != null) {
				Static608.anInt10273 = arg0;
				Static285.anInt4869 = 0;
				Static496.anInt8825 = arg1;
				Static538.anInt9253 = 2;
				local197 = Static286.method4081(Static205.aClass394_1, Static149.aClass100_92);
				local197.aClass14_Sub29_Sub1_1.method5883(Static68.aClass65_1.method1565(82) ? 1 : 0);
				local197.aClass14_Sub29_Sub1_1.method5892(local25);
				Static576.method8234(local197);
				Static380.method5625(local178.method2422(), -2, local178.method2422(), local178.anIntArray241[0], true, local178.anIntArray242[0], 0, 0);
			}
		}
		if (Static238.aBoolean302) {
			Static141.method1563();
		}
		if (Static137.aClass230_1 != null && Static671.anInt11142 == 0) {
			Static634.method8860(Static137.aClass230_1);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	public static void method2992() {
		Static481.aClass14_Sub29_Sub1_2.method4285();
		@Pc(18) int local18 = Static481.aClass14_Sub29_Sub1_2.method4289(8);
		@Pc(27) int local27;
		if (local18 < Static471.anInt8216) {
			for (local27 = local18; local27 < Static471.anInt8216; local27++) {
				Static61.anIntArray97[Static305.anInt5330++] = Static530.anIntArray671[local27];
			}
		}
		if (Static471.anInt8216 < local18) {
			throw new RuntimeException("gnpov1");
		}
		Static471.anInt8216 = 0;
		for (local27 = 0; local27 < local18; local27++) {
			@Pc(65) int local65 = Static530.anIntArray671[local27];
			@Pc(73) Class12_Sub2_Sub2_Sub1_Sub1 local73 = ((Class14_Sub44) Static579.aClass187_73.method4078((long) local65)).aClass12_Sub2_Sub2_Sub1_Sub1_2;
			@Pc(78) int local78 = Static481.aClass14_Sub29_Sub1_2.method4289(1);
			if (local78 == 0) {
				Static530.anIntArray671[Static471.anInt8216++] = local65;
				local73.anInt2941 = Static125.anInt2486;
			} else {
				@Pc(101) int local101 = Static481.aClass14_Sub29_Sub1_2.method4289(2);
				if (local101 == 0) {
					Static530.anIntArray671[Static471.anInt8216++] = local65;
					local73.anInt2941 = Static125.anInt2486;
					Static272.anIntArray383[Static621.anInt10451++] = local65;
				} else {
					@Pc(148) int local148;
					@Pc(158) int local158;
					if (local101 == 1) {
						Static530.anIntArray671[Static471.anInt8216++] = local65;
						local73.anInt2941 = Static125.anInt2486;
						local148 = Static481.aClass14_Sub29_Sub1_2.method4289(3);
						local73.method620(1, local148);
						local158 = Static481.aClass14_Sub29_Sub1_2.method4289(1);
						if (local158 == 1) {
							Static272.anIntArray383[Static621.anInt10451++] = local65;
						}
					} else if (local101 == 2) {
						Static530.anIntArray671[Static471.anInt8216++] = local65;
						local73.anInt2941 = Static125.anInt2486;
						if (Static481.aClass14_Sub29_Sub1_2.method4289(1) == 1) {
							local148 = Static481.aClass14_Sub29_Sub1_2.method4289(3);
							local73.method620(2, local148);
							local158 = Static481.aClass14_Sub29_Sub1_2.method4289(3);
							local73.method620(2, local158);
						} else {
							local148 = Static481.aClass14_Sub29_Sub1_2.method4289(3);
							local73.method620(0, local148);
						}
						local148 = Static481.aClass14_Sub29_Sub1_2.method4289(1);
						if (local148 == 1) {
							Static272.anIntArray383[Static621.anInt10451++] = local65;
						}
					} else if (local101 == 3) {
						Static61.anIntArray97[Static305.anInt5330++] = local65;
					}
				}
			}
		}
	}
}

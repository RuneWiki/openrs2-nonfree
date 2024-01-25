import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!un", name = "v", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_154 = new Class286(44, 3);

	@OriginalMember(owner = "client!un", name = "A", descriptor = "[I")
	public static final int[] anIntArray642 = new int[16];

	@OriginalMember(owner = "client!un", name = "B", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_13 = new Class357(2, 2);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IILclient!bfa;I)V")
	public static void method7395(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub5 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static375.aClass8_38.aClass2_9) {
			return;
		}
		@Pc(18) int local18 = arg1.anInt898;
		@Pc(21) int local21 = arg1.anInt897;
		@Pc(24) int local24 = arg1.anInt902;
		@Pc(28) int local28 = (int) arg1.aLong30;
		@Pc(31) long local31 = arg1.aLong30;
		if (local24 >= 2000) {
			local24 -= 2000;
		}
		@Pc(59) Class2_Sub42 local59;
		if (local24 == 16) {
			Static364.anInt6471 = 2;
			Static516.anInt8581 = 0;
			Static148.anInt3055 = arg0;
			Static210.anInt4044 = arg2;
			local59 = Static249.method3910(Static352.aClass286_112, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4329(local18 + Static35.anInt906);
			local59.aClass2_Sub15_Sub2_2.method4350(local21 + Static130.anInt5246);
			local59.aClass2_Sub15_Sub2_2.method4350(local28);
			Static531.method7296(local59);
			Static114.method1699(local18, local21);
		}
		if (local24 == 1012 || local24 == 1007 || local24 == 1010 || local24 == 1002 || local24 == 1006) {
			Static170.method2954(local24, local18, local28);
		}
		if (local24 == 1009) {
			Static364.anInt6471 = 2;
			Static148.anInt3055 = arg0;
			Static516.anInt8581 = 0;
			Static210.anInt4044 = arg2;
			local59 = Static249.method3910(Static153.aClass286_47, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4330(local21 + Static130.anInt5246);
			local59.aClass2_Sub15_Sub2_2.method4349(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4350(local18 + Static35.anInt906);
			local59.aClass2_Sub15_Sub2_2.method4350(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static531.method7296(local59);
			Static503.method7005(local18, local31, local21);
		}
		if (local24 == 6) {
			Static210.anInt4044 = arg2;
			Static516.anInt8581 = 0;
			Static148.anInt3055 = arg0;
			Static364.anInt6471 = 2;
			local59 = Static249.method3910(Static87.aClass286_32, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4290(local28);
			local59.aClass2_Sub15_Sub2_2.method4329(Static35.anInt906 + local18);
			local59.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4350(local21 + Static130.anInt5246);
			Static531.method7296(local59);
			Static114.method1699(local18, local21);
		}
		if (local24 == 21) {
			if (Static210.anInt4045 > 0 && Static529.aClass177_10.method4001(82) && Static529.aClass177_10.method4001(81)) {
				Static325.method7943(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112, local21 + Static130.anInt5246, Static35.anInt906 - -local18);
			} else {
				Static210.anInt4044 = arg2;
				Static364.anInt6471 = 1;
				Static148.anInt3055 = arg0;
				Static516.anInt8581 = 0;
				local59 = Static249.method3910(Static504.aClass286_151, Static400.aClass145_2);
				local59.aClass2_Sub15_Sub2_2.method4350(Static130.anInt5246 + local21);
				local59.aClass2_Sub15_Sub2_2.method4290(local18 + Static35.anInt906);
				Static531.method7296(local59);
			}
		}
		if (local24 == 1004) {
			Static148.anInt3055 = arg0;
			Static210.anInt4044 = arg2;
			Static516.anInt8581 = 0;
			Static364.anInt6471 = 2;
			local59 = Static249.method3910(Static359.aClass286_113, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4350(local28);
			Static531.method7296(local59);
		}
		if (local24 == 22) {
			Static210.anInt4044 = arg2;
			Static516.anInt8581 = 0;
			Static148.anInt3055 = arg0;
			Static364.anInt6471 = 2;
			local59 = Static249.method3910(Static122.aClass286_40, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4329(Integer.MAX_VALUE & (int) (local31 >>> 32));
			local59.aClass2_Sub15_Sub2_2.method4350(Static130.anInt5246 + local21);
			local59.aClass2_Sub15_Sub2_2.method4330(local18 + Static35.anInt906);
			local59.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
			Static531.method7296(local59);
			Static503.method7005(local18, local31, local21);
		}
		@Pc(427) Class196 local427;
		if (local24 == 57) {
			local427 = Static217.method3485(local21, local18);
			if (local427 != null) {
				Static566.method7699();
				@Pc(434) Class2_Sub35 local434 = Static67.method1102(local427);
				Static119.method1773(local427, local434.method5420(), local434.anInt6469);
				Static271.aString38 = Static509.method7072(local427);
				if (Static271.aString38 == null) {
					Static271.aString38 = "Null";
				}
				Static12.aString4 = local427.aString41 + "<col=ffffff>";
			}
			return;
		}
		@Pc(487) Class2_Sub42 local487;
		@Pc(468) Class6_Sub1_Sub1_Sub1_Sub2 local468;
		if (local24 == 12) {
			local468 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local468 != null) {
				Static148.anInt3055 = arg0;
				Static516.anInt8581 = 0;
				Static210.anInt4044 = arg2;
				Static364.anInt6471 = 2;
				local487 = Static249.method3910(Static487.aClass286_143, Static400.aClass145_2);
				local487.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
				local487.aClass2_Sub15_Sub2_2.method4350(local28);
				Static531.method7296(local487);
				Static295.method7121(0, -2, local468.method6165(), 0, true, local468.anIntArray510[0], local468.anIntArray509[0], local468.method6165());
			}
		}
		if (local24 == 47) {
			Static516.anInt8581 = 0;
			Static364.anInt6471 = 2;
			Static148.anInt3055 = arg0;
			Static210.anInt4044 = arg2;
			local59 = Static249.method3910(Static287.aClass286_97, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4329(local21 + Static130.anInt5246);
			local59.aClass2_Sub15_Sub2_2.method4329(Integer.MAX_VALUE & (int) (local31 >>> 32));
			local59.aClass2_Sub15_Sub2_2.method4330(local18 + Static35.anInt906);
			local59.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
			Static531.method7296(local59);
			Static503.method7005(local18, local31, local21);
		}
		@Pc(628) Class2_Sub42 local628;
		@Pc(621) Class6_Sub1_Sub1_Sub1_Sub1 local621;
		@Pc(606) Class2_Sub32 local606;
		if (local24 == 17) {
			local606 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local28);
			if (local606 != null) {
				Static148.anInt3055 = arg0;
				Static364.anInt6471 = 2;
				Static516.anInt8581 = 0;
				local621 = local606.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				Static210.anInt4044 = arg2;
				local628 = Static249.method3910(Static128.aClass286_43, Static400.aClass145_2);
				local628.aClass2_Sub15_Sub2_2.method4350(local28);
				local628.aClass2_Sub15_Sub2_2.method4333(Static529.aClass177_10.method4001(82) ? 1 : 0);
				Static531.method7296(local628);
				Static295.method7121(0, -2, local621.method6165(), 0, true, local621.anIntArray510[0], local621.anIntArray509[0], local621.method6165());
			}
		}
		if (local24 == 2) {
			Static148.anInt3055 = arg0;
			Static516.anInt8581 = 0;
			Static210.anInt4044 = arg2;
			Static364.anInt6471 = 2;
			local59 = Static249.method3910(Static562.aClass286_163, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4333(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4330(Static428.anInt7337);
			local59.aClass2_Sub15_Sub2_2.method4316(Static514.anInt406);
			local59.aClass2_Sub15_Sub2_2.method4330(Static510.anInt8520);
			local59.aClass2_Sub15_Sub2_2.method4330(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.lb);
			Static531.method7296(local59);
		}
		if (local24 == 45) {
			local427 = Static217.method3485(local21, local18);
			if (local427 != null) {
				Static427.method6118(local427);
			}
		}
		if (local24 == 30) {
			Static210.anInt4044 = arg2;
			Static364.anInt6471 = 1;
			Static148.anInt3055 = arg0;
			Static516.anInt8581 = 0;
			local59 = Static249.method3910(Static86.aClass286_31, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4290(Static510.anInt8520);
			local59.aClass2_Sub15_Sub2_2.method4350(Static130.anInt5246 + local21);
			local59.aClass2_Sub15_Sub2_2.method4350(Static428.anInt7337);
			local59.aClass2_Sub15_Sub2_2.method4350(local18 + Static35.anInt906);
			local59.aClass2_Sub15_Sub2_2.method4326(Static514.anInt406);
			Static531.method7296(local59);
			Static295.method7121(0, -4, 1, 0, true, local18, local21, 1);
		}
		if (local24 == 9) {
			local468 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local468 != null) {
				Static210.anInt4044 = arg2;
				Static148.anInt3055 = arg0;
				Static516.anInt8581 = 0;
				Static364.anInt6471 = 2;
				local487 = Static249.method3910(Static273.aClass286_89, Static400.aClass145_2);
				local487.aClass2_Sub15_Sub2_2.method4342(Static529.aClass177_10.method4001(82) ? 1 : 0);
				local487.aClass2_Sub15_Sub2_2.method4329(local28);
				Static531.method7296(local487);
				Static295.method7121(0, -2, local468.method6165(), 0, true, local468.anIntArray510[0], local468.anIntArray509[0], local468.method6165());
			}
		}
		if (local24 == 1008) {
			Static148.anInt3055 = arg0;
			Static210.anInt4044 = arg2;
			Static516.anInt8581 = 0;
			Static364.anInt6471 = 2;
			local59 = Static249.method3910(Static203.aClass286_64, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4350(local28);
			Static531.method7296(local59);
		}
		if (local24 == 50 && Static454.aClass196_9 == null) {
			Static104.method1566(local18, local21);
			Static454.aClass196_9 = Static217.method3485(local21, local18);
			Static515.method7134(Static454.aClass196_9);
		}
		if (local24 == 58) {
			local606 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local28);
			if (local606 != null) {
				local621 = local606.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				Static148.anInt3055 = arg0;
				Static364.anInt6471 = 2;
				Static210.anInt4044 = arg2;
				Static516.anInt8581 = 0;
				local628 = Static249.method3910(Static12.aClass286_5, Static400.aClass145_2);
				local628.aClass2_Sub15_Sub2_2.method4342(Static529.aClass177_10.method4001(82) ? 1 : 0);
				local628.aClass2_Sub15_Sub2_2.method4329(local28);
				Static531.method7296(local628);
				Static295.method7121(0, -2, local621.method6165(), 0, true, local621.anIntArray510[0], local621.anIntArray509[0], local621.method6165());
			}
		}
		if (local24 == 1001) {
			Static364.anInt6471 = 2;
			Static148.anInt3055 = arg0;
			Static210.anInt4044 = arg2;
			Static516.anInt8581 = 0;
			local606 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local28);
			if (local606 != null) {
				local621 = local606.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				@Pc(1035) Class86 local1035 = local621.aClass86_1;
				if (local1035.anIntArray136 != null) {
					local1035 = local1035.method1567(Static70.aClass78_1);
				}
				if (local1035 != null) {
					@Pc(1054) Class2_Sub42 local1054 = Static249.method3910(Static376.aClass286_116, Static400.aClass145_2);
					local1054.aClass2_Sub15_Sub2_2.method4350(local1035.anInt2147);
					Static531.method7296(local1054);
				}
			}
		}
		if (local24 == 15) {
			local468 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local468 != null) {
				Static210.anInt4044 = arg2;
				Static516.anInt8581 = 0;
				Static364.anInt6471 = 2;
				Static148.anInt3055 = arg0;
				local487 = Static249.method3910(aClass286_154, Static400.aClass145_2);
				local487.aClass2_Sub15_Sub2_2.method4329(local28);
				local487.aClass2_Sub15_Sub2_2.method4349(Static529.aClass177_10.method4001(82) ? 1 : 0);
				Static531.method7296(local487);
				Static295.method7121(0, -2, local468.method6165(), 0, true, local468.anIntArray510[0], local468.anIntArray509[0], local468.method6165());
			}
		}
		if (local24 == 5) {
			local606 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local28);
			if (local606 != null) {
				Static210.anInt4044 = arg2;
				local621 = local606.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				Static364.anInt6471 = 2;
				Static516.anInt8581 = 0;
				Static148.anInt3055 = arg0;
				local628 = Static249.method3910(Static494.aClass286_146, Static400.aClass145_2);
				local628.aClass2_Sub15_Sub2_2.method4333(Static529.aClass177_10.method4001(82) ? 1 : 0);
				local628.aClass2_Sub15_Sub2_2.method4330(local28);
				Static531.method7296(local628);
				Static295.method7121(0, -2, local621.method6165(), 0, true, local621.anIntArray510[0], local621.anIntArray509[0], local621.method6165());
			}
		}
		if (local24 == 8) {
			local468 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local468 != null) {
				Static516.anInt8581 = 0;
				Static148.anInt3055 = arg0;
				Static364.anInt6471 = 2;
				Static210.anInt4044 = arg2;
				local487 = Static249.method3910(Static273.aClass286_90, Static400.aClass145_2);
				local487.aClass2_Sub15_Sub2_2.method4329(local28);
				local487.aClass2_Sub15_Sub2_2.method4333(Static529.aClass177_10.method4001(82) ? 1 : 0);
				Static531.method7296(local487);
				Static295.method7121(0, -2, local468.method6165(), 0, true, local468.anIntArray510[0], local468.anIntArray509[0], local468.method6165());
			}
		}
		if (local24 == 46) {
			Static210.anInt4044 = arg2;
			Static516.anInt8581 = 0;
			Static148.anInt3055 = arg0;
			Static364.anInt6471 = 2;
			local59 = Static249.method3910(Static325.aClass286_171, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4350(local18 + Static35.anInt906);
			local59.aClass2_Sub15_Sub2_2.method4342(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4290(Static130.anInt5246 + local21);
			local59.aClass2_Sub15_Sub2_2.method4330(local28);
			Static531.method7296(local59);
			Static114.method1699(local18, local21);
		}
		if (local24 == 25) {
			Static148.anInt3055 = arg0;
			Static516.anInt8581 = 0;
			Static210.anInt4044 = arg2;
			Static364.anInt6471 = 2;
			local59 = Static249.method3910(Static198.aClass286_59, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4290(local28);
			local59.aClass2_Sub15_Sub2_2.method4290(Static130.anInt5246 + local21);
			local59.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4350(Static35.anInt906 + local18);
			Static531.method7296(local59);
			Static114.method1699(local18, local21);
		}
		if (local24 == 23) {
			local606 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local28);
			if (local606 != null) {
				local621 = local606.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				Static210.anInt4044 = arg2;
				Static516.anInt8581 = 0;
				Static148.anInt3055 = arg0;
				Static364.anInt6471 = 2;
				local628 = Static249.method3910(Static341.aClass286_110, Static400.aClass145_2);
				local628.aClass2_Sub15_Sub2_2.method4290(local28);
				local628.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
				Static531.method7296(local628);
				Static295.method7121(0, -2, local621.method6165(), 0, true, local621.anIntArray510[0], local621.anIntArray509[0], local621.method6165());
			}
		}
		if (local24 == 48) {
			Static364.anInt6471 = 2;
			Static148.anInt3055 = arg0;
			Static516.anInt8581 = 0;
			Static210.anInt4044 = arg2;
			local59 = Static249.method3910(Static65.aClass286_22, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4330(Static510.anInt8520);
			local59.aClass2_Sub15_Sub2_2.method4330(local28);
			local59.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4288(Static514.anInt406);
			local59.aClass2_Sub15_Sub2_2.method4329(Static130.anInt5246 + local21);
			local59.aClass2_Sub15_Sub2_2.method4329(Static428.anInt7337);
			local59.aClass2_Sub15_Sub2_2.method4290(local18 + Static35.anInt906);
			Static531.method7296(local59);
			Static114.method1699(local18, local21);
		}
		if (local24 == 60 || local24 == 1011) {
			Static56.method939(local18, local28, arg1.aString7, local21);
		}
		if (local24 == 13) {
			local606 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local28);
			if (local606 != null) {
				local621 = local606.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				Static210.anInt4044 = arg2;
				Static516.anInt8581 = 0;
				Static148.anInt3055 = arg0;
				Static364.anInt6471 = 2;
				local628 = Static249.method3910(Static235.aClass286_75, Static400.aClass145_2);
				local628.aClass2_Sub15_Sub2_2.method4333(Static529.aClass177_10.method4001(82) ? 1 : 0);
				local628.aClass2_Sub15_Sub2_2.method4329(local28);
				Static531.method7296(local628);
				Static295.method7121(0, -2, local621.method6165(), 0, true, local621.anIntArray510[0], local621.anIntArray509[0], local621.method6165());
			}
		}
		if (local24 == 10) {
			if (Static210.anInt4045 > 0 && Static529.aClass177_10.method4001(82) && Static529.aClass177_10.method4001(81)) {
				Static325.method7943(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112, local21 + Static130.anInt5246, Static35.anInt906 - -local18);
			} else {
				local59 = Static526.method7220(local18, local21, local28);
				if (local28 == 1) {
					local59.aClass2_Sub15_Sub2_2.method4333(-1);
					local59.aClass2_Sub15_Sub2_2.method4333(-1);
					local59.aClass2_Sub15_Sub2_2.method4350((int) Static447.aFloat233);
					local59.aClass2_Sub15_Sub2_2.method4333(57);
					local59.aClass2_Sub15_Sub2_2.method4333(Static417.anInt7188);
					local59.aClass2_Sub15_Sub2_2.method4333(Static557.anInt9152);
					local59.aClass2_Sub15_Sub2_2.method4333(89);
					local59.aClass2_Sub15_Sub2_2.method4350(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761);
					local59.aClass2_Sub15_Sub2_2.method4350(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764);
					local59.aClass2_Sub15_Sub2_2.method4333(63);
				} else {
					Static516.anInt8581 = 0;
					Static210.anInt4044 = arg2;
					Static148.anInt3055 = arg0;
					Static364.anInt6471 = 1;
				}
				Static531.method7296(local59);
				Static295.method7121(0, -4, 1, 0, true, local18, local21, 1);
			}
		}
		if (local24 == 19) {
			Static148.anInt3055 = arg0;
			Static210.anInt4044 = arg2;
			Static364.anInt6471 = 2;
			Static516.anInt8581 = 0;
			local59 = Static249.method3910(Static322.aClass286_105, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4333(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4326(Static514.anInt406);
			local59.aClass2_Sub15_Sub2_2.method4329(Static428.anInt7337);
			local59.aClass2_Sub15_Sub2_2.method4290(Static510.anInt8520);
			local59.aClass2_Sub15_Sub2_2.method4290(local18 + Static35.anInt906);
			local59.aClass2_Sub15_Sub2_2.method4350(Integer.MAX_VALUE & (int) (local31 >>> 32));
			local59.aClass2_Sub15_Sub2_2.method4290(Static130.anInt5246 + local21);
			Static531.method7296(local59);
			Static503.method7005(local18, local31, local21);
		}
		if (local24 == 20) {
			local606 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local28);
			if (local606 != null) {
				local621 = local606.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				Static516.anInt8581 = 0;
				Static210.anInt4044 = arg2;
				Static148.anInt3055 = arg0;
				Static364.anInt6471 = 2;
				local628 = Static249.method3910(Static180.aClass286_55, Static400.aClass145_2);
				local628.aClass2_Sub15_Sub2_2.method4326(Static514.anInt406);
				local628.aClass2_Sub15_Sub2_2.method4350(Static428.anInt7337);
				local628.aClass2_Sub15_Sub2_2.method4330(local28);
				local628.aClass2_Sub15_Sub2_2.method4333(Static529.aClass177_10.method4001(82) ? 1 : 0);
				local628.aClass2_Sub15_Sub2_2.method4329(Static510.anInt8520);
				Static531.method7296(local628);
				Static295.method7121(0, -2, local621.method6165(), 0, true, local621.anIntArray510[0], local621.anIntArray509[0], local621.method6165());
			}
		}
		if (local24 == 3) {
			local468 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local468 != null) {
				Static516.anInt8581 = 0;
				Static148.anInt3055 = arg0;
				Static364.anInt6471 = 2;
				Static210.anInt4044 = arg2;
				local487 = Static249.method3910(Static47.aClass286_15, Static400.aClass145_2);
				local487.aClass2_Sub15_Sub2_2.method4349(Static529.aClass177_10.method4001(82) ? 1 : 0);
				local487.aClass2_Sub15_Sub2_2.method4329(local28);
				Static531.method7296(local487);
				Static295.method7121(0, -2, local468.method6165(), 0, true, local468.anIntArray510[0], local468.anIntArray509[0], local468.method6165());
			}
		}
		if (local24 == 51) {
			Static364.anInt6471 = 2;
			Static148.anInt3055 = arg0;
			Static210.anInt4044 = arg2;
			Static516.anInt8581 = 0;
			local59 = Static249.method3910(Static177.aClass286_52, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4290(Integer.MAX_VALUE & (int) (local31 >>> 32));
			local59.aClass2_Sub15_Sub2_2.method4349(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4350(Static35.anInt906 + local18);
			local59.aClass2_Sub15_Sub2_2.method4290(local21 + Static130.anInt5246);
			Static531.method7296(local59);
			Static503.method7005(local18, local31, local21);
		}
		if (local24 == 59) {
			local468 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local468 != null) {
				Static148.anInt3055 = arg0;
				Static210.anInt4044 = arg2;
				Static516.anInt8581 = 0;
				Static364.anInt6471 = 2;
				local487 = Static249.method3910(Static242.aClass286_76, Static400.aClass145_2);
				local487.aClass2_Sub15_Sub2_2.method4290(local28);
				local487.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
				Static531.method7296(local487);
				Static295.method7121(0, -2, local468.method6165(), 0, true, local468.anIntArray510[0], local468.anIntArray509[0], local468.method6165());
			}
		}
		if (local24 == 49) {
			local468 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local468 != null) {
				Static148.anInt3055 = arg0;
				Static516.anInt8581 = 0;
				Static364.anInt6471 = 2;
				Static210.anInt4044 = arg2;
				local487 = Static249.method3910(Static554.aClass286_160, Static400.aClass145_2);
				local487.aClass2_Sub15_Sub2_2.method4330(local28);
				local487.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
				Static531.method7296(local487);
				Static295.method7121(0, -2, local468.method6165(), 0, true, local468.anIntArray510[0], local468.anIntArray509[0], local468.method6165());
			}
		}
		if (local24 == 18) {
			Static210.anInt4044 = arg2;
			Static148.anInt3055 = arg0;
			Static364.anInt6471 = 2;
			Static516.anInt8581 = 0;
			local59 = Static249.method3910(Static284.aClass286_94, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4290(Integer.MAX_VALUE & (int) (local31 >>> 32));
			local59.aClass2_Sub15_Sub2_2.method4333(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4290(local21 + Static130.anInt5246);
			local59.aClass2_Sub15_Sub2_2.method4329(Static35.anInt906 + local18);
			Static531.method7296(local59);
			Static503.method7005(local18, local31, local21);
		}
		if (local24 == 11) {
			Static516.anInt8581 = 0;
			Static364.anInt6471 = 2;
			Static210.anInt4044 = arg2;
			Static148.anInt3055 = arg0;
			local59 = Static249.method3910(Static436.aClass286_135, Static400.aClass145_2);
			local59.aClass2_Sub15_Sub2_2.method4350(Static35.anInt906 + local18);
			local59.aClass2_Sub15_Sub2_2.method4329(local21 + Static130.anInt5246);
			local59.aClass2_Sub15_Sub2_2.method4349(Static529.aClass177_10.method4001(82) ? 1 : 0);
			local59.aClass2_Sub15_Sub2_2.method4330(local28);
			Static531.method7296(local59);
			Static114.method1699(local18, local21);
		}
		if (local24 == 4) {
			local468 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local468 != null) {
				Static516.anInt8581 = 0;
				Static148.anInt3055 = arg0;
				Static364.anInt6471 = 2;
				Static210.anInt4044 = arg2;
				local487 = Static249.method3910(Static562.aClass286_163, Static400.aClass145_2);
				local487.aClass2_Sub15_Sub2_2.method4333(Static529.aClass177_10.method4001(82) ? 1 : 0);
				local487.aClass2_Sub15_Sub2_2.method4330(Static428.anInt7337);
				local487.aClass2_Sub15_Sub2_2.method4316(Static514.anInt406);
				local487.aClass2_Sub15_Sub2_2.method4330(Static510.anInt8520);
				local487.aClass2_Sub15_Sub2_2.method4330(local28);
				Static531.method7296(local487);
				Static295.method7121(0, -2, local468.method6165(), 0, true, local468.anIntArray510[0], local468.anIntArray509[0], local468.method6165());
			}
		}
		if (local24 == 44) {
			local468 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local468 != null) {
				Static516.anInt8581 = 0;
				Static364.anInt6471 = 2;
				Static148.anInt3055 = arg0;
				Static210.anInt4044 = arg2;
				local487 = Static249.method3910(Static325.aClass286_170, Static400.aClass145_2);
				local487.aClass2_Sub15_Sub2_2.method4329(local28);
				local487.aClass2_Sub15_Sub2_2.method4336(Static529.aClass177_10.method4001(82) ? 1 : 0);
				Static531.method7296(local487);
				Static295.method7121(0, -2, local468.method6165(), 0, true, local468.anIntArray510[0], local468.anIntArray509[0], local468.method6165());
			}
		}
		if (Static25.aBoolean32) {
			Static566.method7699();
		}
		if (Static573.aClass196_14 != null && Static236.anInt4388 == 0) {
			Static515.method7134(Static573.aClass196_14);
		}
	}
}

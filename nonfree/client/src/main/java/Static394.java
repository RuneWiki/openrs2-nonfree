import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "Lclient!aga;")
	public static Class13 aClass13_9;

	@OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
	public static int anInt6810;

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "[I")
	public static final int[] anIntArray466 = new int[14];

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_160 = new Class81(107, 8);

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "I")
	public static int anInt6809 = 0;

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "Lclient!wv;")
	public static Class365 aClass365_11 = null;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!kr;II)V")
	public static void method5603(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub23 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null || arg1 == Static3.aClass361_1.aClass1_281) {
			return;
		}
		@Pc(19) int local19 = arg1.anInt5144;
		@Pc(22) int local22 = arg1.anInt5145;
		@Pc(25) int local25 = arg1.anInt5147;
		@Pc(29) int local29 = (int) arg1.aLong215;
		@Pc(32) long local32 = arg1.aLong215;
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		@Pc(60) Class1_Sub48 local60;
		if (local25 == 20) {
			Static414.anInt7055 = 0;
			Static120.anInt2406 = arg0;
			Static393.anInt6806 = 1;
			Static179.anInt3214 = arg2;
			local60 = Static320.method4867(Static442.aClass170_2, Static379.aClass319_128);
			local60.aClass1_Sub20_Sub1_2.method4409(Static39.anInt1026);
			local60.aClass1_Sub20_Sub1_2.method4384(Static24.anInt674 + local22);
			local60.aClass1_Sub20_Sub1_2.method4381(Static141.anInt2722);
			local60.aClass1_Sub20_Sub1_2.method4402(local19 + Static376.anInt6631);
			local60.aClass1_Sub20_Sub1_2.method4421(Static365.anInt6484);
			Static34.method813(local60);
			Static493.method6900(1, 0, local19, true, 0, -4, local22, 1);
		}
		@Pc(131) Class1_Sub48 local131;
		@Pc(112) Class20_Sub2_Sub4_Sub1_Sub1 local112;
		if (local25 == 44) {
			local112 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local29];
			if (local112 != null) {
				Static179.anInt3214 = arg2;
				Static414.anInt7055 = 0;
				Static120.anInt2406 = arg0;
				Static393.anInt6806 = 2;
				local131 = Static320.method4867(Static442.aClass170_2, Static388.aClass319_129);
				local131.aClass1_Sub20_Sub1_2.method4402(local29);
				local131.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
				Static34.method813(local131);
				Static493.method6900(local112.method5349(), 0, local112.anIntArray437[0], true, 0, -2, local112.anIntArray436[0], local112.method5349());
			}
		}
		if (local25 == 15) {
			Static120.anInt2406 = arg0;
			Static393.anInt6806 = 2;
			Static179.anInt3214 = arg2;
			Static414.anInt7055 = 0;
			local60 = Static320.method4867(Static442.aClass170_2, Static193.aClass319_72);
			local60.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4409(local22 + Static24.anInt674);
			local60.aClass1_Sub20_Sub1_2.method4402((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local60.aClass1_Sub20_Sub1_2.method4409(Static376.anInt6631 + local19);
			Static34.method813(local60);
			Static460.method6539(local32, local22, local19);
		}
		if (local25 == 4) {
			Static414.anInt7055 = 0;
			Static179.anInt3214 = arg2;
			Static120.anInt2406 = arg0;
			Static393.anInt6806 = 2;
			local60 = Static320.method4867(Static442.aClass170_2, Static561.aClass319_110);
			local60.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4381(local22 + Static24.anInt674);
			local60.aClass1_Sub20_Sub1_2.method4384((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local60.aClass1_Sub20_Sub1_2.method4384(Static376.anInt6631 + local19);
			Static34.method813(local60);
			Static460.method6539(local32, local22, local19);
		}
		if (local25 == 11) {
			Static179.anInt3214 = arg2;
			Static414.anInt7055 = 0;
			Static120.anInt2406 = arg0;
			Static393.anInt6806 = 2;
			local60 = Static320.method4867(Static442.aClass170_2, Static267.aClass319_89);
			local60.aClass1_Sub20_Sub1_2.method4384(local29);
			local60.aClass1_Sub20_Sub1_2.method4377(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4384(Static24.anInt674 + local22);
			local60.aClass1_Sub20_Sub1_2.method4384(local19 + Static376.anInt6631);
			Static34.method813(local60);
			Static92.method1500(local19, local22);
		}
		if (local25 == 22) {
			local112 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local29];
			if (local112 != null) {
				Static414.anInt7055 = 0;
				Static393.anInt6806 = 2;
				Static179.anInt3214 = arg2;
				Static120.anInt2406 = arg0;
				local131 = Static320.method4867(Static442.aClass170_2, Static8.aClass319_4);
				local131.aClass1_Sub20_Sub1_2.method4409(Static141.anInt2722);
				local131.aClass1_Sub20_Sub1_2.method4377(Static595.aClass31_1.method985(82) ? 1 : 0);
				local131.aClass1_Sub20_Sub1_2.method4402(Static39.anInt1026);
				local131.aClass1_Sub20_Sub1_2.method4409(local29);
				local131.aClass1_Sub20_Sub1_2.method4420(Static365.anInt6484);
				Static34.method813(local131);
				Static493.method6900(local112.method5349(), 0, local112.anIntArray437[0], true, 0, -2, local112.anIntArray436[0], local112.method5349());
			}
		}
		if (local25 == 1004 || local25 == 1012 || local25 == 1002 || local25 == 1009 || local25 == 1008) {
			Static585.method7824(local19, local25, local29);
		}
		@Pc(505) Class1_Sub48 local505;
		@Pc(500) Class20_Sub2_Sub4_Sub1_Sub2 local500;
		@Pc(483) Class1_Sub39 local483;
		if (local25 == 19) {
			local483 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local29);
			if (local483 != null) {
				Static120.anInt2406 = arg0;
				Static179.anInt3214 = arg2;
				Static414.anInt7055 = 0;
				Static393.anInt6806 = 2;
				local500 = local483.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				local505 = Static320.method4867(Static442.aClass170_2, Static276.aClass319_91);
				local505.aClass1_Sub20_Sub1_2.method4413(Static595.aClass31_1.method985(82) ? 1 : 0);
				local505.aClass1_Sub20_Sub1_2.method4379(Static365.anInt6484);
				local505.aClass1_Sub20_Sub1_2.method4381(Static39.anInt1026);
				local505.aClass1_Sub20_Sub1_2.method4409(local29);
				local505.aClass1_Sub20_Sub1_2.method4384(Static141.anInt2722);
				Static34.method813(local505);
				Static493.method6900(local500.method5349(), 0, local500.anIntArray437[0], true, 0, -2, local500.anIntArray436[0], local500.method5349());
			}
		}
		@Pc(571) Class365 local571;
		if (local25 == 2) {
			local571 = Static583.method7803(local22, local19);
			if (local571 != null) {
				Static307.method4727(local571);
			}
		}
		if (local25 == 50 || local25 == 1001) {
			Static211.method3546(local22, local19, arg1.aString55, local29);
		}
		if (local25 == 10) {
			local112 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local29];
			if (local112 != null) {
				Static179.anInt3214 = arg2;
				Static393.anInt6806 = 2;
				Static414.anInt7055 = 0;
				Static120.anInt2406 = arg0;
				local131 = Static320.method4867(Static442.aClass170_2, Static138.aClass319_56);
				local131.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
				local131.aClass1_Sub20_Sub1_2.method4409(local29);
				Static34.method813(local131);
				Static493.method6900(local112.method5349(), 0, local112.anIntArray437[0], true, 0, -2, local112.anIntArray436[0], local112.method5349());
			}
		}
		if (local25 == 25) {
			if (Static276.anInt5092 > 0 && Static595.aClass31_1.method985(82) && Static595.aClass31_1.method985(81)) {
				Static120.method2034(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116, Static376.anInt6631 + local19, Static24.anInt674 + local22);
			} else {
				Static179.anInt3214 = arg2;
				Static120.anInt2406 = arg0;
				Static414.anInt7055 = 0;
				Static393.anInt6806 = 1;
				local60 = Static320.method4867(Static442.aClass170_2, Static422.aClass319_135);
				local60.aClass1_Sub20_Sub1_2.method4409(Static376.anInt6631 + local19);
				local60.aClass1_Sub20_Sub1_2.method4381(local22 + Static24.anInt674);
				Static34.method813(local60);
			}
		}
		if (local25 == 23) {
			Static179.anInt3214 = arg2;
			Static414.anInt7055 = 0;
			Static393.anInt6806 = 2;
			Static120.anInt2406 = arg0;
			local60 = Static320.method4867(Static442.aClass170_2, Static294.aClass319_98);
			local60.aClass1_Sub20_Sub1_2.method4381(local19 + Static376.anInt6631);
			local60.aClass1_Sub20_Sub1_2.method4381(Static24.anInt674 + local22);
			local60.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4381(local29);
			Static34.method813(local60);
			Static92.method1500(local19, local22);
		}
		if (local25 == 45) {
			Static179.anInt3214 = arg2;
			Static120.anInt2406 = arg0;
			Static393.anInt6806 = 2;
			Static414.anInt7055 = 0;
			local60 = Static320.method4867(Static442.aClass170_2, Static126.aClass319_127);
			local60.aClass1_Sub20_Sub1_2.method4402(local19 + Static376.anInt6631);
			local60.aClass1_Sub20_Sub1_2.method4409((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local60.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4402(Static24.anInt674 + local22);
			Static34.method813(local60);
			Static460.method6539(local32, local22, local19);
		}
		if (local25 == 6) {
			Static414.anInt7055 = 0;
			Static393.anInt6806 = 2;
			Static120.anInt2406 = arg0;
			Static179.anInt3214 = arg2;
			local60 = Static320.method4867(Static442.aClass170_2, Static127.aClass319_53);
			local60.aClass1_Sub20_Sub1_2.method4402(local22 + Static24.anInt674);
			local60.aClass1_Sub20_Sub1_2.method4377(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4409(local29);
			local60.aClass1_Sub20_Sub1_2.method4402(local19 + Static376.anInt6631);
			Static34.method813(local60);
			Static92.method1500(local19, local22);
		}
		if (local25 == 3) {
			local112 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local29];
			if (local112 != null) {
				Static414.anInt7055 = 0;
				Static179.anInt3214 = arg2;
				Static120.anInt2406 = arg0;
				Static393.anInt6806 = 2;
				local131 = Static320.method4867(Static442.aClass170_2, Static113.aClass319_46);
				local131.aClass1_Sub20_Sub1_2.method4381(local29);
				local131.aClass1_Sub20_Sub1_2.method4413(Static595.aClass31_1.method985(82) ? 1 : 0);
				Static34.method813(local131);
				Static493.method6900(local112.method5349(), 0, local112.anIntArray437[0], true, 0, -2, local112.anIntArray436[0], local112.method5349());
			}
		}
		if (local25 == 57) {
			Static179.anInt3214 = arg2;
			Static414.anInt7055 = 0;
			Static393.anInt6806 = 2;
			Static120.anInt2406 = arg0;
			local60 = Static320.method4867(Static442.aClass170_2, Static8.aClass319_4);
			local60.aClass1_Sub20_Sub1_2.method4409(Static141.anInt2722);
			local60.aClass1_Sub20_Sub1_2.method4377(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4402(Static39.anInt1026);
			local60.aClass1_Sub20_Sub1_2.method4409(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt6407);
			local60.aClass1_Sub20_Sub1_2.method4420(Static365.anInt6484);
			Static34.method813(local60);
		}
		if (local25 == 1010) {
			Static393.anInt6806 = 2;
			Static179.anInt3214 = arg2;
			Static120.anInt2406 = arg0;
			Static414.anInt7055 = 0;
			local483 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local29);
			if (local483 != null) {
				local500 = local483.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				@Pc(1061) Class162 local1061 = local500.aClass162_1;
				if (local1061.anIntArray267 != null) {
					local1061 = local1061.method3802(Static121.aClass148_1);
				}
				if (local1061 != null) {
					@Pc(1080) Class1_Sub48 local1080 = Static320.method4867(Static442.aClass170_2, Static78.aClass319_37);
					local1080.aClass1_Sub20_Sub1_2.method4381(local1061.anInt4413);
					Static34.method813(local1080);
				}
			}
		}
		if (local25 == 16) {
			local112 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local29];
			if (local112 != null) {
				Static414.anInt7055 = 0;
				Static120.anInt2406 = arg0;
				Static179.anInt3214 = arg2;
				Static393.anInt6806 = 2;
				local131 = Static320.method4867(Static442.aClass170_2, Static592.aClass319_173);
				local131.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
				local131.aClass1_Sub20_Sub1_2.method4381(local29);
				Static34.method813(local131);
				Static493.method6900(local112.method5349(), 0, local112.anIntArray437[0], true, 0, -2, local112.anIntArray436[0], local112.method5349());
			}
		}
		if (local25 == 21) {
			Static393.anInt6806 = 2;
			Static120.anInt2406 = arg0;
			Static179.anInt3214 = arg2;
			Static414.anInt7055 = 0;
			local60 = Static320.method4867(Static442.aClass170_2, Static561.aClass319_109);
			local60.aClass1_Sub20_Sub1_2.method4409(Static24.anInt674 + local22);
			local60.aClass1_Sub20_Sub1_2.method4409(Static376.anInt6631 + local19);
			local60.aClass1_Sub20_Sub1_2.method4402((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local60.aClass1_Sub20_Sub1_2.method4378(Static595.aClass31_1.method985(82) ? 1 : 0);
			Static34.method813(local60);
			Static460.method6539(local32, local22, local19);
		}
		if (local25 == 30) {
			local112 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local29];
			if (local112 != null) {
				Static393.anInt6806 = 2;
				Static120.anInt2406 = arg0;
				Static179.anInt3214 = arg2;
				Static414.anInt7055 = 0;
				local131 = Static320.method4867(Static442.aClass170_2, Static392.aClass319_130);
				local131.aClass1_Sub20_Sub1_2.method4381(local29);
				local131.aClass1_Sub20_Sub1_2.method4413(Static595.aClass31_1.method985(82) ? 1 : 0);
				Static34.method813(local131);
				Static493.method6900(local112.method5349(), 0, local112.anIntArray437[0], true, 0, -2, local112.anIntArray436[0], local112.method5349());
			}
		}
		if (local25 == 1011) {
			Static393.anInt6806 = 2;
			Static120.anInt2406 = arg0;
			Static179.anInt3214 = arg2;
			Static414.anInt7055 = 0;
			local60 = Static320.method4867(Static442.aClass170_2, Static83.aClass319_38);
			local60.aClass1_Sub20_Sub1_2.method4381(local29);
			Static34.method813(local60);
		}
		if (local25 == 18) {
			Static120.anInt2406 = arg0;
			Static179.anInt3214 = arg2;
			Static393.anInt6806 = 2;
			Static414.anInt7055 = 0;
			local60 = Static320.method4867(Static442.aClass170_2, Static302.aClass319_60);
			local60.aClass1_Sub20_Sub1_2.method4402(local22 + Static24.anInt674);
			local60.aClass1_Sub20_Sub1_2.method4409(Static39.anInt1026);
			local60.aClass1_Sub20_Sub1_2.method4377(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4400(Static365.anInt6484);
			local60.aClass1_Sub20_Sub1_2.method4409((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local60.aClass1_Sub20_Sub1_2.method4381(Static376.anInt6631 + local19);
			local60.aClass1_Sub20_Sub1_2.method4384(Static141.anInt2722);
			Static34.method813(local60);
			Static460.method6539(local32, local22, local19);
		}
		if (local25 == 17) {
			local483 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local29);
			if (local483 != null) {
				local500 = local483.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				Static179.anInt3214 = arg2;
				Static120.anInt2406 = arg0;
				Static393.anInt6806 = 2;
				Static414.anInt7055 = 0;
				local505 = Static320.method4867(Static442.aClass170_2, Static364.aClass319_119);
				local505.aClass1_Sub20_Sub1_2.method4413(Static595.aClass31_1.method985(82) ? 1 : 0);
				local505.aClass1_Sub20_Sub1_2.method4402(local29);
				Static34.method813(local505);
				Static493.method6900(local500.method5349(), 0, local500.anIntArray437[0], true, 0, -2, local500.anIntArray436[0], local500.method5349());
			}
		}
		if (local25 == 46) {
			Static179.anInt3214 = arg2;
			Static120.anInt2406 = arg0;
			Static414.anInt7055 = 0;
			Static393.anInt6806 = 2;
			local60 = Static320.method4867(Static442.aClass170_2, Static128.aClass319_54);
			local60.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4381(local22 + Static24.anInt674);
			local60.aClass1_Sub20_Sub1_2.method4409(local19 + Static376.anInt6631);
			local60.aClass1_Sub20_Sub1_2.method4409(local29);
			Static34.method813(local60);
			Static92.method1500(local19, local22);
		}
		if (local25 == 49) {
			local483 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local29);
			if (local483 != null) {
				Static414.anInt7055 = 0;
				Static120.anInt2406 = arg0;
				local500 = local483.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				Static393.anInt6806 = 2;
				Static179.anInt3214 = arg2;
				local505 = Static320.method4867(Static442.aClass170_2, Static282.aClass319_95);
				local505.aClass1_Sub20_Sub1_2.method4402(local29);
				local505.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
				Static34.method813(local505);
				Static493.method6900(local500.method5349(), 0, local500.anIntArray437[0], true, 0, -2, local500.anIntArray436[0], local500.method5349());
			}
		}
		if (local25 == 60) {
			local571 = Static583.method7803(local22, local19);
			if (local571 != null) {
				Static130.method6495();
				@Pc(1629) Class1_Sub28 local1629 = Static72.method1565(local571);
				Static478.method6711(local1629.method4818(), local571, local1629.anInt5702);
				Static559.aString92 = Static161.method2491(local571);
				Static264.aString51 = local571.aString98 + "<col=ffffff>";
				if (Static559.aString92 == null) {
					Static559.aString92 = "Null";
				}
			}
			return;
		}
		if (local25 == 13) {
			local112 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local29];
			if (local112 != null) {
				Static393.anInt6806 = 2;
				Static179.anInt3214 = arg2;
				Static120.anInt2406 = arg0;
				Static414.anInt7055 = 0;
				local131 = Static320.method4867(Static442.aClass170_2, Static459.aClass319_145);
				local131.aClass1_Sub20_Sub1_2.method4402(local29);
				local131.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
				Static34.method813(local131);
				Static493.method6900(local112.method5349(), 0, local112.anIntArray437[0], true, 0, -2, local112.anIntArray436[0], local112.method5349());
			}
		}
		if (local25 == 1006) {
			Static414.anInt7055 = 0;
			Static179.anInt3214 = arg2;
			Static393.anInt6806 = 2;
			Static120.anInt2406 = arg0;
			local60 = Static320.method4867(Static442.aClass170_2, Static589.aClass319_171);
			local60.aClass1_Sub20_Sub1_2.method4381(local29);
			Static34.method813(local60);
		}
		if (local25 == 59) {
			Static179.anInt3214 = arg2;
			Static120.anInt2406 = arg0;
			Static414.anInt7055 = 0;
			Static393.anInt6806 = 2;
			local60 = Static320.method4867(Static442.aClass170_2, Static280.aClass319_92);
			local60.aClass1_Sub20_Sub1_2.method4402(Static141.anInt2722);
			local60.aClass1_Sub20_Sub1_2.method4409(Static376.anInt6631 + local19);
			local60.aClass1_Sub20_Sub1_2.method4378(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4379(Static365.anInt6484);
			local60.aClass1_Sub20_Sub1_2.method4384(local29);
			local60.aClass1_Sub20_Sub1_2.method4384(local22 + Static24.anInt674);
			local60.aClass1_Sub20_Sub1_2.method4381(Static39.anInt1026);
			Static34.method813(local60);
			Static92.method1500(local19, local22);
		}
		if (local25 == 1003) {
			Static120.anInt2406 = arg0;
			Static393.anInt6806 = 2;
			Static414.anInt7055 = 0;
			Static179.anInt3214 = arg2;
			local60 = Static320.method4867(Static442.aClass170_2, Static40.aClass319_118);
			local60.aClass1_Sub20_Sub1_2.method4377(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4384(Static24.anInt674 + local22);
			local60.aClass1_Sub20_Sub1_2.method4384(Static376.anInt6631 + local19);
			local60.aClass1_Sub20_Sub1_2.method4384((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static34.method813(local60);
			Static460.method6539(local32, local22, local19);
		}
		if (local25 == 9) {
			local112 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local29];
			if (local112 != null) {
				Static120.anInt2406 = arg0;
				Static393.anInt6806 = 2;
				Static179.anInt3214 = arg2;
				Static414.anInt7055 = 0;
				local131 = Static320.method4867(Static442.aClass170_2, Static273.aClass319_90);
				local131.aClass1_Sub20_Sub1_2.method4384(local29);
				local131.aClass1_Sub20_Sub1_2.method4413(Static595.aClass31_1.method985(82) ? 1 : 0);
				Static34.method813(local131);
				Static493.method6900(local112.method5349(), 0, local112.anIntArray437[0], true, 0, -2, local112.anIntArray436[0], local112.method5349());
			}
		}
		if (local25 == 58) {
			local483 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local29);
			if (local483 != null) {
				local500 = local483.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				Static414.anInt7055 = 0;
				Static179.anInt3214 = arg2;
				Static120.anInt2406 = arg0;
				Static393.anInt6806 = 2;
				local505 = Static320.method4867(Static442.aClass170_2, Static421.aClass319_132);
				local505.aClass1_Sub20_Sub1_2.method4377(Static595.aClass31_1.method985(82) ? 1 : 0);
				local505.aClass1_Sub20_Sub1_2.method4381(local29);
				Static34.method813(local505);
				Static493.method6900(local500.method5349(), 0, local500.anIntArray437[0], true, 0, -2, local500.anIntArray436[0], local500.method5349());
			}
		}
		if (local25 == 48 && Static211.aClass365_8 == null) {
			Static171.method2605(local22, local19);
			Static211.aClass365_8 = Static583.method7803(local22, local19);
			Static201.method5537(Static211.aClass365_8);
		}
		if (local25 == 5) {
			local112 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local29];
			if (local112 != null) {
				Static393.anInt6806 = 2;
				Static120.anInt2406 = arg0;
				Static414.anInt7055 = 0;
				Static179.anInt3214 = arg2;
				local131 = Static320.method4867(Static442.aClass170_2, Static109.aClass319_42);
				local131.aClass1_Sub20_Sub1_2.method4378(Static595.aClass31_1.method985(82) ? 1 : 0);
				local131.aClass1_Sub20_Sub1_2.method4381(local29);
				Static34.method813(local131);
				Static493.method6900(local112.method5349(), 0, local112.anIntArray437[0], true, 0, -2, local112.anIntArray436[0], local112.method5349());
			}
		}
		if (local25 == 8) {
			Static393.anInt6806 = 2;
			Static414.anInt7055 = 0;
			Static120.anInt2406 = arg0;
			Static179.anInt3214 = arg2;
			local60 = Static320.method4867(Static442.aClass170_2, Static377.aClass319_126);
			local60.aClass1_Sub20_Sub1_2.method4377(Static595.aClass31_1.method985(82) ? 1 : 0);
			local60.aClass1_Sub20_Sub1_2.method4409(local22 + Static24.anInt674);
			local60.aClass1_Sub20_Sub1_2.method4381(local29);
			local60.aClass1_Sub20_Sub1_2.method4381(Static376.anInt6631 + local19);
			Static34.method813(local60);
			Static92.method1500(local19, local22);
		}
		if (local25 == 47) {
			local483 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local29);
			if (local483 != null) {
				local500 = local483.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				Static120.anInt2406 = arg0;
				Static393.anInt6806 = 2;
				Static179.anInt3214 = arg2;
				Static414.anInt7055 = 0;
				local505 = Static320.method4867(Static442.aClass170_2, Static64.aClass319_36);
				local505.aClass1_Sub20_Sub1_2.method4384(local29);
				local505.aClass1_Sub20_Sub1_2.method4413(Static595.aClass31_1.method985(82) ? 1 : 0);
				Static34.method813(local505);
				Static493.method6900(local500.method5349(), 0, local500.anIntArray437[0], true, 0, -2, local500.anIntArray436[0], local500.method5349());
			}
		}
		if (local25 == 51) {
			local483 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local29);
			if (local483 != null) {
				Static414.anInt7055 = 0;
				local500 = local483.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				Static120.anInt2406 = arg0;
				Static393.anInt6806 = 2;
				Static179.anInt3214 = arg2;
				local505 = Static320.method4867(Static442.aClass170_2, Static281.aClass319_94);
				local505.aClass1_Sub20_Sub1_2.method4378(Static595.aClass31_1.method985(82) ? 1 : 0);
				local505.aClass1_Sub20_Sub1_2.method4409(local29);
				Static34.method813(local505);
				Static493.method6900(local500.method5349(), 0, local500.anIntArray437[0], true, 0, -2, local500.anIntArray436[0], local500.method5349());
			}
		}
		if (local25 == 12) {
			if (Static276.anInt5092 > 0 && Static595.aClass31_1.method985(82) && Static595.aClass31_1.method985(81)) {
				Static120.method2034(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116, local19 + Static376.anInt6631, local22 + Static24.anInt674);
			} else {
				local60 = Static489.method6875(local29, local19, local22);
				if (local29 == 1) {
					local60.aClass1_Sub20_Sub1_2.method4378(-1);
					local60.aClass1_Sub20_Sub1_2.method4378(-1);
					local60.aClass1_Sub20_Sub1_2.method4381((int) Static143.aFloat61);
					local60.aClass1_Sub20_Sub1_2.method4378(57);
					local60.aClass1_Sub20_Sub1_2.method4378(Static368.anInt6520);
					local60.aClass1_Sub20_Sub1_2.method4378(Static536.anInt8845);
					local60.aClass1_Sub20_Sub1_2.method4378(89);
					local60.aClass1_Sub20_Sub1_2.method4381(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796);
					local60.aClass1_Sub20_Sub1_2.method4381(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795);
					local60.aClass1_Sub20_Sub1_2.method4378(63);
				} else {
					Static120.anInt2406 = arg0;
					Static179.anInt3214 = arg2;
					Static393.anInt6806 = 1;
					Static414.anInt7055 = 0;
				}
				Static34.method813(local60);
				Static493.method6900(1, 0, local19, true, 0, -4, local22, 1);
			}
		}
		if (Static22.aBoolean43) {
			Static130.method6495();
		}
		if (Static309.aClass365_9 != null && Static452.anInt7759 == 0) {
			Static201.method5537(Static309.aClass365_9);
		}
	}
}

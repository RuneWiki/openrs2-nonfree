import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "Lclient!m;")
	public static final Class235 aClass235_46 = new Class235(12);

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
	public static int anInt9587 = -1;

	@OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
	public static int anInt9597 = -1;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8072(@OriginalArg(0) Class67 arg0) {
		if (Static285.anInt5168 < 2 && !Static212.aBoolean297 || Static509.aClass20_16 != null) {
			return;
		}
		@Pc(47) String local47;
		if (Static212.aBoolean297 && Static285.anInt5168 < 2) {
			local47 = Static177.aString97 + Static476.aClass279_32.method6992(Static141.anInt2658) + Static90.aString28 + " ->";
		} else if (Static27.aBoolean15 && Static419.aClass133_1.method3450(81) && Static285.anInt5168 > 2) {
			local47 = Static83.method1070(Static693.aClass3_Sub4_Sub5_4);
		} else {
			@Pc(51) Class3_Sub4_Sub5 local51 = Static693.aClass3_Sub4_Sub5_4;
			if (local51 == null) {
				return;
			}
			local47 = Static83.method1070(local51);
			@Pc(61) int[] local61 = null;
			if (Static292.method4412(local51.anInt2775)) {
				local61 = Static243.aClass406_2.method9394((int) local51.aLong105).anIntArray130;
			} else if (local51.anInt2773 != -1) {
				local61 = Static243.aClass406_2.method9394(local51.anInt2773).anIntArray130;
			} else if (Static290.method4406(local51.anInt2775)) {
				@Pc(101) Class3_Sub13 local101 = (Class3_Sub13) Static612.aClass136_44.method3503((long) (int) local51.aLong105);
				if (local101 != null) {
					@Pc(106) Class19_Sub1_Sub3_Sub2_Sub1 local106 = local101.aClass19_Sub1_Sub3_Sub2_Sub1_2;
					@Pc(109) Class18 local109 = local106.aClass18_1;
					if (local109.anIntArray23 != null) {
						local109 = local109.method407(Static577.aClass362_1);
					}
					if (local109 != null) {
						local61 = local109.anIntArray20;
					}
				}
			} else if (Static664.method8850(local51.anInt2775)) {
				@Pc(139) Class144 local139 = Static70.aClass323_1.method7792((int) (local51.aLong105 >>> 32 & 0x7FFFFFFFL));
				if (local139.anIntArray239 != null) {
					local139 = local139.method3629(Static577.aClass362_1);
				}
				if (local139 != null) {
					local61 = local139.anIntArray238;
				}
			}
			if (local61 != null) {
				local47 = local47 + Static146.method2414(local61);
			}
		}
		if (Static285.anInt5168 > 2) {
			local47 = local47 + "<col=ffffff> / " + (Static285.anInt5168 - 2) + Static476.aClass279_25.method6992(Static141.anInt2658);
		}
		if (Static122.aClass20_18 != null) {
			@Pc(263) Class44 local263 = Static122.aClass20_18.method461(arg0);
			if (local263 == null) {
				local263 = Static427.aClass44_34;
			}
			local263.method8133(Static28.anIntArray18, Static122.aClass20_18.anInt598, Static484.aRandom1, Static9.anInt137, Static625.anInt10097, Static122.aClass20_18.anInt545, Static122.aClass20_18.anInt569, Static122.aClass20_18.anInt540, Static122.aClass20_18.anInt578, Static122.aClass20_18.anInt509, local47, Static432.aClass9Array28, Static435.anInt7611, Static596.anIntArray537);
			Static485.method6262(Static596.anIntArray537[0], Static596.anIntArray537[1], Static596.anIntArray537[3], Static596.anIntArray537[2]);
		} else if (Static490.aClass20_15 != null && Static667.aClass169_8 == Static615.aClass169_7) {
			@Pc(244) int local244 = Static427.aClass44_34.method8123(Static484.aRandom1, Static28.anIntArray18, Static518.anInt8817 + 4, local47, Static432.aClass9Array28, Static625.anInt10097, Static139.anInt2622 + 16);
			Static485.method6262(Static518.anInt8817 + 4, Static139.anInt2622, 16, Static381.aClass330_7.method7911(118, local47) + local244);
			return;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZZ)V")
	public static void method8079(@OriginalArg(0) boolean arg0) {
		for (@Pc(17) Class3_Sub49 local17 = (Class3_Sub49) Static352.aClass357_30.method8391(); local17 != null; local17 = (Class3_Sub49) Static352.aClass357_30.method8392()) {
			if (local17.aClass3_Sub22_Sub1_3 != null) {
				Static155.aClass3_Sub22_Sub4_1.method9062(local17.aClass3_Sub22_Sub1_3);
				local17.aClass3_Sub22_Sub1_3 = null;
			}
			if (local17.aClass3_Sub22_Sub1_4 != null) {
				Static155.aClass3_Sub22_Sub4_1.method9062(local17.aClass3_Sub22_Sub1_4);
				local17.aClass3_Sub22_Sub1_4 = null;
			}
			local17.method9446();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(66) Class3_Sub49 local66 = (Class3_Sub49) Static627.aClass357_58.method8391(); local66 != null; local66 = (Class3_Sub49) Static627.aClass357_58.method8392()) {
			if (local66.aClass3_Sub22_Sub1_3 != null) {
				Static155.aClass3_Sub22_Sub4_1.method9062(local66.aClass3_Sub22_Sub1_3);
				local66.aClass3_Sub22_Sub1_3 = null;
			}
			local66.method9446();
		}
		for (@Pc(97) Class3_Sub49 local97 = (Class3_Sub49) Static81.aClass136_7.method3509(); local97 != null; local97 = (Class3_Sub49) Static81.aClass136_7.method3506()) {
			if (local97.aClass3_Sub22_Sub1_3 != null) {
				Static155.aClass3_Sub22_Sub4_1.method9062(local97.aClass3_Sub22_Sub1_3);
				local97.aClass3_Sub22_Sub1_3 = null;
			}
			local97.method9446();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;)V")
	public static void method8081(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1) {
		Static308.aHashtable4.put(arg0, arg1);
	}
}

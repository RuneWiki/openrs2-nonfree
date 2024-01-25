import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "J")
	public static long aLong7 = -1L;

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIZ)V")
	public static void method222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class283 local9 = Static611.aClass283ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static266.anInt4744 = local9.anInt7335;
			Static59.anInt3939 = local9.anInt7339;
			Static630.anInt10217 = local9.anInt7340;
		}
		Static612.method8399();
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method226(@OriginalArg(1) Class100 arg0) {
		if (Static651.anInt10662 < 2 && !Static421.aBoolean472 || Static388.aClass238_11 != null) {
			return;
		}
		@Pc(43) String local43;
		if (Static421.aBoolean472 && Static651.anInt10662 < 2) {
			local43 = Static570.aString102 + Static184.aClass131_33.method3168(Static375.anInt7800) + Static47.aString9 + " ->";
		} else if (Static468.aBoolean513 && Static53.aClass297_1.method6737(81) && Static651.anInt10662 > 2) {
			local43 = Static461.method6496(Static396.aClass5_Sub1_Sub13_2);
		} else {
			@Pc(65) Class5_Sub1_Sub13 local65 = Static396.aClass5_Sub1_Sub13_2;
			if (local65 == null) {
				return;
			}
			local43 = Static461.method6496(local65);
			@Pc(75) int[] local75 = null;
			if (Static412.method6083(local65.anInt6068)) {
				local75 = Static82.aClass134_1.method3191((int) local65.aLong176).anIntArray372;
			} else if (local65.anInt6067 != -1) {
				local75 = Static82.aClass134_1.method3191(local65.anInt6067).anIntArray372;
			} else if (Static250.method4080(local65.anInt6068)) {
				@Pc(109) Class5_Sub9 local109 = (Class5_Sub9) Static677.aClass306_37.method6943((long) (int) local65.aLong176);
				if (local109 != null) {
					@Pc(114) Class4_Sub1_Sub1_Sub2_Sub2 local114 = local109.aClass4_Sub1_Sub1_Sub2_Sub2_1;
					@Pc(117) Class105 local117 = local114.aClass105_1;
					if (local117.anIntArray134 != null) {
						local117 = local117.method2622(Static23.aClass247_1);
					}
					if (local117 != null) {
						local75 = local117.anIntArray131;
					}
				}
			} else if (Static126.method1893(local65.anInt6068)) {
				@Pc(155) Class354 local155;
				if (local65.anInt6068 == 1001) {
					local155 = Static528.aClass243_3.method5556((int) local65.aLong176);
				} else {
					local155 = Static528.aClass243_3.method5556((int) (local65.aLong176 >>> 32 & 0x7FFFFFFFL));
				}
				if (local155.anIntArray526 != null) {
					local155 = local155.method8024(Static23.aClass247_1);
				}
				if (local155 != null) {
					local75 = local155.anIntArray527;
				}
			}
			if (local75 != null) {
				local43 = local43 + Static462.method6508(local75);
			}
		}
		if (Static651.anInt10662 > 2) {
			local43 = local43 + "<col=ffffff> / " + (Static651.anInt10662 - 2) + Static184.aClass131_26.method3168(Static375.anInt7800);
		}
		if (Static676.aClass238_16 != null) {
			@Pc(235) Class70 local235 = Static676.aClass238_16.method5314(arg0);
			if (local235 == null) {
				local235 = Static196.aClass70_3;
			}
			local235.method8424(local43, Static676.aClass238_16.anInt5997, Static68.aRandom3, Static234.anInt4034, Static676.aClass238_16.anInt5945, Static12.anIntArray9, Static676.aClass238_16.anInt5975, Static671.anInt10802, Static676.aClass238_16.anInt5981, Static676.aClass238_16.anInt5985, Static225.anIntArray193, Static439.anInt7276, Static676.aClass238_16.anInt5973, Static67.aClass155Array3);
			Static509.method7017(Static225.anIntArray193[1], Static225.anIntArray193[3], Static225.anIntArray193[0], Static225.anIntArray193[2]);
		} else if (Static505.aClass238_14 != null && Static82.aClass290_1 == Static536.aClass290_6) {
			@Pc(305) int local305 = Static196.aClass70_3.method8430(Static260.anInt4664 + 4, local43, Static67.aClass155Array3, Static12.anIntArray9, Static670.anInt6249 + 16, Static671.anInt10802, Static68.aRandom3);
			Static509.method7017(Static670.anInt6249, 16, Static260.anInt4664 + 4, Static73.aClass196_5.method4556(local43) + local305);
		}
	}
}

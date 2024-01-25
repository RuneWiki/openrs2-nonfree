import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "Lclient!uk;")
	public static final Class346 aClass346_3 = new Class346("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method4965(@OriginalArg(1) Class126 arg0) {
		if (Static642.anInt10370 < 2 && !Static202.aBoolean295 || Static629.aClass357_15 != null) {
			return;
		}
		@Pc(50) String local50;
		if (Static202.aBoolean295 && Static642.anInt10370 < 2) {
			local50 = Static111.aString29 + Static76.aClass58_33.method1237(Static321.anInt5554) + Static485.aString115 + " ->";
		} else if (Static473.aBoolean660 && Static600.aClass38_1.method799(81) && Static642.anInt10370 > 2) {
			local50 = Static172.method2653(Static510.aClass5_Sub4_Sub14_1);
		} else {
			@Pc(41) Class5_Sub4_Sub14 local41 = Static510.aClass5_Sub4_Sub14_1;
			if (local41 == null) {
				return;
			}
			local50 = Static172.method2653(local41);
			@Pc(52) int[] local52 = null;
			if (Static40.method723(local41.anInt5598)) {
				local52 = Static479.aClass348_1.method8197((int) local41.aLong165).anIntArray697;
			} else if (local41.anInt5600 != -1) {
				local52 = Static479.aClass348_1.method8197(local41.anInt5600).anIntArray697;
			} else if (Static453.method6733(local41.anInt5598)) {
				@Pc(75) Class5_Sub13 local75 = (Class5_Sub13) Static51.aClass81_11.method1599((long) (int) local41.aLong165);
				if (local75 != null) {
					@Pc(80) Class14_Sub1_Sub1_Sub3_Sub2 local80 = local75.aClass14_Sub1_Sub1_Sub3_Sub2_1;
					@Pc(83) Class271 local83 = local80.aClass271_1;
					if (local83.anIntArray591 != null) {
						local83 = local83.method6476(Static564.aClass304_1);
					}
					if (local83 != null) {
						local52 = local83.anIntArray589;
					}
				}
			} else if (Static488.method7158(local41.anInt5598)) {
				@Pc(117) Class283 local117;
				if (local41.anInt5598 == 1009) {
					local117 = Static525.aClass371_4.method8554((int) local41.aLong165);
				} else {
					local117 = Static525.aClass371_4.method8554((int) (local41.aLong165 >>> 32 & 0x7FFFFFFFL));
				}
				if (local117.anIntArray623 != null) {
					local117 = local117.method6858(Static564.aClass304_1);
				}
				if (local117 != null) {
					local52 = local117.anIntArray621;
				}
			}
			if (local52 != null) {
				local50 = local50 + Static605.method8431(local52);
			}
		}
		if (Static642.anInt10370 > 2) {
			local50 = local50 + "<col=ffffff> / " + (Static642.anInt10370 - 2) + Static76.aClass58_26.method1237(Static321.anInt5554);
		}
		if (Static509.aClass357_9 != null) {
			@Pc(230) Class6 local230 = Static509.aClass357_9.method8383(arg0);
			if (local230 == null) {
				local230 = Static471.aClass6_12;
			}
			local230.method7202(Static394.anIntArray545, Static196.aRandom1, Static9.anInt145, Static158.aClass44Array7, Static503.anIntArray327, Static509.aClass357_9.anInt9797, Static509.aClass357_9.anInt9841, Static53.anInt817, Static509.aClass357_9.anInt9812, local50, Static609.anInt9976, Static509.aClass357_9.anInt9852, Static509.aClass357_9.anInt9858, Static509.aClass357_9.anInt9853);
			Static55.method867(Static503.anIntArray327[3], Static503.anIntArray327[0], Static503.anIntArray327[1], Static503.anIntArray327[2]);
		} else if (Static611.aClass357_14 != null && Static24.aClass235_1 == Static191.aClass235_2) {
			@Pc(295) int local295 = Static471.aClass6_12.method7201(Static394.anIntArray545, Static76.anInt1278 + 4, Static158.aClass44Array7, local50, Static455.anInt7664 + 16, Static53.anInt817, Static196.aRandom1);
			Static55.method867(16, Static76.anInt1278 + 4, Static455.anInt7664, local295 + Static457.aClass298_11.method6965(local50));
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "Lclient!ha;")
	public static Class84 aClass84_6;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_23 = new Class202(5, 7);

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "J")
	public static volatile long aLong112 = 0L;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "[I")
	public static final int[] anIntArray318 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public static void method3610() {
		Static4.aClass73_3.method2014();
		for (@Pc(13) Class12_Sub20 local13 = (Class12_Sub20) Static192.aClass73_33.method2005(); local13 != null; local13 = (Class12_Sub20) Static192.aClass73_33.method2009()) {
			if (local13.anInt4329 < 1000) {
				local13.method7967();
				Static4.aClass73_3.method2012(local13);
			}
		}
		Static4.aClass73_3.method2010(Static192.aClass73_33);
		if (Static8.anInt118 <= 1) {
			Static294.aClass12_Sub20_2 = null;
		} else if (Static435.aBoolean553 && Static23.aClass5_3.method211(81) && Static8.anInt118 > 2) {
			Static294.aClass12_Sub20_2 = (Class12_Sub20) Static192.aClass73_33.aClass12_47.aClass12_284.aClass12_284;
		} else {
			Static294.aClass12_Sub20_2 = (Class12_Sub20) Static192.aClass73_33.aClass12_47.aClass12_284;
		}
		@Pc(73) int local73 = -1;
		@Pc(78) Class12_Sub3 local78 = (Class12_Sub3) Static55.aClass73_13.method2005();
		if (local78 != null) {
			local73 = local78.method6274();
		}
		if (!Static389.aBoolean533) {
			if (local73 == 0 && (Static268.anInt5393 == 1 && Static8.anInt118 > 2 || Static377.method7984())) {
				local73 = 2;
			}
			if (local73 == 2 && Static8.anInt118 > 0 && local78 != null) {
				if (Static191.aClass198_6 == null && Static351.anInt6572 == 0) {
					Static397.method6232(local78.method6275(), local78.method6279());
				} else {
					Static58.anInt1425 = 2;
				}
			}
			if (local73 == 0 && Static8.anInt118 > 0) {
				Static382.method6047();
			}
			if (Static191.aClass198_6 != null || Static351.anInt6572 != 0) {
				return;
			}
			Static419.aClass12_Sub20_3 = null;
			Static58.anInt1425 = 0;
			return;
		}
		@Pc(94) int local94;
		@Pc(100) int local100;
		if (local73 == -1) {
			local94 = Static527.aClass6_1.method3754();
			local100 = Static527.aClass6_1.method3757();
			if (Static301.anInt5821 - 10 > local94 || local94 > Static301.anInt5821 + Static253.anInt5213 + 10 || local100 < Static105.anInt2405 - 10 || local100 > Static298.anInt3270 + Static105.anInt2405 + 10) {
				Static544.method7975();
			}
		}
		if (local73 != 0) {
			return;
		}
		local94 = Static301.anInt5821;
		local100 = Static105.anInt2405;
		@Pc(149) int local149 = Static253.anInt5213;
		@Pc(153) int local153 = local78.method6279();
		@Pc(159) int local159 = local78.method6275();
		@Pc(161) int local161 = -1;
		@Pc(180) int local180;
		for (@Pc(163) int local163 = 0; local163 < Static8.anInt118; local163++) {
			if (Static386.aBoolean562) {
				local180 = local100 + (-local163 + (Static8.anInt118 - 1)) * 16 + 33;
				if (local94 < local153 && local153 < local149 + local94 && local159 > local180 - 13 && local159 < local180 + 4) {
					local161 = local163;
				}
			} else {
				local180 = local100 + (-local163 + -1 + Static8.anInt118) * 16 + 31;
				if (local94 < local153 && local153 < local149 + local94 && local159 > local180 - 13 && local159 < local180 + 3) {
					local161 = local163;
				}
			}
		}
		if (local161 != -1) {
			local180 = 0;
			@Pc(265) Class162 local265 = new Class162(Static192.aClass73_33);
			for (@Pc(270) Class12_Sub20 local270 = (Class12_Sub20) local265.method4145(); local270 != null; local270 = (Class12_Sub20) local265.method4147()) {
				if (local180 == local161) {
					Static246.method4224(local153, local159, local270);
				}
				local180++;
			}
		}
		Static544.method7975();
		return;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)I")
	public static int method3611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!hh;I)V")
	public static void method3613(@OriginalArg(0) Class30_Sub1_Sub1_Sub2 arg0) {
		for (@Pc(14) Class12_Sub22 local14 = (Class12_Sub22) Static325.aClass73_50.method2005(); local14 != null; local14 = (Class12_Sub22) Static325.aClass73_50.method2009()) {
			if (local14.aClass30_Sub1_Sub1_Sub2_1 == arg0) {
				if (local14.aClass12_Sub13_Sub4_3 != null) {
					Static328.aClass12_Sub13_Sub1_1.method2443(local14.aClass12_Sub13_Sub4_3);
					local14.aClass12_Sub13_Sub4_3 = null;
				}
				local14.method7967();
				return;
			}
		}
	}
}

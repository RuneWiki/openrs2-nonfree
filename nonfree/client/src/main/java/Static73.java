import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!u;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array4;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[1000][];

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method1377(@OriginalArg(0) Class106 arg0) {
		@Pc(7) int local7 = Static293.anInt4679;
		@Pc(9) int local9 = Static32.anInt891;
		@Pc(11) int local11 = Static232.anInt4578;
		@Pc(15) int local15 = Static316.anInt5908 - 3;
		if (Static455.aClass137_24 == null || Static116.aClass137_8 == null) {
			if (Static140.aClass211_38.method4761(Static381.anInt7477) && Static140.aClass211_38.method4761(Static25.anInt618)) {
				Static455.aClass137_24 = arg0.method5938(Static470.method6054(Static140.aClass211_38, Static381.anInt7477, 0));
				@Pc(61) Class266 local61 = Static470.method6054(Static140.aClass211_38, Static25.anInt618, 0);
				Static116.aClass137_8 = arg0.method5938(local61);
				local61.method6058();
				Static307.aClass137_18 = arg0.method5938(local61);
			} else {
				arg0.P(local7, local9, local11, 20, 255 - Static18.anInt441 << 24 | Static364.anInt6678, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static455.aClass137_24 != null && Static116.aClass137_8 != null) {
			local87 = (local11 - Static116.aClass137_8.YA() * 2) / Static455.aClass137_24.YA();
			for (local89 = 0; local89 < local87; local89++) {
				Static455.aClass137_24.method5708(Static116.aClass137_8.YA() + local7 + local89 * Static455.aClass137_24.YA(), local9);
			}
			Static116.aClass137_8.method5708(local7, local9);
			Static307.aClass137_18.method5708(local7 + local11 - Static307.aClass137_18.YA(), local9);
		}
		Static13.aClass20_2.method5340(-1, local7 + 3, local9 - -14, Static163.anInt3445 | 0xFF000000, Static192.aClass158_104.method3594(Static365.anInt6682));
		arg0.P(local7, local9 + 20, local11, local15 - 20, -Static18.anInt441 + 255 << 24 | Static364.anInt6678, 1);
		local87 = Static336.aClass87_1.method1919();
		local89 = Static336.aClass87_1.method1909();
		@Pc(176) int local176 = 0;
		@Pc(199) int local199;
		for (@Pc(181) Class1_Sub35 local181 = (Class1_Sub35) Static401.aClass203_47.method4548(); local181 != null; local181 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
			local199 = local9 + (-local176 + -1 + Static126.anInt2794) * 16 + 13 + 20;
			if (local87 > local7 && local87 < local11 + local7 && local199 - 13 < local89 && local199 + 4 > local89 && local181.aBoolean370) {
				arg0.P(local7, local199 - 12, local11, 16, 255 - Static194.anInt4067 << 24 | Static74.anInt1920, 1);
			}
			local176++;
		}
		if ((Static280.aClass137_15 == null || Static450.aClass137_23 == null || Static302.aClass137_17 == null) && Static140.aClass211_38.method4761(Static194.anInt4068) && Static140.aClass211_38.method4761(Static25.anInt615) && Static140.aClass211_38.method4761(Static155.anInt3350)) {
			@Pc(275) Class266 local275 = Static470.method6054(Static140.aClass211_38, Static25.anInt615, 0);
			Static450.aClass137_23 = arg0.method5938(local275);
			local275.method6058();
			Static284.aClass137_10 = arg0.method5938(local275);
			Static280.aClass137_15 = arg0.method5938(Static470.method6054(Static140.aClass211_38, Static194.anInt4068, 0));
			@Pc(300) Class266 local300 = Static470.method6054(Static140.aClass211_38, Static155.anInt3350, 0);
			Static302.aClass137_17 = arg0.method5938(local300);
			local300.method6058();
			Static90.aClass137_2 = arg0.method5938(local300);
		}
		@Pc(368) int local368;
		@Pc(331) int local331;
		if (Static280.aClass137_15 != null && Static450.aClass137_23 != null && Static302.aClass137_17 != null) {
			local199 = (local11 - Static302.aClass137_17.YA() * 2) / Static280.aClass137_15.YA();
			for (local331 = 0; local331 < local199; local331++) {
				Static280.aClass137_15.method5708(local7 + Static302.aClass137_17.YA() + Static280.aClass137_15.YA() * local331, -Static280.aClass137_15.ZA() + local15 + local9);
			}
			local368 = (local15 - Static302.aClass137_17.ZA() - 20) / Static450.aClass137_23.ZA();
			for (@Pc(370) int local370 = 0; local370 < local368; local370++) {
				Static450.aClass137_23.method5708(local7, local9 + local370 * Static450.aClass137_23.ZA() + 20);
				Static284.aClass137_10.method5708(local7 + local11 - Static284.aClass137_10.YA(), local370 * Static450.aClass137_23.ZA() + local9 - -20);
			}
			Static302.aClass137_17.method5708(local7, local15 + local9 - Static302.aClass137_17.ZA());
			Static90.aClass137_2.method5708(local7 + local11 - Static302.aClass137_17.YA(), local9 + (local15 - Static302.aClass137_17.ZA()));
		}
		local176 = 0;
		for (@Pc(444) Class1_Sub35 local444 = (Class1_Sub35) Static401.aClass203_47.method4548(); local444 != null; local444 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
			local331 = (Static126.anInt2794 - local176 - 1) * 16 + local9 + 13 + 20;
			local368 = Static163.anInt3445 | 0xFF000000;
			if (local7 < local87 && local11 + local7 > local87 && local331 - 13 < local89 && local89 < local331 + 4 && local444.aBoolean370) {
				local368 = Static237.anInt4687 | 0xFF000000;
			}
			@Pc(501) int[] local501 = null;
			if (Static57.method1071(local444.anInt5839)) {
				local501 = Static43.aClass57_1.method1414((int) local444.aLong166).anIntArray463;
			} else if (local444.anInt5843 != -1) {
				local501 = Static43.aClass57_1.method1414(local444.anInt5843).anIntArray463;
			} else if (Static370.method5159(local444.anInt5839)) {
				@Pc(580) Class1_Sub27 local580 = (Class1_Sub27) Static24.aClass38_3.method765((long) local444.aLong166);
				if (local580 != null) {
					@Pc(585) Class30_Sub1_Sub1_Sub1 local585 = local580.aClass30_Sub1_Sub1_Sub1_2;
					@Pc(588) Class11 local588 = local585.aClass11_1;
					if (local588.anIntArray12 != null) {
						local588 = local588.method136(Static366.aClass190_1);
					}
					if (local588 != null) {
						local501 = local588.anIntArray15;
					}
				}
			} else if (Static351.method4975(local444.anInt5839)) {
				@Pc(545) Class192 local545;
				if (local444.anInt5839 == 1011) {
					local545 = Static455.aClass161_4.method3628((int) local444.aLong166);
				} else {
					local545 = Static455.aClass161_4.method3628((int) (local444.aLong166 >>> 32 & 0x7FFFFFFFL));
				}
				if (local545.anIntArray532 != null) {
					local545 = local545.method4369(Static366.aClass190_1);
				}
				if (local545 != null) {
					local501 = local545.anIntArray535;
				}
			}
			@Pc(613) String local613 = Static60.method1126(local444);
			if (local501 != null) {
				local613 = local613 + Static445.method5849(local501);
			}
			Static13.aClass20_2.method5341(local368, Static154.aClass137Array6, local7 + 3, Static461.anIntArray726, local613, local331);
			local176++;
			if (local444.aBoolean371) {
				Static96.aClass137_3.method5708(local7 + Static394.aClass209_10.method4694(local613) + 5, local331 + -12);
			}
		}
		Static150.method2378(Static316.anInt5908, Static293.anInt4679, Static32.anInt891, Static232.anInt4578);
	}
}

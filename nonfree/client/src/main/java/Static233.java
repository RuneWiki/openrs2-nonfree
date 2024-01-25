import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
	public static int anInt4619 = 0;

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
	public static int anInt4621 = 0;

	@OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
	public static int anInt4625 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!za;Z)V")
	public static void method3558(@OriginalArg(0) Class106 arg0) {
		if (Static126.anInt2794 < 2 && !Static293.aBoolean300 || Static404.aClass68_11 != null) {
			return;
		}
		@Pc(49) String local49;
		if (Static293.aBoolean300 && Static126.anInt2794 < 2) {
			local49 = Static1.aString1 + Static181.aClass158_102.method3594(Static365.anInt6682) + Static90.aString17 + " ->";
		} else if (Static326.aBoolean381 && Static414.aClass48_1.method1119(81) && Static126.anInt2794 > 2) {
			local49 = Static60.method1126((Class1_Sub35) Static401.aClass203_47.aClass1_195.aClass1_263.aClass1_263);
		} else {
			@Pc(45) Class1_Sub35 local45 = (Class1_Sub35) Static401.aClass203_47.aClass1_195.aClass1_263;
			local49 = Static60.method1126(local45);
			@Pc(51) int[] local51 = null;
			if (Static57.method1071(local45.anInt5839)) {
				local51 = Static43.aClass57_1.method1414((int) local45.aLong166).anIntArray463;
			} else if (local45.anInt5843 != -1) {
				local51 = Static43.aClass57_1.method1414(local45.anInt5843).anIntArray463;
			} else if (Static370.method5159(local45.anInt5839)) {
				@Pc(136) Class1_Sub27 local136 = (Class1_Sub27) Static24.aClass38_3.method765((long) local45.aLong166);
				if (local136 != null) {
					@Pc(141) Class30_Sub1_Sub1_Sub1 local141 = local136.aClass30_Sub1_Sub1_Sub1_2;
					@Pc(144) Class11 local144 = local141.aClass11_1;
					if (local144.anIntArray12 != null) {
						local144 = local144.method136(Static366.aClass190_1);
					}
					if (local144 != null) {
						local51 = local144.anIntArray15;
					}
				}
			} else if (Static351.method4975(local45.anInt5839)) {
				@Pc(101) Class192 local101;
				if (local45.anInt5839 == 1011) {
					local101 = Static455.aClass161_4.method3628((int) local45.aLong166);
				} else {
					local101 = Static455.aClass161_4.method3628((int) (local45.aLong166 >>> 32 & 0x7FFFFFFFL));
				}
				if (local101.anIntArray532 != null) {
					local101 = local101.method4369(Static366.aClass190_1);
				}
				if (local101 != null) {
					local51 = local101.anIntArray535;
				}
			}
			if (local51 != null) {
				local49 = local49 + Static445.method5849(local51);
			}
		}
		if (Static126.anInt2794 > 2) {
			local49 = local49 + "<col=ffffff> / " + (Static126.anInt2794 - 2) + Static81.aClass158_48.method3594(Static365.anInt6682);
		}
		if (Static229.aClass68_9 != null) {
			@Pc(265) Class20 local265 = Static229.aClass68_9.method1568(arg0);
			if (local265 == null) {
				local265 = Static13.aClass20_2;
			}
			local265.method5344(local49, Static427.anIntArray714, Static229.aClass68_9.anInt2189, Static229.aClass68_9.anInt2173, Static229.aClass68_9.anInt2115, Static229.aClass68_9.anInt2149, Static229.aClass68_9.anInt2107, Static154.aClass137Array6, Static172.anInt3554, Static315.anInt5900, Static167.anInt5708, Static398.aRandom1, Static461.anIntArray726, Static229.aClass68_9.anInt2192);
			Static152.method2399(Static427.anIntArray714[1], Static427.anIntArray714[2], Static427.anIntArray714[3], Static427.anIntArray714[0]);
		} else if (Static401.aClass68_15 != null && Static181.aClass272_2 == Static268.aClass272_4) {
			@Pc(245) int local245 = Static13.aClass20_2.method5346(Static398.aRandom1, Static315.anInt5900, Static203.anInt4206 + 4, Static432.anInt7625 - -16, Static154.aClass137Array6, local49, Static461.anIntArray726);
			Static152.method2399(Static432.anInt7625, Static394.aClass209_10.method4694(local49) + local245, 16, Static203.anInt4206 + 4);
			return;
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(Z)V")
	public static void method3559() {
		Static431.aClipboard1 = null;
		Static6.aBoolean1 = false;
		Static179.method3014();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!co;ILclient!mo;Lclient!za;Lclient!it;BI)V")
	public static void method3560(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub28 arg3, @OriginalArg(4) Class106 arg4, @OriginalArg(5) Class122 arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg3.anInt4941 - arg0 / 2 - 5;
		@Pc(16) int local16 = arg2 + 2;
		if (arg1.anInt1555 != 0) {
			arg4.method5941(local16, arg0 + 10, local12, arg6 * arg5.method3064() + arg2 + 1 - local16, arg1.anInt1555);
		}
		if (arg1.anInt1561 != 0) {
			arg4.method5916(arg0 + 10, arg1.anInt1561, arg5.method3064() * arg6 + arg2 + 1 - local16, local16, local12);
		}
		@Pc(70) int local70 = arg1.anInt1539;
		if (arg3.aBoolean312 && arg1.anInt1543 != -1) {
			local70 = arg1.anInt1543;
		}
		for (@Pc(86) int local86 = 0; local86 < arg6; local86++) {
			@Pc(91) String local91 = Static162.aStringArray23[local86];
			if (local86 < arg6 - 1) {
				local91 = local91.substring(0, local91.length() - 4);
			}
			arg5.method3060(arg4, local91, arg3.anInt4941, arg2, local70);
			arg2 += arg5.method3064();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3561(@OriginalArg(1) String arg0) {
		Static325.aString57 = arg0;
		if (Static150.aClass183_3.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static150.aClass183_3.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static150.aClass183_3.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static237.method3606(Static250.method3737() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static466.method4994(Static150.aClass183_3.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(86) Throwable local86) {
		}
	}
}

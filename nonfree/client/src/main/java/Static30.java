import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_6;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_309 = Static193.method3027("p12_full");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
	public static void method546(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class3_Sub4 local14 = new Class3_Sub4(arg0);
		@Pc(18) int local18 = local14.method1270();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) Class3_Sub1 local26 = new Class3_Sub1();
			@Pc(30) Class70 local30 = local14.method1246();
			local26.anInt26 = local14.method1270();
			local26.anInt24 = local14.method1270();
			local26.anInt25 = local14.method1278();
			local26.aClass70_19 = local30.method2020();
			local26.aClass70Array1 = local30.method2037(47);
			Static172.aClass10_94.method261(local26);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method550() {
		try {
			if (Static79.anInt1588 == 1) {
				@Pc(10) int local10 = Static175.aClass3_Sub19_Sub2_2.method2846();
				if (local10 > 0 && Static175.aClass3_Sub19_Sub2_2.method2854()) {
					local10 -= Static26.anInt553;
					if (local10 < 0) {
						local10 = 0;
					}
					Static175.aClass3_Sub19_Sub2_2.method2849(local10);
					return;
				}
				Static175.aClass3_Sub19_Sub2_2.method2872();
				Static175.aClass3_Sub19_Sub2_2.method2875();
				Static135.aClass3_Sub18_1 = null;
				if (Static78.aClass52_18 == null) {
					Static79.anInt1588 = 0;
				} else {
					Static79.anInt1588 = 2;
				}
				Static202.aClass61_1 = null;
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static175.aClass3_Sub19_Sub2_2.method2872();
			Static135.aClass3_Sub18_1 = null;
			Static79.anInt1588 = 0;
			Static202.aClass61_1 = null;
			Static78.aClass52_18 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	public static void method551() {
		try {
			if (Static152.aClass49_1 == null) {
				Static152.aClass49_1 = new Class49(Static47.aClass47_1, Static207.method3296(new Class70[] { Static196.aClass70_1927, Static107.method2404(Static203.anInt4141), Static146.aClass70_1397 }).method2049());
			} else {
				@Pc(16) byte[] local16 = Static152.aClass49_1.method1408();
				if (local16 != null) {
					@Pc(23) Class3_Sub4 local23 = new Class3_Sub4(local16);
					Static170.anInt1107 = local23.method1270();
					Static197.aClass71Array1 = new Class71[Static170.anInt1107];
					for (@Pc(36) int local36 = 0; local36 < Static170.anInt1107; local36++) {
						@Pc(46) Class71 local46 = Static197.aClass71Array1[local36] = new Class71();
						@Pc(50) int local50 = local23.method1270();
						local46.aBoolean139 = (local50 & 0x8000) != 0;
						local46.anInt2947 = local50 & 0x7FFF;
						local46.aClass70_1357 = local23.method1246();
						local46.anInt2945 = local23.method1267();
						local46.anInt2950 = local36;
						local46.anInt2949 = Static69.method1012(local23.method1270());
					}
					Static26.method469(0, Static197.aClass71Array1.length - 1, Static185.anIntArray325, Static52.anIntArray60, Static197.aClass71Array1);
					Static149.aBoolean142 = true;
					Static152.aClass49_1 = null;
					return;
				}
			}
		} catch (@Pc(138) Exception local138) {
			local138.printStackTrace();
			Static152.aClass49_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!we;I)V")
	public static void method554(@OriginalArg(0) Class26_Sub2 arg0) {
		arg0.anInt2586 = 0;
		@Pc(8) int local8 = arg0.anInt2624 - Static184.anInt3760;
		@Pc(22) int local22 = arg0.anInt2619 * 128 + arg0.anInt2604 * 64;
		@Pc(32) int local32 = arg0.anInt2604 * 64 + arg0.anInt2588 * 128;
		arg0.anInt2593 += (local22 - arg0.anInt2593) / local8;
		arg0.anInt2611 += (local32 - arg0.anInt2611) / local8;
		if (arg0.anInt2607 == 0) {
			arg0.anInt2644 = 1024;
		}
		if (arg0.anInt2607 == 1) {
			arg0.anInt2644 = 1536;
		}
		if (arg0.anInt2607 == 2) {
			arg0.anInt2644 = 0;
		}
		if (arg0.anInt2607 == 3) {
			arg0.anInt2644 = 512;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Z")
	public static boolean method556(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	public static void method557() {
		Static145.aClass40_10 = new Class40(32);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method558(@OriginalArg(1) Class70 arg0) {
		try {
			Static165.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method2039(Static165.anApplet_Sub1_1.getCodeBase()), "_blank");
		} catch (@Pc(10) Exception local10) {
		}
	}
}

import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	public static int anInt105;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
	public static int anInt120;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_5 = new Class303(75, 16);

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "[I")
	public static int[] anIntArray7 = new int[2];

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
	public static int anInt118 = 0;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_11 = new Class56(101, 5);

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_6 = new Class303(17, 15);

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method78(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static505.aClass45_11 = Static448.method7375(0, Static405.aClass3_Sub3_Sub1_1.anInt7557 * 2, Static173.anInterface3_6, Static387.aCanvas9, Static128.aClass322_51);
			if (arg0 != null) {
				Static505.aClass45_11.ja(0);
				@Pc(165) Class134 local165 = Static403.method5839(Static154.aClass322_61, Static334.anInt5599);
				@Pc(174) Class54 local174 = Static505.aClass45_11.method7394(local165, Static604.method6156(Static552.aClass322_150, Static334.anInt5599));
				Static189.method3211();
				Static525.method7021(arg0, Static505.aClass45_11, local174, local165, true);
			}
		} else {
			@Pc(9) Class45 local9 = null;
			@Pc(28) Class134 local28;
			@Pc(37) Class54 local37;
			if (arg0 != null) {
				local9 = Static448.method7375(0, 0, Static173.anInterface3_6, Static387.aCanvas9, Static128.aClass322_51);
				local9.ja(0);
				local28 = Static403.method5839(Static154.aClass322_61, Static334.anInt5599);
				local37 = local9.method7394(local28, Static604.method6156(Static552.aClass322_150, Static334.anInt5599));
				Static189.method3211();
				Static525.method7021(arg0, local9, local37, local28, true);
			}
			try {
				Static505.aClass45_11 = Static448.method7375(arg1, Static405.aClass3_Sub3_Sub1_1.anInt7557 * 2, Static173.anInterface3_6, Static387.aCanvas9, Static128.aClass322_51);
				if (arg0 != null) {
					local9.ja(0);
					local28 = Static403.method5839(Static154.aClass322_61, Static334.anInt5599);
					local37 = local9.method7394(local28, Static604.method6156(Static552.aClass322_150, Static334.anInt5599));
					Static189.method3211();
					Static525.method7021(arg0, local9, local37, local28, true);
				}
				if (Static505.aClass45_11.method7384()) {
					@Pc(95) boolean local95 = true;
					try {
						local95 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(107) Throwable local107) {
					}
					@Pc(113) Class3_Sub15 local113;
					if (local95) {
						local113 = Static505.aClass45_11.method7423(146800640);
					} else {
						local113 = Static505.aClass45_11.method7423(104857600);
					}
					Static505.aClass45_11.method7418(local113);
				}
			} catch (@Pc(124) Throwable local124) {
				Static505.aClass45_11 = Static448.method7375(0, 0, Static173.anInterface3_6, Static387.aCanvas9, Static128.aClass322_51);
				arg1 = 0;
			}
			if (local9 != null) {
				try {
					local9.method7387();
				} catch (@Pc(141) Throwable local141) {
				}
			}
		}
		Static60.anInt1312 = arg1;
		Static9.method3874();
		Static505.aClass45_11.va(32);
		Static472.aClass11_6 = Static505.aClass45_11.method7422();
		Static338.aClass11_4 = Static505.aClass45_11.method7422();
		Static207.method3387();
		Static505.aClass45_11.method7385(!Static405.aClass3_Sub3_Sub1_1.aBoolean581);
		if (Static505.aClass45_11.method7433()) {
			Static228.method3543(Static405.aClass3_Sub3_Sub1_1.aBoolean580);
		}
		Static217.method4645(Static140.anInt3026 >> 3, Static54.anInt1038 >> 3, Static505.aClass45_11);
		Static428.method6060();
		Static307.aBoolean383 = true;
		Static286.aClass306Array1 = null;
		Static206.aBoolean283 = false;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)I")
	public static int method79() {
		@Pc(5) Class6 local5 = Static220.aClass6_22;
		synchronized (Static220.aClass6_22) {
			return Static220.aClass6_22.method103();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!r;)V")
	public static void method81(@OriginalArg(1) Class45 arg0) {
		if (Static270.aBoolean347) {
			Static417.method5938(arg0);
		} else {
			Static484.method6594(arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!np;I)Lclient!dd;")
	public static Class65 method86(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(10) Class63 local10 = Static407.method5865()[arg0.method5175()];
		@Pc(17) Class249 local17 = Static448.method7373()[arg0.method5175()];
		@Pc(21) int local21 = arg0.method5231();
		@Pc(25) int local25 = arg0.method5231();
		@Pc(29) int local29 = arg0.method5198();
		@Pc(39) int local39 = arg0.method5198();
		@Pc(43) int local43 = arg0.method5231();
		@Pc(47) int local47 = arg0.method5186();
		@Pc(51) int local51 = arg0.method5186();
		return new Class65(local10, local17, local21, local25, local29, local39, local43, local47, local51);
	}
}

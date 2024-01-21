import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_30 = new Class85(64);

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
	public static int anInt3105 = 0;

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "Lclient!gj;")
	public static final Class40 aClass40_12 = new Class40(4096);

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1466 = Static193.method3027("Wordpack geladen)3");

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!h;Z)V")
	public static void method2214(@OriginalArg(1) Class3_Sub10 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) int local14 = arg0.anInt1427;
		@Pc(18) int local18 = (int) arg0.aLong147;
		arg0.method3320();
		if (arg1) {
			Static24.method1241(local14);
		}
		Static159.method2397(local14);
		@Pc(33) Class6 local33 = Static146.method2127(local18);
		if (local33 != null) {
			Static9.method237(local33);
		}
		Static134.aBoolean131 = false;
		Static35.anInt770 = 0;
		Static5.method92(Static199.anInt4049, Static36.anInt795, Static36.anInt796, Static85.anInt1693);
		if (Static63.anInt1331 != -1) {
			Static138.method1978(1, Static63.anInt1331);
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(JI)Lclient!oc;")
	public static Class70 method2215(@OriginalArg(0) long arg0) {
		return Static112.method1609(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	public static void method2217() {
		if (!Static89.aBoolean38) {
			return;
		}
		Static111.anIntArray137 = null;
		Static113.aClass3_Sub3_Sub2_Sub1_6 = null;
		Static203.aClass3_Sub3_Sub2_Sub2Array12 = null;
		Static57.aClass3_Sub3_Sub2_Sub2Array2 = null;
		Static209.anIntArray380 = null;
		Static178.anIntArray305 = null;
		Static91.anIntArray94 = null;
		Static65.aClass3_Sub3_Sub2_Sub2_2 = null;
		Static31.aClass3_Sub3_Sub2_Sub2Array1 = null;
		Static84.aClass3_Sub3_Sub2_Sub2Array3 = null;
		Static55.anIntArray65 = null;
		Static201.aClass3_Sub3_Sub2_Sub2_4 = null;
		Static93.aClass3_Sub3_Sub2_Sub2_3 = null;
		Static205.aClass3_Sub3_Sub2_Sub1Array13 = null;
		Static76.aClass3_Sub3_Sub2_Sub1_5 = null;
		Static203.anIntArray359 = null;
		Static39.anIntArray41 = null;
		Static163.aClass3_Sub3_Sub2_Sub2Array8 = null;
		Static75.anIntArray79 = null;
		Static28.aClass3_Sub3_Sub2_Sub2_1 = null;
		Static31.aClass3_Sub3_Sub2_Sub1_2 = null;
		Static44.aClass3_Sub3_Sub2_Sub1_3 = null;
		Static35.method615();
		Static185.method2900(true);
		Static89.aBoolean38 = false;
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
	public static void method2218() {
		for (@Pc(11) Class3_Sub10 local11 = (Class3_Sub10) Static144.aClass40_9.method1026(); local11 != null; local11 = (Class3_Sub10) Static144.aClass40_9.method1024()) {
			@Pc(16) int local16 = local11.anInt1427;
			if (Static126.method1762(local16)) {
				@Pc(22) boolean local22 = true;
				@Pc(26) Class6[] local26 = Static49.aClass6ArrayArray1[local16];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					if (local26[local28] != null) {
						local22 = local26[local28].aBoolean21;
						break;
					}
				}
				if (!local22) {
					@Pc(56) int local56 = (int) local11.aLong147;
					@Pc(60) Class6 local60 = Static146.method2127(local56);
					if (local60 != null) {
						Static9.method237(local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	public static void method2219() {
		Static93.aClass3_Sub4_Sub1_18.method1298(134);
		Static93.aClass3_Sub4_Sub1_18.method1250(0L);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	public static void method2221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static1.aBoolean96 = true;
		Static95.anInt1976 = arg0;
		Static81.anInt1614 = arg1;
		Static58.anInt1272 = arg2;
		Static193.anInt3928 = -1;
		Static182.anInt3733 = -1;
	}
}

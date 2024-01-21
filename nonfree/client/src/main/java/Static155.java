import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] aClass1_Sub1_Sub8_Sub3Array9;

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	public static int anInt4269;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1089 = Static8.method128("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Lclient!da;")
	public static Class14 aClass14_14 = new Class14(8);

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1090 = Static8.method128("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1091 = aClass18_1090;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	public static int anInt4267 = 0;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
	public static int anInt4268 = 0;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	public static int anInt4270 = 128;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public static void method2900() {
		aClass18_1091 = null;
		aClass18_1089 = null;
		aClass14_14 = null;
		aClass1_Sub1_Sub8_Sub3Array9 = null;
		aClass18_1090 = null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
	public static void method2901() {
		if (Static35.aClass21_2 != null) {
			Static35.aClass21_2.method1029();
			Static35.aClass21_2 = null;
		}
		Static123.method2413();
		Static87.aClass68_1.method2659();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static141.aClass22Array2[local18].method1045();
		}
		System.gc();
		Static69.method1447();
		Static157.anInt4311 = -1;
		Static116.aBoolean143 = false;
		Static87.method1879();
		Static6.method107(10);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)Lclient!wa;")
	public static Class1_Sub1_Sub18 method2902(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub18 local10 = (Class1_Sub1_Sub18) Static6.aClass66_1.method2599((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static26.aClass16_4.method2254(arg0, 13);
		local10 = new Class1_Sub1_Sub18();
		local10.anInt4682 = arg0;
		if (local25 != null) {
			local10.method3153(new Class1_Sub6(local25));
		}
		Static6.aClass66_1.method2597((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
	public static void method2903() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static80.anInt2478 - 1; local18++) {
				if (Static114.anIntArray288[local18] < 1000 && Static114.anIntArray288[local18 + 1] > 1000) {
					local12 = false;
					@Pc(40) Class18 local40 = Static180.aClass18Array25[local18];
					Static180.aClass18Array25[local18] = Static180.aClass18Array25[local18 + 1];
					Static180.aClass18Array25[local18 + 1] = local40;
					@Pc(58) Class18 local58 = Static84.aClass18Array13[local18];
					Static84.aClass18Array13[local18] = Static84.aClass18Array13[local18 + 1];
					Static84.aClass18Array13[local18 + 1] = local58;
					@Pc(76) int local76 = Static114.anIntArray288[local18];
					Static114.anIntArray288[local18] = Static114.anIntArray288[local18 + 1];
					Static114.anIntArray288[local18 + 1] = local76;
					@Pc(94) int local94 = Static123.anIntArray311[local18];
					Static123.anIntArray311[local18] = Static123.anIntArray311[local18 + 1];
					Static123.anIntArray311[local18 + 1] = local94;
					@Pc(112) int local112 = Static130.anIntArray332[local18];
					Static130.anIntArray332[local18] = Static130.anIntArray332[local18 + 1];
					Static130.anIntArray332[local18 + 1] = local112;
					@Pc(130) int local130 = Static131.anIntArray334[local18];
					Static131.anIntArray334[local18] = Static131.anIntArray334[local18 + 1];
					Static131.anIntArray334[local18 + 1] = local130;
				}
			}
		}
	}
}

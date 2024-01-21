import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!nb;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public static int anInt155 = 0;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!ea;")
	public static Class18 aClass18_71 = Static8.method128(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!ea;")
	private static Class18 aClass18_72 = Static8.method128("Loading wordpack )2 ");

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!ea;")
	public static Class18 aClass18_73 = Static8.method128("(Y<)4col>");

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_74 = Static8.method128("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	public static int anInt157 = 0;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_75 = aClass18_72;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!ea;I)V")
	public static void method89(@OriginalArg(0) int arg0, @OriginalArg(1) Class18 arg1) {
		@Pc(12) boolean local12 = false;
		@Pc(18) Class18 local18 = arg1.method742().method739();
		for (@Pc(20) int local20 = 0; local20 < Static45.anInt1553; local20++) {
			@Pc(28) Class1_Sub1_Sub5_Sub1_Sub2 local28 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[Static58.anIntArray140[local20]];
			if (local28 != null && local28.aClass18_908 != null && local28.aClass18_908.method734(local18)) {
				Static12.method3143(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray315[0], 0, local28.anIntArray314[0], Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray314[0], false, 2, 0, 1, 0, local28.anIntArray315[0], 1);
				local12 = true;
				if (arg0 == 1) {
					Static95.aClass1_Sub6_Sub1_1.method555(96);
					Static95.aClass1_Sub6_Sub1_1.method523(Static58.anIntArray140[local20]);
				} else if (arg0 == 4) {
					Static95.aClass1_Sub6_Sub1_1.method555(247);
					Static95.aClass1_Sub6_Sub1_1.method511(Static58.anIntArray140[local20]);
				} else if (arg0 == 6) {
					Static95.aClass1_Sub6_Sub1_1.method555(244);
					Static95.aClass1_Sub6_Sub1_1.method511(Static58.anIntArray140[local20]);
				} else if (arg0 == 7) {
					Static95.aClass1_Sub6_Sub1_1.method555(211);
					Static95.aClass1_Sub6_Sub1_1.method523(Static58.anIntArray140[local20]);
				}
				break;
			}
		}
		if (!local12) {
			Static88.method1922(Static62.aClass18_472, 0, Static144.method2735(new Class18[] { Static8.aClass18_89, local18 }));
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method90() {
		aClass18_73 = null;
		aClass18_74 = null;
		aClass18_75 = null;
		aClass18_72 = null;
		aClass48_1 = null;
		aClass18_71 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "Lclient!pf;")
	public static Class4_Sub1_Sub11 aClass4_Sub1_Sub11_1;

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "Lclient!ec;")
	private static Class22 aClass22_933 = Static60.method1113("Your account is already logged in)3");

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "Lclient!ec;")
	public static Class22 aClass22_932 = aClass22_933;

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "Lclient!ec;")
	public static Class22 aClass22_934 = Static60.method1113("jlv");

	@OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
	public static int anInt3004 = 0;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
	public static void method1910() {
		aClass22_934 = null;
		aClass4_Sub1_Sub11_1 = null;
		aClass22_933 = null;
		aClass22_932 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!ec;)V")
	public static void method1912(@OriginalArg(0) int arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(7) Class22 local7 = arg1.method453().method473();
		@Pc(13) boolean local13 = false;
		for (@Pc(19) int local19 = 0; local19 < Static51.anInt1461; local19++) {
			@Pc(27) Class4_Sub1_Sub3_Sub2_Sub1 local27 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[Static115.anIntArray310[local19]];
			if (local27 != null && local27.aClass22_444 != null && local27.aClass22_444.method480(local7)) {
				Static78.method1305(false, 0, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0], 0, 1, local27.anIntArray280[0], Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0], 0, local27.anIntArray277[0], 1, 2);
				local13 = true;
				if (arg0 == 1) {
					Static38.aClass4_Sub11_Sub1_1.method752(35);
					Static38.aClass4_Sub11_Sub1_1.method733(Static115.anIntArray310[local19]);
				} else if (arg0 == 4) {
					Static38.aClass4_Sub11_Sub1_1.method752(81);
					Static38.aClass4_Sub11_Sub1_1.method691(Static115.anIntArray310[local19]);
				} else if (arg0 == 6) {
					Static38.aClass4_Sub11_Sub1_1.method752(193);
					Static38.aClass4_Sub11_Sub1_1.method700(Static115.anIntArray310[local19]);
				} else if (arg0 == 7) {
					Static38.aClass4_Sub11_Sub1_1.method752(138);
					Static38.aClass4_Sub11_Sub1_1.method735(Static115.anIntArray310[local19]);
				}
				break;
			}
		}
		if (!local13) {
			Static65.method1153(Static44.method856(new Class22[] { Static79.aClass22_622, local7 }), 0, Static64.aClass22_485);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(JI)V")
	public static void method1916(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static38.aClass4_Sub11_Sub1_1.method752(23);
			Static38.aClass4_Sub11_Sub1_1.method728(arg0);
		}
	}
}

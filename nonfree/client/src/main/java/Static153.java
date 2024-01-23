import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "[I")
	public static int[] anIntArray315;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!ta;")
	public static Class162 aClass162_5 = new Class162(64);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	public static int anInt3412 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method2463(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(19) String local19 = Static238.method3756(arg0);
		if (local19 == null) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < Static159.anInt3526; local24++) {
			@Pc(33) String local33 = Static238.method3756(Static64.aStringArray14[local24]);
			if (local33 != null && local33.equals(local19)) {
				Static159.anInt3526--;
				for (@Pc(46) int local46 = local24; local46 < Static159.anInt3526; local46++) {
					Static64.aStringArray14[local46] = Static64.aStringArray14[local46 + 1];
					Static60.aStringArray13[local46] = Static60.aStringArray13[local46 + 1];
					Static141.aBooleanArray26[local46] = Static141.aBooleanArray26[local46 + 1];
				}
				Static41.anInt1002 = Static12.anInt4023;
				Static2.aClass1_Sub14_Sub1_1.method2252(19);
				Static2.aClass1_Sub14_Sub1_1.method2191(Static34.method690(arg0));
				Static2.aClass1_Sub14_Sub1_1.method2188(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)I")
	public static int method2465() {
		if (Static7.aBoolean14) {
			return 0;
		} else if (Static241.method3782()) {
			return Static72.aBoolean118 ? 2 : 1;
		} else {
			return 1;
		}
	}
}

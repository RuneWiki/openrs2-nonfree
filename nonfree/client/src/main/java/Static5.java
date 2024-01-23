import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "Lclient!cg;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Lclient!tm;")
	public static Class163 aClass163_1 = new Class163(16);

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Z")
	public static boolean method87() {
		try {
			if (Static55.anInt1252 == 2) {
				if (Static287.aClass4_Sub14_2 == null) {
					Static287.aClass4_Sub14_2 = Static314.method1440(Static127.aClass22_43, Static156.anInt3218, Static266.anInt5231);
					if (Static287.aClass4_Sub14_2 == null) {
						return false;
					}
				}
				if (Static89.aClass20_1 == null) {
					Static89.aClass20_1 = new Class20(Static297.aClass22_92, Static261.aClass22_89);
				}
				if (Static228.aClass4_Sub6_Sub2_2.method818(Static89.aClass20_1, Static287.aClass4_Sub14_2, Static262.aClass22_90)) {
					Static228.aClass4_Sub6_Sub2_2.method844();
					Static228.aClass4_Sub6_Sub2_2.method825(Static8.anInt148);
					Static228.aClass4_Sub6_Sub2_2.method826(Static287.aClass4_Sub14_2, Static287.aBoolean385);
					Static55.anInt1252 = 0;
					Static89.aClass20_1 = null;
					Static287.aClass4_Sub14_2 = null;
					Static127.aClass22_43 = null;
					return true;
				}
			}
		} catch (@Pc(71) Exception local71) {
			local71.printStackTrace();
			Static228.aClass4_Sub6_Sub2_2.method852();
			Static89.aClass20_1 = null;
			Static127.aClass22_43 = null;
			Static55.anInt1252 = 0;
			Static287.aClass4_Sub14_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	public static void method88(@OriginalArg(1) int arg0) {
		@Pc(2) Class48 local2 = Static291.aClass48_1;
		synchronized (Static291.aClass48_1) {
			Static201.anInt4016 = arg0;
		}
	}
}

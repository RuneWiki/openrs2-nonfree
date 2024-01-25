import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString72 = null;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BB)Z")
	public static boolean method6455(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static510.aCharArray12[local12 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ni;Z)V")
	public static void method6457(@OriginalArg(0) Class6_Sub1_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class6_Sub1_Sub1_Sub1_Sub1) {
			@Pc(5) Class6_Sub1_Sub1_Sub1_Sub1 local5 = (Class6_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local5.aClass86_1 != null) {
				Static114.method1697(local5, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 != local5.aByte112);
			}
		} else if (arg0 instanceof Class6_Sub1_Sub1_Sub1_Sub2) {
			@Pc(31) Class6_Sub1_Sub1_Sub1_Sub2 local31 = (Class6_Sub1_Sub1_Sub1_Sub2) arg0;
			Static53.method920(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 != local31.aByte112, local31);
		}
	}
}

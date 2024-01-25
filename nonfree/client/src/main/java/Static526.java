import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_164 = new Class56(8, 14);

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_165 = new Class56(89, 11);

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_94 = new Class303(5, 3);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public static void method7023(@OriginalArg(0) int arg0) {
		if (Static570.anInt9273 == 1) {
			Static562.anInt9184 = arg0;
		} else if (Static570.anInt9273 == 2 || Static570.anInt9273 == 3) {
			Static204.anInt3748 = arg0;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Z")
	public static boolean method7024() {
		try {
			@Pc(12) Class47 local12 = new Class47();
			@Pc(17) byte[] local17 = local12.method1396(Static139.aByteArray32);
			Static251.method3879(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIZI)V")
	public static void method7025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static395.anInt6904 <= arg1 && Static561.anInt2703 >= arg1) {
			@Pc(19) int local19 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg0);
			@Pc(25) int local25 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg3);
			Static297.method4421(local25, arg1, arg2, local19);
		}
	}
}

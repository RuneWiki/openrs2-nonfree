import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
	public static int anInt1235;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
	public static int anInt1234 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public static void method1061() {
		if (Static43.aBoolean75) {
			return;
		}
		if (Static236.aBoolean408) {
			Static198.aFloat41 = (int) Static198.aFloat41 + 47 & 0xFFFFFFF0;
		} else {
			Static188.aFloat39 += (12.0F - Static188.aFloat39) / 2.0F;
		}
		Static43.aBoolean75 = true;
		Static230.aBoolean329 = true;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)V")
	public static void method1062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static150.method2607(false);
		Static61.anInt2996 = arg0;
		Static41.anInt1020 = arg2;
		Static195.method3279(arg1);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!jd;Lclient!jd;Z)Lclient!nk;")
	public static Class2_Sub3_Sub5 method1064(@OriginalArg(0) int arg0, @OriginalArg(2) Class84 arg1, @OriginalArg(3) Class84 arg2) {
		return Static288.method4789(0, arg0, arg1) ? Static114.method1193(arg2.method2127(0, arg0)) : null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Z")
	public static boolean method1065(@OriginalArg(0) int arg0) {
		Static65.anInt1459 = arg0 + 1 & 0xFFFF;
		Static156.aBoolean443 = true;
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)Lclient!w;")
	public static Class179 method1067(@OriginalArg(0) int arg0) {
		@Pc(18) Class179 local18 = (Class179) Static146.aClass46_25.method1074((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static124.aClass84_52.method2127(arg0, 3);
		local18 = new Class179();
		if (local28 != null) {
			local18.method4725(new Class2_Sub26(local28));
		}
		Static146.aClass46_25.method1071(local18, (long) arg0);
		return local18;
	}
}

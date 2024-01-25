import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!mv;")
	public static Class229 aClass229_97;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	public static int anInt6931;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "F")
	public static float aFloat188;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt6928 = -1;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
	public static int anInt6937 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[Lclient!ps;B)V")
	public static void method5676(@OriginalArg(0) int arg0, @OriginalArg(1) Class273[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class273 local13 = arg1[local7];
			if (local13 != null) {
				if (local13.anInt6868 == 0) {
					if (local13.aClass273Array2 != null) {
						method5676(arg0, local13.aClass273Array2);
					}
					@Pc(34) Class2_Sub33 local34 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local13.anInt6810);
					if (local34 != null) {
						Static134.method1813(arg0, local34.anInt5981);
					}
				}
				@Pc(50) Class2_Sub10 local50;
				if (arg0 == 0 && local13.anObjectArray3 != null) {
					local50 = new Class2_Sub10();
					local50.aClass273_4 = local13;
					local50.anObjectArray1 = local13.anObjectArray3;
					Static566.method7398(local50);
				}
				if (arg0 == 1 && local13.anObjectArray11 != null) {
					if (local13.anInt6800 >= 0) {
						@Pc(75) Class273 local75 = Static594.method7731(local13.anInt6810);
						if (local75 == null || local75.aClass273Array2 == null || local13.anInt6800 >= local75.aClass273Array2.length || local75.aClass273Array2[local13.anInt6800] != local13) {
							continue;
						}
					}
					local50 = new Class2_Sub10();
					local50.aClass273_4 = local13;
					local50.anObjectArray1 = local13.anObjectArray11;
					Static566.method7398(local50);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Z")
	public static boolean method5678(@OriginalArg(0) int arg0) {
		if (arg0 == 45 || arg0 == 25 || arg0 == 5 || arg0 == 8 || arg0 == 51) {
			return true;
		} else {
			return arg0 == 3 || arg0 == 1010;
		}
	}
}

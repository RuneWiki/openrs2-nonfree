import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!no", name = "J", descriptor = "I")
	public static int anInt4802;

	@OriginalMember(owner = "client!no", name = "E", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_140 = new Class107(105, 3);

	@OriginalMember(owner = "client!no", name = "L", descriptor = "I")
	public static int anInt4804 = 503;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "(I)V")
	public static void method3987() {
		Static155.aClass251Array1 = null;
		Static35.method5795(0, Static34.anInt715, Static407.anInt6564, -1, 0, Static95.anInt1971, 0, 0);
		if (Static155.aClass251Array1 != null) {
			Static132.method2290(-1412584499, 0, Static338.anInt5726, Static155.aClass251Array1, Static34.anInt715, Static41.anInt856, 0, Static377.aClass251_10.anInt6731, Static95.anInt1971);
			Static155.aClass251Array1 = null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIBIIII)I")
	public static int method3989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(6) int local6 = arg2;
			arg2 = arg0;
			arg0 = local6;
		}
		@Pc(18) int local18 = arg1 & 0x3;
		if (local18 == 0) {
			return arg4;
		} else if (local18 == 1) {
			return 1 + 7 - arg2 - arg5;
		} else if (local18 == 2) {
			return 1 + 7 - arg0 - arg4;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)I")
	public static int method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static364.anIntArray547[arg0 & 0x3] : Static142.anIntArray515[arg0 & 0x3];
	}
}

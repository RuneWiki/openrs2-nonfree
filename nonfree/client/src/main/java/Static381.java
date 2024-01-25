import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_116 = new Class337(44, 7);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZIIII)Z")
	public static boolean method5595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static437.aBoolean537 || !Static631.aBoolean753) {
			return false;
		} else if (Static192.anInt3358 < 100) {
			return false;
		} else if (Static463.method6855(arg1, arg0, arg2)) {
			@Pc(26) int local26 = arg0 << Static115.anInt2156;
			@Pc(35) int local35 = arg2 << Static115.anInt2156;
			if (Static475.method7024(Static302.anInt5267, local35, Static11.aClass61Array1[arg1].method8580(arg2, arg0), Static302.anInt5267, local26, arg3)) {
				Static81.anInt1682++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5596(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}

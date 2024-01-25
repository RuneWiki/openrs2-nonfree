import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public static int anInt3509;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
	public static int method3081() {
		if (Static526.aBoolean669) {
			return 6;
		} else if (Static133.aClass5_Sub5_Sub19_2 == null) {
			return 0;
		} else {
			@Pc(24) int local24 = Static133.aClass5_Sub5_Sub19_2.anInt9210;
			if (Static169.method2466(local24)) {
				return 1;
			} else if (Static30.method493(local24)) {
				return 2;
			} else if (Static408.method6016(local24)) {
				return 3;
			} else if (Static74.method1184((byte) 127, local24)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)Z")
	public static boolean method3082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static52.method790(arg1, arg0) || Static552.method7996(arg0, arg1);
	}
}

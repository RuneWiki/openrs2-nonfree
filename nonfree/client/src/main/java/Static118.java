import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
	public static int anInt2474 = 0;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	public static int anInt2486 = 0;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method2107() {
		Static286.method4394();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static240.aClass118Array1[local8].method3038();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
	public static void method2110() {
		Static226.aClass187_114.method4530();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2111(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < Static72.anInt5402; local13++) {
			if (arg0.equalsIgnoreCase(Static314.aStringArray2[local13])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
	public static void method2112() {
		Static236.aClass187_119.method4525();
	}
}

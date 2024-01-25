import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
	public static int anInt7561;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray33;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)Z")
	public static boolean method6183(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(Z)V")
	public static void method6185() {
		Static393.method5432(10);
		Static235.method3435();
		System.gc();
	}

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "(I)V")
	public static void method6186() {
		Static369.aClass63_1.method4635();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static64.aLongArray4[local10] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static126.aLongArray6[local27] = 0L;
		}
		Static345.anInt5821 = 0;
	}
}

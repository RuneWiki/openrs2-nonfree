import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
	public static int anInt2275;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public static int anInt2264 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)Lclient!e;")
	public static Class58 method1786(@OriginalArg(0) int arg0) {
		@Pc(8) Class58[] local8 = Static380.method4857();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(24) Class58 local24 = local8[local10];
			if (local24.anInt1536 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method1791() {
		Static34.method589();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static383.aClass247Array1[local13].method5261();
		}
		Static390.method4942();
		Static336.method4290();
		System.gc();
	}
}

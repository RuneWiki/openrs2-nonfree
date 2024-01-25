import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt6126;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method4841() {
		Static390.aClass167_42.method3961();
		Static456.aClass167_47.method3961();
		Static499.aClass167_43.method3961();
		Static349.aClass167_33.method3961();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lclient!kga;")
	public static Class178 method4847(@OriginalArg(0) int arg0) {
		@Pc(8) Class178[] local8 = Static98.method1901();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class178 local16 = local8[local10];
			if (arg0 == local16.anInt5665) {
				return local16;
			}
		}
		return null;
	}
}

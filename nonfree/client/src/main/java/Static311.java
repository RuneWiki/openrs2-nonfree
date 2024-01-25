import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static311 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	public static int anInt5006;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Z")
	public static boolean method4221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
	public static void method4222(@OriginalArg(0) boolean arg0) {
		Static83.method1184(Static153.anInt2747, arg0, Static38.anInt777, Static511.anInt8548);
	}
}

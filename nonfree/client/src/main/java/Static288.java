import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Z")
	public static boolean aBoolean515;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!hg;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
	public static int anInt5842;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
	public static int anInt5845;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	public static volatile int anInt5834 = 0;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method4930() {
		@Pc(10) Class154 local10 = Static339.aClass154_103;
		synchronized (Static339.aClass154_103) {
			Static339.aClass154_103.method4219();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)Z")
	public static boolean method4932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static348.aByteArrayArrayArray11[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZZ)V")
	public static void method4933(@OriginalArg(1) boolean arg0) {
		Static142.anInt3180++;
		Static315.method1381();
		if (arg0) {
			Static28.anInt5938++;
			Static308.method5553();
		}
	}
}

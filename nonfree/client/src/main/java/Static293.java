import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
	public static int anInt5314;

	@OriginalMember(owner = "client!kw", name = "B", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!kw", name = "C", descriptor = "[I")
	public static int[] anIntArray372 = new int[1];

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)V")
	public static void method4398(@OriginalArg(1) int arg0) {
		Static289.method4357();
		@Pc(11) int local11 = Static146.aClass7_1.method171(arg0).anInt3903;
		if (local11 == 0) {
			return;
		}
		@Pc(20) int local20 = Static70.aClass78_1.anIntArray104[arg0];
		if (local11 == 5) {
			Static224.anInt4203 = local20;
		}
		if (local11 == 6) {
			Static240.anInt1911 = local20;
		}
	}
}

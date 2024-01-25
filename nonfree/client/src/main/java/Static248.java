import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	public static int anInt4878 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)V")
	public static void method4497(@OriginalArg(1) int arg0) {
		Static313.anInt6327 = arg0;
		@Pc(7) Class119 local7 = Static217.aClass119_128;
		synchronized (Static217.aClass119_128) {
			Static217.aClass119_128.method3304();
		}
		local7 = Static162.aClass119_99;
		synchronized (Static162.aClass119_99) {
			Static162.aClass119_99.method3304();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[I[J)V")
	public static void method4498(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static250.method4557(arg0, arg1, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method4499() {
		Static117.anInt2590 = 0;
		Static91.aClass216_22.method5991();
		Static29.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(CI)Z")
	public static boolean method4500(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public static void method4501() {
		Static324.aClass119_198.method3304();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
	public static void method4502(@OriginalArg(1) int arg0) {
		Static203.anInt3379 = 100;
		Static104.anInt5551 = 3;
		Static20.anInt434 = arg0;
		Static52.anInt1119 = -1;
	}
}

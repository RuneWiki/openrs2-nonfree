import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "Z")
	public static boolean aBoolean100;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
	public static int anInt1369 = 0;

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
	public static int anInt1372 = 0;

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "Z")
	public static boolean aBoolean102 = true;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	public static void method1017() {
		Static22.aClass198_18.method5202(50);
		Static242.aClass198_223.method5202(50);
		Static263.aClass198_252.method5202(50);
		Static10.aClass198_10.method5202(50);
		Static224.aClass198_164.method5202(50);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)V")
	public static void method1020(@OriginalArg(0) int arg0) {
		Static6.anInt176 = arg0;
		@Pc(7) Class198 local7 = Static288.aClass198_207;
		synchronized (Static288.aClass198_207) {
			Static288.aClass198_207.method5213();
		}
	}
}

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "Lclient!vb;")
	public static Class84 aClass84_13 = new Class84();

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1048 = Static38.method685("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "[I")
	public static int[] anIntArray352 = new int[] { 14, 26, 34, 49, 57, 23, 40, 33 };

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "[Lclient!jc;")
	public static Class38[] aClass38Array1 = new Class38[16];

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
	public static int anInt3554 = 0;

	@OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
	public static int anInt3559 = 0;

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "Z")
	public static volatile boolean aBoolean145 = true;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
	public static void method2345() {
		if (Static74.aClass46_1 != null) {
			@Pc(3) Class46 local3 = Static74.aClass46_1;
			synchronized (Static74.aClass46_1) {
				Static74.aClass46_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
	public static void method2346() {
		aClass84_13 = null;
		aClass6_1048 = null;
		aShortArrayArray6 = null;
		anIntArray352 = null;
		aClass38Array1 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "Lclient!pm;")
	public static Class158 aClass158_3;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Z")
	public static boolean aBoolean353 = true;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "Lclient!ea;")
	public static final Class4_Sub7_Sub1 aClass4_Sub7_Sub1_2 = new Class4_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "[I")
	public static int[] anIntArray364 = new int[2];

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString150 = "M";

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!am;I)V")
	public static void method3577(@OriginalArg(0) Class11 arg0) {
		Static58.anInt1260 = arg0.method301("titlebg");
		Static186.anInt5633 = arg0.method301("logo");
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public static void method3578(@OriginalArg(1) int arg0) {
		Static93.anInt2053 = arg0;
		@Pc(12) Class154 local12 = Static13.aClass154_5;
		synchronized (Static13.aClass154_5) {
			Static13.aClass154_5.method4219();
		}
	}
}

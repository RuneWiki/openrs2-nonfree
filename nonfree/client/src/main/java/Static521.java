import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
	public static int anInt8752;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Z")
	public static boolean aBoolean617 = false;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_103 = new Class37();

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "Lclient!uda;")
	public static final Class292 aClass292_14 = new Class292(1);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
	public static void method7164(@OriginalArg(0) int arg0) {
		Static155.anInt2827 = arg0;
		@Pc(7) Class313 local7 = Static286.aClass313_31;
		synchronized (Static286.aClass313_31) {
			Static286.aClass313_31.method7398();
		}
	}
}

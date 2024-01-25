import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!pda", name = "R", descriptor = "I")
	public static int anInt7951;

	@OriginalMember(owner = "client!pda", name = "L", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_166 = new Class215(28, -2);

	@OriginalMember(owner = "client!pda", name = "P", descriptor = "Z")
	public static volatile boolean aBoolean570 = true;

	@OriginalMember(owner = "client!pda", name = "Q", descriptor = "[I")
	public static final int[] anIntArray507 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!pda", name = "f", descriptor = "(I)V")
	public static void method6785() {
		if (Static305.aClass107_5 != Static193.aClass107_2) {
			try {
				Static646.method1788(Static30.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!pda", name = "g", descriptor = "(I)V")
	public static void method6786() {
		Static542.anInt9759 = -1;
		Static339.anInt6841 = -1;
		Static104.anInt2861 = -1;
		Static566.anInt10156 = 0;
	}
}

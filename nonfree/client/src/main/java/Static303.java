import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_146 = new Class150(55, -1);

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	public static int anInt5998 = -1;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	public static int anInt5999 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method4987() {
		Static384.anInt7374 = -1;
		Static40.anInt919 = -1;
		Static219.anInt4147 = 0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I[SI)[S")
	public static short[] method4988(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static553.method2530(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method4990() {
		if (Static134.aClass199_4 != Static357.aClass199_7) {
			try {
				Static555.method5217(Static263.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}
}

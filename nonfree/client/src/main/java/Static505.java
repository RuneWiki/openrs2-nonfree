import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "Lclient!ha;")
	public static Class12 aClass12_21;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_61 = new Class316(260);

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "Z")
	public static boolean aBoolean590 = false;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7293(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class1_Sub1_Sub13 local13 = Static476.method6225(2, arg0);
		local13.method4919();
		local13.aString54 = arg1;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZJ)V")
	public static void method7295(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static250.method4237(arg0 - 1L);
			Static250.method4237(1L);
		} else {
			Static250.method4237(arg0);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "()V")
	public static void method7296() {
		Static171.method3325(Static538.anInt9338);
	}
}

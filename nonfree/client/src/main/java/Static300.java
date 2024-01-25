import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
	public static int anInt5494;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "Lclient!hs;")
	public static final Class136 aClass136_80 = new Class136(4, 1);

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
	public static int anInt5490 = 0;

	@OriginalMember(owner = "client!lp", name = "J", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)V")
	public static void method4533(@OriginalArg(1) int arg0) {
		Static560.anInt9760 = arg0;
		@Pc(7) Class330 local7 = Static129.aClass330_17;
		synchronized (Static129.aClass330_17) {
			Static129.aClass330_17.method7688();
		}
	}
}

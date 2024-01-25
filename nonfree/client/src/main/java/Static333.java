import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
	public static int anInt6232 = 0;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_314 = new Class305(81, 3);

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "Lclient!ft;")
	public static final Class107 aClass107_5 = new Class107();

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z")
	public static boolean method5657(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	public static void method5658() {
		@Pc(5) Class277 local5 = Static332.aClass277_47;
		synchronized (Static332.aClass277_47) {
			Static332.aClass277_47.method7026();
		}
	}
}

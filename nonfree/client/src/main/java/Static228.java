import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "Lclient!rt;")
	public static Class324 aClass324_7;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "B")
	public static byte aByte73 = -6;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public static void method4166() {
		@Pc(1) Class22 local1 = Static68.aClass22_7;
		synchronized (Static68.aClass22_7) {
			Static68.aClass22_7.method473();
		}
		local1 = Static522.aClass22_48;
		synchronized (Static522.aClass22_48) {
			Static522.aClass22_48.method473();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZC)Z")
	public static boolean method4167(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}

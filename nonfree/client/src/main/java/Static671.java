import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static671 {

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "[I")
	public static final int[] anIntArray620 = new int[1024];

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)Lclient!pq;")
	public static Class283 method9248() {
		try {
			return (Class283) Class.forName("uc").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}
}

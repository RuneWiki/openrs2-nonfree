import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!st", name = "j", descriptor = "Lclient!lba;")
	public static final Class218 aClass218_41 = new Class218(64);

	@OriginalMember(owner = "client!st", name = "i", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_178 = new Class225(13, -2);

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BII)Z")
	public static boolean method8184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)Lclient!sm;")
	public static Class342 method8185() {
		try {
			return (Class342) Class.forName("wha").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_14 = new Class183(3, 7);

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!la;")
	public static final Class136 aClass136_163 = new Class136(67, 19);

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!la;")
	public static final Class136 aClass136_164 = new Class136(35, -1);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method4879(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static181.aBoolean373) {
			try {
				@Pc(23) Class207 local23 = (Class207) Class.forName("Class207_Sub1").getDeclaredConstructor().newInstance();
				local23.method6072(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static181.aBoolean373 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method4880(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static79.anInt1430; local19++) {
			if (arg0.equalsIgnoreCase(Static331.aStringArray45[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static141.aStringArray14[local19])) {
				return true;
			}
		}
		return false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B[BZ)Ljava/lang/Object;")
	public static Object method6489(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static407.aBoolean570) {
			try {
				@Pc(18) Class18 local18 = (Class18) Class.forName("Class18_Sub1").getDeclaredConstructor().newInstance();
				local18.method265(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static407.aBoolean570 = true;
			}
		}
		return arg0;
	}
}

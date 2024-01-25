import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_8 = new Class220(13, 0, 1, 0);

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_154 = new Class158("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method4546(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static81.aClass158_47.method3594(Static365.anInt6682) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static416.aClass158_198.method3594(Static365.anInt6682) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
	public static Object method4547(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static80.aBoolean510) {
			try {
				@Pc(18) Class19 local18 = (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
				local18.method5154(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static80.aBoolean510 = true;
			}
		}
		return arg0;
	}
}

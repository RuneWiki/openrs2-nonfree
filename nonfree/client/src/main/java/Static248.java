import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Z")
	public static boolean aBoolean378 = true;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_171 = new Class18(28, 3);

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_175 = new Class106(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method4697(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static222.method4132(arg1, arg0, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method4698(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static195.anInt3948; local16++) {
			if (arg0.equalsIgnoreCase(Static247.aStringArray29[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static191.aClass11_Sub2_Sub6_Sub1_4.aString63);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(CB)Z")
	public static boolean method4699(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Static246.aCharArray46;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(45) char local45 = local37[local39];
				if (local45 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}

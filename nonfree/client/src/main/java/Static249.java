import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static249 {

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_66 = new Class241(19, -1);

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "J")
	public static long aLong147 = 0L;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(III)Z")
	public static boolean method4344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}

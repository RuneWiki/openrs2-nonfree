import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "[[[Lclient!ui;")
	public static Class227[][][] aClass227ArrayArrayArray7;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_181 = new Class41(31, 3);

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
	public static int anInt5974 = 0;

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
	public static int anInt5975 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IC)C")
	public static char method5189(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}

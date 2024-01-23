import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!hc;")
	public static Class51 aClass51_65;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "[I")
	public static int[] anIntArray341;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "F")
	public static float aFloat40 = 0.0F;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!lc;")
	public static Class79 aClass79_29 = new Class79(200);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)J")
	public static long method3337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass148_1 == null ? 0L : local7.aClass148_1.aLong181;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3338(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IC)C")
	public static char method3340(@OriginalArg(1) char arg0) {
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

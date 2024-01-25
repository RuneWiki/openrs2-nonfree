import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "Lclient!rv;")
	public static Class255 aClass255_2;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_4 = new Class231(20);

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "Z")
	public static boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "Lclient!ica;")
	public static final Class127 aClass127_8 = new Class127(16);

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)I")
	public static int method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(30) int local30 = 255 - arg2;
		return (((arg1 & 0xFF00) * local30 & 0xFF0000 | (arg1 & 0xFF00FF) * local30 & 0xFF00FF00) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(CII)I")
	public static int method553(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}

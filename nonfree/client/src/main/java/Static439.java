import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!qj", name = "z", descriptor = "Lclient!mv;")
	public static Class229 aClass229_100;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_118 = new Class349(95, -1);

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "J")
	public static long aLong193 = 0L;

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_119 = new Class349(8, 0);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method5762(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(18) int local18 = Static161.method5441(arg0, arg1);
		@Pc(23) String[] local23 = new String[local18 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg0.charAt(local33) != arg1; local33++) {
			}
			local23[local25++] = arg0.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local18] = arg0.substring(local27);
		return local23;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!mv;B)V")
	public static void method5763(@OriginalArg(0) Class229 arg0) {
		Static270.aClass229_64 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
	public static void method5764() {
		Static124.aClass21_95.method314();
	}
}

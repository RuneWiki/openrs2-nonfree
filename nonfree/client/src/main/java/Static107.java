import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dv", name = "ed", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_13 = new Class112(260);

	@OriginalMember(owner = "client!dv", name = "vd", descriptor = "Lclient!sga;")
	public static final Class307 aClass307_15 = new Class307(16);

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method2685(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(18) int local18 = Static262.method4868(arg0, arg1);
		@Pc(23) String[] local23 = new String[local18 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local18; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg0 != arg1.charAt(local33); local33++) {
			}
			local23[local25++] = arg1.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local18] = arg1.substring(local27);
		return local23;
	}
}

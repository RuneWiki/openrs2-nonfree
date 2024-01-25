import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!um;")
	public static Class243 aClass243_45;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_18 = new Class194(15, 3);

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_29 = new Class129(59, 12);

	@OriginalMember(owner = "client!df", name = "j", descriptor = "S")
	public static short aShort15 = 256;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[128][128];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lclient!em;")
	public static Class2_Sub4 method1080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub4_2;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method1083(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static63.method996(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local19; arg1.charAt(local33) != arg0; local33++) {
			}
			local15[local17++] = arg1.substring(local19, local33);
			local19 = local33 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}
}

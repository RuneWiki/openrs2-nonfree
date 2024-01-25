import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!di", name = "F", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12;

	@OriginalMember(owner = "client!di", name = "I", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_23 = new Class96("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZCLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method1050(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static183.method2944(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0 != arg1.charAt(local25); local25++) {
			}
			local15[local17++] = arg1.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}
}

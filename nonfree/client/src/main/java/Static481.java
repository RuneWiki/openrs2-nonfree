import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!ro;")
	public static Class306 aClass306_4;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
	public static int anInt8180;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!ht;")
	public static final Class151 aClass151_8 = new Class151();

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method7093(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static400.method5976(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg0.charAt(local33) != arg1; local33++) {
			}
			local15[local17++] = arg0.substring(local27, local33);
			local27 = local33 + 1;
		}
		local15[local10] = arg0.substring(local27);
		return local15;
	}
}

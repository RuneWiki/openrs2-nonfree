import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!laa", name = "r", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!laa", name = "w", descriptor = "Lclient!qq;")
	public static Class269 aClass269_7;

	@OriginalMember(owner = "client!laa", name = "z", descriptor = "I")
	public static int anInt5497;

	@OriginalMember(owner = "client!laa", name = "B", descriptor = "I")
	public static int anInt5499 = -1;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method4720(@OriginalArg(1) String arg0) {
		return Static105.method2177(16, arg0);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method4721(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static450.method6898(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local19; arg0.charAt(local33) != arg1; local33++) {
			}
			local15[local17++] = arg0.substring(local19, local33);
			local19 = local33 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}
}

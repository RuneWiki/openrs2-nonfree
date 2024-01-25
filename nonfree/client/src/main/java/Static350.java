import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "Lclient!at;")
	public static final Class20 aClass20_27 = new Class20();

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_150 = new Class381(61, -1);

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method5156(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static326.method3785(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(31) int local31 = 0; local31 < local10; local31++) {
			@Pc(35) int local35;
			for (local35 = local19; arg0 != arg1.charAt(local35); local35++) {
			}
			local15[local17++] = arg1.substring(local19, local35);
			local19 = local35 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}
}

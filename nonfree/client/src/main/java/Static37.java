import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
	public static int anInt758;

	@OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
	public static int anInt756 = 0;

	@OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
	public static int anInt757 = 0;

	@OriginalMember(owner = "client!cm", name = "R", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method679(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static54.method938(arg0, arg1);
		@Pc(12) int local12 = 0;
		@Pc(17) String[] local17 = new String[local10 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(31) int local31;
			for (local31 = local19; arg1 != arg0.charAt(local31); local31++) {
			}
			local17[local12++] = arg0.substring(local19, local31);
			local19 = local31 + 1;
		}
		local17[local10] = arg0.substring(local19);
		return local17;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)I")
	public static int method680(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}

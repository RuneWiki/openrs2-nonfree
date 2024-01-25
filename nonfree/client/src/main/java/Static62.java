import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "Z")
	public static boolean aBoolean167 = true;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
	public static int anInt2039 = 0;

	@OriginalMember(owner = "client!cc", name = "V", descriptor = "[Lclient!lo;")
	public static final Class2_Sub33[] aClass2_Sub33Array1 = new Class2_Sub33[1024];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(CZLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method1946(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static205.method4074(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local19; arg1.charAt(local30) != arg0; local30++) {
			}
			local15[local17++] = arg1.substring(local19, local30);
			local19 = local30 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}
}

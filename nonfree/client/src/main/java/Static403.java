import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "Z")
	public static boolean aBoolean556 = false;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_14 = new Class316(2, 4, 4, 0);

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)I")
	public static int method6409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) double local15 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(30) double local30 = local22 + Math.random() * (local15 - local22);
		return (int) (Math.pow(2.0D, local30) + 0.5D);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method6410(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static452.method6860(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0.charAt(local25) != arg1; local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "[I")
	public static int[] anIntArray290;

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
	public static int anInt5926;

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_84 = new Class173(52, 4);

	@OriginalMember(owner = "client!lca", name = "z", descriptor = "[I")
	public static final int[] anIntArray292 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method5068(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(19) String local19 = arg2[arg0];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg1 + arg0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg0; local34 < local30; local34++) {
				@Pc(40) String local40 = arg2[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(63) StringBuffer local63 = new StringBuffer(local32);
			for (@Pc(65) int local65 = arg0; local65 < local30; local65++) {
				@Pc(71) String local71 = arg2[local65];
				if (local71 == null) {
					local63.append("null");
				} else {
					local63.append(local71);
				}
			}
			return local63.toString();
		}
	}
}

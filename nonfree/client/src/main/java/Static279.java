import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "[Lclient!xa;")
	public static Class71[] aClass71Array33;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_62 = new Class316(42, 8);

	@OriginalMember(owner = "client!kt", name = "D", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_69 = new Class98(26, -2);

	@OriginalMember(owner = "client!kt", name = "G", descriptor = "Lclient!maa;")
	public static final Class195 aClass195_8 = new Class195("", 14);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method4194(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}

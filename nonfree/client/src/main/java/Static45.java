import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
	public static int anInt993;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	public static int anInt998;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_37 = new Class272(20, -1);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method774(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = Static579.method7686(arg0.charAt(local17)) + (local10 << 5) - local10;
		}
		return local10;
	}
}

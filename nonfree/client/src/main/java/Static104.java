import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dga", name = "A", descriptor = "I")
	public static int anInt2196;

	@OriginalMember(owner = "client!dga", name = "G", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!dga", name = "I", descriptor = "I")
	public static int anInt2201;

	@OriginalMember(owner = "client!dga", name = "L", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!dga", name = "M", descriptor = "I")
	public static int anInt2203;

	@OriginalMember(owner = "client!dga", name = "E", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_10 = new Class279(260);

	@OriginalMember(owner = "client!dga", name = "J", descriptor = "Lclient!bo;")
	public static final Class44 aClass44_2 = new Class44();

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2037(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
	public static int method2039(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1 == arg0.charAt(local17)) {
				local12++;
			}
		}
		return local12;
	}
}

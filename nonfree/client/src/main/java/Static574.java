import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static574 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "J")
	public static long aLong266;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
	public static int[] anIntArray600;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!bp;")
	public static Class39 aClass39_8;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_102 = new Class303(38, 0);

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
	public static final int[] anIntArray599 = new int[256];

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_175 = new Class56(66, 6);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BII)Z")
	public static boolean method7711(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}

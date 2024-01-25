import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static592 {

	@OriginalMember(owner = "client!uaa", name = "n", descriptor = "I")
	public static int anInt10733 = 0;

	@OriginalMember(owner = "client!uaa", name = "p", descriptor = "Lclient!in;")
	public static final Class169 aClass169_250 = new Class169(105, 3);

	@OriginalMember(owner = "client!uaa", name = "q", descriptor = "Z")
	public static boolean aBoolean781 = false;

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(IBI)Z")
	public static boolean method9189(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}

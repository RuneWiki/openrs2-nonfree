import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static356 {

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(JJ)J")
	public static long method5753(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}

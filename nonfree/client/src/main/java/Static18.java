import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[200];

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
	public static int anInt542 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BILclient!pfa;)Lclient!ub;")
	public static Class327 method427(@OriginalArg(1) int arg0, @OriginalArg(2) Class251 arg1) {
		@Pc(15) byte[] local15 = arg1.method5761(arg0);
		return local15 == null ? null : new Class327(local15);
	}
}

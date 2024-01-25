import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
	public static int anInt1044 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLclient!rv;)Lclient!tu;")
	public static Class346 method970(@OriginalArg(1) Class5_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3671();
		return new Class346(local7);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
	public static int anInt4620;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "Z")
	public static boolean aBoolean425 = true;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
	public static int anInt4622 = 1;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	public static int anInt4623 = -2;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([BI)[B")
	public static byte[] method3624(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local13];
		Static459.method3330(arg0, 0, local16, 0, local13);
		return local16;
	}
}

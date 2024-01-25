import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_101 = new Class349(29, 8);

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "Z")
	public static boolean aBoolean472 = true;

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "Z")
	public static boolean aBoolean473 = false;

	@OriginalMember(owner = "client!nga", name = "j", descriptor = "[B")
	public static final byte[] aByteArray59 = new byte[520];

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)I")
	public static int method5078(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}

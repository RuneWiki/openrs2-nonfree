import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Z")
	public static boolean aBoolean141 = false;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	public static void method1759(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub1_Sub5 local16 = Static431.method5935(12, arg0);
		local16.method517();
	}
}

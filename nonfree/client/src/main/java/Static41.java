import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
	public static int anInt810;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
	public static int anInt805 = -60;

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "[B")
	public static final byte[] aByteArray11 = new byte[2048];

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V")
	public static void method700(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub7_Sub5 local13 = Static218.method3780(7, arg0);
		local13.method3062();
	}
}

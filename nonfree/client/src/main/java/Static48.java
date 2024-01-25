import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public static int anInt962;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
	public static int anInt963;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Lclient!em;")
	public static Class68 aClass68_1 = null;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "[I")
	public static final int[] anIntArray73 = new int[25];

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "[B")
	public static final byte[] aByteArray24 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)V")
	public static void method798(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(arg0, 6);
		local8.method4545();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static490 {

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "[I")
	public static final int[] anIntArray459 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "[[B")
	public static final byte[][] aByteArrayArray26 = new byte[1000][];

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "Lclient!gp;")
	public static final Class139 aClass139_8 = new Class139(5, 1);

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "Lclient!gh;")
	public static final Class131 aClass131_17 = new Class131(8, 0, 4, 1);

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "Lclient!hu;")
	public static final Class155 aClass155_4 = new Class155();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)Z")
	public static boolean method7028(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static137 {

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
	public static int anInt2278;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "[I")
	public static final int[] anIntArray165 = new int[64];

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_31 = new Class179(1, 4);

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_3 = new Class168(5, 2);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIB)Z")
	public static boolean method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public static void method1860() {
		Static283.anIntArray542 = Static530.method7340(0.4F);
	}
}

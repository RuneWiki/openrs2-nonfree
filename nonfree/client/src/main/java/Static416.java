import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static416 {

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!mg;")
	public static Class160 aClass160_80;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "[Lclient!l;")
	public static Class17[] aClass17Array16;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!di;")
	public static final Class54 aClass54_100 = new Class54(8, 3);

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_25 = new Class214(12, 2);

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean462 = true;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	public static int anInt6986 = 0;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "[I")
	public static final int[] anIntArray588 = new int[100];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)Z")
	public static boolean method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static335.method771(arg0, arg1) || Static58.method1145(arg0, arg1);
	}
}

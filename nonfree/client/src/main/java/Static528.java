import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static528 {

	@OriginalMember(owner = "client!sl", name = "Eb", descriptor = "I")
	public static int anInt3398;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "Lclient!eo;")
	public static final Class101 aClass101_3 = new Class101();

	@OriginalMember(owner = "client!sl", name = "Ab", descriptor = "Z")
	public static volatile boolean aBoolean262 = false;

	@OriginalMember(owner = "client!sl", name = "Db", descriptor = "I")
	public static int anInt3397 = 0;

	@OriginalMember(owner = "client!sl", name = "Fb", descriptor = "[I")
	public static final int[] anIntArray221 = new int[14];

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static205.method5785(arg1, arg0) | Static534.method7403(arg1, arg0)) & Static241.method4097(arg1, arg0);
	}
}

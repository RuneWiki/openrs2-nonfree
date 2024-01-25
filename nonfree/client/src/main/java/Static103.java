import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static103 {

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "[I")
	public static int[] anIntArray76;

	@OriginalMember(owner = "client!eaa", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
	public static int anInt992 = 0;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "[I")
	public static final int[] anIntArray77 = new int[16];

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "[I")
	public static final int[] anIntArray78 = new int[8];

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
	public static void method907(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static362.method5535(0, arg0, arg1, arg0.length - 1);
	}
}

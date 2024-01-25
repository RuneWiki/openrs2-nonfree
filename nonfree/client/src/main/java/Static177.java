import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static177 {

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "B")
	public static byte aByte111;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "Z")
	public static final boolean aBoolean661 = false;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
	public static final int anInt8813 = 50;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "[I")
	public static final int[] anIntArray532 = new int[anInt8813];

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "[I")
	public static final int[] anIntArray533 = new int[anInt8813];

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
	public static final int[] anIntArray534 = new int[anInt8813];

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "[I")
	public static final int[] anIntArray535 = new int[anInt8813];

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	public static int anInt8812 = 1;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[anInt8813];

	@OriginalMember(owner = "client!gu", name = "r", descriptor = "[I")
	public static final int[] anIntArray536 = new int[anInt8813];

	@OriginalMember(owner = "client!gu", name = "s", descriptor = "[I")
	public static final int[] anIntArray537 = new int[anInt8813];

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIB)Z")
	public static boolean method7120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static346.method5151(arg0, arg1) & Static64.method1033(arg1, arg0);
	}
}

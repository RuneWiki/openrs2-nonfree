import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static457 {

	@OriginalMember(owner = "client!te", name = "Db", descriptor = "I")
	public static int anInt7744;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "I")
	public static int anInt7684 = 0;

	@OriginalMember(owner = "client!te", name = "Ic", descriptor = "Ljava/lang/String;")
	public static String aString65 = "";

	@OriginalMember(owner = "client!te", name = "Pc", descriptor = "I")
	public static int anInt7806 = 0;

	@OriginalMember(owner = "client!te", name = "gd", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!te", name = "Qd", descriptor = "I")
	public static int anInt7857 = 0;

	@OriginalMember(owner = "client!te", name = "ce", descriptor = "I")
	public static int anInt7868 = 1;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(II)I")
	public static int method6652(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}

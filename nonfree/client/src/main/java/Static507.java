import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static507 {

	@OriginalMember(owner = "client!tca", name = "n", descriptor = "Z")
	public static boolean aBoolean585;

	@OriginalMember(owner = "client!tca", name = "q", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!tca", name = "r", descriptor = "I")
	public static int anInt8781;

	@OriginalMember(owner = "client!tca", name = "s", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
	public static int anInt8783 = 0;

	@OriginalMember(owner = "client!tca", name = "y", descriptor = "I")
	public static int anInt8787 = -1;

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(III)Z")
	public static boolean method6860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static251.method5133(arg0, arg1) | (arg1 & 0x2000) != 0 | Static564.method7694(arg0, arg1)) & Static519.method7214(arg0, arg1);
	}
}

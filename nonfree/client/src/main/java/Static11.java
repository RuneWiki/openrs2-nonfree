import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
	public static int anInt5176;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray9 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
	public static int anInt5178 = 0;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
	public static int anInt5182 = 0;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "[J")
	public static long[] aLongArray11 = new long[32];

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "[I")
	public static int[] anIntArray541 = new int[2];

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString178 = "Close";

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString179 = "Checking for updates - ";

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)V")
	public static void method4249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg1, 14);
		local8.method971();
		local8.anInt1132 = arg0;
	}
}

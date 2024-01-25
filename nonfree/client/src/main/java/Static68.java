import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "B")
	public static byte aByte26;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
	public static int anInt1306 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V")
	public static void method1132(@OriginalArg(1) int arg0) {
		Static242.anIntArray425 = new int[arg0];
		Static83.anIntArray721 = new int[arg0];
		Static269.anIntArray445 = new int[arg0];
		Static8.anIntArray700 = new int[arg0];
		Static277.anIntArray450 = new int[arg0];
	}
}

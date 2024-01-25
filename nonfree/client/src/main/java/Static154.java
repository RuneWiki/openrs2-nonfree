import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static154 {

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "Lclient!dm;")
	public static Class85 aClass85_2;

	@OriginalMember(owner = "client!fba", name = "u", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!fba", name = "x", descriptor = "Lclient!od;")
	public static Class3_Sub6_Sub16 aClass3_Sub6_Sub16_2;

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "I")
	public static int anInt2874 = 0;

	@OriginalMember(owner = "client!fba", name = "s", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!fba", name = "w", descriptor = "[I")
	public static final int[] anIntArray192 = new int[2];

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)I")
	public static int method2639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static614.aByteArrayArray23 == null ? 0 : Static614.aByteArrayArray23[arg0][arg1] & 0xFF;
	}
}

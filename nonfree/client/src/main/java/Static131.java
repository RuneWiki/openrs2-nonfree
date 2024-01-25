import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static131 {

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
	public static final int anInt2720 = 50;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "[I")
	public static final int[] anIntArray161 = new int[anInt2720];

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "[I")
	public static final int[] anIntArray163 = new int[anInt2720];

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "[I")
	public static final int[] anIntArray164 = new int[anInt2720];

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "[I")
	public static final int[] anIntArray165 = new int[anInt2720];

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "[I")
	public static final int[] anIntArray166 = new int[anInt2720];

	@OriginalMember(owner = "client!gj", name = "T", descriptor = "[I")
	public static final int[] anIntArray167 = new int[anInt2720];

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "[I")
	public static final int[] anIntArray168 = new int[2048];

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[anInt2720];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Z")
	public static boolean method2042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}

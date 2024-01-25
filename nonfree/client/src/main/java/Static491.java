import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	public static final int anInt8365 = 50;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "[I")
	public static final int[] anIntArray572 = new int[anInt8365];

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "[I")
	public static final int[] anIntArray573 = new int[anInt8365];

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "[I")
	public static final int[] anIntArray574 = new int[anInt8365];

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
	public static int anInt8363 = -1;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "[I")
	public static final int[] anIntArray575 = new int[anInt8365];

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "[I")
	public static final int[] anIntArray576 = new int[anInt8365];

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "[I")
	public static final int[] anIntArray577 = new int[anInt8365];

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[anInt8365];

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
	public static int anInt8369 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)Z")
	public static boolean method7021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Z")
	public static boolean method7024() {
		return Static183.aBoolean337;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "([SZ)[S")
	public static short[] method7029(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static649.method4859(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}

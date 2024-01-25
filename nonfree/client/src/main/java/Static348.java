import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
	public static int anInt6080;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	public static int anInt6087;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
	private static final int[] anIntArray508 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "S")
	public static short aShort84 = 1;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!eh;I)Lclient!qfa;")
	public static Class170_Sub4 method5169(@OriginalArg(0) Class4_Sub9 arg0) {
		return new Class170_Sub4(arg0.method6003(), arg0.method6003(), arg0.method6003(), arg0.method6003(), arg0.method6023(), arg0.method6015());
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)I")
	public static int method5170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static124.anIntArray262[arg0 & 0x3] : anIntArray508[arg0 & 0x3];
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
	public static int anInt6866;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "[I")
	public static final int[] anIntArray544 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "[I")
	public static final int[] anIntArray545 = new int[14];

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method5862(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg1;
			return arg0 ? Static297.method4713(local21) : local21;
		} else if (arg1 instanceof Class184) {
			@Pc(35) Class184 local35 = (Class184) arg1;
			return local35.method6463();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public static void method5866() {
		Static59.aClass203ArrayArray3 = new Class203[Static552.aClass246_253.method5682()][];
		Static267.aClass203ArrayArray2 = new Class203[Static552.aClass246_253.method5682()][];
		Static457.aBooleanArray29 = new boolean[Static552.aClass246_253.method5682()];
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z")
	public static boolean method5868(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}

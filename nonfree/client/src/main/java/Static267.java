import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!rd;")
	public static Class275 aClass275_1;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
	public static int anInt5287;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public static int anInt5280 = 0;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)Z")
	public static boolean method4538(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method4540() {
		@Pc(9) int[] local9 = new int[Static98.aClass203_1.anInt5738];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static98.aClass203_1.anInt5738; local13++) {
			@Pc(20) Class145 local20 = Static98.aClass203_1.method4899(local13);
			if (local20.anInt4422 >= 0 || local20.anInt4433 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static3.anIntArray439 = new int[local11];
		for (@Pc(44) int local44 = 0; local44 < local11; local44++) {
			Static3.anIntArray439[local44] = local9[local44];
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII)V")
	public static void method4543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static376.anInt7071 <= arg2 && arg4 <= Class179_Sub2.lb && arg3 >= Static96.anInt2302 && Static289.anInt5545 >= arg0) {
			Static122.method2409(arg2, arg0, arg1, arg3, arg4);
		} else {
			Static258.method4483(arg0, arg3, arg1, arg2, arg4);
		}
	}
}

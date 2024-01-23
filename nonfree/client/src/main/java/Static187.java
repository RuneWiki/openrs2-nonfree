import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "[I")
	public static int[] anIntArray397;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!ek;")
	public static Class42 aClass42_55;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
	public static int anInt3990;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!ek;")
	public static Class42 aClass42_56;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	public static int anInt3993;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V")
	public static void method3281(@OriginalArg(0) int arg0) {
		Static166.anInt3676 = arg0;
		Static225.anInt5333 = 100;
		Static122.anInt2705 = -1;
		Static10.anInt171 = 3;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ek;III)Z")
	public static boolean method3282(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg0.method1256(arg1, arg2);
		if (local9 == null) {
			return false;
		} else {
			Static276.method4329(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)[B")
	public static byte[] method3283(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static323.method3554(arg0, 0, local14, 0, local11);
		return local14;
	}
}

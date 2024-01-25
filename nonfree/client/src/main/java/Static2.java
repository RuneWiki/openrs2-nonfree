import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "L", descriptor = "Lclient!tq;")
	public static Class191 aClass191_5;

	@OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
	public static int anInt73;

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
	public static int anInt62 = -1;

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
	public static int anInt65 = 127;

	@OriginalMember(owner = "client!ab", name = "S", descriptor = "[I")
	public static final int[] anIntArray2 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ab", name = "U", descriptor = "[[B")
	public static final byte[][] aByteArrayArray1 = new byte[1000][];

	@OriginalMember(owner = "client!ab", name = "gb", descriptor = "[I")
	public static final int[] anIntArray3 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method55(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static24.method731(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)Lclient!wc;")
	public static Class2_Sub11_Sub21 method57(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub11_Sub21 local10 = (Class2_Sub11_Sub21) Static53.aClass179_2.method5092((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static339.aClass191_217.method5459(11, arg0);
		local10 = new Class2_Sub11_Sub21();
		if (local20 != null) {
			local10.method5925(new Class2_Sub10(local20));
		}
		Static53.aClass179_2.method5085(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IB)V")
	public static void method58(@OriginalArg(0) int arg0) {
		if (Static237.anInt4541 == 0) {
			Static271.aClass2_Sub3_Sub3_3.method1751(arg0);
		} else {
			Static122.anInt4369 = arg0;
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(IB)V")
	public static void method59() {
		Static151.aClass119_95.method3315(5);
	}
}

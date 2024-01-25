import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!rr;")
	public static Class173 aClass173_3;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_67 = new Class93("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "S")
	public static short aShort51 = 205;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
	public static final int[] anIntArray275 = new int[200];

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray99 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method3029() {
		Static17.aClass199_1.method5750();
		Static216.aClass54_3.method1660();
		Static316.aClass54_10.method1660();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lclient!sg;")
	public static Class181 method3031(@OriginalArg(1) int arg0) {
		@Pc(12) Class181 local12 = (Class181) Static151.aClass119_95.method3311((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static187.aClass191_120.method5459(30, arg0);
		local12 = new Class181();
		if (local22 != null) {
			local12.method5112(new Class2_Sub10(local22), arg0);
		}
		Static151.aClass119_95.method3308(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!tq;)V")
	public static void method3032(@OriginalArg(1) Class191 arg0) {
		Static124.aClass191_143 = arg0;
		Static285.anInt5783 = Static124.aClass191_143.method5443(15);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Lclient!tn;")
	public static Class62_Sub5 method3034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass62_Sub5_2;
	}
}

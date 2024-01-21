import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "[I")
	public static int[] anIntArray88;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_355 = Static56.method816("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!ic;")
	private static Class34 aClass34_356 = Static56.method816("FULL");

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_357 = aClass34_356;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!ic;")
	private static Class34 aClass34_358 = Static56.method816("Ok");

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_359 = Static56.method816("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Lclient!ic;")
	public static Class34 aClass34_360 = Static56.method816("huffman");

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_361 = aClass34_358;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method453(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static116.anInt2609 > 0) {
			local21 = Static44.aByteArrayArray27[--Static116.anInt2609];
			Static44.aByteArrayArray27[Static116.anInt2609] = null;
			return local21;
		} else if (arg0 == 5000 && Static40.anInt978 > 0) {
			local21 = Static32.aByteArrayArray21[--Static40.anInt978];
			Static32.aByteArrayArray21[Static40.anInt978] = null;
			return local21;
		} else if (arg0 == 30000 && Static45.anInt1080 > 0) {
			local21 = Static133.aByteArrayArray70[--Static45.anInt1080];
			Static133.aByteArrayArray70[Static45.anInt1080] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method454() {
		aClass34_358 = null;
		aClass34_361 = null;
		aClass34_359 = null;
		aClass34_356 = null;
		aClass34_357 = null;
		aClass34_355 = null;
		aClass34_360 = null;
		anIntArray88 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static100.method1458(arg4)) {
			Static30.method523(arg3, arg5, arg6, -1, arg0, arg2, arg1, Static44.aClass8_Sub24ArrayArray1[arg4]);
		}
	}
}

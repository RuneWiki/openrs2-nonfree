import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static404 {

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_346 = new Class12(0, 5);

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "[S")
	public static short[] aShortArray114 = new short[256];

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "[I")
	public static final int[] anIntArray530 = new int[5];

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "Z")
	public static boolean aBoolean594 = false;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public static void method5494() {
		Static428.anInt7488 = -1;
		Static289.aClass109_67 = null;
		Static105.anInt2081 = 0;
		Static67.aBoolean107 = false;
		Static386.anInt6855 = 2;
		Static85.anInt1527 = -1;
		Static25.anInt424 = 1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBI)Z")
	public static boolean method5495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static60.method911(arg1, arg0) | (arg0 & 0x10000) != 0 || Static78.method1148(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static153.method3783(arg0, arg1);
		}
	}
}

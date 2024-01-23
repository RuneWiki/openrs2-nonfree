import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!id", name = "P", descriptor = "I")
	public static int anInt2145;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "[I")
	public static int[] anIntArray222 = new int[100];

	@OriginalMember(owner = "client!id", name = "N", descriptor = "S")
	public static short aShort24 = 32767;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "I")
	public static int anInt2150 = -1;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(II)V")
	public static void method1875() {
		Static274.aClass98_44.method2565(5);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!rn;ZLclient!rn;)V")
	public static void method1876(@OriginalArg(0) Class155 arg0, @OriginalArg(2) Class155 arg1) {
		Static204.aClass155_86 = arg1;
		Static285.aClass155_116 = arg0;
		Static82.anInt1543 = Static204.aClass155_86.method4131(3);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!rn;B)V")
	public static void method1877(@OriginalArg(0) Class155 arg0) {
		Static23.aClass155_18 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!rn;I)Z")
	public static boolean method1878(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) byte[] local13 = arg1.method4121(arg2, arg0);
		if (local13 == null) {
			return false;
		} else {
			Static41.method568(local13);
			return true;
		}
	}
}

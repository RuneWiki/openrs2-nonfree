import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static47 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "[I")
	public static final int[] anIntArray92 = new int[5];

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "[I")
	public static final int[] anIntArray93 = new int[4];

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	public static int anInt1012 = 0;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	public static int anInt1015 = 0;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
	public static int anInt1016 = 0;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
	public static int anInt1017 = -1;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Z")
	public static boolean method787() {
		return Static204.aBoolean321;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public static void method788() {
		Static255.aBoolean352 = false;
		Static482.method6578(Static32.anInt717, Static50.anInt1065, Static324.anInt5822, Static343.anInt6039);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BILclient!lk;I)V")
	public static void method789(@OriginalArg(1) int arg0, @OriginalArg(2) Class203 arg1, @OriginalArg(3) int arg2) {
		if (Static265.aClass203_82 != null || Static255.aBoolean352 || (arg1 == null || Static557.method7420(arg1) == null)) {
			return;
		}
		Static265.aClass203_82 = arg1;
		Static215.aClass203_73 = Static557.method7420(arg1);
		Static419.anInt8466 = arg2;
		Static550.anInt7641 = arg0;
		Static182.anInt3561 = 0;
		Static16.aBoolean22 = false;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	public static int anInt841;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I")
	public static int method726(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I")
	public static int method727() {
		return Static466.aClass276_1.method6059();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!gba;II)V")
	public static void method732(@OriginalArg(0) int arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) int arg2) {
		if (Static287.aClass115_12 != null || Static325.aBoolean431 || (arg1 == null || Static109.method2320(arg1) == null)) {
			return;
		}
		Static287.aClass115_12 = arg1;
		Static107.aClass115_13 = Static109.method2320(arg1);
		Static563.anInt9432 = arg2;
		Static302.anInt5525 = 0;
		Static399.anInt6953 = arg0;
		Static320.aBoolean429 = false;
	}
}

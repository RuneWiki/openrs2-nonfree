import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static238 {

	@OriginalMember(owner = "client!or", name = "N", descriptor = "[[I")
	public static int[][] anIntArrayArray77;

	@OriginalMember(owner = "client!or", name = "O", descriptor = "I")
	public static int anInt4659;

	@OriginalMember(owner = "client!or", name = "R", descriptor = "Lclient!mo;")
	public static Class143 aClass143_90;

	@OriginalMember(owner = "client!or", name = "H", descriptor = "Lclient!al;")
	public static Class11 aClass11_102 = new Class11(64);

	@OriginalMember(owner = "client!or", name = "Q", descriptor = "I")
	public static int anInt4660 = 0;

	@OriginalMember(owner = "client!or", name = "S", descriptor = "Z")
	public static boolean aBoolean306 = false;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(BI)I")
	public static int method4172(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
	public static void method4173(@OriginalArg(0) boolean arg0) {
		if (Static191.aBoolean245 != arg0) {
			Static191.aBoolean245 = arg0;
			Static327.method5623();
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method4175(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!mo;I)V")
	public static void method4176(@OriginalArg(0) Class143 arg0) {
		Static16.aClass143_11 = arg0;
		Static16.aClass143_11.method3732(35);
	}
}

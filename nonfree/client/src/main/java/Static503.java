import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static503 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public static int anInt8861;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	public static int anInt8873 = 1;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method7355() {
		Static67.method1345(11);
		Static285.method4068();
		System.gc();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZIIZII)V")
	public static void method7357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 ? Static56.aClass14_Sub22_5.aClass21_Sub20_4.method7115() : Static56.aClass14_Sub22_5.aClass21_Sub20_1.method7115()) != 0 && arg5 != 0 && Static4.anInt29 < 50 && arg4 != -1) {
			Static178.aClass393Array1[Static4.anInt29++] = new Class393((byte) (arg3 ? 3 : 2), arg4, arg5, arg2, arg1, 0, arg0, (Class12_Sub2) null);
		}
	}
}

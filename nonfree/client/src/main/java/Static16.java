import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!al", name = "o", descriptor = "Lclient!oj;")
	public static Class243 aClass243_1;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "I")
	public static int anInt491;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V")
	public static void method311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static381.anIntArrayArray44 != null) {
			Static381.anIntArrayArray44[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static544.aShortArrayArray33 != null) {
			Static544.aShortArrayArray33[arg0][arg1] = (short) arg3;
		}
		if (Static435.aByteArrayArray2 != null) {
			Static435.aByteArrayArray2[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public static void method313() {
		Static268.aClass313_63.method6982(5);
	}
}

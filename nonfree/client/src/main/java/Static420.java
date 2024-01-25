import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static420 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public static void method5851() {
		Static130.method2413();
		Static195.aClass169ArrayArray2 = null;
		Static459.aClass41_6 = null;
		Static254.aClass41_4 = null;
		Static182.aClass30_12 = null;
		Static14.aClass41_1 = null;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII)V")
	public static void method5852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static157.aClass185_Sub1_1.anInt5554 != 0 && arg0 != 0 && Static93.anInt2064 < 50 && arg1 != -1) {
			Static121.aClass7Array2[Static93.anInt2064++] = new Class7((byte) 1, arg1, arg0, arg3, arg2, 0);
		}
	}
}

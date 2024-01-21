import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static39 {

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "[Lclient!ge;")
	public static Class32[] aClass32Array1 = new Class32[50];

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "[I")
	public static int[] anIntArray129 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
	public static volatile int anInt1073 = 0;

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "[Lclient!ed;")
	public static Class23[] aClass23Array2 = new Class23[1000];

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "Lclient!ed;")
	public static Class23 aClass23_408 = Static169.method2903("Benutzen");

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	public static void method636() {
		aClass23Array2 = null;
		aClass23_408 = null;
		anIntArray129 = null;
		aClass32Array1 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLclient!ob;)V")
	public static void method659(@OriginalArg(1) Class60 arg0) {
		if (Static54.anInt1547 == arg0.anInt3006) {
			Static98.aBooleanArray12[arg0.anInt2974] = true;
		}
	}
}

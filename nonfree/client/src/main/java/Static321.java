import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "Lclient!jo;")
	public static Class168 aClass168_78;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Z")
	public static boolean aBoolean451 = false;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
	public static int anInt6070 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method5186() {
		for (@Pc(8) int local8 = 0; local8 < Static192.aClass348ArrayArray1.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static192.aClass348ArrayArray1[local8].length; local12++) {
				Static192.aClass348ArrayArray1[local8][local12] = Static393.aClass348_2;
			}
		}
	}
}

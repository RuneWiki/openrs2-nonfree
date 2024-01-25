import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "[I")
	public static int[] anIntArray26;

	@OriginalMember(owner = "client!aba", name = "s", descriptor = "I")
	public static int anInt42;

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "J")
	public static final long aLong4 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_1 = new Class349(13, 6);

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIII)V")
	public static void method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = Static650.aClass2_Sub30_29.aClass11_Sub5_4.method1696(1) * arg1 >> 8;
		if (arg2 == -1 && !Static366.aBoolean494) {
			Static209.method2954();
		} else if (arg2 != -1 && (Static717.anInt10936 != arg2 || !Static156.method2243(0x6 ^ 0xFFFFFFF9)) && local15 != 0 && !Static366.aBoolean494) {
			Static305.method1955(local15, arg2, Static177.aClass254_66, arg0);
			Static321.method4455(3712);
		}
		if (Static717.anInt10936 != arg2) {
			Static429.aClass2_Sub23_Sub5_2 = null;
		}
		Static717.anInt10936 = arg2;
	}
}

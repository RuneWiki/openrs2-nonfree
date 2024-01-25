import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
	public static int anInt2913;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
	public static int anInt2915;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
	public static int anInt2917;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!vha;")
	public static Class366 aClass366_1;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "[I")
	public static final int[] anIntArray190 = new int[3];

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBLclient!ei;)V")
	public static void method2509(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17_Sub1 arg1) {
		Static136.anInt2909 = 0;
		Static252.aBoolean359 = false;
		Static224.method3614(arg1);
		Static14.method367(arg1);
		if (Static252.aBoolean359) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt3378 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt3378 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	public static void method2510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static275.anInt5095 != 0) {
			if (arg0 < 0) {
				for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
					Static264.anIntArray299[local12] = arg1;
				}
			} else {
				Static264.anIntArray299[arg0] = arg1;
			}
		}
		Static191.aClass2_Sub11_Sub1_2.method1528(arg0, arg1);
	}
}

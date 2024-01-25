import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
	public static int anInt7044 = -1;

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "[I")
	public static final int[] anIntArray596 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBI)V")
	public static void method5563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = Static12.aClass79_Sub1_1.anInt4931 * arg1 >> 8;
		if (arg2 == -1 && !Static144.aBoolean238) {
			Static209.method3314();
		} else if (arg2 != -1 && (Static342.anInt5851 != arg2 || !Static283.method1317()) && local15 != 0 && !Static144.aBoolean238) {
			Static391.method3869(local15, arg0, Static186.aClass160_34, arg2);
		}
		Static342.anInt5851 = arg2;
	}
}

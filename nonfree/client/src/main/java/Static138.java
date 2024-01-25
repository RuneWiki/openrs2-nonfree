import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	public static int anInt6325;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "I")
	public static int anInt6334 = 100;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Z")
	public static boolean aBoolean522 = true;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class65[] local8 = Static11.aClass65Array4;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class65 local16 = local8[local10];
			if (local16 != null && local16.anInt1591 == 2) {
				Static28.method489(local16.anInt1588 + (local16.anInt1592 - Static92.anInt1755 << 7), arg0 >> 1, arg3 >> 1, local16.anInt1589 * 2, local16.anInt1585 + (local16.anInt1596 - Static98.anInt1911 << 7));
				if (Static49.anIntArray493[0] > -1 && Static282.anInt3516 % 20 < 10) {
					Static54.aClass8Array3[local16.anInt1587].method4393(arg2 + Static49.anIntArray493[0] - 12, Static49.anIntArray493[1] + -28 + arg1);
				}
			}
		}
	}
}

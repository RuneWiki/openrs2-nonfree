import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
	public static int anInt5917;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
	public static int anInt5912 = -50;

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
	public static int anInt5914 = 0;

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
	public static int anInt5915 = 0;

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "I")
	public static int anInt5916 = 0;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIBII)V")
	public static void method4901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class28_Sub6 local10 = (Class28_Sub6) Static394.aClass156_4.method3776(); local10 != null; local10 = (Class28_Sub6) Static394.aClass156_4.method3783()) {
			if (local10.anInt7468 <= Static26.anInt350) {
				local10.method9022();
			} else {
				Static408.method5985((local10.anInt7465 << 9) + 256, (local10.anInt7467 << 9) + 256, local10.anInt7471 * 2, arg1 >> 1, local10.anInt7470, arg2 >> 1);
				Static231.aClass73_8.method5781(local10.aString61, arg3 + Static665.anIntArray475[1], arg0 + Static665.anIntArray475[0], 0, local10.anInt7469 | 0xFF000000);
			}
		}
	}
}

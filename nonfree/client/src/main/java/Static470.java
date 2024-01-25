import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
	public static int anInt7634;

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_149 = new Class156(97, 0);

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "Z")
	public static boolean aBoolean515 = true;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BIIII)V")
	public static void method6645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class5_Sub1_Sub18 local9 = Static123.method1827((long) arg0, 4);
		local9.method7441();
		local9.anInt8632 = arg2;
		local9.anInt8638 = arg3;
		local9.anInt8635 = arg1;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)V")
	public static void method6647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static233.anInt4001 == 1) {
			Static346.method4441(arg0, arg1, Static660.aClass5_Sub1_Sub13_4);
		} else if (Static233.anInt4001 == 2) {
			if (Static377.aBoolean419) {
				Static325.method4957(Static5.method9220() + arg1, arg0 - -Static194.method8971());
			} else {
				Static325.method4957(arg1, arg0);
			}
		}
		Static660.aClass5_Sub1_Sub13_4 = null;
		Static233.anInt4001 = 0;
	}
}

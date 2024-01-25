import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
	public static int anInt2301 = 0;

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "Z")
	public static boolean aBoolean157 = true;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(III)V")
	public static void method2202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class113 local9 = Static258.aClass113ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static600.anInt9218 = local9.anInt2890;
			Static115.anInt2235 = local9.anInt2892;
			Static46.anInt904 = local9.anInt2896;
		}
		Static349.method4691();
	}
}

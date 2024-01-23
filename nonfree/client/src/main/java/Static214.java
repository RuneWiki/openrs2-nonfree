import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
	public static int anInt4214 = 0;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	public static int anInt4216 = 100;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
	public static int[] anIntArray338 = new int[2];

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)V")
	public static void method3388() {
		Static168.aClass169_164.method4020(5);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZBII)V")
	public static void method3390(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static142.aLong102 = 0L;
		@Pc(8) int local8 = Static230.method3622();
		if (arg3 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (Static181.aString120.startsWith("mac") && arg3 > 0) {
			arg1 = true;
		}
		@Pc(31) boolean local31 = false;
		if (local8 <= 0 != arg3 <= 0) {
			local31 = true;
		}
		if (arg1 && arg3 > 0) {
			local31 = true;
		}
		Static279.method4124(local8, arg1, local31, arg0, arg3, arg2);
	}
}

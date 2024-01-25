import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!rq", name = "E", descriptor = "[I")
	public static final int[] anIntArray504 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!rq", name = "G", descriptor = "[Lclient!dr;")
	public static final Class66[] aClass66Array1 = new Class66[2048];

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "Lclient!em;")
	public static final Class83 aClass83_174 = new Class83(107, 19);

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(III)V")
	public static void method6432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class130 local9 = Static366.aClass130ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static282.anInt5201 = local9.anInt3686;
			Static128.anInt2570 = local9.anInt3687;
			Static176.anInt3262 = local9.anInt3691;
		}
		Static24.method491();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
	public static void method6434(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static85.aByteArrayArrayArray1 = new byte[4][arg0][arg1];
	}
}

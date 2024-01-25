import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "[[[Lclient!wr;")
	public static Class251[][][] aClass251ArrayArrayArray2;

	@OriginalMember(owner = "client!nm", name = "Gb", descriptor = "I")
	public static int anInt4151;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "Lclient!wk;")
	public static final Class246 aClass246_21 = new Class246(8);

	@OriginalMember(owner = "client!nm", name = "Ib", descriptor = "[I")
	public static final int[] anIntArray808 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I")
	public static int method3779() {
		return Static191.anInt3592;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBI)I")
	public static int method3780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static367.method5426(arg1 - 1, arg0 + -1) + Static367.method5426(arg1 - 1, arg0 + 1) + Static367.method5426(arg1 - -1, arg0 + -1) + Static367.method5426(arg1 + 1, arg0 + 1);
		@Pc(70) int local70 = Static367.method5426(arg1, arg0 - 1) + Static367.method5426(arg1, arg0 + 1) + Static367.method5426(arg1 - 1, arg0) + Static367.method5426(arg1 - -1, arg0);
		@Pc(83) int local83 = Static367.method5426(arg1, arg0);
		return local40 / 16 + local70 / 8 + local83 / 4;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
	public static int anInt806;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "Lclient!vc;")
	public static Class207 aClass207_3;

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "Lclient!ir;")
	public static Class100 aClass100_13;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
	public static int anInt809 = 255;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BII)V")
	public static void method664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0 != Static131.anInt2755) {
			Static151.anIntArray211 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static151.anIntArray211[local9] = (local9 << 12) / arg0;
			}
			Static16.anInt519 = arg0 * 32;
			Static167.anInt3460 = arg0 - 1;
			Static131.anInt2755 = arg0;
		}
		if (arg1 == Static182.anInt3888) {
			return;
		}
		if (Static131.anInt2755 == arg1) {
			Static269.anIntArray433 = Static151.anIntArray211;
		} else {
			Static269.anIntArray433 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static269.anIntArray433[local9] = (local9 << 12) / arg1;
			}
		}
		Static351.anInt6821 = arg1 - 1;
		Static182.anInt3888 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
	public static void method666(@OriginalArg(0) int arg0) {
		Static283.anInt4490 = arg0;
		@Pc(7) Class198 local7 = Static218.aClass198_41;
		synchronized (Static218.aClass198_41) {
			Static218.aClass198_41.method5236();
		}
	}
}

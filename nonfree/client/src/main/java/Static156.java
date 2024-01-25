import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "Lclient!eu;")
	public static Class2_Sub21 aClass2_Sub21_2;

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
	public static int anInt2604;

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "[I")
	public static int[] anIntArray195 = new int[1];

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZI)I")
	public static int method2242(@OriginalArg(1) int arg0) {
		@Pc(20) int local20 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (local26 * arg0 >> 12) + 40960;
		return local20 * local34 >> 12;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)Z")
	public static boolean method2243(@OriginalArg(0) int arg0) {
		return Static39.anInt535 == 0 ? Static442.aClass2_Sub23_Sub5_3.method7695() : true;
	}
}

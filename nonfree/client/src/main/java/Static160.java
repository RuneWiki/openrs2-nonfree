import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "[Lclient!sh;")
	public static Class230[] aClass230Array1;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BIII)I")
	public static int method2638(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static2.anInt48 < 100) {
			return -2;
		}
		@Pc(10) int local10 = -2;
		@Pc(12) int local12 = Integer.MAX_VALUE;
		@Pc(17) int local17 = arg1 - Static377.anInt5040;
		@Pc(22) int local22 = arg2 - Static377.anInt5030;
		for (@Pc(27) Class1_Sub28 local27 = (Class1_Sub28) Static377.aClass203_40.method4548(); local27 != null; local27 = (Class1_Sub28) Static377.aClass203_40.method4545()) {
			if (arg0 == local27.anInt4940) {
				@Pc(48) int local48 = local27.anInt4938;
				@Pc(51) int local51 = local27.anInt4936;
				@Pc(61) int local61 = Static377.anInt5030 + local51 | local48 + Static377.anInt5040 << 14;
				@Pc(82) int local82 = (local17 - local48) * (-local48 + local17) + (local22 - local51) * (-local51 + local22);
				if (local10 < 0 || local82 < local12) {
					local12 = local82;
					local10 = local61;
				}
			}
		}
		return local10;
	}
}

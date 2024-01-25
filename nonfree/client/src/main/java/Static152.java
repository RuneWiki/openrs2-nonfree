import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "Lclient!dp;")
	public static Class51 aClass51_7;

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "[I")
	public static final int[] anIntArray331 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ig", name = "F", descriptor = "[I")
	public static final int[] anIntArray334 = new int[25];

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZBI)I")
	public static int method2303(@OriginalArg(2) int arg0) {
		@Pc(22) Class1_Sub37 local22 = Static367.method5078(false, arg0);
		if (local22 == null) {
			return Static133.aClass247_1.method5446(arg0).anInt6381;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local22.anIntArray589.length; local34++) {
			if (local22.anIntArray589[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static133.aClass247_1.method5446(arg0).anInt6381 - local22.anIntArray589.length;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lclient!bu;")
	public static Class1_Sub6_Sub1 method2306(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub6_Sub1 local10 = (Class1_Sub6_Sub1) Static147.aClass219_3.method4799((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static98.aClass230_32.method4985(0, arg0);
		if (local28 == null || local28.length <= 1) {
			return null;
		} else {
			local10 = Static306.method4557(local28);
			Static147.aClass219_3.method4801((long) arg0, local10);
			return local10;
		}
	}
}

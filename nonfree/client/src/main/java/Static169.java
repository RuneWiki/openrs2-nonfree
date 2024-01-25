import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	public static void method2581() {
		Static60.anInt1505 = 0;
		for (@Pc(17) int local17 = 0; local17 < 2048; local17++) {
			Static137.aClass1_Sub20Array1[local17] = null;
			Static444.aByteArray57[local17] = 1;
			Static496.aClass228Array1[local17] = null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!jd;)I")
	public static int method2583(@OriginalArg(1) Class1_Sub20_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method3924(2);
		@Pc(31) int local31;
		if (local10 == 0) {
			local31 = 0;
		} else if (local10 == 1) {
			local31 = arg0.method3924(5);
		} else if (local10 == 2) {
			local31 = arg0.method3924(8);
		} else {
			local31 = arg0.method3924(11);
		}
		return local31;
	}
}

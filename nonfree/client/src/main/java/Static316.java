import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
	public static int anInt5982 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z")
	public static boolean method4963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public static void method4964() {
		if (Static84.anInt2018 == -1) {
			return;
		}
		@Pc(16) int local16 = Static359.aClass11_1.method6141();
		@Pc(20) int local20 = Static359.aClass11_1.method6144();
		@Pc(25) Class5_Sub7 local25 = (Class5_Sub7) Static223.aClass114_23.method2805();
		if (local25 != null) {
			local16 = local25.method8703();
			local20 = local25.method8702();
		}
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (Static66.aBoolean570) {
			local37 = Static106.method2037();
			local39 = Static660.method8815();
		}
		Static158.method2804(local20, local37, local37 + Static32.anInt510, local39, local20 + local39, local16, local37, local39 + Static79.anInt1140, local39, local37 + local16, Static84.anInt2018);
		if (Static378.aClass345_9 != null) {
			Static557.method7722(local16 + local37, local39 + local20);
		}
	}
}

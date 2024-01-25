import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	public static int anInt2175;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	public static int anInt2178;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
	public static int anInt2179 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method1994() {
		if (Static468.anInt8036 == -1) {
			return;
		}
		@Pc(11) int local11 = Static164.aClass173_1.method6487();
		@Pc(15) int local15 = Static164.aClass173_1.method6489();
		@Pc(20) Class6_Sub5 local20 = (Class6_Sub5) Static395.aClass361_52.method7838();
		if (local20 != null) {
			local11 = local20.method1991();
			local15 = local20.method1982();
		}
		Static470.method898(0, 0, 0, Static196.anInt4059, 0, Static468.anInt8036, local15, Static240.anInt4852, local11);
		if (Static1.aClass292_16 != null) {
			Static202.method3653(local11, local15);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z")
	public static boolean method1995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static354.method6852(arg0, arg1) & Static289.method4659(arg0, arg1);
	}
}

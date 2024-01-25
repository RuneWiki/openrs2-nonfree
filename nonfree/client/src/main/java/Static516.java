import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Lclient!h;")
	public static final Class114 aClass114_165 = new Class114("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
	public static int anInt8709 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public static void method7362() {
		Static397.aClass9_6.M(((float) Static89.aClass1_Sub28_Sub1_1.anInt4908 * 0.1F + 0.7F) * 1.1523438F);
		Static397.aClass9_6.m(Static425.anInt7380, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static397.aClass9_6.E(Static79.anInt2106, -1, 256);
		Static397.aClass9_6.method7580(Static384.aClass25_4);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method7365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static145.anIntArrayArrayArray4[arg0][local16][local20] == -Static250.anInt4850) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static246.anInt4759) + 1;
			@Pc(142) int local142 = (arg3 << Static246.anInt4759) + 2;
			@Pc(151) int local151 = Static290.aClass10Array7[arg0].ba(arg1, arg3) + arg5;
			if (!Static237.method4032(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static246.anInt4759) - 1;
			if (!Static237.method4032(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static246.anInt4759) - 1;
			if (!Static237.method4032(local20, local151, local177)) {
				return false;
			} else if (Static237.method4032(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static32.method1277(arg0, arg1, arg3)) {
			local16 = arg1 << Static246.anInt4759;
			local20 = arg3 << Static246.anInt4759;
			return Static237.method4032(local16 + 1, Static290.aClass10Array7[arg0].ba(arg1, arg3) + arg5, local20 + 1) && Static237.method4032(local16 + Static40.anInt1354 - 1, Static290.aClass10Array7[arg0].ba(arg1 + 1, arg3) + arg5, local20 + 1) && Static237.method4032(local16 + Static40.anInt1354 - 1, Static290.aClass10Array7[arg0].ba(arg1 + 1, arg3 + 1) + arg5, local20 + Static40.anInt1354 - 1) && Static237.method4032(local16 + 1, Static290.aClass10Array7[arg0].ba(arg1, arg3 + 1) + arg5, local20 + Static40.anInt1354 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)V")
	public static void method7366(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static476.method6225(16, arg0);
		local12.method4925();
	}
}

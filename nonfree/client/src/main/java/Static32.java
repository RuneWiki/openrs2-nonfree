import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
	public static int anInt1261;

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_15 = new Class6(44, -1);

	@OriginalMember(owner = "client!bea", name = "n", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)Z")
	public static boolean method1277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static145.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == -Static250.anInt4850) {
			return false;
		} else if (local7 == Static250.anInt4850) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static246.anInt4759;
			@Pc(26) int local26 = arg2 << Static246.anInt4759;
			if (Static237.method4032(local22 + 1, Static290.aClass10Array7[arg0].ba(arg1, arg2), local26 + 1) && Static237.method4032(local22 + Static40.anInt1354 - 1, Static290.aClass10Array7[arg0].ba(arg1 + 1, arg2), local26 + 1) && Static237.method4032(local22 + Static40.anInt1354 - 1, Static290.aClass10Array7[arg0].ba(arg1 + 1, arg2 + 1), local26 + Static40.anInt1354 - 1) && Static237.method4032(local22 + 1, Static290.aClass10Array7[arg0].ba(arg1, arg2 + 1), local26 + Static40.anInt1354 - 1) && Static237.method4032(local22 + Static444.anInt7507, Static290.aClass10Array7[arg0].ba(arg1, arg2), local26 + 1) && Static237.method4032(local22 + Static40.anInt1354 - 1, Static290.aClass10Array7[arg0].ba(arg1 + 1, arg2), local26 + Static444.anInt7507) && Static237.method4032(local22 + Static444.anInt7507, Static290.aClass10Array7[arg0].ba(arg1, arg2 + 1), local26 + Static40.anInt1354 - 1) && Static237.method4032(local22 + Static40.anInt1354 - 1, Static290.aClass10Array7[arg0].ba(arg1, arg2), local26 + Static444.anInt7507) && Static237.method4032(local22 + Static444.anInt7507, Static290.aClass10Array7[arg0].ba(arg1, arg2), local26 + Static444.anInt7507)) {
				Static145.anIntArrayArrayArray4[arg0][arg1][arg2] = Static250.anInt4850;
				return true;
			} else {
				Static145.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static250.anInt4850;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method1279(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < Static35.anInt1297; local14++) {
			if (arg0.equalsIgnoreCase(Static401.aStringArray38[local14])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static472.aStringArray44[local14])) {
				return true;
			}
		}
		return false;
	}
}

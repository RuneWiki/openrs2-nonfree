import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lp", name = "N", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
	public static void method5124(@OriginalArg(1) boolean arg0) {
		Static129.method8413();
		if (!Static16.method466(Static75.anInt1880)) {
			return;
		}
		Static484.anInt9039++;
		if (Static484.anInt9039 < 50 && !arg0) {
			return;
		}
		Static484.anInt9039 = 0;
		if (!Static420.aBoolean673 && Static393.aClass8_2 != null) {
			@Pc(42) Class3_Sub9 local42 = Static587.method8316(Static187.aClass40_2, Static280.aClass230_103);
			Static230.method3933(local42);
			try {
				Static326.method5661();
			} catch (@Pc(49) IOException local49) {
				Static420.aBoolean673 = true;
			}
		}
		Static129.method8413();
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
	public static void method5125() {
		Static156.aClass211_64.method5535();
	}
}

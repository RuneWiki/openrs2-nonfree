import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!is", name = "e", descriptor = "Lclient!ha;")
	public static Class84 aClass84_10;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!is", name = "i", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!is", name = "k", descriptor = "I")
	public static int anInt4675 = -1;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)Z")
	public static boolean method3975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static369.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == -Static69.anInt9137) {
			return false;
		} else if (local7 == Static69.anInt9137) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static193.anInt4311;
			@Pc(26) int local26 = arg2 << Static193.anInt4311;
			if (Static502.method7462(local22 + 1, Static51.aClass215Array6[arg0].ba(arg1, arg2), local26 + 1) && Static502.method7462(local22 + Static316.anInt6040 - 1, Static51.aClass215Array6[arg0].ba(arg1 + 1, arg2), local26 + 1) && Static502.method7462(local22 + Static316.anInt6040 - 1, Static51.aClass215Array6[arg0].ba(arg1 + 1, arg2 + 1), local26 + Static316.anInt6040 - 1) && Static502.method7462(local22 + 1, Static51.aClass215Array6[arg0].ba(arg1, arg2 + 1), local26 + Static316.anInt6040 - 1) && Static502.method7462(local22 + Static225.anInt4810, Static51.aClass215Array6[arg0].ba(arg1, arg2), local26 + 1) && Static502.method7462(local22 + Static316.anInt6040 - 1, Static51.aClass215Array6[arg0].ba(arg1 + 1, arg2), local26 + Static225.anInt4810) && Static502.method7462(local22 + Static225.anInt4810, Static51.aClass215Array6[arg0].ba(arg1, arg2 + 1), local26 + Static316.anInt6040 - 1) && Static502.method7462(local22 + Static316.anInt6040 - 1, Static51.aClass215Array6[arg0].ba(arg1, arg2), local26 + Static225.anInt4810) && Static502.method7462(local22 + Static225.anInt4810, Static51.aClass215Array6[arg0].ba(arg1, arg2), local26 + Static225.anInt4810)) {
				Static369.anIntArrayArrayArray7[arg0][arg1][arg2] = Static69.anInt9137;
				return true;
			} else {
				Static369.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static69.anInt9137;
				return false;
			}
		}
	}
}

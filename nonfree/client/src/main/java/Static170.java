import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static170 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_80 = new Class119("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!gp;)Ljava/lang/String;")
	public static String method2397(@OriginalArg(1) Class1_Sub19 arg0) {
		return arg0.aString31 == null || arg0.aString31.length() <= 0 ? arg0.aString32 : arg0.aString32 + Static25.aClass119_11.method2673(Static394.anInt6582) + arg0.aString31;
	}
}

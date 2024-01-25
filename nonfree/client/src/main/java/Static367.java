import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
	public static int anInt6486;

	@OriginalMember(owner = "client!nba", name = "p", descriptor = "[Lclient!eea;")
	public static final Class5_Sub13[] aClass5_Sub13Array1 = new Class5_Sub13[1024];

	@OriginalMember(owner = "client!nba", name = "y", descriptor = "Lclient!cga;")
	public static final Class52 aClass52_4 = new Class52();

	@OriginalMember(owner = "client!nba", name = "z", descriptor = "Z")
	public static boolean aBoolean541 = true;

	@OriginalMember(owner = "client!nba", name = "A", descriptor = "[I")
	public static final int[] anIntArray507 = new int[1];

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Lclient!kg;")
	public static Class186 method5750(@OriginalArg(1) int arg0) {
		@Pc(8) Class186[] local8 = Static334.method5160();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			if (local8[local18].anInt4700 == arg0) {
				return local8[local18];
			}
		}
		return null;
	}
}

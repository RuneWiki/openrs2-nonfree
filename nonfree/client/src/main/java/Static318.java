import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!vd;")
	public static final Class335 aClass335_2 = new Class335("runescape", 0);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
	public static void method5512(@OriginalArg(0) int arg0) {
		Static407.anInt8012 = -1;
		Static568.anInt10054 = 3;
		Static296.anInt6027 = arg0;
		Static338.anInt6970 = 100;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIZ)I")
	public static int method5513(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub29 local12 = Static535.method7881(false, arg0);
		if (local12 == null) {
			return Static441.aClass267_1.method6766(arg0).anInt2919;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local12.anIntArray328.length; local24++) {
			if (local12.anIntArray328[local24] == -1) {
				local22++;
			}
		}
		return local22 + Static441.aClass267_1.method6766(arg0).anInt2919 - local12.anIntArray328.length;
	}
}

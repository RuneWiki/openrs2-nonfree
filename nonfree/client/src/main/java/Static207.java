import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!n", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!n", name = "L", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!n", name = "N", descriptor = "I")
	public static int anInt4110;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_97 = new Class85("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!n", name = "O", descriptor = "[I")
	public static final int[] anIntArray393 = new int[1000];

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Lclient!in;")
	public static Class5_Sub1_Sub9 method3801(@OriginalArg(1) int arg0) {
		@Pc(5) Class109 local5 = Static236.aClass109_46;
		@Pc(14) Class5_Sub1_Sub9 local14;
		synchronized (Static236.aClass109_46) {
			local14 = (Class5_Sub1_Sub9) Static236.aClass109_46.method2857((long) arg0);
			if (local14 == null) {
				local14 = new Class5_Sub1_Sub9(arg0);
				Static236.aClass109_46.method2855((long) arg0, local14);
			}
		}
		synchronized (local14) {
			return local14.method2460() ? local14 : null;
		}
	}
}

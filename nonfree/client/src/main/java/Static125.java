import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
	public static int anInt2469;

	@OriginalMember(owner = "client!fu", name = "cb", descriptor = "[Lclient!vi;")
	public static Class255[] aClass255Array1;

	@OriginalMember(owner = "client!fu", name = "W", descriptor = "I")
	public static int anInt2472 = 0;

	@OriginalMember(owner = "client!fu", name = "Z", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_32 = new Class44(44, 7);

	@OriginalMember(owner = "client!fu", name = "ab", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[5];

	@OriginalMember(owner = "client!fu", name = "bb", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_33 = new Class44(69, -1);

	@OriginalMember(owner = "client!fu", name = "db", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_49 = new Class256("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(B)Lclient!ii;")
	public static Class23_Sub1 method1815() {
		Static182.anInt7662 = 0;
		return Static98.method1607();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1817(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class2_Sub20 local13 = new Class2_Sub20(arg0);
		@Pc(17) int local17 = local13.method3737();
		@Pc(21) int local21 = local13.method3731();
		if (local21 < 0 || Static216.anInt4168 != 0 && Static216.anInt4168 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(96) byte[] local96 = new byte[local21];
			local13.method3690(local96, local21);
			return local96;
		} else {
			@Pc(51) int local51 = local13.method3731();
			if (local51 < 0 || Static216.anInt4168 != 0 && local51 > Static216.anInt4168) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local51];
			if (local17 == 1) {
				Static392.method5385(local72, local51, arg0, local21);
			} else {
				Static112.aClass96_1.method1923(local72, local13);
			}
			return local72;
		}
	}
}

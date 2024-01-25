import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
	public static int anInt5998;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_95 = new Class67("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
	public static int anInt5997 = 0;

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "[I")
	public static final int[] anIntArray535 = new int[2048];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B[BI)[B")
	public static byte[] method5020(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static559.method5957(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Lclient!bg;")
	public static Class29 method5021(@OriginalArg(0) int arg0) {
		@Pc(16) Class29[] local16 = Static297.method4964();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class29 local24 = local16[local18];
			if (local24.anInt886 == arg0) {
				return local24;
			}
		}
		return null;
	}
}

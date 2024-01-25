import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!eea;")
	public static Class71 aClass71_47;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_80 = new Class158(56, 3);

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_99 = new Class67("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public static int anInt6214 = -1;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
	public static int method5204(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local19 * arg0 >> 12) + 40960;
		return local32 * local13 >> 12;
	}
}

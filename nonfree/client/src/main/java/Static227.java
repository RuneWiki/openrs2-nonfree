import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "Lclient!gt;")
	public static Class75 aClass75_5;

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
	public static int anInt4587;

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
	public static int anInt4589;

	@OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
	public static int anInt4597 = 0;

	@OriginalMember(owner = "client!oj", name = "Q", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_156 = new Class106("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZLclient!ct;)Lclient!e;")
	public static Class41 method4232(@OriginalArg(1) int arg0, @OriginalArg(3) Class30 arg1) {
		@Pc(14) byte[] local14 = arg1.method1161(0, arg0);
		return local14 == null ? null : new Class41(local14);
	}
}

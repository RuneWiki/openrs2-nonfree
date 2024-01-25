import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static536 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!eea;")
	public static Class71 aClass71_67 = new Class71();

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_151 = new Class67("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)Z")
	public static boolean method7664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static446.method6774(arg1, arg0) | (arg1 & 0x800) != 0 || Static424.method6501(arg1, arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method7668(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static220.method4021(arg0, arg5, arg1, arg2, -1, arg3, arg4, null);
	}
}

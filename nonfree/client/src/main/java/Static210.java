import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ir", name = "F", descriptor = "Lclient!oc;")
	public static Class212 aClass212_1;

	@OriginalMember(owner = "client!ir", name = "K", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ir", name = "L", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_56 = new Class158(73, -1);

	@OriginalMember(owner = "client!ir", name = "O", descriptor = "I")
	public static int anInt4631 = 0;

	@OriginalMember(owner = "client!ir", name = "Y", descriptor = "Lclient!fh;")
	public static final Class90 aClass90_9 = new Class90();

	@OriginalMember(owner = "client!ir", name = "Z", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_63 = new Class67("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Lclient!tp;")
	public static Class284 method3874(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static270.aClass284Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	public static String method3875(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg0); local14 != -1; local14 = arg1.indexOf(arg0, arg2.length() + local14)) {
			arg1 = arg1.substring(0, local14) + arg2 + arg1.substring(arg0.length() + local14);
		}
		return arg1;
	}
}

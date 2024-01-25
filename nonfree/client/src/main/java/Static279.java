import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!rs", name = "R", descriptor = "I")
	public static int anInt5583;

	@OriginalMember(owner = "client!rs", name = "T", descriptor = "Lclient!ni;")
	public static Class139 aClass139_1;

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!rs", name = "P", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_97 = new Class117("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!rs", name = "S", descriptor = "I")
	public static int anInt5584 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!nq;)V")
	public static void method4701(@OriginalArg(1) Class144 arg0) {
		Static306.aClass144_97 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIZ)I")
	public static int method4703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class11_Sub6 local8 = Static158.method2534(arg0, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray48.length) {
			return local8.anIntArray48[arg1];
		} else {
			return -1;
		}
	}
}

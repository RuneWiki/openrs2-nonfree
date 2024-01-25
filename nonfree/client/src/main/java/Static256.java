import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
	public static int anInt5196;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_87 = new Class117("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
	public static int anInt5197 = -1;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBI)V")
	public static void method4458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class11_Sub4_Sub12 local12 = Static35.method512(16, arg1);
		local12.method3858();
		local12.anInt4390 = arg0;
	}
}

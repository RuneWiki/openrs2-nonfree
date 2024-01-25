import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Lclient!wn;")
	public static Class95 aClass95_4;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_32 = new Class85("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "[I")
	public static final int[] anIntArray115 = new int[4];

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
	public static int anInt1431 = 2;

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
	public static int anInt1432 = -1;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)I")
	public static int method1366(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}
}

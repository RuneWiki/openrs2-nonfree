import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
	public static int anInt3039;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "Z")
	public static boolean aBoolean232 = true;

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_72 = new Class85("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "Z")
	public static boolean aBoolean233 = true;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "[Lclient!go;")
	public static final Class82_Sub1[] aClass82_Sub1Array1 = new Class82_Sub1[29];

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)V")
	public static void method2789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static251.anIntArray486[arg0] = arg1;
		@Pc(14) Class5_Sub28 local14 = (Class5_Sub28) Static276.aClass190_30.method5466((long) arg0);
		if (local14 == null) {
			local14 = new Class5_Sub28(4611686018427387905L);
			Static276.aClass190_30.method5464(local14, (long) arg0);
		} else if (local14.aLong159 != 4611686018427387905L) {
			local14.aLong159 = Static340.method5863() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BZ)V")
	public static void method2790(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static194.aBoolean299) {
			Static194.aBoolean299 = arg0;
			Static137.method2430();
		}
	}
}

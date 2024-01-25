import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
	public static int anInt6019 = 0;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Lclient!ec;")
	public static Class68 aClass68_14 = null;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_84 = new Class177(25, 15);

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "Z")
	public static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_159 = new Class158("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method4622() {
		if (Static193.aClass31_2 != null) {
			Static193.aClass31_2.method2009();
		}
		if (Static99.aClass31_1 != null) {
			Static99.aClass31_1.method2009();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLclient!ol;I)Lclient!qk;")
	public static Class208 method4623(@OriginalArg(1) Class30_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class208 local14;
		if (Static216.aClass208_1 == null) {
			local14 = new Class208();
		} else {
			local14 = Static216.aClass208_1;
			Static216.aClass208_1 = Static216.aClass208_1.aClass208_2;
			Static364.anInt6679--;
			local14.aClass208_2 = null;
		}
		local14.aClass30_Sub1_1 = arg0;
		local14.anInt6086 = arg1;
		return local14;
	}
}

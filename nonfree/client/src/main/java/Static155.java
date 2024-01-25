import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_67 = new Class205(18, 10);

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_41 = new Class32("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!j", name = "S", descriptor = "Z")
	public static boolean aBoolean228 = false;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	public static void method2834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg1, 10);
		local8.method864();
		local8.anInt1027 = arg0;
		local8.anInt1037 = arg3;
		local8.anInt1028 = arg2;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)Lclient!cj;")
	public static Class28 method2835() {
		try {
			return new Class28_Sub3();
		} catch (@Pc(12) Throwable local12) {
			try {
				return (Class28) Class.forName("Class28_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(18) Throwable local18) {
				return new Class28_Sub1();
			}
		}
	}
}

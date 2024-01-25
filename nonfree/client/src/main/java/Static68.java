import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "Lclient!kda;")
	public static Class160 aClass160_17;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_25 = new Class186(71, 3);

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString10 = "";

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "Lclient!h;")
	public static final Class114 aClass114_39 = new Class114("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Lclient!h;")
	public static final Class114 aClass114_40 = new Class114("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
	public static int anInt1930 = 1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public static void method1869(@OriginalArg(1) int arg0) {
		if (!Static43.method1389(arg0)) {
			return;
		}
		@Pc(12) Class309[] local12 = Static352.aClass309ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class309 local19 = local12[local14];
			if (local19 != null) {
				local19.anInt8791 = 0;
				local19.anInt8738 = 0;
				local19.anInt8776 = 1;
			}
		}
	}
}

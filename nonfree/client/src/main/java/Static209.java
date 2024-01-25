import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kh", name = "Db", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_97 = new Class119("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!kh", name = "Lb", descriptor = "I")
	public static int anInt3757 = -1;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "(II)V")
	public static void method3076(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub5_Sub11 local12 = Static188.method2688(arg0, 7);
		local12.method2667();
	}

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "(II)I")
	public static int method3086(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (arg0 * local19 >> 12) + 40960;
		return local27 * local13 >> 12;
	}
}

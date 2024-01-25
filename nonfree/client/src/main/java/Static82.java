import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_43 = new Class209("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_44 = new Class209("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	public static int anInt1800 = 0;

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "[Z")
	public static final boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)Lclient!hm;")
	public static Class3_Sub3 method1498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub3_2;
	}
}

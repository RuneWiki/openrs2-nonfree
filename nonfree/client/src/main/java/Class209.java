import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class209 {

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "Lclient!of;")
	private final Class188 aClass188_44 = new Class188(64);

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "Lclient!mn;")
	private final Class171 aClass171_75;

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
	public final int anInt6109;

	static {
		new Class231("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
		new Class231("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!pr;ILclient!mn;)V")
	public Class209(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_75 = arg2;
		this.anInt6109 = this.aClass171_75.method3662(19);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)Lclient!br;")
	public Class30 method4858(@OriginalArg(1) int arg0) {
		@Pc(6) Class188 local6 = this.aClass188_44;
		@Pc(16) Class30 local16;
		synchronized (this.aClass188_44) {
			local16 = (Class30) this.aClass188_44.method4158((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class171 local29 = this.aClass171_75;
		@Pc(38) byte[] local38;
		synchronized (this.aClass171_75) {
			local38 = this.aClass171_75.method3658(19, arg0);
		}
		local16 = new Class30();
		if (local38 != null) {
			local16.method584(new Class2_Sub17(local38));
		}
		@Pc(60) Class188 local60 = this.aClass188_44;
		synchronized (this.aClass188_44) {
			this.aClass188_44.method4155((long) arg0, local16);
			return local16;
		}
	}
}

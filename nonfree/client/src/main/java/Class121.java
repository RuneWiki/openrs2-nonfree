import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class121 {

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "Lclient!hp;")
	private final Class125 aClass125_27 = new Class125(64);

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "Lclient!kea;")
	private final Class161 aClass161_40;

	static {
		new Class67("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class121(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_40 = arg2;
		if (this.aClass161_40 != null) {
			this.aClass161_40.method4266(11);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public void method3426() {
		@Pc(2) Class125 local2 = this.aClass125_27;
		synchronized (this.aClass125_27) {
			this.aClass125_27.method3521();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
	public void method3428() {
		@Pc(6) Class125 local6 = this.aClass125_27;
		synchronized (this.aClass125_27) {
			this.aClass125_27.method3522(5);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Lclient!qe;")
	public Class244 method3431(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_27;
		@Pc(16) Class244 local16;
		synchronized (this.aClass125_27) {
			local16 = (Class244) this.aClass125_27.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class161 local34 = this.aClass161_40;
		@Pc(43) byte[] local43;
		synchronized (this.aClass161_40) {
			local43 = this.aClass161_40.method4243(arg0, 11);
		}
		local16 = new Class244();
		if (local43 != null) {
			local16.method5994(new Class3_Sub27(local43));
		}
		@Pc(65) Class125 local65 = this.aClass125_27;
		synchronized (this.aClass125_27) {
			this.aClass125_27.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	public void method3433() {
		@Pc(2) Class125 local2 = this.aClass125_27;
		synchronized (this.aClass125_27) {
			this.aClass125_27.method3516();
		}
	}
}

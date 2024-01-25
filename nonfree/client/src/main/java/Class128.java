import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class128 {

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Lclient!wm;")
	private final Class267 aClass267_35 = new Class267(64);

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!ph;")
	private final Class187 aClass187_71;

	static {
		new Class182("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class128(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_71 = arg2;
		this.aClass187_71.method4306(31);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Lclient!oa;")
	public Class176 method3041(@OriginalArg(0) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_35;
		@Pc(16) Class176 local16;
		synchronized (this.aClass267_35) {
			local16 = (Class176) this.aClass267_35.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class187 local29 = this.aClass187_71;
		@Pc(38) byte[] local38;
		synchronized (this.aClass187_71) {
			local38 = this.aClass187_71.method4300(31, arg0);
		}
		local16 = new Class176();
		if (local38 != null) {
			local16.method4005(new Class10_Sub8(local38));
		}
		@Pc(68) Class267 local68 = this.aClass267_35;
		synchronized (this.aClass267_35) {
			this.aClass267_35.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public void method3043() {
		@Pc(2) Class267 local2 = this.aClass267_35;
		synchronized (this.aClass267_35) {
			this.aClass267_35.method6011();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public void method3045() {
		@Pc(2) Class267 local2 = this.aClass267_35;
		synchronized (this.aClass267_35) {
			this.aClass267_35.method6013();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
	public void method3047() {
		@Pc(6) Class267 local6 = this.aClass267_35;
		synchronized (this.aClass267_35) {
			this.aClass267_35.method6007(5);
		}
	}
}

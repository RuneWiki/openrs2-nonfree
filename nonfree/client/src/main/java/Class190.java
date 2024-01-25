import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class190 {

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Lclient!rp;")
	private Class220 aClass220_43 = new Class220(64);

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "Lclient!rp;")
	public Class220 aClass220_44 = new Class220(64);

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!lt;")
	private final Class158 aClass158_65;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "Lclient!lt;")
	public final Class158 aClass158_64;

	static {
		new Class231("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;Lclient!lt;)V")
	public Class190(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) Class158 arg3) {
		this.aClass158_65 = arg2;
		this.aClass158_64 = arg3;
		this.aClass158_65.method3683(34);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)Lclient!hr;")
	public Class110 method4316(@OriginalArg(0) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_43;
		@Pc(16) Class110 local16;
		synchronized (this.aClass220_43) {
			local16 = (Class110) this.aClass220_43.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass158_65.method3672(arg0, 34);
		local16 = new Class110();
		local16.aClass190_3 = this;
		if (local33 != null) {
			local16.method2479(new Class6_Sub15(local33));
		}
		@Pc(52) Class220 local52 = this.aClass220_43;
		synchronized (this.aClass220_43) {
			this.aClass220_43.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public void method4317() {
		@Pc(2) Class220 local2 = this.aClass220_43;
		synchronized (this.aClass220_43) {
			this.aClass220_43.method4999();
		}
		local2 = this.aClass220_44;
		synchronized (this.aClass220_44) {
			this.aClass220_44.method4999();
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
	public void method4318() {
		@Pc(2) Class220 local2 = this.aClass220_43;
		synchronized (this.aClass220_43) {
			this.aClass220_43.method4987();
		}
		local2 = this.aClass220_44;
		synchronized (this.aClass220_44) {
			this.aClass220_44.method4987();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
	public void method4321() {
		@Pc(14) Class220 local14 = this.aClass220_43;
		synchronized (this.aClass220_43) {
			this.aClass220_43.method4998(5);
		}
		local14 = this.aClass220_44;
		synchronized (this.aClass220_44) {
			this.aClass220_44.method4998(5);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
	public void method4322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass220_43 = new Class220(arg0);
		this.aClass220_44 = new Class220(arg1);
	}
}

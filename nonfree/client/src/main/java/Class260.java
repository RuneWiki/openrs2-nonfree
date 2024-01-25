import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class260 {

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "Lclient!wi;")
	private final Class268 aClass268_59 = new Class268(256);

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "Lclient!uu;")
	private final Class250 aClass250_101;

	static {
		new Class174("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class260(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_101 = arg2;
		this.aClass250_101.method5815(26);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)V")
	public void method5942() {
		@Pc(6) Class268 local6 = this.aClass268_59;
		synchronized (this.aClass268_59) {
			this.aClass268_59.method6173(5);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
	public void method5944() {
		@Pc(2) Class268 local2 = this.aClass268_59;
		synchronized (this.aClass268_59) {
			this.aClass268_59.method6160();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI)Lclient!dr;")
	public Class3_Sub3_Sub5 method5945(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_59;
		@Pc(16) Class3_Sub3_Sub5 local16;
		synchronized (this.aClass268_59) {
			local16 = (Class3_Sub3_Sub5) this.aClass268_59.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_101;
		@Pc(40) byte[] local40;
		synchronized (this.aClass250_101) {
			local40 = this.aClass250_101.method5806(26, arg0);
		}
		local16 = new Class3_Sub3_Sub5();
		if (local40 != null) {
			local16.method1400(new Class3_Sub25(local40));
		}
		@Pc(62) Class268 local62 = this.aClass268_59;
		synchronized (this.aClass268_59) {
			this.aClass268_59.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)V")
	public void method5947() {
		@Pc(6) Class268 local6 = this.aClass268_59;
		synchronized (this.aClass268_59) {
			this.aClass268_59.method6168();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class212 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!jv;")
	private final Class126 aClass126_47 = new Class126(16);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!bu;")
	private final Class32 aClass32_74;

	static {
		new Class189("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
		new Class189("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class212(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_74 = arg2;
		this.aClass32_74.method790(30);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
	public void method4534() {
		@Pc(6) Class126 local6 = this.aClass126_47;
		synchronized (this.aClass126_47) {
			this.aClass126_47.method3140(5);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public void method4535() {
		@Pc(14) Class126 local14 = this.aClass126_47;
		synchronized (this.aClass126_47) {
			this.aClass126_47.method3135();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lclient!sl;")
	public Class229 method4536(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_47;
		@Pc(16) Class229 local16;
		synchronized (this.aClass126_47) {
			local16 = (Class229) this.aClass126_47.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass32_74.method785(arg0, 30);
		local16 = new Class229();
		if (local33 != null) {
			local16.method4868(new Class3_Sub7(local33));
		}
		@Pc(49) Class126 local49 = this.aClass126_47;
		synchronized (this.aClass126_47) {
			this.aClass126_47.method3132((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V")
	public void method4539() {
		@Pc(6) Class126 local6 = this.aClass126_47;
		synchronized (this.aClass126_47) {
			this.aClass126_47.method3131();
		}
	}
}

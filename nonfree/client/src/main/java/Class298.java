import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class298 {

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_67 = new Class288(64);

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!gp;")
	private final Class117 aClass117_215;

	static {
		new Class40("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class298(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_215 = arg2;
		if (this.aClass117_215 != null) {
			this.aClass117_215.method2951(11);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public void method6966() {
		@Pc(6) Class288 local6 = this.aClass288_67;
		synchronized (this.aClass288_67) {
			this.aClass288_67.method6735(5);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method6967() {
		@Pc(10) Class288 local10 = this.aClass288_67;
		synchronized (this.aClass288_67) {
			this.aClass288_67.method6742();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public void method6968() {
		@Pc(2) Class288 local2 = this.aClass288_67;
		synchronized (this.aClass288_67) {
			this.aClass288_67.method6744();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Lclient!hv;")
	public Class135 method6969(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_67;
		@Pc(16) Class135 local16;
		synchronized (this.aClass288_67) {
			local16 = (Class135) this.aClass288_67.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_215;
		@Pc(47) byte[] local47;
		synchronized (this.aClass117_215) {
			local47 = this.aClass117_215.method2962(arg0, 11);
		}
		local16 = new Class135();
		if (local47 != null) {
			local16.method3276(new Class5_Sub3(local47));
		}
		@Pc(69) Class288 local69 = this.aClass288_67;
		synchronized (this.aClass288_67) {
			this.aClass288_67.method6746(local16, (long) arg0);
			return local16;
		}
	}
}

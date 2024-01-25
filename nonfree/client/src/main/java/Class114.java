import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class114 {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!mo;")
	private final Class160 aClass160_23 = new Class160(64);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!nl;")
	private final Class171 aClass171_38;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	public final int anInt3021;

	static {
		new Class32("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class114(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_38 = arg2;
		if (this.aClass171_38 == null) {
			this.anInt3021 = 0;
		} else {
			this.anInt3021 = this.aClass171_38.method3750(16);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public void method2839() {
		@Pc(6) Class160 local6 = this.aClass160_23;
		synchronized (this.aClass160_23) {
			this.aClass160_23.method3605();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V")
	public void method2840() {
		@Pc(6) Class160 local6 = this.aClass160_23;
		synchronized (this.aClass160_23) {
			this.aClass160_23.method3606(5);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)Lclient!og;")
	public Class177 method2843(@OriginalArg(1) int arg0) {
		@Pc(10) Class160 local10 = this.aClass160_23;
		@Pc(20) Class177 local20;
		synchronized (this.aClass160_23) {
			local20 = (Class177) this.aClass160_23.method3599((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(37) byte[] local37 = this.aClass171_38.method3745(16, arg0);
		local20 = new Class177();
		if (local37 != null) {
			local20.method3909(new Class2_Sub16(local37));
		}
		@Pc(53) Class160 local53 = this.aClass160_23;
		synchronized (this.aClass160_23) {
			this.aClass160_23.method3602((long) arg0, local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public void method2844() {
		@Pc(6) Class160 local6 = this.aClass160_23;
		synchronized (this.aClass160_23) {
			this.aClass160_23.method3595();
		}
	}
}

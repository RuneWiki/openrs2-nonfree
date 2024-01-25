import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class108 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "Lclient!dc;")
	private Class44 aClass44_21 = new Class44(64);

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Lclient!dc;")
	public Class44 aClass44_22 = new Class44(64);

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "Lclient!he;")
	private final Class100 aClass100_29;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!he;")
	public final Class100 aClass100_28;

	static {
		new Class267("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;Lclient!he;)V")
	public Class108(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3) {
		this.aClass100_29 = arg2;
		this.aClass100_28 = arg3;
		this.aClass100_29.method2523(34);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	public void method2644() {
		@Pc(6) Class44 local6 = this.aClass44_21;
		synchronized (this.aClass44_21) {
			this.aClass44_21.method1351();
		}
		local6 = this.aClass44_22;
		synchronized (this.aClass44_22) {
			this.aClass44_22.method1351();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIB)V")
	public void method2646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass44_21 = new Class44(arg1);
		this.aClass44_22 = new Class44(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)Lclient!fp;")
	public Class81 method2647(@OriginalArg(0) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_21;
		@Pc(16) Class81 local16;
		synchronized (this.aClass44_21) {
			local16 = (Class81) this.aClass44_21.method1353((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass100_29.method2520(arg0, 34);
		local16 = new Class81();
		local16.aClass108_3 = this;
		if (local33 != null) {
			local16.method2026(new Class6_Sub1(local33));
		}
		@Pc(60) Class44 local60 = this.aClass44_21;
		synchronized (this.aClass44_21) {
			this.aClass44_21.method1349(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
	public void method2648() {
		@Pc(13) Class44 local13 = this.aClass44_21;
		synchronized (this.aClass44_21) {
			this.aClass44_21.method1348();
		}
		local13 = this.aClass44_22;
		synchronized (this.aClass44_22) {
			this.aClass44_22.method1348();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
	public void method2650() {
		@Pc(6) Class44 local6 = this.aClass44_21;
		synchronized (this.aClass44_21) {
			this.aClass44_21.method1352(5);
		}
		local6 = this.aClass44_22;
		synchronized (this.aClass44_22) {
			this.aClass44_22.method1352(5);
		}
	}
}

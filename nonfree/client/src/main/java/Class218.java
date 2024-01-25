import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class218 {

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!ge;")
	private final Class83 aClass83_46 = new Class83(256);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "Lclient!ci;")
	private final Class38 aClass38_72;

	static {
		new Class21("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class218(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_72 = arg2;
		this.aClass38_72.method1032(26);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
	public void method5096() {
		@Pc(6) Class83 local6 = this.aClass83_46;
		synchronized (this.aClass83_46) {
			this.aClass83_46.method2346();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public void method5097() {
		@Pc(2) Class83 local2 = this.aClass83_46;
		synchronized (this.aClass83_46) {
			this.aClass83_46.method2345(5);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Lclient!he;")
	public Class4_Sub1_Sub9 method5099(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_46;
		@Pc(16) Class4_Sub1_Sub9 local16;
		synchronized (this.aClass83_46) {
			local16 = (Class4_Sub1_Sub9) this.aClass83_46.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class38 local29 = this.aClass38_72;
		@Pc(38) byte[] local38;
		synchronized (this.aClass38_72) {
			local38 = this.aClass38_72.method1039(arg0, 26);
		}
		local16 = new Class4_Sub1_Sub9();
		if (local38 != null) {
			local16.method2642(new Class4_Sub20(local38));
		}
		@Pc(66) Class83 local66 = this.aClass83_46;
		synchronized (this.aClass83_46) {
			this.aClass83_46.method2337(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
	public void method5100() {
		@Pc(2) Class83 local2 = this.aClass83_46;
		synchronized (this.aClass83_46) {
			this.aClass83_46.method2336();
		}
	}
}

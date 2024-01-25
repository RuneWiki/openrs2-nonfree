import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class269 {

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "Lclient!ng;")
	private final Class167 aClass167_102 = new Class167(64);

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "Lclient!ic;")
	private final Class113 aClass113_134;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
	public final int anInt7426;

	static {
		new Class151("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class269(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_134 = arg2;
		if (this.aClass113_134 == null) {
			this.anInt7426 = 0;
		} else {
			this.anInt7426 = this.aClass113_134.method2271(16);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)Lclient!v;")
	public Class245 method5607(@OriginalArg(0) int arg0) {
		@Pc(11) Class167 local11 = this.aClass167_102;
		@Pc(21) Class245 local21;
		synchronized (this.aClass167_102) {
			local21 = (Class245) this.aClass167_102.method3386((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass113_134.method2274(16, arg0);
		local21 = new Class245();
		if (local38 != null) {
			local21.method5239(new Class1_Sub11(local38));
		}
		@Pc(54) Class167 local54 = this.aClass167_102;
		synchronized (this.aClass167_102) {
			this.aClass167_102.method3392(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	public void method5608() {
		@Pc(6) Class167 local6 = this.aClass167_102;
		synchronized (this.aClass167_102) {
			this.aClass167_102.method3389();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V")
	public void method5611() {
		@Pc(2) Class167 local2 = this.aClass167_102;
		synchronized (this.aClass167_102) {
			this.aClass167_102.method3384(5);
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
	public void method5613() {
		@Pc(11) Class167 local11 = this.aClass167_102;
		synchronized (this.aClass167_102) {
			this.aClass167_102.method3390();
		}
	}
}

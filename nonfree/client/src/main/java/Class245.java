import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class245 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Lclient!hn;")
	private final Class102 aClass102_56 = new Class102(128);

	@OriginalMember(owner = "client!um", name = "h", descriptor = "Lclient!fo;")
	private final Class82 aClass82_94;

	static {
		new Class119("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class245(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_94 = arg2;
		this.aClass82_94.method1823(1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	public void method5320() {
		@Pc(6) Class102 local6 = this.aClass102_56;
		synchronized (this.aClass102_56) {
			this.aClass102_56.method2262(5);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
	public void method5321() {
		@Pc(6) Class102 local6 = this.aClass102_56;
		synchronized (this.aClass102_56) {
			this.aClass102_56.method2271();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public void method5323() {
		@Pc(2) Class102 local2 = this.aClass102_56;
		synchronized (this.aClass102_56) {
			this.aClass102_56.method2260();
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(IB)Lclient!gj;")
	public Class91 method5325(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_56;
		@Pc(16) Class91 local16;
		synchronized (this.aClass102_56) {
			local16 = (Class91) this.aClass102_56.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class82 local29 = this.aClass82_94;
		@Pc(38) byte[] local38;
		synchronized (this.aClass82_94) {
			local38 = this.aClass82_94.method1817(1, arg0);
		}
		local16 = new Class91();
		if (local38 != null) {
			local16.method2029(new Class1_Sub28(local38));
		}
		@Pc(68) Class102 local68 = this.aClass102_56;
		synchronized (this.aClass102_56) {
			this.aClass102_56.method2272((long) arg0, local16);
			return local16;
		}
	}
}

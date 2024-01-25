import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!jk;")
	private final Class137 aClass137_1 = new Class137(64);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!qn;")
	private final Class211 aClass211_1;

	static {
		new Class15("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class1(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_1 = arg2;
		this.aClass211_1.method4365(32);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)Lclient!cp;")
	public Class42 method1(@OriginalArg(0) int arg0) {
		@Pc(6) Class137 local6 = this.aClass137_1;
		@Pc(16) Class42 local16;
		synchronized (this.aClass137_1) {
			local16 = (Class42) this.aClass137_1.method2744((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class211 local29 = this.aClass211_1;
		@Pc(38) byte[] local38;
		synchronized (this.aClass211_1) {
			local38 = this.aClass211_1.method4377(32, arg0);
		}
		local16 = new Class42();
		if (local38 != null) {
			local16.method815(new Class4_Sub9(local38));
		}
		@Pc(66) Class137 local66 = this.aClass137_1;
		synchronized (this.aClass137_1) {
			this.aClass137_1.method2732((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public void method2() {
		@Pc(2) Class137 local2 = this.aClass137_1;
		synchronized (this.aClass137_1) {
			this.aClass137_1.method2745(5);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public void method4() {
		@Pc(2) Class137 local2 = this.aClass137_1;
		synchronized (this.aClass137_1) {
			this.aClass137_1.method2739();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public void method5() {
		@Pc(2) Class137 local2 = this.aClass137_1;
		synchronized (this.aClass137_1) {
			this.aClass137_1.method2737();
		}
	}
}

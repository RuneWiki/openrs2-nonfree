import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class187 {

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "Lclient!wf;")
	private Class316 aClass316_40 = new Class316(64);

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "Lclient!kda;")
	private final Class160 aClass160_62;

	static {
		new Class114("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class187(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_62 = arg2;
		if (this.aClass160_62 != null) {
			@Pc(20) int local20 = this.aClass160_62.method4206() - 1;
			this.aClass160_62.method4207(local20);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
	public void method4854() {
		@Pc(13) Class316 local13 = this.aClass316_40;
		synchronized (this.aClass316_40) {
			this.aClass316_40.method7794();
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)V")
	public void method4857() {
		@Pc(2) Class316 local2 = this.aClass316_40;
		synchronized (this.aClass316_40) {
			this.aClass316_40.method7803();
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZ)Lclient!mq;")
	public Class198 method4858(@OriginalArg(0) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_40;
		@Pc(16) Class198 local16;
		synchronized (this.aClass316_40) {
			local16 = (Class198) this.aClass316_40.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) Class160 local36 = this.aClass160_62;
		@Pc(53) byte[] local53;
		synchronized (this.aClass160_62) {
			local53 = this.aClass160_62.method4198(Static440.method2215(arg0), Static448.method6440(arg0));
		}
		local16 = new Class198();
		if (local53 != null) {
			local16.method5099(new Class1_Sub13(local53));
		}
		@Pc(75) Class316 local75 = this.aClass316_40;
		synchronized (this.aClass316_40) {
			this.aClass316_40.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)V")
	public void method4859(@OriginalArg(0) int arg0) {
		@Pc(2) Class316 local2 = this.aClass316_40;
		synchronized (this.aClass316_40) {
			this.aClass316_40.method7794();
			this.aClass316_40 = new Class316(arg0);
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)V")
	public void method4860() {
		@Pc(2) Class316 local2 = this.aClass316_40;
		synchronized (this.aClass316_40) {
			this.aClass316_40.method7791(5);
		}
	}
}

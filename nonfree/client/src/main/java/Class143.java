import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class143 {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!jk;")
	private final Class137 aClass137_36 = new Class137(64);

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!qn;")
	private final Class211 aClass211_53;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	public final int anInt3566;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class143(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_53 = arg2;
		if (this.aClass211_53 == null) {
			this.anInt3566 = 0;
		} else {
			this.anInt3566 = this.aClass211_53.method4365(16);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public void method2844() {
		@Pc(6) Class137 local6 = this.aClass137_36;
		synchronized (this.aClass137_36) {
			this.aClass137_36.method2745(5);
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method2845() {
		@Pc(2) Class137 local2 = this.aClass137_36;
		synchronized (this.aClass137_36) {
			this.aClass137_36.method2737();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method2846() {
		@Pc(6) Class137 local6 = this.aClass137_36;
		synchronized (this.aClass137_36) {
			this.aClass137_36.method2739();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Lclient!we;")
	public Class262 method2848(@OriginalArg(1) int arg0) {
		@Pc(12) Class137 local12 = this.aClass137_36;
		@Pc(22) Class262 local22;
		synchronized (this.aClass137_36) {
			local22 = (Class262) this.aClass137_36.method2744((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class211 local35 = this.aClass211_53;
		@Pc(44) byte[] local44;
		synchronized (this.aClass211_53) {
			local44 = this.aClass211_53.method4377(16, arg0);
		}
		local22 = new Class262();
		if (local44 != null) {
			local22.method5871(new Class4_Sub9(local44));
		}
		@Pc(66) Class137 local66 = this.aClass137_36;
		synchronized (this.aClass137_36) {
			this.aClass137_36.method2732((long) arg0, local22);
			return local22;
		}
	}
}

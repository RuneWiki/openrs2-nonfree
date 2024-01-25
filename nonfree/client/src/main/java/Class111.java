import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class111 {

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "Lclient!iha;")
	private final Class168 aClass168_27 = new Class168(256);

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "Lclient!gda;")
	private final Class126 aClass126_85;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class111(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_85 = arg2;
		this.aClass126_85.method3062(26);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
	public void method2751() {
		@Pc(2) Class168 local2 = this.aClass168_27;
		synchronized (this.aClass168_27) {
			this.aClass168_27.method3856();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)V")
	public void method2752() {
		@Pc(6) Class168 local6 = this.aClass168_27;
		synchronized (this.aClass168_27) {
			this.aClass168_27.method3852(5);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V")
	public void method2754() {
		@Pc(2) Class168 local2 = this.aClass168_27;
		synchronized (this.aClass168_27) {
			this.aClass168_27.method3862();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IB)Lclient!uba;")
	public Class5_Sub1_Sub19 method2756(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_27;
		@Pc(16) Class5_Sub1_Sub19 local16;
		synchronized (this.aClass168_27) {
			local16 = (Class5_Sub1_Sub19) this.aClass168_27.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class126 local30 = this.aClass126_85;
		@Pc(39) byte[] local39;
		synchronized (this.aClass126_85) {
			local39 = this.aClass126_85.method3086(arg0, 26);
		}
		local16 = new Class5_Sub1_Sub19();
		if (local39 != null) {
			local16.method8193(new Class5_Sub36(local39));
		}
		@Pc(63) Class168 local63 = this.aClass168_27;
		synchronized (this.aClass168_27) {
			this.aClass168_27.method3853((long) arg0, local16);
			return local16;
		}
	}
}

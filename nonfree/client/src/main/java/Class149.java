import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class149 {

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!pja;")
	private final Class279 aClass279_18 = new Class279(64);

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "Lclient!pja;")
	public final Class279 aClass279_19 = new Class279(2);

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "Lclient!gj;")
	private final Class143 aClass143_51;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Lclient!gj;")
	public final Class143 aClass143_50;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;Lclient!gj;)V")
	public Class149(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Class143 arg3) {
		this.aClass143_51 = arg2;
		this.aClass143_50 = arg3;
		this.aClass143_51.method3123(33);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public void method3265() {
		@Pc(2) Class279 local2 = this.aClass279_18;
		synchronized (this.aClass279_18) {
			this.aClass279_18.method6637();
		}
		local2 = this.aClass279_19;
		synchronized (this.aClass279_19) {
			this.aClass279_19.method6637();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public void method3266() {
		@Pc(6) Class279 local6 = this.aClass279_18;
		synchronized (this.aClass279_18) {
			this.aClass279_18.method6638();
		}
		local6 = this.aClass279_19;
		synchronized (this.aClass279_19) {
			this.aClass279_19.method6638();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
	public void method3270() {
		@Pc(15) Class279 local15 = this.aClass279_18;
		synchronized (this.aClass279_18) {
			this.aClass279_18.method6630(5);
		}
		local15 = this.aClass279_19;
		synchronized (this.aClass279_19) {
			this.aClass279_19.method6630(5);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Lclient!nw;")
	public Class256 method3271(@OriginalArg(0) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_18;
		@Pc(16) Class256 local16;
		synchronized (this.aClass279_18) {
			local16 = (Class256) this.aClass279_18.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class143 local37 = this.aClass143_51;
		@Pc(46) byte[] local46;
		synchronized (this.aClass143_51) {
			local46 = this.aClass143_51.method3125(arg0, 33);
		}
		local16 = new Class256();
		local16.aClass149_1 = this;
		if (local46 != null) {
			local16.method5827(new Class3_Sub17(local46));
		}
		@Pc(71) Class279 local71 = this.aClass279_18;
		synchronized (this.aClass279_18) {
			this.aClass279_18.method6635(local16, (long) arg0);
			return local16;
		}
	}
}

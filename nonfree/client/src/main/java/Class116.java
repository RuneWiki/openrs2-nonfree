import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class116 {

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "Lclient!pja;")
	private Class279 aClass279_15 = new Class279(64);

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "Lclient!pja;")
	public Class279 aClass279_16 = new Class279(64);

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "Lclient!gj;")
	public final Class143 aClass143_38;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "Lclient!gj;")
	private final Class143 aClass143_37;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;Lclient!gj;)V")
	public Class116(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Class143 arg3) {
		this.aClass143_38 = arg3;
		this.aClass143_37 = arg2;
		this.aClass143_37.method3123(34);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IBI)V")
	public void method2723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass279_15 = new Class279(arg1);
		this.aClass279_16 = new Class279(arg0);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZI)V")
	public void method2724() {
		@Pc(6) Class279 local6 = this.aClass279_15;
		synchronized (this.aClass279_15) {
			this.aClass279_15.method6630(5);
		}
		local6 = this.aClass279_16;
		synchronized (this.aClass279_16) {
			this.aClass279_16.method6630(5);
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	public void method2726() {
		@Pc(6) Class279 local6 = this.aClass279_15;
		synchronized (this.aClass279_15) {
			this.aClass279_15.method6638();
		}
		local6 = this.aClass279_16;
		synchronized (this.aClass279_16) {
			this.aClass279_16.method6638();
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IB)Lclient!ie;")
	public Class173 method2727(@OriginalArg(0) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_15;
		@Pc(16) Class173 local16;
		synchronized (this.aClass279_15) {
			local16 = (Class173) this.aClass279_15.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_37;
		@Pc(38) byte[] local38;
		synchronized (this.aClass143_37) {
			local38 = this.aClass143_37.method3125(arg0, 34);
		}
		local16 = new Class173();
		local16.aClass116_1 = this;
		if (local38 != null) {
			local16.method3930(new Class3_Sub17(local38));
		}
		@Pc(69) Class279 local69 = this.aClass279_15;
		synchronized (this.aClass279_15) {
			this.aClass279_15.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
	public void method2729() {
		@Pc(6) Class279 local6 = this.aClass279_15;
		synchronized (this.aClass279_15) {
			this.aClass279_15.method6637();
		}
		local6 = this.aClass279_16;
		synchronized (this.aClass279_16) {
			this.aClass279_16.method6637();
		}
	}
}

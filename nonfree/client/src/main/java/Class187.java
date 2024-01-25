import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class187 {

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "Lclient!ku;")
	private final Class139 aClass139_56 = new Class139(64);

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "Lclient!b;")
	private final Class20 aClass20_62;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class187(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_62 = arg2;
		if (this.aClass20_62 != null) {
			this.aClass20_62.method231(11);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
	public void method4278() {
		@Pc(2) Class139 local2 = this.aClass139_56;
		synchronized (this.aClass139_56) {
			this.aClass139_56.method3075();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)Lclient!hn;")
	public Class104 method4279(@OriginalArg(1) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_56;
		@Pc(16) Class104 local16;
		synchronized (this.aClass139_56) {
			local16 = (Class104) this.aClass139_56.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass20_62.method253(arg0, 11);
		local16 = new Class104();
		if (local39 != null) {
			local16.method2219(new Class3_Sub5(local39));
		}
		@Pc(55) Class139 local55 = this.aClass139_56;
		synchronized (this.aClass139_56) {
			this.aClass139_56.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V")
	public void method4281() {
		@Pc(2) Class139 local2 = this.aClass139_56;
		synchronized (this.aClass139_56) {
			this.aClass139_56.method3083(5);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	public void method4283() {
		@Pc(6) Class139 local6 = this.aClass139_56;
		synchronized (this.aClass139_56) {
			this.aClass139_56.method3072();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class24 {

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!ku;")
	private Class139 aClass139_3 = new Class139(64);

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!ku;")
	public Class139 aClass139_4 = new Class139(64);

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!b;")
	public final Class20 aClass20_10;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!b;")
	private final Class20 aClass20_9;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;Lclient!b;)V")
	public Class24(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) Class20 arg3) {
		this.aClass20_10 = arg3;
		this.aClass20_9 = arg2;
		this.aClass20_9.method231(34);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII)V")
	public void method313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass139_3 = new Class139(arg0);
		this.aClass139_4 = new Class139(arg1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public void method314() {
		@Pc(6) Class139 local6 = this.aClass139_3;
		synchronized (this.aClass139_3) {
			this.aClass139_3.method3075();
		}
		local6 = this.aClass139_4;
		synchronized (this.aClass139_4) {
			this.aClass139_4.method3075();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)Lclient!le;")
	public Class143 method317(@OriginalArg(0) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_3;
		@Pc(24) Class143 local24;
		synchronized (this.aClass139_3) {
			local24 = (Class143) this.aClass139_3.method3076((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(43) byte[] local43 = this.aClass20_9.method253(arg0, 34);
		local24 = new Class143();
		local24.aClass24_3 = this;
		if (local43 != null) {
			local24.method3106(new Class3_Sub5(local43));
		}
		@Pc(64) Class139 local64 = this.aClass139_3;
		synchronized (this.aClass139_3) {
			this.aClass139_3.method3070(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IB)V")
	public void method319() {
		@Pc(6) Class139 local6 = this.aClass139_3;
		synchronized (this.aClass139_3) {
			this.aClass139_3.method3083(5);
		}
		local6 = this.aClass139_4;
		synchronized (this.aClass139_4) {
			this.aClass139_4.method3083(5);
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public void method320() {
		@Pc(2) Class139 local2 = this.aClass139_3;
		synchronized (this.aClass139_3) {
			this.aClass139_3.method3072();
		}
		local2 = this.aClass139_4;
		synchronized (this.aClass139_4) {
			this.aClass139_4.method3072();
		}
	}
}

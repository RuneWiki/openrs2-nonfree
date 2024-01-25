import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class224 {

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "Lclient!ku;")
	private final Class139 aClass139_75 = new Class139(64);

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "Lclient!ku;")
	public final Class139 aClass139_76 = new Class139(2);

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "Lclient!b;")
	public final Class20 aClass20_85;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "Lclient!b;")
	private final Class20 aClass20_86;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;Lclient!b;)V")
	public Class224(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) Class20 arg3) {
		this.aClass20_85 = arg3;
		this.aClass20_86 = arg2;
		this.aClass20_86.method231(33);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public void method5107() {
		@Pc(6) Class139 local6 = this.aClass139_75;
		synchronized (this.aClass139_75) {
			this.aClass139_75.method3075();
		}
		local6 = this.aClass139_76;
		synchronized (this.aClass139_76) {
			this.aClass139_76.method3075();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Lclient!fe;")
	public Class79 method5108(@OriginalArg(1) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_75;
		@Pc(16) Class79 local16;
		synchronized (this.aClass139_75) {
			local16 = (Class79) this.aClass139_75.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass20_86.method253(arg0, 33);
		local16 = new Class79();
		local16.aClass224_3 = this;
		if (local39 != null) {
			local16.method1653(new Class3_Sub5(local39));
		}
		@Pc(58) Class139 local58 = this.aClass139_75;
		synchronized (this.aClass139_75) {
			this.aClass139_75.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
	public void method5109() {
		@Pc(6) Class139 local6 = this.aClass139_75;
		synchronized (this.aClass139_75) {
			this.aClass139_75.method3072();
		}
		local6 = this.aClass139_76;
		synchronized (this.aClass139_76) {
			this.aClass139_76.method3072();
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
	public void method5111() {
		@Pc(6) Class139 local6 = this.aClass139_75;
		synchronized (this.aClass139_75) {
			this.aClass139_75.method3083(5);
		}
		local6 = this.aClass139_76;
		synchronized (this.aClass139_76) {
			this.aClass139_76.method3083(5);
		}
	}
}

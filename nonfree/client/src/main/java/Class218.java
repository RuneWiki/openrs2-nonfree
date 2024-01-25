import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class218 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!ku;")
	private final Class139 aClass139_73 = new Class139(16);

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!b;")
	private final Class20 aClass20_82;

	static {
		Math.sqrt(8192.0D);
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class218(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_82 = arg2;
		this.aClass20_82.method231(30);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)Lclient!io;")
	public Class114 method5010(@OriginalArg(1) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_73;
		@Pc(16) Class114 local16;
		synchronized (this.aClass139_73) {
			local16 = (Class114) this.aClass139_73.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass20_82.method253(arg0, 30);
		local16 = new Class114();
		if (local33 != null) {
			local16.method2394(new Class3_Sub5(local33));
		}
		@Pc(49) Class139 local49 = this.aClass139_73;
		synchronized (this.aClass139_73) {
			this.aClass139_73.method3070(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
	public void method5011() {
		@Pc(6) Class139 local6 = this.aClass139_73;
		synchronized (this.aClass139_73) {
			this.aClass139_73.method3083(5);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public void method5012() {
		@Pc(7) Class139 local7 = this.aClass139_73;
		synchronized (this.aClass139_73) {
			this.aClass139_73.method3075();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public void method5014() {
		@Pc(6) Class139 local6 = this.aClass139_73;
		synchronized (this.aClass139_73) {
			this.aClass139_73.method3072();
		}
	}
}

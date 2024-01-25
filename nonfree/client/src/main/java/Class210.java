import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class210 {

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!ku;")
	private final Class139 aClass139_64 = new Class139(128);

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!b;")
	private final Class20 aClass20_76;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class210(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_76 = arg2;
		this.aClass20_76.method231(1);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public void method4764() {
		@Pc(12) Class139 local12 = this.aClass139_64;
		synchronized (this.aClass139_64) {
			this.aClass139_64.method3083(5);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public void method4765() {
		@Pc(6) Class139 local6 = this.aClass139_64;
		synchronized (this.aClass139_64) {
			this.aClass139_64.method3075();
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)Lclient!lk;")
	public Class147 method4766(@OriginalArg(0) int arg0) {
		@Pc(11) Class139 local11 = this.aClass139_64;
		@Pc(21) Class147 local21;
		synchronized (this.aClass139_64) {
			local21 = (Class147) this.aClass139_64.method3076((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass20_76.method253(arg0, 1);
		local21 = new Class147();
		if (local38 != null) {
			local21.method3167(new Class3_Sub5(local38));
		}
		@Pc(54) Class139 local54 = this.aClass139_64;
		synchronized (this.aClass139_64) {
			this.aClass139_64.method3070(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public void method4767() {
		@Pc(2) Class139 local2 = this.aClass139_64;
		synchronized (this.aClass139_64) {
			this.aClass139_64.method3072();
		}
	}
}

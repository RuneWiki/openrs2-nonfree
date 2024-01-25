import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class223 {

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Lclient!ku;")
	private final Class139 aClass139_74 = new Class139(64);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!b;")
	private final Class20 aClass20_83;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "Lclient!b;")
	public final Class20 aClass20_84;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;Lclient!b;)V")
	public Class223(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) Class20 arg3) {
		this.aClass20_83 = arg2;
		this.aClass20_84 = arg3;
		this.aClass20_83.method231(3);
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
	public void method5078() {
		@Pc(2) Class139 local2 = this.aClass139_74;
		synchronized (this.aClass139_74) {
			this.aClass139_74.method3075();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
	public void method5079() {
		@Pc(12) Class139 local12 = this.aClass139_74;
		synchronized (this.aClass139_74) {
			this.aClass139_74.method3083(5);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
	public void method5082() {
		@Pc(6) Class139 local6 = this.aClass139_74;
		synchronized (this.aClass139_74) {
			this.aClass139_74.method3072();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)Lclient!lo;")
	public Class148 method5083(@OriginalArg(1) int arg0) {
		@Pc(6) Class139 local6 = this.aClass139_74;
		@Pc(16) Class148 local16;
		synchronized (this.aClass139_74) {
			local16 = (Class148) this.aClass139_74.method3076((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass20_83.method253(arg0, 3);
		local16 = new Class148();
		local16.aClass223_2 = this;
		if (local38 != null) {
			local16.method3193(new Class3_Sub5(local38));
		}
		@Pc(57) Class139 local57 = this.aClass139_74;
		synchronized (this.aClass139_74) {
			this.aClass139_74.method3070(local16, (long) arg0);
			return local16;
		}
	}
}

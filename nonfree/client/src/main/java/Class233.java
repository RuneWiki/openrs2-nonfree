import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class233 {

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "Lclient!jo;")
	private final Class126 aClass126_56 = new Class126(128);

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "Lclient!ok;")
	private final Class178 aClass178_117;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class233(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_117 = arg2;
		this.aClass178_117.method3833(1);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	public void method4847() {
		@Pc(2) Class126 local2 = this.aClass126_56;
		synchronized (this.aClass126_56) {
			this.aClass126_56.method2821();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)Lclient!km;")
	public Class135 method4848(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_56;
		@Pc(16) Class135 local16;
		synchronized (this.aClass126_56) {
			local16 = (Class135) this.aClass126_56.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_117;
		@Pc(38) byte[] local38;
		synchronized (this.aClass178_117) {
			local38 = this.aClass178_117.method3838(arg0, 1);
		}
		local16 = new Class135();
		if (local38 != null) {
			local16.method3056(new Class7_Sub14(local38));
		}
		@Pc(65) Class126 local65 = this.aClass126_56;
		synchronized (this.aClass126_56) {
			this.aClass126_56.method2824((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V")
	public void method4850() {
		@Pc(2) Class126 local2 = this.aClass126_56;
		synchronized (this.aClass126_56) {
			this.aClass126_56.method2827();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)V")
	public void method4851() {
		@Pc(6) Class126 local6 = this.aClass126_56;
		synchronized (this.aClass126_56) {
			this.aClass126_56.method2828(5);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class18 {

	@OriginalMember(owner = "client!av", name = "f", descriptor = "Lclient!jo;")
	private final Class126 aClass126_1 = new Class126(256);

	@OriginalMember(owner = "client!av", name = "j", descriptor = "Lclient!ok;")
	private final Class178 aClass178_6;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class18(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_6 = arg2;
		this.aClass178_6.method3833(26);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	public void method203() {
		@Pc(6) Class126 local6 = this.aClass126_1;
		synchronized (this.aClass126_1) {
			this.aClass126_1.method2821();
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Lclient!je;")
	public Class7_Sub4_Sub10 method204(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_1;
		@Pc(18) Class7_Sub4_Sub10 local18;
		synchronized (this.aClass126_1) {
			local18 = (Class7_Sub4_Sub10) this.aClass126_1.method2822((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class178 local31 = this.aClass178_6;
		@Pc(40) byte[] local40;
		synchronized (this.aClass178_6) {
			local40 = this.aClass178_6.method3838(arg0, 26);
		}
		local18 = new Class7_Sub4_Sub10();
		if (local40 != null) {
			local18.method2737(new Class7_Sub14(local40));
		}
		@Pc(64) Class126 local64 = this.aClass126_1;
		synchronized (this.aClass126_1) {
			this.aClass126_1.method2824((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
	public void method205() {
		@Pc(2) Class126 local2 = this.aClass126_1;
		synchronized (this.aClass126_1) {
			this.aClass126_1.method2827();
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IB)V")
	public void method207() {
		@Pc(6) Class126 local6 = this.aClass126_1;
		synchronized (this.aClass126_1) {
			this.aClass126_1.method2828(5);
		}
	}
}

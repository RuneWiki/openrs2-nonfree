import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class154 {

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!jo;")
	private final Class126 aClass126_34 = new Class126(64);

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!ok;")
	private final Class178 aClass178_72;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class154(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_72 = arg2;
		this.aClass178_72.method3833(32);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)V")
	public void method3336() {
		@Pc(6) Class126 local6 = this.aClass126_34;
		synchronized (this.aClass126_34) {
			this.aClass126_34.method2828(5);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public void method3338() {
		@Pc(2) Class126 local2 = this.aClass126_34;
		synchronized (this.aClass126_34) {
			this.aClass126_34.method2827();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Lclient!fh;")
	public Class78 method3341(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_34;
		@Pc(16) Class78 local16;
		synchronized (this.aClass126_34) {
			local16 = (Class78) this.aClass126_34.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_72;
		@Pc(38) byte[] local38;
		synchronized (this.aClass178_72) {
			local38 = this.aClass178_72.method3838(arg0, 32);
		}
		local16 = new Class78();
		if (local38 != null) {
			local16.method1924(new Class7_Sub14(local38));
		}
		@Pc(62) Class126 local62 = this.aClass126_34;
		synchronized (this.aClass126_34) {
			this.aClass126_34.method2824((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	public void method3342() {
		@Pc(2) Class126 local2 = this.aClass126_34;
		synchronized (this.aClass126_34) {
			this.aClass126_34.method2821();
		}
	}
}

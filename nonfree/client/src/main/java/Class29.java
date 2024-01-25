import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class29 {

	@OriginalMember(owner = "client!br", name = "m", descriptor = "Lclient!jo;")
	private final Class126 aClass126_5 = new Class126(64);

	@OriginalMember(owner = "client!br", name = "o", descriptor = "Lclient!jo;")
	public final Class126 aClass126_6 = new Class126(2);

	@OriginalMember(owner = "client!br", name = "b", descriptor = "Lclient!ok;")
	private final Class178 aClass178_13;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "Lclient!ok;")
	public final Class178 aClass178_14;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;Lclient!ok;)V")
	public Class29(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class178 arg3) {
		this.aClass178_13 = arg2;
		this.aClass178_14 = arg3;
		this.aClass178_13.method3833(33);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method514() {
		@Pc(10) Class126 local10 = this.aClass126_5;
		synchronized (this.aClass126_5) {
			this.aClass126_5.method2827();
		}
		local10 = this.aClass126_6;
		synchronized (this.aClass126_6) {
			this.aClass126_6.method2827();
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IB)Lclient!cg;")
	public Class39 method516(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_5;
		@Pc(16) Class39 local16;
		synchronized (this.aClass126_5) {
			local16 = (Class39) this.aClass126_5.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_13;
		@Pc(38) byte[] local38;
		synchronized (this.aClass178_13) {
			local38 = this.aClass178_13.method3838(arg0, 33);
		}
		local16 = new Class39();
		local16.aClass29_2 = this;
		if (local38 != null) {
			local16.method612(new Class7_Sub14(local38));
		}
		@Pc(63) Class126 local63 = this.aClass126_5;
		synchronized (this.aClass126_5) {
			this.aClass126_5.method2824((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
	public void method517() {
		@Pc(6) Class126 local6 = this.aClass126_5;
		synchronized (this.aClass126_5) {
			this.aClass126_5.method2821();
		}
		local6 = this.aClass126_6;
		synchronized (this.aClass126_6) {
			this.aClass126_6.method2821();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V")
	public void method518() {
		@Pc(2) Class126 local2 = this.aClass126_5;
		synchronized (this.aClass126_5) {
			this.aClass126_5.method2828(5);
		}
		local2 = this.aClass126_6;
		synchronized (this.aClass126_6) {
			this.aClass126_6.method2828(5);
		}
	}
}

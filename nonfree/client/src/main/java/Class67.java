import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class67 {

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "Lclient!of;")
	private Class236 aClass236_15 = new Class236(64);

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "Lclient!of;")
	public Class236 aClass236_16 = new Class236(64);

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_25;

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "Lclient!oh;")
	public final Class237 aClass237_26;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;Lclient!oh;)V")
	public Class67(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) Class237 arg3) {
		this.aClass237_25 = arg2;
		this.aClass237_26 = arg3;
		this.aClass237_25.method6315(34);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IB)Lclient!lc;")
	public Class190 method2155(@OriginalArg(0) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_15;
		@Pc(16) Class190 local16;
		synchronized (this.aClass236_15) {
			local16 = (Class190) this.aClass236_15.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_25;
		@Pc(38) byte[] local38;
		synchronized (this.aClass237_25) {
			local38 = this.aClass237_25.method6314(34, arg0);
		}
		local16 = new Class190();
		local16.aClass67_3 = this;
		if (local38 != null) {
			local16.method4916(new Class8_Sub8(local38));
		}
		@Pc(63) Class236 local63 = this.aClass236_15;
		synchronized (this.aClass236_15) {
			this.aClass236_15.method6241((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
	public void method2156() {
		@Pc(2) Class236 local2 = this.aClass236_15;
		synchronized (this.aClass236_15) {
			this.aClass236_15.method6245();
		}
		local2 = this.aClass236_16;
		synchronized (this.aClass236_16) {
			this.aClass236_16.method6245();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)V")
	public void method2157() {
		@Pc(11) Class236 local11 = this.aClass236_15;
		synchronized (this.aClass236_15) {
			this.aClass236_15.method6253();
		}
		local11 = this.aClass236_16;
		synchronized (this.aClass236_16) {
			this.aClass236_16.method6253();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V")
	public void method2159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass236_15 = new Class236(arg0);
		this.aClass236_16 = new Class236(arg1);
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(IB)V")
	public void method2162() {
		@Pc(6) Class236 local6 = this.aClass236_15;
		synchronized (this.aClass236_15) {
			this.aClass236_15.method6243(5);
		}
		local6 = this.aClass236_16;
		synchronized (this.aClass236_16) {
			this.aClass236_16.method6243(5);
		}
	}
}

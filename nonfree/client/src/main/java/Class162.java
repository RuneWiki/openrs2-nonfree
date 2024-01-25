import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class162 {

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "Lclient!jo;")
	private final Class126 aClass126_36 = new Class126(64);

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "Lclient!ok;")
	public final Class178 aClass178_77;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "Lclient!ok;")
	private final Class178 aClass178_78;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;Lclient!ok;)V")
	public Class162(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class178 arg3) {
		this.aClass178_77 = arg3;
		this.aClass178_78 = arg2;
		this.aClass178_78.method3833(3);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lclient!bh;")
	public Class25 method3430(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_36;
		@Pc(16) Class25 local16;
		synchronized (this.aClass126_36) {
			local16 = (Class25) this.aClass126_36.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_78;
		@Pc(38) byte[] local38;
		synchronized (this.aClass178_78) {
			local38 = this.aClass178_78.method3838(arg0, 3);
		}
		local16 = new Class25();
		local16.aClass162_1 = this;
		if (local38 != null) {
			local16.method317(new Class7_Sub14(local38));
		}
		@Pc(63) Class126 local63 = this.aClass126_36;
		synchronized (this.aClass126_36) {
			this.aClass126_36.method2824((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public void method3433() {
		@Pc(6) Class126 local6 = this.aClass126_36;
		synchronized (this.aClass126_36) {
			this.aClass126_36.method2821();
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
	public void method3436() {
		@Pc(6) Class126 local6 = this.aClass126_36;
		synchronized (this.aClass126_36) {
			this.aClass126_36.method2827();
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
	public void method3438() {
		@Pc(2) Class126 local2 = this.aClass126_36;
		synchronized (this.aClass126_36) {
			this.aClass126_36.method2828(5);
		}
	}
}

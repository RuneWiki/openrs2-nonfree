import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class47 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Lclient!mq;")
	private final Class154 aClass154_4 = new Class154(64);

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!fc;")
	private final Class71 aClass71_16;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class47(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_16 = arg2;
		this.aClass71_16.method1580(32);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V")
	public void method1072() {
		@Pc(6) Class154 local6 = this.aClass154_4;
		synchronized (this.aClass154_4) {
			this.aClass154_4.method3758(5);
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	public void method1073() {
		@Pc(6) Class154 local6 = this.aClass154_4;
		synchronized (this.aClass154_4) {
			this.aClass154_4.method3746();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lclient!og;")
	public Class170 method1075(@OriginalArg(0) int arg0) {
		@Pc(11) Class154 local11 = this.aClass154_4;
		@Pc(21) Class170 local21;
		synchronized (this.aClass154_4) {
			local21 = (Class170) this.aClass154_4.method3751((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass71_16.method1555(32, arg0);
		local21 = new Class170();
		if (local38 != null) {
			local21.method4011(new Class2_Sub13(local38));
		}
		@Pc(54) Class154 local54 = this.aClass154_4;
		synchronized (this.aClass154_4) {
			this.aClass154_4.method3745((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	public void method1076() {
		@Pc(12) Class154 local12 = this.aClass154_4;
		synchronized (this.aClass154_4) {
			this.aClass154_4.method3748();
		}
	}
}

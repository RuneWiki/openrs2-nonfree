import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class121 {

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!ge;")
	private final Class83 aClass83_27 = new Class83(128);

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!ci;")
	private final Class38 aClass38_40;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;)V")
	public Class121(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass38_40 = arg2;
		this.aClass38_40.method1032(1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Lclient!hb;")
	public Class92 method3390(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_27;
		@Pc(20) Class92 local20;
		synchronized (this.aClass83_27) {
			local20 = (Class92) this.aClass83_27.method2338((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(33) Class38 local33 = this.aClass38_40;
		@Pc(42) byte[] local42;
		synchronized (this.aClass38_40) {
			local42 = this.aClass38_40.method1039(arg0, 1);
		}
		local20 = new Class92();
		if (local42 != null) {
			local20.method2612(new Class4_Sub20(local42));
		}
		@Pc(64) Class83 local64 = this.aClass83_27;
		synchronized (this.aClass83_27) {
			this.aClass83_27.method2337(local20, (long) arg0);
			return local20;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method3393() {
		@Pc(6) Class83 local6 = this.aClass83_27;
		synchronized (this.aClass83_27) {
			this.aClass83_27.method2346();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
	public void method3394() {
		@Pc(2) Class83 local2 = this.aClass83_27;
		synchronized (this.aClass83_27) {
			this.aClass83_27.method2336();
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IB)V")
	public void method3396() {
		@Pc(6) Class83 local6 = this.aClass83_27;
		synchronized (this.aClass83_27) {
			this.aClass83_27.method2345(5);
		}
	}
}

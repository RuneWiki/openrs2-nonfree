import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class126 {

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "Lclient!ge;")
	private final Class83 aClass83_28 = new Class83(64);

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "Lclient!ci;")
	private final Class38 aClass38_42;

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "Lclient!ci;")
	public final Class38 aClass38_41;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!sn;ILclient!ci;Lclient!ci;)V")
	public Class126(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Class38 arg3) {
		this.aClass38_42 = arg2;
		this.aClass38_41 = arg3;
		this.aClass38_42.method1032(3);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
	public void method3429() {
		@Pc(8) Class83 local8 = this.aClass83_28;
		synchronized (this.aClass83_28) {
			this.aClass83_28.method2336();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Lclient!iq;")
	public Class111 method3430(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_28;
		@Pc(16) Class111 local16;
		synchronized (this.aClass83_28) {
			local16 = (Class111) this.aClass83_28.method2338((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class38 local29 = this.aClass38_42;
		@Pc(38) byte[] local38;
		synchronized (this.aClass38_42) {
			local38 = this.aClass38_42.method1039(arg0, 3);
		}
		local16 = new Class111();
		local16.aClass126_1 = this;
		if (local38 != null) {
			local16.method3070(new Class4_Sub20(local38));
		}
		@Pc(63) Class83 local63 = this.aClass83_28;
		synchronized (this.aClass83_28) {
			this.aClass83_28.method2337(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public void method3431() {
		@Pc(12) Class83 local12 = this.aClass83_28;
		synchronized (this.aClass83_28) {
			this.aClass83_28.method2346();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)V")
	public void method3433() {
		@Pc(6) Class83 local6 = this.aClass83_28;
		synchronized (this.aClass83_28) {
			this.aClass83_28.method2345(5);
		}
	}
}

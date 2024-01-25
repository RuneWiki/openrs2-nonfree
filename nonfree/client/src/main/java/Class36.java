import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class36 {

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!co;")
	private final Class41 aClass41_9 = new Class41(64);

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Lclient!g;")
	private final Class83 aClass83_21;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;)V")
	public Class36(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_21 = arg2;
		this.aClass83_21.method1955(31);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method597() {
		@Pc(7) Class41 local7 = this.aClass41_9;
		synchronized (this.aClass41_9) {
			this.aClass41_9.method829();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public void method600() {
		@Pc(2) Class41 local2 = this.aClass41_9;
		synchronized (this.aClass41_9) {
			this.aClass41_9.method826(5);
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	public void method602() {
		@Pc(2) Class41 local2 = this.aClass41_9;
		synchronized (this.aClass41_9) {
			this.aClass41_9.method825();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lclient!cl;")
	public Class39 method603(@OriginalArg(0) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_9;
		@Pc(16) Class39 local16;
		synchronized (this.aClass41_9) {
			local16 = (Class39) this.aClass41_9.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass83_21.method1968(arg0, 31);
		local16 = new Class39();
		if (local38 != null) {
			local16.method734(new Class2_Sub24(local38));
		}
		@Pc(54) Class41 local54 = this.aClass41_9;
		synchronized (this.aClass41_9) {
			this.aClass41_9.method832((long) arg0, local16);
			return local16;
		}
	}
}

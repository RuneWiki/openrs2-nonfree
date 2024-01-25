import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class170 {

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Lclient!co;")
	private final Class41 aClass41_56 = new Class41(64);

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Lclient!g;")
	public final Class83 aClass83_86;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Lclient!g;")
	private final Class83 aClass83_87;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!ci;ILclient!g;Lclient!g;)V")
	public Class170(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class83 arg3) {
		this.aClass83_86 = arg3;
		this.aClass83_87 = arg2;
		this.aClass83_87.method1955(3);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
	public void method4305() {
		@Pc(10) Class41 local10 = this.aClass41_56;
		synchronized (this.aClass41_56) {
			this.aClass41_56.method826(5);
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)Lclient!kg;")
	public Class125 method4307(@OriginalArg(0) int arg0) {
		@Pc(6) Class41 local6 = this.aClass41_56;
		@Pc(16) Class125 local16;
		synchronized (this.aClass41_56) {
			local16 = (Class125) this.aClass41_56.method823((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = this.aClass83_87.method1968(arg0, 3);
		local16 = new Class125();
		local16.aClass170_1 = this;
		if (local41 != null) {
			local16.method3289(new Class2_Sub24(local41));
		}
		@Pc(60) Class41 local60 = this.aClass41_56;
		synchronized (this.aClass41_56) {
			this.aClass41_56.method832((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public void method4308() {
		@Pc(2) Class41 local2 = this.aClass41_56;
		synchronized (this.aClass41_56) {
			this.aClass41_56.method825();
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
	public void method4309() {
		@Pc(7) Class41 local7 = this.aClass41_56;
		synchronized (this.aClass41_56) {
			this.aClass41_56.method829();
		}
	}
}

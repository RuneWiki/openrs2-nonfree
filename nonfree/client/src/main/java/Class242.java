import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class242 {

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!jv;")
	private final Class126 aClass126_56 = new Class126(64);

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!bu;")
	private final Class32 aClass32_81;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class242(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_81 = arg2;
		this.aClass32_81.method790(31);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public void method5193() {
		@Pc(11) Class126 local11 = this.aClass126_56;
		synchronized (this.aClass126_56) {
			this.aClass126_56.method3131();
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public void method5195() {
		@Pc(2) Class126 local2 = this.aClass126_56;
		synchronized (this.aClass126_56) {
			this.aClass126_56.method3135();
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)Lclient!oj;")
	public Class178 method5196(@OriginalArg(0) int arg0) {
		@Pc(14) Class126 local14 = this.aClass126_56;
		@Pc(24) Class178 local24;
		synchronized (this.aClass126_56) {
			local24 = (Class178) this.aClass126_56.method3141((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass32_81.method785(arg0, 31);
		local24 = new Class178();
		if (local41 != null) {
			local24.method4092(new Class3_Sub7(local41));
		}
		@Pc(57) Class126 local57 = this.aClass126_56;
		synchronized (this.aClass126_56) {
			this.aClass126_56.method3132((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
	public void method5197() {
		@Pc(11) Class126 local11 = this.aClass126_56;
		synchronized (this.aClass126_56) {
			this.aClass126_56.method3140(5);
		}
	}
}

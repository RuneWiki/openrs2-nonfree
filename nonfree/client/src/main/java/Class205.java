import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class205 {

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "Lclient!ng;")
	private Class167 aClass167_77 = new Class167(64);

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!ic;")
	private final Class113 aClass113_100;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!ai;ILclient!ic;)V")
	public Class205(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2) {
		this.aClass113_100 = arg2;
		if (this.aClass113_100 != null) {
			@Pc(20) int local20 = this.aClass113_100.method2272() - 1;
			this.aClass113_100.method2271(local20);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Lclient!co;")
	public Class41 method4215(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_77;
		@Pc(18) Class41 local18;
		synchronized (this.aClass167_77) {
			local18 = (Class41) this.aClass167_77.method3386((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(41) byte[] local41 = this.aClass113_100.method2274(Static355.method4560(arg0), Static305.method3977(arg0));
		local18 = new Class41();
		if (local41 != null) {
			local18.method830(new Class1_Sub11(local41));
		}
		@Pc(57) Class167 local57 = this.aClass167_77;
		synchronized (this.aClass167_77) {
			this.aClass167_77.method3392(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)V")
	public void method4216(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_77;
		synchronized (this.aClass167_77) {
			this.aClass167_77.method3390();
			this.aClass167_77 = new Class167(arg0);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	public void method4217() {
		@Pc(2) Class167 local2 = this.aClass167_77;
		synchronized (this.aClass167_77) {
			this.aClass167_77.method3389();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public void method4218() {
		@Pc(6) Class167 local6 = this.aClass167_77;
		synchronized (this.aClass167_77) {
			this.aClass167_77.method3390();
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)V")
	public void method4219() {
		@Pc(6) Class167 local6 = this.aClass167_77;
		synchronized (this.aClass167_77) {
			this.aClass167_77.method3384(5);
		}
	}
}

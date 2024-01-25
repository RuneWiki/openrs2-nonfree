import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class122 {

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "Lclient!jk;")
	private Class137 aClass137_29 = new Class137(64);

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "Lclient!jk;")
	public Class137 aClass137_30 = new Class137(64);

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "Lclient!qn;")
	private final Class211 aClass211_42;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Lclient!qn;")
	public final Class211 aClass211_43;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;Lclient!qn;)V")
	public Class122(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3) {
		this.aClass211_42 = arg2;
		this.aClass211_43 = arg3;
		this.aClass211_42.method4365(34);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
	public void method2321() {
		@Pc(2) Class137 local2 = this.aClass137_29;
		synchronized (this.aClass137_29) {
			this.aClass137_29.method2739();
		}
		local2 = this.aClass137_30;
		synchronized (this.aClass137_30) {
			this.aClass137_30.method2739();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	public void method2322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass137_29 = new Class137(arg1);
		this.aClass137_30 = new Class137(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Lclient!pa;")
	public Class194 method2324(@OriginalArg(1) int arg0) {
		@Pc(12) Class137 local12 = this.aClass137_29;
		@Pc(22) Class194 local22;
		synchronized (this.aClass137_29) {
			local22 = (Class194) this.aClass137_29.method2744((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class211 local35 = this.aClass211_42;
		@Pc(44) byte[] local44;
		synchronized (this.aClass211_42) {
			local44 = this.aClass211_42.method4377(34, arg0);
		}
		local22 = new Class194();
		local22.aClass122_2 = this;
		if (local44 != null) {
			local22.method3887(new Class4_Sub9(local44));
		}
		@Pc(69) Class137 local69 = this.aClass137_29;
		synchronized (this.aClass137_29) {
			this.aClass137_29.method2732((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
	public void method2326() {
		@Pc(6) Class137 local6 = this.aClass137_29;
		synchronized (this.aClass137_29) {
			this.aClass137_29.method2745(5);
		}
		local6 = this.aClass137_30;
		synchronized (this.aClass137_30) {
			this.aClass137_30.method2745(5);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public void method2327() {
		@Pc(7) Class137 local7 = this.aClass137_29;
		synchronized (this.aClass137_29) {
			this.aClass137_29.method2737();
		}
		local7 = this.aClass137_30;
		synchronized (this.aClass137_30) {
			this.aClass137_30.method2737();
		}
	}
}

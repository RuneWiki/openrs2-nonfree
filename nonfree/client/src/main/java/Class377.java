import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class377 {

	@OriginalMember(owner = "client!wba", name = "h", descriptor = "Lclient!jda;")
	private Class165 aClass165_79 = new Class165(64);

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "Lclient!jda;")
	public Class165 aClass165_80 = new Class165(64);

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "Lclient!aj;")
	private final Class15 aClass15_161;

	@OriginalMember(owner = "client!wba", name = "j", descriptor = "Lclient!aj;")
	public final Class15 aClass15_162;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;Lclient!aj;)V")
	public Class377(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Class15 arg3) {
		this.aClass15_161 = arg2;
		this.aClass15_162 = arg3;
		this.aClass15_161.method512(34);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)V")
	public void method9042() {
		@Pc(2) Class165 local2 = this.aClass165_79;
		synchronized (this.aClass165_79) {
			this.aClass165_79.method4394(5);
		}
		local2 = this.aClass165_80;
		synchronized (this.aClass165_80) {
			this.aClass165_80.method4394(5);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
	public void method9043() {
		@Pc(2) Class165 local2 = this.aClass165_79;
		synchronized (this.aClass165_79) {
			this.aClass165_79.method4400();
		}
		local2 = this.aClass165_80;
		synchronized (this.aClass165_80) {
			this.aClass165_80.method4400();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZII)V")
	public void method9044(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass165_79 = new Class165(arg1);
		this.aClass165_80 = new Class165(arg0);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)V")
	public void method9045() {
		@Pc(6) Class165 local6 = this.aClass165_79;
		synchronized (this.aClass165_79) {
			this.aClass165_79.method4403();
		}
		local6 = this.aClass165_80;
		synchronized (this.aClass165_80) {
			this.aClass165_80.method4403();
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IB)Lclient!ko;")
	public Class194 method9048(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_79;
		@Pc(16) Class194 local16;
		synchronized (this.aClass165_79) {
			local16 = (Class194) this.aClass165_79.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_161;
		@Pc(46) byte[] local46;
		synchronized (this.aClass15_161) {
			local46 = this.aClass15_161.method517(arg0, 34);
		}
		local16 = new Class194();
		local16.aClass377_2 = this;
		if (local46 != null) {
			local16.method4874(new Class3_Sub25(local46));
		}
		@Pc(71) Class165 local71 = this.aClass165_79;
		synchronized (this.aClass165_79) {
			this.aClass165_79.method4392(local16, (long) arg0);
			return local16;
		}
	}
}

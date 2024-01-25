import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class86 {

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "Lclient!hn;")
	private final Class102 aClass102_18 = new Class102(64);

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "Lclient!fo;")
	private final Class82 aClass82_33;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class86(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_33 = arg2;
		if (this.aClass82_33 != null) {
			this.aClass82_33.method1823(11);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V")
	public void method1917() {
		@Pc(11) Class102 local11 = this.aClass102_18;
		synchronized (this.aClass102_18) {
			this.aClass102_18.method2262(5);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V")
	public void method1918() {
		@Pc(6) Class102 local6 = this.aClass102_18;
		synchronized (this.aClass102_18) {
			this.aClass102_18.method2260();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BI)Lclient!hu;")
	public Class106 method1919(@OriginalArg(1) int arg0) {
		@Pc(14) Class102 local14 = this.aClass102_18;
		@Pc(24) Class106 local24;
		synchronized (this.aClass102_18) {
			local24 = (Class106) this.aClass102_18.method2258((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class82 local37 = this.aClass82_33;
		@Pc(46) byte[] local46;
		synchronized (this.aClass82_33) {
			local46 = this.aClass82_33.method1817(11, arg0);
		}
		local24 = new Class106();
		if (local46 != null) {
			local24.method2328(new Class1_Sub28(local46));
		}
		@Pc(68) Class102 local68 = this.aClass102_18;
		synchronized (this.aClass102_18) {
			this.aClass102_18.method2272((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
	public void method1921() {
		@Pc(9) Class102 local9 = this.aClass102_18;
		synchronized (this.aClass102_18) {
			this.aClass102_18.method2271();
		}
	}
}

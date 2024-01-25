import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class164 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!dc;")
	private final Class44 aClass44_34 = new Class44(64);

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Lclient!he;")
	private final Class100 aClass100_48;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class164(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_48 = arg2;
		if (this.aClass100_48 != null) {
			this.aClass100_48.method2523(35);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lclient!wf;")
	public Class262 method3820(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_34;
		@Pc(18) Class262 local18;
		synchronized (this.aClass44_34) {
			local18 = (Class262) this.aClass44_34.method1353((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass100_48.method2520(arg0, 35);
		local18 = new Class262();
		if (local35 != null) {
			local18.method6349(new Class6_Sub1(local35));
		}
		local18.method6345();
		@Pc(61) Class44 local61 = this.aClass44_34;
		synchronized (this.aClass44_34) {
			this.aClass44_34.method1349(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public void method3822() {
		@Pc(6) Class44 local6 = this.aClass44_34;
		synchronized (this.aClass44_34) {
			this.aClass44_34.method1351();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public void method3823() {
		@Pc(14) Class44 local14 = this.aClass44_34;
		synchronized (this.aClass44_34) {
			this.aClass44_34.method1348();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V")
	public void method3825() {
		@Pc(6) Class44 local6 = this.aClass44_34;
		synchronized (this.aClass44_34) {
			this.aClass44_34.method1352(5);
		}
	}
}

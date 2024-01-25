import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class110 {

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!au;")
	private final Class21 aClass21_21 = new Class21(64);

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "Lclient!au;")
	public final Class21 aClass21_22 = new Class21(2);

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!mv;")
	public final Class229 aClass229_29;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Lclient!mv;")
	private final Class229 aClass229_28;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;Lclient!mv;)V")
	public Class110(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Class229 arg3) {
		this.aClass229_29 = arg3;
		this.aClass229_28 = arg2;
		this.aClass229_28.method4981(33);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public void method2017() {
		@Pc(2) Class21 local2 = this.aClass21_21;
		synchronized (this.aClass21_21) {
			this.aClass21_21.method314();
		}
		local2 = this.aClass21_22;
		synchronized (this.aClass21_22) {
			this.aClass21_22.method314();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lclient!ev;")
	public Class98 method2018(@OriginalArg(0) int arg0) {
		@Pc(6) Class21 local6 = this.aClass21_21;
		@Pc(16) Class98 local16;
		synchronized (this.aClass21_21) {
			local16 = (Class98) this.aClass21_21.method324((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class229 local29 = this.aClass229_28;
		@Pc(46) byte[] local46;
		synchronized (this.aClass229_28) {
			local46 = this.aClass229_28.method4980(33, arg0);
		}
		local16 = new Class98();
		local16.aClass110_2 = this;
		if (local46 != null) {
			local16.method1768(new Class2_Sub7(local46));
		}
		@Pc(71) Class21 local71 = this.aClass21_21;
		synchronized (this.aClass21_21) {
			this.aClass21_21.method317(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V")
	public void method2020() {
		@Pc(2) Class21 local2 = this.aClass21_21;
		synchronized (this.aClass21_21) {
			this.aClass21_21.method323(5);
		}
		local2 = this.aClass21_22;
		synchronized (this.aClass21_22) {
			this.aClass21_22.method323(5);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
	public void method2021() {
		@Pc(2) Class21 local2 = this.aClass21_21;
		synchronized (this.aClass21_21) {
			this.aClass21_21.method313();
		}
		local2 = this.aClass21_22;
		synchronized (this.aClass21_22) {
			this.aClass21_22.method313();
		}
	}
}

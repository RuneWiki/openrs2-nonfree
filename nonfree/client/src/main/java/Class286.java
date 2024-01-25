import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class286 {

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!au;")
	private final Class21 aClass21_61 = new Class21(64);

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!mv;")
	public final Class229 aClass229_99;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Lclient!mv;")
	private final Class229 aClass229_98;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;Lclient!mv;)V")
	public Class286(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Class229 arg3) {
		this.aClass229_99 = arg3;
		this.aClass229_98 = arg2;
		this.aClass229_98.method4981(3);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)Lclient!nm;")
	public Class240 method5743(@OriginalArg(0) int arg0) {
		@Pc(14) Class21 local14 = this.aClass21_61;
		@Pc(24) Class240 local24;
		synchronized (this.aClass21_61) {
			local24 = (Class240) this.aClass21_61.method324((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class229 local37 = this.aClass229_98;
		@Pc(46) byte[] local46;
		synchronized (this.aClass229_98) {
			local46 = this.aClass229_98.method4980(3, arg0);
		}
		local24 = new Class240();
		local24.aClass286_2 = this;
		if (local46 != null) {
			local24.method5129(new Class2_Sub7(local46));
		}
		@Pc(71) Class21 local71 = this.aClass21_61;
		synchronized (this.aClass21_61) {
			this.aClass21_61.method317(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(IB)V")
	public void method5744() {
		@Pc(12) Class21 local12 = this.aClass21_61;
		synchronized (this.aClass21_61) {
			this.aClass21_61.method323(5);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	public void method5745() {
		@Pc(6) Class21 local6 = this.aClass21_61;
		synchronized (this.aClass21_61) {
			this.aClass21_61.method313();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public void method5748() {
		@Pc(14) Class21 local14 = this.aClass21_61;
		synchronized (this.aClass21_61) {
			this.aClass21_61.method314();
		}
	}
}

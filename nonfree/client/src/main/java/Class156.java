import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class156 {

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!h;")
	private final Class125 aClass125_35 = new Class125(64);

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!an;")
	private final Class16 aClass16_63;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class156(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_63 = arg2;
		this.aClass16_63.method399(31);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!bn;")
	public Class36 method4102(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_35;
		@Pc(16) Class36 local16;
		synchronized (this.aClass125_35) {
			local16 = (Class36) this.aClass125_35.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_63;
		@Pc(38) byte[] local38;
		synchronized (this.aClass16_63) {
			local38 = this.aClass16_63.method408(31, arg0);
		}
		local16 = new Class36();
		if (local38 != null) {
			local16.method847(new Class12_Sub8(local38));
		}
		@Pc(62) Class125 local62 = this.aClass125_35;
		synchronized (this.aClass125_35) {
			this.aClass125_35.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public void method4103() {
		@Pc(2) Class125 local2 = this.aClass125_35;
		synchronized (this.aClass125_35) {
			this.aClass125_35.method3440();
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
	public void method4105() {
		@Pc(10) Class125 local10 = this.aClass125_35;
		synchronized (this.aClass125_35) {
			this.aClass125_35.method3447(5);
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	public void method4106() {
		@Pc(6) Class125 local6 = this.aClass125_35;
		synchronized (this.aClass125_35) {
			this.aClass125_35.method3442();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class258 {

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "Lclient!h;")
	private final Class125 aClass125_57 = new Class125(64);

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "Lclient!an;")
	private final Class16 aClass16_101;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class258(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_101 = arg2;
		if (this.aClass16_101 != null) {
			this.aClass16_101.method399(11);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	public void method6424() {
		@Pc(11) Class125 local11 = this.aClass125_57;
		synchronized (this.aClass125_57) {
			this.aClass125_57.method3440();
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V")
	public void method6425() {
		@Pc(14) Class125 local14 = this.aClass125_57;
		synchronized (this.aClass125_57) {
			this.aClass125_57.method3447(5);
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)Lclient!nc;")
	public Class213 method6426(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_57;
		@Pc(16) Class213 local16;
		synchronized (this.aClass125_57) {
			local16 = (Class213) this.aClass125_57.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class16 local37 = this.aClass16_101;
		@Pc(46) byte[] local46;
		synchronized (this.aClass16_101) {
			local46 = this.aClass16_101.method408(11, arg0);
		}
		local16 = new Class213();
		if (local46 != null) {
			local16.method5075(new Class12_Sub8(local46));
		}
		@Pc(68) Class125 local68 = this.aClass125_57;
		synchronized (this.aClass125_57) {
			this.aClass125_57.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
	public void method6429() {
		@Pc(6) Class125 local6 = this.aClass125_57;
		synchronized (this.aClass125_57) {
			this.aClass125_57.method3442();
		}
	}
}

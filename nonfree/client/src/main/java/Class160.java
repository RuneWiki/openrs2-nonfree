import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class160 {

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!h;")
	private final Class125 aClass125_36 = new Class125(64);

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "Lclient!an;")
	private final Class16 aClass16_64;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class160(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_64 = arg2;
		this.aClass16_64.method399(32);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	public void method4120() {
		@Pc(2) Class125 local2 = this.aClass125_36;
		synchronized (this.aClass125_36) {
			this.aClass125_36.method3447(5);
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)Lclient!ju;")
	public Class166 method4121(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_36;
		@Pc(16) Class166 local16;
		synchronized (this.aClass125_36) {
			local16 = (Class166) this.aClass125_36.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_64;
		@Pc(45) byte[] local45;
		synchronized (this.aClass16_64) {
			local45 = this.aClass16_64.method408(32, arg0);
		}
		local16 = new Class166();
		if (local45 != null) {
			local16.method4183(new Class12_Sub8(local45));
		}
		@Pc(67) Class125 local67 = this.aClass125_36;
		synchronized (this.aClass125_36) {
			this.aClass125_36.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method4124() {
		@Pc(2) Class125 local2 = this.aClass125_36;
		synchronized (this.aClass125_36) {
			this.aClass125_36.method3442();
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
	public void method4127() {
		@Pc(14) Class125 local14 = this.aClass125_36;
		synchronized (this.aClass125_36) {
			this.aClass125_36.method3440();
		}
	}
}

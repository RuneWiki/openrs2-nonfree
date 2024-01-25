import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class78 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!h;")
	private final Class125 aClass125_10 = new Class125(64);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!an;")
	public final Class16 aClass16_24;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!an;")
	private final Class16 aClass16_25;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;Lclient!an;)V")
	public Class78(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class16 arg3) {
		this.aClass16_24 = arg3;
		this.aClass16_25 = arg2;
		this.aClass16_25.method399(3);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Lclient!vt;")
	public Class309 method2172(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_10;
		@Pc(16) Class309 local16;
		synchronized (this.aClass125_10) {
			local16 = (Class309) this.aClass125_10.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_25;
		@Pc(38) byte[] local38;
		synchronized (this.aClass16_25) {
			local38 = this.aClass16_25.method408(3, arg0);
		}
		local16 = new Class309();
		local16.aClass78_2 = this;
		if (local38 != null) {
			local16.method7746(new Class12_Sub8(local38));
		}
		@Pc(63) Class125 local63 = this.aClass125_10;
		synchronized (this.aClass125_10) {
			this.aClass125_10.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public void method2173() {
		@Pc(2) Class125 local2 = this.aClass125_10;
		synchronized (this.aClass125_10) {
			this.aClass125_10.method3440();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	public void method2174() {
		@Pc(6) Class125 local6 = this.aClass125_10;
		synchronized (this.aClass125_10) {
			this.aClass125_10.method3447(5);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	public void method2175() {
		@Pc(6) Class125 local6 = this.aClass125_10;
		synchronized (this.aClass125_10) {
			this.aClass125_10.method3442();
		}
	}
}

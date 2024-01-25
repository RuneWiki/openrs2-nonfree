import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class69 {

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Lclient!hp;")
	private final Class125 aClass125_16 = new Class125(64);

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!kea;")
	public final Class161 aClass161_24;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!kea;")
	private final Class161 aClass161_23;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;Lclient!kea;)V")
	public Class69(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Class161 arg3) {
		this.aClass161_24 = arg3;
		this.aClass161_23 = arg2;
		this.aClass161_23.method4266(3);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
	public void method2056() {
		@Pc(7) Class125 local7 = this.aClass125_16;
		synchronized (this.aClass125_16) {
			this.aClass125_16.method3522(5);
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	public void method2059() {
		@Pc(2) Class125 local2 = this.aClass125_16;
		synchronized (this.aClass125_16) {
			this.aClass125_16.method3516();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public void method2060() {
		@Pc(6) Class125 local6 = this.aClass125_16;
		synchronized (this.aClass125_16) {
			this.aClass125_16.method3521();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)Lclient!jg;")
	public Class148 method2061(@OriginalArg(0) int arg0) {
		@Pc(11) Class125 local11 = this.aClass125_16;
		@Pc(21) Class148 local21;
		synchronized (this.aClass125_16) {
			local21 = (Class148) this.aClass125_16.method3512((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class161 local34 = this.aClass161_23;
		@Pc(43) byte[] local43;
		synchronized (this.aClass161_23) {
			local43 = this.aClass161_23.method4243(arg0, 3);
		}
		local21 = new Class148();
		local21.aClass69_1 = this;
		if (local43 != null) {
			local21.method4049(new Class3_Sub27(local43));
		}
		@Pc(68) Class125 local68 = this.aClass125_16;
		synchronized (this.aClass125_16) {
			this.aClass125_16.method3519((long) arg0, local21);
			return local21;
		}
	}
}

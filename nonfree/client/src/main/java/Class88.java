import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class88 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!hp;")
	private final Class125 aClass125_19 = new Class125(64);

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "Lclient!hp;")
	public final Class125 aClass125_20 = new Class125(2);

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!kea;")
	private final Class161 aClass161_27;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!kea;")
	public final Class161 aClass161_26;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;Lclient!kea;)V")
	public Class88(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Class161 arg3) {
		this.aClass161_27 = arg2;
		this.aClass161_26 = arg3;
		this.aClass161_27.method4266(33);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
	public void method2309() {
		@Pc(2) Class125 local2 = this.aClass125_19;
		synchronized (this.aClass125_19) {
			this.aClass125_19.method3522(5);
		}
		local2 = this.aClass125_20;
		synchronized (this.aClass125_20) {
			this.aClass125_20.method3522(5);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lclient!lt;")
	public Class183 method2310(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_19;
		@Pc(16) Class183 local16;
		synchronized (this.aClass125_19) {
			local16 = (Class183) this.aClass125_19.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_27;
		@Pc(38) byte[] local38;
		synchronized (this.aClass161_27) {
			local38 = this.aClass161_27.method4243(arg0, 33);
		}
		local16 = new Class183();
		local16.aClass88_2 = this;
		if (local38 != null) {
			local16.method4852(new Class3_Sub27(local38));
		}
		@Pc(63) Class125 local63 = this.aClass125_19;
		synchronized (this.aClass125_19) {
			this.aClass125_19.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public void method2312() {
		@Pc(6) Class125 local6 = this.aClass125_19;
		synchronized (this.aClass125_19) {
			this.aClass125_19.method3521();
		}
		local6 = this.aClass125_20;
		synchronized (this.aClass125_20) {
			this.aClass125_20.method3521();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public void method2313() {
		@Pc(2) Class125 local2 = this.aClass125_19;
		synchronized (this.aClass125_19) {
			this.aClass125_19.method3516();
		}
		local2 = this.aClass125_20;
		synchronized (this.aClass125_20) {
			this.aClass125_20.method3516();
		}
	}
}

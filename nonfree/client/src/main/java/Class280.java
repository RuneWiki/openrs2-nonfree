import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class280 {

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "Lclient!hp;")
	private Class125 aClass125_55 = new Class125(64);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient!kea;")
	private final Class161 aClass161_99;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class280(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_99 = arg2;
		if (this.aClass161_99 != null) {
			@Pc(20) int local20 = this.aClass161_99.method4239() - 1;
			this.aClass161_99.method4266(local20);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lclient!mn;")
	public Class194 method6912(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_55;
		@Pc(16) Class194 local16;
		synchronized (this.aClass125_55) {
			local16 = (Class194) this.aClass125_55.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_99;
		@Pc(44) byte[] local44;
		synchronized (this.aClass161_99) {
			local44 = this.aClass161_99.method4243(Static309.method170(arg0), Static252.method4321(arg0));
		}
		local16 = new Class194();
		if (local44 != null) {
			local16.method5025(new Class3_Sub27(local44));
		}
		@Pc(66) Class125 local66 = this.aClass125_55;
		synchronized (this.aClass125_55) {
			this.aClass125_55.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public void method6913() {
		@Pc(6) Class125 local6 = this.aClass125_55;
		synchronized (this.aClass125_55) {
			this.aClass125_55.method3516();
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public void method6915() {
		@Pc(12) Class125 local12 = this.aClass125_55;
		synchronized (this.aClass125_55) {
			this.aClass125_55.method3521();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
	public void method6917() {
		@Pc(6) Class125 local6 = this.aClass125_55;
		synchronized (this.aClass125_55) {
			this.aClass125_55.method3522(5);
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
	public void method6919(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_55;
		synchronized (this.aClass125_55) {
			this.aClass125_55.method3521();
			this.aClass125_55 = new Class125(arg0);
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class132 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!hp;")
	private final Class125 aClass125_30 = new Class125(64);

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Lclient!kea;")
	private final Class161 aClass161_45;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class132(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_45 = arg2;
		this.aClass161_45.method4266(32);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public void method3750() {
		@Pc(2) Class125 local2 = this.aClass125_30;
		synchronized (this.aClass125_30) {
			this.aClass125_30.method3522(5);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public void method3752() {
		@Pc(2) Class125 local2 = this.aClass125_30;
		synchronized (this.aClass125_30) {
			this.aClass125_30.method3521();
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public void method3754() {
		@Pc(6) Class125 local6 = this.aClass125_30;
		synchronized (this.aClass125_30) {
			this.aClass125_30.method3516();
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)Lclient!ei;")
	public Class73 method3756(@OriginalArg(1) int arg0) {
		@Pc(14) Class125 local14 = this.aClass125_30;
		@Pc(24) Class73 local24;
		synchronized (this.aClass125_30) {
			local24 = (Class73) this.aClass125_30.method3512((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class161 local37 = this.aClass161_45;
		@Pc(46) byte[] local46;
		synchronized (this.aClass161_45) {
			local46 = this.aClass161_45.method4243(arg0, 32);
		}
		local24 = new Class73();
		if (local46 != null) {
			local24.method2118(new Class3_Sub27(local46));
		}
		@Pc(68) Class125 local68 = this.aClass125_30;
		synchronized (this.aClass125_30) {
			this.aClass125_30.method3519((long) arg0, local24);
			return local24;
		}
	}
}

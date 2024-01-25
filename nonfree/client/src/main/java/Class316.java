import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class316 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!hp;")
	private final Class125 aClass125_69 = new Class125(64);

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!kea;")
	private final Class161 aClass161_117;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class316(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_117 = arg2;
		this.aClass161_117.method4266(31);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public void method7630() {
		@Pc(2) Class125 local2 = this.aClass125_69;
		synchronized (this.aClass125_69) {
			this.aClass125_69.method3521();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V")
	public void method7631() {
		@Pc(14) Class125 local14 = this.aClass125_69;
		synchronized (this.aClass125_69) {
			this.aClass125_69.method3522(5);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lclient!bf;")
	public Class28 method7632(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_69;
		@Pc(18) Class28 local18;
		synchronized (this.aClass125_69) {
			local18 = (Class28) this.aClass125_69.method3512((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class161 local31 = this.aClass161_117;
		@Pc(40) byte[] local40;
		synchronized (this.aClass161_117) {
			local40 = this.aClass161_117.method4243(arg0, 31);
		}
		local18 = new Class28();
		if (local40 != null) {
			local18.method832(new Class3_Sub27(local40));
		}
		@Pc(62) Class125 local62 = this.aClass125_69;
		synchronized (this.aClass125_69) {
			this.aClass125_69.method3519((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
	public void method7634() {
		@Pc(2) Class125 local2 = this.aClass125_69;
		synchronized (this.aClass125_69) {
			this.aClass125_69.method3516();
		}
	}
}

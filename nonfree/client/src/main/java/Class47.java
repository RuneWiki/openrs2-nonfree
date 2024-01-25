import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class47 {

	@OriginalMember(owner = "client!cca", name = "j", descriptor = "Lclient!h;")
	private final Class125 aClass125_7 = new Class125(128);

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "Lclient!an;")
	private final Class16 aClass16_11;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class47(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_11 = arg2;
		this.aClass16_11.method399(1);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
	public void method1416() {
		@Pc(6) Class125 local6 = this.aClass125_7;
		synchronized (this.aClass125_7) {
			this.aClass125_7.method3440();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)V")
	public void method1417() {
		@Pc(10) Class125 local10 = this.aClass125_7;
		synchronized (this.aClass125_7) {
			this.aClass125_7.method3447(5);
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)Lclient!go;")
	public Class120 method1418(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_7;
		@Pc(16) Class120 local16;
		synchronized (this.aClass125_7) {
			local16 = (Class120) this.aClass125_7.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_11;
		@Pc(38) byte[] local38;
		synchronized (this.aClass16_11) {
			local38 = this.aClass16_11.method408(1, arg0);
		}
		local16 = new Class120();
		if (local38 != null) {
			local16.method3354(new Class12_Sub8(local38));
		}
		@Pc(60) Class125 local60 = this.aClass125_7;
		synchronized (this.aClass125_7) {
			this.aClass125_7.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
	public void method1421() {
		@Pc(6) Class125 local6 = this.aClass125_7;
		synchronized (this.aClass125_7) {
			this.aClass125_7.method3442();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class275 {

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "Lclient!hp;")
	private final Class125 aClass125_54 = new Class125(64);

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "Lclient!kea;")
	private final Class161 aClass161_98;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class275(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_98 = arg2;
		this.aClass161_98.method4266(5);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)Lclient!kda;")
	public Class3_Sub10_Sub11 method6842(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_54;
		@Pc(16) Class3_Sub10_Sub11 local16;
		synchronized (this.aClass125_54) {
			local16 = (Class3_Sub10_Sub11) this.aClass125_54.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_98;
		@Pc(38) byte[] local38;
		synchronized (this.aClass161_98) {
			local38 = this.aClass161_98.method4243(arg0, 5);
		}
		local16 = new Class3_Sub10_Sub11();
		if (local38 != null) {
			local16.method4226(new Class3_Sub27(local38));
		}
		@Pc(60) Class125 local60 = this.aClass125_54;
		synchronized (this.aClass125_54) {
			this.aClass125_54.method3519((long) arg0, local16);
			return local16;
		}
	}
}

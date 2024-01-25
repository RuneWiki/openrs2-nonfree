import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class93 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "Lclient!h;")
	private Class125 aClass125_11 = new Class125(128);

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!h;")
	public Class125 aClass125_12 = new Class125(64);

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "Lclient!an;")
	private final Class16 aClass16_31;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "Lclient!an;")
	public final Class16 aClass16_30;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;Lclient!an;)V")
	public Class93(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class16 arg3) {
		this.aClass16_31 = arg2;
		this.aClass16_30 = arg3;
		this.aClass16_31.method399(36);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V")
	public void method2476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass125_11 = new Class125(arg0);
		this.aClass125_12 = new Class125(arg1);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V")
	public void method2478() {
		@Pc(2) Class125 local2 = this.aClass125_11;
		synchronized (this.aClass125_11) {
			this.aClass125_11.method3442();
		}
		local2 = this.aClass125_12;
		synchronized (this.aClass125_12) {
			this.aClass125_12.method3442();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Lclient!j;")
	public Class152 method2480(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_11;
		@Pc(16) Class152 local16;
		synchronized (this.aClass125_11) {
			local16 = (Class152) this.aClass125_11.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_31;
		@Pc(38) byte[] local38;
		synchronized (this.aClass16_31) {
			local38 = this.aClass16_31.method408(36, arg0);
		}
		local16 = new Class152();
		local16.aClass93_4 = this;
		local16.anInt4753 = arg0;
		if (local38 != null) {
			local16.method4027(new Class12_Sub8(local38));
		}
		local16.method4024();
		@Pc(75) Class125 local75 = this.aClass125_11;
		synchronized (this.aClass125_11) {
			this.aClass125_11.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public void method2481() {
		@Pc(6) Class125 local6 = this.aClass125_11;
		synchronized (this.aClass125_11) {
			this.aClass125_11.method3440();
		}
		@Pc(29) Class125 local29 = this.aClass125_12;
		synchronized (this.aClass125_12) {
			this.aClass125_12.method3440();
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V")
	public void method2482() {
		@Pc(12) Class125 local12 = this.aClass125_11;
		synchronized (this.aClass125_11) {
			this.aClass125_11.method3447(5);
		}
		local12 = this.aClass125_12;
		synchronized (this.aClass125_12) {
			this.aClass125_12.method3447(5);
		}
	}
}

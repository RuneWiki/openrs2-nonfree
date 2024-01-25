import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class247 {

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!hp;")
	private final Class125 aClass125_47 = new Class125(64);

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "Lclient!hp;")
	private final Class125 aClass125_48 = new Class125(100);

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!kea;")
	private final Class161 aClass161_89;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;Lclient!kea;Lclient!kea;)V")
	public Class247(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Class161 arg3, @OriginalArg(4) Class161 arg4) {
		this.aClass161_89 = arg2;
		if (this.aClass161_89 != null) {
			@Pc(26) int local26 = this.aClass161_89.method4239() - 1;
			this.aClass161_89.method4266(local26);
		}
		Static529.method7624(arg3, arg4);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!hi;")
	public Class122 method6029(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_47;
		@Pc(16) Class122 local16;
		synchronized (this.aClass125_47) {
			local16 = (Class122) this.aClass125_47.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_89;
		@Pc(44) byte[] local44;
		synchronized (this.aClass161_89) {
			local44 = this.aClass161_89.method4243(Static7.method548(arg0), Static314.method5092(arg0));
		}
		local16 = new Class122();
		local16.anInt4150 = arg0;
		local16.aClass247_2 = this;
		if (local44 != null) {
			local16.method3443(new Class3_Sub27(local44));
		}
		local16.method3440();
		@Pc(82) Class125 local82 = this.aClass125_47;
		synchronized (this.aClass125_47) {
			this.aClass125_47.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	public void method6031() {
		@Pc(6) Class125 local6 = this.aClass125_47;
		synchronized (this.aClass125_47) {
			this.aClass125_47.method3516();
		}
		local6 = this.aClass125_48;
		synchronized (this.aClass125_48) {
			this.aClass125_48.method3516();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)Lclient!gea;")
	public Class3_Sub10_Sub6 method6032(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_48;
		@Pc(16) Class3_Sub10_Sub6 local16;
		synchronized (this.aClass125_48) {
			local16 = (Class3_Sub10_Sub6) this.aClass125_48.method3512((long) arg0);
			if (local16 == null) {
				local16 = new Class3_Sub10_Sub6(arg0);
				this.aClass125_48.method3519((long) arg0, local16);
			}
		}
		synchronized (local16) {
			return local16.method2663() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	public void method6034() {
		@Pc(6) Class125 local6 = this.aClass125_47;
		synchronized (this.aClass125_47) {
			this.aClass125_47.method3521();
		}
		local6 = this.aClass125_48;
		synchronized (this.aClass125_48) {
			this.aClass125_48.method3521();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V")
	public void method6035() {
		@Pc(6) Class125 local6 = this.aClass125_47;
		synchronized (this.aClass125_47) {
			this.aClass125_47.method3522(5);
		}
		local6 = this.aClass125_48;
		synchronized (this.aClass125_48) {
			this.aClass125_48.method3522(5);
		}
	}
}

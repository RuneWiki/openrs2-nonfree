import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class309 {

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "Lclient!hp;")
	private final Class125 aClass125_65 = new Class125(64);

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "Lclient!kea;")
	private final Class161 aClass161_115;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
	public final int anInt9031;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class309(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_115 = arg2;
		if (this.aClass161_115 == null) {
			this.anInt9031 = 0;
		} else {
			this.anInt9031 = this.aClass161_115.method4266(16);
		}
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V")
	public void method7400() {
		@Pc(7) Class125 local7 = this.aClass125_65;
		synchronized (this.aClass125_65) {
			this.aClass125_65.method3516();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZ)V")
	public void method7401() {
		@Pc(2) Class125 local2 = this.aClass125_65;
		synchronized (this.aClass125_65) {
			this.aClass125_65.method3522(5);
		}
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V")
	public void method7403() {
		@Pc(2) Class125 local2 = this.aClass125_65;
		synchronized (this.aClass125_65) {
			this.aClass125_65.method3521();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)Lclient!bu;")
	public Class38 method7404(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_65;
		@Pc(16) Class38 local16;
		synchronized (this.aClass125_65) {
			local16 = (Class38) this.aClass125_65.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_115;
		@Pc(38) byte[] local38;
		synchronized (this.aClass161_115) {
			local38 = this.aClass161_115.method4243(arg0, 16);
		}
		local16 = new Class38();
		if (local38 != null) {
			local16.method982(new Class3_Sub27(local38));
		}
		@Pc(60) Class125 local60 = this.aClass125_65;
		synchronized (this.aClass125_65) {
			this.aClass125_65.method3519((long) arg0, local16);
			return local16;
		}
	}
}

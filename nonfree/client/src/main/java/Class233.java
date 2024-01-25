import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class233 {

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "Lclient!hp;")
	private final Class125 aClass125_46 = new Class125(64);

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
	public int anInt7080 = 0;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "Lclient!kea;")
	private final Class161 aClass161_87;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	public final int anInt7077;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class233(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_87 = arg2;
		this.anInt7077 = this.aClass161_87.method4266(4);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
	public void method5909() {
		@Pc(6) Class125 local6 = this.aClass125_46;
		synchronized (this.aClass125_46) {
			this.aClass125_46.method3522(5);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)Lclient!qba;")
	public Class240 method5910(@OriginalArg(1) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_46;
		@Pc(16) Class240 local16;
		synchronized (this.aClass125_46) {
			local16 = (Class240) this.aClass125_46.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_87;
		@Pc(47) byte[] local47;
		synchronized (this.aClass161_87) {
			local47 = this.aClass161_87.method4243(arg0, 4);
		}
		local16 = new Class240();
		local16.aClass233_6 = this;
		local16.anInt7143 = arg0;
		if (local47 != null) {
			local16.method5963(new Class3_Sub27(local47));
		}
		local16.method5962();
		@Pc(78) Class125 local78 = this.aClass125_46;
		synchronized (this.aClass125_46) {
			this.aClass125_46.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public void method5913() {
		@Pc(6) Class125 local6 = this.aClass125_46;
		synchronized (this.aClass125_46) {
			this.aClass125_46.method3516();
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
	public void method5914() {
		@Pc(6) Class125 local6 = this.aClass125_46;
		synchronized (this.aClass125_46) {
			this.aClass125_46.method3521();
		}
	}
}

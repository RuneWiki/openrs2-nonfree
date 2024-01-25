import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class135 {

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Lclient!hp;")
	private Class125 aClass125_31 = new Class125(128);

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Lclient!hp;")
	public Class125 aClass125_32 = new Class125(64);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Lclient!kea;")
	private final Class161 aClass161_47;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "Lclient!kea;")
	public final Class161 aClass161_48;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;Lclient!kea;)V")
	public Class135(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Class161 arg3) {
		this.aClass161_47 = arg2;
		this.aClass161_48 = arg3;
		this.aClass161_47.method4266(36);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	public void method3800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass125_31 = new Class125(arg0);
		this.aClass125_32 = new Class125(arg1);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Lclient!lm;")
	public Class179 method3801(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_31;
		@Pc(16) Class179 local16;
		synchronized (this.aClass125_31) {
			local16 = (Class179) this.aClass125_31.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_47;
		@Pc(38) byte[] local38;
		synchronized (this.aClass161_47) {
			local38 = this.aClass161_47.method4243(arg0, 36);
		}
		local16 = new Class179();
		local16.anInt5713 = arg0;
		local16.aClass135_3 = this;
		if (local38 != null) {
			local16.method4794(new Class3_Sub27(local38));
		}
		local16.method4802();
		@Pc(69) Class125 local69 = this.aClass125_31;
		synchronized (this.aClass125_31) {
			this.aClass125_31.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)V")
	public void method3802() {
		@Pc(10) Class125 local10 = this.aClass125_31;
		synchronized (this.aClass125_31) {
			this.aClass125_31.method3522(5);
		}
		local10 = this.aClass125_32;
		synchronized (this.aClass125_32) {
			this.aClass125_32.method3522(5);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public void method3804() {
		@Pc(2) Class125 local2 = this.aClass125_31;
		synchronized (this.aClass125_31) {
			this.aClass125_31.method3516();
		}
		local2 = this.aClass125_32;
		synchronized (this.aClass125_32) {
			this.aClass125_32.method3516();
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
	public void method3807() {
		@Pc(6) Class125 local6 = this.aClass125_31;
		synchronized (this.aClass125_31) {
			this.aClass125_31.method3521();
		}
		local6 = this.aClass125_32;
		synchronized (this.aClass125_32) {
			this.aClass125_32.method3521();
		}
	}
}

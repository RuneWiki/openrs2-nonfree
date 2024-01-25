import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class198 {

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!hp;")
	private Class125 aClass125_41 = new Class125(64);

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Lclient!hp;")
	public Class125 aClass125_42 = new Class125(64);

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!kea;")
	private final Class161 aClass161_62;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!kea;")
	public final Class161 aClass161_63;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;Lclient!kea;)V")
	public Class198(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Class161 arg3) {
		this.aClass161_62 = arg2;
		this.aClass161_63 = arg3;
		this.aClass161_62.method4266(34);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public void method5090() {
		@Pc(2) Class125 local2 = this.aClass125_41;
		synchronized (this.aClass125_41) {
			this.aClass125_41.method3516();
		}
		local2 = this.aClass125_42;
		synchronized (this.aClass125_42) {
			this.aClass125_42.method3516();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lclient!bl;")
	public Class32 method5094(@OriginalArg(1) int arg0) {
		@Pc(14) Class125 local14 = this.aClass125_41;
		@Pc(24) Class32 local24;
		synchronized (this.aClass125_41) {
			local24 = (Class32) this.aClass125_41.method3512((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class161 local37 = this.aClass161_62;
		@Pc(46) byte[] local46;
		synchronized (this.aClass161_62) {
			local46 = this.aClass161_62.method4243(arg0, 34);
		}
		local24 = new Class32();
		local24.aClass198_3 = this;
		if (local46 != null) {
			local24.method896(new Class3_Sub27(local46));
		}
		@Pc(71) Class125 local71 = this.aClass125_41;
		synchronized (this.aClass125_41) {
			this.aClass125_41.method3519((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public void method5095() {
		@Pc(2) Class125 local2 = this.aClass125_41;
		synchronized (this.aClass125_41) {
			this.aClass125_41.method3521();
		}
		local2 = this.aClass125_42;
		synchronized (this.aClass125_42) {
			this.aClass125_42.method3521();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	public void method5096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass125_41 = new Class125(arg1);
		this.aClass125_42 = new Class125(arg0);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
	public void method5098() {
		@Pc(14) Class125 local14 = this.aClass125_41;
		synchronized (this.aClass125_41) {
			this.aClass125_41.method3522(5);
		}
		local14 = this.aClass125_42;
		synchronized (this.aClass125_42) {
			this.aClass125_42.method3522(5);
		}
	}
}

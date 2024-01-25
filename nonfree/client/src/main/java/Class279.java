import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class279 {

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!aj;")
	private final Class10 aClass10_46 = new Class10(64);

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!aj;")
	private final Class10 aClass10_47 = new Class10(100);

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!om;")
	private final Class246 aClass246_207;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;Lclient!om;Lclient!om;)V")
	public Class279(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3, @OriginalArg(4) Class246 arg4) {
		this.aClass246_207 = arg2;
		if (this.aClass246_207 != null) {
			@Pc(26) int local26 = this.aClass246_207.method5682() - 1;
			this.aClass246_207.method5673(local26);
		}
		Static59.method4460(arg3, arg4);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public void method6215() {
		@Pc(6) Class10 local6 = this.aClass10_46;
		synchronized (this.aClass10_46) {
			this.aClass10_46.method262();
		}
		local6 = this.aClass10_47;
		synchronized (this.aClass10_47) {
			this.aClass10_47.method262();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)Lclient!as;")
	public Class17 method6216(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_46;
		@Pc(16) Class17 local16;
		synchronized (this.aClass10_46) {
			local16 = (Class17) this.aClass10_46.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_207;
		@Pc(42) byte[] local42;
		synchronized (this.aClass246_207) {
			local42 = this.aClass246_207.method5653(Static538.method7094(arg0), Static97.method2099(arg0));
		}
		local16 = new Class17();
		local16.aClass279_1 = this;
		local16.anInt561 = arg0;
		if (local42 != null) {
			local16.method449(new Class3_Sub11(local42));
		}
		local16.method454();
		@Pc(73) Class10 local73 = this.aClass10_46;
		synchronized (this.aClass10_46) {
			this.aClass10_46.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method6217() {
		@Pc(2) Class10 local2 = this.aClass10_46;
		synchronized (this.aClass10_46) {
			this.aClass10_46.method263();
		}
		local2 = this.aClass10_47;
		synchronized (this.aClass10_47) {
			this.aClass10_47.method263();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
	public void method6219() {
		@Pc(6) Class10 local6 = this.aClass10_46;
		synchronized (this.aClass10_46) {
			this.aClass10_46.method258(5);
		}
		local6 = this.aClass10_47;
		synchronized (this.aClass10_47) {
			this.aClass10_47.method258(5);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)Lclient!rc;")
	public Class3_Sub3_Sub15 method6220(@OriginalArg(0) int arg0) {
		@Pc(11) Class10 local11 = this.aClass10_47;
		synchronized (this.aClass10_47) {
			@Pc(23) Class3_Sub3_Sub15 local23 = (Class3_Sub3_Sub15) this.aClass10_47.method250((long) arg0);
			if (local23 == null) {
				local23 = new Class3_Sub3_Sub15(arg0);
				this.aClass10_47.method254(local23, (long) arg0);
			}
			return local23.method6249() ? local23 : null;
		}
	}
}

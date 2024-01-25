import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class120 {

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "Lclient!d;")
	private final Class44 aClass44_31 = new Class44(64);

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "Lclient!um;")
	private final Class243 aClass243_105;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "Lclient!um;")
	public final Class243 aClass243_106;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;Lclient!um;)V")
	public Class120(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) Class243 arg3) {
		this.aClass243_105 = arg2;
		this.aClass243_106 = arg3;
		this.aClass243_105.method5472(3);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)Lclient!jo;")
	public Class128 method2534(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_31;
		@Pc(16) Class128 local16;
		synchronized (this.aClass44_31) {
			local16 = (Class128) this.aClass44_31.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_105;
		@Pc(38) byte[] local38;
		synchronized (this.aClass243_105) {
			local38 = this.aClass243_105.method5455(arg0, 3);
		}
		local16 = new Class128();
		local16.aClass120_1 = this;
		if (local38 != null) {
			local16.method2691(new Class5_Sub15(local38));
		}
		@Pc(70) Class44 local70 = this.aClass44_31;
		synchronized (this.aClass44_31) {
			this.aClass44_31.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
	public void method2535() {
		@Pc(6) Class44 local6 = this.aClass44_31;
		synchronized (this.aClass44_31) {
			this.aClass44_31.method1031();
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	public void method2538() {
		@Pc(6) Class44 local6 = this.aClass44_31;
		synchronized (this.aClass44_31) {
			this.aClass44_31.method1024();
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)V")
	public void method2539() {
		@Pc(6) Class44 local6 = this.aClass44_31;
		synchronized (this.aClass44_31) {
			this.aClass44_31.method1025(5);
		}
	}
}

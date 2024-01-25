import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class149 {

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!d;")
	private final Class44 aClass44_34 = new Class44(64);

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!um;")
	private final Class243 aClass243_127;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class149(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_127 = arg2;
		this.aClass243_127.method5472(32);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public void method3041() {
		@Pc(9) Class44 local9 = this.aClass44_34;
		synchronized (this.aClass44_34) {
			this.aClass44_34.method1031();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)Lclient!ka;")
	public Class133 method3043(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_34;
		@Pc(16) Class133 local16;
		synchronized (this.aClass44_34) {
			local16 = (Class133) this.aClass44_34.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_127;
		@Pc(38) byte[] local38;
		synchronized (this.aClass243_127) {
			local38 = this.aClass243_127.method5455(arg0, 32);
		}
		local16 = new Class133();
		if (local38 != null) {
			local16.method2807(new Class5_Sub15(local38));
		}
		@Pc(60) Class44 local60 = this.aClass44_34;
		synchronized (this.aClass44_34) {
			this.aClass44_34.method1017((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public void method3044() {
		@Pc(2) Class44 local2 = this.aClass44_34;
		synchronized (this.aClass44_34) {
			this.aClass44_34.method1024();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
	public void method3046() {
		@Pc(6) Class44 local6 = this.aClass44_34;
		synchronized (this.aClass44_34) {
			this.aClass44_34.method1025(5);
		}
	}
}

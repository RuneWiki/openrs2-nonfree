import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class305 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!mf;")
	private final Class222 aClass222_53 = new Class222(64);

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!pu;")
	private final Class270 aClass270_100;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class305(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_100 = arg2;
		this.aClass270_100.method5685(32);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
	public void method6488() {
		@Pc(2) Class222 local2 = this.aClass222_53;
		synchronized (this.aClass222_53) {
			this.aClass222_53.method4433(5);
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Lclient!hk;")
	public Class140 method6490(@OriginalArg(0) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_53;
		@Pc(16) Class140 local16;
		synchronized (this.aClass222_53) {
			local16 = (Class140) this.aClass222_53.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_100;
		@Pc(38) byte[] local38;
		synchronized (this.aClass270_100) {
			local38 = this.aClass270_100.method5704(32, arg0);
		}
		local16 = new Class140();
		if (local38 != null) {
			local16.method2959(new Class1_Sub35(local38));
		}
		@Pc(60) Class222 local60 = this.aClass222_53;
		synchronized (this.aClass222_53) {
			this.aClass222_53.method4434(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
	public void method6491() {
		@Pc(2) Class222 local2 = this.aClass222_53;
		synchronized (this.aClass222_53) {
			this.aClass222_53.method4422();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	public void method6492() {
		@Pc(12) Class222 local12 = this.aClass222_53;
		synchronized (this.aClass222_53) {
			this.aClass222_53.method4428();
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class279 {

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "Lclient!mf;")
	private final Class222 aClass222_51 = new Class222(16);

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "Lclient!pu;")
	private final Class270 aClass270_94;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class279(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_94 = arg2;
		this.aClass270_94.method5685(30);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)Lclient!uca;")
	public Class325 method6095(@OriginalArg(1) int arg0) {
		@Pc(12) Class222 local12 = this.aClass222_51;
		@Pc(22) Class325 local22;
		synchronized (this.aClass222_51) {
			local22 = (Class325) this.aClass222_51.method4430((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class270 local35 = this.aClass270_94;
		@Pc(44) byte[] local44;
		synchronized (this.aClass270_94) {
			local44 = this.aClass270_94.method5704(30, arg0);
		}
		local22 = new Class325();
		if (local44 != null) {
			local22.method7231(new Class1_Sub35(local44));
		}
		@Pc(66) Class222 local66 = this.aClass222_51;
		synchronized (this.aClass222_51) {
			this.aClass222_51.method4434(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
	public void method6096() {
		@Pc(2) Class222 local2 = this.aClass222_51;
		synchronized (this.aClass222_51) {
			this.aClass222_51.method4422();
		}
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V")
	public void method6100() {
		@Pc(2) Class222 local2 = this.aClass222_51;
		synchronized (this.aClass222_51) {
			this.aClass222_51.method4428();
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)V")
	public void method6101() {
		@Pc(6) Class222 local6 = this.aClass222_51;
		synchronized (this.aClass222_51) {
			this.aClass222_51.method4433(5);
		}
	}
}

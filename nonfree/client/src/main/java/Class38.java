import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class38 {

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "Lclient!mf;")
	private final Class222 aClass222_4 = new Class222(64);

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "Lclient!pu;")
	private final Class270 aClass270_12;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class38(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_12 = arg2;
		if (this.aClass270_12 != null) {
			this.aClass270_12.method5685(11);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)V")
	public void method710() {
		@Pc(2) Class222 local2 = this.aClass222_4;
		synchronized (this.aClass222_4) {
			this.aClass222_4.method4433(5);
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
	public void method711() {
		@Pc(6) Class222 local6 = this.aClass222_4;
		synchronized (this.aClass222_4) {
			this.aClass222_4.method4422();
		}
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)V")
	public void method712() {
		@Pc(2) Class222 local2 = this.aClass222_4;
		synchronized (this.aClass222_4) {
			this.aClass222_4.method4428();
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)Lclient!gga;")
	public Class120 method713(@OriginalArg(0) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_4;
		@Pc(16) Class120 local16;
		synchronized (this.aClass222_4) {
			local16 = (Class120) this.aClass222_4.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_12;
		@Pc(38) byte[] local38;
		synchronized (this.aClass270_12) {
			local38 = this.aClass270_12.method5704(11, arg0);
		}
		local16 = new Class120();
		if (local38 != null) {
			local16.method2387(new Class1_Sub35(local38));
		}
		@Pc(65) Class222 local65 = this.aClass222_4;
		synchronized (this.aClass222_4) {
			this.aClass222_4.method4434(local16, (long) arg0);
			return local16;
		}
	}
}

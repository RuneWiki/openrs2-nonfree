import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class225 {

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!oo;")
	private Class264 aClass264_41 = new Class264(64);

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!wia;")
	private final Class386 aClass386_84;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class225(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_84 = arg2;
		if (this.aClass386_84 != null) {
			@Pc(20) int local20 = this.aClass386_84.method9189() - 1;
			this.aClass386_84.method9210(local20);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public void method5329() {
		@Pc(2) Class264 local2 = this.aClass264_41;
		synchronized (this.aClass264_41) {
			this.aClass264_41.method6366(5);
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
	public void method5330(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_41;
		synchronized (this.aClass264_41) {
			this.aClass264_41.method6360();
			this.aClass264_41 = new Class264(arg0);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public void method5331() {
		@Pc(8) Class264 local8 = this.aClass264_41;
		synchronized (this.aClass264_41) {
			this.aClass264_41.method6368();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)Lclient!mfa;")
	public Class231 method5332(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_41;
		@Pc(22) Class231 local22;
		synchronized (this.aClass264_41) {
			local22 = (Class231) this.aClass264_41.method6367((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class386 local35 = this.aClass386_84;
		@Pc(48) byte[] local48;
		synchronized (this.aClass386_84) {
			local48 = this.aClass386_84.method9196(Static404.method6008(arg0), Static343.method5287(arg0));
		}
		local22 = new Class231();
		if (local48 != null) {
			local22.method5489(new Class14_Sub29(local48));
		}
		@Pc(70) Class264 local70 = this.aClass264_41;
		synchronized (this.aClass264_41) {
			this.aClass264_41.method6364((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public void method5333() {
		@Pc(2) Class264 local2 = this.aClass264_41;
		synchronized (this.aClass264_41) {
			this.aClass264_41.method6360();
		}
	}
}

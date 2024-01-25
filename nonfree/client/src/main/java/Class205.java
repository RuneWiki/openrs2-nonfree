import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class205 {

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!oo;")
	private final Class264 aClass264_37 = new Class264(256);

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!wia;")
	private final Class386 aClass386_77;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class205(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_77 = arg2;
		this.aClass386_77.method9210(26);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public void method5062() {
		@Pc(2) Class264 local2 = this.aClass264_37;
		synchronized (this.aClass264_37) {
			this.aClass264_37.method6368();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public void method5064() {
		@Pc(11) Class264 local11 = this.aClass264_37;
		synchronized (this.aClass264_37) {
			this.aClass264_37.method6360();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V")
	public void method5065() {
		@Pc(2) Class264 local2 = this.aClass264_37;
		synchronized (this.aClass264_37) {
			this.aClass264_37.method6366(5);
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IB)Lclient!ew;")
	public Class14_Sub3_Sub7 method5066(@OriginalArg(0) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_37;
		@Pc(16) Class14_Sub3_Sub7 local16;
		synchronized (this.aClass264_37) {
			local16 = (Class14_Sub3_Sub7) this.aClass264_37.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_77;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_77) {
			local38 = this.aClass386_77.method9196(arg0, 26);
		}
		local16 = new Class14_Sub3_Sub7();
		if (local38 != null) {
			local16.method2346(new Class14_Sub29(local38));
		}
		@Pc(68) Class264 local68 = this.aClass264_37;
		synchronized (this.aClass264_37) {
			this.aClass264_37.method6364((long) arg0, local16);
			return local16;
		}
	}
}

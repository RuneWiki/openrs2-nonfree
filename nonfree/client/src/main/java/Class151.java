import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class151 {

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "Lclient!oo;")
	private final Class264 aClass264_26 = new Class264(64);

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "Lclient!oo;")
	public final Class264 aClass264_27 = new Class264(2);

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "Lclient!wia;")
	public final Class386 aClass386_57;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "Lclient!wia;")
	private final Class386 aClass386_58;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;Lclient!wia;)V")
	public Class151(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Class386 arg3) {
		this.aClass386_57 = arg3;
		this.aClass386_58 = arg2;
		this.aClass386_58.method9210(33);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V")
	public void method3502() {
		@Pc(6) Class264 local6 = this.aClass264_26;
		synchronized (this.aClass264_26) {
			this.aClass264_26.method6360();
		}
		local6 = this.aClass264_27;
		synchronized (this.aClass264_27) {
			this.aClass264_27.method6360();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
	public void method3505() {
		@Pc(2) Class264 local2 = this.aClass264_26;
		synchronized (this.aClass264_26) {
			this.aClass264_26.method6368();
		}
		local2 = this.aClass264_27;
		synchronized (this.aClass264_27) {
			this.aClass264_27.method6368();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)Lclient!ii;")
	public Class162 method3506(@OriginalArg(1) int arg0) {
		@Pc(12) Class264 local12 = this.aClass264_26;
		@Pc(22) Class162 local22;
		synchronized (this.aClass264_26) {
			local22 = (Class162) this.aClass264_26.method6367((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class386 local35 = this.aClass386_58;
		@Pc(44) byte[] local44;
		synchronized (this.aClass386_58) {
			local44 = this.aClass386_58.method9196(arg0, 33);
		}
		local22 = new Class162();
		local22.aClass151_2 = this;
		if (local44 != null) {
			local22.method3650(new Class14_Sub29(local44));
		}
		@Pc(69) Class264 local69 = this.aClass264_26;
		synchronized (this.aClass264_26) {
			this.aClass264_26.method6364((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZI)V")
	public void method3507() {
		@Pc(8) Class264 local8 = this.aClass264_26;
		synchronized (this.aClass264_26) {
			this.aClass264_26.method6366(5);
		}
		local8 = this.aClass264_27;
		synchronized (this.aClass264_27) {
			this.aClass264_27.method6366(5);
		}
	}
}

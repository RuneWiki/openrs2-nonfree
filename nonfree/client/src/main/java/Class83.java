import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class83 {

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "Lclient!oo;")
	private Class264 aClass264_16 = new Class264(64);

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "Lclient!oo;")
	public Class264 aClass264_17 = new Class264(64);

	@OriginalMember(owner = "client!eca", name = "l", descriptor = "Lclient!wia;")
	private final Class386 aClass386_30;

	@OriginalMember(owner = "client!eca", name = "j", descriptor = "Lclient!wia;")
	public final Class386 aClass386_29;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;Lclient!wia;)V")
	public Class83(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Class386 arg3) {
		this.aClass386_30 = arg2;
		this.aClass386_29 = arg3;
		this.aClass386_30.method9210(34);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
	public void method2075() {
		@Pc(6) Class264 local6 = this.aClass264_16;
		synchronized (this.aClass264_16) {
			this.aClass264_16.method6368();
		}
		local6 = this.aClass264_17;
		synchronized (this.aClass264_17) {
			this.aClass264_17.method6368();
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(III)V")
	public void method2076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass264_16 = new Class264(arg0);
		this.aClass264_17 = new Class264(arg1);
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)V")
	public void method2079() {
		@Pc(6) Class264 local6 = this.aClass264_16;
		synchronized (this.aClass264_16) {
			this.aClass264_16.method6360();
		}
		local6 = this.aClass264_17;
		synchronized (this.aClass264_17) {
			this.aClass264_17.method6360();
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)V")
	public void method2080() {
		@Pc(14) Class264 local14 = this.aClass264_16;
		synchronized (this.aClass264_16) {
			this.aClass264_16.method6366(5);
		}
		local14 = this.aClass264_17;
		synchronized (this.aClass264_17) {
			this.aClass264_17.method6366(5);
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)Lclient!lr;")
	public Class221 method2081(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_16;
		@Pc(16) Class221 local16;
		synchronized (this.aClass264_16) {
			local16 = (Class221) this.aClass264_16.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_30;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_30) {
			local38 = this.aClass386_30.method9196(arg0, 34);
		}
		local16 = new Class221();
		local16.aClass83_3 = this;
		if (local38 != null) {
			local16.method5290(new Class14_Sub29(local38));
		}
		@Pc(63) Class264 local63 = this.aClass264_16;
		synchronized (this.aClass264_16) {
			this.aClass264_16.method6364((long) arg0, local16);
			return local16;
		}
	}
}

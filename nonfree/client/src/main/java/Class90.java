import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class90 {

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "Lclient!oo;")
	private final Class264 aClass264_18 = new Class264(64);

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "Lclient!wia;")
	private final Class386 aClass386_31;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class90(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_31 = arg2;
		if (this.aClass386_31 != null) {
			this.aClass386_31.method9210(11);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
	public void method2117() {
		@Pc(6) Class264 local6 = this.aClass264_18;
		synchronized (this.aClass264_18) {
			this.aClass264_18.method6368();
		}
	}

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)V")
	public void method2119() {
		@Pc(6) Class264 local6 = this.aClass264_18;
		synchronized (this.aClass264_18) {
			this.aClass264_18.method6360();
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)V")
	public void method2120() {
		@Pc(2) Class264 local2 = this.aClass264_18;
		synchronized (this.aClass264_18) {
			this.aClass264_18.method6366(5);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BI)Lclient!tl;")
	public Class341 method2122(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_18;
		@Pc(16) Class341 local16;
		synchronized (this.aClass264_18) {
			local16 = (Class341) this.aClass264_18.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_31;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_31) {
			local38 = this.aClass386_31.method9196(arg0, 11);
		}
		local16 = new Class341();
		if (local38 != null) {
			local16.method8271(new Class14_Sub29(local38));
		}
		@Pc(68) Class264 local68 = this.aClass264_18;
		synchronized (this.aClass264_18) {
			this.aClass264_18.method6364((long) arg0, local16);
			return local16;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class68 {

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!oo;")
	private final Class264 aClass264_14 = new Class264(64);

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!wia;")
	private final Class386 aClass386_22;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class68(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_22 = arg2;
		this.aClass386_22.method9210(31);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public void method1728() {
		@Pc(2) Class264 local2 = this.aClass264_14;
		synchronized (this.aClass264_14) {
			this.aClass264_14.method6368();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public void method1729() {
		@Pc(6) Class264 local6 = this.aClass264_14;
		synchronized (this.aClass264_14) {
			this.aClass264_14.method6366(5);
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Lclient!ev;")
	public Class98 method1730(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_14;
		@Pc(16) Class98 local16;
		synchronized (this.aClass264_14) {
			local16 = (Class98) this.aClass264_14.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class386 local34 = this.aClass386_22;
		@Pc(43) byte[] local43;
		synchronized (this.aClass386_22) {
			local43 = this.aClass386_22.method9196(arg0, 31);
		}
		local16 = new Class98();
		if (local43 != null) {
			local16.method2331(new Class14_Sub29(local43));
		}
		@Pc(65) Class264 local65 = this.aClass264_14;
		synchronized (this.aClass264_14) {
			this.aClass264_14.method6364((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public void method1731() {
		@Pc(11) Class264 local11 = this.aClass264_14;
		synchronized (this.aClass264_14) {
			this.aClass264_14.method6360();
		}
	}
}

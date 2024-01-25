import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class250 {

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "Lclient!oo;")
	private final Class264 aClass264_48 = new Class264(16);

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "Lclient!wia;")
	private final Class386 aClass386_92;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class250(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_92 = arg2;
		this.aClass386_92.method9210(30);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public void method5996() {
		@Pc(2) Class264 local2 = this.aClass264_48;
		synchronized (this.aClass264_48) {
			this.aClass264_48.method6368();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V")
	public void method5997() {
		@Pc(2) Class264 local2 = this.aClass264_48;
		synchronized (this.aClass264_48) {
			this.aClass264_48.method6366(5);
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	public void method5998() {
		@Pc(2) Class264 local2 = this.aClass264_48;
		synchronized (this.aClass264_48) {
			this.aClass264_48.method6360();
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)Lclient!ln;")
	public Class218 method5999(@OriginalArg(0) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_48;
		@Pc(16) Class218 local16;
		synchronized (this.aClass264_48) {
			local16 = (Class218) this.aClass264_48.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_92;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_92) {
			local38 = this.aClass386_92.method9196(arg0, 30);
		}
		local16 = new Class218();
		if (local38 != null) {
			local16.method5280(new Class14_Sub29(local38));
		}
		@Pc(60) Class264 local60 = this.aClass264_48;
		synchronized (this.aClass264_48) {
			this.aClass264_48.method6364((long) arg0, local16);
			return local16;
		}
	}
}

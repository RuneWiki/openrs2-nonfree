import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class15 {

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "Lclient!oo;")
	private final Class264 aClass264_6 = new Class264(64);

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "Lclient!wia;")
	private final Class386 aClass386_4;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class15(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_4 = arg2;
		if (this.aClass386_4 != null) {
			this.aClass386_4.method9210(54);
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)V")
	public void method132() {
		@Pc(2) Class264 local2 = this.aClass264_6;
		synchronized (this.aClass264_6) {
			this.aClass264_6.method6366(5);
		}
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(B)V")
	public void method134() {
		@Pc(2) Class264 local2 = this.aClass264_6;
		synchronized (this.aClass264_6) {
			this.aClass264_6.method6368();
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IB)Lclient!ni;")
	public Class245 method135(@OriginalArg(0) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_6;
		@Pc(16) Class245 local16;
		synchronized (this.aClass264_6) {
			local16 = (Class245) this.aClass264_6.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_4;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_4) {
			local38 = this.aClass386_4.method9196(arg0, 54);
		}
		local16 = new Class245();
		if (local38 != null) {
			local16.method5936(new Class14_Sub29(local38));
		}
		@Pc(60) Class264 local60 = this.aClass264_6;
		synchronized (this.aClass264_6) {
			this.aClass264_6.method6364((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V")
	public void method137() {
		@Pc(6) Class264 local6 = this.aClass264_6;
		synchronized (this.aClass264_6) {
			this.aClass264_6.method6360();
		}
	}
}

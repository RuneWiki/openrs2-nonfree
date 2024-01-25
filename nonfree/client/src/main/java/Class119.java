import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class119 {

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "Lclient!oo;")
	private final Class264 aClass264_23 = new Class264(128);

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "Lclient!wia;")
	private final Class386 aClass386_43;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class119(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_43 = arg2;
		this.aClass386_43.method9210(1);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)V")
	public void method2833() {
		@Pc(10) Class264 local10 = this.aClass264_23;
		synchronized (this.aClass264_23) {
			this.aClass264_23.method6366(5);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
	public void method2834() {
		@Pc(2) Class264 local2 = this.aClass264_23;
		synchronized (this.aClass264_23) {
			this.aClass264_23.method6360();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V")
	public void method2837() {
		@Pc(11) Class264 local11 = this.aClass264_23;
		synchronized (this.aClass264_23) {
			this.aClass264_23.method6368();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZI)Lclient!lda;")
	public Class208 method2838(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_23;
		@Pc(16) Class208 local16;
		synchronized (this.aClass264_23) {
			local16 = (Class208) this.aClass264_23.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_43;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_43) {
			local38 = this.aClass386_43.method9196(arg0, 1);
		}
		local16 = new Class208();
		if (local38 != null) {
			local16.method5123(new Class14_Sub29(local38));
		}
		@Pc(65) Class264 local65 = this.aClass264_23;
		synchronized (this.aClass264_23) {
			this.aClass264_23.method6364((long) arg0, local16);
			return local16;
		}
	}
}

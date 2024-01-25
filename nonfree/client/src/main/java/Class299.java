import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class299 {

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "Lclient!oo;")
	public final Class264 aClass264_53 = new Class264(20);

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "Lclient!oo;")
	private final Class264 aClass264_54 = new Class264(64);

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "Lclient!wia;")
	public final Class386 aClass386_109;

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lclient!wia;")
	private final Class386 aClass386_110;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;Lclient!wia;)V")
	public Class299(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2, @OriginalArg(3) Class386 arg3) {
		this.aClass386_109 = arg3;
		this.aClass386_110 = arg2;
		this.aClass386_110.method9210(46);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)Lclient!og;")
	public Class259 method7428(@OriginalArg(0) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_54;
		@Pc(16) Class259 local16;
		synchronized (this.aClass264_54) {
			local16 = (Class259) this.aClass264_54.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_110;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_110) {
			local38 = this.aClass386_110.method9196(arg0, 46);
		}
		local16 = new Class259();
		local16.aClass299_2 = this;
		if (local38 != null) {
			local16.method6254(new Class14_Sub29(local38));
		}
		@Pc(70) Class264 local70 = this.aClass264_54;
		synchronized (this.aClass264_54) {
			this.aClass264_54.method6364((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V")
	public void method7430() {
		@Pc(10) Class264 local10 = this.aClass264_54;
		synchronized (this.aClass264_54) {
			this.aClass264_54.method6360();
		}
		local10 = this.aClass264_53;
		synchronized (this.aClass264_53) {
			this.aClass264_53.method6360();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(II)V")
	public void method7432() {
		@Pc(2) Class264 local2 = this.aClass264_54;
		synchronized (this.aClass264_54) {
			this.aClass264_54.method6366(5);
		}
		local2 = this.aClass264_53;
		synchronized (this.aClass264_53) {
			this.aClass264_53.method6366(5);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
	public void method7434() {
		@Pc(2) Class264 local2 = this.aClass264_54;
		synchronized (this.aClass264_54) {
			this.aClass264_54.method6368();
		}
		local2 = this.aClass264_53;
		synchronized (this.aClass264_53) {
			this.aClass264_53.method6368();
		}
	}
}

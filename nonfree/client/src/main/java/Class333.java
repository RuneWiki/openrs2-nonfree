import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class333 {

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "Lclient!hm;")
	private final Class136 aClass136_103 = new Class136(64);

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "Lclient!pfa;")
	public final Class251 aClass251_122;

	@OriginalMember(owner = "client!ufa", name = "l", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_121;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;Lclient!pfa;)V")
	public Class333(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3) {
		this.aClass251_122 = arg3;
		this.aClass251_121 = arg2;
		this.aClass251_121.method5768(3);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)V")
	public void method7233() {
		@Pc(2) Class136 local2 = this.aClass136_103;
		synchronized (this.aClass136_103) {
			this.aClass136_103.method3474(5);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(B)V")
	public void method7235() {
		@Pc(6) Class136 local6 = this.aClass136_103;
		synchronized (this.aClass136_103) {
			this.aClass136_103.method3476();
		}
	}

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "(B)V")
	public void method7237() {
		@Pc(10) Class136 local10 = this.aClass136_103;
		synchronized (this.aClass136_103) {
			this.aClass136_103.method3470();
		}
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(II)Lclient!r;")
	public Class279 method7238(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_103;
		@Pc(16) Class279 local16;
		synchronized (this.aClass136_103) {
			local16 = (Class279) this.aClass136_103.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_121;
		@Pc(40) byte[] local40;
		synchronized (this.aClass251_121) {
			local40 = this.aClass251_121.method5772(arg0, 3);
		}
		local16 = new Class279();
		local16.aClass333_2 = this;
		if (local40 != null) {
			local16.method6250(new Class6_Sub21(local40));
		}
		@Pc(67) Class136 local67 = this.aClass136_103;
		synchronized (this.aClass136_103) {
			this.aClass136_103.method3482((long) arg0, local16);
			return local16;
		}
	}
}

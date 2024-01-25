import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class307 {

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "Lclient!gw;")
	private final Class136 aClass136_58 = new Class136(128);

	@OriginalMember(owner = "client!sha", name = "j", descriptor = "Lclient!uu;")
	private final Class343 aClass343_237;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class307(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_237 = arg2;
		if (this.aClass343_237 != null) {
			@Pc(20) int local20 = this.aClass343_237.method8144() - 1;
			this.aClass343_237.method8157(local20);
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BI)Lclient!hk;")
	public Class146 method7524(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_58;
		@Pc(16) Class146 local16;
		synchronized (this.aClass136_58) {
			local16 = (Class146) this.aClass136_58.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass343_237.method8132(Static304.method7230(arg0), Static227.method3937(arg0));
		local16 = new Class146();
		if (local37 != null) {
			local16.method3766(new Class3_Sub9(local37));
		}
		@Pc(60) Class136 local60 = this.aClass136_58;
		synchronized (this.aClass136_58) {
			this.aClass136_58.method3135(local16, (long) arg0);
			return local16;
		}
	}
}

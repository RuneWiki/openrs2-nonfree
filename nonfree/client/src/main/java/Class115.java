import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class115 {

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "Lclient!gw;")
	private final Class136 aClass136_23 = new Class136(64);

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Lclient!uu;")
	private final Class343 aClass343_80;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class115(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_80 = arg2;
		this.aClass343_80.method8157(5);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)Lclient!su;")
	public Class3_Sub7_Sub20 method2800(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_23;
		@Pc(16) Class3_Sub7_Sub20 local16;
		synchronized (this.aClass136_23) {
			local16 = (Class3_Sub7_Sub20) this.aClass136_23.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_80;
		@Pc(40) byte[] local40;
		synchronized (this.aClass343_80) {
			local40 = this.aClass343_80.method8132(5, arg0);
		}
		local16 = new Class3_Sub7_Sub20();
		if (local40 != null) {
			local16.method7702(new Class3_Sub9(local40));
		}
		@Pc(64) Class136 local64 = this.aClass136_23;
		synchronized (this.aClass136_23) {
			this.aClass136_23.method3135(local16, (long) arg0);
			return local16;
		}
	}
}

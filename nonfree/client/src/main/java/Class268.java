import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class268 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!pa;")
	private final Class265 aClass265_48 = new Class265(64);

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!cb;")
	private final Class50 aClass50_126;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class268(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_126 = arg2;
		this.aClass50_126.method913(5);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)Lclient!lw;")
	public Class5_Sub2_Sub10 method6614(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_48;
		@Pc(16) Class5_Sub2_Sub10 local16;
		synchronized (this.aClass265_48) {
			local16 = (Class5_Sub2_Sub10) this.aClass265_48.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) Class50 local36 = this.aClass50_126;
		@Pc(45) byte[] local45;
		synchronized (this.aClass50_126) {
			local45 = this.aClass50_126.method916(arg0, 5);
		}
		local16 = new Class5_Sub2_Sub10();
		if (local45 != null) {
			local16.method5227(new Class5_Sub15(local45));
		}
		@Pc(67) Class265 local67 = this.aClass265_48;
		synchronized (this.aClass265_48) {
			this.aClass265_48.method6566(local16, (long) arg0);
			return local16;
		}
	}
}

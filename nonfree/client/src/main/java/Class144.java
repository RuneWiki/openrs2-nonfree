import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class144 {

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "Lclient!pa;")
	private final Class265 aClass265_20 = new Class265(64);

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "Lclient!cb;")
	private final Class50 aClass50_55;

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
	public final int anInt3335;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class144(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_55 = arg2;
		this.anInt3335 = this.aClass50_55.method913(19);
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(BI)Lclient!sha;")
	public Class322 method2993(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_20;
		@Pc(16) Class322 local16;
		synchronized (this.aClass265_20) {
			local16 = (Class322) this.aClass265_20.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class50 local34 = this.aClass50_55;
		@Pc(43) byte[] local43;
		synchronized (this.aClass50_55) {
			local43 = this.aClass50_55.method916(arg0, 19);
		}
		local16 = new Class322();
		if (local43 != null) {
			local16.method7463(new Class5_Sub15(local43));
		}
		@Pc(65) Class265 local65 = this.aClass265_20;
		synchronized (this.aClass265_20) {
			this.aClass265_20.method6566(local16, (long) arg0);
			return local16;
		}
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class46 {

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!wi;")
	private final Class268 aClass268_11 = new Class268(64);

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!uu;")
	private final Class250 aClass250_22;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class46(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_22 = arg2;
		this.aClass250_22.method5815(5);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)Lclient!so;")
	public Class3_Sub3_Sub16 method1264(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_11;
		@Pc(16) Class3_Sub3_Sub16 local16;
		synchronized (this.aClass268_11) {
			local16 = (Class3_Sub3_Sub16) this.aClass268_11.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_22;
		@Pc(38) byte[] local38;
		synchronized (this.aClass250_22) {
			local38 = this.aClass250_22.method5806(5, arg0);
		}
		local16 = new Class3_Sub3_Sub16();
		if (local38 != null) {
			local16.method5262(new Class3_Sub25(local38));
		}
		@Pc(60) Class268 local60 = this.aClass268_11;
		synchronized (this.aClass268_11) {
			this.aClass268_11.method6164(local16, (long) arg0);
			return local16;
		}
	}
}

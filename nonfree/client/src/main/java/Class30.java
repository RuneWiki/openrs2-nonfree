import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class30 {

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "Lclient!wi;")
	private final Class268 aClass268_8 = new Class268(64);

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Lclient!uu;")
	private final Class250 aClass250_18;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "Lclient!uu;")
	private final Class250 aClass250_17;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(ILclient!uu;Lclient!uu;)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_18 = arg2;
		this.aClass250_17 = arg1;
		if (this.aClass250_17 != null) {
			this.aClass250_17.method5815(0);
		}
		if (this.aClass250_18 != null) {
			this.aClass250_18.method5815(0);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)Lclient!ck;")
	public Class3_Sub3_Sub3 method641(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub3_Sub3 local11 = (Class3_Sub3_Sub3) this.aClass268_8.method6166((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass250_18.method5806(0, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass250_17.method5806(0, arg0);
		}
		local11 = new Class3_Sub3_Sub3();
		if (local27 != null) {
			local11.method986(new Class3_Sub25(local27));
		}
		if (arg0 >= 32768) {
			local11.method980();
		}
		this.aClass268_8.method6164(local11, (long) arg0);
		return local11;
	}
}

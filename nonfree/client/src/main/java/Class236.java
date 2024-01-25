import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class236 {

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!pa;")
	private final Class265 aClass265_40 = new Class265(64);

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "Lclient!cb;")
	private final Class50 aClass50_111;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Lclient!cb;")
	private final Class50 aClass50_110;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(ILclient!cb;Lclient!cb;)V")
	public Class236(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_111 = arg2;
		this.aClass50_110 = arg1;
		if (this.aClass50_110 != null) {
			this.aClass50_110.method913(0);
		}
		if (this.aClass50_111 != null) {
			this.aClass50_111.method913(0);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)Lclient!lea;")
	public Class5_Sub2_Sub9 method5531(@OriginalArg(0) int arg0) {
		@Pc(11) Class5_Sub2_Sub9 local11 = (Class5_Sub2_Sub9) this.aClass265_40.method6577((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass50_110.method916(arg0, 0);
		} else {
			local27 = this.aClass50_111.method916(arg0 & 0x7FFF, 0);
		}
		local11 = new Class5_Sub2_Sub9();
		if (local27 != null) {
			local11.method5126(new Class5_Sub15(local27));
		}
		if (arg0 >= 32768) {
			local11.method5128();
		}
		this.aClass265_40.method6566(local11, (long) arg0);
		return local11;
	}
}

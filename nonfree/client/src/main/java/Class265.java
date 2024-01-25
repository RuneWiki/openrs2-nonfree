import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class265 {

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "Lclient!jt;")
	private final Class166 aClass166_44 = new Class166(64);

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "Lclient!vd;")
	private final Class353 aClass353_83;

	static {
		new Class240("", 76);
	}

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class265(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_83 = arg2;
		this.aClass353_83.method8422(5);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II)Lclient!sba;")
	public Class6_Sub2_Sub19 method6938(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_44;
		@Pc(16) Class6_Sub2_Sub19 local16;
		synchronized (this.aClass166_44) {
			local16 = (Class6_Sub2_Sub19) this.aClass166_44.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class353 local29 = this.aClass353_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass353_83) {
			local38 = this.aClass353_83.method8404(5, arg0);
		}
		local16 = new Class6_Sub2_Sub19();
		if (local38 != null) {
			local16.method7532(new Class6_Sub40(local38));
		}
		@Pc(60) Class166 local60 = this.aClass166_44;
		synchronized (this.aClass166_44) {
			this.aClass166_44.method4803(local16, (long) arg0);
			return local16;
		}
	}
}

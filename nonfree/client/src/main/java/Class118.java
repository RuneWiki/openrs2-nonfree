import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class118 {

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "Lclient!jt;")
	private final Class166 aClass166_19 = new Class166(64);

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Lclient!vd;")
	private final Class353 aClass353_37;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Lclient!vd;")
	private final Class353 aClass353_36;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(ILclient!vd;Lclient!vd;)V")
	public Class118(@OriginalArg(0) int arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_37 = arg2;
		this.aClass353_36 = arg1;
		if (this.aClass353_36 != null) {
			this.aClass353_36.method8422(0);
		}
		if (this.aClass353_37 != null) {
			this.aClass353_37.method8422(0);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Lclient!fs;")
	public Class6_Sub2_Sub7 method3366(@OriginalArg(0) int arg0) {
		@Pc(19) Class6_Sub2_Sub7 local19 = (Class6_Sub2_Sub7) this.aClass166_19.method4805((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(35) byte[] local35;
		if (arg0 < 32768) {
			local35 = this.aClass353_36.method8404(0, arg0);
		} else {
			local35 = this.aClass353_37.method8404(0, arg0 & 0x7FFF);
		}
		local19 = new Class6_Sub2_Sub7();
		if (local35 != null) {
			local19.method3099(new Class6_Sub40(local35));
		}
		if (arg0 >= 32768) {
			local19.method3104();
		}
		this.aClass166_19.method4803(local19, (long) arg0);
		return local19;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class42 {

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Lclient!wm;")
	private final Class267 aClass267_10 = new Class267(64);

	@OriginalMember(owner = "client!co", name = "h", descriptor = "Lclient!ph;")
	private final Class187 aClass187_18;

	@OriginalMember(owner = "client!co", name = "j", descriptor = "Lclient!ph;")
	private final Class187 aClass187_19;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(ILclient!ph;Lclient!ph;)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_18 = arg2;
		this.aClass187_19 = arg1;
		if (this.aClass187_19 != null) {
			this.aClass187_19.method4306(0);
		}
		if (this.aClass187_18 != null) {
			this.aClass187_18.method4306(0);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Lclient!jd;")
	public Class10_Sub1_Sub9 method1019(@OriginalArg(0) int arg0) {
		@Pc(13) Class10_Sub1_Sub9 local13 = (Class10_Sub1_Sub9) this.aClass267_10.method6014((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = this.aClass187_19.method4300(0, arg0);
		} else {
			local29 = this.aClass187_18.method4300(0, arg0 & 0x7FFF);
		}
		local13 = new Class10_Sub1_Sub9();
		if (local29 != null) {
			local13.method3034(new Class10_Sub8(local29));
		}
		if (arg0 >= 32768) {
			local13.method3032();
		}
		this.aClass267_10.method6008(local13, (long) arg0);
		return local13;
	}
}

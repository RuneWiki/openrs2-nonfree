import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class323 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!jda;")
	private final Class165 aClass165_62 = new Class165(64);

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "Lclient!aj;")
	private final Class15 aClass15_140;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "Lclient!aj;")
	private final Class15 aClass15_139;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(ILclient!aj;Lclient!aj;)V")
	public Class323(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_140 = arg1;
		this.aClass15_139 = arg2;
		if (this.aClass15_140 != null) {
			this.aClass15_140.method512(0);
		}
		if (this.aClass15_139 != null) {
			this.aClass15_139.method512(0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)Lclient!fba;")
	public Class3_Sub11_Sub6 method7888(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub11_Sub6 local11 = (Class3_Sub11_Sub6) this.aClass165_62.method4389((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass15_139.method517(arg0 & 0x7FFF, 0);
		} else {
			local27 = this.aClass15_140.method517(arg0, 0);
		}
		local11 = new Class3_Sub11_Sub6();
		if (local27 != null) {
			local11.method2817(new Class3_Sub25(local27));
		}
		if (arg0 >= 32768) {
			local11.method2821();
		}
		this.aClass165_62.method4392(local11, (long) arg0);
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class28 {

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Lclient!jp;")
	private final Class129 aClass129_4 = new Class129(64);

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!pc;")
	private final Class188 aClass188_15;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "Lclient!pc;")
	private final Class188 aClass188_16;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(ILclient!pc;Lclient!pc;)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_15 = arg1;
		this.aClass188_16 = arg2;
		if (this.aClass188_15 != null) {
			this.aClass188_15.method4285(0);
		}
		if (this.aClass188_16 != null) {
			this.aClass188_16.method4285(0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)Lclient!sk;")
	public Class2_Sub2_Sub17 method718(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub2_Sub17 local11 = (Class2_Sub2_Sub17) this.aClass129_4.method3023((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(30) byte[] local30;
		if (arg0 < 32768) {
			local30 = this.aClass188_15.method4283(0, arg0);
		} else {
			local30 = this.aClass188_16.method4283(0, arg0 & 0x7FFF);
		}
		local11 = new Class2_Sub2_Sub17();
		if (local30 != null) {
			local11.method5044(new Class2_Sub20(local30));
		}
		if (arg0 >= 32768) {
			local11.method5046();
		}
		this.aClass129_4.method3029(local11, (long) arg0);
		return local11;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class169 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!vg;")
	private final Class342 aClass342_100 = new Class342(64);

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!ri;")
	private final Class284 aClass284_80;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!ri;")
	private final Class284 aClass284_79;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(ILclient!ri;Lclient!ri;)V")
	public Class169(@OriginalArg(0) int arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_80 = arg2;
		this.aClass284_79 = arg1;
		if (this.aClass284_79 != null) {
			this.aClass284_79.method6354(0);
		}
		if (this.aClass284_80 != null) {
			this.aClass284_80.method6354(0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lclient!haa;")
	public Class3_Sub7_Sub9 method4099(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub7_Sub9 local11 = (Class3_Sub7_Sub9) this.aClass342_100.method7684((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(32) byte[] local32;
		if (arg0 >= 32768) {
			local32 = this.aClass284_80.method6331(0, arg0 & 0x7FFF);
		} else {
			local32 = this.aClass284_79.method6331(0, arg0);
		}
		local11 = new Class3_Sub7_Sub9();
		if (local32 != null) {
			local11.method3290(new Class3_Sub26(local32));
		}
		if (arg0 >= 32768) {
			local11.method3288();
		}
		this.aClass342_100.method7683(local11, (long) arg0);
		return local11;
	}
}

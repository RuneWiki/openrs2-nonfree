import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class99 {

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Lclient!me;")
	private final Class211 aClass211_16 = new Class211(64);

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!pe;")
	private final Class254 aClass254_44;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!pe;")
	private final Class254 aClass254_42;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(ILclient!pe;Lclient!pe;)V")
	public Class99(@OriginalArg(0) int arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_44 = arg1;
		this.aClass254_42 = arg2;
		if (this.aClass254_44 != null) {
			this.aClass254_44.method6396(0);
		}
		if (this.aClass254_42 != null) {
			this.aClass254_42.method6396(0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lclient!bga;")
	public Class3_Sub4_Sub3 method2796(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub4_Sub3 local11 = (Class3_Sub4_Sub3) this.aClass211_16.method5534((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass254_42.method6401(0, arg0 & 0x7FFF);
		} else {
			local29 = this.aClass254_44.method6401(0, arg0);
		}
		local11 = new Class3_Sub4_Sub3();
		if (local29 != null) {
			local11.method1099(new Class3_Sub7(local29));
		}
		if (arg0 >= 32768) {
			local11.method1089();
		}
		this.aClass211_16.method5529((long) arg0, local11);
		return local11;
	}
}

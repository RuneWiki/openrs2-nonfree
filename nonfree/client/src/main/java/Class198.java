import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class198 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!ff;")
	private final Class83 aClass83_49 = new Class83(64);

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!vh;")
	private final Class250 aClass250_68;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!vh;")
	private final Class250 aClass250_69;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ILclient!vh;Lclient!vh;)V")
	public Class198(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_68 = arg2;
		this.aClass250_69 = arg1;
		if (this.aClass250_69 != null) {
			this.aClass250_69.method5653(0);
		}
		if (this.aClass250_68 != null) {
			this.aClass250_68.method5653(0);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!hj;")
	public Class1_Sub2_Sub10 method4804(@OriginalArg(0) int arg0) {
		@Pc(21) Class1_Sub2_Sub10 local21 = (Class1_Sub2_Sub10) this.aClass83_49.method1658((long) arg0);
		if (local21 != null) {
			return local21;
		}
		@Pc(37) byte[] local37;
		if (arg0 >= 32768) {
			local37 = this.aClass250_68.method5667(arg0 & 0x7FFF, 0);
		} else {
			local37 = this.aClass250_69.method5667(arg0, 0);
		}
		local21 = new Class1_Sub2_Sub10();
		if (local37 != null) {
			local21.method2301(new Class1_Sub1(local37));
		}
		if (arg0 >= 32768) {
			local21.method2308();
		}
		this.aClass83_49.method1675((long) arg0, local21);
		return local21;
	}
}

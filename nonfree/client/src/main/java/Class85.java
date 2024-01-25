import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class85 {

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "Lclient!uh;")
	private Class3_Sub3 aClass3_Sub3_29 = new Class3_Sub3();

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "Lclient!et;")
	private final Class65 aClass65_2 = new Class65();

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	private int anInt2364;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	private final int anInt2365;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Lclient!lp;")
	private final Class140 aClass140_21;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V")
	public Class85(@OriginalArg(0) int arg0) {
		this.anInt2364 = arg0;
		this.anInt2365 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass140_21 = new Class140(local19);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!uh;JI)V")
	public void method2039(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt2364 == 0) {
			@Pc(16) Class3_Sub3 local16 = this.aClass65_2.method1685();
			local16.method6288();
			local16.method6102();
			if (local16 == this.aClass3_Sub3_29) {
				local16 = this.aClass65_2.method1685();
				local16.method6288();
				local16.method6102();
			}
		} else {
			this.anInt2364--;
		}
		this.aClass140_21.method3494(arg1, arg0);
		this.aClass65_2.method1686(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IJ)Lclient!uh;")
	public Class3_Sub3 method2040(@OriginalArg(1) long arg0) {
		@Pc(18) Class3_Sub3 local18 = (Class3_Sub3) this.aClass140_21.method3490(arg0);
		if (local18 != null) {
			this.aClass65_2.method1686(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public void method2041() {
		this.aClass65_2.method1687();
		this.aClass140_21.method3488();
		this.aClass3_Sub3_29 = new Class3_Sub3();
		this.anInt2364 = this.anInt2365;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class189 {

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Lclient!lm;")
	private Class6_Sub4 aClass6_Sub4_24 = new Class6_Sub4();

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!wd;")
	private final Class384 aClass384_10 = new Class384();

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
	private final int anInt5016;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	private int anInt5015;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!lk;")
	private final Class209 aClass209_22;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
	public Class189(@OriginalArg(0) int arg0) {
		this.anInt5016 = arg0;
		this.anInt5015 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass209_22 = new Class209(local19);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(JI)V")
	public void method4277(@OriginalArg(0) long arg0) {
		@Pc(10) Class6_Sub4 local10 = (Class6_Sub4) this.aClass209_22.method5038(arg0);
		if (local10 != null) {
			local10.method9174();
			local10.method9043();
			this.anInt5015++;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!lm;IJ)V")
	public void method4278(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt5015 == 0) {
			@Pc(14) Class6_Sub4 local14 = this.aClass384_10.method8907();
			local14.method9174();
			local14.method9043();
			if (local14 == this.aClass6_Sub4_24) {
				local14 = this.aClass384_10.method8907();
				local14.method9174();
				local14.method9043();
			}
		} else {
			this.anInt5015--;
		}
		this.aClass209_22.method5035(arg1, arg0);
		this.aClass384_10.method8909(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IJ)Lclient!lm;")
	public Class6_Sub4 method4279(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub4 local10 = (Class6_Sub4) this.aClass209_22.method5038(arg0);
		if (local10 != null) {
			this.aClass384_10.method8909(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public void method4280() {
		this.aClass384_10.method8913();
		this.aClass209_22.method5041();
		this.aClass6_Sub4_24 = new Class6_Sub4();
		this.anInt5015 = this.anInt5016;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class90 {

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Lclient!pca;")
	private final Class245 aClass245_25 = new Class245(256);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!fo;")
	private final Class9_Sub3 aClass9_Sub3_6;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "Lclient!e;")
	private final Interface2 anInterface2_8;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!fo;Lclient!e;)V")
	public Class90(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Interface2 arg1) {
		this.aClass9_Sub3_6 = arg0;
		this.anInterface2_8 = arg1;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Lclient!ae;")
	public Interface1 method2383(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass245_25.method6082((long) arg0);
		if (local10 != null) {
			return (Interface1) local10;
		} else if (this.anInterface2_8.method3583(arg0)) {
			@Pc(29) Class296 local29 = this.anInterface2_8.method3585(arg0);
			@Pc(38) int local38 = local29.aBoolean661 ? 64 : this.aClass9_Sub3_6.bf;
			@Pc(85) Interface1 local85;
			if (local29.aBoolean653 && this.aClass9_Sub3_6.method5398()) {
				@Pc(97) float[] local97 = this.anInterface2_8.method3586(0.7F, arg0, local38, local38);
				local85 = this.aClass9_Sub3_6.method5602(local38, Static487.aClass333_15, local29.aByte106 != 0, local97, local38);
			} else {
				@Pc(68) int[] local68 = local29.aBoolean659 ? this.anInterface2_8.method3581(arg0, 0.7F, local38, local38) : this.anInterface2_8.method3582(0.7F, true, local38, arg0, local38);
				local85 = this.aClass9_Sub3_6.method5556(local68, local38, local29.aByte106 != 0, local38);
			}
			local85.method7753(local29.aBoolean658, local29.aBoolean655);
			this.aClass245_25.method6075(local85, (long) arg0);
			return local85;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public void method2384() {
		this.aClass245_25.method6079();
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public void method2385() {
		this.aClass245_25.method6083(5);
	}
}

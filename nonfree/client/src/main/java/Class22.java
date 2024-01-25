import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class22 {

	@OriginalMember(owner = "client!baa", name = "m", descriptor = "Lclient!hp;")
	private final Class125 aClass125_6 = new Class125(256);

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "Lclient!e;")
	private final Interface4 anInterface4_3;

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "Lclient!tu;")
	private final Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!tu;Lclient!e;)V")
	public Class22(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_3 = arg1;
		this.aClass5_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	public void method778() {
		this.aClass125_6.method3522(5);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)Lclient!ica;")
	public Interface9 method780(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass125_6.method3512((long) arg0);
		if (local10 != null) {
			return (Interface9) local10;
		} else if (this.anInterface4_3.method6708(arg0)) {
			@Pc(29) Class238 local29 = this.anInterface4_3.method6712(arg0);
			@Pc(38) int local38 = local29.aBoolean466 ? 64 : this.aClass5_Sub3_1.anInt7752;
			@Pc(82) Interface9 local82;
			if (local29.aBoolean463 && this.aClass5_Sub3_1.method7441()) {
				@Pc(94) float[] local94 = this.anInterface4_3.method6709(local38, local38, 0.7F, arg0);
				local82 = this.aClass5_Sub3_1.method6347(Static468.aClass167_14, local29.aByte72 != 0, local94, local38, local38);
			} else {
				@Pc(68) int[] local68 = local29.aBoolean465 ? this.anInterface4_3.method6707(local38, arg0, local38, 0.7F) : this.anInterface4_3.method6711(local38, 0.7F, arg0, local38, true);
				local82 = this.aClass5_Sub3_1.method6373(local68, local29.aByte72 != 0, local38, local38);
			}
			local82.method3270(local29.aBoolean462, local29.aBoolean469);
			this.aClass125_6.method3519((long) arg0, local82);
			return local82;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(I)V")
	public void method781() {
		this.aClass125_6.method3521();
	}
}

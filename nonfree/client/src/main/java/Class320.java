import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class320 {

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "Lclient!uf;")
	private final Class326 aClass326_52 = new Class326(256);

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "Lclient!qq;")
	private final Class12_Sub2 aClass12_Sub2_22;

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "Lclient!fa;")
	private final Interface5 anInterface5_12;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!qq;Lclient!fa;)V")
	public Class320(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass12_Sub2_22 = arg0;
		this.anInterface5_12 = arg1;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)Lclient!gn;")
	public Interface8 method7100(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass326_52.method7238((long) arg0);
		if (local10 != null) {
			return (Interface8) local10;
		} else if (this.anInterface5_12.method4045(arg0)) {
			@Pc(29) Class45 local29 = this.anInterface5_12.method4043(arg0);
			@Pc(38) int local38 = local29.aBoolean124 ? 64 : this.aClass12_Sub2_22.anInt7524;
			@Pc(87) Interface8 local87;
			if (local29.aBoolean120 && this.aClass12_Sub2_22.method6451()) {
				@Pc(99) float[] local99 = this.anInterface5_12.method4044(local38, 0.7F, arg0, local38);
				local87 = this.aClass12_Sub2_22.method6181(local38, local38, local29.aByte27 != 0, Static253.aClass297_5, local99);
			} else {
				@Pc(73) int[] local73 = !local29.aBoolean121 && Static97.method5064(local29.aByte25) ? this.anInterface5_12.method4048(arg0, local38, true, 0.7F, local38) : this.anInterface5_12.method4047(local38, local38, 0.7F, arg0);
				local87 = this.aClass12_Sub2_22.method6229(local38, local29.aByte27 != 0, local38, local73);
			}
			local87.method7331(local29.aBoolean125, local29.aBoolean122);
			this.aClass326_52.method7236(local87, (long) arg0);
			return local87;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	public void method7102() {
		this.aClass326_52.method7230();
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	public void method7104() {
		this.aClass326_52.method7241(5);
	}
}

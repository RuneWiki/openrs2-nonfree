import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class329 {

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "Lclient!mga;")
	private final Class223 aClass223_61 = new Class223(256);

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "Lclient!e;")
	private final Interface3 anInterface3_16;

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "Lclient!ej;")
	private final Class66_Sub1 aClass66_Sub1_14;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!ej;Lclient!e;)V")
	public Class329(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_16 = arg1;
		this.aClass66_Sub1_14 = arg0;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Lclient!ak;")
	public Interface2 method7357(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass223_61.method4943((long) arg0);
		if (local10 != null) {
			return (Interface2) local10;
		} else if (this.anInterface3_16.method7248(arg0)) {
			@Pc(29) Class271 local29 = this.anInterface3_16.method7249(arg0);
			@Pc(44) int local44 = local29.aBoolean516 ? 64 : this.aClass66_Sub1_14.anInt8422;
			@Pc(76) Interface2 local76;
			if (local29.aBoolean519 && this.aClass66_Sub1_14.method6852()) {
				@Pc(61) float[] local61 = this.anInterface3_16.method7253(local44, arg0, local44, 0.7F);
				local76 = this.aClass66_Sub1_14.method6963(Static85.aClass141_2, local29.aByte85 != 0, local44, local61, local44);
			} else {
				@Pc(101) int[] local101 = local29.aBoolean515 ? this.anInterface3_16.method7251(0.7F, local44, arg0, local44) : this.anInterface3_16.method7250(local44, true, arg0, 0.7F, local44);
				local76 = this.aClass66_Sub1_14.method6951(local29.aByte85 != 0, local44, local44, local101);
			}
			local76.method6718(local29.aBoolean518, local29.aBoolean517);
			this.aClass223_61.method4938((long) arg0, local76);
			return local76;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
	public void method7359() {
		this.aClass223_61.method4933(5);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
	public void method7360() {
		this.aClass223_61.method4932();
	}
}

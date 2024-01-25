import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class228 {

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!mga;")
	private final Class223 aClass223_44 = new Class223(256);

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!e;")
	private final Interface3 anInterface3_11;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_27;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!no;Lclient!e;)V")
	public Class228(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_11 = arg1;
		this.aClass66_Sub3_27 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
	public void method4990() {
		this.aClass223_44.method4933(5);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public void method4993() {
		this.aClass223_44.method4932();
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Lclient!gaa;")
	public Class114_Sub1 method4994(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass223_44.method4943((long) arg0);
		if (local12 != null) {
			return (Class114_Sub1) local12;
		} else if (this.anInterface3_11.method7248(arg0)) {
			@Pc(37) Class271 local37 = this.anInterface3_11.method7249(arg0);
			@Pc(46) int local46 = local37.aBoolean516 ? 64 : this.aClass66_Sub3_27.anInt6432;
			@Pc(96) Class114_Sub1 local96;
			if (local37.aBoolean519 && this.aClass66_Sub3_27.method6852()) {
				@Pc(108) float[] local108 = this.anInterface3_11.method7253(local46, arg0, local46, 0.7F);
				local96 = new Class114_Sub1(this.aClass66_Sub3_27, 3553, 34842, local46, local46, local37.aByte85 != 0, local108, 6408);
			} else {
				@Pc(66) int[] local66;
				if (local37.aBoolean515) {
					local66 = this.anInterface3_11.method7251(0.7F, local46, arg0, local46);
				} else {
					local66 = this.anInterface3_11.method7250(local46, true, arg0, 0.7F, local46);
				}
				local96 = new Class114_Sub1(this.aClass66_Sub3_27, 3553, 6408, local46, local46, local37.aByte85 != 0, local66, false);
			}
			local96.method5008(local37.aBoolean517, local37.aBoolean518);
			this.aClass223_44.method4938((long) arg0, local96);
			return local96;
		} else {
			return null;
		}
	}
}

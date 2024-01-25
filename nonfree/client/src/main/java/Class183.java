import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class183 {

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Lclient!vi;")
	private final Class332 aClass332_119 = new Class332(256);

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!e;")
	private final Interface7 anInterface7_9;

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_26;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!pea;Lclient!e;)V")
	public Class183(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_9 = arg1;
		this.aClass121_Sub3_26 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public void method4035() {
		this.aClass332_119.method7510();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Lclient!qw;")
	public Class35_Sub3 method4036(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass332_119.method7502((long) arg0);
		if (local12 != null) {
			return (Class35_Sub3) local12;
		} else if (this.anInterface7_9.method5207(arg0)) {
			@Pc(37) Class76 local37 = this.anInterface7_9.method5209(arg0);
			@Pc(46) int local46 = local37.aBoolean105 ? 64 : this.aClass121_Sub3_26.anInt6797;
			@Pc(84) Class35_Sub3 local84;
			if (local37.aBoolean104 && this.aClass121_Sub3_26.method7141()) {
				@Pc(63) float[] local63 = this.anInterface7_9.method5211(arg0, local46, local46, 0.7F);
				local84 = new Class35_Sub3(this.aClass121_Sub3_26, 3553, 34842, local46, local46, local37.aByte18 != 0, local63, 6408);
			} else {
				@Pc(101) int[] local101;
				if (local37.aBoolean113) {
					local101 = this.anInterface7_9.method5206(local46, 0.7F, local46, arg0);
				} else {
					local101 = this.anInterface7_9.method5208(true, 0.7F, local46, local46, arg0);
				}
				local84 = new Class35_Sub3(this.aClass121_Sub3_26, 3553, 6408, local46, local46, local37.aByte18 != 0, local101, false);
			}
			local84.method4857(local37.aBoolean109, local37.aBoolean106);
			this.aClass332_119.method7498((long) arg0, local84);
			return local84;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public void method4038() {
		this.aClass332_119.method7497(5);
	}
}

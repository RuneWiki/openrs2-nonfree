import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class267 {

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "Lclient!qj;")
	private final Class295 aClass295_46 = new Class295(256);

	@OriginalMember(owner = "client!oha", name = "e", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_28;

	@OriginalMember(owner = "client!oha", name = "g", descriptor = "Lclient!d;")
	private final Interface2 anInterface2_7;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!lf;Lclient!d;)V")
	public Class267(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Interface2 arg1) {
		this.aClass95_Sub3_28 = arg0;
		this.anInterface2_7 = arg1;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)Lclient!rba;")
	public Class10_Sub2 method5941(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass295_46.method6470((long) arg0);
		if (local12 != null) {
			return (Class10_Sub2) local12;
		} else if (this.anInterface2_7.method8328(arg0)) {
			@Pc(37) Class250 local37 = this.anInterface2_7.method8330(arg0);
			@Pc(46) int local46 = local37.aBoolean462 ? 64 : this.aClass95_Sub3_28.anInt5745;
			@Pc(104) Class10_Sub2 local104;
			if (local37.aBoolean468 && this.aClass95_Sub3_28.method8011()) {
				@Pc(116) float[] local116 = this.anInterface2_7.method8326(0.7F, local46, arg0, local46);
				local104 = new Class10_Sub2(this.aClass95_Sub3_28, 3553, 34842, local46, local46, local37.aByte98 != 0, local116, 6408);
			} else {
				@Pc(72) int[] local72;
				if (local37.anInt6666 != 2 && Static267.method3942(local37.aByte93)) {
					local72 = this.anInterface2_7.method8329(local46, local46, true, arg0, 0.7F);
				} else {
					local72 = this.anInterface2_7.method8327(0.7F, local46, arg0, local46);
				}
				local104 = new Class10_Sub2(this.aClass95_Sub3_28, 3553, 6408, local46, local46, local37.aByte98 != 0, local72, 0, 0, false);
			}
			local104.method2859(local37.aBoolean463, local37.aBoolean469);
			this.aClass295_46.method6469((long) arg0, local104);
			return local104;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	public void method5942() {
		this.aClass295_46.method6464();
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V")
	public void method5943() {
		this.aClass295_46.method6462(5);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class159 {

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!ad;")
	private final Class6 aClass6_25 = new Class6(256);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!mj;")
	private final Class45_Sub2 aClass45_Sub2_10;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!fa;")
	private final Interface3 anInterface3_7;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!mj;Lclient!fa;)V")
	public Class159(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) Interface3 arg1) {
		this.aClass45_Sub2_10 = arg0;
		this.anInterface3_7 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public void method3784() {
		this.aClass6_25.method102();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public void method3785() {
		this.aClass6_25.method97(5);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!pm;")
	public Interface17 method3787(@OriginalArg(0) int arg0) {
		@Pc(16) Object local16 = this.aClass6_25.method92((long) arg0);
		if (local16 != null) {
			return (Interface17) local16;
		} else if (this.anInterface3_7.method4774(arg0)) {
			@Pc(37) Class55 local37 = this.anInterface3_7.method4776(arg0);
			@Pc(46) int local46 = local37.aBoolean141 ? 64 : this.aClass45_Sub2_10.anInt5865;
			@Pc(81) Interface17 local81;
			if (local37.aBoolean146 && this.aClass45_Sub2_10.method7363()) {
				@Pc(63) float[] local63 = this.anInterface3_7.method4775(local46, local46, 0.7F, arg0);
				local81 = this.aClass45_Sub2_10.method4946(local46, local46, local63, Static469.aClass314_11, local37.aByte19 != 0);
			} else {
				@Pc(111) int[] local111 = !local37.aBoolean140 && Static375.method5509(local37.aByte16) ? this.anInterface3_7.method4779(local46, true, 0.7F, local46, arg0) : this.anInterface3_7.method4777(arg0, local46, 0.7F, local46);
				local81 = this.aClass45_Sub2_10.method4904(local37.aByte19 != 0, local46, local46, local111);
			}
			local81.method6973(local37.aBoolean148, local37.aBoolean145);
			this.aClass6_25.method106((long) arg0, local81);
			return local81;
		} else {
			return null;
		}
	}
}

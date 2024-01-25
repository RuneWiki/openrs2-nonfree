import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class29 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!uc;")
	private final Class198 aClass198_10 = new Class198(256);

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_3;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!wh;")
	private final Interface9 anInterface9_1;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!se;Lclient!wh;)V")
	public Class29(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Interface9 arg1) {
		this.aClass122_Sub2_3 = arg0;
		this.anInterface9_1 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public void method682() {
		this.aClass198_10.method5236();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Lclient!oa;")
	public Class66_Sub1 method683(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass198_10.method5242((long) arg0);
		if (local12 != null) {
			return (Class66_Sub1) local12;
		} else if (this.anInterface9_1.method2394(arg0)) {
			@Pc(33) Class171 local33 = this.anInterface9_1.method2396(arg0);
			@Pc(40) int local40 = local33.aBoolean321 ? 64 : 128;
			@Pc(78) Class66_Sub1 local78;
			if (local33.aBoolean319 && this.aClass122_Sub2_3.method4774()) {
				@Pc(89) float[] local89 = this.anInterface9_1.method2393(local40, 0.7F, arg0, local40);
				local78 = new Class66_Sub1(this.aClass122_Sub2_3, 3553, 34842, local40, local40, local33.aByte56 != 0, local89, 6408);
			} else {
				@Pc(59) int[] local59 = this.anInterface9_1.method2392(local40, local40, arg0, 0.7F);
				local78 = new Class66_Sub1(this.aClass122_Sub2_3, 3553, 6408, local40, local40, local33.aByte56 != 0, local59, false);
			}
			local78.method1516(local33.aBoolean322, local33.aBoolean325);
			this.aClass198_10.method5231((long) arg0, local78);
			return local78;
		} else {
			return null;
		}
	}
}

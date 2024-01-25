import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class225 {

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "Lclient!nga;")
	private final Class233 aClass233_30 = new Class233(256);

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "Lclient!gt;")
	private final Class87_Sub1 aClass87_Sub1_17;

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "Lclient!d;")
	private final Interface6 anInterface6_7;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!gt;Lclient!d;)V")
	public Class225(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) Interface6 arg1) {
		this.aClass87_Sub1_17 = arg0;
		this.anInterface6_7 = arg1;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
	public void method5518() {
		this.aClass233_30.method5664(5);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BI)Lclient!wda;")
	public Interface26 method5519(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass233_30.method5669((long) arg0);
		if (local12 != null) {
			return (Interface26) local12;
		} else if (this.anInterface6_7.method6355(arg0)) {
			@Pc(38) Class199 local38 = this.anInterface6_7.method6357(arg0);
			@Pc(47) int local47 = local38.aBoolean428 ? 64 : this.aClass87_Sub1_17.anInt6136;
			@Pc(82) Interface26 local82;
			if (local38.aBoolean424 && this.aClass87_Sub1_17.method7914()) {
				@Pc(64) float[] local64 = this.anInterface6_7.method6356(arg0, 0.7F, local47, local47);
				local82 = this.aClass87_Sub1_17.method5059(local47, local64, Static524.aClass187_15, local47, local38.aByte85 != 0);
			} else {
				@Pc(105) int[] local105;
				if (local38.anInt5691 != 2 && Static404.method788(local38.aByte86)) {
					local105 = this.anInterface6_7.method6354(0.7F, local47, true, arg0, local47);
				} else {
					local105 = this.anInterface6_7.method6358(local47, arg0, 0.7F, local47);
				}
				local82 = this.aClass87_Sub1_17.method5098(local38.aByte85 != 0, local47, local47, local105);
			}
			local82.method8053(local38.aBoolean426, local38.aBoolean425);
			this.aClass233_30.method5662(local82, (long) arg0);
			return local82;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
	public void method5520() {
		this.aClass233_30.method5663();
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class77 {

	@OriginalMember(owner = "client!er", name = "i", descriptor = "Lclient!qc;")
	private final Class231 aClass231_28 = new Class231(256);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "Lclient!n;")
	private final Interface12 anInterface12_8;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_9;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!os;Lclient!n;)V")
	public Class77(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Interface12 arg1) {
		this.anInterface12_8 = arg1;
		this.aClass39_Sub3_9 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public void method2232() {
		this.aClass231_28.method6231(5);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V")
	public void method2234() {
		this.aClass231_28.method6240();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lclient!ot;")
	public Class19_Sub2 method2236(@OriginalArg(1) int arg0) {
		@Pc(17) Object local17 = this.aClass231_28.method6228((long) arg0);
		if (local17 != null) {
			return (Class19_Sub2) local17;
		} else if (this.anInterface12_8.method2572(arg0)) {
			@Pc(36) Class204 local36 = this.anInterface12_8.method2573(arg0);
			@Pc(45) int local45 = local36.aBoolean454 ? 64 : this.aClass39_Sub3_9.anInt6712;
			@Pc(98) Class19_Sub2 local98;
			if (local36.aBoolean462 && this.aClass39_Sub3_9.method6043()) {
				@Pc(110) float[] local110 = this.anInterface12_8.method2575(local45, local45, arg0, 0.7F);
				local98 = new Class19_Sub2(this.aClass39_Sub3_9, 3553, 34842, local45, local45, local36.aByte81 != 0, local110, 6408);
			} else {
				@Pc(65) int[] local65;
				if (local36.aBoolean453) {
					local65 = this.anInterface12_8.method2574(0.7F, local45, arg0, local45);
				} else {
					local65 = this.anInterface12_8.method2571(local45, local45, 0.7F, arg0, true);
				}
				local98 = new Class19_Sub2(this.aClass39_Sub3_9, 3553, 6408, local45, local45, local36.aByte81 != 0, local65, false);
			}
			local98.method2691(local36.aBoolean461, local36.aBoolean456);
			this.aClass231_28.method6232(local98, (long) arg0);
			return local98;
		} else {
			return null;
		}
	}
}

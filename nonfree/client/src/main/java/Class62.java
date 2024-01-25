import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class62 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Lclient!qc;")
	private final Class231 aClass231_21 = new Class231(256);

	@OriginalMember(owner = "client!du", name = "l", descriptor = "Lclient!n;")
	private final Interface12 anInterface12_6;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "Lclient!kw;")
	private final Class39_Sub2 aClass39_Sub2_6;

	static {
		new Class202("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lclient!kw;Lclient!n;)V")
	public Class62(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Interface12 arg1) {
		this.anInterface12_6 = arg1;
		this.aClass39_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	public void method1765() {
		this.aClass231_21.method6231(5);
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(I)V")
	public void method1769() {
		this.aClass231_21.method6240();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)Lclient!hc;")
	public Interface8 method1770(@OriginalArg(0) int arg0) {
		@Pc(10) Object local10 = this.aClass231_21.method6228((long) arg0);
		if (local10 != null) {
			return (Interface8) local10;
		} else if (this.anInterface12_6.method2572(arg0)) {
			@Pc(29) Class204 local29 = this.anInterface12_6.method2573(arg0);
			@Pc(43) int local43 = local29.aBoolean454 ? 64 : this.aClass39_Sub2_6.anInt7309;
			@Pc(92) Interface8 local92;
			if (local29.aBoolean462 && this.aClass39_Sub2_6.method6043()) {
				@Pc(106) float[] local106 = this.anInterface12_6.method2575(local43, local43, arg0, 0.7F);
				local92 = this.aClass39_Sub2_6.method6108(Static51.aClass150_1, local43, local43, local106, local29.aByte81 != 0);
			} else {
				@Pc(75) int[] local75 = local29.aBoolean453 ? this.anInterface12_6.method2574(0.7F, local43, arg0, local43) : this.anInterface12_6.method2571(local43, local43, 0.7F, arg0, true);
				local92 = this.aClass39_Sub2_6.method6106(local75, local29.aByte81 != 0, local43, local43);
			}
			local92.method5780(local29.aBoolean456, local29.aBoolean461);
			this.aClass231_21.method6232(local92, (long) arg0);
			return local92;
		} else {
			return null;
		}
	}
}

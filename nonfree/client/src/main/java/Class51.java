import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class51 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!of;")
	private final Class236 aClass236_13 = new Class236(256);

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_7;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!d;")
	private final Interface2 anInterface2_6;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!nv;Lclient!d;)V")
	public Class51(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Interface2 arg1) {
		this.aClass16_Sub3_7 = arg0;
		this.anInterface2_6 = arg1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)Lclient!wn;")
	public Class20_Sub4 method1710(@OriginalArg(0) int arg0) {
		@Pc(14) Object local14 = this.aClass236_13.method6242((long) arg0);
		if (local14 != null) {
			return (Class20_Sub4) local14;
		} else if (this.anInterface2_6.method4025(arg0)) {
			@Pc(38) Class218 local38 = this.anInterface2_6.method4027(arg0);
			@Pc(47) int local47 = local38.aBoolean476 ? 64 : this.aClass16_Sub3_7.anInt7336;
			@Pc(85) Class20_Sub4 local85;
			if (local38.aBoolean477 && this.aClass16_Sub3_7.method6079()) {
				@Pc(64) float[] local64 = this.anInterface2_6.method4029(arg0, local47, local47, 0.7F);
				local85 = new Class20_Sub4(this.aClass16_Sub3_7, 3553, 34842, local47, local47, local38.aByte65 != 0, local64, 6408);
			} else {
				@Pc(106) int[] local106;
				if (local38.anInt6842 != 2 && Static634.method7625(local38.aByte66)) {
					local106 = this.anInterface2_6.method4026(true, local47, arg0, 0.7F, local47);
				} else {
					local106 = this.anInterface2_6.method4028(0.7F, local47, arg0, local47);
				}
				local85 = new Class20_Sub4(this.aClass16_Sub3_7, 3553, 6408, local47, local47, local38.aByte65 != 0, local106, 0, 0, false);
			}
			local85.method7626(local38.aBoolean472, local38.aBoolean478);
			this.aClass236_13.method6241((long) arg0, local85);
			return local85;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public void method1713() {
		this.aClass236_13.method6253();
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public void method1714() {
		this.aClass236_13.method6243(5);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class290 {

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "Lclient!hm;")
	private final Class136 aClass136_86 = new Class136(256);

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!e;")
	private final Interface4 anInterface4_14;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Lclient!kea;")
	private final Class14_Sub2 aClass14_Sub2_14;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!kea;Lclient!e;)V")
	public Class290(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_14 = arg1;
		this.aClass14_Sub2_14 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
	public void method6454() {
		this.aClass136_86.method3470();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public void method6455() {
		this.aClass136_86.method3474(5);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZI)Lclient!em;")
	public Interface6 method6457(@OriginalArg(1) int arg0) {
		@Pc(10) Object local10 = this.aClass136_86.method3473((long) arg0);
		if (local10 != null) {
			return (Interface6) local10;
		} else if (this.anInterface4_14.method4233(arg0)) {
			@Pc(29) Class313 local29 = this.anInterface4_14.method4234(arg0);
			@Pc(38) int local38 = local29.aBoolean595 ? 64 : this.aClass14_Sub2_14.anInt8595;
			@Pc(70) Interface6 local70;
			if (local29.aBoolean588 && this.aClass14_Sub2_14.method6887()) {
				@Pc(55) float[] local55 = this.anInterface4_14.method4232(local38, 0.7F, local38, arg0);
				local70 = this.aClass14_Sub2_14.method6984(local55, local38, local29.aByte103 != 0, Static122.aClass219_7, local38);
			} else {
				@Pc(95) int[] local95 = local29.aBoolean596 ? this.anInterface4_14.method4231(local38, local38, arg0, 0.7F) : this.anInterface4_14.method4230(0.7F, arg0, local38, true, local38);
				local70 = this.aClass14_Sub2_14.method6950(local38, local95, local38, local29.aByte103 != 0);
			}
			local70.method7606(local29.aBoolean589, local29.aBoolean591);
			this.aClass136_86.method3482((long) arg0, local70);
			return local70;
		} else {
			return null;
		}
	}
}

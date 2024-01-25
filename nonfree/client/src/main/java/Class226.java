import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class226 {

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "Lclient!pa;")
	private final Class265 aClass265_34 = new Class265(256);

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "Lclient!d;")
	private final Interface3 anInterface3_7;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "Lclient!wk;")
	private final Class143_Sub1 aClass143_Sub1_10;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!wk;Lclient!d;)V")
	public Class226(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_7 = arg1;
		this.aClass143_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	public void method5211() {
		this.aClass265_34.method6568();
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V")
	public void method5214() {
		this.aClass265_34.method6570(5);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)Lclient!kt;")
	public Interface12 method5215(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass265_34.method6577((long) arg0);
		if (local12 != null) {
			return (Interface12) local12;
		} else if (this.anInterface3_7.method8500(arg0)) {
			@Pc(31) Class331 local31 = this.anInterface3_7.method8501(arg0);
			@Pc(46) int local46 = local31.aBoolean659 ? 64 : this.aClass143_Sub1_10.anInt7378;
			@Pc(78) Interface12 local78;
			if (local31.aBoolean661 && this.aClass143_Sub1_10.method6224()) {
				@Pc(63) float[] local63 = this.anInterface3_7.method8498(arg0, 0.7F, local46, local46);
				local78 = this.aClass143_Sub1_10.method6393(local63, local46, local46, Static92.aClass255_3, local31.aByte119 != 0);
			} else {
				@Pc(99) int[] local99;
				if (local31.anInt9140 != 2 && Static670.method8733(local31.aByte117)) {
					local99 = this.anInterface3_7.method8499(arg0, local46, true, 0.7F, local46);
				} else {
					local99 = this.anInterface3_7.method8497(arg0, local46, 0.7F, local46);
				}
				local78 = this.aClass143_Sub1_10.method6292(local31.aByte119 != 0, local99, local46, local46);
			}
			local78.method7449(local31.aBoolean663, local31.aBoolean662);
			this.aClass265_34.method6566(local78, (long) arg0);
			return local78;
		} else {
			return null;
		}
	}
}

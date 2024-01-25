import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class97 {

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Lclient!jr;")
	private final Class169 aClass169_23 = new Class169(256);

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_14;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_6;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!qo;Lclient!d;)V")
	public Class97(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass20_Sub3_14 = arg0;
		this.anInterface4_6 = arg1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	public void method3028() {
		this.aClass169_23.method5009();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)Lclient!tp;")
	public Class85_Sub1 method3032(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass169_23.method5002((long) arg0);
		if (local12 != null) {
			return (Class85_Sub1) local12;
		} else if (this.anInterface4_6.method8049(arg0)) {
			@Pc(31) Class127 local31 = this.anInterface4_6.method8048(arg0);
			@Pc(40) int local40 = local31.aBoolean335 ? 64 : this.aClass20_Sub3_14.anInt8759;
			@Pc(78) Class85_Sub1 local78;
			if (local31.aBoolean342 && this.aClass20_Sub3_14.method7269()) {
				@Pc(57) float[] local57 = this.anInterface4_6.method8046(local40, 0.7F, local40, arg0);
				local78 = new Class85_Sub1(this.aClass20_Sub3_14, 3553, 34842, local40, local40, local31.aByte76 != 0, local57, 6408);
			} else {
				@Pc(101) int[] local101;
				if (local31.anInt4659 != 2 && Static553.method8247(local31.aByte78)) {
					local101 = this.anInterface4_6.method8050(true, arg0, 0.7F, local40, local40);
				} else {
					local101 = this.anInterface4_6.method8051(local40, 0.7F, arg0, local40);
				}
				local78 = new Class85_Sub1(this.aClass20_Sub3_14, 3553, 6408, local40, local40, local31.aByte76 != 0, local101, 0, 0, false);
			}
			local78.method2893(local31.aBoolean340, local31.aBoolean341);
			this.aClass169_23.method5001(local78, (long) arg0);
			return local78;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
	public void method3034() {
		this.aClass169_23.method4997(5);
	}
}

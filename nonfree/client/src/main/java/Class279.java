import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pja")
public final class Class279 {

	@OriginalMember(owner = "client!pja", name = "c", descriptor = "Lclient!tq;")
	private final Class340 aClass340_43 = new Class340(256);

	@OriginalMember(owner = "client!pja", name = "g", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_27;

	@OriginalMember(owner = "client!pja", name = "j", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_8;

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(Lclient!ck;Lclient!d;)V")
	public Class279(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass65_Sub1_27 = arg0;
		this.anInterface4_8 = arg1;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(BI)Lclient!gha;")
	public Class80_Sub2 method6510(@OriginalArg(1) int arg0) {
		@Pc(18) Object local18 = this.aClass340_43.method7999((long) arg0);
		if (local18 != null) {
			return (Class80_Sub2) local18;
		} else if (this.anInterface4_8.method359(arg0)) {
			@Pc(37) Class136 local37 = this.anInterface4_8.method358(arg0);
			@Pc(46) int local46 = local37.aBoolean312 ? 64 : this.aClass65_Sub1_27.anInt1380;
			@Pc(105) Class80_Sub2 local105;
			if (local37.aBoolean310 && this.aClass65_Sub1_27.method6934()) {
				@Pc(116) float[] local116 = this.anInterface4_8.method361(0.7F, arg0, local46, local46);
				local105 = new Class80_Sub2(this.aClass65_Sub1_27, 3553, 34842, local46, local46, local37.aByte54 != 0, local116, 6408);
			} else {
				@Pc(74) int[] local74;
				if (local37.anInt3869 != 2 && Static326.method5072(local37.aByte56)) {
					local74 = this.anInterface4_8.method363(arg0, local46, 0.7F, true, local46);
				} else {
					local74 = this.anInterface4_8.method360(local46, local46, arg0, 0.7F);
				}
				local105 = new Class80_Sub2(this.aClass65_Sub1_27, 3553, 6408, local46, local46, local37.aByte54 != 0, local74, 0, 0, false);
			}
			local105.method7150(local37.aBoolean308, local37.aBoolean309);
			this.aClass340_43.method7986((long) arg0, local105);
			return local105;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Z)V")
	public void method6511() {
		this.aClass340_43.method7996(5);
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V")
	public void method6512() {
		this.aClass340_43.method7987();
	}
}

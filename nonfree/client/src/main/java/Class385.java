import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class385 {

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "Lclient!tq;")
	private final Class340 aClass340_68 = new Class340(256);

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_12;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!gd;")
	private final Class65_Sub2 aClass65_Sub2_21;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!gd;Lclient!d;)V")
	public Class385(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_12 = arg1;
		this.aClass65_Sub2_21 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lclient!w;")
	public Interface27 method8804(@OriginalArg(0) int arg0) {
		@Pc(18) Object local18 = this.aClass340_68.method7999((long) arg0);
		if (local18 != null) {
			return (Interface27) local18;
		} else if (this.anInterface4_12.method359(arg0)) {
			@Pc(37) Class136 local37 = this.anInterface4_12.method358(arg0);
			@Pc(46) int local46 = local37.aBoolean312 ? 64 : this.aClass65_Sub2_21.anInt5244;
			@Pc(103) Interface27 local103;
			if (local37.aBoolean310 && this.aClass65_Sub2_21.method6934()) {
				@Pc(115) float[] local115 = this.anInterface4_12.method361(0.7F, arg0, local46, local46);
				local103 = this.aClass65_Sub2_21.method4360(Static435.aClass339_15, local115, local46, local46, local37.aByte54 != 0);
			} else {
				@Pc(74) int[] local74;
				if (local37.anInt3869 != 2 && Static326.method5072(local37.aByte56)) {
					local74 = this.anInterface4_12.method363(arg0, local46, 0.7F, true, local46);
				} else {
					local74 = this.anInterface4_12.method360(local46, local46, arg0, 0.7F);
				}
				local103 = this.aClass65_Sub2_21.method4371(local46, local74, local46, local37.aByte54 != 0);
			}
			local103.method5618(local37.aBoolean308, local37.aBoolean309);
			this.aClass340_68.method7986((long) arg0, local103);
			return local103;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public void method8805() {
		this.aClass340_68.method7996(5);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public void method8807() {
		this.aClass340_68.method7987();
	}
}

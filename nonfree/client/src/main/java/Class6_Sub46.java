import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public final class Class6_Sub46 extends Class6 {

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "Lclient!kd;")
	public final Class20_Sub2_Sub2_Sub1_Sub2 aClass20_Sub2_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class6_Sub46(@OriginalArg(0) Class20_Sub2_Sub2_Sub1_Sub2 arg0) {
		this.aClass20_Sub2_Sub2_Sub1_Sub2_1 = arg0;
	}
}

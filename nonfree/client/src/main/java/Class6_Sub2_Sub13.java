import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class6_Sub2_Sub13 extends Class6_Sub2 {

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "Lclient!df;")
	public final Class20_Sub2_Sub2_Sub3 aClass20_Sub2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!df;)V")
	public Class6_Sub2_Sub13(@OriginalArg(0) Class20_Sub2_Sub2_Sub3 arg0) {
		this.aClass20_Sub2_Sub2_Sub3_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class6_Sub2_Sub20 extends Class6_Sub2 {

	@OriginalMember(owner = "client!tk", name = "H", descriptor = "Lclient!tt;")
	public final Class20_Sub2_Sub2_Sub4 aClass20_Sub2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class6_Sub2_Sub20(@OriginalArg(0) Class20_Sub2_Sub2_Sub4 arg0) {
		this.aClass20_Sub2_Sub2_Sub4_1 = arg0;
	}
}

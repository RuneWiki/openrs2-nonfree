import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class4_Sub3_Sub21 extends Class4_Sub3 {

	@OriginalMember(owner = "client!w", name = "C", descriptor = "Lclient!he;")
	public Class53_Sub2 aClass53_Sub2_1;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!he;)V")
	public Class4_Sub3_Sub21(@OriginalArg(0) Class53_Sub2 arg0) {
		this.aClass53_Sub2_1 = arg0;
	}
}

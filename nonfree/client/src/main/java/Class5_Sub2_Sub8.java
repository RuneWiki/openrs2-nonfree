import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class5_Sub2_Sub8 extends Class5_Sub2 {

	@OriginalMember(owner = "client!cs", name = "x", descriptor = "Lclient!rg;")
	public final Class15_Sub2_Sub5 aClass15_Sub2_Sub5_1;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class5_Sub2_Sub8(@OriginalArg(0) Class15_Sub2_Sub5 arg0) {
		this.aClass15_Sub2_Sub5_1 = arg0;
	}
}

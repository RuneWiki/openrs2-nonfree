import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "Lclient!f;")
	public Class5_Sub6 aClass5_Sub6_1;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!f;)V")
	public Class1_Sub2_Sub8(@OriginalArg(0) Class5_Sub6 arg0) {
		this.aClass5_Sub6_1 = arg0;
	}
}

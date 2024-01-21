import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "Lclient!dd;")
	public final Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!dd;)V")
	public Class1_Sub3_Sub18(@OriginalArg(0) Class8_Sub2 arg0) {
		this.aClass8_Sub2_1 = arg0;
	}
}

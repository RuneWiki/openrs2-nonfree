import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class5_Sub2_Sub3 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ah", name = "J", descriptor = "Lclient!ph;")
	public final Class1_Sub6 aClass1_Sub6_1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ph;)V")
	public Class5_Sub2_Sub3(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass1_Sub6_1 = arg0;
	}
}

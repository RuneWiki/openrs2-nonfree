import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "Lclient!os;")
	public final Class1_Sub2_Sub5 aClass1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) Class1_Sub2_Sub5 arg0) {
		this.aClass1_Sub2_Sub5_1 = arg0;
	}
}

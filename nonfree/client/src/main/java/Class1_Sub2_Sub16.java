import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!si", name = "L", descriptor = "Lclient!kc;")
	public Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!kc;)V")
	public Class1_Sub2_Sub16(@OriginalArg(0) Class5_Sub3 arg0) {
		this.aClass5_Sub3_1 = arg0;
	}
}

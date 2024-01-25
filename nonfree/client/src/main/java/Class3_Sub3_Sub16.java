import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class3_Sub3_Sub16 extends Class3_Sub3 {

	@OriginalMember(owner = "client!vea", name = "u", descriptor = "Lclient!be;")
	public final Class9_Sub1_Sub1_Sub3 aClass9_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!be;)V")
	public Class3_Sub3_Sub16(@OriginalArg(0) Class9_Sub1_Sub1_Sub3 arg0) {
		this.aClass9_Sub1_Sub1_Sub3_1 = arg0;
	}
}

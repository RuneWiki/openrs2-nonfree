import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class3_Sub52 extends Class3 {

	@OriginalMember(owner = "client!w", name = "l", descriptor = "Lclient!ub;")
	public final Class34_Sub1_Sub1_Sub2_Sub2 aClass34_Sub1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!ub;)V")
	public Class3_Sub52(@OriginalArg(0) Class34_Sub1_Sub1_Sub2_Sub2 arg0) {
		this.aClass34_Sub1_Sub1_Sub2_Sub2_2 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class3_Sub6_Sub15 extends Class3_Sub6 {

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "Lclient!as;")
	public final Class23_Sub2_Sub1_Sub1 aClass23_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!as;)V")
	public Class3_Sub6_Sub15(@OriginalArg(0) Class23_Sub2_Sub1_Sub1 arg0) {
		this.aClass23_Sub2_Sub1_Sub1_1 = arg0;
	}
}

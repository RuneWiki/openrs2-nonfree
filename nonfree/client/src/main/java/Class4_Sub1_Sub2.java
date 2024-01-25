import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!as", name = "F", descriptor = "Lclient!mq;")
	public final Class11_Sub5_Sub3 aClass11_Sub5_Sub3_1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!mq;)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class11_Sub5_Sub3 arg0) {
		this.aClass11_Sub5_Sub3_1 = arg0;
	}
}

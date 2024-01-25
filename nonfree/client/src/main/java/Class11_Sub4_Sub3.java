import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class11_Sub4_Sub3 extends Class11_Sub4 {

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "Lclient!ka;")
	public final Class67_Sub3_Sub2 aClass67_Sub3_Sub2_1;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class11_Sub4_Sub3(@OriginalArg(0) Class67_Sub3_Sub2 arg0) {
		this.aClass67_Sub3_Sub2_1 = arg0;
	}
}

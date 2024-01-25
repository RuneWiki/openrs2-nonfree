import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public final class Class11_Sub4_Sub21 extends Class11_Sub4 {

	@OriginalMember(owner = "client!wa", name = "E", descriptor = "Lclient!te;")
	public final Class67_Sub3_Sub4 aClass67_Sub3_Sub4_1;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class11_Sub4_Sub21(@OriginalArg(0) Class67_Sub3_Sub4 arg0) {
		this.aClass67_Sub3_Sub4_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class2_Sub3_Sub21 extends Class2_Sub3 {

	@OriginalMember(owner = "client!um", name = "K", descriptor = "Lclient!qd;")
	public Class36_Sub5 aClass36_Sub5_1;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!qd;)V")
	public Class2_Sub3_Sub21(@OriginalArg(0) Class36_Sub5 arg0) {
		this.aClass36_Sub5_1 = arg0;
	}
}

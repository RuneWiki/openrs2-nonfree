import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class5_Sub1_Sub3 extends Class5_Sub1 {

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "Lclient!qja;")
	public final Class4_Sub1_Sub1_Sub4 aClass4_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!qja;)V")
	public Class5_Sub1_Sub3(@OriginalArg(0) Class4_Sub1_Sub1_Sub4 arg0) {
		this.aClass4_Sub1_Sub1_Sub4_1 = arg0;
	}
}

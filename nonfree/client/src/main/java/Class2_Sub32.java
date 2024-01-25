import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "Lclient!cc;")
	public final Class16_Sub1_Sub1_Sub3_Sub1 aClass16_Sub1_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!cc;)V")
	public Class2_Sub32(@OriginalArg(0) Class16_Sub1_Sub1_Sub3_Sub1 arg0) {
		this.aClass16_Sub1_Sub1_Sub3_Sub1_2 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class5_Sub1_Sub7 extends Class5_Sub1 {

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "Lclient!qo;")
	public final Class4_Sub5_Sub3 aClass4_Sub5_Sub3_1;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class5_Sub1_Sub7(@OriginalArg(0) Class4_Sub5_Sub3 arg0) {
		this.aClass4_Sub5_Sub3_1 = arg0;
	}
}

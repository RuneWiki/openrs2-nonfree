import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class5_Sub1_Sub17 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "Lclient!su;")
	public final Class4_Sub1_Sub1_Sub5 aClass4_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!su;)V")
	public Class5_Sub1_Sub17(@OriginalArg(0) Class4_Sub1_Sub1_Sub5 arg0) {
		this.aClass4_Sub1_Sub1_Sub5_1 = arg0;
	}
}

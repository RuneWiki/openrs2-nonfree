import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public final class Class5_Sub5_Sub5 extends Class5_Sub5 {

	@OriginalMember(owner = "client!eia", name = "v", descriptor = "Lclient!ue;")
	public final Class4_Sub2_Sub1_Sub5 aClass4_Sub2_Sub1_Sub5_1;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Lclient!ue;)V")
	public Class5_Sub5_Sub5(@OriginalArg(0) Class4_Sub2_Sub1_Sub5 arg0) {
		this.aClass4_Sub2_Sub1_Sub5_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class5_Sub5_Sub18 extends Class5_Sub5 {

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "Lclient!ra;")
	public final Class4_Sub2_Sub1_Sub4 aClass4_Sub2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!ra;)V")
	public Class5_Sub5_Sub18(@OriginalArg(0) Class4_Sub2_Sub1_Sub4 arg0) {
		this.aClass4_Sub2_Sub1_Sub4_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class3_Sub4_Sub19 extends Class3_Sub4 {

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "Lclient!sfa;")
	public final Class4_Sub1_Sub2_Sub5 aClass4_Sub1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!sfa;)V")
	public Class3_Sub4_Sub19(@OriginalArg(0) Class4_Sub1_Sub2_Sub5 arg0) {
		this.aClass4_Sub1_Sub2_Sub5_1 = arg0;
	}
}

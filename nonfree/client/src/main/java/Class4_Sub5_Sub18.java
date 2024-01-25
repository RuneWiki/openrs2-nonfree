import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class4_Sub5_Sub18 extends Class4_Sub5 {

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "Lclient!vr;")
	public final Class1_Sub4_Sub2_Sub5 aClass1_Sub4_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!vr;)V")
	public Class4_Sub5_Sub18(@OriginalArg(0) Class1_Sub4_Sub2_Sub5 arg0) {
		this.aClass1_Sub4_Sub2_Sub5_1 = arg0;
	}
}

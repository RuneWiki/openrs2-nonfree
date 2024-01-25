import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "Lclient!su;")
	public final Class4_Sub2_Sub5 aClass4_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!su;)V")
	public Class2_Sub2_Sub1(@OriginalArg(0) Class4_Sub2_Sub5 arg0) {
		this.aClass4_Sub2_Sub5_1 = arg0;
	}
}

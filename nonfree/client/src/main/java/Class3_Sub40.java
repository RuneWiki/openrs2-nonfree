import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "Lclient!ub;")
	public final Class1_Sub2_Sub6_Sub1 aClass1_Sub2_Sub6_Sub1_2;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ub;)V")
	public Class3_Sub40(@OriginalArg(0) Class1_Sub2_Sub6_Sub1 arg0) {
		this.aClass1_Sub2_Sub6_Sub1_2 = arg0;
	}
}

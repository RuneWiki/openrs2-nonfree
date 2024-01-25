import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "Lclient!paa;")
	public final Class8_Sub3_Sub3_Sub1_Sub2 aClass8_Sub3_Sub3_Sub1_Sub2_2;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!paa;)V")
	public Class1_Sub42(@OriginalArg(0) Class8_Sub3_Sub3_Sub1_Sub2 arg0) {
		this.aClass8_Sub3_Sub3_Sub1_Sub2_2 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lk", name = "D", descriptor = "Lclient!hc;")
	public final Class15_Sub3_Sub3_Sub3 aClass15_Sub3_Sub3_Sub3_1;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!hc;)V")
	public Class2_Sub1_Sub12(@OriginalArg(0) Class15_Sub3_Sub3_Sub3 arg0) {
		this.aClass15_Sub3_Sub3_Sub3_1 = arg0;
	}
}

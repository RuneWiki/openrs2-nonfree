import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class2_Sub8_Sub11 extends Class2_Sub8 {

	@OriginalMember(owner = "client!ll", name = "w", descriptor = "Lclient!cl;")
	public Class15_Sub3 aClass15_Sub3_1;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!cl;)V")
	public Class2_Sub8_Sub11(@OriginalArg(0) Class15_Sub3 arg0) {
		this.aClass15_Sub3_1 = arg0;
	}
}

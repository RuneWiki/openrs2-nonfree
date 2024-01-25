import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "Lclient!ff;")
	public final Class3_Sub1_Sub3_Sub3_Sub1 aClass3_Sub1_Sub3_Sub3_Sub1_2;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!ff;)V")
	public Class2_Sub33(@OriginalArg(0) Class3_Sub1_Sub3_Sub3_Sub1 arg0) {
		this.aClass3_Sub1_Sub3_Sub3_Sub1_2 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class2_Sub3_Sub15 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "Lclient!bi;")
	public final Class6_Sub1_Sub1_Sub2 aClass6_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class2_Sub3_Sub15(@OriginalArg(0) Class6_Sub1_Sub1_Sub2 arg0) {
		this.aClass6_Sub1_Sub1_Sub2_1 = arg0;
	}
}

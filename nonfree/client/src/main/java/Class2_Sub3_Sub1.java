import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "Lclient!qf;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!qf;)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) Class5 arg0) {
		this.aClass5_1 = arg0;
	}
}

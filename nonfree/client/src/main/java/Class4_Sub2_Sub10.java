import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class4_Sub2_Sub10 extends Class4_Sub2 {

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "Lclient!fh;")
	public Class13_Sub3 aClass13_Sub3_1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class4_Sub2_Sub10(@OriginalArg(0) Class13_Sub3 arg0) {
		this.aClass13_Sub3_1 = arg0;
	}
}

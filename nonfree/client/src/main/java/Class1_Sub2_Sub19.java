import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Lclient!ja;")
	public Class14_Sub5 aClass14_Sub5_1;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!ja;)V")
	public Class1_Sub2_Sub19(@OriginalArg(0) Class14_Sub5 arg0) {
		this.aClass14_Sub5_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "Lclient!wj;")
	public Class36_Sub7 aClass36_Sub7_1;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!wj;)V")
	public Class2_Sub3_Sub11(@OriginalArg(0) Class36_Sub7 arg0) {
		this.aClass36_Sub7_1 = arg0;
	}
}

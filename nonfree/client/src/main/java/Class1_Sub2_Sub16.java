import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!me", name = "W", descriptor = "Lclient!tg;")
	public final Class5_Sub7 aClass5_Sub7_1;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!tg;)V")
	public Class1_Sub2_Sub16(@OriginalArg(0) Class5_Sub7 arg0) {
		this.aClass5_Sub7_1 = arg0;
	}
}

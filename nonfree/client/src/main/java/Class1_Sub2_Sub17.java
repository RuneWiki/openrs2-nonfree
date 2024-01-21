import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Lclient!wd;")
	public final Class5 aClass5_7;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class1_Sub2_Sub17(@OriginalArg(0) Class5 arg0) {
		this.aClass5_7 = arg0;
	}
}

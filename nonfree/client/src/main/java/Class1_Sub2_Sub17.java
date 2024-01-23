import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "Lclient!wd;")
	public Class25_Sub7 aClass25_Sub7_1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class1_Sub2_Sub17(@OriginalArg(0) Class25_Sub7 arg0) {
		this.aClass25_Sub7_1 = arg0;
	}
}

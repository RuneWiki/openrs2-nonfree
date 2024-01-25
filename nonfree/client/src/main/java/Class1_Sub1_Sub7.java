import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "Lclient!ln;")
	public final Class47_Sub2_Sub5 aClass47_Sub2_Sub5_1;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!ln;)V")
	public Class1_Sub1_Sub7(@OriginalArg(0) Class47_Sub2_Sub5 arg0) {
		this.aClass47_Sub2_Sub5_1 = arg0;
	}
}

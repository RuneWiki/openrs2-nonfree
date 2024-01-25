import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vv", name = "y", descriptor = "Lclient!dm;")
	public final Class47_Sub1_Sub3 aClass47_Sub1_Sub3_1;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!dm;)V")
	public Class1_Sub1_Sub18(@OriginalArg(0) Class47_Sub1_Sub3 arg0) {
		this.aClass47_Sub1_Sub3_1 = arg0;
	}
}

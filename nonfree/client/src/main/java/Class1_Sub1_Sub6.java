import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!cv;")
	public final Class47_Sub2_Sub2 aClass47_Sub2_Sub2_1;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!cv;)V")
	public Class1_Sub1_Sub6(@OriginalArg(0) Class47_Sub2_Sub2 arg0) {
		this.aClass47_Sub2_Sub2_1 = arg0;
	}
}

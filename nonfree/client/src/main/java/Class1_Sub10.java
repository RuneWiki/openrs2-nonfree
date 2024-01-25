import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "Lclient!ica;")
	public final Class47_Sub2_Sub3_Sub1 aClass47_Sub2_Sub3_Sub1_2;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!ica;)V")
	public Class1_Sub10(@OriginalArg(0) Class47_Sub2_Sub3_Sub1 arg0) {
		this.aClass47_Sub2_Sub3_Sub1_2 = arg0;
	}
}

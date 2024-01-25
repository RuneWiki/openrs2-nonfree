import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "Lclient!jc;")
	public final Class49_Sub2_Sub2_Sub2 aClass49_Sub2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class1_Sub17(@OriginalArg(0) Class49_Sub2_Sub2_Sub2 arg0) {
		this.aClass49_Sub2_Sub2_Sub2_2 = arg0;
	}
}

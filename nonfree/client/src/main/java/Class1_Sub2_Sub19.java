import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "Lclient!jc;")
	public Class9_Sub6 aClass9_Sub6_1;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class1_Sub2_Sub19(@OriginalArg(0) Class9_Sub6 arg0) {
		this.aClass9_Sub6_1 = arg0;
	}
}

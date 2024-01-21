import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "Lclient!pb;")
	public final Class6_Sub6 aClass6_Sub6_1;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!pb;)V")
	public Class1_Sub2_Sub23(@OriginalArg(0) Class6_Sub6 arg0) {
		this.aClass6_Sub6_1 = arg0;
	}
}

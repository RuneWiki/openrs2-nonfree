import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class4_Sub1_Sub14 extends Class4_Sub1 {

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "Lclient!lq;")
	public final Class6_Sub2_Sub6 aClass6_Sub2_Sub6_1;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!lq;)V")
	public Class4_Sub1_Sub14(@OriginalArg(0) Class6_Sub2_Sub6 arg0) {
		this.aClass6_Sub2_Sub6_1 = arg0;
	}
}

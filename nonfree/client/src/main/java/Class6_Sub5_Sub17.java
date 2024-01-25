import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class6_Sub5_Sub17 extends Class6_Sub5 {

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "Lclient!qs;")
	public final Class15_Sub2_Sub6 aClass15_Sub2_Sub6_1;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!qs;)V")
	public Class6_Sub5_Sub17(@OriginalArg(0) Class15_Sub2_Sub6 arg0) {
		this.aClass15_Sub2_Sub6_1 = arg0;
	}
}

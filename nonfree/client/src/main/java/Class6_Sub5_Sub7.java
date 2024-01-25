import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class6_Sub5_Sub7 extends Class6_Sub5 {

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Lclient!dq;")
	public final Class15_Sub2_Sub2 aClass15_Sub2_Sub2_1;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!dq;)V")
	public Class6_Sub5_Sub7(@OriginalArg(0) Class15_Sub2_Sub2 arg0) {
		this.aClass15_Sub2_Sub2_1 = arg0;
	}
}

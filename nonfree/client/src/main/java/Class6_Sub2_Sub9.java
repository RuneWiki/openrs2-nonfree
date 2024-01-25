import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class6_Sub2_Sub9 extends Class6_Sub2 {

	@OriginalMember(owner = "client!l", name = "E", descriptor = "Lclient!lu;")
	public final Class3_Sub2_Sub5 aClass3_Sub2_Sub5_1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!lu;)V")
	public Class6_Sub2_Sub9(@OriginalArg(0) Class3_Sub2_Sub5 arg0) {
		this.aClass3_Sub2_Sub5_1 = arg0;
	}
}

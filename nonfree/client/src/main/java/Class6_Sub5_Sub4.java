import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class6_Sub5_Sub4 extends Class6_Sub5 {

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "Lclient!or;")
	public final Class9_Sub4_Sub2_Sub3 aClass9_Sub4_Sub2_Sub3_1;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!or;)V")
	public Class6_Sub5_Sub4(@OriginalArg(0) Class9_Sub4_Sub2_Sub3 arg0) {
		this.aClass9_Sub4_Sub2_Sub3_1 = arg0;
	}
}

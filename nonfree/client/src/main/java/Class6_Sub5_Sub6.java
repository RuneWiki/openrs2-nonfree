import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class6_Sub5_Sub6 extends Class6_Sub5 {

	@OriginalMember(owner = "client!de", name = "x", descriptor = "Lclient!rk;")
	public final Class9_Sub4_Sub2_Sub4 aClass9_Sub4_Sub2_Sub4_1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!rk;)V")
	public Class6_Sub5_Sub6(@OriginalArg(0) Class9_Sub4_Sub2_Sub4 arg0) {
		this.aClass9_Sub4_Sub2_Sub4_1 = arg0;
	}
}

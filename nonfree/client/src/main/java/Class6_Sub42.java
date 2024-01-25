import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public final class Class6_Sub42 extends Class6 {

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "Lclient!cea;")
	public final Class9_Sub4_Sub2_Sub1_Sub1 aClass9_Sub4_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!cea;)V")
	public Class6_Sub42(@OriginalArg(0) Class9_Sub4_Sub2_Sub1_Sub1 arg0) {
		this.aClass9_Sub4_Sub2_Sub1_Sub1_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "Lclient!tt;")
	public final Class6_Sub1_Sub2_Sub2 aClass6_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class3_Sub3(@OriginalArg(0) Class6_Sub1_Sub2_Sub2 arg0) {
		this.aClass6_Sub1_Sub2_Sub2_1 = arg0;
	}
}

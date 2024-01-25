import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public final class Class5_Sub4_Sub11 extends Class5_Sub4 {

	@OriginalMember(owner = "client!hw", name = "B", descriptor = "Lclient!eg;")
	public final Class14_Sub1_Sub1_Sub2 aClass14_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!eg;)V")
	public Class5_Sub4_Sub11(@OriginalArg(0) Class14_Sub1_Sub1_Sub2 arg0) {
		this.aClass14_Sub1_Sub1_Sub2_1 = arg0;
	}
}

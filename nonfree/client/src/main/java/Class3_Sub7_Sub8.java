import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class3_Sub7_Sub8 extends Class3_Sub7 {

	@OriginalMember(owner = "client!fj", name = "y", descriptor = "Lclient!bv;")
	public final Class41_Sub2_Sub1_Sub1 aClass41_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class3_Sub7_Sub8(@OriginalArg(0) Class41_Sub2_Sub1_Sub1 arg0) {
		this.aClass41_Sub2_Sub1_Sub1_1 = arg0;
	}
}

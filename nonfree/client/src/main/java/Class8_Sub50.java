import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class8_Sub50 extends Class8 {

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Lclient!pk;")
	public final Class15_Sub1_Sub2_Sub2_Sub2 aClass15_Sub1_Sub2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!pk;)V")
	public Class8_Sub50(@OriginalArg(0) Class15_Sub1_Sub2_Sub2_Sub2 arg0) {
		this.aClass15_Sub1_Sub2_Sub2_Sub2_2 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class3_Sub52 extends Class3 {

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "Lclient!rw;")
	public final Class9_Sub1_Sub1_Sub2_Sub2 aClass9_Sub1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!rw;)V")
	public Class3_Sub52(@OriginalArg(0) Class9_Sub1_Sub1_Sub2_Sub2 arg0) {
		this.aClass9_Sub1_Sub1_Sub2_Sub2_2 = arg0;
	}
}

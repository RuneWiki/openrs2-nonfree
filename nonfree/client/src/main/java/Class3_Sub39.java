import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!an;")
	public final Class9_Sub1_Sub1_Sub2_Sub1 aClass9_Sub1_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!an;)V")
	public Class3_Sub39(@OriginalArg(0) Class9_Sub1_Sub1_Sub2_Sub1 arg0) {
		this.aClass9_Sub1_Sub1_Sub2_Sub1_2 = arg0;
	}
}

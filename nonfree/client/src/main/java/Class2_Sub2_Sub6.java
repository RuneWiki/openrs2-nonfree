import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "Lclient!e;")
	public final Class24_Sub1 aClass24_Sub1_1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class2_Sub2_Sub6(@OriginalArg(0) Class24_Sub1 arg0) {
		this.aClass24_Sub1_1 = arg0;
	}
}

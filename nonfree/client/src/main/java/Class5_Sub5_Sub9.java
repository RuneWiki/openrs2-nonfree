import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public final class Class5_Sub5_Sub9 extends Class5_Sub5 {

	@OriginalMember(owner = "client!hfa", name = "s", descriptor = "Lclient!ti;")
	public final Class8_Sub1_Sub3_Sub5 aClass8_Sub1_Sub3_Sub5_1;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!ti;)V")
	public Class5_Sub5_Sub9(@OriginalArg(0) Class8_Sub1_Sub3_Sub5 arg0) {
		this.aClass8_Sub1_Sub3_Sub5_1 = arg0;
	}
}

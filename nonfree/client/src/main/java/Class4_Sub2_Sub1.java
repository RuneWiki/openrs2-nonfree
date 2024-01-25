import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Lclient!rn;")
	public final Class8_Sub3_Sub5 aClass8_Sub3_Sub5_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!rn;)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class8_Sub3_Sub5 arg0) {
		this.aClass8_Sub3_Sub5_1 = arg0;
	}
}

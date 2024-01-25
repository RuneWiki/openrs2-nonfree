import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class6_Sub2_Sub15 extends Class6_Sub2 {

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "Lclient!ni;")
	public final Class4_Sub1_Sub5 aClass4_Sub1_Sub5_1;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!ni;)V")
	public Class6_Sub2_Sub15(@OriginalArg(0) Class4_Sub1_Sub5 arg0) {
		this.aClass4_Sub1_Sub5_1 = arg0;
	}
}

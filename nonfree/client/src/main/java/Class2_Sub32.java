import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Lclient!ac;")
	public final Class6_Sub1_Sub1_Sub1_Sub1 aClass6_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class2_Sub32(@OriginalArg(0) Class6_Sub1_Sub1_Sub1_Sub1 arg0) {
		this.aClass6_Sub1_Sub1_Sub1_Sub1_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public final class Class2_Sub6_Sub2 extends Class2_Sub6 {

	@OriginalMember(owner = "client!bga", name = "w", descriptor = "Lclient!ae;")
	public final Class4_Sub2_Sub1_Sub1 aClass4_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class2_Sub6_Sub2(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0) {
		this.aClass4_Sub2_Sub1_Sub1_1 = arg0;
	}
}

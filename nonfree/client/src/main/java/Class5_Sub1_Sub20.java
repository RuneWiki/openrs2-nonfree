import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class5_Sub1_Sub20 extends Class5_Sub1 {

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "Lclient!jb;")
	public final Class4_Sub5_Sub1 aClass4_Sub5_Sub1_1;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!jb;)V")
	public Class5_Sub1_Sub20(@OriginalArg(0) Class4_Sub5_Sub1 arg0) {
		this.aClass4_Sub5_Sub1_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "Lclient!ns;")
	public final Class4_Sub1_Sub1_Sub2_Sub2 aClass4_Sub1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!ns;)V")
	public Class5_Sub9(@OriginalArg(0) Class4_Sub1_Sub1_Sub2_Sub2 arg0) {
		this.aClass4_Sub1_Sub1_Sub2_Sub2_1 = arg0;
	}
}

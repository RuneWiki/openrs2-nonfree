import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!in", name = "g", descriptor = "Lclient!gt;")
	public final Class4_Sub1_Sub2_Sub1_Sub1 aClass4_Sub1_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class3_Sub28(@OriginalArg(0) Class4_Sub1_Sub2_Sub1_Sub1 arg0) {
		this.aClass4_Sub1_Sub2_Sub1_Sub1_2 = arg0;
	}
}

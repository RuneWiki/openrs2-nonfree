import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class4_Sub6_Sub9 extends Class4_Sub6 {

	@OriginalMember(owner = "client!jca", name = "D", descriptor = "Lclient!iq;")
	public final Class21_Sub1_Sub1_Sub2 aClass21_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!iq;)V")
	public Class4_Sub6_Sub9(@OriginalArg(0) Class21_Sub1_Sub1_Sub2 arg0) {
		this.aClass21_Sub1_Sub1_Sub2_1 = arg0;
	}
}

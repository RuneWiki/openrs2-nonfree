import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class3_Sub4_Sub9 extends Class3_Sub4 {

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "Lclient!jh;")
	public final Class7_Sub2_Sub6 aClass7_Sub2_Sub6_1;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!jh;)V")
	public Class3_Sub4_Sub9(@OriginalArg(0) Class7_Sub2_Sub6 arg0) {
		this.aClass7_Sub2_Sub6_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class3_Sub7_Sub14 extends Class3_Sub7 {

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "Lclient!jja;")
	public final Class9_Sub1_Sub1_Sub4 aClass9_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!jja;)V")
	public Class3_Sub7_Sub14(@OriginalArg(0) Class9_Sub1_Sub1_Sub4 arg0) {
		this.aClass9_Sub1_Sub1_Sub4_1 = arg0;
	}
}

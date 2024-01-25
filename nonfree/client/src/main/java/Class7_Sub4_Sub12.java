import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class7_Sub4_Sub12 extends Class7_Sub4 {

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Lclient!bn;")
	public final Class26_Sub2_Sub1 aClass26_Sub2_Sub1_1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!bn;)V")
	public Class7_Sub4_Sub12(@OriginalArg(0) Class26_Sub2_Sub1 arg0) {
		this.aClass26_Sub2_Sub1_1 = arg0;
	}
}

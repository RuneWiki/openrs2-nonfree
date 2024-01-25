import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class3_Sub11_Sub20 extends Class3_Sub11 {

	@OriginalMember(owner = "client!uv", name = "y", descriptor = "Lclient!o;")
	public final Class28_Sub1_Sub1_Sub3 aClass28_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!o;)V")
	public Class3_Sub11_Sub20(@OriginalArg(0) Class28_Sub1_Sub1_Sub3 arg0) {
		this.aClass28_Sub1_Sub1_Sub3_1 = arg0;
	}
}

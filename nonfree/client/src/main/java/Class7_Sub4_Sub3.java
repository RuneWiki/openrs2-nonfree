import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class7_Sub4_Sub3 extends Class7_Sub4 {

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Lclient!jp;")
	public final Class26_Sub2_Sub3 aClass26_Sub2_Sub3_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!jp;)V")
	public Class7_Sub4_Sub3(@OriginalArg(0) Class26_Sub2_Sub3 arg0) {
		this.aClass26_Sub2_Sub3_1 = arg0;
	}
}

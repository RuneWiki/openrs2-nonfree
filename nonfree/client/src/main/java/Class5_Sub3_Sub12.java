import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class5_Sub3_Sub12 extends Class5_Sub3 {

	@OriginalMember(owner = "client!og", name = "s", descriptor = "Lclient!nja;")
	public final Class28_Sub1_Sub4_Sub3 aClass28_Sub1_Sub4_Sub3_1;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!nja;)V")
	public Class5_Sub3_Sub12(@OriginalArg(0) Class28_Sub1_Sub4_Sub3 arg0) {
		this.aClass28_Sub1_Sub4_Sub3_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public final class Class3_Sub7_Sub2 extends Class3_Sub7 {

	@OriginalMember(owner = "client!bga", name = "J", descriptor = "Lclient!ga;")
	public final Class25_Sub2_Sub2_Sub2 aClass25_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!ga;)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) Class25_Sub2_Sub2_Sub2 arg0) {
		this.aClass25_Sub2_Sub2_Sub2_1 = arg0;
	}
}

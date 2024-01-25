import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class1_Sub5_Sub15 extends Class1_Sub5 {

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "Lclient!lk;")
	public final Class25_Sub5_Sub3 aClass25_Sub5_Sub3_1;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!lk;)V")
	public Class1_Sub5_Sub15(@OriginalArg(0) Class25_Sub5_Sub3 arg0) {
		this.aClass25_Sub5_Sub3_1 = arg0;
	}
}

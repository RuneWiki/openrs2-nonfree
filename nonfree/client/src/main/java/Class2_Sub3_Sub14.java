import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class2_Sub3_Sub14 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "Lclient!rc;")
	public Class5_Sub6 aClass5_Sub6_1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!rc;)V")
	public Class2_Sub3_Sub14(@OriginalArg(0) Class5_Sub6 arg0) {
		this.aClass5_Sub6_1 = arg0;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class4_Sub2_Sub3 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "Lclient!qm;")
	public Class13_Sub6 aClass13_Sub6_1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class4_Sub2_Sub3(@OriginalArg(0) Class13_Sub6 arg0) {
		this.aClass13_Sub6_1 = arg0;
	}
}

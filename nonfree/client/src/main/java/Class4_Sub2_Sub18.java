import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class4_Sub2_Sub18 extends Class4_Sub2 {

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "Lclient!pd;")
	public Class12_Sub5 aClass12_Sub5_1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!pd;)V")
	public Class4_Sub2_Sub18(@OriginalArg(0) Class12_Sub5 arg0) {
		this.aClass12_Sub5_1 = arg0;
	}
}

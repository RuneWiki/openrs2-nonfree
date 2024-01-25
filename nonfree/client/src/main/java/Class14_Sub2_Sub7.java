import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class14_Sub2_Sub7 extends Class14_Sub2 {

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "Lclient!md;")
	public final Class10_Sub3_Sub5 aClass10_Sub3_Sub5_1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!md;)V")
	public Class14_Sub2_Sub7(@OriginalArg(0) Class10_Sub3_Sub5 arg0) {
		this.aClass10_Sub3_Sub5_1 = arg0;
	}
}

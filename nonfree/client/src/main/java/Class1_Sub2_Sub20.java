import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "Lclient!mh;")
	public final Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class1_Sub2_Sub20(@OriginalArg(0) Class5_Sub3 arg0) {
		this.aClass5_Sub3_1 = arg0;
	}
}

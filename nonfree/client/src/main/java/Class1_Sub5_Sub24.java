import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class1_Sub5_Sub24 extends Class1_Sub5 {

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "Lclient!gb;")
	public Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!gb;)V")
	public Class1_Sub5_Sub24(@OriginalArg(0) Class11_Sub3 arg0) {
		this.aClass11_Sub3_1 = arg0;
	}
}

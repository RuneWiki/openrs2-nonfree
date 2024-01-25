import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "Lclient!fp;")
	public final Class11_Sub5_Sub1 aClass11_Sub5_Sub1_1;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!fp;)V")
	public Class2_Sub1_Sub18(@OriginalArg(0) Class11_Sub5_Sub1 arg0) {
		this.aClass11_Sub5_Sub1_1 = arg0;
	}
}

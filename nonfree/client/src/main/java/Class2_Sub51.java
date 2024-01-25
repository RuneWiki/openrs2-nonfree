import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class2_Sub51 extends Class2 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!fca;")
	public final Class11_Sub1_Sub1_Sub2_Sub2 aClass11_Sub1_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class2_Sub51(@OriginalArg(0) Class11_Sub1_Sub1_Sub2_Sub2 arg0) {
		this.aClass11_Sub1_Sub1_Sub2_Sub2_2 = arg0;
	}
}

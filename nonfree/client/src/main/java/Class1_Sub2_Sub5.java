import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "Lclient!ma;")
	public Class14_Sub7 aClass14_Sub7_1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!ma;)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) Class14_Sub7 arg0) {
		this.aClass14_Sub7_1 = arg0;
	}
}

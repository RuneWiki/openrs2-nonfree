import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!p", name = "L", descriptor = "Lclient!rb;")
	public final Class6_Sub7 aClass6_Sub7_1;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!rb;)V")
	public Class1_Sub2_Sub18(@OriginalArg(0) Class6_Sub7 arg0) {
		this.aClass6_Sub7_1 = arg0;
	}
}

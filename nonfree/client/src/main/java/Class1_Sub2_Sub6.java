import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "Lclient!aj;")
	public Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class1_Sub2_Sub6(@OriginalArg(0) Class6_Sub1 arg0) {
		this.aClass6_Sub1_1 = arg0;
	}
}

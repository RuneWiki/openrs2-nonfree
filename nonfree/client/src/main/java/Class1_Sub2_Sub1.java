import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "Lclient!aj;")
	public final Class10_Sub1_Sub1 aClass10_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class1_Sub2_Sub1(@OriginalArg(0) Class10_Sub1_Sub1 arg0) {
		this.aClass10_Sub1_Sub1_1 = arg0;
	}
}

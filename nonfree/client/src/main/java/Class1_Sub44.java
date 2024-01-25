import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "Lclient!et;")
	public final Class11_Sub1_Sub3_Sub1 aClass11_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class1_Sub44(@OriginalArg(0) Class11_Sub1_Sub3_Sub1 arg0) {
		this.aClass11_Sub1_Sub3_Sub1_2 = arg0;
	}
}

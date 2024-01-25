import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!li", name = "B", descriptor = "Lclient!tr;")
	public final Class11_Sub1_Sub6 aClass11_Sub1_Sub6_1;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!tr;)V")
	public Class1_Sub3_Sub13(@OriginalArg(0) Class11_Sub1_Sub6 arg0) {
		this.aClass11_Sub1_Sub6_1 = arg0;
	}
}

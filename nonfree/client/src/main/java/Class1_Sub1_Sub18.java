import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "Lclient!ce;")
	public Class22_Sub2 aClass22_Sub2_1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class1_Sub1_Sub18(@OriginalArg(0) Class22_Sub2 arg0) {
		this.aClass22_Sub2_1 = arg0;
	}
}

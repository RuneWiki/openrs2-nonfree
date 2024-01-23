import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cf", name = "Y", descriptor = "Lclient!e;")
	public Class5_Sub4 aClass5_Sub4_1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class1_Sub2_Sub4(@OriginalArg(0) Class5_Sub4 arg0) {
		this.aClass5_Sub4_1 = arg0;
	}
}

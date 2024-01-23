import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!hf;")
	public Class14_Sub4 aClass14_Sub4_1;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!hf;)V")
	public Class1_Sub2_Sub8(@OriginalArg(0) Class14_Sub4 arg0) {
		this.aClass14_Sub4_1 = arg0;
	}
}

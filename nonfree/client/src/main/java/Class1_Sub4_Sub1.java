import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "Lclient!er;")
	public final Class11_Sub2_Sub2 aClass11_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) Class11_Sub2_Sub2 arg0) {
		this.aClass11_Sub2_Sub2_1 = arg0;
	}
}

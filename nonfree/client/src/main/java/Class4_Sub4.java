import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "Lclient!kfa;")
	public final Class1_Sub4_Sub2_Sub1_Sub1 aClass1_Sub4_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class4_Sub4(@OriginalArg(0) Class1_Sub4_Sub2_Sub1_Sub1 arg0) {
		this.aClass1_Sub4_Sub2_Sub1_Sub1_1 = arg0;
	}
}

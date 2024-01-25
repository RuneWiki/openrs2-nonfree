import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class2_Sub13_Sub10 extends Class2_Sub13 {

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "Lclient!jm;")
	public final Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!jm;)V")
	public Class2_Sub13_Sub10(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		this.aClass1_Sub1_Sub4_1 = arg0;
	}
}

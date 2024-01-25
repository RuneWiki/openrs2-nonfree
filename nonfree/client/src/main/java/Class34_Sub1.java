import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!pk;I)Lclient!pk;")
	@Override
	public Class1_Sub1_Sub16 method945(@OriginalArg(0) Class1_Sub1_Sub16 arg0) {
		return new Class1_Sub1_Sub16_Sub2(arg0.method7391(), arg0.anInt8985);
	}
}

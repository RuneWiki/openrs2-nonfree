import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!pk;Z)Lclient!pk;")
	@Override
	public Class1_Sub2_Sub4 method546(@OriginalArg(0) Class1_Sub2_Sub4 arg0) {
		return new Class1_Sub2_Sub4_Sub2(arg0.anInterface2_3, arg0.method7397(), arg0.anInt8463);
	}
}

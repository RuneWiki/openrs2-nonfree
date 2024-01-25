import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!cg;I)Lclient!cg;")
	@Override
	public Class1_Sub1_Sub4 method1954(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		return new Class1_Sub1_Sub4_Sub1(arg0.method1756(), arg0.anInt2155);
	}
}

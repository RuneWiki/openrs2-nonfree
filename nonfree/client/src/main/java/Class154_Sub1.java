import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class154_Sub1 extends Class154 {

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!be;Z)Lclient!be;")
	@Override
	public Class6_Sub1_Sub4 method3333(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		return new Class6_Sub1_Sub4_Sub2(arg0.method4027(), arg0.anInt4674);
	}
}

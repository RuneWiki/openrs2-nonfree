import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILclient!qd;)Lclient!qd;")
	@Override
	public Class3_Sub4_Sub6 method8532(@OriginalArg(1) Class3_Sub4_Sub6 arg0) {
		return new Class3_Sub4_Sub6_Sub1(arg0.anInterface26_3, arg0.method3849(), arg0.anInt4355);
	}
}

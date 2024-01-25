import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILclient!te;)Lclient!te;")
	@Override
	public Class6_Sub2_Sub10 method3200(@OriginalArg(1) Class6_Sub2_Sub10 arg0) {
		return new Class6_Sub2_Sub10_Sub1(arg0.anInterface26_3, arg0.method6996(), arg0.anInt8104);
	}
}

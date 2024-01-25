import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!aea;I)Lclient!aea;")
	@Override
	public Class6_Sub2_Sub1 method899(@OriginalArg(0) Class6_Sub2_Sub1 arg0) {
		return new Class6_Sub2_Sub1_Sub1(arg0.method3516(), arg0.anInt4017);
	}
}

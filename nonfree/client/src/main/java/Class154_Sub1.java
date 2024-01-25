import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class154_Sub1 extends Class154 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!or;I)Lclient!or;")
	@Override
	public Class6_Sub2_Sub1 method3574(@OriginalArg(0) Class6_Sub2_Sub1 arg0) {
		return new Class6_Sub2_Sub1_Sub2(arg0.method302(), arg0.anInt348);
	}
}

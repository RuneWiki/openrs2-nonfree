import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class203_Sub1 extends Class203 {

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!od;I)Lclient!od;")
	@Override
	public Class11_Sub4_Sub13 method5428(@OriginalArg(0) Class11_Sub4_Sub13 arg0) {
		return new Class11_Sub4_Sub13_Sub1(arg0.method5302());
	}
}

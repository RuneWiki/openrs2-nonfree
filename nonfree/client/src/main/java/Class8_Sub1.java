import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ek;I)Lclient!ek;")
	@Override
	public Class1_Sub4_Sub8 method913(@OriginalArg(0) Class1_Sub4_Sub8 arg0) {
		return new Class1_Sub4_Sub8_Sub1(arg0.anInterface10_3, arg0.method3009(), arg0.anInt3289);
	}
}

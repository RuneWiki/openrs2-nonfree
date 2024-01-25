import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class213_Sub1 extends Class213 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!vc;Z)Lclient!vc;")
	@Override
	public Class5_Sub2_Sub1 method5100(@OriginalArg(0) Class5_Sub2_Sub1 arg0) {
		return new Class5_Sub2_Sub1_Sub1(arg0.anInterface20_3, arg0.method7595(), arg0.anInt9021);
	}
}

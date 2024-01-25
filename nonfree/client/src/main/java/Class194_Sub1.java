import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class194_Sub1 extends Class194 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ae;I)Lclient!ae;")
	@Override
	public Class1_Sub1_Sub2 method5114(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		return new Class1_Sub1_Sub2_Sub2(arg0.anInterface9_3, arg0.method5252(), arg0.anInt6704);
	}
}

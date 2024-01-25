import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class200_Sub1 extends Class200 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!jm;B)Lclient!jm;")
	@Override
	public Class3_Sub7_Sub3 method4839(@OriginalArg(0) Class3_Sub7_Sub3 arg0) {
		return new Class3_Sub7_Sub3_Sub2(arg0.anInterface11_3, arg0.method3205(), arg0.anInt3654);
	}
}

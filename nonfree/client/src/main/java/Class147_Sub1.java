import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class147_Sub1 extends Class147 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!hu;I)Lclient!hu;")
	@Override
	public Class2_Sub10_Sub4 method3726(@OriginalArg(0) Class2_Sub10_Sub4 arg0) {
		return new Class2_Sub10_Sub4_Sub2(arg0.anInterface10_3, arg0.method3219(), arg0.anInt3516);
	}
}

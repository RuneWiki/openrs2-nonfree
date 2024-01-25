import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class122_Sub1 extends Class122 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!tca;I)Lclient!tca;")
	@Override
	public Class4_Sub5_Sub5 method3102(@OriginalArg(0) Class4_Sub5_Sub5 arg0) {
		return new Class4_Sub5_Sub5_Sub2(arg0.method3029(), arg0.anInt3411);
	}
}

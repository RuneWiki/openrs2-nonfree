import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class208_Sub1 extends Class208 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BLclient!eg;)Lclient!eg;")
	@Override
	public Class5_Sub5_Sub2 method6296(@OriginalArg(1) Class5_Sub5_Sub2 arg0) {
		return new Class5_Sub5_Sub2_Sub1(arg0.method4145(), arg0.anInt4570);
	}
}

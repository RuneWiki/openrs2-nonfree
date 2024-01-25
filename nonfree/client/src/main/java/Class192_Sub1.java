import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class192_Sub1 extends Class192 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ida;I)Lclient!ida;")
	@Override
	public Class5_Sub2_Sub3 method6013(@OriginalArg(0) Class5_Sub2_Sub3 arg0) {
		return new Class5_Sub2_Sub3_Sub1(arg0.anInterface18_3, arg0.method4277(), arg0.anInt5075);
	}
}

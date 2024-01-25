import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public final class Class178_Sub1 extends Class178 {

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lclient!of;I)Lclient!of;")
	@Override
	public Class2_Sub5_Sub3 method6454(@OriginalArg(0) Class2_Sub5_Sub3 arg0) {
		return new Class2_Sub5_Sub3_Sub2(arg0.method5418(), arg0.anInt6428);
	}
}

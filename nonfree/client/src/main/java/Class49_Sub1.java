import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!lia;I)Lclient!lia;")
	@Override
	public Class5_Sub5_Sub3 method1053(@OriginalArg(0) Class5_Sub5_Sub3 arg0) {
		return new Class5_Sub5_Sub3_Sub1(arg0.anInterface5_3, arg0.method6059(), arg0.anInt6780);
	}
}

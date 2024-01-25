import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class330_Sub1 extends Class330 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!sp;)Lclient!sp;")
	@Override
	public Class2_Sub3_Sub9 method7649(@OriginalArg(1) Class2_Sub3_Sub9 arg0) {
		return new Class2_Sub3_Sub9_Sub2(arg0.method4641(), arg0.anInt5541);
	}
}

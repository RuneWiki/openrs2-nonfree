import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!uk;B)Lclient!uk;")
	@Override
	public Class3_Sub3_Sub1 method4808(@OriginalArg(0) Class3_Sub3_Sub1 arg0) {
		return new Class3_Sub3_Sub1_Sub2(arg0.method3880(), arg0.anInt4381);
	}
}

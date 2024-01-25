import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!jo;Z)Lclient!jo;")
	@Override
	public Class3_Sub3_Sub9 method4614(@OriginalArg(0) Class3_Sub3_Sub9 arg0) {
		return new Class3_Sub3_Sub9_Sub1(arg0.method3515(), arg0.anInt4306);
	}
}

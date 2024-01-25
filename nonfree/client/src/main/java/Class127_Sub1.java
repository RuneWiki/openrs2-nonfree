import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!oe;Z)Lclient!oe;")
	@Override
	public Class3_Sub10_Sub12 method3560(@OriginalArg(0) Class3_Sub10_Sub12 arg0) {
		return new Class3_Sub10_Sub12_Sub2(arg0.method5671(), arg0.anInt6769);
	}
}

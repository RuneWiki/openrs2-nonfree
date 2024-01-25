import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!pc;)Lclient!pc;")
	@Override
	public Class3_Sub7_Sub15 method1201(@OriginalArg(1) Class3_Sub7_Sub15 arg0) {
		return new Class3_Sub7_Sub15_Sub2(arg0.method6730(), arg0.anInt7718);
	}
}

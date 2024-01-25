import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class107_Sub1 extends Class107 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!en;B)Lclient!en;")
	@Override
	public Class3_Sub10_Sub4 method3118(@OriginalArg(0) Class3_Sub10_Sub4 arg0) {
		return new Class3_Sub10_Sub4_Sub2(arg0.anInterface18_3, arg0.method6668(), arg0.anInt8061);
	}
}

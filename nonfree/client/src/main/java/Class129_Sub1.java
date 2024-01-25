import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!as;B)Lclient!as;")
	@Override
	public Class2_Sub3_Sub1 method3096(@OriginalArg(0) Class2_Sub3_Sub1 arg0) {
		return new Class2_Sub3_Sub1_Sub2(arg0.anInterface8_3, arg0.method6757(), arg0.anInt8160);
	}
}

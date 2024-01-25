import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!fj;I)Lclient!fj;")
	@Override
	public Class1_Sub3_Sub1 method5469(@OriginalArg(0) Class1_Sub3_Sub1 arg0) {
		return new Class1_Sub3_Sub1_Sub2(arg0.anInterface12_3, arg0.method4229(), arg0.anInt5419);
	}
}

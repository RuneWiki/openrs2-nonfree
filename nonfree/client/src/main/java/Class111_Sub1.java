import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!qq;)Lclient!qq;")
	@Override
	public Class3_Sub3_Sub1 method3707(@OriginalArg(1) Class3_Sub3_Sub1 arg0) {
		return new Class3_Sub3_Sub1_Sub2(arg0.anInterface11_3, arg0.method4560(), arg0.anInt5653);
	}
}

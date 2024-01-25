import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!aa;)Lclient!aa;")
	@Override
	public Class1_Sub1_Sub1 method3555(@OriginalArg(1) Class1_Sub1_Sub1 arg0) {
		return new Class1_Sub1_Sub1_Sub2(arg0.anInterface6_3, arg0.method4835(), arg0.anInt5669);
	}
}

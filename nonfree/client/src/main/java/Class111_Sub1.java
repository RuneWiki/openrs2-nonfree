import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!la;I)Lclient!la;")
	@Override
	public Class1_Sub1_Sub10 method4151(@OriginalArg(0) Class1_Sub1_Sub10 arg0) {
		return new Class1_Sub1_Sub10_Sub1(arg0.anInterface1_3, arg0.method5108());
	}
}

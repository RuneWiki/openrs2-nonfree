import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!jj;)Lclient!jj;")
	@Override
	public Class1_Sub4_Sub13 method4091(@OriginalArg(1) Class1_Sub4_Sub13 arg0) {
		return new Class1_Sub4_Sub13_Sub2(arg0.anInterface7_3, arg0.method5357());
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!aa;I)Lclient!aa;")
	@Override
	public Class1_Sub1_Sub1 method724(@OriginalArg(0) Class1_Sub1_Sub1 arg0) {
		return new Class1_Sub1_Sub1_Sub1(arg0.anInterface9_3, arg0.method4832(), arg0.anInt5589);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class241_Sub1 extends Class241 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZLclient!nu;)Lclient!nu;")
	@Override
	public Class12_Sub4_Sub4 method7935(@OriginalArg(1) Class12_Sub4_Sub4 arg0) {
		return new Class12_Sub4_Sub4_Sub2(arg0.anInterface5_3, arg0.method2653(), arg0.anInt2903);
	}
}

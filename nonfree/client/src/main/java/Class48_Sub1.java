import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class48_Sub1 extends Class48 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!wv;)Lclient!wv;")
	@Override
	public Class1_Sub2_Sub9 method1150(@OriginalArg(1) Class1_Sub2_Sub9 arg0) {
		return new Class1_Sub2_Sub9_Sub2(arg0.anInterface2_3, arg0.method4434(), arg0.anInt5539);
	}
}

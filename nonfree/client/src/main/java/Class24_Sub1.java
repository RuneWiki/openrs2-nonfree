import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!mf;I)Lclient!mf;")
	@Override
	public Class11_Sub4_Sub11 method1627(@OriginalArg(0) Class11_Sub4_Sub11 arg0) {
		return new Class11_Sub4_Sub11_Sub2(arg0.anInterface8_3, arg0.method5352());
	}
}

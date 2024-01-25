import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!fk;I)Lclient!fk;")
	@Override
	public Class7_Sub1_Sub9 method1511(@OriginalArg(0) Class7_Sub1_Sub9 arg0) {
		return new Class7_Sub1_Sub9_Sub1(arg0.anInterface5_3, arg0.method4768());
	}
}

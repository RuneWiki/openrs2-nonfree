import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!bia;I)Lclient!bia;")
	@Override
	public Class2_Sub2_Sub5 method2512(@OriginalArg(0) Class2_Sub2_Sub5 arg0) {
		return new Class2_Sub2_Sub5_Sub2(arg0.method4971(), arg0.anInt5796);
	}
}

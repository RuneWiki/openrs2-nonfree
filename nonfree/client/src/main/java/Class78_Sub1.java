import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!jq;B)Lclient!jq;")
	@Override
	public Class1_Sub6_Sub4 method5016(@OriginalArg(0) Class1_Sub6_Sub4 arg0) {
		return new Class1_Sub6_Sub4_Sub1(arg0.anInterface17_3, arg0.method5584(), arg0.anInt7023);
	}
}

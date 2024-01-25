import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!jt;B)Lclient!jt;")
	@Override
	public Class3_Sub5_Sub10 method5491(@OriginalArg(0) Class3_Sub5_Sub10 arg0) {
		return new Class3_Sub5_Sub10_Sub1(arg0.method4379(), arg0.anInt5090);
	}
}

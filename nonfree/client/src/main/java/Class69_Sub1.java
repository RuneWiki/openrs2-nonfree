import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!ns;I)Lclient!ns;")
	@Override
	public Class1_Sub1_Sub12 method5020(@OriginalArg(0) Class1_Sub1_Sub12 arg0) {
		return new Class1_Sub1_Sub12_Sub2(arg0.method4222(), arg0.anInt5473);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!mn;)Lclient!mn;")
	@Override
	public Class1_Sub6_Sub2 method3212(@OriginalArg(1) Class1_Sub6_Sub2 arg0) {
		return new Class1_Sub6_Sub2_Sub1(arg0.anInterface11_3, arg0.method3188(), arg0.anInt3855);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class136_Sub1 extends Class136 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!bg;)Lclient!bg;")
	@Override
	public Class1_Sub2_Sub3 method3961(@OriginalArg(1) Class1_Sub2_Sub3 arg0) {
		return new Class1_Sub2_Sub3_Sub1(arg0.method4492());
	}
}

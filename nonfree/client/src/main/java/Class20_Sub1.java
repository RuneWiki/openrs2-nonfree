import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!vg;)Lclient!vg;")
	@Override
	public Class1_Sub2_Sub3 method568(@OriginalArg(1) Class1_Sub2_Sub3 arg0) {
		return new Class1_Sub2_Sub3_Sub2(arg0.method2525(), arg0.anInt2924);
	}
}

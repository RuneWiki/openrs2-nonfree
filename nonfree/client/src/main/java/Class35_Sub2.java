import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!gq;")
	public final Class20_Sub1_Sub1 aClass20_Sub1_Sub1_5;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!pg;II[B)V")
	public Class35_Sub2(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass20_Sub1_Sub1_5 = Static348.method4629(arg1, arg0, arg2, arg3);
		this.aClass20_Sub1_Sub1_5.method2040(false, false);
	}
}

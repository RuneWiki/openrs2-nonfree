import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!bba", name = "i", descriptor = "Lclient!rp;")
	public final Class20_Sub3_Sub1 aClass20_Sub3_Sub1_1;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!te;II[B)V")
	public Class23_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass20_Sub3_Sub1_1 = Static80.method2002(arg0, arg1, arg3, arg2);
		this.aClass20_Sub3_Sub1_1.method6253(false, false);
	}
}

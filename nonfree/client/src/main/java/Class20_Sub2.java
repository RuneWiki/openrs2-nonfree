import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Lclient!ar;")
	public final Class23_Sub1_Sub1 aClass23_Sub1_Sub1_3;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!qj;II[B)V")
	public Class20_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass23_Sub1_Sub1_3 = Static407.method5923(arg2, arg0, arg3, arg1);
		this.aClass23_Sub1_Sub1_3.method377(false, false);
	}
}

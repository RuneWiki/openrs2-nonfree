import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class165_Sub2 extends Class165 {

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Lclient!wc;")
	public final Class20_Sub4_Sub1 aClass20_Sub4_Sub1_5;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!fu;II[B)V")
	public Class165_Sub2(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass20_Sub4_Sub1_5 = Static406.method5514(arg3, arg2, arg1, arg0);
		this.aClass20_Sub4_Sub1_5.method5511(false, false);
	}
}

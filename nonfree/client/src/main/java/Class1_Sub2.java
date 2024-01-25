import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!wfa;")
	public final Interface27 anInterface27_4;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!wga;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface27_4 = arg0.method1578(arg3, arg1, Static155.aClass375_18, false, arg2);
		this.anInterface27_4.method8300(false, false);
	}

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!wga;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface27_4 = arg0.method1473(arg2, arg1, false, arg3);
		this.anInterface27_4.method8300(false, false);
	}
}

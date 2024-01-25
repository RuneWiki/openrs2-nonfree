import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Lclient!ls;")
	public final Interface14 anInterface14_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!en;II[B)V")
	public Class20_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface14_1 = arg0.method4869(arg3, arg1, arg2, Static104.aClass88_3, false);
		this.anInterface14_1.method7067(false, false);
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!en;II[I)V")
	public Class20_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface14_1 = arg0.method4838(arg1, false, arg2, arg3);
		this.anInterface14_1.method7067(false, false);
	}
}

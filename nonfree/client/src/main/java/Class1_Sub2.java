import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "Lclient!w;")
	public final Interface27 anInterface27_3;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!gd;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface27_3 = arg0.method4422(arg2, arg3, arg1, Static67.aClass339_4, false);
		this.anInterface27_3.method5618(false, false);
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!gd;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface27_3 = arg0.method4371(arg1, arg3, arg2, false);
		this.anInterface27_3.method5618(false, false);
	}
}

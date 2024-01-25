import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!ica;")
	public final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!tu;II[B)V")
	public Class10_Sub2(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface9_3 = arg0.method6374(Static212.aClass167_7, arg3, arg2, arg1, false);
		this.anInterface9_3.method3270(false, false);
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!tu;II[I)V")
	public Class10_Sub2(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface9_3 = arg0.method6373(arg3, false, arg1, arg2);
		this.anInterface9_3.method3270(false, false);
	}
}

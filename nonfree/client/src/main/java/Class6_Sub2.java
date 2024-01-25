import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "Lclient!co;")
	public final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!ifa;II[B)V")
	public Class6_Sub2(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface6_3 = arg0.method4337(arg1, false, arg3, arg2, Static362.aClass97_41);
		this.anInterface6_3.method8281(false, false);
	}

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!ifa;II[I)V")
	public Class6_Sub2(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface6_3 = arg0.method4250(arg2, false, arg3, arg1);
		this.anInterface6_3.method8281(false, false);
	}
}

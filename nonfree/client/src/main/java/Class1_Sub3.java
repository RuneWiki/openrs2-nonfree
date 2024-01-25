import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!oia;")
	public final Interface19 anInterface19_6;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!pga;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface19_6 = arg0.method7031(false, arg2, arg1, arg3, Static588.aClass188_15);
		this.anInterface19_6.method3138(false, false);
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!pga;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface19_6 = arg0.method7116(false, arg1, arg2, arg3);
		this.anInterface19_6.method3138(false, false);
	}
}

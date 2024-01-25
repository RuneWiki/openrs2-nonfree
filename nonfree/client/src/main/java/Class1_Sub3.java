import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "Lclient!tr;")
	public final Interface25 anInterface25_3;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!rv;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface25_3 = arg0.method5492(arg3, arg1, Static225.aClass281_13, arg2, false);
		this.anInterface25_3.method7630(false, false);
	}

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!rv;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface25_3 = arg0.method5553(arg1, arg3, false, arg2);
		this.anInterface25_3.method7630(false, false);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "Lclient!dg;")
	public final Interface6 anInterface6_5;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!rl;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface6_5 = arg0.method4934(Static491.aClass168_11, arg1, false, arg3, arg2);
		this.anInterface6_5.method8506(false, false);
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!rl;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface6_5 = arg0.method5022(arg3, arg2, false, arg1);
		this.anInterface6_5.method8506(false, false);
	}
}

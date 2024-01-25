import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Lclient!up;")
	public final Class15_Sub2_Sub1 aClass15_Sub2_Sub1_5;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!nm;II[B)V")
	public Class34_Sub2(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass15_Sub2_Sub1_5 = Static406.method5044(arg3, arg1, arg0, arg2);
		this.aClass15_Sub2_Sub1_5.method5042(false, false);
	}
}

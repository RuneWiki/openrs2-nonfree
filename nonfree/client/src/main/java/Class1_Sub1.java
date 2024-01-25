import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "Lclient!fu;")
	public final Class10_Sub2_Sub1 aClass10_Sub2_Sub1_1;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!lf;II[B)V")
	public Class1_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass10_Sub2_Sub1_1 = Static259.method3886(arg1, arg3, arg2, arg0);
		this.aClass10_Sub2_Sub1_1.method2859(false, false);
	}
}

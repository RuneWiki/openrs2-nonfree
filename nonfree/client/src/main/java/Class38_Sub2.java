import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "Lclient!rh;")
	public final Class30_Sub3_Sub1 aClass30_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!mi;II[B)V")
	public Class38_Sub2(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass30_Sub3_Sub1_1 = Static406.method4618(arg2, arg1, arg3, arg0);
		this.aClass30_Sub3_Sub1_1.method4613(false, false);
	}
}

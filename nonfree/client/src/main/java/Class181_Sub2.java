import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public final class Class181_Sub2 extends Class181 {

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lclient!nea;")
	public final Class46_Sub2_Sub1 aClass46_Sub2_Sub1_5;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!lj;II[B)V")
	public Class181_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass46_Sub2_Sub1_5 = Static330.method4876(arg1, arg3, arg0, arg2);
		this.aClass46_Sub2_Sub1_5.method5150(false, false);
	}
}

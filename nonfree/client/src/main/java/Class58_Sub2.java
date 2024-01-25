import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Lclient!mk;")
	public final Class112_Sub2_Sub1 aClass112_Sub2_Sub1_4;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!vj;II[B)V")
	public Class58_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass112_Sub2_Sub1_4 = Static19.method385(arg0, arg3, arg2, arg1);
		this.aClass112_Sub2_Sub1_4.method3727(false, false);
	}
}

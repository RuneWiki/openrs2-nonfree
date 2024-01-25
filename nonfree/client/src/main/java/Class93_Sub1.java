import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!na", name = "f", descriptor = "Lclient!ch;")
	public final Class11_Sub2_Sub1 aClass11_Sub2_Sub1_2;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!ji;II[B)V")
	public Class93_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass11_Sub2_Sub1_2 = Static273.method4777(arg0, arg3, arg1, arg2);
		this.aClass11_Sub2_Sub1_2.method1633(false, false);
	}
}

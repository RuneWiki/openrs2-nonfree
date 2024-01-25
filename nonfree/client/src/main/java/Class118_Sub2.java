import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class118_Sub2 extends Class118 {

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!rk;")
	public final Class52_Sub1_Sub1 aClass52_Sub1_Sub1_5;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!ig;II[B)V")
	public Class118_Sub2(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass52_Sub1_Sub1_5 = Static367.method4737(arg0, arg3, arg1, arg2);
		this.aClass52_Sub1_Sub1_5.method4734(false, false);
	}
}

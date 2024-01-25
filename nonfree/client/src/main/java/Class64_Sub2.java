import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class64_Sub2 extends Class64 {

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Lclient!mc;")
	public final Class92_Sub4_Sub1 aClass92_Sub4_Sub1_2;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!hd;II[B)V")
	public Class64_Sub2(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass92_Sub4_Sub1_2 = Static363.method3534(arg0, arg2, arg1, arg3);
		this.aClass92_Sub4_Sub1_2.method3530(false, false);
	}
}

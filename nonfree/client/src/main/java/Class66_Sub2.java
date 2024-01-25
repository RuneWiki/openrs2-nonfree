import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class66_Sub2 extends Class66 {

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!kf;")
	public final Class56_Sub4_Sub1 aClass56_Sub4_Sub1_5;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!tb;II[B)V")
	public Class66_Sub2(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass56_Sub4_Sub1_5 = Static366.method2556(arg0, arg1, arg3, arg2);
		this.aClass56_Sub4_Sub1_5.method2553(false, false);
	}
}

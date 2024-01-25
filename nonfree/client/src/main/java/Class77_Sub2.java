import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "Lclient!rn;")
	public final Class124_Sub2_Sub1 aClass124_Sub2_Sub1_5;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!ao;II[B)V")
	public Class77_Sub2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass124_Sub2_Sub1_5 = Static370.method4996(arg1, arg0, arg3, arg2);
		this.aClass124_Sub2_Sub1_5.method4995(false, false);
	}
}
